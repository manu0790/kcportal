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

package com.nyu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Allwins Rajaiah
 * @generated
 */
public class DocumentFileSoap implements Serializable {
	public static DocumentFileSoap toSoapModel(DocumentFile model) {
		DocumentFileSoap soapModel = new DocumentFileSoap();

		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setLessonId(model.getLessonId());
		soapModel.setSectionId(model.getSectionId());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentDesc(model.getDocumentDesc());
		soapModel.setDocumentPath(model.getDocumentPath());
		soapModel.setResourceId(model.getResourceId());
		soapModel.setCollectionId(model.getCollectionId());
		soapModel.setResourceType(model.getResourceType());
		soapModel.setDownloadUrl(model.getDownloadUrl());
		soapModel.setDocUuid(model.getDocUuid());
		soapModel.setHasAutoTranscript(model.getHasAutoTranscript());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setPermission(model.getPermission());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static DocumentFileSoap[] toSoapModels(DocumentFile[] models) {
		DocumentFileSoap[] soapModels = new DocumentFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentFileSoap[][] toSoapModels(DocumentFile[][] models) {
		DocumentFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentFileSoap[] toSoapModels(List<DocumentFile> models) {
		List<DocumentFileSoap> soapModels = new ArrayList<DocumentFileSoap>(models.size());

		for (DocumentFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentFileSoap[soapModels.size()]);
	}

	public DocumentFileSoap() {
	}

	public long getPrimaryKey() {
		return _documentId;
	}

	public void setPrimaryKey(long pk) {
		setDocumentId(pk);
	}

	public long getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getLessonId() {
		return _lessonId;
	}

	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
	}

	public long getSectionId() {
		return _sectionId;
	}

	public void setSectionId(long sectionId) {
		_sectionId = sectionId;
	}

	public String getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(String documentName) {
		_documentName = documentName;
	}

	public String getDocumentDesc() {
		return _documentDesc;
	}

	public void setDocumentDesc(String documentDesc) {
		_documentDesc = documentDesc;
	}

	public String getDocumentPath() {
		return _documentPath;
	}

	public void setDocumentPath(String documentPath) {
		_documentPath = documentPath;
	}

	public long getResourceId() {
		return _resourceId;
	}

	public void setResourceId(long resourceId) {
		_resourceId = resourceId;
	}

	public long getCollectionId() {
		return _collectionId;
	}

	public void setCollectionId(long collectionId) {
		_collectionId = collectionId;
	}

	public String getResourceType() {
		return _resourceType;
	}

	public void setResourceType(String resourceType) {
		_resourceType = resourceType;
	}

	public String getDownloadUrl() {
		return _downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		_downloadUrl = downloadUrl;
	}

	public String getDocUuid() {
		return _docUuid;
	}

	public void setDocUuid(String docUuid) {
		_docUuid = docUuid;
	}

	public String getHasAutoTranscript() {
		return _hasAutoTranscript;
	}

	public void setHasAutoTranscript(String hasAutoTranscript) {
		_hasAutoTranscript = hasAutoTranscript;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getPermission() {
		return _permission;
	}

	public void setPermission(String permission) {
		_permission = permission;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _documentId;
	private long _companyId;
	private long _groupId;
	private long _lessonId;
	private long _sectionId;
	private String _documentName;
	private String _documentDesc;
	private String _documentPath;
	private long _resourceId;
	private long _collectionId;
	private String _resourceType;
	private String _downloadUrl;
	private String _docUuid;
	private String _hasAutoTranscript;
	private Date _createdDate;
	private String _permission;
	private String _status;
}