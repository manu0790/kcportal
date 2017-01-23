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
import com.liferay.portal.util.PortalUtil;

import com.nyu.service.ClpSerializer;
import com.nyu.service.LessonLocalServiceUtil;

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
public class LessonClp extends BaseModelImpl<Lesson> implements Lesson {
	public LessonClp() {
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
	public long getPrimaryKey() {
		return _lessonId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLessonId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lessonId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_lessonRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_lessonId = lessonId;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_lessonRemoteModel, lessonId);
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

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_lessonRemoteModel, companyId);
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

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_lessonRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLessonName() {
		return _lessonName;
	}

	@Override
	public String getLessonName(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getLessonName(languageId);
	}

	@Override
	public String getLessonName(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getLessonName(languageId, useDefault);
	}

	@Override
	public String getLessonName(String languageId) {
		return LocalizationUtil.getLocalization(getLessonName(), languageId);
	}

	@Override
	public String getLessonName(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getLessonName(), languageId,
			useDefault);
	}

	@Override
	public String getLessonNameCurrentLanguageId() {
		return _lessonNameCurrentLanguageId;
	}

	@Override
	public String getLessonNameCurrentValue() {
		Locale locale = getLocale(_lessonNameCurrentLanguageId);

		return getLessonName(locale);
	}

	@Override
	public Map<Locale, String> getLessonNameMap() {
		return LocalizationUtil.getLocalizationMap(getLessonName());
	}

	@Override
	public void setLessonName(String lessonName) {
		_lessonName = lessonName;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonName", String.class);

				method.invoke(_lessonRemoteModel, lessonName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setLessonName(String lessonName, Locale locale) {
		setLessonName(lessonName, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setLessonName(String lessonName, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(lessonName)) {
			setLessonName(LocalizationUtil.updateLocalization(getLessonName(),
					"LessonName", lessonName, languageId, defaultLanguageId));
		}
		else {
			setLessonName(LocalizationUtil.removeLocalization(getLessonName(),
					"LessonName", languageId));
		}
	}

	@Override
	public void setLessonNameCurrentLanguageId(String languageId) {
		_lessonNameCurrentLanguageId = languageId;
	}

	@Override
	public void setLessonNameMap(Map<Locale, String> lessonNameMap) {
		setLessonNameMap(lessonNameMap, LocaleUtil.getDefault());
	}

	@Override
	public void setLessonNameMap(Map<Locale, String> lessonNameMap,
		Locale defaultLocale) {
		if (lessonNameMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setLessonName(LocalizationUtil.updateLocalization(lessonNameMap,
					getLessonName(), "LessonName",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
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

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_lessonRemoteModel, description);
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
	public long getAuthor() {
		return _author;
	}

	@Override
	public void setAuthor(long author) {
		_author = author;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthor", long.class);

				method.invoke(_lessonRemoteModel, author);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(String courseId) {
		_courseId = courseId;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseId", String.class);

				method.invoke(_lessonRemoteModel, courseId);
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

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciatedUserIds",
						String.class);

				method.invoke(_lessonRemoteModel, appreciatedUserIds);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAppreciateCount() {
		return _appreciateCount;
	}

	@Override
	public void setAppreciateCount(int appreciateCount) {
		_appreciateCount = appreciateCount;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciateCount", int.class);

				method.invoke(_lessonRemoteModel, appreciateCount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUploadedTime() {
		return _uploadedTime;
	}

	@Override
	public void setUploadedTime(Date uploadedTime) {
		_uploadedTime = uploadedTime;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setUploadedTime", Date.class);

				method.invoke(_lessonRemoteModel, uploadedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUploadedById() {
		return _uploadedById;
	}

	@Override
	public void setUploadedById(long uploadedById) {
		_uploadedById = uploadedById;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setUploadedById", long.class);

				method.invoke(_lessonRemoteModel, uploadedById);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUploadedByName() {
		return _uploadedByName;
	}

	@Override
	public void setUploadedByName(String uploadedByName) {
		_uploadedByName = uploadedByName;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setUploadedByName",
						String.class);

				method.invoke(_lessonRemoteModel, uploadedByName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLessonNote() {
		return _lessonNote;
	}

	@Override
	public void setLessonNote(String lessonNote) {
		_lessonNote = lessonNote;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonNote", String.class);

				method.invoke(_lessonRemoteModel, lessonNote);
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

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_lessonRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRequestLessonId() {
		return _requestLessonId;
	}

	@Override
	public void setRequestLessonId(long requestLessonId) {
		_requestLessonId = requestLessonId;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestLessonId", long.class);

				method.invoke(_lessonRemoteModel, requestLessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLessonPrivacy() {
		return _lessonPrivacy;
	}

	@Override
	public void setLessonPrivacy(String lessonPrivacy) {
		_lessonPrivacy = lessonPrivacy;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonPrivacy", String.class);

				method.invoke(_lessonRemoteModel, lessonPrivacy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getFeatured() {
		return _featured;
	}

	@Override
	public boolean isFeatured() {
		return _featured;
	}

	@Override
	public void setFeatured(boolean featured) {
		_featured = featured;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setFeatured", boolean.class);

				method.invoke(_lessonRemoteModel, featured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreator() {
		return _creator;
	}

	@Override
	public String getCreator(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getCreator(languageId);
	}

	@Override
	public String getCreator(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getCreator(languageId, useDefault);
	}

	@Override
	public String getCreator(String languageId) {
		return LocalizationUtil.getLocalization(getCreator(), languageId);
	}

	@Override
	public String getCreator(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getCreator(), languageId,
			useDefault);
	}

	@Override
	public String getCreatorCurrentLanguageId() {
		return _creatorCurrentLanguageId;
	}

	@Override
	public String getCreatorCurrentValue() {
		Locale locale = getLocale(_creatorCurrentLanguageId);

		return getCreator(locale);
	}

	@Override
	public Map<Locale, String> getCreatorMap() {
		return LocalizationUtil.getLocalizationMap(getCreator());
	}

	@Override
	public void setCreator(String creator) {
		_creator = creator;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCreator", String.class);

				method.invoke(_lessonRemoteModel, creator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setCreator(String creator, Locale locale) {
		setCreator(creator, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setCreator(String creator, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(creator)) {
			setCreator(LocalizationUtil.updateLocalization(getCreator(),
					"Creator", creator, languageId, defaultLanguageId));
		}
		else {
			setCreator(LocalizationUtil.removeLocalization(getCreator(),
					"Creator", languageId));
		}
	}

	@Override
	public void setCreatorCurrentLanguageId(String languageId) {
		_creatorCurrentLanguageId = languageId;
	}

	@Override
	public void setCreatorMap(Map<Locale, String> creatorMap) {
		setCreatorMap(creatorMap, LocaleUtil.getDefault());
	}

	@Override
	public void setCreatorMap(Map<Locale, String> creatorMap,
		Locale defaultLocale) {
		if (creatorMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setCreator(LocalizationUtil.updateLocalization(creatorMap,
					getCreator(), "Creator",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public String getSecondaryAuthor() {
		return _secondaryAuthor;
	}

	@Override
	public void setSecondaryAuthor(String secondaryAuthor) {
		_secondaryAuthor = secondaryAuthor;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setSecondaryAuthor",
						String.class);

				method.invoke(_lessonRemoteModel, secondaryAuthor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_lessonRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_createBy = createBy;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_lessonRemoteModel, createBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdatedDate() {
		return _updatedDate;
	}

	@Override
	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedDate", Date.class);

				method.invoke(_lessonRemoteModel, updatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_lessonRemoteModel, updatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPermission() {
		return _permission;
	}

	@Override
	public void setPermission(String permission) {
		_permission = permission;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setPermission", String.class);

				method.invoke(_lessonRemoteModel, permission);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarkedAs() {
		return _markedAs;
	}

	@Override
	public void setMarkedAs(String markedAs) {
		_markedAs = markedAs;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAs", String.class);

				method.invoke(_lessonRemoteModel, markedAs);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkedBy() {
		return _markedBy;
	}

	@Override
	public void setMarkedBy(long markedBy) {
		_markedBy = markedBy;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedBy", long.class);

				method.invoke(_lessonRemoteModel, markedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarkedContent() {
		return _markedContent;
	}

	@Override
	public void setMarkedContent(String markedContent) {
		_markedContent = markedContent;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedContent", String.class);

				method.invoke(_lessonRemoteModel, markedContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCurrentAuthor() {
		return _currentAuthor;
	}

	@Override
	public void setCurrentAuthor(long currentAuthor) {
		_currentAuthor = currentAuthor;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentAuthor", long.class);

				method.invoke(_lessonRemoteModel, currentAuthor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getShareWithProfile() {
		return _shareWithProfile;
	}

	@Override
	public void setShareWithProfile(long shareWithProfile) {
		_shareWithProfile = shareWithProfile;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setShareWithProfile",
						long.class);

				method.invoke(_lessonRemoteModel, shareWithProfile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPublishWithProfile() {
		return _publishWithProfile;
	}

	@Override
	public void setPublishWithProfile(long publishWithProfile) {
		_publishWithProfile = publishWithProfile;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishWithProfile",
						long.class);

				method.invoke(_lessonRemoteModel, publishWithProfile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPublishedProfile() {
		return _publishedProfile;
	}

	@Override
	public void setPublishedProfile(String publishedProfile) {
		_publishedProfile = publishedProfile;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishedProfile",
						String.class);

				method.invoke(_lessonRemoteModel, publishedProfile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVersion() {
		return _version;
	}

	@Override
	public void setVersion(double version) {
		_version = version;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", double.class);

				method.invoke(_lessonRemoteModel, version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLessonStatus() {
		return _lessonStatus;
	}

	@Override
	public void setLessonStatus(int lessonStatus) {
		_lessonStatus = lessonStatus;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonStatus", int.class);

				method.invoke(_lessonRemoteModel, lessonStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserId", long.class);

				method.invoke(_lessonRemoteModel, statusByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_lessonRemoteModel != null) {
			try {
				Class<?> clazz = _lessonRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_lessonRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLessonRemoteModel() {
		return _lessonRemoteModel;
	}

	public void setLessonRemoteModel(BaseModel<?> lessonRemoteModel) {
		_lessonRemoteModel = lessonRemoteModel;
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

		Class<?> remoteModelClass = _lessonRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lessonRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LessonLocalServiceUtil.addLesson(this);
		}
		else {
			LessonLocalServiceUtil.updateLesson(this);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> lessonNameMap = getLessonNameMap();

		for (Map.Entry<Locale, String> entry : lessonNameMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> descriptionMap = getDescriptionMap();

		for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> creatorMap = getCreatorMap();

		for (Map.Entry<Locale, String> entry : creatorMap.entrySet()) {
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
		String xml = getLessonName();

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

		String lessonName = getLessonName(defaultLocale);

		if (Validator.isNull(lessonName)) {
			setLessonName(getLessonName(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setLessonName(getLessonName(defaultLocale), defaultLocale,
				defaultLocale);
		}

		String description = getDescription(defaultLocale);

		if (Validator.isNull(description)) {
			setDescription(getDescription(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setDescription(getDescription(defaultLocale), defaultLocale,
				defaultLocale);
		}

		String creator = getCreator(defaultLocale);

		if (Validator.isNull(creator)) {
			setCreator(getCreator(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setCreator(getCreator(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public Lesson toEscapedModel() {
		return (Lesson)ProxyUtil.newProxyInstance(Lesson.class.getClassLoader(),
			new Class[] { Lesson.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LessonClp clone = new LessonClp();

		clone.setUuid(getUuid());
		clone.setLessonId(getLessonId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setLessonName(getLessonName());
		clone.setDescription(getDescription());
		clone.setAuthor(getAuthor());
		clone.setCourseId(getCourseId());
		clone.setAppreciatedUserIds(getAppreciatedUserIds());
		clone.setAppreciateCount(getAppreciateCount());
		clone.setUploadedTime(getUploadedTime());
		clone.setUploadedById(getUploadedById());
		clone.setUploadedByName(getUploadedByName());
		clone.setLessonNote(getLessonNote());
		clone.setStatus(getStatus());
		clone.setRequestLessonId(getRequestLessonId());
		clone.setLessonPrivacy(getLessonPrivacy());
		clone.setFeatured(getFeatured());
		clone.setCreator(getCreator());
		clone.setSecondaryAuthor(getSecondaryAuthor());
		clone.setCreateDate(getCreateDate());
		clone.setCreateBy(getCreateBy());
		clone.setUpdatedDate(getUpdatedDate());
		clone.setUpdatedBy(getUpdatedBy());
		clone.setPermission(getPermission());
		clone.setMarkedAs(getMarkedAs());
		clone.setMarkedBy(getMarkedBy());
		clone.setMarkedContent(getMarkedContent());
		clone.setCurrentAuthor(getCurrentAuthor());
		clone.setShareWithProfile(getShareWithProfile());
		clone.setPublishWithProfile(getPublishWithProfile());
		clone.setPublishedProfile(getPublishedProfile());
		clone.setVersion(getVersion());
		clone.setLessonStatus(getLessonStatus());
		clone.setStatusByUserId(getStatusByUserId());
		clone.setStatusDate(getStatusDate());

		return clone;
	}

	@Override
	public int compareTo(Lesson lesson) {
		int value = 0;

		value = DateUtil.compareTo(getUploadedTime(), lesson.getUploadedTime());

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

		if (!(obj instanceof LessonClp)) {
			return false;
		}

		LessonClp lesson = (LessonClp)obj;

		long primaryKey = lesson.getPrimaryKey();

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
		StringBundler sb = new StringBundler(73);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", lessonId=");
		sb.append(getLessonId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", lessonName=");
		sb.append(getLessonName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", courseId=");
		sb.append(getCourseId());
		sb.append(", appreciatedUserIds=");
		sb.append(getAppreciatedUserIds());
		sb.append(", appreciateCount=");
		sb.append(getAppreciateCount());
		sb.append(", uploadedTime=");
		sb.append(getUploadedTime());
		sb.append(", uploadedById=");
		sb.append(getUploadedById());
		sb.append(", uploadedByName=");
		sb.append(getUploadedByName());
		sb.append(", lessonNote=");
		sb.append(getLessonNote());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", requestLessonId=");
		sb.append(getRequestLessonId());
		sb.append(", lessonPrivacy=");
		sb.append(getLessonPrivacy());
		sb.append(", featured=");
		sb.append(getFeatured());
		sb.append(", creator=");
		sb.append(getCreator());
		sb.append(", secondaryAuthor=");
		sb.append(getSecondaryAuthor());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", updatedDate=");
		sb.append(getUpdatedDate());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append(", permission=");
		sb.append(getPermission());
		sb.append(", markedAs=");
		sb.append(getMarkedAs());
		sb.append(", markedBy=");
		sb.append(getMarkedBy());
		sb.append(", markedContent=");
		sb.append(getMarkedContent());
		sb.append(", currentAuthor=");
		sb.append(getCurrentAuthor());
		sb.append(", shareWithProfile=");
		sb.append(getShareWithProfile());
		sb.append(", publishWithProfile=");
		sb.append(getPublishWithProfile());
		sb.append(", publishedProfile=");
		sb.append(getPublishedProfile());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", lessonStatus=");
		sb.append(getLessonStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(112);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.Lesson");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
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
			"<column><column-name>lessonName</column-name><column-value><![CDATA[");
		sb.append(getLessonName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciatedUserIds</column-name><column-value><![CDATA[");
		sb.append(getAppreciatedUserIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciateCount</column-name><column-value><![CDATA[");
		sb.append(getAppreciateCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uploadedTime</column-name><column-value><![CDATA[");
		sb.append(getUploadedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uploadedById</column-name><column-value><![CDATA[");
		sb.append(getUploadedById());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uploadedByName</column-name><column-value><![CDATA[");
		sb.append(getUploadedByName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonNote</column-name><column-value><![CDATA[");
		sb.append(getLessonNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestLessonId</column-name><column-value><![CDATA[");
		sb.append(getRequestLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonPrivacy</column-name><column-value><![CDATA[");
		sb.append(getLessonPrivacy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>featured</column-name><column-value><![CDATA[");
		sb.append(getFeatured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creator</column-name><column-value><![CDATA[");
		sb.append(getCreator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>secondaryAuthor</column-name><column-value><![CDATA[");
		sb.append(getSecondaryAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedDate</column-name><column-value><![CDATA[");
		sb.append(getUpdatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permission</column-name><column-value><![CDATA[");
		sb.append(getPermission());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAs</column-name><column-value><![CDATA[");
		sb.append(getMarkedAs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedBy</column-name><column-value><![CDATA[");
		sb.append(getMarkedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedContent</column-name><column-value><![CDATA[");
		sb.append(getMarkedContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentAuthor</column-name><column-value><![CDATA[");
		sb.append(getCurrentAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shareWithProfile</column-name><column-value><![CDATA[");
		sb.append(getShareWithProfile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishWithProfile</column-name><column-value><![CDATA[");
		sb.append(getPublishWithProfile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishedProfile</column-name><column-value><![CDATA[");
		sb.append(getPublishedProfile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonStatus</column-name><column-value><![CDATA[");
		sb.append(getLessonStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _lessonId;
	private long _companyId;
	private long _groupId;
	private String _lessonName;
	private String _lessonNameCurrentLanguageId;
	private String _description;
	private String _descriptionCurrentLanguageId;
	private long _author;
	private String _courseId;
	private String _appreciatedUserIds;
	private int _appreciateCount;
	private Date _uploadedTime;
	private long _uploadedById;
	private String _uploadedByName;
	private String _lessonNote;
	private String _status;
	private long _requestLessonId;
	private String _lessonPrivacy;
	private boolean _featured;
	private String _creator;
	private String _creatorCurrentLanguageId;
	private String _secondaryAuthor;
	private Date _createDate;
	private long _createBy;
	private Date _updatedDate;
	private long _updatedBy;
	private String _permission;
	private String _markedAs;
	private long _markedBy;
	private String _markedContent;
	private long _currentAuthor;
	private long _shareWithProfile;
	private long _publishWithProfile;
	private String _publishedProfile;
	private double _version;
	private int _lessonStatus;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private Date _statusDate;
	private BaseModel<?> _lessonRemoteModel;
}