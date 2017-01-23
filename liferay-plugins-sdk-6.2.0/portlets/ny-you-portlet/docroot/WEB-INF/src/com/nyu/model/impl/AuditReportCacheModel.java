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

package com.nyu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.nyu.model.AuditReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AuditReport in entity cache.
 *
 * @author Allwins Rajaiah
 * @see AuditReport
 * @generated
 */
public class AuditReportCacheModel implements CacheModel<AuditReport>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{auditEventId=");
		sb.append(auditEventId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append(", className=");
		sb.append(className);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append(", message=");
		sb.append(message);
		sb.append(", clientHost=");
		sb.append(clientHost);
		sb.append(", clientIP=");
		sb.append(clientIP);
		sb.append(", serverName=");
		sb.append(serverName);
		sb.append(", serverPort=");
		sb.append(serverPort);
		sb.append(", sessionID=");
		sb.append(sessionID);
		sb.append(", additionalInfo=");
		sb.append(additionalInfo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AuditReport toEntityModel() {
		AuditReportImpl auditReportImpl = new AuditReportImpl();

		auditReportImpl.setAuditEventId(auditEventId);
		auditReportImpl.setCompanyId(companyId);
		auditReportImpl.setGroupId(groupId);
		auditReportImpl.setUserId(userId);

		if (userName == null) {
			auditReportImpl.setUserName(StringPool.BLANK);
		}
		else {
			auditReportImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			auditReportImpl.setCreateDate(null);
		}
		else {
			auditReportImpl.setCreateDate(new Date(createDate));
		}

		if (eventType == null) {
			auditReportImpl.setEventType(StringPool.BLANK);
		}
		else {
			auditReportImpl.setEventType(eventType);
		}

		if (className == null) {
			auditReportImpl.setClassName(StringPool.BLANK);
		}
		else {
			auditReportImpl.setClassName(className);
		}

		if (classPK == null) {
			auditReportImpl.setClassPK(StringPool.BLANK);
		}
		else {
			auditReportImpl.setClassPK(classPK);
		}

		if (message == null) {
			auditReportImpl.setMessage(StringPool.BLANK);
		}
		else {
			auditReportImpl.setMessage(message);
		}

		if (clientHost == null) {
			auditReportImpl.setClientHost(StringPool.BLANK);
		}
		else {
			auditReportImpl.setClientHost(clientHost);
		}

		if (clientIP == null) {
			auditReportImpl.setClientIP(StringPool.BLANK);
		}
		else {
			auditReportImpl.setClientIP(clientIP);
		}

		if (serverName == null) {
			auditReportImpl.setServerName(StringPool.BLANK);
		}
		else {
			auditReportImpl.setServerName(serverName);
		}

		auditReportImpl.setServerPort(serverPort);

		if (sessionID == null) {
			auditReportImpl.setSessionID(StringPool.BLANK);
		}
		else {
			auditReportImpl.setSessionID(sessionID);
		}

		if (additionalInfo == null) {
			auditReportImpl.setAdditionalInfo(StringPool.BLANK);
		}
		else {
			auditReportImpl.setAdditionalInfo(additionalInfo);
		}

		auditReportImpl.resetOriginalValues();

		return auditReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		auditEventId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		eventType = objectInput.readUTF();
		className = objectInput.readUTF();
		classPK = objectInput.readUTF();
		message = objectInput.readUTF();
		clientHost = objectInput.readUTF();
		clientIP = objectInput.readUTF();
		serverName = objectInput.readUTF();
		serverPort = objectInput.readInt();
		sessionID = objectInput.readUTF();
		additionalInfo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(auditEventId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);

		if (eventType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventType);
		}

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}

		if (classPK == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(classPK);
		}

		if (message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(message);
		}

		if (clientHost == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientHost);
		}

		if (clientIP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientIP);
		}

		if (serverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serverName);
		}

		objectOutput.writeInt(serverPort);

		if (sessionID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sessionID);
		}

		if (additionalInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(additionalInfo);
		}
	}

	public long auditEventId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public String eventType;
	public String className;
	public String classPK;
	public String message;
	public String clientHost;
	public String clientIP;
	public String serverName;
	public int serverPort;
	public String sessionID;
	public String additionalInfo;
}