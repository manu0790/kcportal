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
public class RequestLessonSoap implements Serializable {
	public static RequestLessonSoap toSoapModel(RequestLesson model) {
		RequestLessonSoap soapModel = new RequestLessonSoap();

		soapModel.setRequestLessonId(model.getRequestLessonId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setRelatedLink(model.getRelatedLink());
		soapModel.setPriority(model.getPriority());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setAcceptedBy(model.getAcceptedBy());
		soapModel.setStatus(model.getStatus());
		soapModel.setAppreciatedUserIds(model.getAppreciatedUserIds());
		soapModel.setLastActivity(model.getLastActivity());
		soapModel.setAcceptedNote(model.getAcceptedNote());
		soapModel.setAnswerType(model.getAnswerType());
		soapModel.setSendTo(model.getSendTo());
		soapModel.setOpnionSurveyLink(model.getOpnionSurveyLink());
		soapModel.setSurveyOptions(model.getSurveyOptions());

		return soapModel;
	}

	public static RequestLessonSoap[] toSoapModels(RequestLesson[] models) {
		RequestLessonSoap[] soapModels = new RequestLessonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RequestLessonSoap[][] toSoapModels(RequestLesson[][] models) {
		RequestLessonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RequestLessonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RequestLessonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RequestLessonSoap[] toSoapModels(List<RequestLesson> models) {
		List<RequestLessonSoap> soapModels = new ArrayList<RequestLessonSoap>(models.size());

		for (RequestLesson model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RequestLessonSoap[soapModels.size()]);
	}

	public RequestLessonSoap() {
	}

	public long getPrimaryKey() {
		return _requestLessonId;
	}

	public void setPrimaryKey(long pk) {
		setRequestLessonId(pk);
	}

	public long getRequestLessonId() {
		return _requestLessonId;
	}

	public void setRequestLessonId(long requestLessonId) {
		_requestLessonId = requestLessonId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getRelatedLink() {
		return _relatedLink;
	}

	public void setRelatedLink(String relatedLink) {
		_relatedLink = relatedLink;
	}

	public boolean getPriority() {
		return _priority;
	}

	public boolean isPriority() {
		return _priority;
	}

	public void setPriority(boolean priority) {
		_priority = priority;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getAcceptedBy() {
		return _acceptedBy;
	}

	public void setAcceptedBy(long acceptedBy) {
		_acceptedBy = acceptedBy;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getAppreciatedUserIds() {
		return _appreciatedUserIds;
	}

	public void setAppreciatedUserIds(String appreciatedUserIds) {
		_appreciatedUserIds = appreciatedUserIds;
	}

	public Date getLastActivity() {
		return _lastActivity;
	}

	public void setLastActivity(Date lastActivity) {
		_lastActivity = lastActivity;
	}

	public String getAcceptedNote() {
		return _acceptedNote;
	}

	public void setAcceptedNote(String acceptedNote) {
		_acceptedNote = acceptedNote;
	}

	public String getAnswerType() {
		return _answerType;
	}

	public void setAnswerType(String answerType) {
		_answerType = answerType;
	}

	public long getSendTo() {
		return _sendTo;
	}

	public void setSendTo(long sendTo) {
		_sendTo = sendTo;
	}

	public String getOpnionSurveyLink() {
		return _opnionSurveyLink;
	}

	public void setOpnionSurveyLink(String opnionSurveyLink) {
		_opnionSurveyLink = opnionSurveyLink;
	}

	public String getSurveyOptions() {
		return _surveyOptions;
	}

	public void setSurveyOptions(String surveyOptions) {
		_surveyOptions = surveyOptions;
	}

	private long _requestLessonId;
	private long _companyId;
	private long _groupId;
	private String _name;
	private String _description;
	private String _relatedLink;
	private boolean _priority;
	private long _createdBy;
	private Date _createdDate;
	private long _acceptedBy;
	private String _status;
	private String _appreciatedUserIds;
	private Date _lastActivity;
	private String _acceptedNote;
	private String _answerType;
	private long _sendTo;
	private String _opnionSurveyLink;
	private String _surveyOptions;
}