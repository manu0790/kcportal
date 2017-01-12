<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ include file="/html/portlet/search/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Document document = (Document)row.getObject();

String className = document.get(Field.ENTRY_CLASS_NAME);
String UserName = document.get(Field.USER_NAME);
String entryTitle = null;
String entrySummary = null;
String downloadURL = null;
String returnToFullPageURL = (String)request.getAttribute("search.jsp-returnToFullPageURL");
PortletURL viewFullContentURL = null;
String viewURL = null;

AssetRendererFactory assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(className);

AssetRenderer assetRenderer = null;

boolean inheritRedirect = false;

if (assetRendererFactory != null) {
	long classPK = GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK));

	long resourcePrimKey = GetterUtil.getLong(document.get(Field.ROOT_ENTRY_CLASS_PK));

	if (resourcePrimKey > 0) {
		classPK = resourcePrimKey;
	}

	AssetEntry assetEntry = AssetEntryLocalServiceUtil.getEntry(className, classPK);

	assetRenderer = assetRendererFactory.getAssetRenderer(classPK);

	downloadURL = assetRenderer.getURLDownload(themeDisplay);

	viewFullContentURL = _getViewFullContentURL(request, themeDisplay, PortletKeys.ASSET_PUBLISHER, document);

	viewFullContentURL.setParameter("struts_action", "/asset_publisher/view_content");

	if (Validator.isNotNull(returnToFullPageURL)) {
		viewFullContentURL.setParameter("returnToFullPageURL", returnToFullPageURL);
	}

	viewFullContentURL.setParameter("assetEntryId", String.valueOf(assetEntry.getEntryId()));
	viewFullContentURL.setParameter("type", assetRendererFactory.getType());

	if (Validator.isNotNull(assetRenderer.getUrlTitle())) {
		if ((assetRenderer.getGroupId() > 0) && (assetRenderer.getGroupId() != scopeGroupId)) {
			viewFullContentURL.setParameter("groupId", String.valueOf(assetRenderer.getGroupId()));
		}

		viewFullContentURL.setParameter("urlTitle", assetRenderer.getUrlTitle());
	}

	if (viewInContext) {
		inheritRedirect = true;

		String viewFullContentURLString = viewFullContentURL.toString();

		viewFullContentURLString = HttpUtil.setParameter(viewFullContentURLString, "redirect", currentURL);

		viewURL = assetRenderer.getURLViewInContext(liferayPortletRequest, liferayPortletResponse, viewFullContentURLString);
	}
	else {
		viewURL = viewFullContentURL.toString();
	}
}
else {
	String portletId = document.get(Field.PORTLET_ID);

	viewFullContentURL = _getViewFullContentURL(request, themeDisplay, portletId, document);

	if (Validator.isNotNull(returnToFullPageURL)) {
		viewFullContentURL.setParameter("returnToFullPageURL", returnToFullPageURL);
	}

	viewURL = viewFullContentURL.toString();
}

Indexer indexer = IndexerRegistryUtil.getIndexer(className);

if (indexer != null) {
	String snippet = document.get(Field.SNIPPET);

	Summary summary = indexer.getSummary(document, locale, snippet, viewFullContentURL);

	entryTitle = summary.getTitle();
	entrySummary = summary.getContent();
}
else if (assetRenderer != null) {
	entryTitle = assetRenderer.getTitle(locale);
	entrySummary = assetRenderer.getSearchSummary(locale);
}

if ((assetRendererFactory == null) && viewInContext) {
	viewURL = viewFullContentURL.toString();
}

viewURL = _checkViewURL(themeDisplay, viewURL, currentURL, inheritRedirect);

String[] queryTerms = (String[])request.getAttribute("search.jsp-queryTerms");

PortletURL portletURL = (PortletURL)request.getAttribute("search.jsp-portletURL");

%>

