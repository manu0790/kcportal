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
import com.liferay.portal.util.PortalUtil;

import com.nyu.service.ClpSerializer;
import com.nyu.service.NYUUserGroupLocalServiceUtil;

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
public class NYUUserGroupClp extends BaseModelImpl<NYUUserGroup>
	implements NYUUserGroup {
	public NYUUserGroupClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NYUUserGroup.class;
	}

	@Override
	public String getModelClassName() {
		return NYUUserGroup.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userGroupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userGroupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userGroupId", getUserGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("groupPrivacy", getGroupPrivacy());
		attributes.put("appreciatedUserIds", getAppreciatedUserIds());
		attributes.put("appreciateCount", getAppreciateCount());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("administrators", getAdministrators());
		attributes.put("about", getAbout());
		attributes.put("title", getTitle());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userGroupId = (Long)attributes.get("userGroupId");

		if (userGroupId != null) {
			setUserGroupId(userGroupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String groupPrivacy = (String)attributes.get("groupPrivacy");

		if (groupPrivacy != null) {
			setGroupPrivacy(groupPrivacy);
		}

		String appreciatedUserIds = (String)attributes.get("appreciatedUserIds");

		if (appreciatedUserIds != null) {
			setAppreciatedUserIds(appreciatedUserIds);
		}

		Long appreciateCount = (Long)attributes.get("appreciateCount");

		if (appreciateCount != null) {
			setAppreciateCount(appreciateCount);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}

		String administrators = (String)attributes.get("administrators");

		if (administrators != null) {
			setAdministrators(administrators);
		}

		String about = (String)attributes.get("about");

		if (about != null) {
			setAbout(about);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_nyuUserGroupRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserGroupId() {
		return _userGroupId;
	}

	@Override
	public void setUserGroupId(long userGroupId) {
		_userGroupId = userGroupId;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setUserGroupId", long.class);

				method.invoke(_nyuUserGroupRemoteModel, userGroupId);
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

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_nyuUserGroupRemoteModel, companyId);
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

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_nyuUserGroupRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGroupPrivacy() {
		return _groupPrivacy;
	}

	@Override
	public void setGroupPrivacy(String groupPrivacy) {
		_groupPrivacy = groupPrivacy;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupPrivacy", String.class);

				method.invoke(_nyuUserGroupRemoteModel, groupPrivacy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppreciatedUserIds() {
		return _appreciatedUserIds;
	}

	@Override
	public void setAppreciatedUserIds(String appreciatedUserIds) {
		_appreciatedUserIds = appreciatedUserIds;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciatedUserIds",
						String.class);

				method.invoke(_nyuUserGroupRemoteModel, appreciatedUserIds);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAppreciateCount() {
		return _appreciateCount;
	}

	@Override
	public void setAppreciateCount(long appreciateCount) {
		_appreciateCount = appreciateCount;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciateCount", long.class);

				method.invoke(_nyuUserGroupRemoteModel, appreciateCount);
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

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_nyuUserGroupRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_nyuUserGroupRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdatedDate() {
		return _updatedDate;
	}

	@Override
	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedDate", Date.class);

				method.invoke(_nyuUserGroupRemoteModel, updatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_nyuUserGroupRemoteModel, updatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdministrators() {
		return _administrators;
	}

	@Override
	public void setAdministrators(String administrators) {
		_administrators = administrators;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setAdministrators",
						String.class);

				method.invoke(_nyuUserGroupRemoteModel, administrators);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAbout() {
		return _about;
	}

	@Override
	public String getAbout(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getAbout(languageId);
	}

	@Override
	public String getAbout(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getAbout(languageId, useDefault);
	}

	@Override
	public String getAbout(String languageId) {
		return LocalizationUtil.getLocalization(getAbout(), languageId);
	}

	@Override
	public String getAbout(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getAbout(), languageId,
			useDefault);
	}

	@Override
	public String getAboutCurrentLanguageId() {
		return _aboutCurrentLanguageId;
	}

	@Override
	public String getAboutCurrentValue() {
		Locale locale = getLocale(_aboutCurrentLanguageId);

		return getAbout(locale);
	}

	@Override
	public Map<Locale, String> getAboutMap() {
		return LocalizationUtil.getLocalizationMap(getAbout());
	}

	@Override
	public void setAbout(String about) {
		_about = about;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setAbout", String.class);

				method.invoke(_nyuUserGroupRemoteModel, about);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setAbout(String about, Locale locale) {
		setAbout(about, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setAbout(String about, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(about)) {
			setAbout(LocalizationUtil.updateLocalization(getAbout(), "About",
					about, languageId, defaultLanguageId));
		}
		else {
			setAbout(LocalizationUtil.removeLocalization(getAbout(), "About",
					languageId));
		}
	}

	@Override
	public void setAboutCurrentLanguageId(String languageId) {
		_aboutCurrentLanguageId = languageId;
	}

	@Override
	public void setAboutMap(Map<Locale, String> aboutMap) {
		setAboutMap(aboutMap, LocaleUtil.getDefault());
	}

	@Override
	public void setAboutMap(Map<Locale, String> aboutMap, Locale defaultLocale) {
		if (aboutMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setAbout(LocalizationUtil.updateLocalization(aboutMap, getAbout(),
					"About", LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public String getTitle(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId);
	}

	@Override
	public String getTitle(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId, useDefault);
	}

	@Override
	public String getTitle(String languageId) {
		return LocalizationUtil.getLocalization(getTitle(), languageId);
	}

	@Override
	public String getTitle(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getTitle(), languageId,
			useDefault);
	}

	@Override
	public String getTitleCurrentLanguageId() {
		return _titleCurrentLanguageId;
	}

	@Override
	public String getTitleCurrentValue() {
		Locale locale = getLocale(_titleCurrentLanguageId);

		return getTitle(locale);
	}

	@Override
	public Map<Locale, String> getTitleMap() {
		return LocalizationUtil.getLocalizationMap(getTitle());
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_nyuUserGroupRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setTitle(String title, Locale locale) {
		setTitle(title, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setTitle(String title, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(title)) {
			setTitle(LocalizationUtil.updateLocalization(getTitle(), "Title",
					title, languageId, defaultLanguageId));
		}
		else {
			setTitle(LocalizationUtil.removeLocalization(getTitle(), "Title",
					languageId));
		}
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		_titleCurrentLanguageId = languageId;
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap) {
		setTitleMap(titleMap, LocaleUtil.getDefault());
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale) {
		if (titleMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setTitle(LocalizationUtil.updateLocalization(titleMap, getTitle(),
					"Title", LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_nyuUserGroupRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserId", long.class);

				method.invoke(_nyuUserGroupRemoteModel, statusByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_nyuUserGroupRemoteModel != null) {
			try {
				Class<?> clazz = _nyuUserGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_nyuUserGroupRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNYUUserGroupRemoteModel() {
		return _nyuUserGroupRemoteModel;
	}

	public void setNYUUserGroupRemoteModel(BaseModel<?> nyuUserGroupRemoteModel) {
		_nyuUserGroupRemoteModel = nyuUserGroupRemoteModel;
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

		Class<?> remoteModelClass = _nyuUserGroupRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nyuUserGroupRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NYUUserGroupLocalServiceUtil.addNYUUserGroup(this);
		}
		else {
			NYUUserGroupLocalServiceUtil.updateNYUUserGroup(this);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> aboutMap = getAboutMap();

		for (Map.Entry<Locale, String> entry : aboutMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> titleMap = getTitleMap();

		for (Map.Entry<Locale, String> entry : titleMap.entrySet()) {
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
		String xml = getAbout();

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

		String about = getAbout(defaultLocale);

		if (Validator.isNull(about)) {
			setAbout(getAbout(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setAbout(getAbout(defaultLocale), defaultLocale, defaultLocale);
		}

		String title = getTitle(defaultLocale);

		if (Validator.isNull(title)) {
			setTitle(getTitle(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setTitle(getTitle(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public NYUUserGroup toEscapedModel() {
		return (NYUUserGroup)ProxyUtil.newProxyInstance(NYUUserGroup.class.getClassLoader(),
			new Class[] { NYUUserGroup.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NYUUserGroupClp clone = new NYUUserGroupClp();

		clone.setUuid(getUuid());
		clone.setUserGroupId(getUserGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setGroupPrivacy(getGroupPrivacy());
		clone.setAppreciatedUserIds(getAppreciatedUserIds());
		clone.setAppreciateCount(getAppreciateCount());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedDate(getUpdatedDate());
		clone.setUpdatedBy(getUpdatedBy());
		clone.setAdministrators(getAdministrators());
		clone.setAbout(getAbout());
		clone.setTitle(getTitle());
		clone.setStatus(getStatus());
		clone.setStatusByUserId(getStatusByUserId());
		clone.setStatusDate(getStatusDate());

		return clone;
	}

	@Override
	public int compareTo(NYUUserGroup nyuUserGroup) {
		long primaryKey = nyuUserGroup.getPrimaryKey();

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

		if (!(obj instanceof NYUUserGroupClp)) {
			return false;
		}

		NYUUserGroupClp nyuUserGroup = (NYUUserGroupClp)obj;

		long primaryKey = nyuUserGroup.getPrimaryKey();

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

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", userGroupId=");
		sb.append(getUserGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", groupPrivacy=");
		sb.append(getGroupPrivacy());
		sb.append(", appreciatedUserIds=");
		sb.append(getAppreciatedUserIds());
		sb.append(", appreciateCount=");
		sb.append(getAppreciateCount());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedDate=");
		sb.append(getUpdatedDate());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append(", administrators=");
		sb.append(getAdministrators());
		sb.append(", about=");
		sb.append(getAbout());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.NYUUserGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userGroupId</column-name><column-value><![CDATA[");
		sb.append(getUserGroupId());
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
			"<column><column-name>groupPrivacy</column-name><column-value><![CDATA[");
		sb.append(getGroupPrivacy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciatedUserIds</column-name><column-value><![CDATA[");
		sb.append(getAppreciatedUserIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciateCount</column-name><column-value><![CDATA[");
		sb.append(getAppreciateCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedDate</column-name><column-value><![CDATA[");
		sb.append(getUpdatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>administrators</column-name><column-value><![CDATA[");
		sb.append(getAdministrators());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>about</column-name><column-value><![CDATA[");
		sb.append(getAbout());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _userGroupId;
	private long _companyId;
	private long _groupId;
	private String _groupPrivacy;
	private String _appreciatedUserIds;
	private long _appreciateCount;
	private Date _createdDate;
	private long _createdBy;
	private Date _updatedDate;
	private long _updatedBy;
	private String _administrators;
	private String _about;
	private String _aboutCurrentLanguageId;
	private String _title;
	private String _titleCurrentLanguageId;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private Date _statusDate;
	private BaseModel<?> _nyuUserGroupRemoteModel;
}