
<%@page import="com.liferay.portlet.asset.model.AssetEntry"%>
<%@page import="com.liferay.portal.kernel.util.Base64"%>
<%@page import="com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil"%>
<%@page import="com.nyu.util.Constant"%>
<%@page import="com.nyu.model.NYUUserGroup"%>

<%@ include file="/WEB-INF/jsp/init.jsp" %>

<%
	NYUUserGroup _nyuUserGroup = (NYUUserGroup)request.getAttribute(Constant.COMMON_STRING_CONSTANT_USER_GROUPS);
	UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(_nyuUserGroup.getUserGroupId());
	LayoutSet layoutSet = LayoutSetLocalServiceUtil.getLayoutSet(userGroup.getGroupId(), Boolean.TRUE);
	DynamicQuery assetEntryQuery = DynamicQueryFactoryUtil.forClass(AssetEntry.class);
	assetEntryQuery.add(PropertyFactoryUtil.forName("classPK").eq(userGroup.getUserGroupId()));
	List<AssetEntry> assetEntryList = null;
	List<AssetCategory> userGroupCategories = null;
	List<AssetTag> userGroupTags = null;
	try{
		assetEntryList = AssetEntryLocalServiceUtil.dynamicQuery(assetEntryQuery);
		userGroupCategories = assetEntryList.get(0).getCategories();
		userGroupTags = assetEntryList.get(0).getTags();
	}catch(Exception e){
		e.printStackTrace();
	}
%>

<li class="media" >
	<div class="pull-left">
		<% if(Validator.isNotNull(layoutSet.getLogoId()) && layoutSet.getLogoId() != 0){ %>
			<img src='<%=PortletProps.get("image.layout.set.logo.img.id")+layoutSet.getLogoId()%>' />
		<% }else{ %>
			<img src='/ny-you-theme/images/whitelabel/group_placeholder.png' />
		<% } %>
	</div>
	<div class="media-body">
		<p><strong>Description:</strong> <%=_nyuUserGroup.getAbout() %></p>
		<p><strong>Categories:</strong> 
			<%
				int count = 0;
				for(AssetCategory category : userGroupCategories){
					count++;
			%>
					<%= category.getName() %>
			<%		
					if(count < userGroupCategories.size()){
			%>
					<%=", " %>
			<%
					}
				} 
			%> 
		</p>
		<p><strong>Tags:</strong> 
			<%
				count = 0;
				for(AssetTag tag : userGroupTags){
					count++;
			%>
					<%= tag.getName() %>
			<%		
					if(count < userGroupTags.size()){
			%>
					<%=", " %>
			<%
					}
				} 
			%> 
		</p>
	</div>
</li>

