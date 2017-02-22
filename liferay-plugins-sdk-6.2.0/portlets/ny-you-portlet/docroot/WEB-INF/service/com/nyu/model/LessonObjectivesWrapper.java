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
 * This class is a wrapper for {@link LessonObjectives}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonObjectives
 * @generated
 */
public class LessonObjectivesWrapper implements LessonObjectives,
	ModelWrapper<LessonObjectives> {
	public LessonObjectivesWrapper(LessonObjectives lessonObjectives) {
		_lessonObjectives = lessonObjectives;
	}

	@Override
	public Class<?> getModelClass() {
		return LessonObjectives.class;
	}

	@Override
	public String getModelClassName() {
		return LessonObjectives.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("lessonId", getLessonId());
		attributes.put("objective", getObjective());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		String objective = (String)attributes.get("objective");

		if (objective != null) {
			setObjective(objective);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this lesson objectives.
	*
	* @return the primary key of this lesson objectives
	*/
	@Override
	public long getPrimaryKey() {
		return _lessonObjectives.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lesson objectives.
	*
	* @param primaryKey the primary key of this lesson objectives
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lessonObjectives.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this lesson objectives.
	*
	* @return the ID of this lesson objectives
	*/
	@Override
	public long getId() {
		return _lessonObjectives.getId();
	}

	/**
	* Sets the ID of this lesson objectives.
	*
	* @param id the ID of this lesson objectives
	*/
	@Override
	public void setId(long id) {
		_lessonObjectives.setId(id);
	}

	/**
	* Returns the lesson ID of this lesson objectives.
	*
	* @return the lesson ID of this lesson objectives
	*/
	@Override
	public long getLessonId() {
		return _lessonObjectives.getLessonId();
	}

	/**
	* Sets the lesson ID of this lesson objectives.
	*
	* @param lessonId the lesson ID of this lesson objectives
	*/
	@Override
	public void setLessonId(long lessonId) {
		_lessonObjectives.setLessonId(lessonId);
	}

	/**
	* Returns the objective of this lesson objectives.
	*
	* @return the objective of this lesson objectives
	*/
	@Override
	public java.lang.String getObjective() {
		return _lessonObjectives.getObjective();
	}

	/**
	* Returns the localized objective of this lesson objectives in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized objective of this lesson objectives
	*/
	@Override
	public java.lang.String getObjective(java.util.Locale locale) {
		return _lessonObjectives.getObjective(locale);
	}

	/**
	* Returns the localized objective of this lesson objectives in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized objective of this lesson objectives. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getObjective(java.util.Locale locale,
		boolean useDefault) {
		return _lessonObjectives.getObjective(locale, useDefault);
	}

	/**
	* Returns the localized objective of this lesson objectives in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized objective of this lesson objectives
	*/
	@Override
	public java.lang.String getObjective(java.lang.String languageId) {
		return _lessonObjectives.getObjective(languageId);
	}

	/**
	* Returns the localized objective of this lesson objectives in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized objective of this lesson objectives
	*/
	@Override
	public java.lang.String getObjective(java.lang.String languageId,
		boolean useDefault) {
		return _lessonObjectives.getObjective(languageId, useDefault);
	}

	@Override
	public java.lang.String getObjectiveCurrentLanguageId() {
		return _lessonObjectives.getObjectiveCurrentLanguageId();
	}

	@Override
	public java.lang.String getObjectiveCurrentValue() {
		return _lessonObjectives.getObjectiveCurrentValue();
	}

	/**
	* Returns a map of the locales and localized objectives of this lesson objectives.
	*
	* @return the locales and localized objectives of this lesson objectives
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getObjectiveMap() {
		return _lessonObjectives.getObjectiveMap();
	}

	/**
	* Sets the objective of this lesson objectives.
	*
	* @param objective the objective of this lesson objectives
	*/
	@Override
	public void setObjective(java.lang.String objective) {
		_lessonObjectives.setObjective(objective);
	}

	/**
	* Sets the localized objective of this lesson objectives in the language.
	*
	* @param objective the localized objective of this lesson objectives
	* @param locale the locale of the language
	*/
	@Override
	public void setObjective(java.lang.String objective, java.util.Locale locale) {
		_lessonObjectives.setObjective(objective, locale);
	}

	/**
	* Sets the localized objective of this lesson objectives in the language, and sets the default locale.
	*
	* @param objective the localized objective of this lesson objectives
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setObjective(java.lang.String objective,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_lessonObjectives.setObjective(objective, locale, defaultLocale);
	}

	@Override
	public void setObjectiveCurrentLanguageId(java.lang.String languageId) {
		_lessonObjectives.setObjectiveCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized objectives of this lesson objectives from the map of locales and localized objectives.
	*
	* @param objectiveMap the locales and localized objectives of this lesson objectives
	*/
	@Override
	public void setObjectiveMap(
		java.util.Map<java.util.Locale, java.lang.String> objectiveMap) {
		_lessonObjectives.setObjectiveMap(objectiveMap);
	}

	/**
	* Sets the localized objectives of this lesson objectives from the map of locales and localized objectives, and sets the default locale.
	*
	* @param objectiveMap the locales and localized objectives of this lesson objectives
	* @param defaultLocale the default locale
	*/
	@Override
	public void setObjectiveMap(
		java.util.Map<java.util.Locale, java.lang.String> objectiveMap,
		java.util.Locale defaultLocale) {
		_lessonObjectives.setObjectiveMap(objectiveMap, defaultLocale);
	}

	/**
	* Returns the modified date of this lesson objectives.
	*
	* @return the modified date of this lesson objectives
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _lessonObjectives.getModifiedDate();
	}

	/**
	* Sets the modified date of this lesson objectives.
	*
	* @param modifiedDate the modified date of this lesson objectives
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_lessonObjectives.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _lessonObjectives.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lessonObjectives.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lessonObjectives.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lessonObjectives.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lessonObjectives.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lessonObjectives.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lessonObjectives.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lessonObjectives.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lessonObjectives.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lessonObjectives.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lessonObjectives.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _lessonObjectives.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _lessonObjectives.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_lessonObjectives.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_lessonObjectives.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new LessonObjectivesWrapper((LessonObjectives)_lessonObjectives.clone());
	}

	@Override
	public int compareTo(LessonObjectives lessonObjectives) {
		return _lessonObjectives.compareTo(lessonObjectives);
	}

	@Override
	public int hashCode() {
		return _lessonObjectives.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<LessonObjectives> toCacheModel() {
		return _lessonObjectives.toCacheModel();
	}

	@Override
	public LessonObjectives toEscapedModel() {
		return new LessonObjectivesWrapper(_lessonObjectives.toEscapedModel());
	}

	@Override
	public LessonObjectives toUnescapedModel() {
		return new LessonObjectivesWrapper(_lessonObjectives.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lessonObjectives.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lessonObjectives.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lessonObjectives.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LessonObjectivesWrapper)) {
			return false;
		}

		LessonObjectivesWrapper lessonObjectivesWrapper = (LessonObjectivesWrapper)obj;

		if (Validator.equals(_lessonObjectives,
					lessonObjectivesWrapper._lessonObjectives)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LessonObjectives getWrappedLessonObjectives() {
		return _lessonObjectives;
	}

	@Override
	public LessonObjectives getWrappedModel() {
		return _lessonObjectives;
	}

	@Override
	public void resetOriginalValues() {
		_lessonObjectives.resetOriginalValues();
	}

	private LessonObjectives _lessonObjectives;
}