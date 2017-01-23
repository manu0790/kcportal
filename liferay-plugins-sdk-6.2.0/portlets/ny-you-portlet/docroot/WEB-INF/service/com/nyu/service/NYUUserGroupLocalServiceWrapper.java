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
 * Provides a wrapper for {@link NYUUserGroupLocalService}.
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroupLocalService
 * @generated
 */
public class NYUUserGroupLocalServiceWrapper implements NYUUserGroupLocalService,
	ServiceWrapper<NYUUserGroupLocalService> {
	public NYUUserGroupLocalServiceWrapper(
		NYUUserGroupLocalService nyuUserGroupLocalService) {
		_nyuUserGroupLocalService = nyuUserGroupLocalService;
	}

	/**
	* Adds the n y u user group to the database. Also notifies the appropriate model listeners.
	*
	* @param nyuUserGroup the n y u user group
	* @return the n y u user group that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup addNYUUserGroup(
		com.nyu.model.NYUUserGroup nyuUserGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.addNYUUserGroup(nyuUserGroup);
	}

	/**
	* Creates a new n y u user group with the primary key. Does not add the n y u user group to the database.
	*
	* @param userGroupId the primary key for the new n y u user group
	* @return the new n y u user group
	*/
	@Override
	public com.nyu.model.NYUUserGroup createNYUUserGroup(long userGroupId) {
		return _nyuUserGroupLocalService.createNYUUserGroup(userGroupId);
	}

	/**
	* Deletes the n y u user group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group that was removed
	* @throws PortalException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup deleteNYUUserGroup(long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.deleteNYUUserGroup(userGroupId);
	}

	/**
	* Deletes the n y u user group from the database. Also notifies the appropriate model listeners.
	*
	* @param nyuUserGroup the n y u user group
	* @return the n y u user group that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup deleteNYUUserGroup(
		com.nyu.model.NYUUserGroup nyuUserGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.deleteNYUUserGroup(nyuUserGroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nyuUserGroupLocalService.dynamicQuery();
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
		return _nyuUserGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nyuUserGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nyuUserGroupLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _nyuUserGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _nyuUserGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.NYUUserGroup fetchNYUUserGroup(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.fetchNYUUserGroup(userGroupId);
	}

	/**
	* Returns the n y u user group with the matching UUID and company.
	*
	* @param uuid the n y u user group's UUID
	* @param companyId the primary key of the company
	* @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup fetchNYUUserGroupByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.fetchNYUUserGroupByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the n y u user group matching the UUID and group.
	*
	* @param uuid the n y u user group's UUID
	* @param groupId the primary key of the group
	* @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup fetchNYUUserGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.fetchNYUUserGroupByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the n y u user group with the primary key.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group
	* @throws PortalException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup getNYUUserGroup(long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.getNYUUserGroup(userGroupId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the n y u user group with the matching UUID and company.
	*
	* @param uuid the n y u user group's UUID
	* @param companyId the primary key of the company
	* @return the matching n y u user group
	* @throws PortalException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup getNYUUserGroupByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.getNYUUserGroupByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the n y u user group matching the UUID and group.
	*
	* @param uuid the n y u user group's UUID
	* @param groupId the primary key of the group
	* @return the matching n y u user group
	* @throws PortalException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup getNYUUserGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.getNYUUserGroupByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the n y u user groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.NYUUserGroup> getNYUUserGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.getNYUUserGroups(start, end);
	}

	/**
	* Returns the number of n y u user groups.
	*
	* @return the number of n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNYUUserGroupsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.getNYUUserGroupsCount();
	}

	/**
	* Updates the n y u user group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nyuUserGroup the n y u user group
	* @return the n y u user group that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.NYUUserGroup updateNYUUserGroup(
		com.nyu.model.NYUUserGroup nyuUserGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nyuUserGroupLocalService.updateNYUUserGroup(nyuUserGroup);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _nyuUserGroupLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_nyuUserGroupLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _nyuUserGroupLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.liferay.portal.model.UserGroup> findUserGroupByType(
		int start, int end) {
		return _nyuUserGroupLocalService.findUserGroupByType(start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NYUUserGroupLocalService getWrappedNYUUserGroupLocalService() {
		return _nyuUserGroupLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNYUUserGroupLocalService(
		NYUUserGroupLocalService nyuUserGroupLocalService) {
		_nyuUserGroupLocalService = nyuUserGroupLocalService;
	}

	@Override
	public NYUUserGroupLocalService getWrappedService() {
		return _nyuUserGroupLocalService;
	}

	@Override
	public void setWrappedService(
		NYUUserGroupLocalService nyuUserGroupLocalService) {
		_nyuUserGroupLocalService = nyuUserGroupLocalService;
	}

	private NYUUserGroupLocalService _nyuUserGroupLocalService;
}