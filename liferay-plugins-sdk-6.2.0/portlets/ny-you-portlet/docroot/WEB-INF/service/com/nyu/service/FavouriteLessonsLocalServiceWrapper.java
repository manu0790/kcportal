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
 * Provides a wrapper for {@link FavouriteLessonsLocalService}.
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessonsLocalService
 * @generated
 */
public class FavouriteLessonsLocalServiceWrapper
	implements FavouriteLessonsLocalService,
		ServiceWrapper<FavouriteLessonsLocalService> {
	public FavouriteLessonsLocalServiceWrapper(
		FavouriteLessonsLocalService favouriteLessonsLocalService) {
		_favouriteLessonsLocalService = favouriteLessonsLocalService;
	}

	/**
	* Adds the favourite lessons to the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteLessons the favourite lessons
	* @return the favourite lessons that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.FavouriteLessons addFavouriteLessons(
		com.nyu.model.FavouriteLessons favouriteLessons)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.addFavouriteLessons(favouriteLessons);
	}

	/**
	* Creates a new favourite lessons with the primary key. Does not add the favourite lessons to the database.
	*
	* @param favouriteLessonsPK the primary key for the new favourite lessons
	* @return the new favourite lessons
	*/
	@Override
	public com.nyu.model.FavouriteLessons createFavouriteLessons(
		com.nyu.service.persistence.FavouriteLessonsPK favouriteLessonsPK) {
		return _favouriteLessonsLocalService.createFavouriteLessons(favouriteLessonsPK);
	}

	/**
	* Deletes the favourite lessons with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons that was removed
	* @throws PortalException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.FavouriteLessons deleteFavouriteLessons(
		com.nyu.service.persistence.FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.deleteFavouriteLessons(favouriteLessonsPK);
	}

	/**
	* Deletes the favourite lessons from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteLessons the favourite lessons
	* @return the favourite lessons that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.FavouriteLessons deleteFavouriteLessons(
		com.nyu.model.FavouriteLessons favouriteLessons)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.deleteFavouriteLessons(favouriteLessons);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _favouriteLessonsLocalService.dynamicQuery();
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
		return _favouriteLessonsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _favouriteLessonsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _favouriteLessonsLocalService.dynamicQuery(dynamicQuery, start,
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
		return _favouriteLessonsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _favouriteLessonsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.FavouriteLessons fetchFavouriteLessons(
		com.nyu.service.persistence.FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.fetchFavouriteLessons(favouriteLessonsPK);
	}

	/**
	* Returns the favourite lessons with the primary key.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons
	* @throws PortalException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.FavouriteLessons getFavouriteLessons(
		com.nyu.service.persistence.FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.getFavouriteLessons(favouriteLessonsPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the favourite lessonses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourite lessonses
	* @param end the upper bound of the range of favourite lessonses (not inclusive)
	* @return the range of favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.FavouriteLessons> getFavouriteLessonses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.getFavouriteLessonses(start, end);
	}

	/**
	* Returns the number of favourite lessonses.
	*
	* @return the number of favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFavouriteLessonsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.getFavouriteLessonsesCount();
	}

	/**
	* Updates the favourite lessons in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param favouriteLessons the favourite lessons
	* @return the favourite lessons that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.FavouriteLessons updateFavouriteLessons(
		com.nyu.model.FavouriteLessons favouriteLessons)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _favouriteLessonsLocalService.updateFavouriteLessons(favouriteLessons);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _favouriteLessonsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_favouriteLessonsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _favouriteLessonsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FavouriteLessonsLocalService getWrappedFavouriteLessonsLocalService() {
		return _favouriteLessonsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFavouriteLessonsLocalService(
		FavouriteLessonsLocalService favouriteLessonsLocalService) {
		_favouriteLessonsLocalService = favouriteLessonsLocalService;
	}

	@Override
	public FavouriteLessonsLocalService getWrappedService() {
		return _favouriteLessonsLocalService;
	}

	@Override
	public void setWrappedService(
		FavouriteLessonsLocalService favouriteLessonsLocalService) {
		_favouriteLessonsLocalService = favouriteLessonsLocalService;
	}

	private FavouriteLessonsLocalService _favouriteLessonsLocalService;
}