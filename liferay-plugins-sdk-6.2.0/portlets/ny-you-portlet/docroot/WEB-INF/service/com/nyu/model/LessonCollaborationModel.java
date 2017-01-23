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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LessonCollaboration service. Represents a row in the &quot;nyyou_LessonCollaboration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.LessonCollaborationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.LessonCollaborationImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonCollaboration
 * @see com.nyu.model.impl.LessonCollaborationImpl
 * @see com.nyu.model.impl.LessonCollaborationModelImpl
 * @generated
 */
public interface LessonCollaborationModel extends BaseModel<LessonCollaboration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lesson collaboration model instance should use the {@link LessonCollaboration} interface instead.
	 */

	/**
	 * Returns the primary key of this lesson collaboration.
	 *
	 * @return the primary key of this lesson collaboration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lesson collaboration.
	 *
	 * @param primaryKey the primary key of this lesson collaboration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this lesson collaboration.
	 *
	 * @return the ID of this lesson collaboration
	 */
	public long getId();

	/**
	 * Sets the ID of this lesson collaboration.
	 *
	 * @param id the ID of this lesson collaboration
	 */
	public void setId(long id);

	/**
	 * Returns the lesson ID of this lesson collaboration.
	 *
	 * @return the lesson ID of this lesson collaboration
	 */
	public long getLessonId();

	/**
	 * Sets the lesson ID of this lesson collaboration.
	 *
	 * @param lessonId the lesson ID of this lesson collaboration
	 */
	public void setLessonId(long lessonId);

	/**
	 * Returns the user ID of this lesson collaboration.
	 *
	 * @return the user ID of this lesson collaboration
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this lesson collaboration.
	 *
	 * @param userId the user ID of this lesson collaboration
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this lesson collaboration.
	 *
	 * @return the user uuid of this lesson collaboration
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this lesson collaboration.
	 *
	 * @param userUuid the user uuid of this lesson collaboration
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the member status of this lesson collaboration.
	 *
	 * @return the member status of this lesson collaboration
	 */
	@AutoEscape
	public String getMemberStatus();

	/**
	 * Sets the member status of this lesson collaboration.
	 *
	 * @param memberStatus the member status of this lesson collaboration
	 */
	public void setMemberStatus(String memberStatus);

	/**
	 * Returns the type of this lesson collaboration.
	 *
	 * @return the type of this lesson collaboration
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this lesson collaboration.
	 *
	 * @param type the type of this lesson collaboration
	 */
	public void setType(String type);

	/**
	 * Returns the access permission of this lesson collaboration.
	 *
	 * @return the access permission of this lesson collaboration
	 */
	@AutoEscape
	public String getAccessPermission();

	/**
	 * Sets the access permission of this lesson collaboration.
	 *
	 * @param accessPermission the access permission of this lesson collaboration
	 */
	public void setAccessPermission(String accessPermission);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LessonCollaboration lessonCollaboration);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LessonCollaboration> toCacheModel();

	@Override
	public LessonCollaboration toEscapedModel();

	@Override
	public LessonCollaboration toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}