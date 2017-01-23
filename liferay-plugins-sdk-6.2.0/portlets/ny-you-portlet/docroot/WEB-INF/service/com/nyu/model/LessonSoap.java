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
public class LessonSoap implements Serializable {
	public static LessonSoap toSoapModel(Lesson model) {
		LessonSoap soapModel = new LessonSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLessonId(model.getLessonId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setLessonName(model.getLessonName());
		soapModel.setDescription(model.getDescription());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setCourseId(model.getCourseId());
		soapModel.setAppreciatedUserIds(model.getAppreciatedUserIds());
		soapModel.setAppreciateCount(model.getAppreciateCount());
		soapModel.setUploadedTime(model.getUploadedTime());
		soapModel.setUploadedById(model.getUploadedById());
		soapModel.setUploadedByName(model.getUploadedByName());
		soapModel.setLessonNote(model.getLessonNote());
		soapModel.setStatus(model.getStatus());
		soapModel.setRequestLessonId(model.getRequestLessonId());
		soapModel.setLessonPrivacy(model.getLessonPrivacy());
		soapModel.setFeatured(model.getFeatured());
		soapModel.setCreator(model.getCreator());
		soapModel.setSecondaryAuthor(model.getSecondaryAuthor());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setUpdatedDate(model.getUpdatedDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setPermission(model.getPermission());
		soapModel.setMarkedAs(model.getMarkedAs());
		soapModel.setMarkedBy(model.getMarkedBy());
		soapModel.setMarkedContent(model.getMarkedContent());
		soapModel.setCurrentAuthor(model.getCurrentAuthor());
		soapModel.setShareWithProfile(model.getShareWithProfile());
		soapModel.setPublishWithProfile(model.getPublishWithProfile());
		soapModel.setPublishedProfile(model.getPublishedProfile());
		soapModel.setVersion(model.getVersion());
		soapModel.setLessonStatus(model.getLessonStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static LessonSoap[] toSoapModels(Lesson[] models) {
		LessonSoap[] soapModels = new LessonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LessonSoap[][] toSoapModels(Lesson[][] models) {
		LessonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LessonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LessonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LessonSoap[] toSoapModels(List<Lesson> models) {
		List<LessonSoap> soapModels = new ArrayList<LessonSoap>(models.size());

		for (Lesson model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LessonSoap[soapModels.size()]);
	}

	public LessonSoap() {
	}

	public long getPrimaryKey() {
		return _lessonId;
	}

	public void setPrimaryKey(long pk) {
		setLessonId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLessonId() {
		return _lessonId;
	}

	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
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

	public String getLessonName() {
		return _lessonName;
	}

	public void setLessonName(String lessonName) {
		_lessonName = lessonName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getAuthor() {
		return _author;
	}

	public void setAuthor(long author) {
		_author = author;
	}

	public String getCourseId() {
		return _courseId;
	}

	public void setCourseId(String courseId) {
		_courseId = courseId;
	}

	public String getAppreciatedUserIds() {
		return _appreciatedUserIds;
	}

	public void setAppreciatedUserIds(String appreciatedUserIds) {
		_appreciatedUserIds = appreciatedUserIds;
	}

	public int getAppreciateCount() {
		return _appreciateCount;
	}

	public void setAppreciateCount(int appreciateCount) {
		_appreciateCount = appreciateCount;
	}

	public Date getUploadedTime() {
		return _uploadedTime;
	}

	public void setUploadedTime(Date uploadedTime) {
		_uploadedTime = uploadedTime;
	}

	public long getUploadedById() {
		return _uploadedById;
	}

	public void setUploadedById(long uploadedById) {
		_uploadedById = uploadedById;
	}

	public String getUploadedByName() {
		return _uploadedByName;
	}

	public void setUploadedByName(String uploadedByName) {
		_uploadedByName = uploadedByName;
	}

	public String getLessonNote() {
		return _lessonNote;
	}

	public void setLessonNote(String lessonNote) {
		_lessonNote = lessonNote;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getRequestLessonId() {
		return _requestLessonId;
	}

	public void setRequestLessonId(long requestLessonId) {
		_requestLessonId = requestLessonId;
	}

	public String getLessonPrivacy() {
		return _lessonPrivacy;
	}

	public void setLessonPrivacy(String lessonPrivacy) {
		_lessonPrivacy = lessonPrivacy;
	}

	public boolean getFeatured() {
		return _featured;
	}

	public boolean isFeatured() {
		return _featured;
	}

	public void setFeatured(boolean featured) {
		_featured = featured;
	}

	public String getCreator() {
		return _creator;
	}

	public void setCreator(String creator) {
		_creator = creator;
	}

	public String getSecondaryAuthor() {
		return _secondaryAuthor;
	}

	public void setSecondaryAuthor(String secondaryAuthor) {
		_secondaryAuthor = secondaryAuthor;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	public Date getUpdatedDate() {
		return _updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;
	}

	public long getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	public String getPermission() {
		return _permission;
	}

	public void setPermission(String permission) {
		_permission = permission;
	}

	public String getMarkedAs() {
		return _markedAs;
	}

	public void setMarkedAs(String markedAs) {
		_markedAs = markedAs;
	}

	public long getMarkedBy() {
		return _markedBy;
	}

	public void setMarkedBy(long markedBy) {
		_markedBy = markedBy;
	}

	public String getMarkedContent() {
		return _markedContent;
	}

	public void setMarkedContent(String markedContent) {
		_markedContent = markedContent;
	}

	public long getCurrentAuthor() {
		return _currentAuthor;
	}

	public void setCurrentAuthor(long currentAuthor) {
		_currentAuthor = currentAuthor;
	}

	public long getShareWithProfile() {
		return _shareWithProfile;
	}

	public void setShareWithProfile(long shareWithProfile) {
		_shareWithProfile = shareWithProfile;
	}

	public long getPublishWithProfile() {
		return _publishWithProfile;
	}

	public void setPublishWithProfile(long publishWithProfile) {
		_publishWithProfile = publishWithProfile;
	}

	public String getPublishedProfile() {
		return _publishedProfile;
	}

	public void setPublishedProfile(String publishedProfile) {
		_publishedProfile = publishedProfile;
	}

	public double getVersion() {
		return _version;
	}

	public void setVersion(double version) {
		_version = version;
	}

	public int getLessonStatus() {
		return _lessonStatus;
	}

	public void setLessonStatus(int lessonStatus) {
		_lessonStatus = lessonStatus;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _lessonId;
	private long _companyId;
	private long _groupId;
	private String _lessonName;
	private String _description;
	private long _author;
	private String _courseId;
	private String _appreciatedUserIds;
	private int _appreciateCount;
	private Date _uploadedTime;
	private long _uploadedById;
	private String _uploadedByName;
	private String _lessonNote;
	private String _status;
	private long _requestLessonId;
	private String _lessonPrivacy;
	private boolean _featured;
	private String _creator;
	private String _secondaryAuthor;
	private Date _createDate;
	private long _createBy;
	private Date _updatedDate;
	private long _updatedBy;
	private String _permission;
	private String _markedAs;
	private long _markedBy;
	private String _markedContent;
	private long _currentAuthor;
	private long _shareWithProfile;
	private long _publishWithProfile;
	private String _publishedProfile;
	private double _version;
	private int _lessonStatus;
	private long _statusByUserId;
	private Date _statusDate;
}