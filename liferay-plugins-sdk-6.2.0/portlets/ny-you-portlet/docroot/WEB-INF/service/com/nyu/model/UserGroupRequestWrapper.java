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
 * This class is a wrapper for {@link UserGroupRequest}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserGroupRequest
 * @generated
 */
public class UserGroupRequestWrapper implements UserGroupRequest,
	ModelWrapper<UserGroupRequest> {
	public UserGroupRequestWrapper(UserGroupRequest userGroupRequest) {
		_userGroupRequest = userGroupRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return UserGroupRequest.class;
	}

	@Override
	public String getModelClassName() {
		return UserGroupRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userGroupId", getUserGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userGroupOwner", getUserGroupOwner());
		attributes.put("requestDate", getRequestDate());
		attributes.put("requestedBy", getRequestedBy());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userGroupId = (Long)attributes.get("userGroupId");

		if (userGroupId != null) {
			setUserGroupId(userGroupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userGroupOwner = (Long)attributes.get("userGroupOwner");

		if (userGroupOwner != null) {
			setUserGroupOwner(userGroupOwner);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Long requestedBy = (Long)attributes.get("requestedBy");

		if (requestedBy != null) {
			setRequestedBy(requestedBy);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this user group request.
	*
	* @return the primary key of this user group request
	*/
	@Override
	public long getPrimaryKey() {
		return _userGroupRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user group request.
	*
	* @param primaryKey the primary key of this user group request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userGroupRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user group request.
	*
	* @return the ID of this user group request
	*/
	@Override
	public long getId() {
		return _userGroupRequest.getId();
	}

	/**
	* Sets the ID of this user group request.
	*
	* @param id the ID of this user group request
	*/
	@Override
	public void setId(long id) {
		_userGroupRequest.setId(id);
	}

	/**
	* Returns the user group ID of this user group request.
	*
	* @return the user group ID of this user group request
	*/
	@Override
	public long getUserGroupId() {
		return _userGroupRequest.getUserGroupId();
	}

	/**
	* Sets the user group ID of this user group request.
	*
	* @param userGroupId the user group ID of this user group request
	*/
	@Override
	public void setUserGroupId(long userGroupId) {
		_userGroupRequest.setUserGroupId(userGroupId);
	}

	/**
	* Returns the company ID of this user group request.
	*
	* @return the company ID of this user group request
	*/
	@Override
	public long getCompanyId() {
		return _userGroupRequest.getCompanyId();
	}

	/**
	* Sets the company ID of this user group request.
	*
	* @param companyId the company ID of this user group request
	*/
	@Override
	public void setCompanyId(long companyId) {
		_userGroupRequest.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this user group request.
	*
	* @return the group ID of this user group request
	*/
	@Override
	public long getGroupId() {
		return _userGroupRequest.getGroupId();
	}

	/**
	* Sets the group ID of this user group request.
	*
	* @param groupId the group ID of this user group request
	*/
	@Override
	public void setGroupId(long groupId) {
		_userGroupRequest.setGroupId(groupId);
	}

	/**
	* Returns the user group owner of this user group request.
	*
	* @return the user group owner of this user group request
	*/
	@Override
	public long getUserGroupOwner() {
		return _userGroupRequest.getUserGroupOwner();
	}

	/**
	* Sets the user group owner of this user group request.
	*
	* @param userGroupOwner the user group owner of this user group request
	*/
	@Override
	public void setUserGroupOwner(long userGroupOwner) {
		_userGroupRequest.setUserGroupOwner(userGroupOwner);
	}

	/**
	* Returns the request date of this user group request.
	*
	* @return the request date of this user group request
	*/
	@Override
	public java.util.Date getRequestDate() {
		return _userGroupRequest.getRequestDate();
	}

	/**
	* Sets the request date of this user group request.
	*
	* @param requestDate the request date of this user group request
	*/
	@Override
	public void setRequestDate(java.util.Date requestDate) {
		_userGroupRequest.setRequestDate(requestDate);
	}

	/**
	* Returns the requested by of this user group request.
	*
	* @return the requested by of this user group request
	*/
	@Override
	public long getRequestedBy() {
		return _userGroupRequest.getRequestedBy();
	}

	/**
	* Sets the requested by of this user group request.
	*
	* @param requestedBy the requested by of this user group request
	*/
	@Override
	public void setRequestedBy(long requestedBy) {
		_userGroupRequest.setRequestedBy(requestedBy);
	}

	/**
	* Returns the status of this user group request.
	*
	* @return the status of this user group request
	*/
	@Override
	public java.lang.String getStatus() {
		return _userGroupRequest.getStatus();
	}

	/**
	* Sets the status of this user group request.
	*
	* @param status the status of this user group request
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_userGroupRequest.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _userGroupRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userGroupRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userGroupRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userGroupRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userGroupRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userGroupRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userGroupRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userGroupRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userGroupRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userGroupRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userGroupRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserGroupRequestWrapper((UserGroupRequest)_userGroupRequest.clone());
	}

	@Override
	public int compareTo(UserGroupRequest userGroupRequest) {
		return _userGroupRequest.compareTo(userGroupRequest);
	}

	@Override
	public int hashCode() {
		return _userGroupRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<UserGroupRequest> toCacheModel() {
		return _userGroupRequest.toCacheModel();
	}

	@Override
	public UserGroupRequest toEscapedModel() {
		return new UserGroupRequestWrapper(_userGroupRequest.toEscapedModel());
	}

	@Override
	public UserGroupRequest toUnescapedModel() {
		return new UserGroupRequestWrapper(_userGroupRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userGroupRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userGroupRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserGroupRequestWrapper)) {
			return false;
		}

		UserGroupRequestWrapper userGroupRequestWrapper = (UserGroupRequestWrapper)obj;

		if (Validator.equals(_userGroupRequest,
					userGroupRequestWrapper._userGroupRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserGroupRequest getWrappedUserGroupRequest() {
		return _userGroupRequest;
	}

	@Override
	public UserGroupRequest getWrappedModel() {
		return _userGroupRequest;
	}

	@Override
	public void resetOriginalValues() {
		_userGroupRequest.resetOriginalValues();
	}

	private UserGroupRequest _userGroupRequest;
}