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

import com.nyu.service.persistence.Lesson_UsergroupsPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Allwins Rajaiah
 * @generated
 */
public class Lesson_UsergroupsSoap implements Serializable {
	public static Lesson_UsergroupsSoap toSoapModel(Lesson_Usergroups model) {
		Lesson_UsergroupsSoap soapModel = new Lesson_UsergroupsSoap();

		soapModel.setLessonId(model.getLessonId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static Lesson_UsergroupsSoap[] toSoapModels(
		Lesson_Usergroups[] models) {
		Lesson_UsergroupsSoap[] soapModels = new Lesson_UsergroupsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Lesson_UsergroupsSoap[][] toSoapModels(
		Lesson_Usergroups[][] models) {
		Lesson_UsergroupsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Lesson_UsergroupsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Lesson_UsergroupsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Lesson_UsergroupsSoap[] toSoapModels(
		List<Lesson_Usergroups> models) {
		List<Lesson_UsergroupsSoap> soapModels = new ArrayList<Lesson_UsergroupsSoap>(models.size());

		for (Lesson_Usergroups model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Lesson_UsergroupsSoap[soapModels.size()]);
	}

	public Lesson_UsergroupsSoap() {
	}

	public Lesson_UsergroupsPK getPrimaryKey() {
		return new Lesson_UsergroupsPK(_lessonId, _groupId);
	}

	public void setPrimaryKey(Lesson_UsergroupsPK pk) {
		setLessonId(pk.lessonId);
		setGroupId(pk.groupId);
	}

	public long getLessonId() {
		return _lessonId;
	}

	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private long _lessonId;
	private long _groupId;
}