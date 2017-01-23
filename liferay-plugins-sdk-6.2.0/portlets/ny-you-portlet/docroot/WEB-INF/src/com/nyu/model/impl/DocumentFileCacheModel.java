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

import com.nyu.model.DocumentFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocumentFile in entity cache.
 *
 * @author Allwins Rajaiah
 * @see DocumentFile
 * @generated
 */
public class DocumentFileCacheModel implements CacheModel<DocumentFile>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{documentId=");
		sb.append(documentId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", lessonId=");
		sb.append(lessonId);
		sb.append(", sectionId=");
		sb.append(sectionId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentDesc=");
		sb.append(documentDesc);
		sb.append(", documentPath=");
		sb.append(documentPath);
		sb.append(", resourceId=");
		sb.append(resourceId);
		sb.append(", collectionId=");
		sb.append(collectionId);
		sb.append(", resourceType=");
		sb.append(resourceType);
		sb.append(", downloadUrl=");
		sb.append(downloadUrl);
		sb.append(", docUuid=");
		sb.append(docUuid);
		sb.append(", hasAutoTranscript=");
		sb.append(hasAutoTranscript);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", permission=");
		sb.append(permission);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentFile toEntityModel() {
		DocumentFileImpl documentFileImpl = new DocumentFileImpl();

		documentFileImpl.setDocumentId(documentId);
		documentFileImpl.setCompanyId(companyId);
		documentFileImpl.setGroupId(groupId);
		documentFileImpl.setLessonId(lessonId);
		documentFileImpl.setSectionId(sectionId);

		if (documentName == null) {
			documentFileImpl.setDocumentName(StringPool.BLANK);
		}
		else {
			documentFileImpl.setDocumentName(documentName);
		}

		if (documentDesc == null) {
			documentFileImpl.setDocumentDesc(StringPool.BLANK);
		}
		else {
			documentFileImpl.setDocumentDesc(documentDesc);
		}

		if (documentPath == null) {
			documentFileImpl.setDocumentPath(StringPool.BLANK);
		}
		else {
			documentFileImpl.setDocumentPath(documentPath);
		}

		documentFileImpl.setResourceId(resourceId);
		documentFileImpl.setCollectionId(collectionId);

		if (resourceType == null) {
			documentFileImpl.setResourceType(StringPool.BLANK);
		}
		else {
			documentFileImpl.setResourceType(resourceType);
		}

		if (downloadUrl == null) {
			documentFileImpl.setDownloadUrl(StringPool.BLANK);
		}
		else {
			documentFileImpl.setDownloadUrl(downloadUrl);
		}

		if (docUuid == null) {
			documentFileImpl.setDocUuid(StringPool.BLANK);
		}
		else {
			documentFileImpl.setDocUuid(docUuid);
		}

		if (hasAutoTranscript == null) {
			documentFileImpl.setHasAutoTranscript(StringPool.BLANK);
		}
		else {
			documentFileImpl.setHasAutoTranscript(hasAutoTranscript);
		}

		if (createdDate == Long.MIN_VALUE) {
			documentFileImpl.setCreatedDate(null);
		}
		else {
			documentFileImpl.setCreatedDate(new Date(createdDate));
		}

		if (permission == null) {
			documentFileImpl.setPermission(StringPool.BLANK);
		}
		else {
			documentFileImpl.setPermission(permission);
		}

		if (status == null) {
			documentFileImpl.setStatus(StringPool.BLANK);
		}
		else {
			documentFileImpl.setStatus(status);
		}

		documentFileImpl.resetOriginalValues();

		return documentFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		documentId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		lessonId = objectInput.readLong();
		sectionId = objectInput.readLong();
		documentName = objectInput.readUTF();
		documentDesc = objectInput.readUTF();
		documentPath = objectInput.readUTF();
		resourceId = objectInput.readLong();
		collectionId = objectInput.readLong();
		resourceType = objectInput.readUTF();
		downloadUrl = objectInput.readUTF();
		docUuid = objectInput.readUTF();
		hasAutoTranscript = objectInput.readUTF();
		createdDate = objectInput.readLong();
		permission = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(documentId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(lessonId);
		objectOutput.writeLong(sectionId);

		if (documentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (documentDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentDesc);
		}

		if (documentPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentPath);
		}

		objectOutput.writeLong(resourceId);
		objectOutput.writeLong(collectionId);

		if (resourceType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resourceType);
		}

		if (downloadUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(downloadUrl);
		}

		if (docUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docUuid);
		}

		if (hasAutoTranscript == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hasAutoTranscript);
		}

		objectOutput.writeLong(createdDate);

		if (permission == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(permission);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long documentId;
	public long companyId;
	public long groupId;
	public long lessonId;
	public long sectionId;
	public String documentName;
	public String documentDesc;
	public String documentPath;
	public long resourceId;
	public long collectionId;
	public String resourceType;
	public String downloadUrl;
	public String docUuid;
	public String hasAutoTranscript;
	public long createdDate;
	public String permission;
	public String status;
}