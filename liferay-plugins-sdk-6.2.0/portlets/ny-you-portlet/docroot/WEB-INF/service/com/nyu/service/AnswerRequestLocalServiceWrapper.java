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

package com.nyu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnswerRequestLocalService}.
 *
 * @author Allwins Rajaiah
 * @see AnswerRequestLocalService
 * @generated
 */
public class AnswerRequestLocalServiceWrapper
	implements AnswerRequestLocalService,
		ServiceWrapper<AnswerRequestLocalService> {
	public AnswerRequestLocalServiceWrapper(
		AnswerRequestLocalService answerRequestLocalService) {
		_answerRequestLocalService = answerRequestLocalService;
	}

	/**
	* Adds the answer request to the database. Also notifies the appropriate model listeners.
	*
	* @param answerRequest the answer request
	* @return the answer request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.AnswerRequest addAnswerRequest(
		com.nyu.model.AnswerRequest answerRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.addAnswerRequest(answerRequest);
	}

	/**
	* Creates a new answer request with the primary key. Does not add the answer request to the database.
	*
	* @param answerId the primary key for the new answer request
	* @return the new answer request
	*/
	@Override
	public com.nyu.model.AnswerRequest createAnswerRequest(long answerId) {
		return _answerRequestLocalService.createAnswerRequest(answerId);
	}

	/**
	* Deletes the answer request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request that was removed
	* @throws PortalException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.AnswerRequest deleteAnswerRequest(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.deleteAnswerRequest(answerId);
	}

	/**
	* Deletes the answer request from the database. Also notifies the appropriate model listeners.
	*
	* @param answerRequest the answer request
	* @return the answer request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.AnswerRequest deleteAnswerRequest(
		com.nyu.model.AnswerRequest answerRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.deleteAnswerRequest(answerRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _answerRequestLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.AnswerRequest fetchAnswerRequest(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.fetchAnswerRequest(answerId);
	}

	/**
	* Returns the answer request with the primary key.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request
	* @throws PortalException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.AnswerRequest getAnswerRequest(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.getAnswerRequest(answerId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the answer requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @return the range of answer requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.AnswerRequest> getAnswerRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.getAnswerRequests(start, end);
	}

	/**
	* Returns the number of answer requests.
	*
	* @return the number of answer requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAnswerRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.getAnswerRequestsCount();
	}

	/**
	* Updates the answer request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param answerRequest the answer request
	* @return the answer request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.AnswerRequest updateAnswerRequest(
		com.nyu.model.AnswerRequest answerRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.updateAnswerRequest(answerRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _answerRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_answerRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _answerRequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.nyu.model.AnswerRequest> getAnsweredCollaborationLessons(
		long requestId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.getAnsweredCollaborationLessons(requestId,
			userId);
	}

	@Override
	public java.util.List<com.nyu.model.AnswerRequest> getCollaborationLessonList(
		long requestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerRequestLocalService.getCollaborationLessonList(requestId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AnswerRequestLocalService getWrappedAnswerRequestLocalService() {
		return _answerRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAnswerRequestLocalService(
		AnswerRequestLocalService answerRequestLocalService) {
		_answerRequestLocalService = answerRequestLocalService;
	}

	@Override
	public AnswerRequestLocalService getWrappedService() {
		return _answerRequestLocalService;
	}

	@Override
	public void setWrappedService(
		AnswerRequestLocalService answerRequestLocalService) {
		_answerRequestLocalService = answerRequestLocalService;
	}

	private AnswerRequestLocalService _answerRequestLocalService;
}