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

package com.nyu.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the DocumentFile service. Represents a row in the &quot;nyyou_DocumentFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.DocumentFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.DocumentFileImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFile
 * @see com.nyu.model.impl.DocumentFileImpl
 * @see com.nyu.model.impl.DocumentFileModelImpl
 * @generated
 */
public interface DocumentFileModel extends BaseModel<DocumentFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a document file model instance should use the {@link DocumentFile} interface instead.
	 */

	/**
	 * Returns the primary key of this document file.
	 *
	 * @return the primary key of this document file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this document file.
	 *
	 * @param primaryKey the primary key of this document file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the document ID of this document file.
	 *
	 * @return the document ID of this document file
	 */
	public long getDocumentId();

	/**
	 * Sets the document ID of this document file.
	 *
	 * @param documentId the document ID of this document file
	 */
	public void setDocumentId(long documentId);

	/**
	 * Returns the company ID of this document file.
	 *
	 * @return the company ID of this document file
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this document file.
	 *
	 * @param companyId the company ID of this document file
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this document file.
	 *
	 * @return the group ID of this document file
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this document file.
	 *
	 * @param groupId the group ID of this document file
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the lesson ID of this document file.
	 *
	 * @return the lesson ID of this document file
	 */
	public long getLessonId();

	/**
	 * Sets the lesson ID of this document file.
	 *
	 * @param lessonId the lesson ID of this document file
	 */
	public void setLessonId(long lessonId);

	/**
	 * Returns the section ID of this document file.
	 *
	 * @return the section ID of this document file
	 */
	public long getSectionId();

	/**
	 * Sets the section ID of this document file.
	 *
	 * @param sectionId the section ID of this document file
	 */
	public void setSectionId(long sectionId);

	/**
	 * Returns the document name of this document file.
	 *
	 * @return the document name of this document file
	 */
	public String getDocumentName();

	/**
	 * Returns the localized document name of this document file in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized document name of this document file
	 */
	@AutoEscape
	public String getDocumentName(Locale locale);

	/**
	 * Returns the localized document name of this document file in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized document name of this document file. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDocumentName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized document name of this document file in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized document name of this document file
	 */
	@AutoEscape
	public String getDocumentName(String languageId);

	/**
	 * Returns the localized document name of this document file in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized document name of this document file
	 */
	@AutoEscape
	public String getDocumentName(String languageId, boolean useDefault);

	@AutoEscape
	public String getDocumentNameCurrentLanguageId();

	@AutoEscape
	public String getDocumentNameCurrentValue();

	/**
	 * Returns a map of the locales and localized document names of this document file.
	 *
	 * @return the locales and localized document names of this document file
	 */
	public Map<Locale, String> getDocumentNameMap();

	/**
	 * Sets the document name of this document file.
	 *
	 * @param documentName the document name of this document file
	 */
	public void setDocumentName(String documentName);

	/**
	 * Sets the localized document name of this document file in the language.
	 *
	 * @param documentName the localized document name of this document file
	 * @param locale the locale of the language
	 */
	public void setDocumentName(String documentName, Locale locale);

	/**
	 * Sets the localized document name of this document file in the language, and sets the default locale.
	 *
	 * @param documentName the localized document name of this document file
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDocumentName(String documentName, Locale locale,
		Locale defaultLocale);

	public void setDocumentNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized document names of this document file from the map of locales and localized document names.
	 *
	 * @param documentNameMap the locales and localized document names of this document file
	 */
	public void setDocumentNameMap(Map<Locale, String> documentNameMap);

	/**
	 * Sets the localized document names of this document file from the map of locales and localized document names, and sets the default locale.
	 *
	 * @param documentNameMap the locales and localized document names of this document file
	 * @param defaultLocale the default locale
	 */
	public void setDocumentNameMap(Map<Locale, String> documentNameMap,
		Locale defaultLocale);

	/**
	 * Returns the document desc of this document file.
	 *
	 * @return the document desc of this document file
	 */
	public String getDocumentDesc();

	/**
	 * Returns the localized document desc of this document file in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized document desc of this document file
	 */
	@AutoEscape
	public String getDocumentDesc(Locale locale);

	/**
	 * Returns the localized document desc of this document file in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized document desc of this document file. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDocumentDesc(Locale locale, boolean useDefault);

	/**
	 * Returns the localized document desc of this document file in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized document desc of this document file
	 */
	@AutoEscape
	public String getDocumentDesc(String languageId);

	/**
	 * Returns the localized document desc of this document file in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized document desc of this document file
	 */
	@AutoEscape
	public String getDocumentDesc(String languageId, boolean useDefault);

	@AutoEscape
	public String getDocumentDescCurrentLanguageId();

	@AutoEscape
	public String getDocumentDescCurrentValue();

	/**
	 * Returns a map of the locales and localized document descs of this document file.
	 *
	 * @return the locales and localized document descs of this document file
	 */
	public Map<Locale, String> getDocumentDescMap();

	/**
	 * Sets the document desc of this document file.
	 *
	 * @param documentDesc the document desc of this document file
	 */
	public void setDocumentDesc(String documentDesc);

	/**
	 * Sets the localized document desc of this document file in the language.
	 *
	 * @param documentDesc the localized document desc of this document file
	 * @param locale the locale of the language
	 */
	public void setDocumentDesc(String documentDesc, Locale locale);

	/**
	 * Sets the localized document desc of this document file in the language, and sets the default locale.
	 *
	 * @param documentDesc the localized document desc of this document file
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDocumentDesc(String documentDesc, Locale locale,
		Locale defaultLocale);

	public void setDocumentDescCurrentLanguageId(String languageId);

	/**
	 * Sets the localized document descs of this document file from the map of locales and localized document descs.
	 *
	 * @param documentDescMap the locales and localized document descs of this document file
	 */
	public void setDocumentDescMap(Map<Locale, String> documentDescMap);

	/**
	 * Sets the localized document descs of this document file from the map of locales and localized document descs, and sets the default locale.
	 *
	 * @param documentDescMap the locales and localized document descs of this document file
	 * @param defaultLocale the default locale
	 */
	public void setDocumentDescMap(Map<Locale, String> documentDescMap,
		Locale defaultLocale);

	/**
	 * Returns the document path of this document file.
	 *
	 * @return the document path of this document file
	 */
	@AutoEscape
	public String getDocumentPath();

	/**
	 * Sets the document path of this document file.
	 *
	 * @param documentPath the document path of this document file
	 */
	public void setDocumentPath(String documentPath);

	/**
	 * Returns the resource ID of this document file.
	 *
	 * @return the resource ID of this document file
	 */
	public long getResourceId();

	/**
	 * Sets the resource ID of this document file.
	 *
	 * @param resourceId the resource ID of this document file
	 */
	public void setResourceId(long resourceId);

	/**
	 * Returns the collection ID of this document file.
	 *
	 * @return the collection ID of this document file
	 */
	public long getCollectionId();

	/**
	 * Sets the collection ID of this document file.
	 *
	 * @param collectionId the collection ID of this document file
	 */
	public void setCollectionId(long collectionId);

	/**
	 * Returns the resource type of this document file.
	 *
	 * @return the resource type of this document file
	 */
	@AutoEscape
	public String getResourceType();

	/**
	 * Sets the resource type of this document file.
	 *
	 * @param resourceType the resource type of this document file
	 */
	public void setResourceType(String resourceType);

	/**
	 * Returns the download url of this document file.
	 *
	 * @return the download url of this document file
	 */
	@AutoEscape
	public String getDownloadUrl();

	/**
	 * Sets the download url of this document file.
	 *
	 * @param downloadUrl the download url of this document file
	 */
	public void setDownloadUrl(String downloadUrl);

	/**
	 * Returns the doc uuid of this document file.
	 *
	 * @return the doc uuid of this document file
	 */
	@AutoEscape
	public String getDocUuid();

	/**
	 * Sets the doc uuid of this document file.
	 *
	 * @param docUuid the doc uuid of this document file
	 */
	public void setDocUuid(String docUuid);

	/**
	 * Returns the has auto transcript of this document file.
	 *
	 * @return the has auto transcript of this document file
	 */
	@AutoEscape
	public String getHasAutoTranscript();

	/**
	 * Sets the has auto transcript of this document file.
	 *
	 * @param hasAutoTranscript the has auto transcript of this document file
	 */
	public void setHasAutoTranscript(String hasAutoTranscript);

	/**
	 * Returns the created date of this document file.
	 *
	 * @return the created date of this document file
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this document file.
	 *
	 * @param createdDate the created date of this document file
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the permission of this document file.
	 *
	 * @return the permission of this document file
	 */
	@AutoEscape
	public String getPermission();

	/**
	 * Sets the permission of this document file.
	 *
	 * @param permission the permission of this document file
	 */
	public void setPermission(String permission);

	/**
	 * Returns the status of this document file.
	 *
	 * @return the status of this document file
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this document file.
	 *
	 * @param status the status of this document file
	 */
	public void setStatus(String status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public String[] getAvailableLanguageIds();

	public String getDefaultLanguageId();

	public void prepareLocalizedFieldsForImport() throws LocaleException;

	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(DocumentFile documentFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DocumentFile> toCacheModel();

	@Override
	public DocumentFile toEscapedModel();

	@Override
	public DocumentFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}