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
import com.nyu.service.LessonCollaborationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class LessonCollaborationClp extends BaseModelImpl<LessonCollaboration>
	implements LessonCollaboration {
	public LessonCollaborationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LessonCollaboration.class;
	}

	@Override
	public String getModelClassName() {
		return LessonCollaboration.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("lessonId", getLessonId());
		attributes.put("userId", getUserId());
		attributes.put("memberStatus", getMemberStatus());
		attributes.put("type", getType());
		attributes.put("accessPermission", getAccessPermission());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String memberStatus = (String)attributes.get("memberStatus");

		if (memberStatus != null) {
			setMemberStatus(memberStatus);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String accessPermission = (String)attributes.get("accessPermission");

		if (accessPermission != null) {
			setAccessPermission(accessPermission);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_lessonCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _lessonCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_lessonCollaborationRemoteModel, id);
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

		if (_lessonCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _lessonCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_lessonCollaborationRemoteModel, lessonId);
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

		if (_lessonCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _lessonCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_lessonCollaborationRemoteModel, userId);
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
	public String getMemberStatus() {
		return _memberStatus;
	}

	@Override
	public void setMemberStatus(String memberStatus) {
		_memberStatus = memberStatus;

		if (_lessonCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _lessonCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setMemberStatus", String.class);

				method.invoke(_lessonCollaborationRemoteModel, memberStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_lessonCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _lessonCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_lessonCollaborationRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccessPermission() {
		return _accessPermission;
	}

	@Override
	public void setAccessPermission(String accessPermission) {
		_accessPermission = accessPermission;

		if (_lessonCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _lessonCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setAccessPermission",
						String.class);

				method.invoke(_lessonCollaborationRemoteModel, accessPermission);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLessonCollaborationRemoteModel() {
		return _lessonCollaborationRemoteModel;
	}

	public void setLessonCollaborationRemoteModel(
		BaseModel<?> lessonCollaborationRemoteModel) {
		_lessonCollaborationRemoteModel = lessonCollaborationRemoteModel;
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

		Class<?> remoteModelClass = _lessonCollaborationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lessonCollaborationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LessonCollaborationLocalServiceUtil.addLessonCollaboration(this);
		}
		else {
			LessonCollaborationLocalServiceUtil.updateLessonCollaboration(this);
		}
	}

	@Override
	public LessonCollaboration toEscapedModel() {
		return (LessonCollaboration)ProxyUtil.newProxyInstance(LessonCollaboration.class.getClassLoader(),
			new Class[] { LessonCollaboration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LessonCollaborationClp clone = new LessonCollaborationClp();

		clone.setId(getId());
		clone.setLessonId(getLessonId());
		clone.setUserId(getUserId());
		clone.setMemberStatus(getMemberStatus());
		clone.setType(getType());
		clone.setAccessPermission(getAccessPermission());

		return clone;
	}

	@Override
	public int compareTo(LessonCollaboration lessonCollaboration) {
		long primaryKey = lessonCollaboration.getPrimaryKey();

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

		if (!(obj instanceof LessonCollaborationClp)) {
			return false;
		}

		LessonCollaborationClp lessonCollaboration = (LessonCollaborationClp)obj;

		long primaryKey = lessonCollaboration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", lessonId=");
		sb.append(getLessonId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", memberStatus=");
		sb.append(getMemberStatus());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", accessPermission=");
		sb.append(getAccessPermission());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.LessonCollaboration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>memberStatus</column-name><column-value><![CDATA[");
		sb.append(getMemberStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessPermission</column-name><column-value><![CDATA[");
		sb.append(getAccessPermission());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _lessonId;
	private long _userId;
	private String _userUuid;
	private String _memberStatus;
	private String _type;
	private String _accessPermission;
	private BaseModel<?> _lessonCollaborationRemoteModel;
}