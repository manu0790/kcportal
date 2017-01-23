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

import com.nyu.model.LessonCollaboration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LessonCollaboration in entity cache.
 *
 * @author Allwins Rajaiah
 * @see LessonCollaboration
 * @generated
 */
public class LessonCollaborationCacheModel implements CacheModel<LessonCollaboration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", lessonId=");
		sb.append(lessonId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", memberStatus=");
		sb.append(memberStatus);
		sb.append(", type=");
		sb.append(type);
		sb.append(", accessPermission=");
		sb.append(accessPermission);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LessonCollaboration toEntityModel() {
		LessonCollaborationImpl lessonCollaborationImpl = new LessonCollaborationImpl();

		lessonCollaborationImpl.setId(id);
		lessonCollaborationImpl.setLessonId(lessonId);
		lessonCollaborationImpl.setUserId(userId);

		if (memberStatus == null) {
			lessonCollaborationImpl.setMemberStatus(StringPool.BLANK);
		}
		else {
			lessonCollaborationImpl.setMemberStatus(memberStatus);
		}

		if (type == null) {
			lessonCollaborationImpl.setType(StringPool.BLANK);
		}
		else {
			lessonCollaborationImpl.setType(type);
		}

		if (accessPermission == null) {
			lessonCollaborationImpl.setAccessPermission(StringPool.BLANK);
		}
		else {
			lessonCollaborationImpl.setAccessPermission(accessPermission);
		}

		lessonCollaborationImpl.resetOriginalValues();

		return lessonCollaborationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		lessonId = objectInput.readLong();
		userId = objectInput.readLong();
		memberStatus = objectInput.readUTF();
		type = objectInput.readUTF();
		accessPermission = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(lessonId);
		objectOutput.writeLong(userId);

		if (memberStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(memberStatus);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (accessPermission == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accessPermission);
		}
	}

	public long id;
	public long lessonId;
	public long userId;
	public String memberStatus;
	public String type;
	public String accessPermission;
}