<span class="asset-entry">
	<span class="asset-entry-type">
		<b><%= ResourceActionsUtil.getModelResource(themeDisplay.getLocale(), className) %></b>
	</span>
 
	<span class="asset-entry-title">
		<%if(className.toLowerCase().endsWith("user")){
			viewURL = PortalUtil.getGroupFriendlyURL(themeDisplay.getScopeGroup(),themeDisplay.getLayout().isPrivateLayout(),themeDisplay);
			viewURL = viewURL+"/contributor/-/user/"+GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK));
		}else if(className.toLowerCase().endsWith("usergroup")){
			viewURL = PortalUtil.getGroupFriendlyURL(themeDisplay.getScopeGroup(),themeDisplay.getLayout().isPrivateLayout(),themeDisplay);
			viewURL = viewURL+"/groups/-/group/"+GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK))+"/info";
		}
		%>
		<a href="<%= viewURL %>">
			<c:if test="<%= assetRenderer != null %>">
				<img alt="" src="<%= assetRenderer.getIconPath(renderRequest) %>" />
			</c:if>

			<%= StringUtil.highlight(HtmlUtil.escape(entryTitle), queryTerms) %>
		</a>
		
		<c:if test="<%= Validator.isNotNull(downloadURL) %>">
			<liferay-ui:icon image="../arrows/01_down" label="<%= false %>" message='<%= LanguageUtil.format(pageContext, "download-x", HtmlUtil.escape(entryTitle)) %>' url="<%= downloadURL %>" />
		</c:if>
	</span>
	<%
	String[] assetCategoryIds = document.getValues(Field.ASSET_CATEGORY_IDS);
	String[] assetTagNames = document.getValues(Field.ASSET_TAG_NAMES);
	%>

	<c:if test="<%= Validator.isNotNull(entrySummary) || Validator.isNotNull(assetCategoryIds[0]) || Validator.isNotNull(assetTagNames[0]) %>">
		<div class="asset-entry-content clearfix">
			<c:if test="<%= Validator.isNotNull(entrySummary) %>">
				<span class="asset-entry-summary">
					<%= StringUtil.highlight(HtmlUtil.escape(entrySummary), queryTerms) %>
				</span>
			</c:if>

			<c:if test="<%= Validator.isNotNull(assetTagNames[0]) %>">
				<div class="asset-entry-tags">

					<%
					for (int i = 0; i < assetTagNames.length; i++) {
						String assetTagName = assetTagNames[i].trim();

						PortletURL tagURL = PortletURLUtil.clone(portletURL, renderResponse);

						tagURL.setParameter(Field.ASSET_TAG_NAMES, assetTagName);
					%>

						<c:if test="<%= i == 0 %>">
							<div class="taglib-asset-tags-summary">
						</c:if>

						<a class="tag" href="<%= tagURL.toString() %>"><%= assetTagName %></a>

						<c:if test="<%= (i + 1) == assetTagNames.length %>">
							</div>
						</c:if>

					<%
					}
					%>

				</div>
			</c:if>

			<c:if test="<%= Validator.isNotNull(assetCategoryIds[0]) %>">
				<div class="asset-entry-categories">

					<%
					for (int i = 0; i < assetCategoryIds.length; i++) {
						long assetCategoryId = GetterUtil.getLong(assetCategoryIds[i]);

						AssetCategory assetCategory = null;

						try {
							assetCategory = AssetCategoryLocalServiceUtil.getCategory(assetCategoryId);
						}
						catch (NoSuchCategoryException nsce) {
						}

						if (assetCategory == null) {
							continue;
						}

						AssetVocabulary assetVocabulary = AssetVocabularyLocalServiceUtil.getVocabulary(assetCategory.getVocabularyId());

						PortletURL categoryURL = PortletURLUtil.clone(portletURL, renderResponse);

						categoryURL.setParameter(Field.ASSET_CATEGORY_TITLES, assetCategory.getTitle(LocaleUtil.getDefault()));
					%>

						<c:if test="<%= i == 0 %>">
							<div class="taglib-asset-categories-summary">
								<span class="asset-vocabulary">
									<%= HtmlUtil.escape(assetVocabulary.getTitle(locale)) %>:
								</span>
						</c:if>

						<a class="asset-category" href="<%= categoryURL.toString() %>">
							<%= _buildAssetCategoryPath(assetCategory, locale) %>
						</a>

						<c:if test="<%= (i + 1) == assetCategoryIds.length %>">
							</div>
						</c:if>

					<%
					}
					%>

				</div>
			</c:if>
		</div>
	</c:if>
	<c:if test="<%= Validator.isNotNull(UserName) && !className.toLowerCase().endsWith(\"user\")%>">
		<div class="clearfix">
			<c:choose>
			    <c:when test="<%=className.toLowerCase().endsWith(\"usergroup\")%>">
			       <strong> Administrator: </strong>
			    </c:when>
			    <c:when test="<%=className.toLowerCase().endsWith(\"requestlesson\")%>">
			       <strong> Requestor: </strong>
			    </c:when>
			   	<c:when test="<%=className.toLowerCase().endsWith(\".lesson\")%>">
			       <strong> Contributor: </strong>
			    </c:when>
			</c:choose>
		    <%= StringUtil.highlight(HtmlUtil.escape(UserName.trim()), queryTerms) %>
		</div>
	</c:if>
	<c:if test="<%=className.toLowerCase().endsWith(\".lesson\")%>">
		<div class="clearfix">
		   <strong> Groups: </strong>
		   <%=GetterUtil.getString(document.get(Field.CONTENT)) %>
		</div>
	</c:if>
</span>