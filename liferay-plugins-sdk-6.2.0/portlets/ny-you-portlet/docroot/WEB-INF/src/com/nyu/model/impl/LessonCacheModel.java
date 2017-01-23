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

import com.nyu.model.Lesson;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Lesson in entity cache.
 *
 * @author Allwins Rajaiah
 * @see Lesson
 * @generated
 */
public class LessonCacheModel implements CacheModel<Lesson>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", lessonId=");
		sb.append(lessonId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", lessonName=");
		sb.append(lessonName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", author=");
		sb.append(author);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", appreciatedUserIds=");
		sb.append(appreciatedUserIds);
		sb.append(", appreciateCount=");
		sb.append(appreciateCount);
		sb.append(", uploadedTime=");
		sb.append(uploadedTime);
		sb.append(", uploadedById=");
		sb.append(uploadedById);
		sb.append(", uploadedByName=");
		sb.append(uploadedByName);
		sb.append(", lessonNote=");
		sb.append(lessonNote);
		sb.append(", status=");
		sb.append(status);
		sb.append(", requestLessonId=");
		sb.append(requestLessonId);
		sb.append(", lessonPrivacy=");
		sb.append(lessonPrivacy);
		sb.append(", featured=");
		sb.append(featured);
		sb.append(", creator=");
		sb.append(creator);
		sb.append(", secondaryAuthor=");
		sb.append(secondaryAuthor);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append(", updatedDate=");
		sb.append(updatedDate);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append(", permission=");
		sb.append(permission);
		sb.append(", markedAs=");
		sb.append(markedAs);
		sb.append(", markedBy=");
		sb.append(markedBy);
		sb.append(", markedContent=");
		sb.append(markedContent);
		sb.append(", currentAuthor=");
		sb.append(currentAuthor);
		sb.append(", shareWithProfile=");
		sb.append(shareWithProfile);
		sb.append(", publishWithProfile=");
		sb.append(publishWithProfile);
		sb.append(", publishedProfile=");
		sb.append(publishedProfile);
		sb.append(", version=");
		sb.append(version);
		sb.append(", lessonStatus=");
		sb.append(lessonStatus);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Lesson toEntityModel() {
		LessonImpl lessonImpl = new LessonImpl();

		if (uuid == null) {
			lessonImpl.setUuid(StringPool.BLANK);
		}
		else {
			lessonImpl.setUuid(uuid);
		}

		lessonImpl.setLessonId(lessonId);
		lessonImpl.setCompanyId(companyId);
		lessonImpl.setGroupId(groupId);

		if (lessonName == null) {
			lessonImpl.setLessonName(StringPool.BLANK);
		}
		else {
			lessonImpl.setLessonName(lessonName);
		}

		if (description == null) {
			lessonImpl.setDescription(StringPool.BLANK);
		}
		else {
			lessonImpl.setDescription(description);
		}

		lessonImpl.setAuthor(author);

		if (courseId == null) {
			lessonImpl.setCourseId(StringPool.BLANK);
		}
		else {
			lessonImpl.setCourseId(courseId);
		}

		if (appreciatedUserIds == null) {
			lessonImpl.setAppreciatedUserIds(StringPool.BLANK);
		}
		else {
			lessonImpl.setAppreciatedUserIds(appreciatedUserIds);
		}

		lessonImpl.setAppreciateCount(appreciateCount);

		if (uploadedTime == Long.MIN_VALUE) {
			lessonImpl.setUploadedTime(null);
		}
		else {
			lessonImpl.setUploadedTime(new Date(uploadedTime));
		}

		lessonImpl.setUploadedById(uploadedById);

		if (uploadedByName == null) {
			lessonImpl.setUploadedByName(StringPool.BLANK);
		}
		else {
			lessonImpl.setUploadedByName(uploadedByName);
		}

		if (lessonNote == null) {
			lessonImpl.setLessonNote(StringPool.BLANK);
		}
		else {
			lessonImpl.setLessonNote(lessonNote);
		}

		if (status == null) {
			lessonImpl.setStatus(StringPool.BLANK);
		}
		else {
			lessonImpl.setStatus(status);
		}

		lessonImpl.setRequestLessonId(requestLessonId);

		if (lessonPrivacy == null) {
			lessonImpl.setLessonPrivacy(StringPool.BLANK);
		}
		else {
			lessonImpl.setLessonPrivacy(lessonPrivacy);
		}

		lessonImpl.setFeatured(featured);

		if (creator == null) {
			lessonImpl.setCreator(StringPool.BLANK);
		}
		else {
			lessonImpl.setCreator(creator);
		}

		if (secondaryAuthor == null) {
			lessonImpl.setSecondaryAuthor(StringPool.BLANK);
		}
		else {
			lessonImpl.setSecondaryAuthor(secondaryAuthor);
		}

		if (createDate == Long.MIN_VALUE) {
			lessonImpl.setCreateDate(null);
		}
		else {
			lessonImpl.setCreateDate(new Date(createDate));
		}

		lessonImpl.setCreateBy(createBy);

		if (updatedDate == Long.MIN_VALUE) {
			lessonImpl.setUpdatedDate(null);
		}
		else {
			lessonImpl.setUpdatedDate(new Date(updatedDate));
		}

		lessonImpl.setUpdatedBy(updatedBy);

		if (permission == null) {
			lessonImpl.setPermission(StringPool.BLANK);
		}
		else {
			lessonImpl.setPermission(permission);
		}

		if (markedAs == null) {
			lessonImpl.setMarkedAs(StringPool.BLANK);
		}
		else {
			lessonImpl.setMarkedAs(markedAs);
		}

		lessonImpl.setMarkedBy(markedBy);

		if (markedContent == null) {
			lessonImpl.setMarkedContent(StringPool.BLANK);
		}
		else {
			lessonImpl.setMarkedContent(markedContent);
		}

		lessonImpl.setCurrentAuthor(currentAuthor);
		lessonImpl.setShareWithProfile(shareWithProfile);
		lessonImpl.setPublishWithProfile(publishWithProfile);

		if (publishedProfile == null) {
			lessonImpl.setPublishedProfile(StringPool.BLANK);
		}
		else {
			lessonImpl.setPublishedProfile(publishedProfile);
		}

		lessonImpl.setVersion(version);
		lessonImpl.setLessonStatus(lessonStatus);
		lessonImpl.setStatusByUserId(statusByUserId);

		if (statusDate == Long.MIN_VALUE) {
			lessonImpl.setStatusDate(null);
		}
		else {
			lessonImpl.setStatusDate(new Date(statusDate));
		}

		lessonImpl.resetOriginalValues();

		return lessonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		lessonId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		lessonName = objectInput.readUTF();
		description = objectInput.readUTF();
		author = objectInput.readLong();
		courseId = objectInput.readUTF();
		appreciatedUserIds = objectInput.readUTF();
		appreciateCount = objectInput.readInt();
		uploadedTime = objectInput.readLong();
		uploadedById = objectInput.readLong();
		uploadedByName = objectInput.readUTF();
		lessonNote = objectInput.readUTF();
		status = objectInput.readUTF();
		requestLessonId = objectInput.readLong();
		lessonPrivacy = objectInput.readUTF();
		featured = objectInput.readBoolean();
		creator = objectInput.readUTF();
		secondaryAuthor = objectInput.readUTF();
		createDate = objectInput.readLong();
		createBy = objectInput.readLong();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readLong();
		permission = objectInput.readUTF();
		markedAs = objectInput.readUTF();
		markedBy = objectInput.readLong();
		markedContent = objectInput.readUTF();
		currentAuthor = objectInput.readLong();
		shareWithProfile = objectInput.readLong();
		publishWithProfile = objectInput.readLong();
		publishedProfile = objectInput.readUTF();
		version = objectInput.readDouble();
		lessonStatus = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(lessonId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);

		if (lessonName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lessonName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(author);

		if (courseId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(courseId);
		}

		if (appreciatedUserIds == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appreciatedUserIds);
		}

		objectOutput.writeInt(appreciateCount);
		objectOutput.writeLong(uploadedTime);
		objectOutput.writeLong(uploadedById);

		if (uploadedByName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uploadedByName);
		}

		if (lessonNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lessonNote);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(requestLessonId);

		if (lessonPrivacy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lessonPrivacy);
		}

		objectOutput.writeBoolean(featured);

		if (creator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(creator);
		}

		if (secondaryAuthor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secondaryAuthor);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(updatedDate);
		objectOutput.writeLong(updatedBy);

		if (permission == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(permission);
		}

		if (markedAs == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markedAs);
		}

		objectOutput.writeLong(markedBy);

		if (markedContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markedContent);
		}

		objectOutput.writeLong(currentAuthor);
		objectOutput.writeLong(shareWithProfile);
		objectOutput.writeLong(publishWithProfile);

		if (publishedProfile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publishedProfile);
		}

		objectOutput.writeDouble(version);
		objectOutput.writeInt(lessonStatus);
		objectOutput.writeLong(statusByUserId);
		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long lessonId;
	public long companyId;
	public long groupId;
	public String lessonName;
	public String description;
	public long author;
	public String courseId;
	public String appreciatedUserIds;
	public int appreciateCount;
	public long uploadedTime;
	public long uploadedById;
	public String uploadedByName;
	public String lessonNote;
	public String status;
	public long requestLessonId;
	public String lessonPrivacy;
	public boolean featured;
	public String creator;
	public String secondaryAuthor;
	public long createDate;
	public long createBy;
	public long updatedDate;
	public long updatedBy;
	public String permission;
	public String markedAs;
	public long markedBy;
	public String markedContent;
	public long currentAuthor;
	public long shareWithProfile;
	public long publishWithProfile;
	public String publishedProfile;
	public double version;
	public int lessonStatus;
	public long statusByUserId;
	public long statusDate;
}