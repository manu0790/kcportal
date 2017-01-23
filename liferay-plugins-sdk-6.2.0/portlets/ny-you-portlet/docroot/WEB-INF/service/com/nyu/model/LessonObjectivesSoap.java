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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Allwins Rajaiah
 * @generated
 */
public class LessonObjectivesSoap implements Serializable {
	public static LessonObjectivesSoap toSoapModel(LessonObjectives model) {
		LessonObjectivesSoap soapModel = new LessonObjectivesSoap();

		soapModel.setId(model.getId());
		soapModel.setLessonId(model.getLessonId());
		soapModel.setObjective(model.getObjective());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static LessonObjectivesSoap[] toSoapModels(LessonObjectives[] models) {
		LessonObjectivesSoap[] soapModels = new LessonObjectivesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LessonObjectivesSoap[][] toSoapModels(
		LessonObjectives[][] models) {
		LessonObjectivesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LessonObjectivesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LessonObjectivesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LessonObjectivesSoap[] toSoapModels(
		List<LessonObjectives> models) {
		List<LessonObjectivesSoap> soapModels = new ArrayList<LessonObjectivesSoap>(models.size());

		for (LessonObjectives model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LessonObjectivesSoap[soapModels.size()]);
	}

	public LessonObjectivesSoap() {
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

	public String getObjective() {
		return _objective;
	}

	public void setObjective(String objective) {
		_objective = objective;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _id;
	private long _lessonId;
	private String _objective;
	private Date _modifiedDate;
}