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
 * This class is a wrapper for {@link RequestLesson}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see RequestLesson
 * @generated
 */
public class RequestLessonWrapper implements RequestLesson,
	ModelWrapper<RequestLesson> {
	public RequestLessonWrapper(RequestLesson requestLesson) {
		_requestLesson = requestLesson;
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

	/**
	* Returns the primary key of this request lesson.
	*
	* @return the primary key of this request lesson
	*/
	@Override
	public long getPrimaryKey() {
		return _requestLesson.getPrimaryKey();
	}

	/**
	* Sets the primary key of this request lesson.
	*
	* @param primaryKey the primary key of this request lesson
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_requestLesson.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the request lesson ID of this request lesson.
	*
	* @return the request lesson ID of this request lesson
	*/
	@Override
	public long getRequestLessonId() {
		return _requestLesson.getRequestLessonId();
	}

	/**
	* Sets the request lesson ID of this request lesson.
	*
	* @param requestLessonId the request lesson ID of this request lesson
	*/
	@Override
	public void setRequestLessonId(long requestLessonId) {
		_requestLesson.setRequestLessonId(requestLessonId);
	}

	/**
	* Returns the company ID of this request lesson.
	*
	* @return the company ID of this request lesson
	*/
	@Override
	public long getCompanyId() {
		return _requestLesson.getCompanyId();
	}

	/**
	* Sets the company ID of this request lesson.
	*
	* @param companyId the company ID of this request lesson
	*/
	@Override
	public void setCompanyId(long companyId) {
		_requestLesson.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this request lesson.
	*
	* @return the group ID of this request lesson
	*/
	@Override
	public long getGroupId() {
		return _requestLesson.getGroupId();
	}

	/**
	* Sets the group ID of this request lesson.
	*
	* @param groupId the group ID of this request lesson
	*/
	@Override
	public void setGroupId(long groupId) {
		_requestLesson.setGroupId(groupId);
	}

	/**
	* Returns the name of this request lesson.
	*
	* @return the name of this request lesson
	*/
	@Override
	public java.lang.String getName() {
		return _requestLesson.getName();
	}

	/**
	* Sets the name of this request lesson.
	*
	* @param name the name of this request lesson
	*/
	@Override
	public void setName(java.lang.String name) {
		_requestLesson.setName(name);
	}

	/**
	* Returns the description of this request lesson.
	*
	* @return the description of this request lesson
	*/
	@Override
	public java.lang.String getDescription() {
		return _requestLesson.getDescription();
	}

	/**
	* Returns the localized description of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this request lesson
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _requestLesson.getDescription(locale);
	}

	/**
	* Returns the localized description of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this request lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _requestLesson.getDescription(locale, useDefault);
	}

	/**
	* Returns the localized description of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this request lesson
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _requestLesson.getDescription(languageId);
	}

	/**
	* Returns the localized description of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this request lesson
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _requestLesson.getDescription(languageId, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _requestLesson.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _requestLesson.getDescriptionCurrentValue();
	}

	/**
	* Returns a map of the locales and localized descriptions of this request lesson.
	*
	* @return the locales and localized descriptions of this request lesson
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _requestLesson.getDescriptionMap();
	}

	/**
	* Sets the description of this request lesson.
	*
	* @param description the description of this request lesson
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_requestLesson.setDescription(description);
	}

	/**
	* Sets the localized description of this request lesson in the language.
	*
	* @param description the localized description of this request lesson
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_requestLesson.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this request lesson in the language, and sets the default locale.
	*
	* @param description the localized description of this request lesson
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_requestLesson.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_requestLesson.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this request lesson from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this request lesson
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
		_requestLesson.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this request lesson from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this request lesson
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_requestLesson.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	* Returns the related link of this request lesson.
	*
	* @return the related link of this request lesson
	*/
	@Override
	public java.lang.String getRelatedLink() {
		return _requestLesson.getRelatedLink();
	}

	/**
	* Sets the related link of this request lesson.
	*
	* @param relatedLink the related link of this request lesson
	*/
	@Override
	public void setRelatedLink(java.lang.String relatedLink) {
		_requestLesson.setRelatedLink(relatedLink);
	}

	/**
	* Returns the priority of this request lesson.
	*
	* @return the priority of this request lesson
	*/
	@Override
	public boolean getPriority() {
		return _requestLesson.getPriority();
	}

	/**
	* Returns <code>true</code> if this request lesson is priority.
	*
	* @return <code>true</code> if this request lesson is priority; <code>false</code> otherwise
	*/
	@Override
	public boolean isPriority() {
		return _requestLesson.isPriority();
	}

	/**
	* Sets whether this request lesson is priority.
	*
	* @param priority the priority of this request lesson
	*/
	@Override
	public void setPriority(boolean priority) {
		_requestLesson.setPriority(priority);
	}

	/**
	* Returns the created by of this request lesson.
	*
	* @return the created by of this request lesson
	*/
	@Override
	public long getCreatedBy() {
		return _requestLesson.getCreatedBy();
	}

	/**
	* Sets the created by of this request lesson.
	*
	* @param createdBy the created by of this request lesson
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_requestLesson.setCreatedBy(createdBy);
	}

	/**
	* Returns the created date of this request lesson.
	*
	* @return the created date of this request lesson
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _requestLesson.getCreatedDate();
	}

	/**
	* Sets the created date of this request lesson.
	*
	* @param createdDate the created date of this request lesson
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_requestLesson.setCreatedDate(createdDate);
	}

	/**
	* Returns the accepted by of this request lesson.
	*
	* @return the accepted by of this request lesson
	*/
	@Override
	public long getAcceptedBy() {
		return _requestLesson.getAcceptedBy();
	}

	/**
	* Sets the accepted by of this request lesson.
	*
	* @param acceptedBy the accepted by of this request lesson
	*/
	@Override
	public void setAcceptedBy(long acceptedBy) {
		_requestLesson.setAcceptedBy(acceptedBy);
	}

	/**
	* Returns the status of this request lesson.
	*
	* @return the status of this request lesson
	*/
	@Override
	public java.lang.String getStatus() {
		return _requestLesson.getStatus();
	}

	/**
	* Sets the status of this request lesson.
	*
	* @param status the status of this request lesson
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_requestLesson.setStatus(status);
	}

	/**
	* Returns the appreciated user IDs of this request lesson.
	*
	* @return the appreciated user IDs of this request lesson
	*/
	@Override
	public java.lang.String getAppreciatedUserIds() {
		return _requestLesson.getAppreciatedUserIds();
	}

	/**
	* Sets the appreciated user IDs of this request lesson.
	*
	* @param appreciatedUserIds the appreciated user IDs of this request lesson
	*/
	@Override
	public void setAppreciatedUserIds(java.lang.String appreciatedUserIds) {
		_requestLesson.setAppreciatedUserIds(appreciatedUserIds);
	}

	/**
	* Returns the last activity of this request lesson.
	*
	* @return the last activity of this request lesson
	*/
	@Override
	public java.util.Date getLastActivity() {
		return _requestLesson.getLastActivity();
	}

	/**
	* Sets the last activity of this request lesson.
	*
	* @param lastActivity the last activity of this request lesson
	*/
	@Override
	public void setLastActivity(java.util.Date lastActivity) {
		_requestLesson.setLastActivity(lastActivity);
	}

	/**
	* Returns the accepted note of this request lesson.
	*
	* @return the accepted note of this request lesson
	*/
	@Override
	public java.lang.String getAcceptedNote() {
		return _requestLesson.getAcceptedNote();
	}

	/**
	* Returns the localized accepted note of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized accepted note of this request lesson
	*/
	@Override
	public java.lang.String getAcceptedNote(java.util.Locale locale) {
		return _requestLesson.getAcceptedNote(locale);
	}

	/**
	* Returns the localized accepted note of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized accepted note of this request lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getAcceptedNote(java.util.Locale locale,
		boolean useDefault) {
		return _requestLesson.getAcceptedNote(locale, useDefault);
	}

	/**
	* Returns the localized accepted note of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized accepted note of this request lesson
	*/
	@Override
	public java.lang.String getAcceptedNote(java.lang.String languageId) {
		return _requestLesson.getAcceptedNote(languageId);
	}

	/**
	* Returns the localized accepted note of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized accepted note of this request lesson
	*/
	@Override
	public java.lang.String getAcceptedNote(java.lang.String languageId,
		boolean useDefault) {
		return _requestLesson.getAcceptedNote(languageId, useDefault);
	}

	@Override
	public java.lang.String getAcceptedNoteCurrentLanguageId() {
		return _requestLesson.getAcceptedNoteCurrentLanguageId();
	}

	@Override
	public java.lang.String getAcceptedNoteCurrentValue() {
		return _requestLesson.getAcceptedNoteCurrentValue();
	}

	/**
	* Returns a map of the locales and localized accepted notes of this request lesson.
	*
	* @return the locales and localized accepted notes of this request lesson
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getAcceptedNoteMap() {
		return _requestLesson.getAcceptedNoteMap();
	}

	/**
	* Sets the accepted note of this request lesson.
	*
	* @param acceptedNote the accepted note of this request lesson
	*/
	@Override
	public void setAcceptedNote(java.lang.String acceptedNote) {
		_requestLesson.setAcceptedNote(acceptedNote);
	}

	/**
	* Sets the localized accepted note of this request lesson in the language.
	*
	* @param acceptedNote the localized accepted note of this request lesson
	* @param locale the locale of the language
	*/
	@Override
	public void setAcceptedNote(java.lang.String acceptedNote,
		java.util.Locale locale) {
		_requestLesson.setAcceptedNote(acceptedNote, locale);
	}

	/**
	* Sets the localized accepted note of this request lesson in the language, and sets the default locale.
	*
	* @param acceptedNote the localized accepted note of this request lesson
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setAcceptedNote(java.lang.String acceptedNote,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_requestLesson.setAcceptedNote(acceptedNote, locale, defaultLocale);
	}

	@Override
	public void setAcceptedNoteCurrentLanguageId(java.lang.String languageId) {
		_requestLesson.setAcceptedNoteCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized accepted notes of this request lesson from the map of locales and localized accepted notes.
	*
	* @param acceptedNoteMap the locales and localized accepted notes of this request lesson
	*/
	@Override
	public void setAcceptedNoteMap(
		java.util.Map<java.util.Locale, java.lang.String> acceptedNoteMap) {
		_requestLesson.setAcceptedNoteMap(acceptedNoteMap);
	}

	/**
	* Sets the localized accepted notes of this request lesson from the map of locales and localized accepted notes, and sets the default locale.
	*
	* @param acceptedNoteMap the locales and localized accepted notes of this request lesson
	* @param defaultLocale the default locale
	*/
	@Override
	public void setAcceptedNoteMap(
		java.util.Map<java.util.Locale, java.lang.String> acceptedNoteMap,
		java.util.Locale defaultLocale) {
		_requestLesson.setAcceptedNoteMap(acceptedNoteMap, defaultLocale);
	}

	/**
	* Returns the answer type of this request lesson.
	*
	* @return the answer type of this request lesson
	*/
	@Override
	public java.lang.String getAnswerType() {
		return _requestLesson.getAnswerType();
	}

	/**
	* Sets the answer type of this request lesson.
	*
	* @param answerType the answer type of this request lesson
	*/
	@Override
	public void setAnswerType(java.lang.String answerType) {
		_requestLesson.setAnswerType(answerType);
	}

	/**
	* Returns the send to of this request lesson.
	*
	* @return the send to of this request lesson
	*/
	@Override
	public long getSendTo() {
		return _requestLesson.getSendTo();
	}

	/**
	* Sets the send to of this request lesson.
	*
	* @param sendTo the send to of this request lesson
	*/
	@Override
	public void setSendTo(long sendTo) {
		_requestLesson.setSendTo(sendTo);
	}

	/**
	* Returns the opnion survey link of this request lesson.
	*
	* @return the opnion survey link of this request lesson
	*/
	@Override
	public java.lang.String getOpnionSurveyLink() {
		return _requestLesson.getOpnionSurveyLink();
	}

	/**
	* Sets the opnion survey link of this request lesson.
	*
	* @param opnionSurveyLink the opnion survey link of this request lesson
	*/
	@Override
	public void setOpnionSurveyLink(java.lang.String opnionSurveyLink) {
		_requestLesson.setOpnionSurveyLink(opnionSurveyLink);
	}

	/**
	* Returns the survey options of this request lesson.
	*
	* @return the survey options of this request lesson
	*/
	@Override
	public java.lang.String getSurveyOptions() {
		return _requestLesson.getSurveyOptions();
	}

	/**
	* Sets the survey options of this request lesson.
	*
	* @param surveyOptions the survey options of this request lesson
	*/
	@Override
	public void setSurveyOptions(java.lang.String surveyOptions) {
		_requestLesson.setSurveyOptions(surveyOptions);
	}

	@Override
	public boolean isNew() {
		return _requestLesson.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_requestLesson.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _requestLesson.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_requestLesson.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _requestLesson.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _requestLesson.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_requestLesson.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _requestLesson.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_requestLesson.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_requestLesson.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_requestLesson.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _requestLesson.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _requestLesson.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_requestLesson.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_requestLesson.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new RequestLessonWrapper((RequestLesson)_requestLesson.clone());
	}

	@Override
	public int compareTo(com.nyu.model.RequestLesson requestLesson) {
		return _requestLesson.compareTo(requestLesson);
	}

	@Override
	public int hashCode() {
		return _requestLesson.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.RequestLesson> toCacheModel() {
		return _requestLesson.toCacheModel();
	}

	@Override
	public com.nyu.model.RequestLesson toEscapedModel() {
		return new RequestLessonWrapper(_requestLesson.toEscapedModel());
	}

	@Override
	public com.nyu.model.RequestLesson toUnescapedModel() {
		return new RequestLessonWrapper(_requestLesson.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _requestLesson.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _requestLesson.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_requestLesson.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequestLessonWrapper)) {
			return false;
		}

		RequestLessonWrapper requestLessonWrapper = (RequestLessonWrapper)obj;

		if (Validator.equals(_requestLesson, requestLessonWrapper._requestLesson)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RequestLesson getWrappedRequestLesson() {
		return _requestLesson;
	}

	@Override
	public RequestLesson getWrappedModel() {
		return _requestLesson;
	}

	@Override
	public void resetOriginalValues() {
		_requestLesson.resetOriginalValues();
	}

	private RequestLesson _requestLesson;
}