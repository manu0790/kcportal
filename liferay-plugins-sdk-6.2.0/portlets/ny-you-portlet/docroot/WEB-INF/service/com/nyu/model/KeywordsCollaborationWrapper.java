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
 * This class is a wrapper for {@link KeywordsCollaboration}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see KeywordsCollaboration
 * @generated
 */
public class KeywordsCollaborationWrapper implements KeywordsCollaboration,
	ModelWrapper<KeywordsCollaboration> {
	public KeywordsCollaborationWrapper(
		KeywordsCollaboration keywordsCollaboration) {
		_keywordsCollaboration = keywordsCollaboration;
	}

	@Override
	public Class<?> getModelClass() {
		return KeywordsCollaboration.class;
	}

	@Override
	public String getModelClassName() {
		return KeywordsCollaboration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("keywordId", getKeywordId());
		attributes.put("keywordName", getKeywordName());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("status", getStatus());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("markAs", getMarkAs());

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

		Long keywordId = (Long)attributes.get("keywordId");

		if (keywordId != null) {
			setKeywordId(keywordId);
		}

		String keywordName = (String)attributes.get("keywordName");

		if (keywordName != null) {
			setKeywordName(keywordName);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String markAs = (String)attributes.get("markAs");

		if (markAs != null) {
			setMarkAs(markAs);
		}
	}

	/**
	* Returns the primary key of this keywords collaboration.
	*
	* @return the primary key of this keywords collaboration
	*/
	@Override
	public long getPrimaryKey() {
		return _keywordsCollaboration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this keywords collaboration.
	*
	* @param primaryKey the primary key of this keywords collaboration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_keywordsCollaboration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this keywords collaboration.
	*
	* @return the ID of this keywords collaboration
	*/
	@Override
	public long getId() {
		return _keywordsCollaboration.getId();
	}

	/**
	* Sets the ID of this keywords collaboration.
	*
	* @param id the ID of this keywords collaboration
	*/
	@Override
	public void setId(long id) {
		_keywordsCollaboration.setId(id);
	}

	/**
	* Returns the company ID of this keywords collaboration.
	*
	* @return the company ID of this keywords collaboration
	*/
	@Override
	public long getCompanyId() {
		return _keywordsCollaboration.getCompanyId();
	}

	/**
	* Sets the company ID of this keywords collaboration.
	*
	* @param companyId the company ID of this keywords collaboration
	*/
	@Override
	public void setCompanyId(long companyId) {
		_keywordsCollaboration.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this keywords collaboration.
	*
	* @return the group ID of this keywords collaboration
	*/
	@Override
	public long getGroupId() {
		return _keywordsCollaboration.getGroupId();
	}

	/**
	* Sets the group ID of this keywords collaboration.
	*
	* @param groupId the group ID of this keywords collaboration
	*/
	@Override
	public void setGroupId(long groupId) {
		_keywordsCollaboration.setGroupId(groupId);
	}

	/**
	* Returns the keyword ID of this keywords collaboration.
	*
	* @return the keyword ID of this keywords collaboration
	*/
	@Override
	public long getKeywordId() {
		return _keywordsCollaboration.getKeywordId();
	}

	/**
	* Sets the keyword ID of this keywords collaboration.
	*
	* @param keywordId the keyword ID of this keywords collaboration
	*/
	@Override
	public void setKeywordId(long keywordId) {
		_keywordsCollaboration.setKeywordId(keywordId);
	}

	/**
	* Returns the keyword name of this keywords collaboration.
	*
	* @return the keyword name of this keywords collaboration
	*/
	@Override
	public java.lang.String getKeywordName() {
		return _keywordsCollaboration.getKeywordName();
	}

	/**
	* Sets the keyword name of this keywords collaboration.
	*
	* @param keywordName the keyword name of this keywords collaboration
	*/
	@Override
	public void setKeywordName(java.lang.String keywordName) {
		_keywordsCollaboration.setKeywordName(keywordName);
	}

	/**
	* Returns the user ID of this keywords collaboration.
	*
	* @return the user ID of this keywords collaboration
	*/
	@Override
	public long getUserId() {
		return _keywordsCollaboration.getUserId();
	}

	/**
	* Sets the user ID of this keywords collaboration.
	*
	* @param userId the user ID of this keywords collaboration
	*/
	@Override
	public void setUserId(long userId) {
		_keywordsCollaboration.setUserId(userId);
	}

	/**
	* Returns the user uuid of this keywords collaboration.
	*
	* @return the user uuid of this keywords collaboration
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaboration.getUserUuid();
	}

	/**
	* Sets the user uuid of this keywords collaboration.
	*
	* @param userUuid the user uuid of this keywords collaboration
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_keywordsCollaboration.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this keywords collaboration.
	*
	* @return the user name of this keywords collaboration
	*/
	@Override
	public java.lang.String getUserName() {
		return _keywordsCollaboration.getUserName();
	}

	/**
	* Sets the user name of this keywords collaboration.
	*
	* @param userName the user name of this keywords collaboration
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_keywordsCollaboration.setUserName(userName);
	}

	/**
	* Returns the status of this keywords collaboration.
	*
	* @return the status of this keywords collaboration
	*/
	@Override
	public java.lang.String getStatus() {
		return _keywordsCollaboration.getStatus();
	}

	/**
	* Sets the status of this keywords collaboration.
	*
	* @param status the status of this keywords collaboration
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_keywordsCollaboration.setStatus(status);
	}

	/**
	* Returns the created date of this keywords collaboration.
	*
	* @return the created date of this keywords collaboration
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _keywordsCollaboration.getCreatedDate();
	}

	/**
	* Sets the created date of this keywords collaboration.
	*
	* @param createdDate the created date of this keywords collaboration
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_keywordsCollaboration.setCreatedDate(createdDate);
	}

	/**
	* Returns the modified date of this keywords collaboration.
	*
	* @return the modified date of this keywords collaboration
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _keywordsCollaboration.getModifiedDate();
	}

	/**
	* Sets the modified date of this keywords collaboration.
	*
	* @param modifiedDate the modified date of this keywords collaboration
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_keywordsCollaboration.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the mark as of this keywords collaboration.
	*
	* @return the mark as of this keywords collaboration
	*/
	@Override
	public java.lang.String getMarkAs() {
		return _keywordsCollaboration.getMarkAs();
	}

	/**
	* Sets the mark as of this keywords collaboration.
	*
	* @param markAs the mark as of this keywords collaboration
	*/
	@Override
	public void setMarkAs(java.lang.String markAs) {
		_keywordsCollaboration.setMarkAs(markAs);
	}

	@Override
	public boolean isNew() {
		return _keywordsCollaboration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keywordsCollaboration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keywordsCollaboration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keywordsCollaboration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keywordsCollaboration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keywordsCollaboration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keywordsCollaboration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keywordsCollaboration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keywordsCollaboration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keywordsCollaboration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keywordsCollaboration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeywordsCollaborationWrapper((KeywordsCollaboration)_keywordsCollaboration.clone());
	}

	@Override
	public int compareTo(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration) {
		return _keywordsCollaboration.compareTo(keywordsCollaboration);
	}

	@Override
	public int hashCode() {
		return _keywordsCollaboration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.KeywordsCollaboration> toCacheModel() {
		return _keywordsCollaboration.toCacheModel();
	}

	@Override
	public com.nyu.model.KeywordsCollaboration toEscapedModel() {
		return new KeywordsCollaborationWrapper(_keywordsCollaboration.toEscapedModel());
	}

	@Override
	public com.nyu.model.KeywordsCollaboration toUnescapedModel() {
		return new KeywordsCollaborationWrapper(_keywordsCollaboration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keywordsCollaboration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keywordsCollaboration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keywordsCollaboration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeywordsCollaborationWrapper)) {
			return false;
		}

		KeywordsCollaborationWrapper keywordsCollaborationWrapper = (KeywordsCollaborationWrapper)obj;

		if (Validator.equals(_keywordsCollaboration,
					keywordsCollaborationWrapper._keywordsCollaboration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KeywordsCollaboration getWrappedKeywordsCollaboration() {
		return _keywordsCollaboration;
	}

	@Override
	public KeywordsCollaboration getWrappedModel() {
		return _keywordsCollaboration;
	}

	@Override
	public void resetOriginalValues() {
		_keywordsCollaboration.resetOriginalValues();
	}

	private KeywordsCollaboration _keywordsCollaboration;
}