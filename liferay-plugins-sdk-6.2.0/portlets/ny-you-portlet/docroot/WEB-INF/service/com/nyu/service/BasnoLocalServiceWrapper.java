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
 * Provides a wrapper for {@link BasnoLocalService}.
 *
 * @author Allwins Rajaiah
 * @see BasnoLocalService
 * @generated
 */
public class BasnoLocalServiceWrapper implements BasnoLocalService,
	ServiceWrapper<BasnoLocalService> {
	public BasnoLocalServiceWrapper(BasnoLocalService basnoLocalService) {
		_basnoLocalService = basnoLocalService;
	}

	/**
	* Adds the basno to the database. Also notifies the appropriate model listeners.
	*
	* @param basno the basno
	* @return the basno that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Basno addBasno(com.nyu.model.Basno basno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.addBasno(basno);
	}

	/**
	* Creates a new basno with the primary key. Does not add the basno to the database.
	*
	* @param badgeId the primary key for the new basno
	* @return the new basno
	*/
	@Override
	public com.nyu.model.Basno createBasno(long badgeId) {
		return _basnoLocalService.createBasno(badgeId);
	}

	/**
	* Deletes the basno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param badgeId the primary key of the basno
	* @return the basno that was removed
	* @throws PortalException if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Basno deleteBasno(long badgeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.deleteBasno(badgeId);
	}

	/**
	* Deletes the basno from the database. Also notifies the appropriate model listeners.
	*
	* @param basno the basno
	* @return the basno that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Basno deleteBasno(com.nyu.model.Basno basno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.deleteBasno(basno);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _basnoLocalService.dynamicQuery();
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
		return _basnoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _basnoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _basnoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _basnoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _basnoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nyu.model.Basno fetchBasno(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.fetchBasno(badgeId);
	}

	/**
	* Returns the basno with the primary key.
	*
	* @param badgeId the primary key of the basno
	* @return the basno
	* @throws PortalException if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Basno getBasno(long badgeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.getBasno(badgeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the basnos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basnos
	* @param end the upper bound of the range of basnos (not inclusive)
	* @return the range of basnos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.Basno> getBasnos(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.getBasnos(start, end);
	}

	/**
	* Returns the number of basnos.
	*
	* @return the number of basnos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBasnosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.getBasnosCount();
	}

	/**
	* Updates the basno in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param basno the basno
	* @return the basno that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Basno updateBasno(com.nyu.model.Basno basno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basnoLocalService.updateBasno(basno);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _basnoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_basnoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _basnoLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BasnoLocalService getWrappedBasnoLocalService() {
		return _basnoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBasnoLocalService(BasnoLocalService basnoLocalService) {
		_basnoLocalService = basnoLocalService;
	}

	@Override
	public BasnoLocalService getWrappedService() {
		return _basnoLocalService;
	}

	@Override
	public void setWrappedService(BasnoLocalService basnoLocalService) {
		_basnoLocalService = basnoLocalService;
	}

	private BasnoLocalService _basnoLocalService;
}