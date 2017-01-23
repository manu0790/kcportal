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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.nyu.service.ClpSerializer;
import com.nyu.service.UserBadgesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class UserBadgesClp extends BaseModelImpl<UserBadges>
	implements UserBadges {
	public UserBadgesClp() {
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

		if (_userBadgesRemoteModel != null) {
			try {
				Class<?> clazz = _userBadgesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserBadgeId", long.class);

				method.invoke(_userBadgesRemoteModel, userBadgeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_userBadgesRemoteModel != null) {
			try {
				Class<?> clazz = _userBadgesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userBadgesRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getBadgeId() {
		return _badgeId;
	}

	@Override
	public void setBadgeId(long badgeId) {
		_badgeId = badgeId;

		if (_userBadgesRemoteModel != null) {
			try {
				Class<?> clazz = _userBadgesRemoteModel.getClass();

				Method method = clazz.getMethod("setBadgeId", long.class);

				method.invoke(_userBadgesRemoteModel, badgeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBadgeUrl() {
		return _badgeUrl;
	}

	@Override
	public void setBadgeUrl(String badgeUrl) {
		_badgeUrl = badgeUrl;

		if (_userBadgesRemoteModel != null) {
			try {
				Class<?> clazz = _userBadgesRemoteModel.getClass();

				Method method = clazz.getMethod("setBadgeUrl", String.class);

				method.invoke(_userBadgesRemoteModel, badgeUrl);
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

		if (_userBadgesRemoteModel != null) {
			try {
				Class<?> clazz = _userBadgesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_userBadgesRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserBadgesRemoteModel() {
		return _userBadgesRemoteModel;
	}

	public void setUserBadgesRemoteModel(BaseModel<?> userBadgesRemoteModel) {
		_userBadgesRemoteModel = userBadgesRemoteModel;
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

		Class<?> remoteModelClass = _userBadgesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userBadgesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserBadgesLocalServiceUtil.addUserBadges(this);
		}
		else {
			UserBadgesLocalServiceUtil.updateUserBadges(this);
		}
	}

	@Override
	public UserBadges toEscapedModel() {
		return (UserBadges)ProxyUtil.newProxyInstance(UserBadges.class.getClassLoader(),
			new Class[] { UserBadges.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserBadgesClp clone = new UserBadgesClp();

		clone.setUserBadgeId(getUserBadgeId());
		clone.setUserId(getUserId());
		clone.setBadgeId(getBadgeId());
		clone.setBadgeUrl(getBadgeUrl());
		clone.setCreatedDate(getCreatedDate());

		return clone;
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

		if (!(obj instanceof UserBadgesClp)) {
			return false;
		}

		UserBadgesClp userBadges = (UserBadgesClp)obj;

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

	private long _userBadgeId;
	private long _userId;
	private String _userUuid;
	private long _badgeId;
	private String _badgeUrl;
	private Date _createdDate;
	private BaseModel<?> _userBadgesRemoteModel;
}