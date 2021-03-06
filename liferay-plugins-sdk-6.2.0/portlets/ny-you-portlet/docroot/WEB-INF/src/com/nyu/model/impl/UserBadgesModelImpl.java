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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.nyu.model.UserBadges;
import com.nyu.model.UserBadgesModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserBadges service. Represents a row in the &quot;nyyou_UserBadges&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.UserBadgesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserBadgesImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserBadgesImpl
 * @see com.nyu.model.UserBadges
 * @see com.nyu.model.UserBadgesModel
 * @generated
 */
public class UserBadgesModelImpl extends BaseModelImpl<UserBadges>
	implements UserBadgesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user badges model instance should use the {@link com.nyu.model.UserBadges} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_UserBadges";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userBadgeId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "badgeId", Types.BIGINT },
			{ "badgeUrl", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_UserBadges (userBadgeId LONG not null primary key IDENTITY,userId LONG,badgeId LONG,badgeUrl VARCHAR(75) null,createdDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table nyyou_UserBadges";
	public static final String ORDER_BY_JPQL = " ORDER BY userBadges.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_UserBadges.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.UserBadges"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.UserBadges"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nyu.model.UserBadges"),
			true);
	public static long BADGEID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long CREATEDDATE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.UserBadges"));

	public UserBadgesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userBadgeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserBadgeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userBadgeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getUserBadgeId() {
		return _userBadgeId;
	}

	@Override
	public void setUserBadgeId(long userBadgeId) {
		_userBadgeId = userBadgeId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getBadgeId() {
		return _badgeId;
	}

	@Override
	public void setBadgeId(long badgeId) {
		_columnBitmask |= BADGEID_COLUMN_BITMASK;

		if (!_setOriginalBadgeId) {
			_setOriginalBadgeId = true;

			_originalBadgeId = _badgeId;
		}

		_badgeId = badgeId;
	}

	public long getOriginalBadgeId() {
		return _originalBadgeId;
	}

	@Override
	public String getBadgeUrl() {
		if (_badgeUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _badgeUrl;
		}
	}

	@Override
	public void setBadgeUrl(String badgeUrl) {
		_badgeUrl = badgeUrl;
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_columnBitmask = -1L;

		_createdDate = createdDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			UserBadges.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserBadges toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserBadges)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserBadgesImpl userBadgesImpl = new UserBadgesImpl();

		userBadgesImpl.setUserBadgeId(getUserBadgeId());
		userBadgesImpl.setUserId(getUserId());
		userBadgesImpl.setBadgeId(getBadgeId());
		userBadgesImpl.setBadgeUrl(getBadgeUrl());
		userBadgesImpl.setCreatedDate(getCreatedDate());

		userBadgesImpl.resetOriginalValues();

		return userBadgesImpl;
	}

	@Override
	public int compareTo(UserBadges userBadges) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), userBadges.getCreatedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserBadges)) {
			return false;
		}

		UserBadges userBadges = (UserBadges)obj;

		long primaryKey = userBadges.getPrimaryKey();

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
		UserBadgesModelImpl userBadgesModelImpl = this;

		userBadgesModelImpl._originalUserId = userBadgesModelImpl._userId;

		userBadgesModelImpl._setOriginalUserId = false;

		userBadgesModelImpl._originalBadgeId = userBadgesModelImpl._badgeId;

		userBadgesModelImpl._setOriginalBadgeId = false;

		userBadgesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserBadges> toCacheModel() {
		UserBadgesCacheModel userBadgesCacheModel = new UserBadgesCacheModel();

		userBadgesCacheModel.userBadgeId = getUserBadgeId();

		userBadgesCacheModel.userId = getUserId();

		userBadgesCacheModel.badgeId = getBadgeId();

		userBadgesCacheModel.badgeUrl = getBadgeUrl();

		String badgeUrl = userBadgesCacheModel.badgeUrl;

		if ((badgeUrl != null) && (badgeUrl.length() == 0)) {
			userBadgesCacheModel.badgeUrl = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			userBadgesCacheModel.createdDate = createdDate.getTime();
		}
		else {
			userBadgesCacheModel.createdDate = Long.MIN_VALUE;
		}

		return userBadgesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{userBadgeId=");
		sb.append(getUserBadgeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", badgeId=");
		sb.append(getBadgeId());
		sb.append(", badgeUrl=");
		sb.append(getBadgeUrl());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.UserBadges");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userBadgeId</column-name><column-value><![CDATA[");
		sb.append(getUserBadgeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>badgeId</column-name><column-value><![CDATA[");
		sb.append(getBadgeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>badgeUrl</column-name><column-value><![CDATA[");
		sb.append(getBadgeUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserBadges.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserBadges.class
		};
	private long _userBadgeId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _badgeId;
	private long _originalBadgeId;
	private boolean _setOriginalBadgeId;
	private String _badgeUrl;
	private Date _createdDate;
	private long _columnBitmask;
	private UserBadges _escapedModel;
}