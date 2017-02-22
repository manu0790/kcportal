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
 * This class is a wrapper for {@link Basno}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Basno
 * @generated
 */
public class BasnoWrapper implements Basno, ModelWrapper<Basno> {
	public BasnoWrapper(Basno basno) {
		_basno = basno;
	}

	@Override
	public Class<?> getModelClass() {
		return Basno.class;
	}

	@Override
	public String getModelClassName() {
		return Basno.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("badgeId", getBadgeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("badgeName", getBadgeName());
		attributes.put("badgeUrl", getBadgeUrl());
		attributes.put("description", getDescription());
		attributes.put("targetPoints", getTargetPoints());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long badgeId = (Long)attributes.get("badgeId");

		if (badgeId != null) {
			setBadgeId(badgeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String badgeName = (String)attributes.get("badgeName");

		if (badgeName != null) {
			setBadgeName(badgeName);
		}

		String badgeUrl = (String)attributes.get("badgeUrl");

		if (badgeUrl != null) {
			setBadgeUrl(badgeUrl);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long targetPoints = (Long)attributes.get("targetPoints");

		if (targetPoints != null) {
			setTargetPoints(targetPoints);
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
	* Returns the primary key of this basno.
	*
	* @return the primary key of this basno
	*/
	@Override
	public long getPrimaryKey() {
		return _basno.getPrimaryKey();
	}

	/**
	* Sets the primary key of this basno.
	*
	* @param primaryKey the primary key of this basno
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_basno.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the badge ID of this basno.
	*
	* @return the badge ID of this basno
	*/
	@Override
	public long getBadgeId() {
		return _basno.getBadgeId();
	}

	/**
	* Sets the badge ID of this basno.
	*
	* @param badgeId the badge ID of this basno
	*/
	@Override
	public void setBadgeId(long badgeId) {
		_basno.setBadgeId(badgeId);
	}

	/**
	* Returns the company ID of this basno.
	*
	* @return the company ID of this basno
	*/
	@Override
	public long getCompanyId() {
		return _basno.getCompanyId();
	}

	/**
	* Sets the company ID of this basno.
	*
	* @param companyId the company ID of this basno
	*/
	@Override
	public void setCompanyId(long companyId) {
		_basno.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this basno.
	*
	* @return the group ID of this basno
	*/
	@Override
	public long getGroupId() {
		return _basno.getGroupId();
	}

	/**
	* Sets the group ID of this basno.
	*
	* @param groupId the group ID of this basno
	*/
	@Override
	public void setGroupId(long groupId) {
		_basno.setGroupId(groupId);
	}

	/**
	* Returns the badge name of this basno.
	*
	* @return the badge name of this basno
	*/
	@Override
	public java.lang.String getBadgeName() {
		return _basno.getBadgeName();
	}

	/**
	* Sets the badge name of this basno.
	*
	* @param badgeName the badge name of this basno
	*/
	@Override
	public void setBadgeName(java.lang.String badgeName) {
		_basno.setBadgeName(badgeName);
	}

	/**
	* Returns the badge url of this basno.
	*
	* @return the badge url of this basno
	*/
	@Override
	public java.lang.String getBadgeUrl() {
		return _basno.getBadgeUrl();
	}

	/**
	* Sets the badge url of this basno.
	*
	* @param badgeUrl the badge url of this basno
	*/
	@Override
	public void setBadgeUrl(java.lang.String badgeUrl) {
		_basno.setBadgeUrl(badgeUrl);
	}

	/**
	* Returns the description of this basno.
	*
	* @return the description of this basno
	*/
	@Override
	public java.lang.String getDescription() {
		return _basno.getDescription();
	}

	/**
	* Sets the description of this basno.
	*
	* @param description the description of this basno
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_basno.setDescription(description);
	}

	/**
	* Returns the target points of this basno.
	*
	* @return the target points of this basno
	*/
	@Override
	public long getTargetPoints() {
		return _basno.getTargetPoints();
	}

	/**
	* Sets the target points of this basno.
	*
	* @param targetPoints the target points of this basno
	*/
	@Override
	public void setTargetPoints(long targetPoints) {
		_basno.setTargetPoints(targetPoints);
	}

	/**
	* Returns the created date of this basno.
	*
	* @return the created date of this basno
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _basno.getCreatedDate();
	}

	/**
	* Sets the created date of this basno.
	*
	* @param createdDate the created date of this basno
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_basno.setCreatedDate(createdDate);
	}

	/**
	* Returns the created by of this basno.
	*
	* @return the created by of this basno
	*/
	@Override
	public long getCreatedBy() {
		return _basno.getCreatedBy();
	}

	/**
	* Sets the created by of this basno.
	*
	* @param createdBy the created by of this basno
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_basno.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated date of this basno.
	*
	* @return the updated date of this basno
	*/
	@Override
	public java.util.Date getUpdatedDate() {
		return _basno.getUpdatedDate();
	}

	/**
	* Sets the updated date of this basno.
	*
	* @param updatedDate the updated date of this basno
	*/
	@Override
	public void setUpdatedDate(java.util.Date updatedDate) {
		_basno.setUpdatedDate(updatedDate);
	}

	/**
	* Returns the updated by of this basno.
	*
	* @return the updated by of this basno
	*/
	@Override
	public long getUpdatedBy() {
		return _basno.getUpdatedBy();
	}

	/**
	* Sets the updated by of this basno.
	*
	* @param updatedBy the updated by of this basno
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_basno.setUpdatedBy(updatedBy);
	}

	@Override
	public boolean isNew() {
		return _basno.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_basno.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _basno.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_basno.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _basno.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _basno.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_basno.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _basno.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_basno.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_basno.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_basno.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BasnoWrapper((Basno)_basno.clone());
	}

	@Override
	public int compareTo(Basno basno) {
		return _basno.compareTo(basno);
	}

	@Override
	public int hashCode() {
		return _basno.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Basno> toCacheModel() {
		return _basno.toCacheModel();
	}

	@Override
	public Basno toEscapedModel() {
		return new BasnoWrapper(_basno.toEscapedModel());
	}

	@Override
	public Basno toUnescapedModel() {
		return new BasnoWrapper(_basno.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _basno.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _basno.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_basno.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BasnoWrapper)) {
			return false;
		}

		BasnoWrapper basnoWrapper = (BasnoWrapper)obj;

		if (Validator.equals(_basno, basnoWrapper._basno)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Basno getWrappedBasno() {
		return _basno;
	}

	@Override
	public Basno getWrappedModel() {
		return _basno;
	}

	@Override
	public void resetOriginalValues() {
		_basno.resetOriginalValues();
	}

	private Basno _basno;
}