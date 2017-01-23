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

import com.nyu.model.UserBadges;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserBadges in entity cache.
 *
 * @author Allwins Rajaiah
 * @see UserBadges
 * @generated
 */
public class UserBadgesCacheModel implements CacheModel<UserBadges>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{userBadgeId=");
		sb.append(userBadgeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", badgeId=");
		sb.append(badgeId);
		sb.append(", badgeUrl=");
		sb.append(badgeUrl);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserBadges toEntityModel() {
		UserBadgesImpl userBadgesImpl = new UserBadgesImpl();

		userBadgesImpl.setUserBadgeId(userBadgeId);
		userBadgesImpl.setUserId(userId);
		userBadgesImpl.setBadgeId(badgeId);

		if (badgeUrl == null) {
			userBadgesImpl.setBadgeUrl(StringPool.BLANK);
		}
		else {
			userBadgesImpl.setBadgeUrl(badgeUrl);
		}

		if (createdDate == Long.MIN_VALUE) {
			userBadgesImpl.setCreatedDate(null);
		}
		else {
			userBadgesImpl.setCreatedDate(new Date(createdDate));
		}

		userBadgesImpl.resetOriginalValues();

		return userBadgesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userBadgeId = objectInput.readLong();
		userId = objectInput.readLong();
		badgeId = objectInput.readLong();
		badgeUrl = objectInput.readUTF();
		createdDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userBadgeId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(badgeId);

		if (badgeUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(badgeUrl);
		}

		objectOutput.writeLong(createdDate);
	}

	public long userBadgeId;
	public long userId;
	public long badgeId;
	public String badgeUrl;
	public long createdDate;
}