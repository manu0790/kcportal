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
public class BasnoSoap implements Serializable {
	public static BasnoSoap toSoapModel(Basno model) {
		BasnoSoap soapModel = new BasnoSoap();

		soapModel.setBadgeId(model.getBadgeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setBadgeName(model.getBadgeName());
		soapModel.setBadgeUrl(model.getBadgeUrl());
		soapModel.setDescription(model.getDescription());
		soapModel.setTargetPoints(model.getTargetPoints());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedDate(model.getUpdatedDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static BasnoSoap[] toSoapModels(Basno[] models) {
		BasnoSoap[] soapModels = new BasnoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BasnoSoap[][] toSoapModels(Basno[][] models) {
		BasnoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BasnoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BasnoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BasnoSoap[] toSoapModels(List<Basno> models) {
		List<BasnoSoap> soapModels = new ArrayList<BasnoSoap>(models.size());

		for (Basno model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BasnoSoap[soapModels.size()]);
	}

	public BasnoSoap() {
	}

	public long getPrimaryKey() {
		return _badgeId;
	}

	public void setPrimaryKey(long pk) {
		setBadgeId(pk);
	}

	public long getBadgeId() {
		return _badgeId;
	}

	public void setBadgeId(long badgeId) {
		_badgeId = badgeId;
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

	public String getBadgeName() {
		return _badgeName;
	}

	public void setBadgeName(String badgeName) {
		_badgeName = badgeName;
	}

	public String getBadgeUrl() {
		return _badgeUrl;
	}

	public void setBadgeUrl(String badgeUrl) {
		_badgeUrl = badgeUrl;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getTargetPoints() {
		return _targetPoints;
	}

	public void setTargetPoints(long targetPoints) {
		_targetPoints = targetPoints;
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

	private long _badgeId;
	private long _companyId;
	private long _groupId;
	private String _badgeName;
	private String _badgeUrl;
	private String _description;
	private long _targetPoints;
	private Date _createdDate;
	private long _createdBy;
	private Date _updatedDate;
	private long _updatedBy;
}