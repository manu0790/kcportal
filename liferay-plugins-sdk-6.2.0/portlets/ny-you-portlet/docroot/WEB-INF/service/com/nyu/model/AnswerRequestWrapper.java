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
 * This class is a wrapper for {@link AnswerRequest}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AnswerRequest
 * @generated
 */
public class AnswerRequestWrapper implements AnswerRequest,
	ModelWrapper<AnswerRequest> {
	public AnswerRequestWrapper(AnswerRequest answerRequest) {
		_answerRequest = answerRequest;
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

	/**
	* Returns the primary key of this answer request.
	*
	* @return the primary key of this answer request
	*/
	@Override
	public long getPrimaryKey() {
		return _answerRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this answer request.
	*
	* @param primaryKey the primary key of this answer request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_answerRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the answer ID of this answer request.
	*
	* @return the answer ID of this answer request
	*/
	@Override
	public long getAnswerId() {
		return _answerRequest.getAnswerId();
	}

	/**
	* Sets the answer ID of this answer request.
	*
	* @param answerId the answer ID of this answer request
	*/
	@Override
	public void setAnswerId(long answerId) {
		_answerRequest.setAnswerId(answerId);
	}

	/**
	* Returns the request lesson ID of this answer request.
	*
	* @return the request lesson ID of this answer request
	*/
	@Override
	public long getRequestLessonId() {
		return _answerRequest.getRequestLessonId();
	}

	/**
	* Sets the request lesson ID of this answer request.
	*
	* @param requestLessonId the request lesson ID of this answer request
	*/
	@Override
	public void setRequestLessonId(long requestLessonId) {
		_answerRequest.setRequestLessonId(requestLessonId);
	}

	/**
	* Returns the user ID of this answer request.
	*
	* @return the user ID of this answer request
	*/
	@Override
	public long getUserId() {
		return _answerRequest.getUserId();
	}

	/**
	* Sets the user ID of this answer request.
	*
	* @param userId the user ID of this answer request
	*/
	@Override
	public void setUserId(long userId) {
		_answerRequest.setUserId(userId);
	}

	/**
	* Returns the user uuid of this answer request.
	*
	* @return the user uuid of this answer request
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequest.getUserUuid();
	}

	/**
	* Sets the user uuid of this answer request.
	*
	* @param userUuid the user uuid of this answer request
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_answerRequest.setUserUuid(userUuid);
	}

	/**
	* Returns the description of this answer request.
	*
	* @return the description of this answer request
	*/
	@Override
	public java.lang.String getDescription() {
		return _answerRequest.getDescription();
	}

	/**
	* Sets the description of this answer request.
	*
	* @param description the description of this answer request
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_answerRequest.setDescription(description);
	}

	/**
	* Returns the appreciate user IDs of this answer request.
	*
	* @return the appreciate user IDs of this answer request
	*/
	@Override
	public java.lang.String getAppreciateUserIds() {
		return _answerRequest.getAppreciateUserIds();
	}

	/**
	* Sets the appreciate user IDs of this answer request.
	*
	* @param appreciateUserIds the appreciate user IDs of this answer request
	*/
	@Override
	public void setAppreciateUserIds(java.lang.String appreciateUserIds) {
		_answerRequest.setAppreciateUserIds(appreciateUserIds);
	}

	/**
	* Returns the appreciate count of this answer request.
	*
	* @return the appreciate count of this answer request
	*/
	@Override
	public int getAppreciateCount() {
		return _answerRequest.getAppreciateCount();
	}

	/**
	* Sets the appreciate count of this answer request.
	*
	* @param appreciateCount the appreciate count of this answer request
	*/
	@Override
	public void setAppreciateCount(int appreciateCount) {
		_answerRequest.setAppreciateCount(appreciateCount);
	}

	/**
	* Returns the create date of this answer request.
	*
	* @return the create date of this answer request
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _answerRequest.getCreateDate();
	}

	/**
	* Sets the create date of this answer request.
	*
	* @param createDate the create date of this answer request
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_answerRequest.setCreateDate(createDate);
	}

	/**
	* Returns the checked answer of this answer request.
	*
	* @return the checked answer of this answer request
	*/
	@Override
	public boolean getCheckedAnswer() {
		return _answerRequest.getCheckedAnswer();
	}

	/**
	* Returns <code>true</code> if this answer request is checked answer.
	*
	* @return <code>true</code> if this answer request is checked answer; <code>false</code> otherwise
	*/
	@Override
	public boolean isCheckedAnswer() {
		return _answerRequest.isCheckedAnswer();
	}

	/**
	* Sets whether this answer request is checked answer.
	*
	* @param checkedAnswer the checked answer of this answer request
	*/
	@Override
	public void setCheckedAnswer(boolean checkedAnswer) {
		_answerRequest.setCheckedAnswer(checkedAnswer);
	}

	/**
	* Returns the opinion survey of this answer request.
	*
	* @return the opinion survey of this answer request
	*/
	@Override
	public java.lang.String getOpinionSurvey() {
		return _answerRequest.getOpinionSurvey();
	}

	/**
	* Sets the opinion survey of this answer request.
	*
	* @param opinionSurvey the opinion survey of this answer request
	*/
	@Override
	public void setOpinionSurvey(java.lang.String opinionSurvey) {
		_answerRequest.setOpinionSurvey(opinionSurvey);
	}

	/**
	* Returns the my lessons of this answer request.
	*
	* @return the my lessons of this answer request
	*/
	@Override
	public java.lang.String getMyLessons() {
		return _answerRequest.getMyLessons();
	}

	/**
	* Sets the my lessons of this answer request.
	*
	* @param myLessons the my lessons of this answer request
	*/
	@Override
	public void setMyLessons(java.lang.String myLessons) {
		_answerRequest.setMyLessons(myLessons);
	}

	/**
	* Returns the my favourite lessons of this answer request.
	*
	* @return the my favourite lessons of this answer request
	*/
	@Override
	public java.lang.String getMyFavouriteLessons() {
		return _answerRequest.getMyFavouriteLessons();
	}

	/**
	* Sets the my favourite lessons of this answer request.
	*
	* @param myFavouriteLessons the my favourite lessons of this answer request
	*/
	@Override
	public void setMyFavouriteLessons(java.lang.String myFavouriteLessons) {
		_answerRequest.setMyFavouriteLessons(myFavouriteLessons);
	}

	/**
	* Returns the collaboration lessons of this answer request.
	*
	* @return the collaboration lessons of this answer request
	*/
	@Override
	public long getCollaborationLessons() {
		return _answerRequest.getCollaborationLessons();
	}

	/**
	* Sets the collaboration lessons of this answer request.
	*
	* @param collaborationLessons the collaboration lessons of this answer request
	*/
	@Override
	public void setCollaborationLessons(long collaborationLessons) {
		_answerRequest.setCollaborationLessons(collaborationLessons);
	}

	/**
	* Returns the collaboration ID of this answer request.
	*
	* @return the collaboration ID of this answer request
	*/
	@Override
	public long getCollaborationId() {
		return _answerRequest.getCollaborationId();
	}

	/**
	* Sets the collaboration ID of this answer request.
	*
	* @param collaborationId the collaboration ID of this answer request
	*/
	@Override
	public void setCollaborationId(long collaborationId) {
		_answerRequest.setCollaborationId(collaborationId);
	}

	@Override
	public boolean isNew() {
		return _answerRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_answerRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _answerRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_answerRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _answerRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _answerRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_answerRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _answerRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_answerRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_answerRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_answerRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AnswerRequestWrapper((AnswerRequest)_answerRequest.clone());
	}

	@Override
	public int compareTo(AnswerRequest answerRequest) {
		return _answerRequest.compareTo(answerRequest);
	}

	@Override
	public int hashCode() {
		return _answerRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<AnswerRequest> toCacheModel() {
		return _answerRequest.toCacheModel();
	}

	@Override
	public AnswerRequest toEscapedModel() {
		return new AnswerRequestWrapper(_answerRequest.toEscapedModel());
	}

	@Override
	public AnswerRequest toUnescapedModel() {
		return new AnswerRequestWrapper(_answerRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _answerRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _answerRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_answerRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AnswerRequestWrapper)) {
			return false;
		}

		AnswerRequestWrapper answerRequestWrapper = (AnswerRequestWrapper)obj;

		if (Validator.equals(_answerRequest, answerRequestWrapper._answerRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AnswerRequest getWrappedAnswerRequest() {
		return _answerRequest;
	}

	@Override
	public AnswerRequest getWrappedModel() {
		return _answerRequest;
	}

	@Override
	public void resetOriginalValues() {
		_answerRequest.resetOriginalValues();
	}

	private AnswerRequest _answerRequest;
}