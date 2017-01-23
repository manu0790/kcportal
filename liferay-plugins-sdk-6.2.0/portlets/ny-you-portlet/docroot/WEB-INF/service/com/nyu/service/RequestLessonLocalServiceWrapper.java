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
 * Provides a wrapper for {@link RequestLessonLocalService}.
 *
 * @author Allwins Rajaiah
 * @see RequestLessonLocalService
 * @generated
 */
public class RequestLessonLocalServiceWrapper
	implements RequestLessonLocalService,
		ServiceWrapper<RequestLessonLocalService> {
	public RequestLessonLocalServiceWrapper(
		RequestLessonLocalService requestLessonLocalService) {
		_requestLessonLocalService = requestLessonLocalService;
	}

	/**
	* Adds the request lesson to the database. Also notifies the appropriate model listeners.
	*
	* @param requestLesson the request lesson
	* @return the request lesson that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.RequestLesson addRequestLesson(
		com.nyu.model.RequestLesson requestLesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.addRequestLesson(requestLesson);
	}

	/**
	* Creates a new request lesson with the primary key. Does not add the request lesson to the database.
	*
	* @param requestLessonId the primary key for the new request lesson
	* @return the new request lesson
	*/
	@Override
	public com.nyu.model.RequestLesson createRequestLesson(long requestLessonId) {
		return _requestLessonLocalService.createRequestLesson(requestLessonId);
	}

	/**
	* Deletes the request lesson with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestLessonId the primary key of the request lesson
	* @return the request lesson that was removed
	* @throws PortalException if a request lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.RequestLesson deleteRequestLesson(long requestLessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.deleteRequestLesson(requestLessonId);
	}

	/**
	* Deletes the request lesson from the database. Also notifies the appropriate model listeners.
	*
	* @param requestLesson the request lesson
	* @return the request lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.RequestLesson deleteRequestLesson(
		com.nyu.model.RequestLesson requestLesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.deleteRequestLesson(requestLesson);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _requestLessonLocalService.dynamicQuery();
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
		return _requestLessonLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _requestLessonLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _requestLessonLocalService.dynamicQuery(dynamicQuery, start,
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
		return _requestLessonLocalService.dynamicQueryCount(dynamicQuery);
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
		return _requestLessonLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.RequestLesson fetchRequestLesson(long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.fetchRequestLesson(requestLessonId);
	}

	/**
	* Returns the request lesson with the primary key.
	*
	* @param requestLessonId the primary key of the request lesson
	* @return the request lesson
	* @throws PortalException if a request lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.RequestLesson getRequestLesson(long requestLessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.getRequestLesson(requestLessonId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the request lessons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of request lessons
	* @param end the upper bound of the range of request lessons (not inclusive)
	* @return the range of request lessons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.RequestLesson> getRequestLessons(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.getRequestLessons(start, end);
	}

	/**
	* Returns the number of request lessons.
	*
	* @return the number of request lessons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRequestLessonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.getRequestLessonsCount();
	}

	/**
	* Updates the request lesson in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param requestLesson the request lesson
	* @return the request lesson that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.RequestLesson updateRequestLesson(
		com.nyu.model.RequestLesson requestLesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.updateRequestLesson(requestLesson);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _requestLessonLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_requestLessonLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _requestLessonLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.nyu.model.RequestLesson> getRequestLessons(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _requestLessonLocalService.getRequestLessons(companyId);
	}

	@Override
	public java.lang.String getAllRequestCategories() {
		return _requestLessonLocalService.getAllRequestCategories();
	}

	@Override
	public java.util.List<com.nyu.model.RequestLesson> getAllRequestByCategory(
		long categoryId, int start, int end) {
		return _requestLessonLocalService.getAllRequestByCategory(categoryId,
			start, end);
	}

	@Override
	public java.util.List<java.lang.Long> getUserContribution(
		long startPeriod, int start, int end) {
		return _requestLessonLocalService.getUserContribution(startPeriod,
			start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RequestLessonLocalService getWrappedRequestLessonLocalService() {
		return _requestLessonLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRequestLessonLocalService(
		RequestLessonLocalService requestLessonLocalService) {
		_requestLessonLocalService = requestLessonLocalService;
	}

	@Override
	public RequestLessonLocalService getWrappedService() {
		return _requestLessonLocalService;
	}

	@Override
	public void setWrappedService(
		RequestLessonLocalService requestLessonLocalService) {
		_requestLessonLocalService = requestLessonLocalService;
	}

	private RequestLessonLocalService _requestLessonLocalService;
}