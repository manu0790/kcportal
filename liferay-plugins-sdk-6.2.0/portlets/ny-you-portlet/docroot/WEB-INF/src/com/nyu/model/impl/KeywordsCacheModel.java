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

import com.nyu.model.Keywords;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Keywords in entity cache.
 *
 * @author Allwins Rajaiah
 * @see Keywords
 * @generated
 */
public class KeywordsCacheModel implements CacheModel<Keywords>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", keyword=");
		sb.append(keyword);
		sb.append(", description=");
		sb.append(description);
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
	public Keywords toEntityModel() {
		KeywordsImpl keywordsImpl = new KeywordsImpl();

		keywordsImpl.setId(id);
		keywordsImpl.setCompanyId(companyId);
		keywordsImpl.setGroupId(groupId);

		if (keyword == null) {
			keywordsImpl.setKeyword(StringPool.BLANK);
		}
		else {
			keywordsImpl.setKeyword(keyword);
		}

		if (description == null) {
			keywordsImpl.setDescription(StringPool.BLANK);
		}
		else {
			keywordsImpl.setDescription(description);
		}

		if (createdDate == Long.MIN_VALUE) {
			keywordsImpl.setCreatedDate(null);
		}
		else {
			keywordsImpl.setCreatedDate(new Date(createdDate));
		}

		keywordsImpl.setCreatedBy(createdBy);

		if (updatedDate == Long.MIN_VALUE) {
			keywordsImpl.setUpdatedDate(null);
		}
		else {
			keywordsImpl.setUpdatedDate(new Date(updatedDate));
		}

		keywordsImpl.setUpdatedBy(updatedBy);

		keywordsImpl.resetOriginalValues();

		return keywordsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		keyword = objectInput.readUTF();
		description = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readLong();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);

		if (keyword == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keyword);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updatedDate);
		objectOutput.writeLong(updatedBy);
	}

	public long id;
	public long companyId;
	public long groupId;
	public String keyword;
	public String description;
	public long createdDate;
	public long createdBy;
	public long updatedDate;
	public long updatedBy;
}