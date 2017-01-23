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
public class NYUUserGroupSoap implements Serializable {
	public static NYUUserGroupSoap toSoapModel(NYUUserGroup model) {
		NYUUserGroupSoap soapModel = new NYUUserGroupSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserGroupId(model.getUserGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setGroupPrivacy(model.getGroupPrivacy());
		soapModel.setAppreciatedUserIds(model.getAppreciatedUserIds());
		soapModel.setAppreciateCount(model.getAppreciateCount());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedDate(model.getUpdatedDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setAdministrators(model.getAdministrators());
		soapModel.setAbout(model.getAbout());
		soapModel.setTitle(model.getTitle());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static NYUUserGroupSoap[] toSoapModels(NYUUserGroup[] models) {
		NYUUserGroupSoap[] soapModels = new NYUUserGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NYUUserGroupSoap[][] toSoapModels(NYUUserGroup[][] models) {
		NYUUserGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NYUUserGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NYUUserGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NYUUserGroupSoap[] toSoapModels(List<NYUUserGroup> models) {
		List<NYUUserGroupSoap> soapModels = new ArrayList<NYUUserGroupSoap>(models.size());

		for (NYUUserGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NYUUserGroupSoap[soapModels.size()]);
	}

	public NYUUserGroupSoap() {
	}

	public long getPrimaryKey() {
		return _userGroupId;
	}

	public void setPrimaryKey(long pk) {
		setUserGroupId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
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

	public String getGroupPrivacy() {
		return _groupPrivacy;
	}

	public void setGroupPrivacy(String groupPrivacy) {
		_groupPrivacy = groupPrivacy;
	}

	public String getAppreciatedUserIds() {
		return _appreciatedUserIds;
	}

	public void setAppreciatedUserIds(String appreciatedUserIds) {
		_appreciatedUserIds = appreciatedUserIds;
	}

	public long getAppreciateCount() {
		return _appreciateCount;
	}

	public void setAppreciateCount(long appreciateCount) {
		_appreciateCount = appreciateCount;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return _updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;
	}

	public long getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	public String getAdministrators() {
		return _administrators;
	}

	public void setAdministrators(String administrators) {
		_administrators = administrators;
	}

	public String getAbout() {
		return _about;
	}

	public void setAbout(String about) {
		_about = about;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _userGroupId;
	private long _companyId;
	private long _groupId;
	private String _groupPrivacy;
	private String _appreciatedUserIds;
	private long _appreciateCount;
	private Date _createdDate;
	private long _createdBy;
	private Date _updatedDate;
	private long _updatedBy;
	private String _administrators;
	private String _about;
	private String _title;
	private int _status;
	private long _statusByUserId;
	private Date _statusDate;
}