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
public class AnswerRequestSoap implements Serializable {
	public static AnswerRequestSoap toSoapModel(AnswerRequest model) {
		AnswerRequestSoap soapModel = new AnswerRequestSoap();

		soapModel.setAnswerId(model.getAnswerId());
		soapModel.setRequestLessonId(model.getRequestLessonId());
		soapModel.setUserId(model.getUserId());
		soapModel.setDescription(model.getDescription());
		soapModel.setAppreciateUserIds(model.getAppreciateUserIds());
		soapModel.setAppreciateCount(model.getAppreciateCount());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCheckedAnswer(model.getCheckedAnswer());
		soapModel.setOpinionSurvey(model.getOpinionSurvey());
		soapModel.setMyLessons(model.getMyLessons());
		soapModel.setMyFavouriteLessons(model.getMyFavouriteLessons());
		soapModel.setCollaborationLessons(model.getCollaborationLessons());
		soapModel.setCollaborationId(model.getCollaborationId());

		return soapModel;
	}

	public static AnswerRequestSoap[] toSoapModels(AnswerRequest[] models) {
		AnswerRequestSoap[] soapModels = new AnswerRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AnswerRequestSoap[][] toSoapModels(AnswerRequest[][] models) {
		AnswerRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AnswerRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AnswerRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AnswerRequestSoap[] toSoapModels(List<AnswerRequest> models) {
		List<AnswerRequestSoap> soapModels = new ArrayList<AnswerRequestSoap>(models.size());

		for (AnswerRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AnswerRequestSoap[soapModels.size()]);
	}

	public AnswerRequestSoap() {
	}

	public long getPrimaryKey() {
		return _answerId;
	}

	public void setPrimaryKey(long pk) {
		setAnswerId(pk);
	}

	public long getAnswerId() {
		return _answerId;
	}

	public void setAnswerId(long answerId) {
		_answerId = answerId;
	}

	public long getRequestLessonId() {
		return _requestLessonId;
	}

	public void setRequestLessonId(long requestLessonId) {
		_requestLessonId = requestLessonId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getAppreciateUserIds() {
		return _appreciateUserIds;
	}

	public void setAppreciateUserIds(String appreciateUserIds) {
		_appreciateUserIds = appreciateUserIds;
	}

	public int getAppreciateCount() {
		return _appreciateCount;
	}

	public void setAppreciateCount(int appreciateCount) {
		_appreciateCount = appreciateCount;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public boolean getCheckedAnswer() {
		return _checkedAnswer;
	}

	public boolean isCheckedAnswer() {
		return _checkedAnswer;
	}

	public void setCheckedAnswer(boolean checkedAnswer) {
		_checkedAnswer = checkedAnswer;
	}

	public String getOpinionSurvey() {
		return _opinionSurvey;
	}

	public void setOpinionSurvey(String opinionSurvey) {
		_opinionSurvey = opinionSurvey;
	}

	public String getMyLessons() {
		return _myLessons;
	}

	public void setMyLessons(String myLessons) {
		_myLessons = myLessons;
	}

	public String getMyFavouriteLessons() {
		return _myFavouriteLessons;
	}

	public void setMyFavouriteLessons(String myFavouriteLessons) {
		_myFavouriteLessons = myFavouriteLessons;
	}

	public long getCollaborationLessons() {
		return _collaborationLessons;
	}

	public void setCollaborationLessons(long collaborationLessons) {
		_collaborationLessons = collaborationLessons;
	}

	public long getCollaborationId() {
		return _collaborationId;
	}

	public void setCollaborationId(long collaborationId) {
		_collaborationId = collaborationId;
	}

	private long _answerId;
	private long _requestLessonId;
	private long _userId;
	private String _description;
	private String _appreciateUserIds;
	private int _appreciateCount;
	private Date _createDate;
	private boolean _checkedAnswer;
	private String _opinionSurvey;
	private String _myLessons;
	private String _myFavouriteLessons;
	private long _collaborationLessons;
	private long _collaborationId;
}