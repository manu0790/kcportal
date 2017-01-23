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

import com.nyu.service.ClpSerializer;
import com.nyu.service.UserGroupRequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class UserGroupRequestClp extends BaseModelImpl<UserGroupRequest>
	implements UserGroupRequest {
	public UserGroupRequestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserGroupRequest.class;
	}

	@Override
	public String getModelClassName() {
		return UserGroupRequest.class.getName();
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
		attributes.put("userGroupId", getUserGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userGroupOwner", getUserGroupOwner());
		attributes.put("requestDate", getRequestDate());
		attributes.put("requestedBy", getRequestedBy());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Long userGroupOwner = (Long)attributes.get("userGroupOwner");

		if (userGroupOwner != null) {
			setUserGroupOwner(userGroupOwner);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Long requestedBy = (Long)attributes.get("requestedBy");

		if (requestedBy != null) {
			setRequestedBy(requestedBy);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_userGroupRequestRemoteModel, id);
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

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserGroupId", long.class);

				method.invoke(_userGroupRequestRemoteModel, userGroupId);
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

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_userGroupRequestRemoteModel, companyId);
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

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_userGroupRequestRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserGroupOwner() {
		return _userGroupOwner;
	}

	@Override
	public void setUserGroupOwner(long userGroupOwner) {
		_userGroupOwner = userGroupOwner;

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserGroupOwner", long.class);

				method.invoke(_userGroupRequestRemoteModel, userGroupOwner);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestDate() {
		return _requestDate;
	}

	@Override
	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestDate", Date.class);

				method.invoke(_userGroupRequestRemoteModel, requestDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRequestedBy() {
		return _requestedBy;
	}

	@Override
	public void setRequestedBy(long requestedBy) {
		_requestedBy = requestedBy;

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedBy", long.class);

				method.invoke(_userGroupRequestRemoteModel, requestedBy);
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

		if (_userGroupRequestRemoteModel != null) {
			try {
				Class<?> clazz = _userGroupRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_userGroupRequestRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserGroupRequestRemoteModel() {
		return _userGroupRequestRemoteModel;
	}

	public void setUserGroupRequestRemoteModel(
		BaseModel<?> userGroupRequestRemoteModel) {
		_userGroupRequestRemoteModel = userGroupRequestRemoteModel;
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

		Class<?> remoteModelClass = _userGroupRequestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userGroupRequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserGroupRequestLocalServiceUtil.addUserGroupRequest(this);
		}
		else {
			UserGroupRequestLocalServiceUtil.updateUserGroupRequest(this);
		}
	}

	@Override
	public UserGroupRequest toEscapedModel() {
		return (UserGroupRequest)ProxyUtil.newProxyInstance(UserGroupRequest.class.getClassLoader(),
			new Class[] { UserGroupRequest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserGroupRequestClp clone = new UserGroupRequestClp();

		clone.setId(getId());
		clone.setUserGroupId(getUserGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserGroupOwner(getUserGroupOwner());
		clone.setRequestDate(getRequestDate());
		clone.setRequestedBy(getRequestedBy());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(UserGroupRequest userGroupRequest) {
		long primaryKey = userGroupRequest.getPrimaryKey();

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

		if (!(obj instanceof UserGroupRequestClp)) {
			return false;
		}

		UserGroupRequestClp userGroupRequest = (UserGroupRequestClp)obj;

		long primaryKey = userGroupRequest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userGroupId=");
		sb.append(getUserGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userGroupOwner=");
		sb.append(getUserGroupOwner());
		sb.append(", requestDate=");
		sb.append(getRequestDate());
		sb.append(", requestedBy=");
		sb.append(getRequestedBy());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.UserGroupRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>userGroupOwner</column-name><column-value><![CDATA[");
		sb.append(getUserGroupOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDate</column-name><column-value><![CDATA[");
		sb.append(getRequestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedBy</column-name><column-value><![CDATA[");
		sb.append(getRequestedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userGroupId;
	private long _companyId;
	private long _groupId;
	private long _userGroupOwner;
	private Date _requestDate;
	private long _requestedBy;
	private String _status;
	private BaseModel<?> _userGroupRequestRemoteModel;
}