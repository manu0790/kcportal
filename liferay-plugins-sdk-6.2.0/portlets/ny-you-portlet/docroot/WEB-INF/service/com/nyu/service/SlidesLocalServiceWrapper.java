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
 * Provides a wrapper for {@link SlidesLocalService}.
 *
 * @author Allwins Rajaiah
 * @see SlidesLocalService
 * @generated
 */
public class SlidesLocalServiceWrapper implements SlidesLocalService,
	ServiceWrapper<SlidesLocalService> {
	public SlidesLocalServiceWrapper(SlidesLocalService slidesLocalService) {
		_slidesLocalService = slidesLocalService;
	}

	/**
	* Adds the slides to the database. Also notifies the appropriate model listeners.
	*
	* @param slides the slides
	* @return the slides that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Slides addSlides(com.nyu.model.Slides slides)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.addSlides(slides);
	}

	/**
	* Creates a new slides with the primary key. Does not add the slides to the database.
	*
	* @param id the primary key for the new slides
	* @return the new slides
	*/
	@Override
	public com.nyu.model.Slides createSlides(long id) {
		return _slidesLocalService.createSlides(id);
	}

	/**
	* Deletes the slides with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the slides
	* @return the slides that was removed
	* @throws PortalException if a slides with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Slides deleteSlides(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.deleteSlides(id);
	}

	/**
	* Deletes the slides from the database. Also notifies the appropriate model listeners.
	*
	* @param slides the slides
	* @return the slides that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Slides deleteSlides(com.nyu.model.Slides slides)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.deleteSlides(slides);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _slidesLocalService.dynamicQuery();
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
		return _slidesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _slidesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _slidesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _slidesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _slidesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nyu.model.Slides fetchSlides(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.fetchSlides(id);
	}

	/**
	* Returns the slides with the primary key.
	*
	* @param id the primary key of the slides
	* @return the slides
	* @throws PortalException if a slides with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Slides getSlides(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.getSlides(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the slideses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of slideses
	* @param end the upper bound of the range of slideses (not inclusive)
	* @return the range of slideses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.Slides> getSlideses(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.getSlideses(start, end);
	}

	/**
	* Returns the number of slideses.
	*
	* @return the number of slideses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSlidesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.getSlidesesCount();
	}

	/**
	* Updates the slides in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param slides the slides
	* @return the slides that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Slides updateSlides(com.nyu.model.Slides slides)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _slidesLocalService.updateSlides(slides);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _slidesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_slidesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _slidesLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SlidesLocalService getWrappedSlidesLocalService() {
		return _slidesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSlidesLocalService(
		SlidesLocalService slidesLocalService) {
		_slidesLocalService = slidesLocalService;
	}

	@Override
	public SlidesLocalService getWrappedService() {
		return _slidesLocalService;
	}

	@Override
	public void setWrappedService(SlidesLocalService slidesLocalService) {
		_slidesLocalService = slidesLocalService;
	}

	private SlidesLocalService _slidesLocalService;
}