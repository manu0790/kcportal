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
public class KeywordsCollaborationSoap implements Serializable {
	public static KeywordsCollaborationSoap toSoapModel(
		KeywordsCollaboration model) {
		KeywordsCollaborationSoap soapModel = new KeywordsCollaborationSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setKeywordId(model.getKeywordId());
		soapModel.setKeywordName(model.getKeywordName());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMarkAs(model.getMarkAs());

		return soapModel;
	}

	public static KeywordsCollaborationSoap[] toSoapModels(
		KeywordsCollaboration[] models) {
		KeywordsCollaborationSoap[] soapModels = new KeywordsCollaborationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KeywordsCollaborationSoap[][] toSoapModels(
		KeywordsCollaboration[][] models) {
		KeywordsCollaborationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KeywordsCollaborationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KeywordsCollaborationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KeywordsCollaborationSoap[] toSoapModels(
		List<KeywordsCollaboration> models) {
		List<KeywordsCollaborationSoap> soapModels = new ArrayList<KeywordsCollaborationSoap>(models.size());

		for (KeywordsCollaboration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KeywordsCollaborationSoap[soapModels.size()]);
	}

	public KeywordsCollaborationSoap() {
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

	public long getKeywordId() {
		return _keywordId;
	}

	public void setKeywordId(long keywordId) {
		_keywordId = keywordId;
	}

	public String getKeywordName() {
		return _keywordName;
	}

	public void setKeywordName(String keywordName) {
		_keywordName = keywordName;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getMarkAs() {
		return _markAs;
	}

	public void setMarkAs(String markAs) {
		_markAs = markAs;
	}

	private long _id;
	private long _companyId;
	private long _groupId;
	private long _keywordId;
	private String _keywordName;
	private long _userId;
	private String _userName;
	private String _status;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _markAs;
}