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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.nyu.model.RequestLesson;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RequestLesson in entity cache.
 *
 * @author Allwins Rajaiah
 * @see RequestLesson
 * @generated
 */
public class RequestLessonCacheModel implements CacheModel<RequestLesson>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{requestLessonId=");
		sb.append(requestLessonId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", relatedLink=");
		sb.append(relatedLink);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", acceptedBy=");
		sb.append(acceptedBy);
		sb.append(", status=");
		sb.append(status);
		sb.append(", appreciatedUserIds=");
		sb.append(appreciatedUserIds);
		sb.append(", lastActivity=");
		sb.append(lastActivity);
		sb.append(", acceptedNote=");
		sb.append(acceptedNote);
		sb.append(", answerType=");
		sb.append(answerType);
		sb.append(", sendTo=");
		sb.append(sendTo);
		sb.append(", opnionSurveyLink=");
		sb.append(opnionSurveyLink);
		sb.append(", surveyOptions=");
		sb.append(surveyOptions);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RequestLesson toEntityModel() {
		RequestLessonImpl requestLessonImpl = new RequestLessonImpl();

		requestLessonImpl.setRequestLessonId(requestLessonId);
		requestLessonImpl.setCompanyId(companyId);
		requestLessonImpl.setGroupId(groupId);

		if (name == null) {
			requestLessonImpl.setName(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setName(name);
		}

		if (description == null) {
			requestLessonImpl.setDescription(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setDescription(description);
		}

		if (relatedLink == null) {
			requestLessonImpl.setRelatedLink(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setRelatedLink(relatedLink);
		}

		requestLessonImpl.setPriority(priority);
		requestLessonImpl.setCreatedBy(createdBy);

		if (createdDate == Long.MIN_VALUE) {
			requestLessonImpl.setCreatedDate(null);
		}
		else {
			requestLessonImpl.setCreatedDate(new Date(createdDate));
		}

		requestLessonImpl.setAcceptedBy(acceptedBy);

		if (status == null) {
			requestLessonImpl.setStatus(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setStatus(status);
		}

		if (appreciatedUserIds == null) {
			requestLessonImpl.setAppreciatedUserIds(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setAppreciatedUserIds(appreciatedUserIds);
		}

		if (lastActivity == Long.MIN_VALUE) {
			requestLessonImpl.setLastActivity(null);
		}
		else {
			requestLessonImpl.setLastActivity(new Date(lastActivity));
		}

		if (acceptedNote == null) {
			requestLessonImpl.setAcceptedNote(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setAcceptedNote(acceptedNote);
		}

		if (answerType == null) {
			requestLessonImpl.setAnswerType(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setAnswerType(answerType);
		}

		requestLessonImpl.setSendTo(sendTo);

		if (opnionSurveyLink == null) {
			requestLessonImpl.setOpnionSurveyLink(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setOpnionSurveyLink(opnionSurveyLink);
		}

		if (surveyOptions == null) {
			requestLessonImpl.setSurveyOptions(StringPool.BLANK);
		}
		else {
			requestLessonImpl.setSurveyOptions(surveyOptions);
		}

		requestLessonImpl.resetOriginalValues();

		return requestLessonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		requestLessonId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		relatedLink = objectInput.readUTF();
		priority = objectInput.readBoolean();
		createdBy = objectInput.readLong();
		createdDate = objectInput.readLong();
		acceptedBy = objectInput.readLong();
		status = objectInput.readUTF();
		appreciatedUserIds = objectInput.readUTF();
		lastActivity = objectInput.readLong();
		acceptedNote = objectInput.readUTF();
		answerType = objectInput.readUTF();
		sendTo = objectInput.readLong();
		opnionSurveyLink = objectInput.readUTF();
		surveyOptions = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(requestLessonId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (relatedLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relatedLink);
		}

		objectOutput.writeBoolean(priority);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(acceptedBy);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (appreciatedUserIds == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appreciatedUserIds);
		}

		objectOutput.writeLong(lastActivity);

		if (acceptedNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(acceptedNote);
		}

		if (answerType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(answerType);
		}

		objectOutput.writeLong(sendTo);

		if (opnionSurveyLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opnionSurveyLink);
		}

		if (surveyOptions == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(surveyOptions);
		}
	}

	public long requestLessonId;
	public long companyId;
	public long groupId;
	public String name;
	public String description;
	public String relatedLink;
	public boolean priority;
	public long createdBy;
	public long createdDate;
	public long acceptedBy;
	public String status;
	public String appreciatedUserIds;
	public long lastActivity;
	public String acceptedNote;
	public String answerType;
	public long sendTo;
	public String opnionSurveyLink;
	public String surveyOptions;
}