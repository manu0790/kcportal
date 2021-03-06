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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.nyu.model.DocumentSection;
import com.nyu.model.DocumentSectionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DocumentSection service. Represents a row in the &quot;nyyou_DocumentSection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.nyu.model.DocumentSectionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentSectionImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentSectionImpl
 * @see com.nyu.model.DocumentSection
 * @see com.nyu.model.DocumentSectionModel
 * @generated
 */
public class DocumentSectionModelImpl extends BaseModelImpl<DocumentSection>
	implements DocumentSectionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document section model instance should use the {@link com.nyu.model.DocumentSection} interface instead.
	 */
	public static final String TABLE_NAME = "nyyou_DocumentSection";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "lessonId", Types.BIGINT },
			{ "documentId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "sectionTitle", Types.VARCHAR },
			{ "sectionNote", Types.VARCHAR },
			{ "lessonObjectiveIds", Types.VARCHAR },
			{ "order_", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table nyyou_DocumentSection (id_ LONG not null primary key IDENTITY,lessonId LONG,documentId LONG,modifiedDate DATE null,sectionTitle VARCHAR(500) null,sectionNote TEXT null,lessonObjectiveIds TEXT null,order_ INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table nyyou_DocumentSection";
	public static final String ORDER_BY_JPQL = " ORDER BY documentSection.order ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nyyou_DocumentSection.order_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nyu.model.DocumentSection"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nyu.model.DocumentSection"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nyu.model.DocumentSection"),
			true);
	public static long LESSONID_COLUMN_BITMASK = 1L;
	public static long ORDER_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.nyu.model.DocumentSection"));

	public DocumentSectionModelImpl() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_columnBitmask |= LESSONID_COLUMN_BITMASK;

		if (!_setOriginalLessonId) {
			_setOriginalLessonId = true;

			_originalLessonId = _lessonId;
		}

		_lessonId = lessonId;
	}

	public long getOriginalLessonId() {
		return _originalLessonId;
	}

	@Override
	public long getDocumentId() {
		return _documentId;
	}

	@Override
	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getSectionTitle() {
		if (_sectionTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _sectionTitle;
		}
	}

	@Override
	public void setSectionTitle(String sectionTitle) {
		_sectionTitle = sectionTitle;
	}

	@Override
	public String getSectionNote() {
		if (_sectionNote == null) {
			return StringPool.BLANK;
		}
		else {
			return _sectionNote;
		}
	}

	@Override
	public void setSectionNote(String sectionNote) {
		_sectionNote = sectionNote;
	}

	@Override
	public String getLessonObjectiveIds() {
		if (_lessonObjectiveIds == null) {
			return StringPool.BLANK;
		}
		else {
			return _lessonObjectiveIds;
		}
	}

	@Override
	public void setLessonObjectiveIds(String lessonObjectiveIds) {
		_lessonObjectiveIds = lessonObjectiveIds;
	}

	@Override
	public int getOrder() {
		return _order;
	}

	@Override
	public void setOrder(int order) {
		_columnBitmask = -1L;

		_order = order;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DocumentSection.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DocumentSection toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DocumentSection)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocumentSectionImpl documentSectionImpl = new DocumentSectionImpl();

		documentSectionImpl.setId(getId());
		documentSectionImpl.setLessonId(getLessonId());
		documentSectionImpl.setDocumentId(getDocumentId());
		documentSectionImpl.setModifiedDate(getModifiedDate());
		documentSectionImpl.setSectionTitle(getSectionTitle());
		documentSectionImpl.setSectionNote(getSectionNote());
		documentSectionImpl.setLessonObjectiveIds(getLessonObjectiveIds());
		documentSectionImpl.setOrder(getOrder());

		documentSectionImpl.resetOriginalValues();

		return documentSectionImpl;
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

		if (!(obj instanceof DocumentSection)) {
			return false;
		}

		DocumentSection documentSection = (DocumentSection)obj;

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
	public void resetOriginalValues() {
		DocumentSectionModelImpl documentSectionModelImpl = this;

		documentSectionModelImpl._originalLessonId = documentSectionModelImpl._lessonId;

		documentSectionModelImpl._setOriginalLessonId = false;

		documentSectionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocumentSection> toCacheModel() {
		DocumentSectionCacheModel documentSectionCacheModel = new DocumentSectionCacheModel();

		documentSectionCacheModel.id = getId();

		documentSectionCacheModel.lessonId = getLessonId();

		documentSectionCacheModel.documentId = getDocumentId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			documentSectionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			documentSectionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		documentSectionCacheModel.sectionTitle = getSectionTitle();

		String sectionTitle = documentSectionCacheModel.sectionTitle;

		if ((sectionTitle != null) && (sectionTitle.length() == 0)) {
			documentSectionCacheModel.sectionTitle = null;
		}

		documentSectionCacheModel.sectionNote = getSectionNote();

		String sectionNote = documentSectionCacheModel.sectionNote;

		if ((sectionNote != null) && (sectionNote.length() == 0)) {
			documentSectionCacheModel.sectionNote = null;
		}

		documentSectionCacheModel.lessonObjectiveIds = getLessonObjectiveIds();

		String lessonObjectiveIds = documentSectionCacheModel.lessonObjectiveIds;

		if ((lessonObjectiveIds != null) && (lessonObjectiveIds.length() == 0)) {
			documentSectionCacheModel.lessonObjectiveIds = null;
		}

		documentSectionCacheModel.order = getOrder();

		return documentSectionCacheModel;
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

	private static ClassLoader _classLoader = DocumentSection.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DocumentSection.class
		};
	private long _id;
	private long _lessonId;
	private long _originalLessonId;
	private boolean _setOriginalLessonId;
	private long _documentId;
	private Date _modifiedDate;
	private String _sectionTitle;
	private String _sectionNote;
	private String _lessonObjectiveIds;
	private int _order;
	private long _columnBitmask;
	private DocumentSection _escapedModel;
}