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

import com.nyu.model.LessonObjectives;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LessonObjectives in entity cache.
 *
 * @author Allwins Rajaiah
 * @see LessonObjectives
 * @generated
 */
public class LessonObjectivesCacheModel implements CacheModel<LessonObjectives>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", lessonId=");
		sb.append(lessonId);
		sb.append(", objective=");
		sb.append(objective);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LessonObjectives toEntityModel() {
		LessonObjectivesImpl lessonObjectivesImpl = new LessonObjectivesImpl();

		lessonObjectivesImpl.setId(id);
		lessonObjectivesImpl.setLessonId(lessonId);

		if (objective == null) {
			lessonObjectivesImpl.setObjective(StringPool.BLANK);
		}
		else {
			lessonObjectivesImpl.setObjective(objective);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			lessonObjectivesImpl.setModifiedDate(null);
		}
		else {
			lessonObjectivesImpl.setModifiedDate(new Date(modifiedDate));
		}

		lessonObjectivesImpl.resetOriginalValues();

		return lessonObjectivesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		lessonId = objectInput.readLong();
		objective = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(lessonId);

		if (objective == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(objective);
		}

		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public long lessonId;
	public String objective;
	public long modifiedDate;
}