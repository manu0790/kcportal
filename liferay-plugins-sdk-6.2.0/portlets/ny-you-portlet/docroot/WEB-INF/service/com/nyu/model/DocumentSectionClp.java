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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.nyu.service.ClpSerializer;
import com.nyu.service.DocumentSectionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class DocumentSectionClp extends BaseModelImpl<DocumentSection>
	implements DocumentSection {
	public DocumentSectionClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_documentSectionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_lessonId = lessonId;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_documentSectionRemoteModel, lessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentId() {
		return _documentId;
	}

	@Override
	public void setDocumentId(long documentId) {
		_documentId = documentId;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentId", long.class);

				method.invoke(_documentSectionRemoteModel, documentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_documentSectionRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSectionTitle() {
		return _sectionTitle;
	}

	@Override
	public void setSectionTitle(String sectionTitle) {
		_sectionTitle = sectionTitle;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSectionTitle", String.class);

				method.invoke(_documentSectionRemoteModel, sectionTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSectionNote() {
		return _sectionNote;
	}

	@Override
	public void setSectionNote(String sectionNote) {
		_sectionNote = sectionNote;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSectionNote", String.class);

				method.invoke(_documentSectionRemoteModel, sectionNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLessonObjectiveIds() {
		return _lessonObjectiveIds;
	}

	@Override
	public void setLessonObjectiveIds(String lessonObjectiveIds) {
		_lessonObjectiveIds = lessonObjectiveIds;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonObjectiveIds",
						String.class);

				method.invoke(_documentSectionRemoteModel, lessonObjectiveIds);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOrder() {
		return _order;
	}

	@Override
	public void setOrder(int order) {
		_order = order;

		if (_documentSectionRemoteModel != null) {
			try {
				Class<?> clazz = _documentSectionRemoteModel.getClass();

				Method method = clazz.getMethod("setOrder", int.class);

				method.invoke(_documentSectionRemoteModel, order);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocumentSectionRemoteModel() {
		return _documentSectionRemoteModel;
	}

	public void setDocumentSectionRemoteModel(
		BaseModel<?> documentSectionRemoteModel) {
		_documentSectionRemoteModel = documentSectionRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _documentSectionRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_documentSectionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentSectionLocalServiceUtil.addDocumentSection(this);
		}
		else {
			DocumentSectionLocalServiceUtil.updateDocumentSection(this);
		}
	}

	@Override
	public DocumentSection toEscapedModel() {
		return (DocumentSection)ProxyUtil.newProxyInstance(DocumentSection.class.getClassLoader(),
			new Class[] { DocumentSection.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentSectionClp clone = new DocumentSectionClp();

		clone.setId(getId());
		clone.setLessonId(getLessonId());
		clone.setDocumentId(getDocumentId());
		clone.setModifiedDate(getModifiedDate());
		clone.setSectionTitle(getSectionTitle());
		clone.setSectionNote(getSectionNote());
		clone.setLessonObjectiveIds(getLessonObjectiveIds());
		clone.setOrder(getOrder());

		return clone;
	}

	@Override
	public int compareTo(DocumentSection documentSection) {
		int value = 0;

		if (getOrder() < documentSection.getOrder()) {
			value = -1;
		}
		else if (getOrder() > documentSection.getOrder()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentSectionClp)) {
			return false;
		}

		DocumentSectionClp documentSection = (DocumentSectionClp)obj;

		long primaryKey = documentSection.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", lessonId=");
		sb.append(getLessonId());
		sb.append(", documentId=");
		sb.append(getDocumentId());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", sectionTitle=");
		sb.append(getSectionTitle());
		sb.append(", sectionNote=");
		sb.append(getSectionNote());
		sb.append(", lessonObjectiveIds=");
		sb.append(getLessonObjectiveIds());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.DocumentSection");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentId</column-name><column-value><![CDATA[");
		sb.append(getDocumentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sectionTitle</column-name><column-value><![CDATA[");
		sb.append(getSectionTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sectionNote</column-name><column-value><![CDATA[");
		sb.append(getSectionNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonObjectiveIds</column-name><column-value><![CDATA[");
		sb.append(getLessonObjectiveIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _lessonId;
	private long _documentId;
	private Date _modifiedDate;
	private String _sectionTitle;
	private String _sectionNote;
	private String _lessonObjectiveIds;
	private int _order;
	private BaseModel<?> _documentSectionRemoteModel;
}