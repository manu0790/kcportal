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
 * This class is a wrapper for {@link Lesson}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson
 * @generated
 */
public class LessonWrapper implements Lesson, ModelWrapper<Lesson> {
	public LessonWrapper(Lesson lesson) {
		_lesson = lesson;
	}

	@Override
	public Class<?> getModelClass() {
		return Lesson.class;
	}

	@Override
	public String getModelClassName() {
		return Lesson.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("lessonId", getLessonId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("lessonName", getLessonName());
		attributes.put("description", getDescription());
		attributes.put("author", getAuthor());
		attributes.put("courseId", getCourseId());
		attributes.put("appreciatedUserIds", getAppreciatedUserIds());
		attributes.put("appreciateCount", getAppreciateCount());
		attributes.put("uploadedTime", getUploadedTime());
		attributes.put("uploadedById", getUploadedById());
		attributes.put("uploadedByName", getUploadedByName());
		attributes.put("lessonNote", getLessonNote());
		attributes.put("status", getStatus());
		attributes.put("requestLessonId", getRequestLessonId());
		attributes.put("lessonPrivacy", getLessonPrivacy());
		attributes.put("featured", getFeatured());
		attributes.put("creator", getCreator());
		attributes.put("secondaryAuthor", getSecondaryAuthor());
		attributes.put("createDate", getCreateDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("permission", getPermission());
		attributes.put("markedAs", getMarkedAs());
		attributes.put("markedBy", getMarkedBy());
		attributes.put("markedContent", getMarkedContent());
		attributes.put("currentAuthor", getCurrentAuthor());
		attributes.put("shareWithProfile", getShareWithProfile());
		attributes.put("publishWithProfile", getPublishWithProfile());
		attributes.put("publishedProfile", getPublishedProfile());
		attributes.put("version", getVersion());
		attributes.put("lessonStatus", getLessonStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String lessonName = (String)attributes.get("lessonName");

		if (lessonName != null) {
			setLessonName(lessonName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long author = (Long)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String courseId = (String)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		String appreciatedUserIds = (String)attributes.get("appreciatedUserIds");

		if (appreciatedUserIds != null) {
			setAppreciatedUserIds(appreciatedUserIds);
		}

		Integer appreciateCount = (Integer)attributes.get("appreciateCount");

		if (appreciateCount != null) {
			setAppreciateCount(appreciateCount);
		}

		Date uploadedTime = (Date)attributes.get("uploadedTime");

		if (uploadedTime != null) {
			setUploadedTime(uploadedTime);
		}

		Long uploadedById = (Long)attributes.get("uploadedById");

		if (uploadedById != null) {
			setUploadedById(uploadedById);
		}

		String uploadedByName = (String)attributes.get("uploadedByName");

		if (uploadedByName != null) {
			setUploadedByName(uploadedByName);
		}

		String lessonNote = (String)attributes.get("lessonNote");

		if (lessonNote != null) {
			setLessonNote(lessonNote);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long requestLessonId = (Long)attributes.get("requestLessonId");

		if (requestLessonId != null) {
			setRequestLessonId(requestLessonId);
		}

		String lessonPrivacy = (String)attributes.get("lessonPrivacy");

		if (lessonPrivacy != null) {
			setLessonPrivacy(lessonPrivacy);
		}

		Boolean featured = (Boolean)attributes.get("featured");

		if (featured != null) {
			setFeatured(featured);
		}

		String creator = (String)attributes.get("creator");

		if (creator != null) {
			setCreator(creator);
		}

		String secondaryAuthor = (String)attributes.get("secondaryAuthor");

		if (secondaryAuthor != null) {
			setSecondaryAuthor(secondaryAuthor);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}

		String permission = (String)attributes.get("permission");

		if (permission != null) {
			setPermission(permission);
		}

		String markedAs = (String)attributes.get("markedAs");

		if (markedAs != null) {
			setMarkedAs(markedAs);
		}

		Long markedBy = (Long)attributes.get("markedBy");

		if (markedBy != null) {
			setMarkedBy(markedBy);
		}

		String markedContent = (String)attributes.get("markedContent");

		if (markedContent != null) {
			setMarkedContent(markedContent);
		}

		Long currentAuthor = (Long)attributes.get("currentAuthor");

		if (currentAuthor != null) {
			setCurrentAuthor(currentAuthor);
		}

		Long shareWithProfile = (Long)attributes.get("shareWithProfile");

		if (shareWithProfile != null) {
			setShareWithProfile(shareWithProfile);
		}

		Long publishWithProfile = (Long)attributes.get("publishWithProfile");

		if (publishWithProfile != null) {
			setPublishWithProfile(publishWithProfile);
		}

		String publishedProfile = (String)attributes.get("publishedProfile");

		if (publishedProfile != null) {
			setPublishedProfile(publishedProfile);
		}

		Double version = (Double)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Integer lessonStatus = (Integer)attributes.get("lessonStatus");

		if (lessonStatus != null) {
			setLessonStatus(lessonStatus);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	* Returns the primary key of this lesson.
	*
	* @return the primary key of this lesson
	*/
	@Override
	public long getPrimaryKey() {
		return _lesson.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lesson.
	*
	* @param primaryKey the primary key of this lesson
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lesson.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this lesson.
	*
	* @return the uuid of this lesson
	*/
	@Override
	public java.lang.String getUuid() {
		return _lesson.getUuid();
	}

	/**
	* Sets the uuid of this lesson.
	*
	* @param uuid the uuid of this lesson
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_lesson.setUuid(uuid);
	}

	/**
	* Returns the lesson ID of this lesson.
	*
	* @return the lesson ID of this lesson
	*/
	@Override
	public long getLessonId() {
		return _lesson.getLessonId();
	}

	/**
	* Sets the lesson ID of this lesson.
	*
	* @param lessonId the lesson ID of this lesson
	*/
	@Override
	public void setLessonId(long lessonId) {
		_lesson.setLessonId(lessonId);
	}

	/**
	* Returns the company ID of this lesson.
	*
	* @return the company ID of this lesson
	*/
	@Override
	public long getCompanyId() {
		return _lesson.getCompanyId();
	}

	/**
	* Sets the company ID of this lesson.
	*
	* @param companyId the company ID of this lesson
	*/
	@Override
	public void setCompanyId(long companyId) {
		_lesson.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this lesson.
	*
	* @return the group ID of this lesson
	*/
	@Override
	public long getGroupId() {
		return _lesson.getGroupId();
	}

	/**
	* Sets the group ID of this lesson.
	*
	* @param groupId the group ID of this lesson
	*/
	@Override
	public void setGroupId(long groupId) {
		_lesson.setGroupId(groupId);
	}

	/**
	* Returns the lesson name of this lesson.
	*
	* @return the lesson name of this lesson
	*/
	@Override
	public java.lang.String getLessonName() {
		return _lesson.getLessonName();
	}

	/**
	* Returns the localized lesson name of this lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized lesson name of this lesson
	*/
	@Override
	public java.lang.String getLessonName(java.util.Locale locale) {
		return _lesson.getLessonName(locale);
	}

	/**
	* Returns the localized lesson name of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized lesson name of this lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getLessonName(java.util.Locale locale,
		boolean useDefault) {
		return _lesson.getLessonName(locale, useDefault);
	}

	/**
	* Returns the localized lesson name of this lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized lesson name of this lesson
	*/
	@Override
	public java.lang.String getLessonName(java.lang.String languageId) {
		return _lesson.getLessonName(languageId);
	}

	/**
	* Returns the localized lesson name of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized lesson name of this lesson
	*/
	@Override
	public java.lang.String getLessonName(java.lang.String languageId,
		boolean useDefault) {
		return _lesson.getLessonName(languageId, useDefault);
	}

	@Override
	public java.lang.String getLessonNameCurrentLanguageId() {
		return _lesson.getLessonNameCurrentLanguageId();
	}

	@Override
	public java.lang.String getLessonNameCurrentValue() {
		return _lesson.getLessonNameCurrentValue();
	}

	/**
	* Returns a map of the locales and localized lesson names of this lesson.
	*
	* @return the locales and localized lesson names of this lesson
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getLessonNameMap() {
		return _lesson.getLessonNameMap();
	}

	/**
	* Sets the lesson name of this lesson.
	*
	* @param lessonName the lesson name of this lesson
	*/
	@Override
	public void setLessonName(java.lang.String lessonName) {
		_lesson.setLessonName(lessonName);
	}

	/**
	* Sets the localized lesson name of this lesson in the language.
	*
	* @param lessonName the localized lesson name of this lesson
	* @param locale the locale of the language
	*/
	@Override
	public void setLessonName(java.lang.String lessonName,
		java.util.Locale locale) {
		_lesson.setLessonName(lessonName, locale);
	}

	/**
	* Sets the localized lesson name of this lesson in the language, and sets the default locale.
	*
	* @param lessonName the localized lesson name of this lesson
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setLessonName(java.lang.String lessonName,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_lesson.setLessonName(lessonName, locale, defaultLocale);
	}

	@Override
	public void setLessonNameCurrentLanguageId(java.lang.String languageId) {
		_lesson.setLessonNameCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized lesson names of this lesson from the map of locales and localized lesson names.
	*
	* @param lessonNameMap the locales and localized lesson names of this lesson
	*/
	@Override
	public void setLessonNameMap(
		java.util.Map<java.util.Locale, java.lang.String> lessonNameMap) {
		_lesson.setLessonNameMap(lessonNameMap);
	}

	/**
	* Sets the localized lesson names of this lesson from the map of locales and localized lesson names, and sets the default locale.
	*
	* @param lessonNameMap the locales and localized lesson names of this lesson
	* @param defaultLocale the default locale
	*/
	@Override
	public void setLessonNameMap(
		java.util.Map<java.util.Locale, java.lang.String> lessonNameMap,
		java.util.Locale defaultLocale) {
		_lesson.setLessonNameMap(lessonNameMap, defaultLocale);
	}

	/**
	* Returns the description of this lesson.
	*
	* @return the description of this lesson
	*/
	@Override
	public java.lang.String getDescription() {
		return _lesson.getDescription();
	}

	/**
	* Returns the localized description of this lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this lesson
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _lesson.getDescription(locale);
	}

	/**
	* Returns the localized description of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _lesson.getDescription(locale, useDefault);
	}

	/**
	* Returns the localized description of this lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this lesson
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _lesson.getDescription(languageId);
	}

	/**
	* Returns the localized description of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this lesson
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _lesson.getDescription(languageId, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _lesson.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _lesson.getDescriptionCurrentValue();
	}

	/**
	* Returns a map of the locales and localized descriptions of this lesson.
	*
	* @return the locales and localized descriptions of this lesson
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _lesson.getDescriptionMap();
	}

	/**
	* Sets the description of this lesson.
	*
	* @param description the description of this lesson
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_lesson.setDescription(description);
	}

	/**
	* Sets the localized description of this lesson in the language.
	*
	* @param description the localized description of this lesson
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_lesson.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this lesson in the language, and sets the default locale.
	*
	* @param description the localized description of this lesson
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_lesson.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_lesson.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this lesson from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this lesson
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
		_lesson.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this lesson from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this lesson
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_lesson.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	* Returns the author of this lesson.
	*
	* @return the author of this lesson
	*/
	@Override
	public long getAuthor() {
		return _lesson.getAuthor();
	}

	/**
	* Sets the author of this lesson.
	*
	* @param author the author of this lesson
	*/
	@Override
	public void setAuthor(long author) {
		_lesson.setAuthor(author);
	}

	/**
	* Returns the course ID of this lesson.
	*
	* @return the course ID of this lesson
	*/
	@Override
	public java.lang.String getCourseId() {
		return _lesson.getCourseId();
	}

	/**
	* Sets the course ID of this lesson.
	*
	* @param courseId the course ID of this lesson
	*/
	@Override
	public void setCourseId(java.lang.String courseId) {
		_lesson.setCourseId(courseId);
	}

	/**
	* Returns the appreciated user IDs of this lesson.
	*
	* @return the appreciated user IDs of this lesson
	*/
	@Override
	public java.lang.String getAppreciatedUserIds() {
		return _lesson.getAppreciatedUserIds();
	}

	/**
	* Sets the appreciated user IDs of this lesson.
	*
	* @param appreciatedUserIds the appreciated user IDs of this lesson
	*/
	@Override
	public void setAppreciatedUserIds(java.lang.String appreciatedUserIds) {
		_lesson.setAppreciatedUserIds(appreciatedUserIds);
	}

	/**
	* Returns the appreciate count of this lesson.
	*
	* @return the appreciate count of this lesson
	*/
	@Override
	public int getAppreciateCount() {
		return _lesson.getAppreciateCount();
	}

	/**
	* Sets the appreciate count of this lesson.
	*
	* @param appreciateCount the appreciate count of this lesson
	*/
	@Override
	public void setAppreciateCount(int appreciateCount) {
		_lesson.setAppreciateCount(appreciateCount);
	}

	/**
	* Returns the uploaded time of this lesson.
	*
	* @return the uploaded time of this lesson
	*/
	@Override
	public java.util.Date getUploadedTime() {
		return _lesson.getUploadedTime();
	}

	/**
	* Sets the uploaded time of this lesson.
	*
	* @param uploadedTime the uploaded time of this lesson
	*/
	@Override
	public void setUploadedTime(java.util.Date uploadedTime) {
		_lesson.setUploadedTime(uploadedTime);
	}

	/**
	* Returns the uploaded by ID of this lesson.
	*
	* @return the uploaded by ID of this lesson
	*/
	@Override
	public long getUploadedById() {
		return _lesson.getUploadedById();
	}

	/**
	* Sets the uploaded by ID of this lesson.
	*
	* @param uploadedById the uploaded by ID of this lesson
	*/
	@Override
	public void setUploadedById(long uploadedById) {
		_lesson.setUploadedById(uploadedById);
	}

	/**
	* Returns the uploaded by name of this lesson.
	*
	* @return the uploaded by name of this lesson
	*/
	@Override
	public java.lang.String getUploadedByName() {
		return _lesson.getUploadedByName();
	}

	/**
	* Sets the uploaded by name of this lesson.
	*
	* @param uploadedByName the uploaded by name of this lesson
	*/
	@Override
	public void setUploadedByName(java.lang.String uploadedByName) {
		_lesson.setUploadedByName(uploadedByName);
	}

	/**
	* Returns the lesson note of this lesson.
	*
	* @return the lesson note of this lesson
	*/
	@Override
	public java.lang.String getLessonNote() {
		return _lesson.getLessonNote();
	}

	/**
	* Sets the lesson note of this lesson.
	*
	* @param lessonNote the lesson note of this lesson
	*/
	@Override
	public void setLessonNote(java.lang.String lessonNote) {
		_lesson.setLessonNote(lessonNote);
	}

	/**
	* Returns the status of this lesson.
	*
	* @return the status of this lesson
	*/
	@Override
	public java.lang.String getStatus() {
		return _lesson.getStatus();
	}

	/**
	* Sets the status of this lesson.
	*
	* @param status the status of this lesson
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_lesson.setStatus(status);
	}

	/**
	* Returns the request lesson ID of this lesson.
	*
	* @return the request lesson ID of this lesson
	*/
	@Override
	public long getRequestLessonId() {
		return _lesson.getRequestLessonId();
	}

	/**
	* Sets the request lesson ID of this lesson.
	*
	* @param requestLessonId the request lesson ID of this lesson
	*/
	@Override
	public void setRequestLessonId(long requestLessonId) {
		_lesson.setRequestLessonId(requestLessonId);
	}

	/**
	* Returns the lesson privacy of this lesson.
	*
	* @return the lesson privacy of this lesson
	*/
	@Override
	public java.lang.String getLessonPrivacy() {
		return _lesson.getLessonPrivacy();
	}

	/**
	* Sets the lesson privacy of this lesson.
	*
	* @param lessonPrivacy the lesson privacy of this lesson
	*/
	@Override
	public void setLessonPrivacy(java.lang.String lessonPrivacy) {
		_lesson.setLessonPrivacy(lessonPrivacy);
	}

	/**
	* Returns the featured of this lesson.
	*
	* @return the featured of this lesson
	*/
	@Override
	public boolean getFeatured() {
		return _lesson.getFeatured();
	}

	/**
	* Returns <code>true</code> if this lesson is featured.
	*
	* @return <code>true</code> if this lesson is featured; <code>false</code> otherwise
	*/
	@Override
	public boolean isFeatured() {
		return _lesson.isFeatured();
	}

	/**
	* Sets whether this lesson is featured.
	*
	* @param featured the featured of this lesson
	*/
	@Override
	public void setFeatured(boolean featured) {
		_lesson.setFeatured(featured);
	}

	/**
	* Returns the creator of this lesson.
	*
	* @return the creator of this lesson
	*/
	@Override
	public java.lang.String getCreator() {
		return _lesson.getCreator();
	}

	/**
	* Returns the localized creator of this lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized creator of this lesson
	*/
	@Override
	public java.lang.String getCreator(java.util.Locale locale) {
		return _lesson.getCreator(locale);
	}

	/**
	* Returns the localized creator of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized creator of this lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getCreator(java.util.Locale locale,
		boolean useDefault) {
		return _lesson.getCreator(locale, useDefault);
	}

	/**
	* Returns the localized creator of this lesson in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized creator of this lesson
	*/
	@Override
	public java.lang.String getCreator(java.lang.String languageId) {
		return _lesson.getCreator(languageId);
	}

	/**
	* Returns the localized creator of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized creator of this lesson
	*/
	@Override
	public java.lang.String getCreator(java.lang.String languageId,
		boolean useDefault) {
		return _lesson.getCreator(languageId, useDefault);
	}

	@Override
	public java.lang.String getCreatorCurrentLanguageId() {
		return _lesson.getCreatorCurrentLanguageId();
	}

	@Override
	public java.lang.String getCreatorCurrentValue() {
		return _lesson.getCreatorCurrentValue();
	}

	/**
	* Returns a map of the locales and localized creators of this lesson.
	*
	* @return the locales and localized creators of this lesson
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getCreatorMap() {
		return _lesson.getCreatorMap();
	}

	/**
	* Sets the creator of this lesson.
	*
	* @param creator the creator of this lesson
	*/
	@Override
	public void setCreator(java.lang.String creator) {
		_lesson.setCreator(creator);
	}

	/**
	* Sets the localized creator of this lesson in the language.
	*
	* @param creator the localized creator of this lesson
	* @param locale the locale of the language
	*/
	@Override
	public void setCreator(java.lang.String creator, java.util.Locale locale) {
		_lesson.setCreator(creator, locale);
	}

	/**
	* Sets the localized creator of this lesson in the language, and sets the default locale.
	*
	* @param creator the localized creator of this lesson
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setCreator(java.lang.String creator, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_lesson.setCreator(creator, locale, defaultLocale);
	}

	@Override
	public void setCreatorCurrentLanguageId(java.lang.String languageId) {
		_lesson.setCreatorCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized creators of this lesson from the map of locales and localized creators.
	*
	* @param creatorMap the locales and localized creators of this lesson
	*/
	@Override
	public void setCreatorMap(
		java.util.Map<java.util.Locale, java.lang.String> creatorMap) {
		_lesson.setCreatorMap(creatorMap);
	}

	/**
	* Sets the localized creators of this lesson from the map of locales and localized creators, and sets the default locale.
	*
	* @param creatorMap the locales and localized creators of this lesson
	* @param defaultLocale the default locale
	*/
	@Override
	public void setCreatorMap(
		java.util.Map<java.util.Locale, java.lang.String> creatorMap,
		java.util.Locale defaultLocale) {
		_lesson.setCreatorMap(creatorMap, defaultLocale);
	}

	/**
	* Returns the secondary author of this lesson.
	*
	* @return the secondary author of this lesson
	*/
	@Override
	public java.lang.String getSecondaryAuthor() {
		return _lesson.getSecondaryAuthor();
	}

	/**
	* Sets the secondary author of this lesson.
	*
	* @param secondaryAuthor the secondary author of this lesson
	*/
	@Override
	public void setSecondaryAuthor(java.lang.String secondaryAuthor) {
		_lesson.setSecondaryAuthor(secondaryAuthor);
	}

	/**
	* Returns the create date of this lesson.
	*
	* @return the create date of this lesson
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _lesson.getCreateDate();
	}

	/**
	* Sets the create date of this lesson.
	*
	* @param createDate the create date of this lesson
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_lesson.setCreateDate(createDate);
	}

	/**
	* Returns the create by of this lesson.
	*
	* @return the create by of this lesson
	*/
	@Override
	public long getCreateBy() {
		return _lesson.getCreateBy();
	}

	/**
	* Sets the create by of this lesson.
	*
	* @param createBy the create by of this lesson
	*/
	@Override
	public void setCreateBy(long createBy) {
		_lesson.setCreateBy(createBy);
	}

	/**
	* Returns the updated date of this lesson.
	*
	* @return the updated date of this lesson
	*/
	@Override
	public java.util.Date getUpdatedDate() {
		return _lesson.getUpdatedDate();
	}

	/**
	* Sets the updated date of this lesson.
	*
	* @param updatedDate the updated date of this lesson
	*/
	@Override
	public void setUpdatedDate(java.util.Date updatedDate) {
		_lesson.setUpdatedDate(updatedDate);
	}

	/**
	* Returns the updated by of this lesson.
	*
	* @return the updated by of this lesson
	*/
	@Override
	public long getUpdatedBy() {
		return _lesson.getUpdatedBy();
	}

	/**
	* Sets the updated by of this lesson.
	*
	* @param updatedBy the updated by of this lesson
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_lesson.setUpdatedBy(updatedBy);
	}

	/**
	* Returns the permission of this lesson.
	*
	* @return the permission of this lesson
	*/
	@Override
	public java.lang.String getPermission() {
		return _lesson.getPermission();
	}

	/**
	* Sets the permission of this lesson.
	*
	* @param permission the permission of this lesson
	*/
	@Override
	public void setPermission(java.lang.String permission) {
		_lesson.setPermission(permission);
	}

	/**
	* Returns the marked as of this lesson.
	*
	* @return the marked as of this lesson
	*/
	@Override
	public java.lang.String getMarkedAs() {
		return _lesson.getMarkedAs();
	}

	/**
	* Sets the marked as of this lesson.
	*
	* @param markedAs the marked as of this lesson
	*/
	@Override
	public void setMarkedAs(java.lang.String markedAs) {
		_lesson.setMarkedAs(markedAs);
	}

	/**
	* Returns the marked by of this lesson.
	*
	* @return the marked by of this lesson
	*/
	@Override
	public long getMarkedBy() {
		return _lesson.getMarkedBy();
	}

	/**
	* Sets the marked by of this lesson.
	*
	* @param markedBy the marked by of this lesson
	*/
	@Override
	public void setMarkedBy(long markedBy) {
		_lesson.setMarkedBy(markedBy);
	}

	/**
	* Returns the marked content of this lesson.
	*
	* @return the marked content of this lesson
	*/
	@Override
	public java.lang.String getMarkedContent() {
		return _lesson.getMarkedContent();
	}

	/**
	* Sets the marked content of this lesson.
	*
	* @param markedContent the marked content of this lesson
	*/
	@Override
	public void setMarkedContent(java.lang.String markedContent) {
		_lesson.setMarkedContent(markedContent);
	}

	/**
	* Returns the current author of this lesson.
	*
	* @return the current author of this lesson
	*/
	@Override
	public long getCurrentAuthor() {
		return _lesson.getCurrentAuthor();
	}

	/**
	* Sets the current author of this lesson.
	*
	* @param currentAuthor the current author of this lesson
	*/
	@Override
	public void setCurrentAuthor(long currentAuthor) {
		_lesson.setCurrentAuthor(currentAuthor);
	}

	/**
	* Returns the share with profile of this lesson.
	*
	* @return the share with profile of this lesson
	*/
	@Override
	public long getShareWithProfile() {
		return _lesson.getShareWithProfile();
	}

	/**
	* Sets the share with profile of this lesson.
	*
	* @param shareWithProfile the share with profile of this lesson
	*/
	@Override
	public void setShareWithProfile(long shareWithProfile) {
		_lesson.setShareWithProfile(shareWithProfile);
	}

	/**
	* Returns the publish with profile of this lesson.
	*
	* @return the publish with profile of this lesson
	*/
	@Override
	public long getPublishWithProfile() {
		return _lesson.getPublishWithProfile();
	}

	/**
	* Sets the publish with profile of this lesson.
	*
	* @param publishWithProfile the publish with profile of this lesson
	*/
	@Override
	public void setPublishWithProfile(long publishWithProfile) {
		_lesson.setPublishWithProfile(publishWithProfile);
	}

	/**
	* Returns the published profile of this lesson.
	*
	* @return the published profile of this lesson
	*/
	@Override
	public java.lang.String getPublishedProfile() {
		return _lesson.getPublishedProfile();
	}

	/**
	* Sets the published profile of this lesson.
	*
	* @param publishedProfile the published profile of this lesson
	*/
	@Override
	public void setPublishedProfile(java.lang.String publishedProfile) {
		_lesson.setPublishedProfile(publishedProfile);
	}

	/**
	* Returns the version of this lesson.
	*
	* @return the version of this lesson
	*/
	@Override
	public double getVersion() {
		return _lesson.getVersion();
	}

	/**
	* Sets the version of this lesson.
	*
	* @param version the version of this lesson
	*/
	@Override
	public void setVersion(double version) {
		_lesson.setVersion(version);
	}

	/**
	* Returns the lesson status of this lesson.
	*
	* @return the lesson status of this lesson
	*/
	@Override
	public int getLessonStatus() {
		return _lesson.getLessonStatus();
	}

	/**
	* Sets the lesson status of this lesson.
	*
	* @param lessonStatus the lesson status of this lesson
	*/
	@Override
	public void setLessonStatus(int lessonStatus) {
		_lesson.setLessonStatus(lessonStatus);
	}

	/**
	* Returns the status by user ID of this lesson.
	*
	* @return the status by user ID of this lesson
	*/
	@Override
	public long getStatusByUserId() {
		return _lesson.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this lesson.
	*
	* @param statusByUserId the status by user ID of this lesson
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_lesson.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this lesson.
	*
	* @return the status by user uuid of this lesson
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lesson.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this lesson.
	*
	* @param statusByUserUuid the status by user uuid of this lesson
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_lesson.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status date of this lesson.
	*
	* @return the status date of this lesson
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _lesson.getStatusDate();
	}

	/**
	* Sets the status date of this lesson.
	*
	* @param statusDate the status date of this lesson
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_lesson.setStatusDate(statusDate);
	}

	@Override
	public boolean isNew() {
		return _lesson.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lesson.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lesson.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lesson.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lesson.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lesson.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lesson.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lesson.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lesson.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lesson.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lesson.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _lesson.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _lesson.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_lesson.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_lesson.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new LessonWrapper((Lesson)_lesson.clone());
	}

	@Override
	public int compareTo(com.nyu.model.Lesson lesson) {
		return _lesson.compareTo(lesson);
	}

	@Override
	public int hashCode() {
		return _lesson.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nyu.model.Lesson> toCacheModel() {
		return _lesson.toCacheModel();
	}

	@Override
	public com.nyu.model.Lesson toEscapedModel() {
		return new LessonWrapper(_lesson.toEscapedModel());
	}

	@Override
	public com.nyu.model.Lesson toUnescapedModel() {
		return new LessonWrapper(_lesson.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lesson.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lesson.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lesson.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LessonWrapper)) {
			return false;
		}

		LessonWrapper lessonWrapper = (LessonWrapper)obj;

		if (Validator.equals(_lesson, lessonWrapper._lesson)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Lesson getWrappedLesson() {
		return _lesson;
	}

	@Override
	public Lesson getWrappedModel() {
		return _lesson;
	}

	@Override
	public void resetOriginalValues() {
		_lesson.resetOriginalValues();
	}

	private Lesson _lesson;
}