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
 * This class is a wrapper for {@link Keywords}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Keywords
 * @generated
 */
public class KeywordsWrapper implements Keywords, ModelWrapper<Keywords> {
	public KeywordsWrapper(Keywords keywords) {
		_keywords = keywords;
	}

	@Override
	public Class<?> getModelClass() {
		return Keywords.class;
	}

	@Override
	public String getModelClassName() {
		return Keywords.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("keyword", getKeyword());
		attributes.put("description", getDescription());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String keyword = (String)attributes.get("keyword");

		if (keyword != null) {
			setKeyword(keyword);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	/**
	* Returns the primary key of this keywords.
	*
	* @return the primary key of this keywords
	*/
	@Override
	public long getPrimaryKey() {
		return _keywords.getPrimaryKey();
	}

	/**
	* Sets the primary key of this keywords.
	*
	* @param primaryKey the primary key of this keywords
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_keywords.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this keywords.
	*
	* @return the ID of this keywords
	*/
	@Override
	public long getId() {
		return _keywords.getId();
	}

	/**
	* Sets the ID of this keywords.
	*
	* @param id the ID of this keywords
	*/
	@Override
	public void setId(long id) {
		_keywords.setId(id);
	}

	/**
	* Returns the company ID of this keywords.
	*
	* @return the company ID of this keywords
	*/
	@Override
	public long getCompanyId() {
		return _keywords.getCompanyId();
	}

	/**
	* Sets the company ID of this keywords.
	*
	* @param companyId the company ID of this keywords
	*/
	@Override
	public void setCompanyId(long companyId) {
		_keywords.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this keywords.
	*
	* @return the group ID of this keywords
	*/
	@Override
	public long getGroupId() {
		return _keywords.getGroupId();
	}

	/**
	* Sets the group ID of this keywords.
	*
	* @param groupId the group ID of this keywords
	*/
	@Override
	public void setGroupId(long groupId) {
		_keywords.setGroupId(groupId);
	}

	/**
	* Returns the keyword of this keywords.
	*
	* @return the keyword of this keywords
	*/
	@Override
	public java.lang.String getKeyword() {
		return _keywords.getKeyword();
	}

	/**
	* Sets the keyword of this keywords.
	*
	* @param keyword the keyword of this keywords
	*/
	@Override
	public void setKeyword(java.lang.String keyword) {
		_keywords.setKeyword(keyword);
	}

	/**
	* Returns the description of this keywords.
	*
	* @return the description of this keywords
	*/
	@Override
	public java.lang.String getDescription() {
		return _keywords.getDescription();
	}

	/**
	* Sets the description of this keywords.
	*
	* @param description the description of this keywords
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_keywords.setDescription(description);
	}

	/**
	* Returns the created date of this keywords.
	*
	* @return the created date of this keywords
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _keywords.getCreatedDate();
	}

	/**
	* Sets the created date of this keywords.
	*
	* @param createdDate the created date of this keywords
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_keywords.setCreatedDate(createdDate);
	}

	/**
	* Returns the created by of this keywords.
	*
	* @return the created by of this keywords
	*/
	@Override
	public long getCreatedBy() {
		return _keywords.getCreatedBy();
	}

	/**
	* Sets the created by of this keywords.
	*
	* @param createdBy the created by of this keywords
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_keywords.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated date of this keywords.
	*
	* @return the updated date of this keywords
	*/
	@Override
	public java.util.Date getUpdatedDate() {
		return _keywords.getUpdatedDate();
	}

	/**
	* Sets the updated date of this keywords.
	*
	* @param updatedDate the updated date of this keywords
	*/
	@Override
	public void setUpdatedDate(java.util.Date updatedDate) {
		_keywords.setUpdatedDate(updatedDate);
	}

	/**
	* Returns the updated by of this keywords.
	*
	* @return the updated by of this keywords
	*/
	@Override
	public long getUpdatedBy() {
		return _keywords.getUpdatedBy();
	}

	/**
	* Sets the updated by of this keywords.
	*
	* @param updatedBy the updated by of this keywords
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_keywords.setUpdatedBy(updatedBy);
	}

	@Override
	public boolean isNew() {
		return _keywords.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keywords.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keywords.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keywords.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keywords.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keywords.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keywords.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keywords.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keywords.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keywords.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keywords.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeywordsWrapper((Keywords)_keywords.clone());
	}

	@Override
	public int compareTo(Keywords keywords) {
		return _keywords.compareTo(keywords);
	}

	@Override
	public int hashCode() {
		return _keywords.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Keywords> toCacheModel() {
		return _keywords.toCacheModel();
	}

	@Override
	public Keywords toEscapedModel() {
		return new KeywordsWrapper(_keywords.toEscapedModel());
	}

	@Override
	public Keywords toUnescapedModel() {
		return new KeywordsWrapper(_keywords.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keywords.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keywords.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keywords.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeywordsWrapper)) {
			return false;
		}

		KeywordsWrapper keywordsWrapper = (KeywordsWrapper)obj;

		if (Validator.equals(_keywords, keywordsWrapper._keywords)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Keywords getWrappedKeywords() {
		return _keywords;
	}

	@Override
	public Keywords getWrappedModel() {
		return _keywords;
	}

	@Override
	public void resetOriginalValues() {
		_keywords.resetOriginalValues();
	}

	private Keywords _keywords;
}