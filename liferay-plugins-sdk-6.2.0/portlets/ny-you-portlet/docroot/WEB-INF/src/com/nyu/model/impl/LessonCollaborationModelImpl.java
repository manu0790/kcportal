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

import com.nyu.model.LessonCollaboration;
import com.nyu.model.LessonCollaborationModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LessonCollaboration service. Represents a row in the &quot;nyyou_LessonCollaboration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.LessonCollaborationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LessonCollaborationImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonCollaborationImpl
 * @see com.nyu.model.LessonCollaboration
 * @see com.nyu.model.LessonCollaborationModel
 * @generated
 */
public class LessonCollaborationModelImpl extends BaseModelImpl<LessonCollaboration>
	implements LessonCollaborationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lesson collaboration model instance should use the {@link com.nyu.model.LessonCollaboration} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_LessonCollaboration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "lessonId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "memberStatus", Types.VARCHAR },
			{ "type_", Types.VARCHAR },
			{ "accessPermission", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_LessonCollaboration (id_ LONG not null primary key IDENTITY,lessonId LONG,userId LONG,memberStatus VARCHAR(75) null,type_ VARCHAR(75) null,accessPermission VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table nyyou_LessonCollaboration";
	public static final String ORDER_BY_JPQL = " ORDER BY lessonCollaboration.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_LessonCollaboration.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.LessonCollaboration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.LessonCollaboration"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nyu.model.LessonCollaboration"),
			true);
	public static long ACCESSPERMISSION_COLUMN_BITMASK = 1L;
	public static long LESSONID_COLUMN_BITMASK = 2L;
	public static long MEMBERSTATUS_COLUMN_BITMASK = 4L;
	public static long TYPE_COLUMN_BITMASK = 8L;
	public static long USERID_COLUMN_BITMASK = 16L;
	public static long ID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.LessonCollaboration"));

	public LessonCollaborationModelImpl() {
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
	public Class<?> getModelClass() {
		return LessonCollaboration.class;
	}

	@Override
	public String getModelClassName() {
		return LessonCollaboration.class.getName();
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
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_columnBitmask |= LESSONID_COLUMN_BITMASK;

		if (!_setOriginalLessonId) {
			_setOriginalLessonId = true;

			_originalLessonId = _lessonId;
		}

		_lessonId = lessonId;
	}

	public long getOriginalLessonId() {
		return _originalLessonId;
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
	public String getMemberStatus() {
		if (_memberStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _memberStatus;
		}
	}

	@Override
	public void setMemberStatus(String memberStatus) {
		_columnBitmask |= MEMBERSTATUS_COLUMN_BITMASK;

		if (_originalMemberStatus == null) {
			_originalMemberStatus = _memberStatus;
		}

		_memberStatus = memberStatus;
	}

	public String getOriginalMemberStatus() {
		return GetterUtil.getString(_originalMemberStatus);
	}

	@Override
	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (_originalType == null) {
			_originalType = _type;
		}

		_type = type;
	}

	public String getOriginalType() {
		return GetterUtil.getString(_originalType);
	}

	@Override
	public String getAccessPermission() {
		if (_accessPermission == null) {
			return StringPool.BLANK;
		}
		else {
			return _accessPermission;
		}
	}

	@Override
	public void setAccessPermission(String accessPermission) {
		_columnBitmask |= ACCESSPERMISSION_COLUMN_BITMASK;

		if (_originalAccessPermission == null) {
			_originalAccessPermission = _accessPermission;
		}

		_accessPermission = accessPermission;
	}

	public String getOriginalAccessPermission() {
		return GetterUtil.getString(_originalAccessPermission);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LessonCollaboration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LessonCollaboration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LessonCollaboration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LessonCollaborationImpl lessonCollaborationImpl = new LessonCollaborationImpl();

		lessonCollaborationImpl.setId(getId());
		lessonCollaborationImpl.setLessonId(getLessonId());
		lessonCollaborationImpl.setUserId(getUserId());
		lessonCollaborationImpl.setMemberStatus(getMemberStatus());
		lessonCollaborationImpl.setType(getType());
		lessonCollaborationImpl.setAccessPermission(getAccessPermission());

		lessonCollaborationImpl.resetOriginalValues();

		return lessonCollaborationImpl;
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

		if (!(obj instanceof LessonCollaboration)) {
			return false;
		}

		LessonCollaboration lessonCollaboration = (LessonCollaboration)obj;

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
	public void resetOriginalValues() {
		LessonCollaborationModelImpl lessonCollaborationModelImpl = this;

		lessonCollaborationModelImpl._originalLessonId = lessonCollaborationModelImpl._lessonId;

		lessonCollaborationModelImpl._setOriginalLessonId = false;

		lessonCollaborationModelImpl._originalUserId = lessonCollaborationModelImpl._userId;

		lessonCollaborationModelImpl._setOriginalUserId = false;

		lessonCollaborationModelImpl._originalMemberStatus = lessonCollaborationModelImpl._memberStatus;

		lessonCollaborationModelImpl._originalType = lessonCollaborationModelImpl._type;

		lessonCollaborationModelImpl._originalAccessPermission = lessonCollaborationModelImpl._accessPermission;

		lessonCollaborationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LessonCollaboration> toCacheModel() {
		LessonCollaborationCacheModel lessonCollaborationCacheModel = new LessonCollaborationCacheModel();

		lessonCollaborationCacheModel.id = getId();

		lessonCollaborationCacheModel.lessonId = getLessonId();

		lessonCollaborationCacheModel.userId = getUserId();

		lessonCollaborationCacheModel.memberStatus = getMemberStatus();

		String memberStatus = lessonCollaborationCacheModel.memberStatus;

		if ((memberStatus != null) && (memberStatus.length() == 0)) {
			lessonCollaborationCacheModel.memberStatus = null;
		}

		lessonCollaborationCacheModel.type = getType();

		String type = lessonCollaborationCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			lessonCollaborationCacheModel.type = null;
		}

		lessonCollaborationCacheModel.accessPermission = getAccessPermission();

		String accessPermission = lessonCollaborationCacheModel.accessPermission;

		if ((accessPermission != null) && (accessPermission.length() == 0)) {
			lessonCollaborationCacheModel.accessPermission = null;
		}

		return lessonCollaborationCacheModel;
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

	private static ClassLoader _classLoader = LessonCollaboration.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LessonCollaboration.class
		};
	private long _id;
	private long _lessonId;
	private long _originalLessonId;
	private boolean _setOriginalLessonId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _memberStatus;
	private String _originalMemberStatus;
	private String _type;
	private String _originalType;
	private String _accessPermission;
	private String _originalAccessPermission;
	private long _columnBitmask;
	private LessonCollaboration _escapedModel;
}