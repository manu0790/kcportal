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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.nyu.service.ClpSerializer;
import com.nyu.service.Lesson_UsergroupsLocalServiceUtil;
import com.nyu.service.persistence.Lesson_UsergroupsPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class Lesson_UsergroupsClp extends BaseModelImpl<Lesson_Usergroups>
	implements Lesson_Usergroups {
	public Lesson_UsergroupsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Lesson_Usergroups.class;
	}

	@Override
	public String getModelClassName() {
		return Lesson_Usergroups.class.getName();
	}

	@Override
	public Lesson_UsergroupsPK getPrimaryKey() {
		return new Lesson_UsergroupsPK(_lessonId, _groupId);
	}

	@Override
	public void setPrimaryKey(Lesson_UsergroupsPK primaryKey) {
		setLessonId(primaryKey.lessonId);
		setGroupId(primaryKey.groupId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new Lesson_UsergroupsPK(_lessonId, _groupId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((Lesson_UsergroupsPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lessonId", getLessonId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lessonId = (Long)attributes.get("lessonId");

		if (lessonId != null) {
			setLessonId(lessonId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	@Override
	public long getLessonId() {
		return _lessonId;
	}

	@Override
	public void setLessonId(long lessonId) {
		_lessonId = lessonId;

		if (_lesson_UsergroupsRemoteModel != null) {
			try {
				Class<?> clazz = _lesson_UsergroupsRemoteModel.getClass();

				Method method = clazz.getMethod("setLessonId", long.class);

				method.invoke(_lesson_UsergroupsRemoteModel, lessonId);
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

		if (_lesson_UsergroupsRemoteModel != null) {
			try {
				Class<?> clazz = _lesson_UsergroupsRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_lesson_UsergroupsRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLesson_UsergroupsRemoteModel() {
		return _lesson_UsergroupsRemoteModel;
	}

	public void setLesson_UsergroupsRemoteModel(
		BaseModel<?> lesson_UsergroupsRemoteModel) {
		_lesson_UsergroupsRemoteModel = lesson_UsergroupsRemoteModel;
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

		Class<?> remoteModelClass = _lesson_UsergroupsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lesson_UsergroupsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Lesson_UsergroupsLocalServiceUtil.addLesson_Usergroups(this);
		}
		else {
			Lesson_UsergroupsLocalServiceUtil.updateLesson_Usergroups(this);
		}
	}

	@Override
	public Lesson_Usergroups toEscapedModel() {
		return (Lesson_Usergroups)ProxyUtil.newProxyInstance(Lesson_Usergroups.class.getClassLoader(),
			new Class[] { Lesson_Usergroups.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Lesson_UsergroupsClp clone = new Lesson_UsergroupsClp();

		clone.setLessonId(getLessonId());
		clone.setGroupId(getGroupId());

		return clone;
	}

	@Override
	public int compareTo(Lesson_Usergroups lesson_Usergroups) {
		Lesson_UsergroupsPK primaryKey = lesson_Usergroups.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Lesson_UsergroupsClp)) {
			return false;
		}

		Lesson_UsergroupsClp lesson_Usergroups = (Lesson_UsergroupsClp)obj;

		Lesson_UsergroupsPK primaryKey = lesson_Usergroups.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{lessonId=");
		sb.append(getLessonId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.Lesson_Usergroups");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>lessonId</column-name><column-value><![CDATA[");
		sb.append(getLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _lessonId;
	private long _groupId;
	private BaseModel<?> _lesson_UsergroupsRemoteModel;
}