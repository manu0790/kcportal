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

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.nyu.service.ClpSerializer;
import com.nyu.service.RequestLessonLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Allwins Rajaiah
 */
public class RequestLessonClp extends BaseModelImpl<RequestLesson>
	implements RequestLesson {
	public RequestLessonClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return RequestLesson.class;
	}

	@Override
	public String getModelClassName() {
		return RequestLesson.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _requestLessonId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRequestLessonId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requestLessonId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requestLessonId", getRequestLessonId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("relatedLink", getRelatedLink());
		attributes.put("priority", getPriority());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("acceptedBy", getAcceptedBy());
		attributes.put("status", getStatus());
		attributes.put("appreciatedUserIds", getAppreciatedUserIds());
		attributes.put("lastActivity", getLastActivity());
		attributes.put("acceptedNote", getAcceptedNote());
		attributes.put("answerType", getAnswerType());
		attributes.put("sendTo", getSendTo());
		attributes.put("opnionSurveyLink", getOpnionSurveyLink());
		attributes.put("surveyOptions", getSurveyOptions());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requestLessonId = (Long)attributes.get("requestLessonId");

		if (requestLessonId != null) {
			setRequestLessonId(requestLessonId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String relatedLink = (String)attributes.get("relatedLink");

		if (relatedLink != null) {
			setRelatedLink(relatedLink);
		}

		Boolean priority = (Boolean)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long acceptedBy = (Long)attributes.get("acceptedBy");

		if (acceptedBy != null) {
			setAcceptedBy(acceptedBy);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String appreciatedUserIds = (String)attributes.get("appreciatedUserIds");

		if (appreciatedUserIds != null) {
			setAppreciatedUserIds(appreciatedUserIds);
		}

		Date lastActivity = (Date)attributes.get("lastActivity");

		if (lastActivity != null) {
			setLastActivity(lastActivity);
		}

		String acceptedNote = (String)attributes.get("acceptedNote");

		if (acceptedNote != null) {
			setAcceptedNote(acceptedNote);
		}

		String answerType = (String)attributes.get("answerType");

		if (answerType != null) {
			setAnswerType(answerType);
		}

		Long sendTo = (Long)attributes.get("sendTo");

		if (sendTo != null) {
			setSendTo(sendTo);
		}

		String opnionSurveyLink = (String)attributes.get("opnionSurveyLink");

		if (opnionSurveyLink != null) {
			setOpnionSurveyLink(opnionSurveyLink);
		}

		String surveyOptions = (String)attributes.get("surveyOptions");

		if (surveyOptions != null) {
			setSurveyOptions(surveyOptions);
		}
	}

	@Override
	public long getRequestLessonId() {
		return _requestLessonId;
	}

	@Override
	public void setRequestLessonId(long requestLessonId) {
		_requestLessonId = requestLessonId;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestLessonId", long.class);

				method.invoke(_requestLessonRemoteModel, requestLessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_requestLessonRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_requestLessonRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_requestLessonRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public String getDescription(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId);
	}

	@Override
	public String getDescription(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId, useDefault);
	}

	@Override
	public String getDescription(String languageId) {
		return LocalizationUtil.getLocalization(getDescription(), languageId);
	}

	@Override
	public String getDescription(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getDescription(), languageId,
			useDefault);
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		return _descriptionCurrentLanguageId;
	}

	@Override
	public String getDescriptionCurrentValue() {
		Locale locale = getLocale(_descriptionCurrentLanguageId);

		return getDescription(locale);
	}

	@Override
	public Map<Locale, String> getDescriptionMap() {
		return LocalizationUtil.getLocalizationMap(getDescription());
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_requestLessonRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setDescription(String description, Locale locale) {
		setDescription(description, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setDescription(String description, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(description)) {
			setDescription(LocalizationUtil.updateLocalization(
					getDescription(), "Description", description, languageId,
					defaultLanguageId));
		}
		else {
			setDescription(LocalizationUtil.removeLocalization(
					getDescription(), "Description", languageId));
		}
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		_descriptionCurrentLanguageId = languageId;
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap) {
		setDescriptionMap(descriptionMap, LocaleUtil.getDefault());
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale) {
		if (descriptionMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setDescription(LocalizationUtil.updateLocalization(descriptionMap,
					getDescription(), "Description",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getRelatedLink() {
		return _relatedLink;
	}

	@Override
	public void setRelatedLink(String relatedLink) {
		_relatedLink = relatedLink;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setRelatedLink", String.class);

				method.invoke(_requestLessonRemoteModel, relatedLink);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getPriority() {
		return _priority;
	}

	@Override
	public boolean isPriority() {
		return _priority;
	}

	@Override
	public void setPriority(boolean priority) {
		_priority = priority;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", boolean.class);

				method.invoke(_requestLessonRemoteModel, priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_requestLessonRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_requestLessonRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAcceptedBy() {
		return _acceptedBy;
	}

	@Override
	public void setAcceptedBy(long acceptedBy) {
		_acceptedBy = acceptedBy;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAcceptedBy", long.class);

				method.invoke(_requestLessonRemoteModel, acceptedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_requestLessonRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppreciatedUserIds() {
		return _appreciatedUserIds;
	}

	@Override
	public void setAppreciatedUserIds(String appreciatedUserIds) {
		_appreciatedUserIds = appreciatedUserIds;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciatedUserIds",
						String.class);

				method.invoke(_requestLessonRemoteModel, appreciatedUserIds);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLastActivity() {
		return _lastActivity;
	}

	@Override
	public void setLastActivity(Date lastActivity) {
		_lastActivity = lastActivity;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setLastActivity", Date.class);

				method.invoke(_requestLessonRemoteModel, lastActivity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAcceptedNote() {
		return _acceptedNote;
	}

	@Override
	public String getAcceptedNote(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getAcceptedNote(languageId);
	}

	@Override
	public String getAcceptedNote(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getAcceptedNote(languageId, useDefault);
	}

	@Override
	public String getAcceptedNote(String languageId) {
		return LocalizationUtil.getLocalization(getAcceptedNote(), languageId);
	}

	@Override
	public String getAcceptedNote(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getAcceptedNote(), languageId,
			useDefault);
	}

	@Override
	public String getAcceptedNoteCurrentLanguageId() {
		return _acceptedNoteCurrentLanguageId;
	}

	@Override
	public String getAcceptedNoteCurrentValue() {
		Locale locale = getLocale(_acceptedNoteCurrentLanguageId);

		return getAcceptedNote(locale);
	}

	@Override
	public Map<Locale, String> getAcceptedNoteMap() {
		return LocalizationUtil.getLocalizationMap(getAcceptedNote());
	}

	@Override
	public void setAcceptedNote(String acceptedNote) {
		_acceptedNote = acceptedNote;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAcceptedNote", String.class);

				method.invoke(_requestLessonRemoteModel, acceptedNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setAcceptedNote(String acceptedNote, Locale locale) {
		setAcceptedNote(acceptedNote, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setAcceptedNote(String acceptedNote, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(acceptedNote)) {
			setAcceptedNote(LocalizationUtil.updateLocalization(
					getAcceptedNote(), "AcceptedNote", acceptedNote,
					languageId, defaultLanguageId));
		}
		else {
			setAcceptedNote(LocalizationUtil.removeLocalization(
					getAcceptedNote(), "AcceptedNote", languageId));
		}
	}

	@Override
	public void setAcceptedNoteCurrentLanguageId(String languageId) {
		_acceptedNoteCurrentLanguageId = languageId;
	}

	@Override
	public void setAcceptedNoteMap(Map<Locale, String> acceptedNoteMap) {
		setAcceptedNoteMap(acceptedNoteMap, LocaleUtil.getDefault());
	}

	@Override
	public void setAcceptedNoteMap(Map<Locale, String> acceptedNoteMap,
		Locale defaultLocale) {
		if (acceptedNoteMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setAcceptedNote(LocalizationUtil.updateLocalization(
					acceptedNoteMap, getAcceptedNote(), "AcceptedNote",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getAnswerType() {
		return _answerType;
	}

	@Override
	public void setAnswerType(String answerType) {
		_answerType = answerType;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAnswerType", String.class);

				method.invoke(_requestLessonRemoteModel, answerType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSendTo() {
		return _sendTo;
	}

	@Override
	public void setSendTo(long sendTo) {
		_sendTo = sendTo;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setSendTo", long.class);

				method.invoke(_requestLessonRemoteModel, sendTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOpnionSurveyLink() {
		return _opnionSurveyLink;
	}

	@Override
	public void setOpnionSurveyLink(String opnionSurveyLink) {
		_opnionSurveyLink = opnionSurveyLink;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setOpnionSurveyLink",
						String.class);

				method.invoke(_requestLessonRemoteModel, opnionSurveyLink);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSurveyOptions() {
		return _surveyOptions;
	}

	@Override
	public void setSurveyOptions(String surveyOptions) {
		_surveyOptions = surveyOptions;

		if (_requestLessonRemoteModel != null) {
			try {
				Class<?> clazz = _requestLessonRemoteModel.getClass();

				Method method = clazz.getMethod("setSurveyOptions", String.class);

				method.invoke(_requestLessonRemoteModel, surveyOptions);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRequestLessonRemoteModel() {
		return _requestLessonRemoteModel;
	}

	public void setRequestLessonRemoteModel(
		BaseModel<?> requestLessonRemoteModel) {
		_requestLessonRemoteModel = requestLessonRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _requestLessonRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_requestLessonRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RequestLessonLocalServiceUtil.addRequestLesson(this);
		}
		else {
			RequestLessonLocalServiceUtil.updateRequestLesson(this);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> descriptionMap = getDescriptionMap();

		for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> acceptedNoteMap = getAcceptedNoteMap();

		for (Map.Entry<Locale, String> entry : acceptedNoteMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getDescription();

		if (xml == null) {
			return StringPool.BLANK;
		}

		return LocalizationUtil.getDefaultLanguageId(xml);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		prepareLocalizedFieldsForImport(null);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String description = getDescription(defaultLocale);

		if (Validator.isNull(description)) {
			setDescription(getDescription(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setDescription(getDescription(defaultLocale), defaultLocale,
				defaultLocale);
		}

		String acceptedNote = getAcceptedNote(defaultLocale);

		if (Validator.isNull(acceptedNote)) {
			setAcceptedNote(getAcceptedNote(modelDefaultLanguageId),
				defaultLocale);
		}
		else {
			setAcceptedNote(getAcceptedNote(defaultLocale), defaultLocale,
				defaultLocale);
		}
	}

	@Override
	public RequestLesson toEscapedModel() {
		return (RequestLesson)ProxyUtil.newProxyInstance(RequestLesson.class.getClassLoader(),
			new Class[] { RequestLesson.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RequestLessonClp clone = new RequestLessonClp();

		clone.setRequestLessonId(getRequestLessonId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setRelatedLink(getRelatedLink());
		clone.setPriority(getPriority());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setAcceptedBy(getAcceptedBy());
		clone.setStatus(getStatus());
		clone.setAppreciatedUserIds(getAppreciatedUserIds());
		clone.setLastActivity(getLastActivity());
		clone.setAcceptedNote(getAcceptedNote());
		clone.setAnswerType(getAnswerType());
		clone.setSendTo(getSendTo());
		clone.setOpnionSurveyLink(getOpnionSurveyLink());
		clone.setSurveyOptions(getSurveyOptions());

		return clone;
	}

	@Override
	public int compareTo(RequestLesson requestLesson) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				requestLesson.getCreatedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequestLessonClp)) {
			return false;
		}

		RequestLessonClp requestLesson = (RequestLessonClp)obj;

		long primaryKey = requestLesson.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{requestLessonId=");
		sb.append(getRequestLessonId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", relatedLink=");
		sb.append(getRelatedLink());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", acceptedBy=");
		sb.append(getAcceptedBy());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", appreciatedUserIds=");
		sb.append(getAppreciatedUserIds());
		sb.append(", lastActivity=");
		sb.append(getLastActivity());
		sb.append(", acceptedNote=");
		sb.append(getAcceptedNote());
		sb.append(", answerType=");
		sb.append(getAnswerType());
		sb.append(", sendTo=");
		sb.append(getSendTo());
		sb.append(", opnionSurveyLink=");
		sb.append(getOpnionSurveyLink());
		sb.append(", surveyOptions=");
		sb.append(getSurveyOptions());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.RequestLesson");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requestLessonId</column-name><column-value><![CDATA[");
		sb.append(getRequestLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relatedLink</column-name><column-value><![CDATA[");
		sb.append(getRelatedLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acceptedBy</column-name><column-value><![CDATA[");
		sb.append(getAcceptedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciatedUserIds</column-name><column-value><![CDATA[");
		sb.append(getAppreciatedUserIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastActivity</column-name><column-value><![CDATA[");
		sb.append(getLastActivity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acceptedNote</column-name><column-value><![CDATA[");
		sb.append(getAcceptedNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answerType</column-name><column-value><![CDATA[");
		sb.append(getAnswerType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendTo</column-name><column-value><![CDATA[");
		sb.append(getSendTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>opnionSurveyLink</column-name><column-value><![CDATA[");
		sb.append(getOpnionSurveyLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyOptions</column-name><column-value><![CDATA[");
		sb.append(getSurveyOptions());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _requestLessonId;
	private long _companyId;
	private long _groupId;
	private String _name;
	private String _description;
	private String _descriptionCurrentLanguageId;
	private String _relatedLink;
	private boolean _priority;
	private long _createdBy;
	private Date _createdDate;
	private long _acceptedBy;
	private String _status;
	private String _appreciatedUserIds;
	private Date _lastActivity;
	private String _acceptedNote;
	private String _acceptedNoteCurrentLanguageId;
	private String _answerType;
	private long _sendTo;
	private String _opnionSurveyLink;
	private String _surveyOptions;
	private BaseModel<?> _requestLessonRemoteModel;
}