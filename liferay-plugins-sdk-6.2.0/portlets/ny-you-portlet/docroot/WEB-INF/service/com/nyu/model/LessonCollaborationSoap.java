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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Allwins Rajaiah
 * @generated
 */
public class LessonCollaborationSoap implements Serializable {
	public static LessonCollaborationSoap toSoapModel(LessonCollaboration model) {
		LessonCollaborationSoap soapModel = new LessonCollaborationSoap();

		soapModel.setId(model.getId());
		soapModel.setLessonId(model.getLessonId());
		soapModel.setUserId(model.getUserId());
		soapModel.setMemberStatus(model.getMemberStatus());
		soapModel.setType(model.getType());
		soapModel.setAccessPermission(model.getAccessPermission());

		return soapModel;
	}

	public static LessonCollaborationSoap[] toSoapModels(
		LessonCollaboration[] models) {
		LessonCollaborationSoap[] soapModels = new LessonCollaborationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LessonCollaborationSoap[][] toSoapModels(
		LessonCollaboration[][] models) {
		LessonCollaborationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LessonCollaborationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LessonCollaborationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LessonCollaborationSoap[] toSoapModels(
		List<LessonCollaboration> models) {
		List<LessonCollaborationSoap> soapModels = new ArrayList<LessonCollaborationSoap>(models.size());

		for (LessonCollaboration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LessonCollaborationSoap[soapModels.size()]);
	}

	public LessonCollaborationSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getLessonId() {
		return _lessonId;
	}

	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getMemberStatus() {
		return _memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		_memberStatus = memberStatus;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getAccessPermission() {
		return _accessPermission;
	}

	public void setAccessPermission(String accessPermission) {
		_accessPermission = accessPermission;
	}

	private long _id;
	private long _lessonId;
	private long _userId;
	private String _memberStatus;
	private String _type;
	private String _accessPermission;
}