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
public class UserGroupRequestSoap implements Serializable {
	public static UserGroupRequestSoap toSoapModel(UserGroupRequest model) {
		UserGroupRequestSoap soapModel = new UserGroupRequestSoap();

		soapModel.setId(model.getId());
		soapModel.setUserGroupId(model.getUserGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserGroupOwner(model.getUserGroupOwner());
		soapModel.setRequestDate(model.getRequestDate());
		soapModel.setRequestedBy(model.getRequestedBy());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static UserGroupRequestSoap[] toSoapModels(UserGroupRequest[] models) {
		UserGroupRequestSoap[] soapModels = new UserGroupRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserGroupRequestSoap[][] toSoapModels(
		UserGroupRequest[][] models) {
		UserGroupRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserGroupRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserGroupRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserGroupRequestSoap[] toSoapModels(
		List<UserGroupRequest> models) {
		List<UserGroupRequestSoap> soapModels = new ArrayList<UserGroupRequestSoap>(models.size());

		for (UserGroupRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserGroupRequestSoap[soapModels.size()]);
	}

	public UserGroupRequestSoap() {
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

	public long getUserGroupId() {
		return _userGroupId;
	}

	public void setUserGroupId(long userGroupId) {
		_userGroupId = userGroupId;
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

	public long getUserGroupOwner() {
		return _userGroupOwner;
	}

	public void setUserGroupOwner(long userGroupOwner) {
		_userGroupOwner = userGroupOwner;
	}

	public Date getRequestDate() {
		return _requestDate;
	}

	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;
	}

	public long getRequestedBy() {
		return _requestedBy;
	}

	public void setRequestedBy(long requestedBy) {
		_requestedBy = requestedBy;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _id;
	private long _userGroupId;
	private long _companyId;
	private long _groupId;
	private long _userGroupOwner;
	private Date _requestDate;
	private long _requestedBy;
	private String _status;
}