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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocumentFile}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFile
 * @generated
 */
public class DocumentFileWrapper implements DocumentFile,
	ModelWrapper<DocumentFile> {
	public DocumentFileWrapper(DocumentFile documentFile) {
		_documentFile = documentFile;
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentFile.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("documentId", getDocumentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("lessonId", getLessonId());
		attributes.put("sectionId", getSectionId());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentDesc", getDocumentDesc());
		attributes.put("documentPath", getDocumentPath());
		attributes.put("resourceId", getResourceId());
		attributes.put("collectionId", getCollectionId());
		attributes.put("resourceType", getResourceType());
		attributes.put("downloadUrl", getDownloadUrl());
		attributes.put("docUuid", getDocUuid());
		attributes.put("hasAutoTranscript", getHasAutoTranscript());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("permission", getPermission());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		Long sectionId = (Long)attributes.get("sectionId");

		if (sectionId != null) {
			setSectionId(sectionId);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String documentDesc = (String)attributes.get("documentDesc");

		if (documentDesc != null) {
			setDocumentDesc(documentDesc);
		}

		String documentPath = (String)attributes.get("documentPath");

		if (documentPath != null) {
			setDocumentPath(documentPath);
		}

		Long resourceId = (Long)attributes.get("resourceId");

		if (resourceId != null) {
			setResourceId(resourceId);
		}

		Long collectionId = (Long)attributes.get("collectionId");

		if (collectionId != null) {
			setCollectionId(collectionId);
		}

		String resourceType = (String)attributes.get("resourceType");

		if (resourceType != null) {
			setResourceType(resourceType);
		}

		String downloadUrl = (String)attributes.get("downloadUrl");

		if (downloadUrl != null) {
			setDownloadUrl(downloadUrl);
		}

		String docUuid = (String)attributes.get("docUuid");

		if (docUuid != null) {
			setDocUuid(docUuid);
		}

		String hasAutoTranscript = (String)attributes.get("hasAutoTranscript");

		if (hasAutoTranscript != null) {
			setHasAutoTranscript(hasAutoTranscript);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String permission = (String)attributes.get("permission");

		if (permission != null) {
			setPermission(permission);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this document file.
	*
	* @return the primary key of this document file
	*/
	@Override
	public long getPrimaryKey() {
		return _documentFile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document file.
	*
	* @param primaryKey the primary key of this document file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_documentFile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the document ID of this document file.
	*
	* @return the document ID of this document file
	*/
	@Override
	public long getDocumentId() {
		return _documentFile.getDocumentId();
	}

	/**
	* Sets the document ID of this document file.
	*
	* @param documentId the document ID of this document file
	*/
	@Override
	public void setDocumentId(long documentId) {
		_documentFile.setDocumentId(documentId);
	}

	/**
	* Returns the company ID of this document file.
	*
	* @return the company ID of this document file
	*/
	@Override
	public long getCompanyId() {
		return _documentFile.getCompanyId();
	}

	/**
	* Sets the company ID of this document file.
	*
	* @param companyId the company ID of this document file
	*/
	@Override
	public void setCompanyId(long companyId) {
		_documentFile.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this document file.
	*
	* @return the group ID of this document file
	*/
	@Override
	public long getGroupId() {
		return _documentFile.getGroupId();
	}

	/**
	* Sets the group ID of this document file.
	*
	* @param groupId the group ID of this document file
	*/
	@Override
	public void setGroupId(long groupId) {
		_documentFile.setGroupId(groupId);
	}

	/**
	* Returns the lesson ID of this document file.
	*
	* @return the lesson ID of this document file
	*/
	@Override
	public long getLessonId() {
		return _documentFile.getLessonId();
	}

	/**
	* Sets the lesson ID of this document file.
	*
	* @param lessonId the lesson ID of this document file
	*/
	@Override
	public void setLessonId(long lessonId) {
		_documentFile.setLessonId(lessonId);
	}

	/**
	* Returns the section ID of this document file.
	*
	* @return the section ID of this document file
	*/
	@Override
	public long getSectionId() {
		return _documentFile.getSectionId();
	}

	/**
	* Sets the section ID of this document file.
	*
	* @param sectionId the section ID of this document file
	*/
	@Override
	public void setSectionId(long sectionId) {
		_documentFile.setSectionId(sectionId);
	}

	/**
	* Returns the document name of this document file.
	*
	* @return the document name of this document file
	*/
	@Override
	public java.lang.String getDocumentName() {
		return _documentFile.getDocumentName();
	}

	/**
	* Returns the localized document name of this document file in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized document name of this document file
	*/
	@Override
	public java.lang.String getDocumentName(java.util.Locale locale) {
		return _documentFile.getDocumentName(locale);
	}

	/**
	* Returns the localized document name of this document file in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized document name of this document file. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDocumentName(java.util.Locale locale,
		boolean useDefault) {
		return _documentFile.getDocumentName(locale, useDefault);
	}

	/**
	* Returns the localized document name of this document file in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized document name of this document file
	*/
	@Override
	public java.lang.String getDocumentName(java.lang.String languageId) {
		return _documentFile.getDocumentName(languageId);
	}

	/**
	* Returns the localized document name of this document file in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized document name of this document file
	*/
	@Override
	public java.lang.String getDocumentName(java.lang.String languageId,
		boolean useDefault) {
		return _documentFile.getDocumentName(languageId, useDefault);
	}

	@Override
	public java.lang.String getDocumentNameCurrentLanguageId() {
		return _documentFile.getDocumentNameCurrentLanguageId();
	}

	@Override
	public java.lang.String getDocumentNameCurrentValue() {
		return _documentFile.getDocumentNameCurrentValue();
	}

	/**
	* Returns a map of the locales and localized document names of this document file.
	*
	* @return the locales and localized document names of this document file
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDocumentNameMap() {
		return _documentFile.getDocumentNameMap();
	}

	/**
	* Sets the document name of this document file.
	*
	* @param documentName the document name of this document file
	*/
	@Override
	public void setDocumentName(java.lang.String documentName) {
		_documentFile.setDocumentName(documentName);
	}

	/**
	* Sets the localized document name of this document file in the language.
	*
	* @param documentName the localized document name of this document file
	* @param locale the locale of the language
	*/
	@Override
	public void setDocumentName(java.lang.String documentName,
		java.util.Locale locale) {
		_documentFile.setDocumentName(documentName, locale);
	}

	/**
	* Sets the localized document name of this document file in the language, and sets the default locale.
	*
	* @param documentName the localized document name of this document file
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDocumentName(java.lang.String documentName,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_documentFile.setDocumentName(documentName, locale, defaultLocale);
	}

	@Override
	public void setDocumentNameCurrentLanguageId(java.lang.String languageId) {
		_documentFile.setDocumentNameCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized document names of this document file from the map of locales and localized document names.
	*
	* @param documentNameMap the locales and localized document names of this document file
	*/
	@Override
	public void setDocumentNameMap(
		java.util.Map<java.util.Locale, java.lang.String> documentNameMap) {
		_documentFile.setDocumentNameMap(documentNameMap);
	}

	/**
	* Sets the localized document names of this document file from the map of locales and localized document names, and sets the default locale.
	*
	* @param documentNameMap the locales and localized document names of this document file
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDocumentNameMap(
		java.util.Map<java.util.Locale, java.lang.String> documentNameMap,
		java.util.Locale defaultLocale) {
		_documentFile.setDocumentNameMap(documentNameMap, defaultLocale);
	}

	/**
	* Returns the document desc of this document file.
	*
	* @return the document desc of this document file
	*/
	@Override
	public java.lang.String getDocumentDesc() {
		return _documentFile.getDocumentDesc();
	}

	/**
	* Returns the localized document desc of this document file in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized document desc of this document file
	*/
	@Override
	public java.lang.String getDocumentDesc(java.util.Locale locale) {
		return _documentFile.getDocumentDesc(locale);
	}

	/**
	* Returns the localized document desc of this document file in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized document desc of this document file. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDocumentDesc(java.util.Locale locale,
		boolean useDefault) {
		return _documentFile.getDocumentDesc(locale, useDefault);
	}

	/**
	* Returns the localized document desc of this document file in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized document desc of this document file
	*/
	@Override
	public java.lang.String getDocumentDesc(java.lang.String languageId) {
		return _documentFile.getDocumentDesc(languageId);
	}

	/**
	* Returns the localized document desc of this document file in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized document desc of this document file
	*/
	@Override
	public java.lang.String getDocumentDesc(java.lang.String languageId,
		boolean useDefault) {
		return _documentFile.getDocumentDesc(languageId, useDefault);
	}

	@Override
	public java.lang.String getDocumentDescCurrentLanguageId() {
		return _documentFile.getDocumentDescCurrentLanguageId();
	}

	@Override
	public java.lang.String getDocumentDescCurrentValue() {
		return _documentFile.getDocumentDescCurrentValue();
	}

	/**
	* Returns a map of the locales and localized document descs of this document file.
	*
	* @return the locales and localized document descs of this document file
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDocumentDescMap() {
		return _documentFile.getDocumentDescMap();
	}

	/**
	* Sets the document desc of this document file.
	*
	* @param documentDesc the document desc of this document file
	*/
	@Override
	public void setDocumentDesc(java.lang.String documentDesc) {
		_documentFile.setDocumentDesc(documentDesc);
	}

	/**
	* Sets the localized document desc of this document file in the language.
	*
	* @param documentDesc the localized document desc of this document file
	* @param locale the locale of the language
	*/
	@Override
	public void setDocumentDesc(java.lang.String documentDesc,
		java.util.Locale locale) {
		_documentFile.setDocumentDesc(documentDesc, locale);
	}

	/**
	* Sets the localized document desc of this document file in the language, and sets the default locale.
	*
	* @param documentDesc the localized document desc of this document file
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDocumentDesc(java.lang.String documentDesc,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_documentFile.setDocumentDesc(documentDesc, locale, defaultLocale);
	}

	@Override
	public void setDocumentDescCurrentLanguageId(java.lang.String languageId) {
		_documentFile.setDocumentDescCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized document descs of this document file from the map of locales and localized document descs.
	*
	* @param documentDescMap the locales and localized document descs of this document file
	*/
	@Override
	public void setDocumentDescMap(
		java.util.Map<java.util.Locale, java.lang.String> documentDescMap) {
		_documentFile.setDocumentDescMap(documentDescMap);
	}

	/**
	* Sets the localized document descs of this document file from the map of locales and localized document descs, and sets the default locale.
	*
	* @param documentDescMap the locales and localized document descs of this document file
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDocumentDescMap(
		java.util.Map<java.util.Locale, java.lang.String> documentDescMap,
		java.util.Locale defaultLocale) {
		_documentFile.setDocumentDescMap(documentDescMap, defaultLocale);
	}

	/**
	* Returns the document path of this document file.
	*
	* @return the document path of this document file
	*/
	@Override
	public java.lang.String getDocumentPath() {
		return _documentFile.getDocumentPath();
	}

	/**
	* Sets the document path of this document file.
	*
	* @param documentPath the document path of this document file
	*/
	@Override
	public void setDocumentPath(java.lang.String documentPath) {
		_documentFile.setDocumentPath(documentPath);
	}

	/**
	* Returns the resource ID of this document file.
	*
	* @return the resource ID of this document file
	*/
	@Override
	public long getResourceId() {
		return _documentFile.getResourceId();
	}

	/**
	* Sets the resource ID of this document file.
	*
	* @param resourceId the resource ID of this document file
	*/
	@Override
	public void setResourceId(long resourceId) {
		_documentFile.setResourceId(resourceId);
	}

	/**
	* Returns the collection ID of this document file.
	*
	* @return the collection ID of this document file
	*/
	@Override
	public long getCollectionId() {
		return _documentFile.getCollectionId();
	}

	/**
	* Sets the collection ID of this document file.
	*
	* @param collectionId the collection ID of this document file
	*/
	@Override
	public void setCollectionId(long collectionId) {
		_documentFile.setCollectionId(collectionId);
	}

	/**
	* Returns the resource type of this document file.
	*
	* @return the resource type of this document file
	*/
	@Override
	public java.lang.String getResourceType() {
		return _documentFile.getResourceType();
	}

	/**
	* Sets the resource type of this document file.
	*
	* @param resourceType the resource type of this document file
	*/
	@Override
	public void setResourceType(java.lang.String resourceType) {
		_documentFile.setResourceType(resourceType);
	}

	/**
	* Returns the download url of this document file.
	*
	* @return the download url of this document file
	*/
	@Override
	public java.lang.String getDownloadUrl() {
		return _documentFile.getDownloadUrl();
	}

	/**
	* Sets the download url of this document file.
	*
	* @param downloadUrl the download url of this document file
	*/
	@Override
	public void setDownloadUrl(java.lang.String downloadUrl) {
		_documentFile.setDownloadUrl(downloadUrl);
	}

	/**
	* Returns the doc uuid of this document file.
	*
	* @return the doc uuid of this document file
	*/
	@Override
	public java.lang.String getDocUuid() {
		return _documentFile.getDocUuid();
	}

	/**
	* Sets the doc uuid of this document file.
	*
	* @param docUuid the doc uuid of this document file
	*/
	@Override
	public void setDocUuid(java.lang.String docUuid) {
		_documentFile.setDocUuid(docUuid);
	}

	/**
	* Returns the has auto transcript of this document file.
	*
	* @return the has auto transcript of this document file
	*/
	@Override
	public java.lang.String getHasAutoTranscript() {
		return _documentFile.getHasAutoTranscript();
	}

	/**
	* Sets the has auto transcript of this document file.
	*
	* @param hasAutoTranscript the has auto transcript of this document file
	*/
	@Override
	public void setHasAutoTranscript(java.lang.String hasAutoTranscript) {
		_documentFile.setHasAutoTranscript(hasAutoTranscript);
	}

	/**
	* Returns the created date of this document file.
	*
	* @return the created date of this document file
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _documentFile.getCreatedDate();
	}

	/**
	* Sets the created date of this document file.
	*
	* @param createdDate the created date of this document file
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_documentFile.setCreatedDate(createdDate);
	}

	/**
	* Returns the permission of this document file.
	*
	* @return the permission of this document file
	*/
	@Override
	public java.lang.String getPermission() {
		return _documentFile.getPermission();
	}

	/**
	* Sets the permission of this document file.
	*
	* @param permission the permission of this document file
	*/
	@Override
	public void setPermission(java.lang.String permission) {
		_documentFile.setPermission(permission);
	}

	/**
	* Returns the status of this document file.
	*
	* @return the status of this document file
	*/
	@Override
	public java.lang.String getStatus() {
		return _documentFile.getStatus();
	}

	/**
	* Sets the status of this document file.
	*
	* @param status the status of this document file
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_documentFile.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _documentFile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_documentFile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _documentFile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_documentFile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _documentFile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _documentFile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_documentFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _documentFile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_documentFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_documentFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_documentFile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _documentFile.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _documentFile.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_documentFile.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_documentFile.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentFileWrapper((DocumentFile)_documentFile.clone());
	}

	@Override
	public int compareTo(com.nyu.model.DocumentFile documentFile) {
		return _documentFile.compareTo(documentFile);
	}

	@Override
	public int hashCode() {
		return _documentFile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.DocumentFile> toCacheModel() {
		return _documentFile.toCacheModel();
	}

	@Override
	public com.nyu.model.DocumentFile toEscapedModel() {
		return new DocumentFileWrapper(_documentFile.toEscapedModel());
	}

	@Override
	public com.nyu.model.DocumentFile toUnescapedModel() {
		return new DocumentFileWrapper(_documentFile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _documentFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _documentFile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_documentFile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentFileWrapper)) {
			return false;
		}

		DocumentFileWrapper documentFileWrapper = (DocumentFileWrapper)obj;

		if (Validator.equals(_documentFile, documentFileWrapper._documentFile)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocumentFile getWrappedDocumentFile() {
		return _documentFile;
	}

	@Override
	public DocumentFile getWrappedModel() {
		return _documentFile;
	}

	@Override
	public void resetOriginalValues() {
		_documentFile.resetOriginalValues();
	}

	private DocumentFile _documentFile;
}