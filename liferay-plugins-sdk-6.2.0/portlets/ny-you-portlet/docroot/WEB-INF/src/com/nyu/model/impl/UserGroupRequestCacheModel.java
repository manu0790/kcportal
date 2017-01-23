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

import com.nyu.model.UserGroupRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserGroupRequest in entity cache.
 *
 * @author Allwins Rajaiah
 * @see UserGroupRequest
 * @generated
 */
public class UserGroupRequestCacheModel implements CacheModel<UserGroupRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userGroupId=");
		sb.append(userGroupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userGroupOwner=");
		sb.append(userGroupOwner);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", requestedBy=");
		sb.append(requestedBy);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserGroupRequest toEntityModel() {
		UserGroupRequestImpl userGroupRequestImpl = new UserGroupRequestImpl();

		userGroupRequestImpl.setId(id);
		userGroupRequestImpl.setUserGroupId(userGroupId);
		userGroupRequestImpl.setCompanyId(companyId);
		userGroupRequestImpl.setGroupId(groupId);
		userGroupRequestImpl.setUserGroupOwner(userGroupOwner);

		if (requestDate == Long.MIN_VALUE) {
			userGroupRequestImpl.setRequestDate(null);
		}
		else {
			userGroupRequestImpl.setRequestDate(new Date(requestDate));
		}

		userGroupRequestImpl.setRequestedBy(requestedBy);

		if (status == null) {
			userGroupRequestImpl.setStatus(StringPool.BLANK);
		}
		else {
			userGroupRequestImpl.setStatus(status);
		}

		userGroupRequestImpl.resetOriginalValues();

		return userGroupRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userGroupId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userGroupOwner = objectInput.readLong();
		requestDate = objectInput.readLong();
		requestedBy = objectInput.readLong();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userGroupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userGroupOwner);
		objectOutput.writeLong(requestDate);
		objectOutput.writeLong(requestedBy);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long id;
	public long userGroupId;
	public long companyId;
	public long groupId;
	public long userGroupOwner;
	public long requestDate;
	public long requestedBy;
	public String status;
}