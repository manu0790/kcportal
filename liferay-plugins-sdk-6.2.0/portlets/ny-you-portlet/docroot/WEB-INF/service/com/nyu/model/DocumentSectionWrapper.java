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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocumentSection}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentSection
 * @generated
 */
public class DocumentSectionWrapper implements DocumentSection,
	ModelWrapper<DocumentSection> {
	public DocumentSectionWrapper(DocumentSection documentSection) {
		_documentSection = documentSection;
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentSection.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentSection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("lessonId", getLessonId());
		attributes.put("documentId", getDocumentId());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sectionTitle", getSectionTitle());
		attributes.put("sectionNote", getSectionNote());
		attributes.put("lessonObjectiveIds", getLessonObjectiveIds());
		attributes.put("order", getOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String sectionTitle = (String)attributes.get("sectionTitle");

		if (sectionTitle != null) {
			setSectionTitle(sectionTitle);
		}

		String sectionNote = (String)attributes.get("sectionNote");

		if (sectionNote != null) {
			setSectionNote(sectionNote);
		}

		String lessonObjectiveIds = (String)attributes.get("lessonObjectiveIds");

		if (lessonObjectiveIds != null) {
			setLessonObjectiveIds(lessonObjectiveIds);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}
	}

	/**
	* Returns the primary key of this document section.
	*
	* @return the primary key of this document section
	*/
	@Override
	public long getPrimaryKey() {
		return _documentSection.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document section.
	*
	* @param primaryKey the primary key of this document section
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_documentSection.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this document section.
	*
	* @return the ID of this document section
	*/
	@Override
	public long getId() {
		return _documentSection.getId();
	}

	/**
	* Sets the ID of this document section.
	*
	* @param id the ID of this document section
	*/
	@Override
	public void setId(long id) {
		_documentSection.setId(id);
	}

	/**
	* Returns the lesson ID of this document section.
	*
	* @return the lesson ID of this document section
	*/
	@Override
	public long getLessonId() {
		return _documentSection.getLessonId();
	}

	/**
	* Sets the lesson ID of this document section.
	*
	* @param lessonId the lesson ID of this document section
	*/
	@Override
	public void setLessonId(long lessonId) {
		_documentSection.setLessonId(lessonId);
	}

	/**
	* Returns the document ID of this document section.
	*
	* @return the document ID of this document section
	*/
	@Override
	public long getDocumentId() {
		return _documentSection.getDocumentId();
	}

	/**
	* Sets the document ID of this document section.
	*
	* @param documentId the document ID of this document section
	*/
	@Override
	public void setDocumentId(long documentId) {
		_documentSection.setDocumentId(documentId);
	}

	/**
	* Returns the modified date of this document section.
	*
	* @return the modified date of this document section
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _documentSection.getModifiedDate();
	}

	/**
	* Sets the modified date of this document section.
	*
	* @param modifiedDate the modified date of this document section
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_documentSection.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the section title of this document section.
	*
	* @return the section title of this document section
	*/
	@Override
	public java.lang.String getSectionTitle() {
		return _documentSection.getSectionTitle();
	}

	/**
	* Sets the section title of this document section.
	*
	* @param sectionTitle the section title of this document section
	*/
	@Override
	public void setSectionTitle(java.lang.String sectionTitle) {
		_documentSection.setSectionTitle(sectionTitle);
	}

	/**
	* Returns the section note of this document section.
	*
	* @return the section note of this document section
	*/
	@Override
	public java.lang.String getSectionNote() {
		return _documentSection.getSectionNote();
	}

	/**
	* Sets the section note of this document section.
	*
	* @param sectionNote the section note of this document section
	*/
	@Override
	public void setSectionNote(java.lang.String sectionNote) {
		_documentSection.setSectionNote(sectionNote);
	}

	/**
	* Returns the lesson objective IDs of this document section.
	*
	* @return the lesson objective IDs of this document section
	*/
	@Override
	public java.lang.String getLessonObjectiveIds() {
		return _documentSection.getLessonObjectiveIds();
	}

	/**
	* Sets the lesson objective IDs of this document section.
	*
	* @param lessonObjectiveIds the lesson objective IDs of this document section
	*/
	@Override
	public void setLessonObjectiveIds(java.lang.String lessonObjectiveIds) {
		_documentSection.setLessonObjectiveIds(lessonObjectiveIds);
	}

	/**
	* Returns the order of this document section.
	*
	* @return the order of this document section
	*/
	@Override
	public int getOrder() {
		return _documentSection.getOrder();
	}

	/**
	* Sets the order of this document section.
	*
	* @param order the order of this document section
	*/
	@Override
	public void setOrder(int order) {
		_documentSection.setOrder(order);
	}

	@Override
	public boolean isNew() {
		return _documentSection.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_documentSection.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _documentSection.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_documentSection.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _documentSection.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _documentSection.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_documentSection.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _documentSection.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_documentSection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_documentSection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_documentSection.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentSectionWrapper((DocumentSection)_documentSection.clone());
	}

	@Override
	public int compareTo(com.nyu.model.DocumentSection documentSection) {
		return _documentSection.compareTo(documentSection);
	}

	@Override
	public int hashCode() {
		return _documentSection.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.DocumentSection> toCacheModel() {
		return _documentSection.toCacheModel();
	}

	@Override
	public com.nyu.model.DocumentSection toEscapedModel() {
		return new DocumentSectionWrapper(_documentSection.toEscapedModel());
	}

	@Override
	public com.nyu.model.DocumentSection toUnescapedModel() {
		return new DocumentSectionWrapper(_documentSection.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _documentSection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _documentSection.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_documentSection.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentSectionWrapper)) {
			return false;
		}

		DocumentSectionWrapper documentSectionWrapper = (DocumentSectionWrapper)obj;

		if (Validator.equals(_documentSection,
					documentSectionWrapper._documentSection)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocumentSection getWrappedDocumentSection() {
		return _documentSection;
	}

	@Override
	public DocumentSection getWrappedModel() {
		return _documentSection;
	}

	@Override
	public void resetOriginalValues() {
		_documentSection.resetOriginalValues();
	}

	private DocumentSection _documentSection;
}