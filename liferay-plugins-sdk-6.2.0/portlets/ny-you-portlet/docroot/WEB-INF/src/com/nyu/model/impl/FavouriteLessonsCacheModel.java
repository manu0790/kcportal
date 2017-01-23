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
import com.liferay.portal.model.CacheModel;

import com.nyu.model.FavouriteLessons;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FavouriteLessons in entity cache.
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessons
 * @generated
 */
public class FavouriteLessonsCacheModel implements CacheModel<FavouriteLessons>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", lessonId=");
		sb.append(lessonId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FavouriteLessons toEntityModel() {
		FavouriteLessonsImpl favouriteLessonsImpl = new FavouriteLessonsImpl();

		favouriteLessonsImpl.setUserId(userId);
		favouriteLessonsImpl.setLessonId(lessonId);

		favouriteLessonsImpl.resetOriginalValues();

		return favouriteLessonsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		lessonId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);
		objectOutput.writeLong(lessonId);
	}

	public long userId;
	public long lessonId;
}