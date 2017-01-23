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
 * This class is a wrapper for {@link NYUUserGroup}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroup
 * @generated
 */
public class NYUUserGroupWrapper implements NYUUserGroup,
	ModelWrapper<NYUUserGroup> {
	public NYUUserGroupWrapper(NYUUserGroup nyuUserGroup) {
		_nyuUserGroup = nyuUserGroup;
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

	/**
	* Returns the primary key of this n y u user group.
	*
	* @return the primary key of this n y u user group
	*/
	@Override
	public long getPrimaryKey() {
		return _nyuUserGroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this n y u user group.
	*
	* @param primaryKey the primary key of this n y u user group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nyuUserGroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this n y u user group.
	*
	* @return the uuid of this n y u user group
	*/
	@Override
	public java.lang.String getUuid() {
		return _nyuUserGroup.getUuid();
	}

	/**
	* Sets the uuid of this n y u user group.
	*
	* @param uuid the uuid of this n y u user group
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_nyuUserGroup.setUuid(uuid);
	}

	/**
	* Returns the user group ID of this n y u user group.
	*
	* @return the user group ID of this n y u user group
	*/
	@Override
	public long getUserGroupId() {
		return _nyuUserGroup.getUserGroupId();
	}

	/**
	* Sets the user group ID of this n y u user group.
	*
	* @param userGroupId the user group ID of this n y u user group
	*/
	@Override
	public void setUserGroupId(long userGroupId) {
		_nyuUserGroup.setUserGroupId(userGroupId);
	}

	/**
	* Returns the company ID of this n y u user group.
	*
	* @return the company ID of this n y u user group
	*/
	@Override
	public long getCompanyId() {
		return _nyuUserGroup.getCompanyId();
	}

	/**
	* Sets the company ID of this n y u user group.
	*
	* @param companyId the company ID of this n y u user group
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nyuUserGroup.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this n y u user group.
	*
	* @return the group ID of this n y u user group
	*/
	@Override
	public long getGroupId() {
		return _nyuUserGroup.getGroupId();
	}

	/**
	* Sets the group ID of this n y u user group.
	*
	* @param groupId the group ID of this n y u user group
	*/
	@Override
	public void setGroupId(long groupId) {
		_nyuUserGroup.setGroupId(groupId);
	}

	/**
	* Returns the group privacy of this n y u user group.
	*
	* @return the group privacy of this n y u user group
	*/
	@Override
	public java.lang.String getGroupPrivacy() {
		return _nyuUserGroup.getGroupPrivacy();
	}

	/**
	* Sets the group privacy of this n y u user group.
	*
	* @param groupPrivacy the group privacy of this n y u user group
	*/
	@Override
	public void setGroupPrivacy(java.lang.String groupPrivacy) {
		_nyuUserGroup.setGroupPrivacy(groupPrivacy);
	}

	/**
	* Returns the appreciated user IDs of this n y u user group.
	*
	* @return the appreciated user IDs of this n y u user group
	*/
	@Override
	public java.lang.String getAppreciatedUserIds() {
		return _nyuUserGroup.getAppreciatedUserIds();
	}

	/**
	* Sets the appreciated user IDs of this n y u user group.
	*
	* @param appreciatedUserIds the appreciated user IDs of this n y u user group
	*/
	@Override
	public void setAppreciatedUserIds(java.lang.String appreciatedUserIds) {
		_nyuUserGroup.setAppreciatedUserIds(appreciatedUserIds);
	}

	/**
	* Returns the appreciate count of this n y u user group.
	*
	* @return the appreciate count of this n y u user group
	*/
	@Override
	public long getAppreciateCount() {
		return _nyuUserGroup.getAppreciateCount();
	}

	/**
	* Sets the appreciate count of this n y u user group.
	*
	* @param appreciateCount the appreciate count of this n y u user group
	*/
	@Override
	public void setAppreciateCount(long appreciateCount) {
		_nyuUserGroup.setAppreciateCount(appreciateCount);
	}

	/**
	* Returns the created date of this n y u user group.
	*
	* @return the created date of this n y u user group
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _nyuUserGroup.getCreatedDate();
	}

	/**
	* Sets the created date of this n y u user group.
	*
	* @param createdDate the created date of this n y u user group
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_nyuUserGroup.setCreatedDate(createdDate);
	}

	/**
	* Returns the created by of this n y u user group.
	*
	* @return the created by of this n y u user group
	*/
	@Override
	public long getCreatedBy() {
		return _nyuUserGroup.getCreatedBy();
	}

	/**
	* Sets the created by of this n y u user group.
	*
	* @param createdBy the created by of this n y u user group
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_nyuUserGroup.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated date of this n y u user group.
	*
	* @return the updated date of this n y u user group
	*/
	@Override
	public java.util.Date getUpdatedDate() {
		return _nyuUserGroup.getUpdatedDate();
	}

	/**
	* Sets the updated date of this n y u user group.
	*
	* @param updatedDate the updated date of this n y u user group
	*/
	@Override
	public void setUpdatedDate(java.util.Date updatedDate) {
		_nyuUserGroup.setUpdatedDate(updatedDate);
	}

	/**
	* Returns the updated by of this n y u user group.
	*
	* @return the updated by of this n y u user group
	*/
	@Override
	public long getUpdatedBy() {
		return _nyuUserGroup.getUpdatedBy();
	}

	/**
	* Sets the updated by of this n y u user group.
	*
	* @param updatedBy the updated by of this n y u user group
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_nyuUserGroup.setUpdatedBy(updatedBy);
	}

	/**
	* Returns the administrators of this n y u user group.
	*
	* @return the administrators of this n y u user group
	*/
	@Override
	public java.lang.String getAdministrators() {
		return _nyuUserGroup.getAdministrators();
	}

	/**
	* Sets the administrators of this n y u user group.
	*
	* @param administrators the administrators of this n y u user group
	*/
	@Override
	public void setAdministrators(java.lang.String administrators) {
		_nyuUserGroup.setAdministrators(administrators);
	}

	/**
	* Returns the about of this n y u user group.
	*
	* @return the about of this n y u user group
	*/
	@Override
	public java.lang.String getAbout() {
		return _nyuUserGroup.getAbout();
	}

	/**
	* Returns the localized about of this n y u user group in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized about of this n y u user group
	*/
	@Override
	public java.lang.String getAbout(java.util.Locale locale) {
		return _nyuUserGroup.getAbout(locale);
	}

	/**
	* Returns the localized about of this n y u user group in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized about of this n y u user group. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getAbout(java.util.Locale locale, boolean useDefault) {
		return _nyuUserGroup.getAbout(locale, useDefault);
	}

	/**
	* Returns the localized about of this n y u user group in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized about of this n y u user group
	*/
	@Override
	public java.lang.String getAbout(java.lang.String languageId) {
		return _nyuUserGroup.getAbout(languageId);
	}

	/**
	* Returns the localized about of this n y u user group in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized about of this n y u user group
	*/
	@Override
	public java.lang.String getAbout(java.lang.String languageId,
		boolean useDefault) {
		return _nyuUserGroup.getAbout(languageId, useDefault);
	}

	@Override
	public java.lang.String getAboutCurrentLanguageId() {
		return _nyuUserGroup.getAboutCurrentLanguageId();
	}

	@Override
	public java.lang.String getAboutCurrentValue() {
		return _nyuUserGroup.getAboutCurrentValue();
	}

	/**
	* Returns a map of the locales and localized abouts of this n y u user group.
	*
	* @return the locales and localized abouts of this n y u user group
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getAboutMap() {
		return _nyuUserGroup.getAboutMap();
	}

	/**
	* Sets the about of this n y u user group.
	*
	* @param about the about of this n y u user group
	*/
	@Override
	public void setAbout(java.lang.String about) {
		_nyuUserGroup.setAbout(about);
	}

	/**
	* Sets the localized about of this n y u user group in the language.
	*
	* @param about the localized about of this n y u user group
	* @param locale the locale of the language
	*/
	@Override
	public void setAbout(java.lang.String about, java.util.Locale locale) {
		_nyuUserGroup.setAbout(about, locale);
	}

	/**
	* Sets the localized about of this n y u user group in the language, and sets the default locale.
	*
	* @param about the localized about of this n y u user group
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setAbout(java.lang.String about, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_nyuUserGroup.setAbout(about, locale, defaultLocale);
	}

	@Override
	public void setAboutCurrentLanguageId(java.lang.String languageId) {
		_nyuUserGroup.setAboutCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized abouts of this n y u user group from the map of locales and localized abouts.
	*
	* @param aboutMap the locales and localized abouts of this n y u user group
	*/
	@Override
	public void setAboutMap(
		java.util.Map<java.util.Locale, java.lang.String> aboutMap) {
		_nyuUserGroup.setAboutMap(aboutMap);
	}

	/**
	* Sets the localized abouts of this n y u user group from the map of locales and localized abouts, and sets the default locale.
	*
	* @param aboutMap the locales and localized abouts of this n y u user group
	* @param defaultLocale the default locale
	*/
	@Override
	public void setAboutMap(
		java.util.Map<java.util.Locale, java.lang.String> aboutMap,
		java.util.Locale defaultLocale) {
		_nyuUserGroup.setAboutMap(aboutMap, defaultLocale);
	}

	/**
	* Returns the title of this n y u user group.
	*
	* @return the title of this n y u user group
	*/
	@Override
	public java.lang.String getTitle() {
		return _nyuUserGroup.getTitle();
	}

	/**
	* Returns the localized title of this n y u user group in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized title of this n y u user group
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _nyuUserGroup.getTitle(locale);
	}

	/**
	* Returns the localized title of this n y u user group in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this n y u user group. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _nyuUserGroup.getTitle(locale, useDefault);
	}

	/**
	* Returns the localized title of this n y u user group in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized title of this n y u user group
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId) {
		return _nyuUserGroup.getTitle(languageId);
	}

	/**
	* Returns the localized title of this n y u user group in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this n y u user group
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _nyuUserGroup.getTitle(languageId, useDefault);
	}

	@Override
	public java.lang.String getTitleCurrentLanguageId() {
		return _nyuUserGroup.getTitleCurrentLanguageId();
	}

	@Override
	public java.lang.String getTitleCurrentValue() {
		return _nyuUserGroup.getTitleCurrentValue();
	}

	/**
	* Returns a map of the locales and localized titles of this n y u user group.
	*
	* @return the locales and localized titles of this n y u user group
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _nyuUserGroup.getTitleMap();
	}

	/**
	* Sets the title of this n y u user group.
	*
	* @param title the title of this n y u user group
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_nyuUserGroup.setTitle(title);
	}

	/**
	* Sets the localized title of this n y u user group in the language.
	*
	* @param title the localized title of this n y u user group
	* @param locale the locale of the language
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale) {
		_nyuUserGroup.setTitle(title, locale);
	}

	/**
	* Sets the localized title of this n y u user group in the language, and sets the default locale.
	*
	* @param title the localized title of this n y u user group
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_nyuUserGroup.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(java.lang.String languageId) {
		_nyuUserGroup.setTitleCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized titles of this n y u user group from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this n y u user group
	*/
	@Override
	public void setTitleMap(
		java.util.Map<java.util.Locale, java.lang.String> titleMap) {
		_nyuUserGroup.setTitleMap(titleMap);
	}

	/**
	* Sets the localized titles of this n y u user group from the map of locales and localized titles, and sets the default locale.
	*
	* @param titleMap the locales and localized titles of this n y u user group
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitleMap(
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Locale defaultLocale) {
		_nyuUserGroup.setTitleMap(titleMap, defaultLocale);
	}

	/**
	* Returns the status of this n y u user group.
	*
	* @return the status of this n y u user group
	*/
	@Override
	public int getStatus() {
		return _nyuUserGroup.getStatus();
	}

	/**
	* Sets the status of this n y u user group.
	*
	* @param status the status of this n y u user group
	*/
	@Override
	public void setStatus(int status) {
		_nyuUserGroup.setStatus(status);
	}

	/**
	* Returns the status by user ID of this n y u user group.
	*
	* @return the status by user ID of this n y u user group
	*/
	@Override
	public long getStatusByUserId() {
		return _nyuUserGroup.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this n y u user group.
	*
	* @param statusByUserId the status by user ID of this n y u user group
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_nyuUserGroup.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this n y u user group.
	*
	* @return the status by user uuid of this n y u user group
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroup.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this n y u user group.
	*
	* @param statusByUserUuid the status by user uuid of this n y u user group
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_nyuUserGroup.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status date of this n y u user group.
	*
	* @return the status date of this n y u user group
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _nyuUserGroup.getStatusDate();
	}

	/**
	* Sets the status date of this n y u user group.
	*
	* @param statusDate the status date of this n y u user group
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_nyuUserGroup.setStatusDate(statusDate);
	}

	@Override
	public boolean isNew() {
		return _nyuUserGroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nyuUserGroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nyuUserGroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nyuUserGroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nyuUserGroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nyuUserGroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nyuUserGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nyuUserGroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nyuUserGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nyuUserGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nyuUserGroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _nyuUserGroup.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _nyuUserGroup.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_nyuUserGroup.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_nyuUserGroup.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new NYUUserGroupWrapper((NYUUserGroup)_nyuUserGroup.clone());
	}

	@Override
	public int compareTo(com.nyu.model.NYUUserGroup nyuUserGroup) {
		return _nyuUserGroup.compareTo(nyuUserGroup);
	}

	@Override
	public int hashCode() {
		return _nyuUserGroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.NYUUserGroup> toCacheModel() {
		return _nyuUserGroup.toCacheModel();
	}

	@Override
	public com.nyu.model.NYUUserGroup toEscapedModel() {
		return new NYUUserGroupWrapper(_nyuUserGroup.toEscapedModel());
	}

	@Override
	public com.nyu.model.NYUUserGroup toUnescapedModel() {
		return new NYUUserGroupWrapper(_nyuUserGroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nyuUserGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nyuUserGroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nyuUserGroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NYUUserGroupWrapper)) {
			return false;
		}

		NYUUserGroupWrapper nyuUserGroupWrapper = (NYUUserGroupWrapper)obj;

		if (Validator.equals(_nyuUserGroup, nyuUserGroupWrapper._nyuUserGroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NYUUserGroup getWrappedNYUUserGroup() {
		return _nyuUserGroup;
	}

	@Override
	public NYUUserGroup getWrappedModel() {
		return _nyuUserGroup;
	}

	@Override
	public void resetOriginalValues() {
		_nyuUserGroup.resetOriginalValues();
	}

	private NYUUserGroup _nyuUserGroup;
}