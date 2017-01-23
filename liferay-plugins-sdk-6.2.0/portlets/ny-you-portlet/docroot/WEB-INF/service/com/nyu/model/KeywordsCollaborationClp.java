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
import com.nyu.service.KeywordsCollaborationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class KeywordsCollaborationClp extends BaseModelImpl<KeywordsCollaboration>
	implements KeywordsCollaboration {
	public KeywordsCollaborationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KeywordsCollaboration.class;
	}

	@Override
	public String getModelClassName() {
		return KeywordsCollaboration.class.getName();
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
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("keywordId", getKeywordId());
		attributes.put("keywordName", getKeywordName());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("status", getStatus());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("markAs", getMarkAs());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long keywordId = (Long)attributes.get("keywordId");

		if (keywordId != null) {
			setKeywordId(keywordId);
		}

		String keywordName = (String)attributes.get("keywordName");

		if (keywordName != null) {
			setKeywordName(keywordName);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String markAs = (String)attributes.get("markAs");

		if (markAs != null) {
			setMarkAs(markAs);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_keywordsCollaborationRemoteModel, id);
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

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_keywordsCollaborationRemoteModel, companyId);
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

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_keywordsCollaborationRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKeywordId() {
		return _keywordId;
	}

	@Override
	public void setKeywordId(long keywordId) {
		_keywordId = keywordId;

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setKeywordId", long.class);

				method.invoke(_keywordsCollaborationRemoteModel, keywordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeywordName() {
		return _keywordName;
	}

	@Override
	public void setKeywordName(String keywordName) {
		_keywordName = keywordName;

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setKeywordName", String.class);

				method.invoke(_keywordsCollaborationRemoteModel, keywordName);
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

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_keywordsCollaborationRemoteModel, userId);
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
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_keywordsCollaborationRemoteModel, userName);
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

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_keywordsCollaborationRemoteModel, status);
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

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_keywordsCollaborationRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_keywordsCollaborationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarkAs() {
		return _markAs;
	}

	@Override
	public void setMarkAs(String markAs) {
		_markAs = markAs;

		if (_keywordsCollaborationRemoteModel != null) {
			try {
				Class<?> clazz = _keywordsCollaborationRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkAs", String.class);

				method.invoke(_keywordsCollaborationRemoteModel, markAs);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKeywordsCollaborationRemoteModel() {
		return _keywordsCollaborationRemoteModel;
	}

	public void setKeywordsCollaborationRemoteModel(
		BaseModel<?> keywordsCollaborationRemoteModel) {
		_keywordsCollaborationRemoteModel = keywordsCollaborationRemoteModel;
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

		Class<?> remoteModelClass = _keywordsCollaborationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_keywordsCollaborationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KeywordsCollaborationLocalServiceUtil.addKeywordsCollaboration(this);
		}
		else {
			KeywordsCollaborationLocalServiceUtil.updateKeywordsCollaboration(this);
		}
	}

	@Override
	public KeywordsCollaboration toEscapedModel() {
		return (KeywordsCollaboration)ProxyUtil.newProxyInstance(KeywordsCollaboration.class.getClassLoader(),
			new Class[] { KeywordsCollaboration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KeywordsCollaborationClp clone = new KeywordsCollaborationClp();

		clone.setId(getId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setKeywordId(getKeywordId());
		clone.setKeywordName(getKeywordName());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setStatus(getStatus());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setMarkAs(getMarkAs());

		return clone;
	}

	@Override
	public int compareTo(KeywordsCollaboration keywordsCollaboration) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				keywordsCollaboration.getCreatedDate());

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

		if (!(obj instanceof KeywordsCollaborationClp)) {
			return false;
		}

		KeywordsCollaborationClp keywordsCollaboration = (KeywordsCollaborationClp)obj;

		long primaryKey = keywordsCollaboration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", keywordId=");
		sb.append(getKeywordId());
		sb.append(", keywordName=");
		sb.append(getKeywordName());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", markAs=");
		sb.append(getMarkAs());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.KeywordsCollaboration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>keywordId</column-name><column-value><![CDATA[");
		sb.append(getKeywordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keywordName</column-name><column-value><![CDATA[");
		sb.append(getKeywordName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAs</column-name><column-value><![CDATA[");
		sb.append(getMarkAs());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _companyId;
	private long _groupId;
	private long _keywordId;
	private String _keywordName;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private String _status;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _markAs;
	private BaseModel<?> _keywordsCollaborationRemoteModel;
}