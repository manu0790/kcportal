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

import com.nyu.model.Basno;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Basno in entity cache.
 *
 * @author Allwins Rajaiah
 * @see Basno
 * @generated
 */
public class BasnoCacheModel implements CacheModel<Basno>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{badgeId=");
		sb.append(badgeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", badgeName=");
		sb.append(badgeName);
		sb.append(", badgeUrl=");
		sb.append(badgeUrl);
		sb.append(", description=");
		sb.append(description);
		sb.append(", targetPoints=");
		sb.append(targetPoints);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedDate=");
		sb.append(updatedDate);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Basno toEntityModel() {
		BasnoImpl basnoImpl = new BasnoImpl();

		basnoImpl.setBadgeId(badgeId);
		basnoImpl.setCompanyId(companyId);
		basnoImpl.setGroupId(groupId);

		if (badgeName == null) {
			basnoImpl.setBadgeName(StringPool.BLANK);
		}
		else {
			basnoImpl.setBadgeName(badgeName);
		}

		if (badgeUrl == null) {
			basnoImpl.setBadgeUrl(StringPool.BLANK);
		}
		else {
			basnoImpl.setBadgeUrl(badgeUrl);
		}

		if (description == null) {
			basnoImpl.setDescription(StringPool.BLANK);
		}
		else {
			basnoImpl.setDescription(description);
		}

		basnoImpl.setTargetPoints(targetPoints);

		if (createdDate == Long.MIN_VALUE) {
			basnoImpl.setCreatedDate(null);
		}
		else {
			basnoImpl.setCreatedDate(new Date(createdDate));
		}

		basnoImpl.setCreatedBy(createdBy);

		if (updatedDate == Long.MIN_VALUE) {
			basnoImpl.setUpdatedDate(null);
		}
		else {
			basnoImpl.setUpdatedDate(new Date(updatedDate));
		}

		basnoImpl.setUpdatedBy(updatedBy);

		basnoImpl.resetOriginalValues();

		return basnoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		badgeId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		badgeName = objectInput.readUTF();
		badgeUrl = objectInput.readUTF();
		description = objectInput.readUTF();
		targetPoints = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readLong();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(badgeId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);

		if (badgeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(badgeName);
		}

		if (badgeUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(badgeUrl);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(targetPoints);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updatedDate);
		objectOutput.writeLong(updatedBy);
	}

	public long badgeId;
	public long companyId;
	public long groupId;
	public String badgeName;
	public String badgeUrl;
	public String description;
	public long targetPoints;
	public long createdDate;
	public long createdBy;
	public long updatedDate;
	public long updatedBy;
}