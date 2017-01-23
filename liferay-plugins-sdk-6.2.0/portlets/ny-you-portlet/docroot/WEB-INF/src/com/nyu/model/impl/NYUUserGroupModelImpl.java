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
import com.liferay.portal.kernel.exception.SystemException;
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
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.nyu.model.NYUUserGroup;
import com.nyu.model.NYUUserGroupModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * The base model implementation for the NYUUserGroup service. Represents a row in the &quot;nyyou_NYUUserGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.NYUUserGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NYUUserGroupImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroupImpl
 * @see com.nyu.model.NYUUserGroup
 * @see com.nyu.model.NYUUserGroupModel
 * @generated
 */
public class NYUUserGroupModelImpl extends BaseModelImpl<NYUUserGroup>
	implements NYUUserGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a n y u user group model instance should use the {@link com.nyu.model.NYUUserGroup} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_NYUUserGroup";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "userGroupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "groupPrivacy", Types.VARCHAR },
			{ "appreciatedUserIds", Types.VARCHAR },
			{ "appreciateCount", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdBy", Types.BIGINT },
			{ "updatedDate", Types.TIMESTAMP },
			{ "updatedBy", Types.BIGINT },
			{ "administrators", Types.VARCHAR },
			{ "about", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_NYUUserGroup (uuid_ VARCHAR(75) null,userGroupId LONG not null primary key,companyId LONG,groupId LONG,groupPrivacy VARCHAR(75) null,appreciatedUserIds TEXT null,appreciateCount LONG,createdDate DATE null,createdBy LONG,updatedDate DATE null,updatedBy LONG,administrators TEXT null,about STRING null,title STRING null,status INTEGER,statusByUserId LONG,statusDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table nyyou_NYUUserGroup";
	public static final String ORDER_BY_JPQL = " ORDER BY nyuUserGroup.userGroupId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_NYUUserGroup.userGroupId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.NYUUserGroup"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.NYUUserGroup"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nyu.model.NYUUserGroup"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long GROUPPRIVACY_COLUMN_BITMASK = 4L;
	public static long STATUS_COLUMN_BITMASK = 8L;
	public static long UUID_COLUMN_BITMASK = 16L;
	public static long USERGROUPID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.NYUUserGroup"));

	public NYUUserGroupModelImpl() {
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
	public Class<?> getModelClass() {
		return NYUUserGroup.class;
	}

	@Override
	public String getModelClassName() {
		return NYUUserGroup.class.getName();
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
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getUserGroupId() {
		return _userGroupId;
	}

	@Override
	public void setUserGroupId(long userGroupId) {
		_userGroupId = userGroupId;
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
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public String getGroupPrivacy() {
		if (_groupPrivacy == null) {
			return StringPool.BLANK;
		}
		else {
			return _groupPrivacy;
		}
	}

	@Override
	public void setGroupPrivacy(String groupPrivacy) {
		_columnBitmask |= GROUPPRIVACY_COLUMN_BITMASK;

		if (_originalGroupPrivacy == null) {
			_originalGroupPrivacy = _groupPrivacy;
		}

		_groupPrivacy = groupPrivacy;
	}

	public String getOriginalGroupPrivacy() {
		return GetterUtil.getString(_originalGroupPrivacy);
	}

	@Override
	public String getAppreciatedUserIds() {
		if (_appreciatedUserIds == null) {
			return StringPool.BLANK;
		}
		else {
			return _appreciatedUserIds;
		}
	}

	@Override
	public void setAppreciatedUserIds(String appreciatedUserIds) {
		_appreciatedUserIds = appreciatedUserIds;
	}

	@Override
	public long getAppreciateCount() {
		return _appreciateCount;
	}

	@Override
	public void setAppreciateCount(long appreciateCount) {
		_appreciateCount = appreciateCount;
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
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	@Override
	public Date getUpdatedDate() {
		return _updatedDate;
	}

	@Override
	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;
	}

	@Override
	public long getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	@Override
	public String getAdministrators() {
		if (_administrators == null) {
			return StringPool.BLANK;
		}
		else {
			return _administrators;
		}
	}

	@Override
	public void setAdministrators(String administrators) {
		_administrators = administrators;
	}

	@Override
	public String getAbout() {
		if (_about == null) {
			return StringPool.BLANK;
		}
		else {
			return _about;
		}
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

	@JSON
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

		setAbout(LocalizationUtil.updateLocalization(aboutMap, getAbout(),
				"About", LocaleUtil.toLanguageId(defaultLocale)));
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
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

	@JSON
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

		setTitle(LocalizationUtil.updateLocalization(titleMap, getTitle(),
				"Title", LocaleUtil.toLanguageId(defaultLocale)));
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
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
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			NYUUserGroup.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
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
		if (_escapedModel == null) {
			_escapedModel = (NYUUserGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		NYUUserGroupImpl nyuUserGroupImpl = new NYUUserGroupImpl();

		nyuUserGroupImpl.setUuid(getUuid());
		nyuUserGroupImpl.setUserGroupId(getUserGroupId());
		nyuUserGroupImpl.setCompanyId(getCompanyId());
		nyuUserGroupImpl.setGroupId(getGroupId());
		nyuUserGroupImpl.setGroupPrivacy(getGroupPrivacy());
		nyuUserGroupImpl.setAppreciatedUserIds(getAppreciatedUserIds());
		nyuUserGroupImpl.setAppreciateCount(getAppreciateCount());
		nyuUserGroupImpl.setCreatedDate(getCreatedDate());
		nyuUserGroupImpl.setCreatedBy(getCreatedBy());
		nyuUserGroupImpl.setUpdatedDate(getUpdatedDate());
		nyuUserGroupImpl.setUpdatedBy(getUpdatedBy());
		nyuUserGroupImpl.setAdministrators(getAdministrators());
		nyuUserGroupImpl.setAbout(getAbout());
		nyuUserGroupImpl.setTitle(getTitle());
		nyuUserGroupImpl.setStatus(getStatus());
		nyuUserGroupImpl.setStatusByUserId(getStatusByUserId());
		nyuUserGroupImpl.setStatusDate(getStatusDate());

		nyuUserGroupImpl.resetOriginalValues();

		return nyuUserGroupImpl;
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

		if (!(obj instanceof NYUUserGroup)) {
			return false;
		}

		NYUUserGroup nyuUserGroup = (NYUUserGroup)obj;

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
	public void resetOriginalValues() {
		NYUUserGroupModelImpl nyuUserGroupModelImpl = this;

		nyuUserGroupModelImpl._originalUuid = nyuUserGroupModelImpl._uuid;

		nyuUserGroupModelImpl._originalCompanyId = nyuUserGroupModelImpl._companyId;

		nyuUserGroupModelImpl._setOriginalCompanyId = false;

		nyuUserGroupModelImpl._originalGroupId = nyuUserGroupModelImpl._groupId;

		nyuUserGroupModelImpl._setOriginalGroupId = false;

		nyuUserGroupModelImpl._originalGroupPrivacy = nyuUserGroupModelImpl._groupPrivacy;

		nyuUserGroupModelImpl._originalStatus = nyuUserGroupModelImpl._status;

		nyuUserGroupModelImpl._setOriginalStatus = false;

		nyuUserGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<NYUUserGroup> toCacheModel() {
		NYUUserGroupCacheModel nyuUserGroupCacheModel = new NYUUserGroupCacheModel();

		nyuUserGroupCacheModel.uuid = getUuid();

		String uuid = nyuUserGroupCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			nyuUserGroupCacheModel.uuid = null;
		}

		nyuUserGroupCacheModel.userGroupId = getUserGroupId();

		nyuUserGroupCacheModel.companyId = getCompanyId();

		nyuUserGroupCacheModel.groupId = getGroupId();

		nyuUserGroupCacheModel.groupPrivacy = getGroupPrivacy();

		String groupPrivacy = nyuUserGroupCacheModel.groupPrivacy;

		if ((groupPrivacy != null) && (groupPrivacy.length() == 0)) {
			nyuUserGroupCacheModel.groupPrivacy = null;
		}

		nyuUserGroupCacheModel.appreciatedUserIds = getAppreciatedUserIds();

		String appreciatedUserIds = nyuUserGroupCacheModel.appreciatedUserIds;

		if ((appreciatedUserIds != null) && (appreciatedUserIds.length() == 0)) {
			nyuUserGroupCacheModel.appreciatedUserIds = null;
		}

		nyuUserGroupCacheModel.appreciateCount = getAppreciateCount();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			nyuUserGroupCacheModel.createdDate = createdDate.getTime();
		}
		else {
			nyuUserGroupCacheModel.createdDate = Long.MIN_VALUE;
		}

		nyuUserGroupCacheModel.createdBy = getCreatedBy();

		Date updatedDate = getUpdatedDate();

		if (updatedDate != null) {
			nyuUserGroupCacheModel.updatedDate = updatedDate.getTime();
		}
		else {
			nyuUserGroupCacheModel.updatedDate = Long.MIN_VALUE;
		}

		nyuUserGroupCacheModel.updatedBy = getUpdatedBy();

		nyuUserGroupCacheModel.administrators = getAdministrators();

		String administrators = nyuUserGroupCacheModel.administrators;

		if ((administrators != null) && (administrators.length() == 0)) {
			nyuUserGroupCacheModel.administrators = null;
		}

		nyuUserGroupCacheModel.about = getAbout();

		String about = nyuUserGroupCacheModel.about;

		if ((about != null) && (about.length() == 0)) {
			nyuUserGroupCacheModel.about = null;
		}

		nyuUserGroupCacheModel.title = getTitle();

		String title = nyuUserGroupCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			nyuUserGroupCacheModel.title = null;
		}

		nyuUserGroupCacheModel.status = getStatus();

		nyuUserGroupCacheModel.statusByUserId = getStatusByUserId();

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			nyuUserGroupCacheModel.statusDate = statusDate.getTime();
		}
		else {
			nyuUserGroupCacheModel.statusDate = Long.MIN_VALUE;
		}

		return nyuUserGroupCacheModel;
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

	private static ClassLoader _classLoader = NYUUserGroup.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			NYUUserGroup.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _userGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _groupPrivacy;
	private String _originalGroupPrivacy;
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
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private Date _statusDate;
	private long _columnBitmask;
	private NYUUserGroup _escapedModel;
}