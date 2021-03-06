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

import com.liferay.portal.kernel.exception.SystemException;

import com.nyu.model.Lesson_Usergroups;

import com.nyu.service.Lesson_UsergroupsLocalServiceUtil;

/**
 * The extended model base implementation for the Lesson_Usergroups service. Represents a row in the &quot;nyyou_Lesson_Usergroups&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Lesson_UsergroupsImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson_UsergroupsImpl
 * @see com.nyu.model.Lesson_Usergroups
 * @generated
 */
public abstract class Lesson_UsergroupsBaseImpl
	extends Lesson_UsergroupsModelImpl implements Lesson_Usergroups {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lesson_ usergroups model instance should use the {@link Lesson_Usergroups} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Lesson_UsergroupsLocalServiceUtil.addLesson_Usergroups(this);
		}
		else {
			Lesson_UsergroupsLocalServiceUtil.updateLesson_Usergroups(this);
		}
	}
}