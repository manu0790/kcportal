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

import com.nyu.model.Slides;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Slides in entity cache.
 *
 * @author Allwins Rajaiah
 * @see Slides
 * @generated
 */
public class SlidesCacheModel implements CacheModel<Slides>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", description=");
		sb.append(description);
		sb.append(", descPosition=");
		sb.append(descPosition);
		sb.append(", imageLink=");
		sb.append(imageLink);
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
	public Slides toEntityModel() {
		SlidesImpl slidesImpl = new SlidesImpl();

		slidesImpl.setId(id);

		if (description == null) {
			slidesImpl.setDescription(StringPool.BLANK);
		}
		else {
			slidesImpl.setDescription(description);
		}

		if (descPosition == null) {
			slidesImpl.setDescPosition(StringPool.BLANK);
		}
		else {
			slidesImpl.setDescPosition(descPosition);
		}

		if (imageLink == null) {
			slidesImpl.setImageLink(StringPool.BLANK);
		}
		else {
			slidesImpl.setImageLink(imageLink);
		}

		if (createdDate == Long.MIN_VALUE) {
			slidesImpl.setCreatedDate(null);
		}
		else {
			slidesImpl.setCreatedDate(new Date(createdDate));
		}

		slidesImpl.setCreatedBy(createdBy);

		if (updatedDate == Long.MIN_VALUE) {
			slidesImpl.setUpdatedDate(null);
		}
		else {
			slidesImpl.setUpdatedDate(new Date(updatedDate));
		}

		slidesImpl.setUpdatedBy(updatedBy);

		slidesImpl.resetOriginalValues();

		return slidesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		description = objectInput.readUTF();
		descPosition = objectInput.readUTF();
		imageLink = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readLong();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (descPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descPosition);
		}

		if (imageLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageLink);
		}

		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updatedDate);
		objectOutput.writeLong(updatedBy);
	}

	public long id;
	public String description;
	public String descPosition;
	public String imageLink;
	public long createdDate;
	public long createdBy;
	public long updatedDate;
	public long updatedBy;
}