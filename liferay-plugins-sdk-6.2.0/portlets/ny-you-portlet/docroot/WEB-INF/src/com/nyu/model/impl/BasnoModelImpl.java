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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.nyu.model.Basno;
import com.nyu.model.BasnoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Basno service. Represents a row in the &quot;nyyou_Basno&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.BasnoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BasnoImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see BasnoImpl
 * @see com.nyu.model.Basno
 * @see com.nyu.model.BasnoModel
 * @generated
 */
public class BasnoModelImpl extends BaseModelImpl<Basno> implements BasnoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a basno model instance should use the {@link com.nyu.model.Basno} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_Basno";
	public static final Object[][] TABLE_COLUMNS = {
			{ "badgeId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "badgeName", Types.VARCHAR },
			{ "badgeUrl", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "targetPoints", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdBy", Types.BIGINT },
			{ "updatedDate", Types.TIMESTAMP },
			{ "updatedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_Basno (badgeId LONG not null primary key,companyId LONG,groupId LONG,badgeName VARCHAR(500) null,badgeUrl VARCHAR(1000) null,description TEXT null,targetPoints LONG,createdDate DATE null,createdBy LONG,updatedDate DATE null,updatedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table nyyou_Basno";
	public static final String ORDER_BY_JPQL = " ORDER BY basno.badgeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_Basno.badgeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.Basno"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.Basno"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.Basno"));

	public BasnoModelImpl() {
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
	public Class<?> getModelClass() {
		return Basno.class;
	}

	@Override
	public String getModelClassName() {
		return Basno.class.getName();
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
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public String getBadgeName() {
		if (_badgeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _badgeName;
		}
	}

	@Override
	public void setBadgeName(String badgeName) {
		_badgeName = badgeName;
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
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public long getTargetPoints() {
		return _targetPoints;
	}

	@Override
	public void setTargetPoints(long targetPoints) {
		_targetPoints = targetPoints;
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
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Basno.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Basno toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Basno)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BasnoImpl basnoImpl = new BasnoImpl();

		basnoImpl.setBadgeId(getBadgeId());
		basnoImpl.setCompanyId(getCompanyId());
		basnoImpl.setGroupId(getGroupId());
		basnoImpl.setBadgeName(getBadgeName());
		basnoImpl.setBadgeUrl(getBadgeUrl());
		basnoImpl.setDescription(getDescription());
		basnoImpl.setTargetPoints(getTargetPoints());
		basnoImpl.setCreatedDate(getCreatedDate());
		basnoImpl.setCreatedBy(getCreatedBy());
		basnoImpl.setUpdatedDate(getUpdatedDate());
		basnoImpl.setUpdatedBy(getUpdatedBy());

		basnoImpl.resetOriginalValues();

		return basnoImpl;
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

		if (!(obj instanceof Basno)) {
			return false;
		}

		Basno basno = (Basno)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Basno> toCacheModel() {
		BasnoCacheModel basnoCacheModel = new BasnoCacheModel();

		basnoCacheModel.badgeId = getBadgeId();

		basnoCacheModel.companyId = getCompanyId();

		basnoCacheModel.groupId = getGroupId();

		basnoCacheModel.badgeName = getBadgeName();

		String badgeName = basnoCacheModel.badgeName;

		if ((badgeName != null) && (badgeName.length() == 0)) {
			basnoCacheModel.badgeName = null;
		}

		basnoCacheModel.badgeUrl = getBadgeUrl();

		String badgeUrl = basnoCacheModel.badgeUrl;

		if ((badgeUrl != null) && (badgeUrl.length() == 0)) {
			basnoCacheModel.badgeUrl = null;
		}

		basnoCacheModel.description = getDescription();

		String description = basnoCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			basnoCacheModel.description = null;
		}

		basnoCacheModel.targetPoints = getTargetPoints();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			basnoCacheModel.createdDate = createdDate.getTime();
		}
		else {
			basnoCacheModel.createdDate = Long.MIN_VALUE;
		}

		basnoCacheModel.createdBy = getCreatedBy();

		Date updatedDate = getUpdatedDate();

		if (updatedDate != null) {
			basnoCacheModel.updatedDate = updatedDate.getTime();
		}
		else {
			basnoCacheModel.updatedDate = Long.MIN_VALUE;
		}

		basnoCacheModel.updatedBy = getUpdatedBy();

		return basnoCacheModel;
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

	private static ClassLoader _classLoader = Basno.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Basno.class };
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
	private Basno _escapedModel;
}