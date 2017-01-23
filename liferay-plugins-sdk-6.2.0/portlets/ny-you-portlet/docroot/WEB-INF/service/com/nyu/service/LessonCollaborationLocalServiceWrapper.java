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
 * Provides a wrapper for {@link LessonCollaborationLocalService}.
 *
 * @author Allwins Rajaiah
 * @see LessonCollaborationLocalService
 * @generated
 */
public class LessonCollaborationLocalServiceWrapper
	implements LessonCollaborationLocalService,
		ServiceWrapper<LessonCollaborationLocalService> {
	public LessonCollaborationLocalServiceWrapper(
		LessonCollaborationLocalService lessonCollaborationLocalService) {
		_lessonCollaborationLocalService = lessonCollaborationLocalService;
	}

	/**
	* Adds the lesson collaboration to the database. Also notifies the appropriate model listeners.
	*
	* @param lessonCollaboration the lesson collaboration
	* @return the lesson collaboration that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.LessonCollaboration addLessonCollaboration(
		com.nyu.model.LessonCollaboration lessonCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.addLessonCollaboration(lessonCollaboration);
	}

	/**
	* Creates a new lesson collaboration with the primary key. Does not add the lesson collaboration to the database.
	*
	* @param id the primary key for the new lesson collaboration
	* @return the new lesson collaboration
	*/
	@Override
	public com.nyu.model.LessonCollaboration createLessonCollaboration(long id) {
		return _lessonCollaborationLocalService.createLessonCollaboration(id);
	}

	/**
	* Deletes the lesson collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lesson collaboration
	* @return the lesson collaboration that was removed
	* @throws PortalException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.LessonCollaboration deleteLessonCollaboration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.deleteLessonCollaboration(id);
	}

	/**
	* Deletes the lesson collaboration from the database. Also notifies the appropriate model listeners.
	*
	* @param lessonCollaboration the lesson collaboration
	* @return the lesson collaboration that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.LessonCollaboration deleteLessonCollaboration(
		com.nyu.model.LessonCollaboration lessonCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.deleteLessonCollaboration(lessonCollaboration);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lessonCollaborationLocalService.dynamicQuery();
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
		return _lessonCollaborationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lessonCollaborationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lessonCollaborationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _lessonCollaborationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lessonCollaborationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.LessonCollaboration fetchLessonCollaboration(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.fetchLessonCollaboration(id);
	}

	/**
	* Returns the lesson collaboration with the primary key.
	*
	* @param id the primary key of the lesson collaboration
	* @return the lesson collaboration
	* @throws PortalException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.LessonCollaboration getLessonCollaboration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.getLessonCollaboration(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the lesson collaborations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.LessonCollaboration> getLessonCollaborations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.getLessonCollaborations(start,
			end);
	}

	/**
	* Returns the number of lesson collaborations.
	*
	* @return the number of lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLessonCollaborationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.getLessonCollaborationsCount();
	}

	/**
	* Updates the lesson collaboration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lessonCollaboration the lesson collaboration
	* @return the lesson collaboration that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.LessonCollaboration updateLessonCollaboration(
		com.nyu.model.LessonCollaboration lessonCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonCollaborationLocalService.updateLessonCollaboration(lessonCollaboration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lessonCollaborationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lessonCollaborationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lessonCollaborationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.nyu.model.LessonCollaboration getUserExistence(long lessonId,
		long userId) {
		return _lessonCollaborationLocalService.getUserExistence(lessonId,
			userId);
	}

	@Override
	public java.util.List<com.nyu.model.LessonCollaboration> getLessonUsers(
		long lessonId, java.lang.String memberStatus) {
		return _lessonCollaborationLocalService.getLessonUsers(lessonId,
			memberStatus);
	}

	@Override
	public java.util.List<com.nyu.model.LessonCollaboration> getLessonUsersByType(
		long lessonId, java.lang.String type) {
		return _lessonCollaborationLocalService.getLessonUsersByType(lessonId,
			type);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getCollaborationLessonsByUser(
		long userId, java.lang.String memberStatus) {
		return _lessonCollaborationLocalService.getCollaborationLessonsByUser(userId,
			memberStatus);
	}

	@Override
	public java.util.List<com.nyu.model.LessonCollaboration> getallLessonAccessPermissionByUserId(
		long userId, java.lang.String accessPermission) {
		return _lessonCollaborationLocalService.getallLessonAccessPermissionByUserId(userId,
			accessPermission);
	}

	@Override
	public java.util.List<com.nyu.model.LessonCollaboration> getallLessonAccessPermissionByLessonId(
		long lessonId, java.lang.String accessPermission) {
		return _lessonCollaborationLocalService.getallLessonAccessPermissionByLessonId(lessonId,
			accessPermission);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LessonCollaborationLocalService getWrappedLessonCollaborationLocalService() {
		return _lessonCollaborationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLessonCollaborationLocalService(
		LessonCollaborationLocalService lessonCollaborationLocalService) {
		_lessonCollaborationLocalService = lessonCollaborationLocalService;
	}

	@Override
	public LessonCollaborationLocalService getWrappedService() {
		return _lessonCollaborationLocalService;
	}

	@Override
	public void setWrappedService(
		LessonCollaborationLocalService lessonCollaborationLocalService) {
		_lessonCollaborationLocalService = lessonCollaborationLocalService;
	}

	private LessonCollaborationLocalService _lessonCollaborationLocalService;
}