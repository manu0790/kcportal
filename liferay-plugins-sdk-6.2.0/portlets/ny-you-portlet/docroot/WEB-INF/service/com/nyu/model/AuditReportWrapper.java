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
 * This class is a wrapper for {@link AuditReport}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AuditReport
 * @generated
 */
public class AuditReportWrapper implements AuditReport,
	ModelWrapper<AuditReport> {
	public AuditReportWrapper(AuditReport auditReport) {
		_auditReport = auditReport;
	}

	@Override
	public Class<?> getModelClass() {
		return AuditReport.class;
	}

	@Override
	public String getModelClassName() {
		return AuditReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("auditEventId", getAuditEventId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("eventType", getEventType());
		attributes.put("className", getClassName());
		attributes.put("classPK", getClassPK());
		attributes.put("message", getMessage());
		attributes.put("clientHost", getClientHost());
		attributes.put("clientIP", getClientIP());
		attributes.put("serverName", getServerName());
		attributes.put("serverPort", getServerPort());
		attributes.put("sessionID", getSessionID());
		attributes.put("additionalInfo", getAdditionalInfo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long auditEventId = (Long)attributes.get("auditEventId");

		if (auditEventId != null) {
			setAuditEventId(auditEventId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		String classPK = (String)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		String clientHost = (String)attributes.get("clientHost");

		if (clientHost != null) {
			setClientHost(clientHost);
		}

		String clientIP = (String)attributes.get("clientIP");

		if (clientIP != null) {
			setClientIP(clientIP);
		}

		String serverName = (String)attributes.get("serverName");

		if (serverName != null) {
			setServerName(serverName);
		}

		Integer serverPort = (Integer)attributes.get("serverPort");

		if (serverPort != null) {
			setServerPort(serverPort);
		}

		String sessionID = (String)attributes.get("sessionID");

		if (sessionID != null) {
			setSessionID(sessionID);
		}

		String additionalInfo = (String)attributes.get("additionalInfo");

		if (additionalInfo != null) {
			setAdditionalInfo(additionalInfo);
		}
	}

	/**
	* Returns the primary key of this audit report.
	*
	* @return the primary key of this audit report
	*/
	@Override
	public long getPrimaryKey() {
		return _auditReport.getPrimaryKey();
	}

	/**
	* Sets the primary key of this audit report.
	*
	* @param primaryKey the primary key of this audit report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_auditReport.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the audit event ID of this audit report.
	*
	* @return the audit event ID of this audit report
	*/
	@Override
	public long getAuditEventId() {
		return _auditReport.getAuditEventId();
	}

	/**
	* Sets the audit event ID of this audit report.
	*
	* @param auditEventId the audit event ID of this audit report
	*/
	@Override
	public void setAuditEventId(long auditEventId) {
		_auditReport.setAuditEventId(auditEventId);
	}

	/**
	* Returns the company ID of this audit report.
	*
	* @return the company ID of this audit report
	*/
	@Override
	public long getCompanyId() {
		return _auditReport.getCompanyId();
	}

	/**
	* Sets the company ID of this audit report.
	*
	* @param companyId the company ID of this audit report
	*/
	@Override
	public void setCompanyId(long companyId) {
		_auditReport.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this audit report.
	*
	* @return the group ID of this audit report
	*/
	@Override
	public long getGroupId() {
		return _auditReport.getGroupId();
	}

	/**
	* Sets the group ID of this audit report.
	*
	* @param groupId the group ID of this audit report
	*/
	@Override
	public void setGroupId(long groupId) {
		_auditReport.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this audit report.
	*
	* @return the user ID of this audit report
	*/
	@Override
	public long getUserId() {
		return _auditReport.getUserId();
	}

	/**
	* Sets the user ID of this audit report.
	*
	* @param userId the user ID of this audit report
	*/
	@Override
	public void setUserId(long userId) {
		_auditReport.setUserId(userId);
	}

	/**
	* Returns the user uuid of this audit report.
	*
	* @return the user uuid of this audit report
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _auditReport.getUserUuid();
	}

	/**
	* Sets the user uuid of this audit report.
	*
	* @param userUuid the user uuid of this audit report
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_auditReport.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this audit report.
	*
	* @return the user name of this audit report
	*/
	@Override
	public java.lang.String getUserName() {
		return _auditReport.getUserName();
	}

	/**
	* Sets the user name of this audit report.
	*
	* @param userName the user name of this audit report
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_auditReport.setUserName(userName);
	}

	/**
	* Returns the create date of this audit report.
	*
	* @return the create date of this audit report
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _auditReport.getCreateDate();
	}

	/**
	* Sets the create date of this audit report.
	*
	* @param createDate the create date of this audit report
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_auditReport.setCreateDate(createDate);
	}

	/**
	* Returns the event type of this audit report.
	*
	* @return the event type of this audit report
	*/
	@Override
	public java.lang.String getEventType() {
		return _auditReport.getEventType();
	}

	/**
	* Sets the event type of this audit report.
	*
	* @param eventType the event type of this audit report
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_auditReport.setEventType(eventType);
	}

	/**
	* Returns the class name of this audit report.
	*
	* @return the class name of this audit report
	*/
	@Override
	public java.lang.String getClassName() {
		return _auditReport.getClassName();
	}

	/**
	* Sets the class name of this audit report.
	*
	* @param className the class name of this audit report
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_auditReport.setClassName(className);
	}

	/**
	* Returns the class p k of this audit report.
	*
	* @return the class p k of this audit report
	*/
	@Override
	public java.lang.String getClassPK() {
		return _auditReport.getClassPK();
	}

	/**
	* Sets the class p k of this audit report.
	*
	* @param classPK the class p k of this audit report
	*/
	@Override
	public void setClassPK(java.lang.String classPK) {
		_auditReport.setClassPK(classPK);
	}

	/**
	* Returns the message of this audit report.
	*
	* @return the message of this audit report
	*/
	@Override
	public java.lang.String getMessage() {
		return _auditReport.getMessage();
	}

	/**
	* Sets the message of this audit report.
	*
	* @param message the message of this audit report
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_auditReport.setMessage(message);
	}

	/**
	* Returns the client host of this audit report.
	*
	* @return the client host of this audit report
	*/
	@Override
	public java.lang.String getClientHost() {
		return _auditReport.getClientHost();
	}

	/**
	* Sets the client host of this audit report.
	*
	* @param clientHost the client host of this audit report
	*/
	@Override
	public void setClientHost(java.lang.String clientHost) {
		_auditReport.setClientHost(clientHost);
	}

	/**
	* Returns the client i p of this audit report.
	*
	* @return the client i p of this audit report
	*/
	@Override
	public java.lang.String getClientIP() {
		return _auditReport.getClientIP();
	}

	/**
	* Sets the client i p of this audit report.
	*
	* @param clientIP the client i p of this audit report
	*/
	@Override
	public void setClientIP(java.lang.String clientIP) {
		_auditReport.setClientIP(clientIP);
	}

	/**
	* Returns the server name of this audit report.
	*
	* @return the server name of this audit report
	*/
	@Override
	public java.lang.String getServerName() {
		return _auditReport.getServerName();
	}

	/**
	* Sets the server name of this audit report.
	*
	* @param serverName the server name of this audit report
	*/
	@Override
	public void setServerName(java.lang.String serverName) {
		_auditReport.setServerName(serverName);
	}

	/**
	* Returns the server port of this audit report.
	*
	* @return the server port of this audit report
	*/
	@Override
	public int getServerPort() {
		return _auditReport.getServerPort();
	}

	/**
	* Sets the server port of this audit report.
	*
	* @param serverPort the server port of this audit report
	*/
	@Override
	public void setServerPort(int serverPort) {
		_auditReport.setServerPort(serverPort);
	}

	/**
	* Returns the session i d of this audit report.
	*
	* @return the session i d of this audit report
	*/
	@Override
	public java.lang.String getSessionID() {
		return _auditReport.getSessionID();
	}

	/**
	* Sets the session i d of this audit report.
	*
	* @param sessionID the session i d of this audit report
	*/
	@Override
	public void setSessionID(java.lang.String sessionID) {
		_auditReport.setSessionID(sessionID);
	}

	/**
	* Returns the additional info of this audit report.
	*
	* @return the additional info of this audit report
	*/
	@Override
	public java.lang.String getAdditionalInfo() {
		return _auditReport.getAdditionalInfo();
	}

	/**
	* Sets the additional info of this audit report.
	*
	* @param additionalInfo the additional info of this audit report
	*/
	@Override
	public void setAdditionalInfo(java.lang.String additionalInfo) {
		_auditReport.setAdditionalInfo(additionalInfo);
	}

	@Override
	public boolean isNew() {
		return _auditReport.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_auditReport.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _auditReport.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_auditReport.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _auditReport.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _auditReport.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_auditReport.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _auditReport.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_auditReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_auditReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_auditReport.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AuditReportWrapper((AuditReport)_auditReport.clone());
	}

	@Override
	public int compareTo(com.nyu.model.AuditReport auditReport) {
		return _auditReport.compareTo(auditReport);
	}

	@Override
	public int hashCode() {
		return _auditReport.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.AuditReport> toCacheModel() {
		return _auditReport.toCacheModel();
	}

	@Override
	public com.nyu.model.AuditReport toEscapedModel() {
		return new AuditReportWrapper(_auditReport.toEscapedModel());
	}

	@Override
	public com.nyu.model.AuditReport toUnescapedModel() {
		return new AuditReportWrapper(_auditReport.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _auditReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _auditReport.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_auditReport.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuditReportWrapper)) {
			return false;
		}

		AuditReportWrapper auditReportWrapper = (AuditReportWrapper)obj;

		if (Validator.equals(_auditReport, auditReportWrapper._auditReport)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AuditReport getWrappedAuditReport() {
		return _auditReport;
	}

	@Override
	public AuditReport getWrappedModel() {
		return _auditReport;
	}

	@Override
	public void resetOriginalValues() {
		_auditReport.resetOriginalValues();
	}

	private AuditReport _auditReport;
}