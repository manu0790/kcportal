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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FavouriteLessons}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessons
 * @generated
 */
public class FavouriteLessonsWrapper implements FavouriteLessons,
	ModelWrapper<FavouriteLessons> {
	public FavouriteLessonsWrapper(FavouriteLessons favouriteLessons) {
		_favouriteLessons = favouriteLessons;
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

	/**
	* Returns the primary key of this favourite lessons.
	*
	* @return the primary key of this favourite lessons
	*/
	@Override
	public com.nyu.service.persistence.FavouriteLessonsPK getPrimaryKey() {
		return _favouriteLessons.getPrimaryKey();
	}

	/**
	* Sets the primary key of this favourite lessons.
	*
	* @param primaryKey the primary key of this favourite lessons
	*/
	@Override
	public void setPrimaryKey(
		com.nyu.service.persistence.FavouriteLessonsPK primaryKey) {
		_favouriteLessons.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this favourite lessons.
	*
	* @return the user ID of this favourite lessons
	*/
	@Override
	public long getUserId() {
		return _favouriteLessons.getUserId();
	}

	/**
	* Sets the user ID of this favourite lessons.
	*
	* @param userId the user ID of this favourite lessons
	*/
	@Override
	public void setUserId(long userId) {
		_favouriteLessons.setUserId(userId);
	}

	/**
	* Returns the user uuid of this favourite lessons.
	*
	* @return the user uuid of this favourite lessons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessons.getUserUuid();
	}

	/**
	* Sets the user uuid of this favourite lessons.
	*
	* @param userUuid the user uuid of this favourite lessons
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_favouriteLessons.setUserUuid(userUuid);
	}

	/**
	* Returns the lesson ID of this favourite lessons.
	*
	* @return the lesson ID of this favourite lessons
	*/
	@Override
	public long getLessonId() {
		return _favouriteLessons.getLessonId();
	}

	/**
	* Sets the lesson ID of this favourite lessons.
	*
	* @param lessonId the lesson ID of this favourite lessons
	*/
	@Override
	public void setLessonId(long lessonId) {
		_favouriteLessons.setLessonId(lessonId);
	}

	@Override
	public boolean isNew() {
		return _favouriteLessons.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_favouriteLessons.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _favouriteLessons.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_favouriteLessons.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _favouriteLessons.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _favouriteLessons.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_favouriteLessons.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _favouriteLessons.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_favouriteLessons.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_favouriteLessons.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_favouriteLessons.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FavouriteLessonsWrapper((FavouriteLessons)_favouriteLessons.clone());
	}

	@Override
	public int compareTo(com.nyu.model.FavouriteLessons favouriteLessons) {
		return _favouriteLessons.compareTo(favouriteLessons);
	}

	@Override
	public int hashCode() {
		return _favouriteLessons.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.FavouriteLessons> toCacheModel() {
		return _favouriteLessons.toCacheModel();
	}

	@Override
	public com.nyu.model.FavouriteLessons toEscapedModel() {
		return new FavouriteLessonsWrapper(_favouriteLessons.toEscapedModel());
	}

	@Override
	public com.nyu.model.FavouriteLessons toUnescapedModel() {
		return new FavouriteLessonsWrapper(_favouriteLessons.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _favouriteLessons.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _favouriteLessons.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_favouriteLessons.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavouriteLessonsWrapper)) {
			return false;
		}

		FavouriteLessonsWrapper favouriteLessonsWrapper = (FavouriteLessonsWrapper)obj;

		if (Validator.equals(_favouriteLessons,
					favouriteLessonsWrapper._favouriteLessons)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FavouriteLessons getWrappedFavouriteLessons() {
		return _favouriteLessons;
	}

	@Override
	public FavouriteLessons getWrappedModel() {
		return _favouriteLessons;
	}

	@Override
	public void resetOriginalValues() {
		_favouriteLessons.resetOriginalValues();
	}

	private FavouriteLessons _favouriteLessons;
}