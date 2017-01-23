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
 * This class is a wrapper for {@link UserBadges}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserBadges
 * @generated
 */
public class UserBadgesWrapper implements UserBadges, ModelWrapper<UserBadges> {
	public UserBadgesWrapper(UserBadges userBadges) {
		_userBadges = userBadges;
	}

	@Override
	public Class<?> getModelClass() {
		return UserBadges.class;
	}

	@Override
	public String getModelClassName() {
		return UserBadges.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userBadgeId", getUserBadgeId());
		attributes.put("userId", getUserId());
		attributes.put("badgeId", getBadgeId());
		attributes.put("badgeUrl", getBadgeUrl());
		attributes.put("createdDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userBadgeId = (Long)attributes.get("userBadgeId");

		if (userBadgeId != null) {
			setUserBadgeId(userBadgeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long badgeId = (Long)attributes.get("badgeId");

		if (badgeId != null) {
			setBadgeId(badgeId);
		}

		String badgeUrl = (String)attributes.get("badgeUrl");

		if (badgeUrl != null) {
			setBadgeUrl(badgeUrl);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}
	}

	/**
	* Returns the primary key of this user badges.
	*
	* @return the primary key of this user badges
	*/
	@Override
	public long getPrimaryKey() {
		return _userBadges.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user badges.
	*
	* @param primaryKey the primary key of this user badges
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userBadges.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user badge ID of this user badges.
	*
	* @return the user badge ID of this user badges
	*/
	@Override
	public long getUserBadgeId() {
		return _userBadges.getUserBadgeId();
	}

	/**
	* Sets the user badge ID of this user badges.
	*
	* @param userBadgeId the user badge ID of this user badges
	*/
	@Override
	public void setUserBadgeId(long userBadgeId) {
		_userBadges.setUserBadgeId(userBadgeId);
	}

	/**
	* Returns the user ID of this user badges.
	*
	* @return the user ID of this user badges
	*/
	@Override
	public long getUserId() {
		return _userBadges.getUserId();
	}

	/**
	* Sets the user ID of this user badges.
	*
	* @param userId the user ID of this user badges
	*/
	@Override
	public void setUserId(long userId) {
		_userBadges.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user badges.
	*
	* @return the user uuid of this user badges
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadges.getUserUuid();
	}

	/**
	* Sets the user uuid of this user badges.
	*
	* @param userUuid the user uuid of this user badges
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userBadges.setUserUuid(userUuid);
	}

	/**
	* Returns the badge ID of this user badges.
	*
	* @return the badge ID of this user badges
	*/
	@Override
	public long getBadgeId() {
		return _userBadges.getBadgeId();
	}

	/**
	* Sets the badge ID of this user badges.
	*
	* @param badgeId the badge ID of this user badges
	*/
	@Override
	public void setBadgeId(long badgeId) {
		_userBadges.setBadgeId(badgeId);
	}

	/**
	* Returns the badge url of this user badges.
	*
	* @return the badge url of this user badges
	*/
	@Override
	public java.lang.String getBadgeUrl() {
		return _userBadges.getBadgeUrl();
	}

	/**
	* Sets the badge url of this user badges.
	*
	* @param badgeUrl the badge url of this user badges
	*/
	@Override
	public void setBadgeUrl(java.lang.String badgeUrl) {
		_userBadges.setBadgeUrl(badgeUrl);
	}

	/**
	* Returns the created date of this user badges.
	*
	* @return the created date of this user badges
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _userBadges.getCreatedDate();
	}

	/**
	* Sets the created date of this user badges.
	*
	* @param createdDate the created date of this user badges
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_userBadges.setCreatedDate(createdDate);
	}

	@Override
	public boolean isNew() {
		return _userBadges.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userBadges.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userBadges.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userBadges.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userBadges.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userBadges.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userBadges.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userBadges.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userBadges.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userBadges.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userBadges.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserBadgesWrapper((UserBadges)_userBadges.clone());
	}

	@Override
	public int compareTo(UserBadges userBadges) {
		return _userBadges.compareTo(userBadges);
	}

	@Override
	public int hashCode() {
		return _userBadges.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<UserBadges> toCacheModel() {
		return _userBadges.toCacheModel();
	}

	@Override
	public UserBadges toEscapedModel() {
		return new UserBadgesWrapper(_userBadges.toEscapedModel());
	}

	@Override
	public UserBadges toUnescapedModel() {
		return new UserBadgesWrapper(_userBadges.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userBadges.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userBadges.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userBadges.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserBadgesWrapper)) {
			return false;
		}

		UserBadgesWrapper userBadgesWrapper = (UserBadgesWrapper)obj;

		if (Validator.equals(_userBadges, userBadgesWrapper._userBadges)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserBadges getWrappedUserBadges() {
		return _userBadges;
	}

	@Override
	public UserBadges getWrappedModel() {
		return _userBadges;
	}

	@Override
	public void resetOriginalValues() {
		_userBadges.resetOriginalValues();
	}

	private UserBadges _userBadges;
}