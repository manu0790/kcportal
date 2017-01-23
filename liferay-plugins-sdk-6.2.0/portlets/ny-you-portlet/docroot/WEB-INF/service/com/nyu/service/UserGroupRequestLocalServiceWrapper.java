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
 * Provides a wrapper for {@link UserGroupRequestLocalService}.
 *
 * @author Allwins Rajaiah
 * @see UserGroupRequestLocalService
 * @generated
 */
public class UserGroupRequestLocalServiceWrapper
	implements UserGroupRequestLocalService,
		ServiceWrapper<UserGroupRequestLocalService> {
	public UserGroupRequestLocalServiceWrapper(
		UserGroupRequestLocalService userGroupRequestLocalService) {
		_userGroupRequestLocalService = userGroupRequestLocalService;
	}

	/**
	* Adds the user group request to the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupRequest the user group request
	* @return the user group request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserGroupRequest addUserGroupRequest(
		com.nyu.model.UserGroupRequest userGroupRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.addUserGroupRequest(userGroupRequest);
	}

	/**
	* Creates a new user group request with the primary key. Does not add the user group request to the database.
	*
	* @param id the primary key for the new user group request
	* @return the new user group request
	*/
	@Override
	public com.nyu.model.UserGroupRequest createUserGroupRequest(long id) {
		return _userGroupRequestLocalService.createUserGroupRequest(id);
	}

	/**
	* Deletes the user group request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user group request
	* @return the user group request that was removed
	* @throws PortalException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserGroupRequest deleteUserGroupRequest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.deleteUserGroupRequest(id);
	}

	/**
	* Deletes the user group request from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupRequest the user group request
	* @return the user group request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserGroupRequest deleteUserGroupRequest(
		com.nyu.model.UserGroupRequest userGroupRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.deleteUserGroupRequest(userGroupRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userGroupRequestLocalService.dynamicQuery();
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
		return _userGroupRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userGroupRequestLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userGroupRequestLocalService.dynamicQuery(dynamicQuery, start,
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
		return _userGroupRequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userGroupRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.UserGroupRequest fetchUserGroupRequest(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.fetchUserGroupRequest(id);
	}

	/**
	* Returns the user group request with the primary key.
	*
	* @param id the primary key of the user group request
	* @return the user group request
	* @throws PortalException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserGroupRequest getUserGroupRequest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.getUserGroupRequest(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user group requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @return the range of user group requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.UserGroupRequest> getUserGroupRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.getUserGroupRequests(start, end);
	}

	/**
	* Returns the number of user group requests.
	*
	* @return the number of user group requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserGroupRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.getUserGroupRequestsCount();
	}

	/**
	* Updates the user group request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userGroupRequest the user group request
	* @return the user group request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserGroupRequest updateUserGroupRequest(
		com.nyu.model.UserGroupRequest userGroupRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupRequestLocalService.updateUserGroupRequest(userGroupRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userGroupRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userGroupRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userGroupRequestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.nyu.model.UserGroupRequest getRequestStatusByUsers(
		long userGroupId, long userId) {
		return _userGroupRequestLocalService.getRequestStatusByUsers(userGroupId,
			userId);
	}

	@Override
	public java.util.List<com.nyu.model.UserGroupRequest> getGroupRequestByStatus(
		long userGroupId, java.lang.String status) {
		return _userGroupRequestLocalService.getGroupRequestByStatus(userGroupId,
			status);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserGroupRequestLocalService getWrappedUserGroupRequestLocalService() {
		return _userGroupRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserGroupRequestLocalService(
		UserGroupRequestLocalService userGroupRequestLocalService) {
		_userGroupRequestLocalService = userGroupRequestLocalService;
	}

	@Override
	public UserGroupRequestLocalService getWrappedService() {
		return _userGroupRequestLocalService;
	}

	@Override
	public void setWrappedService(
		UserGroupRequestLocalService userGroupRequestLocalService) {
		_userGroupRequestLocalService = userGroupRequestLocalService;
	}

	private UserGroupRequestLocalService _userGroupRequestLocalService;
}