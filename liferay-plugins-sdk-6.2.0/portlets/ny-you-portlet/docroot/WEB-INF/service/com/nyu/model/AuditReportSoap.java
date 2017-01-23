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
public class AuditReportSoap implements Serializable {
	public static AuditReportSoap toSoapModel(AuditReport model) {
		AuditReportSoap soapModel = new AuditReportSoap();

		soapModel.setAuditEventId(model.getAuditEventId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setEventType(model.getEventType());
		soapModel.setClassName(model.getClassName());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setMessage(model.getMessage());
		soapModel.setClientHost(model.getClientHost());
		soapModel.setClientIP(model.getClientIP());
		soapModel.setServerName(model.getServerName());
		soapModel.setServerPort(model.getServerPort());
		soapModel.setSessionID(model.getSessionID());
		soapModel.setAdditionalInfo(model.getAdditionalInfo());

		return soapModel;
	}

	public static AuditReportSoap[] toSoapModels(AuditReport[] models) {
		AuditReportSoap[] soapModels = new AuditReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AuditReportSoap[][] toSoapModels(AuditReport[][] models) {
		AuditReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AuditReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AuditReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AuditReportSoap[] toSoapModels(List<AuditReport> models) {
		List<AuditReportSoap> soapModels = new ArrayList<AuditReportSoap>(models.size());

		for (AuditReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AuditReportSoap[soapModels.size()]);
	}

	public AuditReportSoap() {
	}

	public long getPrimaryKey() {
		return _auditEventId;
	}

	public void setPrimaryKey(long pk) {
		setAuditEventId(pk);
	}

	public long getAuditEventId() {
		return _auditEventId;
	}

	public void setAuditEventId(long auditEventId) {
		_auditEventId = auditEventId;
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

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getEventType() {
		return _eventType;
	}

	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	public String getClassName() {
		return _className;
	}

	public void setClassName(String className) {
		_className = className;
	}

	public String getClassPK() {
		return _classPK;
	}

	public void setClassPK(String classPK) {
		_classPK = classPK;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public String getClientHost() {
		return _clientHost;
	}

	public void setClientHost(String clientHost) {
		_clientHost = clientHost;
	}

	public String getClientIP() {
		return _clientIP;
	}

	public void setClientIP(String clientIP) {
		_clientIP = clientIP;
	}

	public String getServerName() {
		return _serverName;
	}

	public void setServerName(String serverName) {
		_serverName = serverName;
	}

	public int getServerPort() {
		return _serverPort;
	}

	public void setServerPort(int serverPort) {
		_serverPort = serverPort;
	}

	public String getSessionID() {
		return _sessionID;
	}

	public void setSessionID(String sessionID) {
		_sessionID = sessionID;
	}

	public String getAdditionalInfo() {
		return _additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		_additionalInfo = additionalInfo;
	}

	private long _auditEventId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private String _eventType;
	private String _className;
	private String _classPK;
	private String _message;
	private String _clientHost;
	private String _clientIP;
	private String _serverName;
	private int _serverPort;
	private String _sessionID;
	private String _additionalInfo;
}