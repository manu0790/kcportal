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
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the RequestLesson service. Represents a row in the &quot;nyyou_RequestLesson&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.RequestLessonModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.RequestLessonImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see RequestLesson
 * @see com.nyu.model.impl.RequestLessonImpl
 * @see com.nyu.model.impl.RequestLessonModelImpl
 * @generated
 */
public interface RequestLessonModel extends BaseModel<RequestLesson> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a request lesson model instance should use the {@link RequestLesson} interface instead.
	 */

	/**
	 * Returns the primary key of this request lesson.
	 *
	 * @return the primary key of this request lesson
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this request lesson.
	 *
	 * @param primaryKey the primary key of this request lesson
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the request lesson ID of this request lesson.
	 *
	 * @return the request lesson ID of this request lesson
	 */
	public long getRequestLessonId();

	/**
	 * Sets the request lesson ID of this request lesson.
	 *
	 * @param requestLessonId the request lesson ID of this request lesson
	 */
	public void setRequestLessonId(long requestLessonId);

	/**
	 * Returns the company ID of this request lesson.
	 *
	 * @return the company ID of this request lesson
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this request lesson.
	 *
	 * @param companyId the company ID of this request lesson
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this request lesson.
	 *
	 * @return the group ID of this request lesson
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this request lesson.
	 *
	 * @param groupId the group ID of this request lesson
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the name of this request lesson.
	 *
	 * @return the name of this request lesson
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this request lesson.
	 *
	 * @param name the name of this request lesson
	 */
	public void setName(String name);

	/**
	 * Returns the description of this request lesson.
	 *
	 * @return the description of this request lesson
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this request lesson
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this request lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this request lesson
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this request lesson
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this request lesson.
	 *
	 * @return the locales and localized descriptions of this request lesson
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this request lesson.
	 *
	 * @param description the description of this request lesson
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this request lesson in the language.
	 *
	 * @param description the localized description of this request lesson
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this request lesson in the language, and sets the default locale.
	 *
	 * @param description the localized description of this request lesson
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this request lesson from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this request lesson
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this request lesson from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this request lesson
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Returns the related link of this request lesson.
	 *
	 * @return the related link of this request lesson
	 */
	@AutoEscape
	public String getRelatedLink();

	/**
	 * Sets the related link of this request lesson.
	 *
	 * @param relatedLink the related link of this request lesson
	 */
	public void setRelatedLink(String relatedLink);

	/**
	 * Returns the priority of this request lesson.
	 *
	 * @return the priority of this request lesson
	 */
	public boolean getPriority();

	/**
	 * Returns <code>true</code> if this request lesson is priority.
	 *
	 * @return <code>true</code> if this request lesson is priority; <code>false</code> otherwise
	 */
	public boolean isPriority();

	/**
	 * Sets whether this request lesson is priority.
	 *
	 * @param priority the priority of this request lesson
	 */
	public void setPriority(boolean priority);

	/**
	 * Returns the created by of this request lesson.
	 *
	 * @return the created by of this request lesson
	 */
	public long getCreatedBy();

	/**
	 * Sets the created by of this request lesson.
	 *
	 * @param createdBy the created by of this request lesson
	 */
	public void setCreatedBy(long createdBy);

	/**
	 * Returns the created date of this request lesson.
	 *
	 * @return the created date of this request lesson
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this request lesson.
	 *
	 * @param createdDate the created date of this request lesson
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the accepted by of this request lesson.
	 *
	 * @return the accepted by of this request lesson
	 */
	public long getAcceptedBy();

	/**
	 * Sets the accepted by of this request lesson.
	 *
	 * @param acceptedBy the accepted by of this request lesson
	 */
	public void setAcceptedBy(long acceptedBy);

	/**
	 * Returns the status of this request lesson.
	 *
	 * @return the status of this request lesson
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this request lesson.
	 *
	 * @param status the status of this request lesson
	 */
	public void setStatus(String status);

	/**
	 * Returns the appreciated user IDs of this request lesson.
	 *
	 * @return the appreciated user IDs of this request lesson
	 */
	@AutoEscape
	public String getAppreciatedUserIds();

	/**
	 * Sets the appreciated user IDs of this request lesson.
	 *
	 * @param appreciatedUserIds the appreciated user IDs of this request lesson
	 */
	public void setAppreciatedUserIds(String appreciatedUserIds);

	/**
	 * Returns the last activity of this request lesson.
	 *
	 * @return the last activity of this request lesson
	 */
	public Date getLastActivity();

	/**
	 * Sets the last activity of this request lesson.
	 *
	 * @param lastActivity the last activity of this request lesson
	 */
	public void setLastActivity(Date lastActivity);

	/**
	 * Returns the accepted note of this request lesson.
	 *
	 * @return the accepted note of this request lesson
	 */
	public String getAcceptedNote();

	/**
	 * Returns the localized accepted note of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized accepted note of this request lesson
	 */
	@AutoEscape
	public String getAcceptedNote(Locale locale);

	/**
	 * Returns the localized accepted note of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized accepted note of this request lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getAcceptedNote(Locale locale, boolean useDefault);

	/**
	 * Returns the localized accepted note of this request lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized accepted note of this request lesson
	 */
	@AutoEscape
	public String getAcceptedNote(String languageId);

	/**
	 * Returns the localized accepted note of this request lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized accepted note of this request lesson
	 */
	@AutoEscape
	public String getAcceptedNote(String languageId, boolean useDefault);

	@AutoEscape
	public String getAcceptedNoteCurrentLanguageId();

	@AutoEscape
	public String getAcceptedNoteCurrentValue();

	/**
	 * Returns a map of the locales and localized accepted notes of this request lesson.
	 *
	 * @return the locales and localized accepted notes of this request lesson
	 */
	public Map<Locale, String> getAcceptedNoteMap();

	/**
	 * Sets the accepted note of this request lesson.
	 *
	 * @param acceptedNote the accepted note of this request lesson
	 */
	public void setAcceptedNote(String acceptedNote);

	/**
	 * Sets the localized accepted note of this request lesson in the language.
	 *
	 * @param acceptedNote the localized accepted note of this request lesson
	 * @param locale the locale of the language
	 */
	public void setAcceptedNote(String acceptedNote, Locale locale);

	/**
	 * Sets the localized accepted note of this request lesson in the language, and sets the default locale.
	 *
	 * @param acceptedNote the localized accepted note of this request lesson
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setAcceptedNote(String acceptedNote, Locale locale,
		Locale defaultLocale);

	public void setAcceptedNoteCurrentLanguageId(String languageId);

	/**
	 * Sets the localized accepted notes of this request lesson from the map of locales and localized accepted notes.
	 *
	 * @param acceptedNoteMap the locales and localized accepted notes of this request lesson
	 */
	public void setAcceptedNoteMap(Map<Locale, String> acceptedNoteMap);

	/**
	 * Sets the localized accepted notes of this request lesson from the map of locales and localized accepted notes, and sets the default locale.
	 *
	 * @param acceptedNoteMap the locales and localized accepted notes of this request lesson
	 * @param defaultLocale the default locale
	 */
	public void setAcceptedNoteMap(Map<Locale, String> acceptedNoteMap,
		Locale defaultLocale);

	/**
	 * Returns the answer type of this request lesson.
	 *
	 * @return the answer type of this request lesson
	 */
	@AutoEscape
	public String getAnswerType();

	/**
	 * Sets the answer type of this request lesson.
	 *
	 * @param answerType the answer type of this request lesson
	 */
	public void setAnswerType(String answerType);

	/**
	 * Returns the send to of this request lesson.
	 *
	 * @return the send to of this request lesson
	 */
	public long getSendTo();

	/**
	 * Sets the send to of this request lesson.
	 *
	 * @param sendTo the send to of this request lesson
	 */
	public void setSendTo(long sendTo);

	/**
	 * Returns the opnion survey link of this request lesson.
	 *
	 * @return the opnion survey link of this request lesson
	 */
	@AutoEscape
	public String getOpnionSurveyLink();

	/**
	 * Sets the opnion survey link of this request lesson.
	 *
	 * @param opnionSurveyLink the opnion survey link of this request lesson
	 */
	public void setOpnionSurveyLink(String opnionSurveyLink);

	/**
	 * Returns the survey options of this request lesson.
	 *
	 * @return the survey options of this request lesson
	 */
	@AutoEscape
	public String getSurveyOptions();

	/**
	 * Sets the survey options of this request lesson.
	 *
	 * @param surveyOptions the survey options of this request lesson
	 */
	public void setSurveyOptions(String surveyOptions);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public String[] getAvailableLanguageIds();

	public String getDefaultLanguageId();

	public void prepareLocalizedFieldsForImport() throws LocaleException;

	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(RequestLesson requestLesson);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RequestLesson> toCacheModel();

	@Override
	public RequestLesson toEscapedModel();

	@Override
	public RequestLesson toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}