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
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.nyu.service.ClpSerializer;
import com.nyu.service.DocumentFileLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Allwins Rajaiah
 */
public class DocumentFileClp extends BaseModelImpl<DocumentFile>
	implements DocumentFile {
	public DocumentFileClp() {
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

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentId", long.class);

				method.invoke(_documentFileRemoteModel, documentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_documentFileRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_documentFileRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_lessonId = lessonId;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_documentFileRemoteModel, lessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSectionId() {
		return _sectionId;
	}

	@Override
	public void setSectionId(long sectionId) {
		_sectionId = sectionId;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setSectionId", long.class);

				method.invoke(_documentFileRemoteModel, sectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentName() {
		return _documentName;
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

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", String.class);

				method.invoke(_documentFileRemoteModel, documentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setDocumentName(LocalizationUtil.updateLocalization(
					documentNameMap, getDocumentName(), "DocumentName",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getDocumentDesc() {
		return _documentDesc;
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

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentDesc", String.class);

				method.invoke(_documentFileRemoteModel, documentDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setDocumentDesc(LocalizationUtil.updateLocalization(
					documentDescMap, getDocumentDesc(), "DocumentDesc",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getDocumentPath() {
		return _documentPath;
	}

	@Override
	public void setDocumentPath(String documentPath) {
		_documentPath = documentPath;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentPath", String.class);

				method.invoke(_documentFileRemoteModel, documentPath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResourceId() {
		return _resourceId;
	}

	@Override
	public void setResourceId(long resourceId) {
		_resourceId = resourceId;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceId", long.class);

				method.invoke(_documentFileRemoteModel, resourceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCollectionId() {
		return _collectionId;
	}

	@Override
	public void setCollectionId(long collectionId) {
		_collectionId = collectionId;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCollectionId", long.class);

				method.invoke(_documentFileRemoteModel, collectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResourceType() {
		return _resourceType;
	}

	@Override
	public void setResourceType(String resourceType) {
		_resourceType = resourceType;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceType", String.class);

				method.invoke(_documentFileRemoteModel, resourceType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDownloadUrl() {
		return _downloadUrl;
	}

	@Override
	public void setDownloadUrl(String downloadUrl) {
		_downloadUrl = downloadUrl;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDownloadUrl", String.class);

				method.invoke(_documentFileRemoteModel, downloadUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocUuid() {
		return _docUuid;
	}

	@Override
	public void setDocUuid(String docUuid) {
		_docUuid = docUuid;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDocUuid", String.class);

				method.invoke(_documentFileRemoteModel, docUuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHasAutoTranscript() {
		return _hasAutoTranscript;
	}

	@Override
	public void setHasAutoTranscript(String hasAutoTranscript) {
		_hasAutoTranscript = hasAutoTranscript;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setHasAutoTranscript",
						String.class);

				method.invoke(_documentFileRemoteModel, hasAutoTranscript);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_documentFileRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPermission() {
		return _permission;
	}

	@Override
	public void setPermission(String permission) {
		_permission = permission;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPermission", String.class);

				method.invoke(_documentFileRemoteModel, permission);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_documentFileRemoteModel != null) {
			try {
				Class<?> clazz = _documentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_documentFileRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocumentFileRemoteModel() {
		return _documentFileRemoteModel;
	}

	public void setDocumentFileRemoteModel(BaseModel<?> documentFileRemoteModel) {
		_documentFileRemoteModel = documentFileRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _documentFileRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_documentFileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentFileLocalServiceUtil.addDocumentFile(this);
		}
		else {
			DocumentFileLocalServiceUtil.updateDocumentFile(this);
		}
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
		return (DocumentFile)ProxyUtil.newProxyInstance(DocumentFile.class.getClassLoader(),
			new Class[] { DocumentFile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentFileClp clone = new DocumentFileClp();

		clone.setDocumentId(getDocumentId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setLessonId(getLessonId());
		clone.setSectionId(getSectionId());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentDesc(getDocumentDesc());
		clone.setDocumentPath(getDocumentPath());
		clone.setResourceId(getResourceId());
		clone.setCollectionId(getCollectionId());
		clone.setResourceType(getResourceType());
		clone.setDownloadUrl(getDownloadUrl());
		clone.setDocUuid(getDocUuid());
		clone.setHasAutoTranscript(getHasAutoTranscript());
		clone.setCreatedDate(getCreatedDate());
		clone.setPermission(getPermission());
		clone.setStatus(getStatus());

		return clone;
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

		if (!(obj instanceof DocumentFileClp)) {
			return false;
		}

		DocumentFileClp documentFile = (DocumentFileClp)obj;

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

	private long _documentId;
	private long _companyId;
	private long _groupId;
	private long _lessonId;
	private long _sectionId;
	private String _documentName;
	private String _documentNameCurrentLanguageId;
	private String _documentDesc;
	private String _documentDescCurrentLanguageId;
	private String _documentPath;
	private long _resourceId;
	private long _collectionId;
	private String _resourceType;
	private String _downloadUrl;
	private String _docUuid;
	private String _hasAutoTranscript;
	private Date _createdDate;
	private String _permission;
	private String _status;
	private BaseModel<?> _documentFileRemoteModel;
}