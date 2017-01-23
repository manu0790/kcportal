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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Lesson service. Represents a row in the &quot;nyyou_Lesson&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.LessonModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.LessonImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson
 * @see com.nyu.model.impl.LessonImpl
 * @see com.nyu.model.impl.LessonModelImpl
 * @generated
 */
public interface LessonModel extends BaseModel<Lesson> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lesson model instance should use the {@link Lesson} interface instead.
	 */

	/**
	 * Returns the primary key of this lesson.
	 *
	 * @return the primary key of this lesson
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lesson.
	 *
	 * @param primaryKey the primary key of this lesson
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this lesson.
	 *
	 * @return the uuid of this lesson
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this lesson.
	 *
	 * @param uuid the uuid of this lesson
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the lesson ID of this lesson.
	 *
	 * @return the lesson ID of this lesson
	 */
	public long getLessonId();

	/**
	 * Sets the lesson ID of this lesson.
	 *
	 * @param lessonId the lesson ID of this lesson
	 */
	public void setLessonId(long lessonId);

	/**
	 * Returns the company ID of this lesson.
	 *
	 * @return the company ID of this lesson
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this lesson.
	 *
	 * @param companyId the company ID of this lesson
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this lesson.
	 *
	 * @return the group ID of this lesson
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this lesson.
	 *
	 * @param groupId the group ID of this lesson
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the lesson name of this lesson.
	 *
	 * @return the lesson name of this lesson
	 */
	public String getLessonName();

	/**
	 * Returns the localized lesson name of this lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized lesson name of this lesson
	 */
	@AutoEscape
	public String getLessonName(Locale locale);

	/**
	 * Returns the localized lesson name of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized lesson name of this lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getLessonName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized lesson name of this lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized lesson name of this lesson
	 */
	@AutoEscape
	public String getLessonName(String languageId);

	/**
	 * Returns the localized lesson name of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized lesson name of this lesson
	 */
	@AutoEscape
	public String getLessonName(String languageId, boolean useDefault);

	@AutoEscape
	public String getLessonNameCurrentLanguageId();

	@AutoEscape
	public String getLessonNameCurrentValue();

	/**
	 * Returns a map of the locales and localized lesson names of this lesson.
	 *
	 * @return the locales and localized lesson names of this lesson
	 */
	public Map<Locale, String> getLessonNameMap();

	/**
	 * Sets the lesson name of this lesson.
	 *
	 * @param lessonName the lesson name of this lesson
	 */
	public void setLessonName(String lessonName);

	/**
	 * Sets the localized lesson name of this lesson in the language.
	 *
	 * @param lessonName the localized lesson name of this lesson
	 * @param locale the locale of the language
	 */
	public void setLessonName(String lessonName, Locale locale);

	/**
	 * Sets the localized lesson name of this lesson in the language, and sets the default locale.
	 *
	 * @param lessonName the localized lesson name of this lesson
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setLessonName(String lessonName, Locale locale,
		Locale defaultLocale);

	public void setLessonNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized lesson names of this lesson from the map of locales and localized lesson names.
	 *
	 * @param lessonNameMap the locales and localized lesson names of this lesson
	 */
	public void setLessonNameMap(Map<Locale, String> lessonNameMap);

	/**
	 * Sets the localized lesson names of this lesson from the map of locales and localized lesson names, and sets the default locale.
	 *
	 * @param lessonNameMap the locales and localized lesson names of this lesson
	 * @param defaultLocale the default locale
	 */
	public void setLessonNameMap(Map<Locale, String> lessonNameMap,
		Locale defaultLocale);

	/**
	 * Returns the description of this lesson.
	 *
	 * @return the description of this lesson
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this lesson
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this lesson
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this lesson
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this lesson.
	 *
	 * @return the locales and localized descriptions of this lesson
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this lesson.
	 *
	 * @param description the description of this lesson
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this lesson in the language.
	 *
	 * @param description the localized description of this lesson
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this lesson in the language, and sets the default locale.
	 *
	 * @param description the localized description of this lesson
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this lesson from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this lesson
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this lesson from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this lesson
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Returns the author of this lesson.
	 *
	 * @return the author of this lesson
	 */
	public long getAuthor();

	/**
	 * Sets the author of this lesson.
	 *
	 * @param author the author of this lesson
	 */
	public void setAuthor(long author);

	/**
	 * Returns the course ID of this lesson.
	 *
	 * @return the course ID of this lesson
	 */
	@AutoEscape
	public String getCourseId();

	/**
	 * Sets the course ID of this lesson.
	 *
	 * @param courseId the course ID of this lesson
	 */
	public void setCourseId(String courseId);

	/**
	 * Returns the appreciated user IDs of this lesson.
	 *
	 * @return the appreciated user IDs of this lesson
	 */
	@AutoEscape
	public String getAppreciatedUserIds();

	/**
	 * Sets the appreciated user IDs of this lesson.
	 *
	 * @param appreciatedUserIds the appreciated user IDs of this lesson
	 */
	public void setAppreciatedUserIds(String appreciatedUserIds);

	/**
	 * Returns the appreciate count of this lesson.
	 *
	 * @return the appreciate count of this lesson
	 */
	public int getAppreciateCount();

	/**
	 * Sets the appreciate count of this lesson.
	 *
	 * @param appreciateCount the appreciate count of this lesson
	 */
	public void setAppreciateCount(int appreciateCount);

	/**
	 * Returns the uploaded time of this lesson.
	 *
	 * @return the uploaded time of this lesson
	 */
	public Date getUploadedTime();

	/**
	 * Sets the uploaded time of this lesson.
	 *
	 * @param uploadedTime the uploaded time of this lesson
	 */
	public void setUploadedTime(Date uploadedTime);

	/**
	 * Returns the uploaded by ID of this lesson.
	 *
	 * @return the uploaded by ID of this lesson
	 */
	public long getUploadedById();

	/**
	 * Sets the uploaded by ID of this lesson.
	 *
	 * @param uploadedById the uploaded by ID of this lesson
	 */
	public void setUploadedById(long uploadedById);

	/**
	 * Returns the uploaded by name of this lesson.
	 *
	 * @return the uploaded by name of this lesson
	 */
	@AutoEscape
	public String getUploadedByName();

	/**
	 * Sets the uploaded by name of this lesson.
	 *
	 * @param uploadedByName the uploaded by name of this lesson
	 */
	public void setUploadedByName(String uploadedByName);

	/**
	 * Returns the lesson note of this lesson.
	 *
	 * @return the lesson note of this lesson
	 */
	@AutoEscape
	public String getLessonNote();

	/**
	 * Sets the lesson note of this lesson.
	 *
	 * @param lessonNote the lesson note of this lesson
	 */
	public void setLessonNote(String lessonNote);

	/**
	 * Returns the status of this lesson.
	 *
	 * @return the status of this lesson
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this lesson.
	 *
	 * @param status the status of this lesson
	 */
	public void setStatus(String status);

	/**
	 * Returns the request lesson ID of this lesson.
	 *
	 * @return the request lesson ID of this lesson
	 */
	public long getRequestLessonId();

	/**
	 * Sets the request lesson ID of this lesson.
	 *
	 * @param requestLessonId the request lesson ID of this lesson
	 */
	public void setRequestLessonId(long requestLessonId);

	/**
	 * Returns the lesson privacy of this lesson.
	 *
	 * @return the lesson privacy of this lesson
	 */
	@AutoEscape
	public String getLessonPrivacy();

	/**
	 * Sets the lesson privacy of this lesson.
	 *
	 * @param lessonPrivacy the lesson privacy of this lesson
	 */
	public void setLessonPrivacy(String lessonPrivacy);

	/**
	 * Returns the featured of this lesson.
	 *
	 * @return the featured of this lesson
	 */
	public boolean getFeatured();

	/**
	 * Returns <code>true</code> if this lesson is featured.
	 *
	 * @return <code>true</code> if this lesson is featured; <code>false</code> otherwise
	 */
	public boolean isFeatured();

	/**
	 * Sets whether this lesson is featured.
	 *
	 * @param featured the featured of this lesson
	 */
	public void setFeatured(boolean featured);

	/**
	 * Returns the creator of this lesson.
	 *
	 * @return the creator of this lesson
	 */
	public String getCreator();

	/**
	 * Returns the localized creator of this lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized creator of this lesson
	 */
	@AutoEscape
	public String getCreator(Locale locale);

	/**
	 * Returns the localized creator of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized creator of this lesson. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getCreator(Locale locale, boolean useDefault);

	/**
	 * Returns the localized creator of this lesson in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized creator of this lesson
	 */
	@AutoEscape
	public String getCreator(String languageId);

	/**
	 * Returns the localized creator of this lesson in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized creator of this lesson
	 */
	@AutoEscape
	public String getCreator(String languageId, boolean useDefault);

	@AutoEscape
	public String getCreatorCurrentLanguageId();

	@AutoEscape
	public String getCreatorCurrentValue();

	/**
	 * Returns a map of the locales and localized creators of this lesson.
	 *
	 * @return the locales and localized creators of this lesson
	 */
	public Map<Locale, String> getCreatorMap();

	/**
	 * Sets the creator of this lesson.
	 *
	 * @param creator the creator of this lesson
	 */
	public void setCreator(String creator);

	/**
	 * Sets the localized creator of this lesson in the language.
	 *
	 * @param creator the localized creator of this lesson
	 * @param locale the locale of the language
	 */
	public void setCreator(String creator, Locale locale);

	/**
	 * Sets the localized creator of this lesson in the language, and sets the default locale.
	 *
	 * @param creator the localized creator of this lesson
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setCreator(String creator, Locale locale, Locale defaultLocale);

	public void setCreatorCurrentLanguageId(String languageId);

	/**
	 * Sets the localized creators of this lesson from the map of locales and localized creators.
	 *
	 * @param creatorMap the locales and localized creators of this lesson
	 */
	public void setCreatorMap(Map<Locale, String> creatorMap);

	/**
	 * Sets the localized creators of this lesson from the map of locales and localized creators, and sets the default locale.
	 *
	 * @param creatorMap the locales and localized creators of this lesson
	 * @param defaultLocale the default locale
	 */
	public void setCreatorMap(Map<Locale, String> creatorMap,
		Locale defaultLocale);

	/**
	 * Returns the secondary author of this lesson.
	 *
	 * @return the secondary author of this lesson
	 */
	@AutoEscape
	public String getSecondaryAuthor();

	/**
	 * Sets the secondary author of this lesson.
	 *
	 * @param secondaryAuthor the secondary author of this lesson
	 */
	public void setSecondaryAuthor(String secondaryAuthor);

	/**
	 * Returns the create date of this lesson.
	 *
	 * @return the create date of this lesson
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this lesson.
	 *
	 * @param createDate the create date of this lesson
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the create by of this lesson.
	 *
	 * @return the create by of this lesson
	 */
	public long getCreateBy();

	/**
	 * Sets the create by of this lesson.
	 *
	 * @param createBy the create by of this lesson
	 */
	public void setCreateBy(long createBy);

	/**
	 * Returns the updated date of this lesson.
	 *
	 * @return the updated date of this lesson
	 */
	public Date getUpdatedDate();

	/**
	 * Sets the updated date of this lesson.
	 *
	 * @param updatedDate the updated date of this lesson
	 */
	public void setUpdatedDate(Date updatedDate);

	/**
	 * Returns the updated by of this lesson.
	 *
	 * @return the updated by of this lesson
	 */
	public long getUpdatedBy();

	/**
	 * Sets the updated by of this lesson.
	 *
	 * @param updatedBy the updated by of this lesson
	 */
	public void setUpdatedBy(long updatedBy);

	/**
	 * Returns the permission of this lesson.
	 *
	 * @return the permission of this lesson
	 */
	@AutoEscape
	public String getPermission();

	/**
	 * Sets the permission of this lesson.
	 *
	 * @param permission the permission of this lesson
	 */
	public void setPermission(String permission);

	/**
	 * Returns the marked as of this lesson.
	 *
	 * @return the marked as of this lesson
	 */
	@AutoEscape
	public String getMarkedAs();

	/**
	 * Sets the marked as of this lesson.
	 *
	 * @param markedAs the marked as of this lesson
	 */
	public void setMarkedAs(String markedAs);

	/**
	 * Returns the marked by of this lesson.
	 *
	 * @return the marked by of this lesson
	 */
	public long getMarkedBy();

	/**
	 * Sets the marked by of this lesson.
	 *
	 * @param markedBy the marked by of this lesson
	 */
	public void setMarkedBy(long markedBy);

	/**
	 * Returns the marked content of this lesson.
	 *
	 * @return the marked content of this lesson
	 */
	@AutoEscape
	public String getMarkedContent();

	/**
	 * Sets the marked content of this lesson.
	 *
	 * @param markedContent the marked content of this lesson
	 */
	public void setMarkedContent(String markedContent);

	/**
	 * Returns the current author of this lesson.
	 *
	 * @return the current author of this lesson
	 */
	public long getCurrentAuthor();

	/**
	 * Sets the current author of this lesson.
	 *
	 * @param currentAuthor the current author of this lesson
	 */
	public void setCurrentAuthor(long currentAuthor);

	/**
	 * Returns the share with profile of this lesson.
	 *
	 * @return the share with profile of this lesson
	 */
	public long getShareWithProfile();

	/**
	 * Sets the share with profile of this lesson.
	 *
	 * @param shareWithProfile the share with profile of this lesson
	 */
	public void setShareWithProfile(long shareWithProfile);

	/**
	 * Returns the publish with profile of this lesson.
	 *
	 * @return the publish with profile of this lesson
	 */
	public long getPublishWithProfile();

	/**
	 * Sets the publish with profile of this lesson.
	 *
	 * @param publishWithProfile the publish with profile of this lesson
	 */
	public void setPublishWithProfile(long publishWithProfile);

	/**
	 * Returns the published profile of this lesson.
	 *
	 * @return the published profile of this lesson
	 */
	@AutoEscape
	public String getPublishedProfile();

	/**
	 * Sets the published profile of this lesson.
	 *
	 * @param publishedProfile the published profile of this lesson
	 */
	public void setPublishedProfile(String publishedProfile);

	/**
	 * Returns the version of this lesson.
	 *
	 * @return the version of this lesson
	 */
	public double getVersion();

	/**
	 * Sets the version of this lesson.
	 *
	 * @param version the version of this lesson
	 */
	public void setVersion(double version);

	/**
	 * Returns the lesson status of this lesson.
	 *
	 * @return the lesson status of this lesson
	 */
	public int getLessonStatus();

	/**
	 * Sets the lesson status of this lesson.
	 *
	 * @param lessonStatus the lesson status of this lesson
	 */
	public void setLessonStatus(int lessonStatus);

	/**
	 * Returns the status by user ID of this lesson.
	 *
	 * @return the status by user ID of this lesson
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this lesson.
	 *
	 * @param statusByUserId the status by user ID of this lesson
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this lesson.
	 *
	 * @return the status by user uuid of this lesson
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this lesson.
	 *
	 * @param statusByUserUuid the status by user uuid of this lesson
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status date of this lesson.
	 *
	 * @return the status date of this lesson
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this lesson.
	 *
	 * @param statusDate the status date of this lesson
	 */
	public void setStatusDate(Date statusDate);

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
	public int compareTo(Lesson lesson);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Lesson> toCacheModel();

	@Override
	public Lesson toEscapedModel();

	@Override
	public Lesson toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}