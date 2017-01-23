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
import com.nyu.service.LessonObjectivesLocalServiceUtil;

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
public class LessonObjectivesClp extends BaseModelImpl<LessonObjectives>
	implements LessonObjectives {
	public LessonObjectivesClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_lessonObjectivesRemoteModel != null) {
			try {
				Class<?> clazz = _lessonObjectivesRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_lessonObjectivesRemoteModel, id);
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

		if (_lessonObjectivesRemoteModel != null) {
			try {
				Class<?> clazz = _lessonObjectivesRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_lessonObjectivesRemoteModel, lessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObjective() {
		return _objective;
	}

	@Override
	public String getObjective(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getObjective(languageId);
	}

	@Override
	public String getObjective(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getObjective(languageId, useDefault);
	}

	@Override
	public String getObjective(String languageId) {
		return LocalizationUtil.getLocalization(getObjective(), languageId);
	}

	@Override
	public String getObjective(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getObjective(), languageId,
			useDefault);
	}

	@Override
	public String getObjectiveCurrentLanguageId() {
		return _objectiveCurrentLanguageId;
	}

	@Override
	public String getObjectiveCurrentValue() {
		Locale locale = getLocale(_objectiveCurrentLanguageId);

		return getObjective(locale);
	}

	@Override
	public Map<Locale, String> getObjectiveMap() {
		return LocalizationUtil.getLocalizationMap(getObjective());
	}

	@Override
	public void setObjective(String objective) {
		_objective = objective;

		if (_lessonObjectivesRemoteModel != null) {
			try {
				Class<?> clazz = _lessonObjectivesRemoteModel.getClass();

				Method method = clazz.getMethod("setObjective", String.class);

				method.invoke(_lessonObjectivesRemoteModel, objective);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void setObjective(String objective, Locale locale) {
		setObjective(objective, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setObjective(String objective, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(objective)) {
			setObjective(LocalizationUtil.updateLocalization(getObjective(),
					"Objective", objective, languageId, defaultLanguageId));
		}
		else {
			setObjective(LocalizationUtil.removeLocalization(getObjective(),
					"Objective", languageId));
		}
	}

	@Override
	public void setObjectiveCurrentLanguageId(String languageId) {
		_objectiveCurrentLanguageId = languageId;
	}

	@Override
	public void setObjectiveMap(Map<Locale, String> objectiveMap) {
		setObjectiveMap(objectiveMap, LocaleUtil.getDefault());
	}

	@Override
	public void setObjectiveMap(Map<Locale, String> objectiveMap,
		Locale defaultLocale) {
		if (objectiveMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setObjective(LocalizationUtil.updateLocalization(objectiveMap,
					getObjective(), "Objective",
					LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_lessonObjectivesRemoteModel != null) {
			try {
				Class<?> clazz = _lessonObjectivesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_lessonObjectivesRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLessonObjectivesRemoteModel() {
		return _lessonObjectivesRemoteModel;
	}

	public void setLessonObjectivesRemoteModel(
		BaseModel<?> lessonObjectivesRemoteModel) {
		_lessonObjectivesRemoteModel = lessonObjectivesRemoteModel;
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

		Class<?> remoteModelClass = _lessonObjectivesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lessonObjectivesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LessonObjectivesLocalServiceUtil.addLessonObjectives(this);
		}
		else {
			LessonObjectivesLocalServiceUtil.updateLessonObjectives(this);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> objectiveMap = getObjectiveMap();

		for (Map.Entry<Locale, String> entry : objectiveMap.entrySet()) {
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
		String xml = getObjective();

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

		String objective = getObjective(defaultLocale);

		if (Validator.isNull(objective)) {
			setObjective(getObjective(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setObjective(getObjective(defaultLocale), defaultLocale,
				defaultLocale);
		}
	}

	@Override
	public LessonObjectives toEscapedModel() {
		return (LessonObjectives)ProxyUtil.newProxyInstance(LessonObjectives.class.getClassLoader(),
			new Class[] { LessonObjectives.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LessonObjectivesClp clone = new LessonObjectivesClp();

		clone.setId(getId());
		clone.setLessonId(getLessonId());
		clone.setObjective(getObjective());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(LessonObjectives lessonObjectives) {
		long primaryKey = lessonObjectives.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LessonObjectivesClp)) {
			return false;
		}

		LessonObjectivesClp lessonObjectives = (LessonObjectivesClp)obj;

		long primaryKey = lessonObjectives.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", lessonId=");
		sb.append(getLessonId());
		sb.append(", objective=");
		sb.append(getObjective());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.LessonObjectives");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objective</column-name><column-value><![CDATA[");
		sb.append(getObjective());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _lessonId;
	private String _objective;
	private String _objectiveCurrentLanguageId;
	private Date _modifiedDate;
	private BaseModel<?> _lessonObjectivesRemoteModel;
}