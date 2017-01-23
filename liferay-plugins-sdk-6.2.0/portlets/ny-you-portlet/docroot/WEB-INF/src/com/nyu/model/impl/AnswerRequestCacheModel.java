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

import com.nyu.model.AnswerRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AnswerRequest in entity cache.
 *
 * @author Allwins Rajaiah
 * @see AnswerRequest
 * @generated
 */
public class AnswerRequestCacheModel implements CacheModel<AnswerRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{answerId=");
		sb.append(answerId);
		sb.append(", requestLessonId=");
		sb.append(requestLessonId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", description=");
		sb.append(description);
		sb.append(", appreciateUserIds=");
		sb.append(appreciateUserIds);
		sb.append(", appreciateCount=");
		sb.append(appreciateCount);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", checkedAnswer=");
		sb.append(checkedAnswer);
		sb.append(", opinionSurvey=");
		sb.append(opinionSurvey);
		sb.append(", myLessons=");
		sb.append(myLessons);
		sb.append(", myFavouriteLessons=");
		sb.append(myFavouriteLessons);
		sb.append(", collaborationLessons=");
		sb.append(collaborationLessons);
		sb.append(", collaborationId=");
		sb.append(collaborationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AnswerRequest toEntityModel() {
		AnswerRequestImpl answerRequestImpl = new AnswerRequestImpl();

		answerRequestImpl.setAnswerId(answerId);
		answerRequestImpl.setRequestLessonId(requestLessonId);
		answerRequestImpl.setUserId(userId);

		if (description == null) {
			answerRequestImpl.setDescription(StringPool.BLANK);
		}
		else {
			answerRequestImpl.setDescription(description);
		}

		if (appreciateUserIds == null) {
			answerRequestImpl.setAppreciateUserIds(StringPool.BLANK);
		}
		else {
			answerRequestImpl.setAppreciateUserIds(appreciateUserIds);
		}

		answerRequestImpl.setAppreciateCount(appreciateCount);

		if (createDate == Long.MIN_VALUE) {
			answerRequestImpl.setCreateDate(null);
		}
		else {
			answerRequestImpl.setCreateDate(new Date(createDate));
		}

		answerRequestImpl.setCheckedAnswer(checkedAnswer);

		if (opinionSurvey == null) {
			answerRequestImpl.setOpinionSurvey(StringPool.BLANK);
		}
		else {
			answerRequestImpl.setOpinionSurvey(opinionSurvey);
		}

		if (myLessons == null) {
			answerRequestImpl.setMyLessons(StringPool.BLANK);
		}
		else {
			answerRequestImpl.setMyLessons(myLessons);
		}

		if (myFavouriteLessons == null) {
			answerRequestImpl.setMyFavouriteLessons(StringPool.BLANK);
		}
		else {
			answerRequestImpl.setMyFavouriteLessons(myFavouriteLessons);
		}

		answerRequestImpl.setCollaborationLessons(collaborationLessons);
		answerRequestImpl.setCollaborationId(collaborationId);

		answerRequestImpl.resetOriginalValues();

		return answerRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		answerId = objectInput.readLong();
		requestLessonId = objectInput.readLong();
		userId = objectInput.readLong();
		description = objectInput.readUTF();
		appreciateUserIds = objectInput.readUTF();
		appreciateCount = objectInput.readInt();
		createDate = objectInput.readLong();
		checkedAnswer = objectInput.readBoolean();
		opinionSurvey = objectInput.readUTF();
		myLessons = objectInput.readUTF();
		myFavouriteLessons = objectInput.readUTF();
		collaborationLessons = objectInput.readLong();
		collaborationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(answerId);
		objectOutput.writeLong(requestLessonId);
		objectOutput.writeLong(userId);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (appreciateUserIds == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appreciateUserIds);
		}

		objectOutput.writeInt(appreciateCount);
		objectOutput.writeLong(createDate);
		objectOutput.writeBoolean(checkedAnswer);

		if (opinionSurvey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opinionSurvey);
		}

		if (myLessons == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(myLessons);
		}

		if (myFavouriteLessons == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(myFavouriteLessons);
		}

		objectOutput.writeLong(collaborationLessons);
		objectOutput.writeLong(collaborationId);
	}

	public long answerId;
	public long requestLessonId;
	public long userId;
	public String description;
	public String appreciateUserIds;
	public int appreciateCount;
	public long createDate;
	public boolean checkedAnswer;
	public String opinionSurvey;
	public String myLessons;
	public String myFavouriteLessons;
	public long collaborationLessons;
	public long collaborationId;
}