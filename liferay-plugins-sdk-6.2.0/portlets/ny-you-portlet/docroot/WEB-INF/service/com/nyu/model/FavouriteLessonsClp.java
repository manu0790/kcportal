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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.nyu.service.ClpSerializer;
import com.nyu.service.FavouriteLessonsLocalServiceUtil;
import com.nyu.service.persistence.FavouriteLessonsPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class FavouriteLessonsClp extends BaseModelImpl<FavouriteLessons>
	implements FavouriteLessons {
	public FavouriteLessonsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FavouriteLessons.class;
	}

	@Override
	public String getModelClassName() {
		return FavouriteLessons.class.getName();
	}

	@Override
	public FavouriteLessonsPK getPrimaryKey() {
		return new FavouriteLessonsPK(_userId, _lessonId);
	}

	@Override
	public void setPrimaryKey(FavouriteLessonsPK primaryKey) {
		setUserId(primaryKey.userId);
		setLessonId(primaryKey.lessonId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new FavouriteLessonsPK(_userId, _lessonId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((FavouriteLessonsPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("lessonId", getLessonId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_favouriteLessonsRemoteModel != null) {
			try {
				Class<?> clazz = _favouriteLessonsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_favouriteLessonsRemoteModel, userId);
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
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_lessonId = lessonId;

		if (_favouriteLessonsRemoteModel != null) {
			try {
				Class<?> clazz = _favouriteLessonsRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_favouriteLessonsRemoteModel, lessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFavouriteLessonsRemoteModel() {
		return _favouriteLessonsRemoteModel;
	}

	public void setFavouriteLessonsRemoteModel(
		BaseModel<?> favouriteLessonsRemoteModel) {
		_favouriteLessonsRemoteModel = favouriteLessonsRemoteModel;
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

		Class<?> remoteModelClass = _favouriteLessonsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_favouriteLessonsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FavouriteLessonsLocalServiceUtil.addFavouriteLessons(this);
		}
		else {
			FavouriteLessonsLocalServiceUtil.updateFavouriteLessons(this);
		}
	}

	@Override
	public FavouriteLessons toEscapedModel() {
		return (FavouriteLessons)ProxyUtil.newProxyInstance(FavouriteLessons.class.getClassLoader(),
			new Class[] { FavouriteLessons.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FavouriteLessonsClp clone = new FavouriteLessonsClp();

		clone.setUserId(getUserId());
		clone.setLessonId(getLessonId());

		return clone;
	}

	@Override
	public int compareTo(FavouriteLessons favouriteLessons) {
		FavouriteLessonsPK primaryKey = favouriteLessons.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavouriteLessonsClp)) {
			return false;
		}

		FavouriteLessonsClp favouriteLessons = (FavouriteLessonsClp)obj;

		FavouriteLessonsPK primaryKey = favouriteLessons.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", lessonId=");
		sb.append(getLessonId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.FavouriteLessons");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
	private long _lessonId;
	private BaseModel<?> _favouriteLessonsRemoteModel;
}