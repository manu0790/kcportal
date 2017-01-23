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
public class DocumentSectionSoap implements Serializable {
	public static DocumentSectionSoap toSoapModel(DocumentSection model) {
		DocumentSectionSoap soapModel = new DocumentSectionSoap();

		soapModel.setId(model.getId());
		soapModel.setLessonId(model.getLessonId());
		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSectionTitle(model.getSectionTitle());
		soapModel.setSectionNote(model.getSectionNote());
		soapModel.setLessonObjectiveIds(model.getLessonObjectiveIds());
		soapModel.setOrder(model.getOrder());

		return soapModel;
	}

	public static DocumentSectionSoap[] toSoapModels(DocumentSection[] models) {
		DocumentSectionSoap[] soapModels = new DocumentSectionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentSectionSoap[][] toSoapModels(
		DocumentSection[][] models) {
		DocumentSectionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentSectionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentSectionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentSectionSoap[] toSoapModels(
		List<DocumentSection> models) {
		List<DocumentSectionSoap> soapModels = new ArrayList<DocumentSectionSoap>(models.size());

		for (DocumentSection model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentSectionSoap[soapModels.size()]);
	}

	public DocumentSectionSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getLessonId() {
		return _lessonId;
	}

	public void setLessonId(long lessonId) {
		_lessonId = lessonId;
	}

	public long getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getSectionTitle() {
		return _sectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		_sectionTitle = sectionTitle;
	}

	public String getSectionNote() {
		return _sectionNote;
	}

	public void setSectionNote(String sectionNote) {
		_sectionNote = sectionNote;
	}

	public String getLessonObjectiveIds() {
		return _lessonObjectiveIds;
	}

	public void setLessonObjectiveIds(String lessonObjectiveIds) {
		_lessonObjectiveIds = lessonObjectiveIds;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	private long _id;
	private long _lessonId;
	private long _documentId;
	private Date _modifiedDate;
	private String _sectionTitle;
	private String _sectionNote;
	private String _lessonObjectiveIds;
	private int _order;
}