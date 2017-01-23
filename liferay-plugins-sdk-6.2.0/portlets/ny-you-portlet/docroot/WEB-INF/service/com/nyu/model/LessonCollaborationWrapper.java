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
 * This class is a wrapper for {@link LessonCollaboration}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonCollaboration
 * @generated
 */
public class LessonCollaborationWrapper implements LessonCollaboration,
	ModelWrapper<LessonCollaboration> {
	public LessonCollaborationWrapper(LessonCollaboration lessonCollaboration) {
		_lessonCollaboration = lessonCollaboration;
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

	/**
	* Returns the primary key of this lesson collaboration.
	*
	* @return the primary key of this lesson collaboration
	*/
	@Override
	public long getPrimaryKey() {
		return _lessonCollaboration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lesson collaboration.
	*
	* @param primaryKey the primary key of this lesson collaboration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lessonCollaboration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this lesson collaboration.
	*
	* @return the ID of this lesson collaboration
	*/
	@Override
	public long getId() {
		return _lessonCollaboration.getId();
	}

	/**
	* Sets the ID of this lesson collaboration.
	*
	* @param id the ID of this lesson collaboration
	*/
	@Override
	public void setId(long id) {
		_lessonCollaboration.setId(id);
	}

	/**
	* Returns the lesson ID of this lesson collaboration.
	*
	* @return the lesson ID of this lesson collaboration
	*/
	@Override
	public long getLessonId() {
		return _lessonCollaboration.getLessonId();
	}

	/**
	* Sets the lesson ID of this lesson collaboration.
	*
	* @param lessonId the lesson ID of this lesson collaboration
	*/
	@Override
	public void setLessonId(long lessonId) {
		_lessonCollaboration.setLessonId(lessonId);
	}

	/**
	* Returns the user ID of this lesson collaboration.
	*
	* @return the user ID of this lesson collaboration
	*/
	@Override
	public long getUserId() {
		return _lessonCollaboration.getUserId();
	}

	/**
	* Sets the user ID of this lesson collaboration.
	*
	* @param userId the user ID of this lesson collaboration
	*/
	@Override
	public void setUserId(long userId) {
		_lessonCollaboration.setUserId(userId);
	}

	/**
	* Returns the user uuid of this lesson collaboration.
	*
	* @return the user uuid of this lesson collaboration
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaboration.getUserUuid();
	}

	/**
	* Sets the user uuid of this lesson collaboration.
	*
	* @param userUuid the user uuid of this lesson collaboration
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_lessonCollaboration.setUserUuid(userUuid);
	}

	/**
	* Returns the member status of this lesson collaboration.
	*
	* @return the member status of this lesson collaboration
	*/
	@Override
	public java.lang.String getMemberStatus() {
		return _lessonCollaboration.getMemberStatus();
	}

	/**
	* Sets the member status of this lesson collaboration.
	*
	* @param memberStatus the member status of this lesson collaboration
	*/
	@Override
	public void setMemberStatus(java.lang.String memberStatus) {
		_lessonCollaboration.setMemberStatus(memberStatus);
	}

	/**
	* Returns the type of this lesson collaboration.
	*
	* @return the type of this lesson collaboration
	*/
	@Override
	public java.lang.String getType() {
		return _lessonCollaboration.getType();
	}

	/**
	* Sets the type of this lesson collaboration.
	*
	* @param type the type of this lesson collaboration
	*/
	@Override
	public void setType(java.lang.String type) {
		_lessonCollaboration.setType(type);
	}

	/**
	* Returns the access permission of this lesson collaboration.
	*
	* @return the access permission of this lesson collaboration
	*/
	@Override
	public java.lang.String getAccessPermission() {
		return _lessonCollaboration.getAccessPermission();
	}

	/**
	* Sets the access permission of this lesson collaboration.
	*
	* @param accessPermission the access permission of this lesson collaboration
	*/
	@Override
	public void setAccessPermission(java.lang.String accessPermission) {
		_lessonCollaboration.setAccessPermission(accessPermission);
	}

	@Override
	public boolean isNew() {
		return _lessonCollaboration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lessonCollaboration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lessonCollaboration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lessonCollaboration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lessonCollaboration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lessonCollaboration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lessonCollaboration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lessonCollaboration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lessonCollaboration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lessonCollaboration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lessonCollaboration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LessonCollaborationWrapper((LessonCollaboration)_lessonCollaboration.clone());
	}

	@Override
	public int compareTo(LessonCollaboration lessonCollaboration) {
		return _lessonCollaboration.compareTo(lessonCollaboration);
	}

	@Override
	public int hashCode() {
		return _lessonCollaboration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<LessonCollaboration> toCacheModel() {
		return _lessonCollaboration.toCacheModel();
	}

	@Override
	public LessonCollaboration toEscapedModel() {
		return new LessonCollaborationWrapper(_lessonCollaboration.toEscapedModel());
	}

	@Override
	public LessonCollaboration toUnescapedModel() {
		return new LessonCollaborationWrapper(_lessonCollaboration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lessonCollaboration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lessonCollaboration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lessonCollaboration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LessonCollaborationWrapper)) {
			return false;
		}

		LessonCollaborationWrapper lessonCollaborationWrapper = (LessonCollaborationWrapper)obj;

		if (Validator.equals(_lessonCollaboration,
					lessonCollaborationWrapper._lessonCollaboration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LessonCollaboration getWrappedLessonCollaboration() {
		return _lessonCollaboration;
	}

	@Override
	public LessonCollaboration getWrappedModel() {
		return _lessonCollaboration;
	}

	@Override
	public void resetOriginalValues() {
		_lessonCollaboration.resetOriginalValues();
	}

	private LessonCollaboration _lessonCollaboration;
}