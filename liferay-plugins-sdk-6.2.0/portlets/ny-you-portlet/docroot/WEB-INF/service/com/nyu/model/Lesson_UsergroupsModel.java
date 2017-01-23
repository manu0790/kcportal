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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.nyu.service.persistence.Lesson_UsergroupsPK;

import java.io.Serializable;

/**
 * The base model interface for the Lesson_Usergroups service. Represents a row in the &quot;nyyou_Lesson_Usergroups&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.Lesson_UsergroupsImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson_Usergroups
 * @see com.nyu.model.impl.Lesson_UsergroupsImpl
 * @see com.nyu.model.impl.Lesson_UsergroupsModelImpl
 * @generated
 */
public interface Lesson_UsergroupsModel extends BaseModel<Lesson_Usergroups> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lesson_ usergroups model instance should use the {@link Lesson_Usergroups} interface instead.
	 */

	/**
	 * Returns the primary key of this lesson_ usergroups.
	 *
	 * @return the primary key of this lesson_ usergroups
	 */
	public Lesson_UsergroupsPK getPrimaryKey();

	/**
	 * Sets the primary key of this lesson_ usergroups.
	 *
	 * @param primaryKey the primary key of this lesson_ usergroups
	 */
	public void setPrimaryKey(Lesson_UsergroupsPK primaryKey);

	/**
	 * Returns the lesson ID of this lesson_ usergroups.
	 *
	 * @return the lesson ID of this lesson_ usergroups
	 */
	public long getLessonId();

	/**
	 * Sets the lesson ID of this lesson_ usergroups.
	 *
	 * @param lessonId the lesson ID of this lesson_ usergroups
	 */
	public void setLessonId(long lessonId);

	/**
	 * Returns the group ID of this lesson_ usergroups.
	 *
	 * @return the group ID of this lesson_ usergroups
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this lesson_ usergroups.
	 *
	 * @param groupId the group ID of this lesson_ usergroups
	 */
	public void setGroupId(long groupId);

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
	public int compareTo(Lesson_Usergroups lesson_Usergroups);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Lesson_Usergroups> toCacheModel();

	@Override
	public Lesson_Usergroups toEscapedModel();

	@Override
	public Lesson_Usergroups toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}