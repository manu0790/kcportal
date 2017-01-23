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

import com.nyu.model.DocumentSection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocumentSection in entity cache.
 *
 * @author Allwins Rajaiah
 * @see DocumentSection
 * @generated
 */
public class DocumentSectionCacheModel implements CacheModel<DocumentSection>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", lessonId=");
		sb.append(lessonId);
		sb.append(", documentId=");
		sb.append(documentId);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", sectionTitle=");
		sb.append(sectionTitle);
		sb.append(", sectionNote=");
		sb.append(sectionNote);
		sb.append(", lessonObjectiveIds=");
		sb.append(lessonObjectiveIds);
		sb.append(", order=");
		sb.append(order);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentSection toEntityModel() {
		DocumentSectionImpl documentSectionImpl = new DocumentSectionImpl();

		documentSectionImpl.setId(id);
		documentSectionImpl.setLessonId(lessonId);
		documentSectionImpl.setDocumentId(documentId);

		if (modifiedDate == Long.MIN_VALUE) {
			documentSectionImpl.setModifiedDate(null);
		}
		else {
			documentSectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sectionTitle == null) {
			documentSectionImpl.setSectionTitle(StringPool.BLANK);
		}
		else {
			documentSectionImpl.setSectionTitle(sectionTitle);
		}

		if (sectionNote == null) {
			documentSectionImpl.setSectionNote(StringPool.BLANK);
		}
		else {
			documentSectionImpl.setSectionNote(sectionNote);
		}

		if (lessonObjectiveIds == null) {
			documentSectionImpl.setLessonObjectiveIds(StringPool.BLANK);
		}
		else {
			documentSectionImpl.setLessonObjectiveIds(lessonObjectiveIds);
		}

		documentSectionImpl.setOrder(order);

		documentSectionImpl.resetOriginalValues();

		return documentSectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		lessonId = objectInput.readLong();
		documentId = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sectionTitle = objectInput.readUTF();
		sectionNote = objectInput.readUTF();
		lessonObjectiveIds = objectInput.readUTF();
		order = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(lessonId);
		objectOutput.writeLong(documentId);
		objectOutput.writeLong(modifiedDate);

		if (sectionTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sectionTitle);
		}

		if (sectionNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sectionNote);
		}

		if (lessonObjectiveIds == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lessonObjectiveIds);
		}

		objectOutput.writeInt(order);
	}

	public long id;
	public long lessonId;
	public long documentId;
	public long modifiedDate;
	public String sectionTitle;
	public String sectionNote;
	public String lessonObjectiveIds;
	public int order;
}