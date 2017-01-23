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

package com.nyu.model.impl;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.nyu.model.DocumentFile;
import com.nyu.model.DocumentFileModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * The base model implementation for the DocumentFile service. Represents a row in the &quot;nyyou_DocumentFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.DocumentFileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentFileImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFileImpl
 * @see com.nyu.model.DocumentFile
 * @see com.nyu.model.DocumentFileModel
 * @generated
 */
public class DocumentFileModelImpl extends BaseModelImpl<DocumentFile>
	implements DocumentFileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document file model instance should use the {@link com.nyu.model.DocumentFile} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_DocumentFile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "documentId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "lessonId", Types.BIGINT },
			{ "sectionId", Types.BIGINT },
			{ "documentName", Types.VARCHAR },
			{ "documentDesc", Types.VARCHAR },
			{ "documentPath", Types.VARCHAR },
			{ "resourceId", Types.BIGINT },
			{ "collectionId", Types.BIGINT },
			{ "resourceType", Types.VARCHAR },
			{ "downloadUrl", Types.VARCHAR },
			{ "docUuid", Types.VARCHAR },
			{ "hasAutoTranscript", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "permission", Types.VARCHAR },
			{ "status", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_DocumentFile (documentId LONG not null primary key IDENTITY,companyId LONG,groupId LONG,lessonId LONG,sectionId LONG,documentName STRING null,documentDesc STRING null,documentPath VARCHAR(1000) null,resourceId LONG,collectionId LONG,resourceType VARCHAR(75) null,downloadUrl VARCHAR(1000) null,docUuid VARCHAR(75) null,hasAutoTranscript VARCHAR(75) null,createdDate DATE null,permission VARCHAR(75) null,status VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table nyyou_DocumentFile";
	public static final String ORDER_BY_JPQL = " ORDER BY documentFile.documentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_DocumentFile.documentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.DocumentFile"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.DocumentFile"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nyu.model.DocumentFile"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long DOCUUID_COLUMN_BITMASK = 2L;
	public static long LESSONID_COLUMN_BITMASK = 4L;
	public static long RESOURCEID_COLUMN_BITMASK = 8L;
	public static long RESOURCETYPE_COLUMN_BITMASK = 16L;
	public static long STATUS_COLUMN_BITMASK = 32L;
	public static long DOCUMENTID_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.DocumentFile"));

	public DocumentFileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _documentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDocumentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _documentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getDocumentId() {
		return _documentId;
	}

	@Override
	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_columnBitmask |= LESSONID_COLUMN_BITMASK;

		if (!_setOriginalLessonId) {
			_setOriginalLessonId = true;

			_originalLessonId = _lessonId;
		}

		_lessonId = lessonId;
	}

	public long getOriginalLessonId() {
		return _originalLessonId;
	}

	@Override
	public long getSectionId() {
		return _sectionId;
	}

	@Override
	public void setSectionId(long sectionId) {
		_sectionId = sectionId;
	}

	@Override
	public String getDocumentName() {
		if (_documentName == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentName;
		}
	}

	@Override
	public String getDocumentName(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDocumentName(languageId);
	}

	@Override
	public String getDocumentName(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDocumentName(languageId, useDefault);
	}

	@Override
	public String getDocumentName(String languageId) {
		return LocalizationUtil.getLocalization(getDocumentName(), languageId);
	}

	@Override
	public String getDocumentName(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getDocumentName(), languageId,
			useDefault);
	}

	@Override
	public String getDocumentNameCurrentLanguageId() {
		return _documentNameCurrentLanguageId;
	}

	@JSON
	@Override
	public String getDocumentNameCurrentValue() {
		Locale locale = getLocale(_documentNameCurrentLanguageId);

		return getDocumentName(locale);
	}

	@Override
	public Map<Locale, String> getDocumentNameMap() {
		return LocalizationUtil.getLocalizationMap(getDocumentName());
	}

	@Override
	public void setDocumentName(String documentName) {
		_documentName = documentName;
	}

	@Override
	public void setDocumentName(String documentName, Locale locale) {
		setDocumentName(documentName, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setDocumentName(String documentName, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(documentName)) {
			setDocumentName(LocalizationUtil.updateLocalization(
					getDocumentName(), "DocumentName", documentName,
					languageId, defaultLanguageId));
		}
		else {
			setDocumentName(LocalizationUtil.removeLocalization(
					getDocumentName(), "DocumentName", languageId));
		}
	}

	@Override
	public void setDocumentNameCurrentLanguageId(String languageId) {
		_documentNameCurrentLanguageId = languageId;
	}

	@Override
	public void setDocumentNameMap(Map<Locale, String> documentNameMap) {
		setDocumentNameMap(documentNameMap, LocaleUtil.getDefault());
	}

	@Override
	public void setDocumentNameMap(Map<Locale, String> documentNameMap,
		Locale defaultLocale) {
		if (documentNameMap == null) {
			return;
		}

		setDocumentName(LocalizationUtil.updateLocalization(documentNameMap,
				getDocumentName(), "DocumentName",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@Override
	public String getDocumentDesc() {
		if (_documentDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentDesc;
		}
	}

	@Override
	public String getDocumentDesc(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDocumentDesc(languageId);
	}

	@Override
	public String getDocumentDesc(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDocumentDesc(languageId, useDefault);
	}

	@Override
	public String getDocumentDesc(String languageId) {
		return LocalizationUtil.getLocalization(getDocumentDesc(), languageId);
	}

	@Override
	public String getDocumentDesc(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getDocumentDesc(), languageId,
			useDefault);
	}

	@Override
	public String getDocumentDescCurrentLanguageId() {
		return _documentDescCurrentLanguageId;
	}

	@JSON
	@Override
	public String getDocumentDescCurrentValue() {
		Locale locale = getLocale(_documentDescCurrentLanguageId);

		return getDocumentDesc(locale);
	}

	@Override
	public Map<Locale, String> getDocumentDescMap() {
		return LocalizationUtil.getLocalizationMap(getDocumentDesc());
	}

	@Override
	public void setDocumentDesc(String documentDesc) {
		_documentDesc = documentDesc;
	}

	@Override
	public void setDocumentDesc(String documentDesc, Locale locale) {
		setDocumentDesc(documentDesc, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setDocumentDesc(String documentDesc, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(documentDesc)) {
			setDocumentDesc(LocalizationUtil.updateLocalization(
					getDocumentDesc(), "DocumentDesc", documentDesc,
					languageId, defaultLanguageId));
		}
		else {
			setDocumentDesc(LocalizationUtil.removeLocalization(
					getDocumentDesc(), "DocumentDesc", languageId));
		}
	}

	@Override
	public void setDocumentDescCurrentLanguageId(String languageId) {
		_documentDescCurrentLanguageId = languageId;
	}

	@Override
	public void setDocumentDescMap(Map<Locale, String> documentDescMap) {
		setDocumentDescMap(documentDescMap, LocaleUtil.getDefault());
	}

	@Override
	public void setDocumentDescMap(Map<Locale, String> documentDescMap,
		Locale defaultLocale) {
		if (documentDescMap == null) {
			return;
		}

		setDocumentDesc(LocalizationUtil.updateLocalization(documentDescMap,
				getDocumentDesc(), "DocumentDesc",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@Override
	public String getDocumentPath() {
		if (_documentPath == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentPath;
		}
	}

	@Override
	public void setDocumentPath(String documentPath) {
		_documentPath = documentPath;
	}

	@Override
	public long getResourceId() {
		return _resourceId;
	}

	@Override
	public void setResourceId(long resourceId) {
		_columnBitmask |= RESOURCEID_COLUMN_BITMASK;

		if (!_setOriginalResourceId) {
			_setOriginalResourceId = true;

			_originalResourceId = _resourceId;
		}

		_resourceId = resourceId;
	}

	public long getOriginalResourceId() {
		return _originalResourceId;
	}

	@Override
	public long getCollectionId() {
		return _collectionId;
	}

	@Override
	public void setCollectionId(long collectionId) {
		_collectionId = collectionId;
	}

	@Override
	public String getResourceType() {
		if (_resourceType == null) {
			return StringPool.BLANK;
		}
		else {
			return _resourceType;
		}
	}

	@Override
	public void setResourceType(String resourceType) {
		_columnBitmask |= RESOURCETYPE_COLUMN_BITMASK;

		if (_originalResourceType == null) {
			_originalResourceType = _resourceType;
		}

		_resourceType = resourceType;
	}

	public String getOriginalResourceType() {
		return GetterUtil.getString(_originalResourceType);
	}

	@Override
	public String getDownloadUrl() {
		if (_downloadUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _downloadUrl;
		}
	}

	@Override
	public void setDownloadUrl(String downloadUrl) {
		_downloadUrl = downloadUrl;
	}

	@Override
	public String getDocUuid() {
		if (_docUuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _docUuid;
		}
	}

	@Override
	public void setDocUuid(String docUuid) {
		_columnBitmask |= DOCUUID_COLUMN_BITMASK;

		if (_originalDocUuid == null) {
			_originalDocUuid = _docUuid;
		}

		_docUuid = docUuid;
	}

	public String getOriginalDocUuid() {
		return GetterUtil.getString(_originalDocUuid);
	}

	@Override
	public String getHasAutoTranscript() {
		if (_hasAutoTranscript == null) {
			return StringPool.BLANK;
		}
		else {
			return _hasAutoTranscript;
		}
	}

	@Override
	public void setHasAutoTranscript(String hasAutoTranscript) {
		_hasAutoTranscript = hasAutoTranscript;
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@Override
	public String getPermission() {
		if (_permission == null) {
			return StringPool.BLANK;
		}
		else {
			return _permission;
		}
	}

	@Override
	public void setPermission(String permission) {
		_permission = permission;
	}

	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (_originalStatus == null) {
			_originalStatus = _status;
		}

		_status = status;
	}

	public String getOriginalStatus() {
		return GetterUtil.getString(_originalStatus);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DocumentFile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> documentNameMap = getDocumentNameMap();

		for (Map.Entry<Locale, String> entry : documentNameMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> documentDescMap = getDocumentDescMap();

		for (Map.Entry<Locale, String> entry : documentDescMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getDocumentName();

		if (xml == null) {
			return StringPool.BLANK;
		}

		return LocalizationUtil.getDefaultLanguageId(xml);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		prepareLocalizedFieldsForImport(null);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String documentName = getDocumentName(defaultLocale);

		if (Validator.isNull(documentName)) {
			setDocumentName(getDocumentName(modelDefaultLanguageId),
				defaultLocale);
		}
		else {
			setDocumentName(getDocumentName(defaultLocale), defaultLocale,
				defaultLocale);
		}

		String documentDesc = getDocumentDesc(defaultLocale);

		if (Validator.isNull(documentDesc)) {
			setDocumentDesc(getDocumentDesc(modelDefaultLanguageId),
				defaultLocale);
		}
		else {
			setDocumentDesc(getDocumentDesc(defaultLocale), defaultLocale,
				defaultLocale);
		}
	}

	@Override
	public DocumentFile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DocumentFile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocumentFileImpl documentFileImpl = new DocumentFileImpl();

		documentFileImpl.setDocumentId(getDocumentId());
		documentFileImpl.setCompanyId(getCompanyId());
		documentFileImpl.setGroupId(getGroupId());
		documentFileImpl.setLessonId(getLessonId());
		documentFileImpl.setSectionId(getSectionId());
		documentFileImpl.setDocumentName(getDocumentName());
		documentFileImpl.setDocumentDesc(getDocumentDesc());
		documentFileImpl.setDocumentPath(getDocumentPath());
		documentFileImpl.setResourceId(getResourceId());
		documentFileImpl.setCollectionId(getCollectionId());
		documentFileImpl.setResourceType(getResourceType());
		documentFileImpl.setDownloadUrl(getDownloadUrl());
		documentFileImpl.setDocUuid(getDocUuid());
		documentFileImpl.setHasAutoTranscript(getHasAutoTranscript());
		documentFileImpl.setCreatedDate(getCreatedDate());
		documentFileImpl.setPermission(getPermission());
		documentFileImpl.setStatus(getStatus());

		documentFileImpl.resetOriginalValues();

		return documentFileImpl;
	}

	@Override
	public int compareTo(DocumentFile documentFile) {
		long primaryKey = documentFile.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentFile)) {
			return false;
		}

		DocumentFile documentFile = (DocumentFile)obj;

		long primaryKey = documentFile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DocumentFileModelImpl documentFileModelImpl = this;

		documentFileModelImpl._originalCompanyId = documentFileModelImpl._companyId;

		documentFileModelImpl._setOriginalCompanyId = false;

		documentFileModelImpl._originalLessonId = documentFileModelImpl._lessonId;

		documentFileModelImpl._setOriginalLessonId = false;

		documentFileModelImpl._originalResourceId = documentFileModelImpl._resourceId;

		documentFileModelImpl._setOriginalResourceId = false;

		documentFileModelImpl._originalResourceType = documentFileModelImpl._resourceType;

		documentFileModelImpl._originalDocUuid = documentFileModelImpl._docUuid;

		documentFileModelImpl._originalStatus = documentFileModelImpl._status;

		documentFileModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocumentFile> toCacheModel() {
		DocumentFileCacheModel documentFileCacheModel = new DocumentFileCacheModel();

		documentFileCacheModel.documentId = getDocumentId();

		documentFileCacheModel.companyId = getCompanyId();

		documentFileCacheModel.groupId = getGroupId();

		documentFileCacheModel.lessonId = getLessonId();

		documentFileCacheModel.sectionId = getSectionId();

		documentFileCacheModel.documentName = getDocumentName();

		String documentName = documentFileCacheModel.documentName;

		if ((documentName != null) && (documentName.length() == 0)) {
			documentFileCacheModel.documentName = null;
		}

		documentFileCacheModel.documentDesc = getDocumentDesc();

		String documentDesc = documentFileCacheModel.documentDesc;

		if ((documentDesc != null) && (documentDesc.length() == 0)) {
			documentFileCacheModel.documentDesc = null;
		}

		documentFileCacheModel.documentPath = getDocumentPath();

		String documentPath = documentFileCacheModel.documentPath;

		if ((documentPath != null) && (documentPath.length() == 0)) {
			documentFileCacheModel.documentPath = null;
		}

		documentFileCacheModel.resourceId = getResourceId();

		documentFileCacheModel.collectionId = getCollectionId();

		documentFileCacheModel.resourceType = getResourceType();

		String resourceType = documentFileCacheModel.resourceType;

		if ((resourceType != null) && (resourceType.length() == 0)) {
			documentFileCacheModel.resourceType = null;
		}

		documentFileCacheModel.downloadUrl = getDownloadUrl();

		String downloadUrl = documentFileCacheModel.downloadUrl;

		if ((downloadUrl != null) && (downloadUrl.length() == 0)) {
			documentFileCacheModel.downloadUrl = null;
		}

		documentFileCacheModel.docUuid = getDocUuid();

		String docUuid = documentFileCacheModel.docUuid;

		if ((docUuid != null) && (docUuid.length() == 0)) {
			documentFileCacheModel.docUuid = null;
		}

		documentFileCacheModel.hasAutoTranscript = getHasAutoTranscript();

		String hasAutoTranscript = documentFileCacheModel.hasAutoTranscript;

		if ((hasAutoTranscript != null) && (hasAutoTranscript.length() == 0)) {
			documentFileCacheModel.hasAutoTranscript = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			documentFileCacheModel.createdDate = createdDate.getTime();
		}
		else {
			documentFileCacheModel.createdDate = Long.MIN_VALUE;
		}

		documentFileCacheModel.permission = getPermission();

		String permission = documentFileCacheModel.permission;

		if ((permission != null) && (permission.length() == 0)) {
			documentFileCacheModel.permission = null;
		}

		documentFileCacheModel.status = getStatus();

		String status = documentFileCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			documentFileCacheModel.status = null;
		}

		return documentFileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{documentId=");
		sb.append(getDocumentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", lessonId=");
		sb.append(getLessonId());
		sb.append(", sectionId=");
		sb.append(getSectionId());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentDesc=");
		sb.append(getDocumentDesc());
		sb.append(", documentPath=");
		sb.append(getDocumentPath());
		sb.append(", resourceId=");
		sb.append(getResourceId());
		sb.append(", collectionId=");
		sb.append(getCollectionId());
		sb.append(", resourceType=");
		sb.append(getResourceType());
		sb.append(", downloadUrl=");
		sb.append(getDownloadUrl());
		sb.append(", docUuid=");
		sb.append(getDocUuid());
		sb.append(", hasAutoTranscript=");
		sb.append(getHasAutoTranscript());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", permission=");
		sb.append(getPermission());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.DocumentFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>documentId</column-name><column-value><![CDATA[");
		sb.append(getDocumentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sectionId</column-name><column-value><![CDATA[");
		sb.append(getSectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentDesc</column-name><column-value><![CDATA[");
		sb.append(getDocumentDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentPath</column-name><column-value><![CDATA[");
		sb.append(getDocumentPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceId</column-name><column-value><![CDATA[");
		sb.append(getResourceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>collectionId</column-name><column-value><![CDATA[");
		sb.append(getCollectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceType</column-name><column-value><![CDATA[");
		sb.append(getResourceType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>downloadUrl</column-name><column-value><![CDATA[");
		sb.append(getDownloadUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docUuid</column-name><column-value><![CDATA[");
		sb.append(getDocUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasAutoTranscript</column-name><column-value><![CDATA[");
		sb.append(getHasAutoTranscript());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permission</column-name><column-value><![CDATA[");
		sb.append(getPermission());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DocumentFile.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DocumentFile.class
		};
	private long _documentId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _lessonId;
	private long _originalLessonId;
	private boolean _setOriginalLessonId;
	private long _sectionId;
	private String _documentName;
	private String _documentNameCurrentLanguageId;
	private String _documentDesc;
	private String _documentDescCurrentLanguageId;
	private String _documentPath;
	private long _resourceId;
	private long _originalResourceId;
	private boolean _setOriginalResourceId;
	private long _collectionId;
	private String _resourceType;
	private String _originalResourceType;
	private String _downloadUrl;
	private String _docUuid;
	private String _originalDocUuid;
	private String _hasAutoTranscript;
	private Date _createdDate;
	private String _permission;
	private String _status;
	private String _originalStatus;
	private long _columnBitmask;
	private DocumentFile _escapedModel;
}