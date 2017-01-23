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

import com.nyu.model.NYUUserGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NYUUserGroup in entity cache.
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroup
 * @generated
 */
public class NYUUserGroupCacheModel implements CacheModel<NYUUserGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userGroupId=");
		sb.append(userGroupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", groupPrivacy=");
		sb.append(groupPrivacy);
		sb.append(", appreciatedUserIds=");
		sb.append(appreciatedUserIds);
		sb.append(", appreciateCount=");
		sb.append(appreciateCount);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedDate=");
		sb.append(updatedDate);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append(", administrators=");
		sb.append(administrators);
		sb.append(", about=");
		sb.append(about);
		sb.append(", title=");
		sb.append(title);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NYUUserGroup toEntityModel() {
		NYUUserGroupImpl nyuUserGroupImpl = new NYUUserGroupImpl();

		if (uuid == null) {
			nyuUserGroupImpl.setUuid(StringPool.BLANK);
		}
		else {
			nyuUserGroupImpl.setUuid(uuid);
		}

		nyuUserGroupImpl.setUserGroupId(userGroupId);
		nyuUserGroupImpl.setCompanyId(companyId);
		nyuUserGroupImpl.setGroupId(groupId);

		if (groupPrivacy == null) {
			nyuUserGroupImpl.setGroupPrivacy(StringPool.BLANK);
		}
		else {
			nyuUserGroupImpl.setGroupPrivacy(groupPrivacy);
		}

		if (appreciatedUserIds == null) {
			nyuUserGroupImpl.setAppreciatedUserIds(StringPool.BLANK);
		}
		else {
			nyuUserGroupImpl.setAppreciatedUserIds(appreciatedUserIds);
		}

		nyuUserGroupImpl.setAppreciateCount(appreciateCount);

		if (createdDate == Long.MIN_VALUE) {
			nyuUserGroupImpl.setCreatedDate(null);
		}
		else {
			nyuUserGroupImpl.setCreatedDate(new Date(createdDate));
		}

		nyuUserGroupImpl.setCreatedBy(createdBy);

		if (updatedDate == Long.MIN_VALUE) {
			nyuUserGroupImpl.setUpdatedDate(null);
		}
		else {
			nyuUserGroupImpl.setUpdatedDate(new Date(updatedDate));
		}

		nyuUserGroupImpl.setUpdatedBy(updatedBy);

		if (administrators == null) {
			nyuUserGroupImpl.setAdministrators(StringPool.BLANK);
		}
		else {
			nyuUserGroupImpl.setAdministrators(administrators);
		}

		if (about == null) {
			nyuUserGroupImpl.setAbout(StringPool.BLANK);
		}
		else {
			nyuUserGroupImpl.setAbout(about);
		}

		if (title == null) {
			nyuUserGroupImpl.setTitle(StringPool.BLANK);
		}
		else {
			nyuUserGroupImpl.setTitle(title);
		}

		nyuUserGroupImpl.setStatus(status);
		nyuUserGroupImpl.setStatusByUserId(statusByUserId);

		if (statusDate == Long.MIN_VALUE) {
			nyuUserGroupImpl.setStatusDate(null);
		}
		else {
			nyuUserGroupImpl.setStatusDate(new Date(statusDate));
		}

		nyuUserGroupImpl.resetOriginalValues();

		return nyuUserGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		userGroupId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		groupPrivacy = objectInput.readUTF();
		appreciatedUserIds = objectInput.readUTF();
		appreciateCount = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readLong();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readLong();
		administrators = objectInput.readUTF();
		about = objectInput.readUTF();
		title = objectInput.readUTF();
		status = objectInput.readInt();
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

		objectOutput.writeLong(userGroupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);

		if (groupPrivacy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupPrivacy);
		}

		if (appreciatedUserIds == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(appreciatedUserIds);
		}

		objectOutput.writeLong(appreciateCount);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updatedDate);
		objectOutput.writeLong(updatedBy);

		if (administrators == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(administrators);
		}

		if (about == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(about);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);
		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long userGroupId;
	public long companyId;
	public long groupId;
	public String groupPrivacy;
	public String appreciatedUserIds;
	public long appreciateCount;
	public long createdDate;
	public long createdBy;
	public long updatedDate;
	public long updatedBy;
	public String administrators;
	public String about;
	public String title;
	public int status;
	public long statusByUserId;
	public long statusDate;
}