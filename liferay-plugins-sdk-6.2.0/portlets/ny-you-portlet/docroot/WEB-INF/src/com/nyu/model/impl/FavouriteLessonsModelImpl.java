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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.nyu.model.FavouriteLessons;
import com.nyu.model.FavouriteLessonsModel;

import com.nyu.service.persistence.FavouriteLessonsPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FavouriteLessons service. Represents a row in the &quot;nyyou_FavouriteLessons&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.FavouriteLessonsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FavouriteLessonsImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessonsImpl
 * @see com.nyu.model.FavouriteLessons
 * @see com.nyu.model.FavouriteLessonsModel
 * @generated
 */
public class FavouriteLessonsModelImpl extends BaseModelImpl<FavouriteLessons>
	implements FavouriteLessonsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a favourite lessons model instance should use the {@link com.nyu.model.FavouriteLessons} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_FavouriteLessons";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userId", Types.BIGINT },
			{ "lessonId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_FavouriteLessons (userId LONG not null,lessonId LONG not null,primary key (userId, lessonId))";
	public static final String TABLE_SQL_DROP = "drop table nyyou_FavouriteLessons";
	public static final String ORDER_BY_JPQL = " ORDER BY favouriteLessons.id.userId ASC, favouriteLessons.id.lessonId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_FavouriteLessons.userId ASC, nyyou_FavouriteLessons.lessonId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.FavouriteLessons"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.FavouriteLessons"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nyu.model.FavouriteLessons"),
			true);
	public static long USERID_COLUMN_BITMASK = 1L;
	public static long LESSONID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.FavouriteLessons"));

	public FavouriteLessonsModelImpl() {
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
	public Class<?> getModelClass() {
		return FavouriteLessons.class;
	}

	@Override
	public String getModelClassName() {
		return FavouriteLessons.class.getName();
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
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public FavouriteLessons toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FavouriteLessons)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FavouriteLessonsImpl favouriteLessonsImpl = new FavouriteLessonsImpl();

		favouriteLessonsImpl.setUserId(getUserId());
		favouriteLessonsImpl.setLessonId(getLessonId());

		favouriteLessonsImpl.resetOriginalValues();

		return favouriteLessonsImpl;
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

		if (!(obj instanceof FavouriteLessons)) {
			return false;
		}

		FavouriteLessons favouriteLessons = (FavouriteLessons)obj;

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
	public void resetOriginalValues() {
		FavouriteLessonsModelImpl favouriteLessonsModelImpl = this;

		favouriteLessonsModelImpl._originalUserId = favouriteLessonsModelImpl._userId;

		favouriteLessonsModelImpl._setOriginalUserId = false;

		favouriteLessonsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FavouriteLessons> toCacheModel() {
		FavouriteLessonsCacheModel favouriteLessonsCacheModel = new FavouriteLessonsCacheModel();

		favouriteLessonsCacheModel.userId = getUserId();

		favouriteLessonsCacheModel.lessonId = getLessonId();

		return favouriteLessonsCacheModel;
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

	private static ClassLoader _classLoader = FavouriteLessons.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			FavouriteLessons.class
		};
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _lessonId;
	private long _columnBitmask;
	private FavouriteLessons _escapedModel;
}