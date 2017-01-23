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
import com.liferay.portal.util.PortalUtil;

import com.nyu.service.AnswerRequestLocalServiceUtil;
import com.nyu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Allwins Rajaiah
 */
public class AnswerRequestClp extends BaseModelImpl<AnswerRequest>
	implements AnswerRequest {
	public AnswerRequestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AnswerRequest.class;
	}

	@Override
	public String getModelClassName() {
		return AnswerRequest.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _answerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAnswerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _answerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("answerId", getAnswerId());
		attributes.put("requestLessonId", getRequestLessonId());
		attributes.put("userId", getUserId());
		attributes.put("description", getDescription());
		attributes.put("appreciateUserIds", getAppreciateUserIds());
		attributes.put("appreciateCount", getAppreciateCount());
		attributes.put("createDate", getCreateDate());
		attributes.put("checkedAnswer", getCheckedAnswer());
		attributes.put("opinionSurvey", getOpinionSurvey());
		attributes.put("myLessons", getMyLessons());
		attributes.put("myFavouriteLessons", getMyFavouriteLessons());
		attributes.put("collaborationLessons", getCollaborationLessons());
		attributes.put("collaborationId", getCollaborationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long answerId = (Long)attributes.get("answerId");

		if (answerId != null) {
			setAnswerId(answerId);
		}

		Long requestLessonId = (Long)attributes.get("requestLessonId");

		if (requestLessonId != null) {
			setRequestLessonId(requestLessonId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String appreciateUserIds = (String)attributes.get("appreciateUserIds");

		if (appreciateUserIds != null) {
			setAppreciateUserIds(appreciateUserIds);
		}

		Integer appreciateCount = (Integer)attributes.get("appreciateCount");

		if (appreciateCount != null) {
			setAppreciateCount(appreciateCount);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Boolean checkedAnswer = (Boolean)attributes.get("checkedAnswer");

		if (checkedAnswer != null) {
			setCheckedAnswer(checkedAnswer);
		}

		String opinionSurvey = (String)attributes.get("opinionSurvey");

		if (opinionSurvey != null) {
			setOpinionSurvey(opinionSurvey);
		}

		String myLessons = (String)attributes.get("myLessons");

		if (myLessons != null) {
			setMyLessons(myLessons);
		}

		String myFavouriteLessons = (String)attributes.get("myFavouriteLessons");

		if (myFavouriteLessons != null) {
			setMyFavouriteLessons(myFavouriteLessons);
		}

		Long collaborationLessons = (Long)attributes.get("collaborationLessons");

		if (collaborationLessons != null) {
			setCollaborationLessons(collaborationLessons);
		}

		Long collaborationId = (Long)attributes.get("collaborationId");

		if (collaborationId != null) {
			setCollaborationId(collaborationId);
		}
	}

	@Override
	public long getAnswerId() {
		return _answerId;
	}

	@Override
	public void setAnswerId(long answerId) {
		_answerId = answerId;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAnswerId", long.class);

				method.invoke(_answerRequestRemoteModel, answerId);
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

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestLessonId", long.class);

				method.invoke(_answerRequestRemoteModel, requestLessonId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_answerRequestRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_answerRequestRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppreciateUserIds() {
		return _appreciateUserIds;
	}

	@Override
	public void setAppreciateUserIds(String appreciateUserIds) {
		_appreciateUserIds = appreciateUserIds;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciateUserIds",
						String.class);

				method.invoke(_answerRequestRemoteModel, appreciateUserIds);
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

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAppreciateCount", int.class);

				method.invoke(_answerRequestRemoteModel, appreciateCount);
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

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_answerRequestRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCheckedAnswer() {
		return _checkedAnswer;
	}

	@Override
	public boolean isCheckedAnswer() {
		return _checkedAnswer;
	}

	@Override
	public void setCheckedAnswer(boolean checkedAnswer) {
		_checkedAnswer = checkedAnswer;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckedAnswer",
						boolean.class);

				method.invoke(_answerRequestRemoteModel, checkedAnswer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOpinionSurvey() {
		return _opinionSurvey;
	}

	@Override
	public void setOpinionSurvey(String opinionSurvey) {
		_opinionSurvey = opinionSurvey;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setOpinionSurvey", String.class);

				method.invoke(_answerRequestRemoteModel, opinionSurvey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMyLessons() {
		return _myLessons;
	}

	@Override
	public void setMyLessons(String myLessons) {
		_myLessons = myLessons;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setMyLessons", String.class);

				method.invoke(_answerRequestRemoteModel, myLessons);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMyFavouriteLessons() {
		return _myFavouriteLessons;
	}

	@Override
	public void setMyFavouriteLessons(String myFavouriteLessons) {
		_myFavouriteLessons = myFavouriteLessons;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setMyFavouriteLessons",
						String.class);

				method.invoke(_answerRequestRemoteModel, myFavouriteLessons);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCollaborationLessons() {
		return _collaborationLessons;
	}

	@Override
	public void setCollaborationLessons(long collaborationLessons) {
		_collaborationLessons = collaborationLessons;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCollaborationLessons",
						long.class);

				method.invoke(_answerRequestRemoteModel, collaborationLessons);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCollaborationId() {
		return _collaborationId;
	}

	@Override
	public void setCollaborationId(long collaborationId) {
		_collaborationId = collaborationId;

		if (_answerRequestRemoteModel != null) {
			try {
				Class<?> clazz = _answerRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCollaborationId", long.class);

				method.invoke(_answerRequestRemoteModel, collaborationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAnswerRequestRemoteModel() {
		return _answerRequestRemoteModel;
	}

	public void setAnswerRequestRemoteModel(
		BaseModel<?> answerRequestRemoteModel) {
		_answerRequestRemoteModel = answerRequestRemoteModel;
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

		Class<?> remoteModelClass = _answerRequestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_answerRequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AnswerRequestLocalServiceUtil.addAnswerRequest(this);
		}
		else {
			AnswerRequestLocalServiceUtil.updateAnswerRequest(this);
		}
	}

	@Override
	public AnswerRequest toEscapedModel() {
		return (AnswerRequest)ProxyUtil.newProxyInstance(AnswerRequest.class.getClassLoader(),
			new Class[] { AnswerRequest.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AnswerRequestClp clone = new AnswerRequestClp();

		clone.setAnswerId(getAnswerId());
		clone.setRequestLessonId(getRequestLessonId());
		clone.setUserId(getUserId());
		clone.setDescription(getDescription());
		clone.setAppreciateUserIds(getAppreciateUserIds());
		clone.setAppreciateCount(getAppreciateCount());
		clone.setCreateDate(getCreateDate());
		clone.setCheckedAnswer(getCheckedAnswer());
		clone.setOpinionSurvey(getOpinionSurvey());
		clone.setMyLessons(getMyLessons());
		clone.setMyFavouriteLessons(getMyFavouriteLessons());
		clone.setCollaborationLessons(getCollaborationLessons());
		clone.setCollaborationId(getCollaborationId());

		return clone;
	}

	@Override
	public int compareTo(AnswerRequest answerRequest) {
		long primaryKey = answerRequest.getPrimaryKey();

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

		if (!(obj instanceof AnswerRequestClp)) {
			return false;
		}

		AnswerRequestClp answerRequest = (AnswerRequestClp)obj;

		long primaryKey = answerRequest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{answerId=");
		sb.append(getAnswerId());
		sb.append(", requestLessonId=");
		sb.append(getRequestLessonId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", appreciateUserIds=");
		sb.append(getAppreciateUserIds());
		sb.append(", appreciateCount=");
		sb.append(getAppreciateCount());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", checkedAnswer=");
		sb.append(getCheckedAnswer());
		sb.append(", opinionSurvey=");
		sb.append(getOpinionSurvey());
		sb.append(", myLessons=");
		sb.append(getMyLessons());
		sb.append(", myFavouriteLessons=");
		sb.append(getMyFavouriteLessons());
		sb.append(", collaborationLessons=");
		sb.append(getCollaborationLessons());
		sb.append(", collaborationId=");
		sb.append(getCollaborationId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.nyu.model.AnswerRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>answerId</column-name><column-value><![CDATA[");
		sb.append(getAnswerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestLessonId</column-name><column-value><![CDATA[");
		sb.append(getRequestLessonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciateUserIds</column-name><column-value><![CDATA[");
		sb.append(getAppreciateUserIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appreciateCount</column-name><column-value><![CDATA[");
		sb.append(getAppreciateCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkedAnswer</column-name><column-value><![CDATA[");
		sb.append(getCheckedAnswer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>opinionSurvey</column-name><column-value><![CDATA[");
		sb.append(getOpinionSurvey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>myLessons</column-name><column-value><![CDATA[");
		sb.append(getMyLessons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>myFavouriteLessons</column-name><column-value><![CDATA[");
		sb.append(getMyFavouriteLessons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>collaborationLessons</column-name><column-value><![CDATA[");
		sb.append(getCollaborationLessons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>collaborationId</column-name><column-value><![CDATA[");
		sb.append(getCollaborationId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _answerId;
	private long _requestLessonId;
	private long _userId;
	private String _userUuid;
	private String _description;
	private String _appreciateUserIds;
	private int _appreciateCount;
	private Date _createDate;
	private boolean _checkedAnswer;
	private String _opinionSurvey;
	private String _myLessons;
	private String _myFavouriteLessons;
	private long _collaborationLessons;
	private long _collaborationId;
	private BaseModel<?> _answerRequestRemoteModel;
}