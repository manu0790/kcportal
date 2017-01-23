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

import com.nyu.model.KeywordsCollaboration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KeywordsCollaboration in entity cache.
 *
 * @author Allwins Rajaiah
 * @see KeywordsCollaboration
 * @generated
 */
public class KeywordsCollaborationCacheModel implements CacheModel<KeywordsCollaboration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", keywordId=");
		sb.append(keywordId);
		sb.append(", keywordName=");
		sb.append(keywordName);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", status=");
		sb.append(status);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", markAs=");
		sb.append(markAs);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KeywordsCollaboration toEntityModel() {
		KeywordsCollaborationImpl keywordsCollaborationImpl = new KeywordsCollaborationImpl();

		keywordsCollaborationImpl.setId(id);
		keywordsCollaborationImpl.setCompanyId(companyId);
		keywordsCollaborationImpl.setGroupId(groupId);
		keywordsCollaborationImpl.setKeywordId(keywordId);

		if (keywordName == null) {
			keywordsCollaborationImpl.setKeywordName(StringPool.BLANK);
		}
		else {
			keywordsCollaborationImpl.setKeywordName(keywordName);
		}

		keywordsCollaborationImpl.setUserId(userId);

		if (userName == null) {
			keywordsCollaborationImpl.setUserName(StringPool.BLANK);
		}
		else {
			keywordsCollaborationImpl.setUserName(userName);
		}

		if (status == null) {
			keywordsCollaborationImpl.setStatus(StringPool.BLANK);
		}
		else {
			keywordsCollaborationImpl.setStatus(status);
		}

		if (createdDate == Long.MIN_VALUE) {
			keywordsCollaborationImpl.setCreatedDate(null);
		}
		else {
			keywordsCollaborationImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			keywordsCollaborationImpl.setModifiedDate(null);
		}
		else {
			keywordsCollaborationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (markAs == null) {
			keywordsCollaborationImpl.setMarkAs(StringPool.BLANK);
		}
		else {
			keywordsCollaborationImpl.setMarkAs(markAs);
		}

		keywordsCollaborationImpl.resetOriginalValues();

		return keywordsCollaborationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		keywordId = objectInput.readLong();
		keywordName = objectInput.readUTF();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		status = objectInput.readUTF();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		markAs = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(keywordId);

		if (keywordName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keywordName);
		}

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		if (markAs == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markAs);
		}
	}

	public long id;
	public long companyId;
	public long groupId;
	public long keywordId;
	public String keywordName;
	public long userId;
	public String userName;
	public String status;
	public long createdDate;
	public long modifiedDate;
	public String markAs;
}