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

import com.nyu.service.BasnoLocalServiceUtil;
import com.nyu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class BasnoClp extends BaseModelImpl<Basno> implements Basno {
	public BasnoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Basno.class;
	}

	@Override
	public String getModelClassName() {
		return Basno.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _badgeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBadgeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _badgeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("badgeId", getBadgeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("badgeName", getBadgeName());
		attributes.put("badgeUrl", getBadgeUrl());
		attributes.put("description", getDescription());
		attributes.put("targetPoints", getTargetPoints());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long badgeId = (Long)attributes.get("badgeId");

		if (badgeId != null) {
			setBadgeId(badgeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String badgeName = (String)attributes.get("badgeName");

		if (badgeName != null) {
			setBadgeName(badgeName);
		}

		String badgeUrl = (String)attributes.get("badgeUrl");

		if (badgeUrl != null) {
			setBadgeUrl(badgeUrl);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long targetPoints = (Long)attributes.get("targetPoints");

		if (targetPoints != null) {
			setTargetPoints(targetPoints);
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
	}

	@Override
	public long getBadgeId() {
		return _badgeId;
	}

	@Override
	public void setBadgeId(long badgeId) {
		_badgeId = badgeId;

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setBadgeId", long.class);

				method.invoke(_basnoRemoteModel, badgeId);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_basnoRemoteModel, companyId);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_basnoRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBadgeName() {
		return _badgeName;
	}

	@Override
	public void setBadgeName(String badgeName) {
		_badgeName = badgeName;

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setBadgeName", String.class);

				method.invoke(_basnoRemoteModel, badgeName);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setBadgeUrl", String.class);

				method.invoke(_basnoRemoteModel, badgeUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_basnoRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTargetPoints() {
		return _targetPoints;
	}

	@Override
	public void setTargetPoints(long targetPoints) {
		_targetPoints = targetPoints;

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setTargetPoints", long.class);

				method.invoke(_basnoRemoteModel, targetPoints);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_basnoRemoteModel, createdDate);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_basnoRemoteModel, createdBy);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedDate", Date.class);

				method.invoke(_basnoRemoteModel, updatedDate);
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

		if (_basnoRemoteModel != null) {
			try {
				Class<?> clazz = _basnoRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_basnoRemoteModel, updatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBasnoRemoteModel() {
		return _basnoRemoteModel;
	}

	public void setBasnoRemoteModel(BaseModel<?> basnoRemoteModel) {
		_basnoRemoteModel = basnoRemoteModel;
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

		Class<?> remoteModelClass = _basnoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_basnoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BasnoLocalServiceUtil.addBasno(this);
		}
		else {
			BasnoLocalServiceUtil.updateBasno(this);
		}
	}

	@Override
	public Basno toEscapedModel() {
		return (Basno)ProxyUtil.newProxyInstance(Basno.class.getClassLoader(),
			new Class[] { Basno.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BasnoClp clone = new BasnoClp();

		clone.setBadgeId(getBadgeId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setBadgeName(getBadgeName());
		clone.setBadgeUrl(getBadgeUrl());
		clone.setDescription(getDescription());
		clone.setTargetPoints(getTargetPoints());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedDate(getUpdatedDate());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	@Override
	public int compareTo(Basno basno) {
		long primaryKey = basno.getPrimaryKey();

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

		if (!(obj instanceof BasnoClp)) {
			return false;
		}

		BasnoClp basno = (BasnoClp)obj;

		long primaryKey = basno.getPrimaryKey();

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

		sb.append("{badgeId=");
		sb.append(getBadgeId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", badgeName=");
		sb.append(getBadgeName());
		sb.append(", badgeUrl=");
		sb.append(getBadgeUrl());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", targetPoints=");
		sb.append(getTargetPoints());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedDate=");
		sb.append(getUpdatedDate());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.Basno");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>badgeId</column-name><column-value><![CDATA[");
		sb.append(getBadgeId());
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
			"<column><column-name>badgeName</column-name><column-value><![CDATA[");
		sb.append(getBadgeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>badgeUrl</column-name><column-value><![CDATA[");
		sb.append(getBadgeUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>targetPoints</column-name><column-value><![CDATA[");
		sb.append(getTargetPoints());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _badgeId;
	private long _companyId;
	private long _groupId;
	private String _badgeName;
	private String _badgeUrl;
	private String _description;
	private long _targetPoints;
	private Date _createdDate;
	private long _createdBy;
	private Date _updatedDate;
	private long _updatedBy;
	private BaseModel<?> _basnoRemoteModel;
}