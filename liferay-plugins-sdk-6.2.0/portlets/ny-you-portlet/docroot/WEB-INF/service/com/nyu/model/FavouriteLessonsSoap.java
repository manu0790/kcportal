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

import com.nyu.service.persistence.FavouriteLessonsPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Allwins Rajaiah
 * @generated
 */
public class FavouriteLessonsSoap implements Serializable {
	public static FavouriteLessonsSoap toSoapModel(FavouriteLessons model) {
		FavouriteLessonsSoap soapModel = new FavouriteLessonsSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setLessonId(model.getLessonId());

		return soapModel;
	}

	public static FavouriteLessonsSoap[] toSoapModels(FavouriteLessons[] models) {
		FavouriteLessonsSoap[] soapModels = new FavouriteLessonsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FavouriteLessonsSoap[][] toSoapModels(
		FavouriteLessons[][] models) {
		FavouriteLessonsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FavouriteLessonsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FavouriteLessonsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FavouriteLessonsSoap[] toSoapModels(
		List<FavouriteLessons> models) {
		List<FavouriteLessonsSoap> soapModels = new ArrayList<FavouriteLessonsSoap>(models.size());

		for (FavouriteLessons model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FavouriteLessonsSoap[soapModels.size()]);
	}

	public FavouriteLessonsSoap() {
	}

	public FavouriteLessonsPK getPrimaryKey() {
		return new FavouriteLessonsPK(_userId, _lessonId);
	}

	public void setPrimaryKey(FavouriteLessonsPK pk) {
		setUserId(pk.userId);
		setLessonId(pk.lessonId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getLessonId() {
		return _lessonId;
	}

	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
	}

	private long _userId;
	private long _lessonId;
}