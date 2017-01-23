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
 * This class is a wrapper for {@link Lesson_Usergroups}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson_Usergroups
 * @generated
 */
public class Lesson_UsergroupsWrapper implements Lesson_Usergroups,
	ModelWrapper<Lesson_Usergroups> {
	public Lesson_UsergroupsWrapper(Lesson_Usergroups lesson_Usergroups) {
		_lesson_Usergroups = lesson_Usergroups;
	}

	@Override
	public Class<?> getModelClass() {
		return Lesson_Usergroups.class;
	}

	@Override
	public String getModelClassName() {
		return Lesson_Usergroups.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lessonId", getLessonId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	* Returns the primary key of this lesson_ usergroups.
	*
	* @return the primary key of this lesson_ usergroups
	*/
	@Override
	public com.nyu.service.persistence.Lesson_UsergroupsPK getPrimaryKey() {
		return _lesson_Usergroups.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lesson_ usergroups.
	*
	* @param primaryKey the primary key of this lesson_ usergroups
	*/
	@Override
	public void setPrimaryKey(
		com.nyu.service.persistence.Lesson_UsergroupsPK primaryKey) {
		_lesson_Usergroups.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the lesson ID of this lesson_ usergroups.
	*
	* @return the lesson ID of this lesson_ usergroups
	*/
	@Override
	public long getLessonId() {
		return _lesson_Usergroups.getLessonId();
	}

	/**
	* Sets the lesson ID of this lesson_ usergroups.
	*
	* @param lessonId the lesson ID of this lesson_ usergroups
	*/
	@Override
	public void setLessonId(long lessonId) {
		_lesson_Usergroups.setLessonId(lessonId);
	}

	/**
	* Returns the group ID of this lesson_ usergroups.
	*
	* @return the group ID of this lesson_ usergroups
	*/
	@Override
	public long getGroupId() {
		return _lesson_Usergroups.getGroupId();
	}

	/**
	* Sets the group ID of this lesson_ usergroups.
	*
	* @param groupId the group ID of this lesson_ usergroups
	*/
	@Override
	public void setGroupId(long groupId) {
		_lesson_Usergroups.setGroupId(groupId);
	}

	@Override
	public boolean isNew() {
		return _lesson_Usergroups.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lesson_Usergroups.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lesson_Usergroups.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lesson_Usergroups.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lesson_Usergroups.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lesson_Usergroups.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lesson_Usergroups.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lesson_Usergroups.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lesson_Usergroups.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lesson_Usergroups.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lesson_Usergroups.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Lesson_UsergroupsWrapper((Lesson_Usergroups)_lesson_Usergroups.clone());
	}

	@Override
	public int compareTo(Lesson_Usergroups lesson_Usergroups) {
		return _lesson_Usergroups.compareTo(lesson_Usergroups);
	}

	@Override
	public int hashCode() {
		return _lesson_Usergroups.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Lesson_Usergroups> toCacheModel() {
		return _lesson_Usergroups.toCacheModel();
	}

	@Override
	public Lesson_Usergroups toEscapedModel() {
		return new Lesson_UsergroupsWrapper(_lesson_Usergroups.toEscapedModel());
	}

	@Override
	public Lesson_Usergroups toUnescapedModel() {
		return new Lesson_UsergroupsWrapper(_lesson_Usergroups.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lesson_Usergroups.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lesson_Usergroups.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lesson_Usergroups.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Lesson_UsergroupsWrapper)) {
			return false;
		}

		Lesson_UsergroupsWrapper lesson_UsergroupsWrapper = (Lesson_UsergroupsWrapper)obj;

		if (Validator.equals(_lesson_Usergroups,
					lesson_UsergroupsWrapper._lesson_Usergroups)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Lesson_Usergroups getWrappedLesson_Usergroups() {
		return _lesson_Usergroups;
	}

	@Override
	public Lesson_Usergroups getWrappedModel() {
		return _lesson_Usergroups;
	}

	@Override
	public void resetOriginalValues() {
		_lesson_Usergroups.resetOriginalValues();
	}

	private Lesson_Usergroups _lesson_Usergroups;
}