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
 * Provides a wrapper for {@link UserBadgesLocalService}.
 *
 * @author Allwins Rajaiah
 * @see UserBadgesLocalService
 * @generated
 */
public class UserBadgesLocalServiceWrapper implements UserBadgesLocalService,
	ServiceWrapper<UserBadgesLocalService> {
	public UserBadgesLocalServiceWrapper(
		UserBadgesLocalService userBadgesLocalService) {
		_userBadgesLocalService = userBadgesLocalService;
	}

	/**
	* Adds the user badges to the database. Also notifies the appropriate model listeners.
	*
	* @param userBadges the user badges
	* @return the user badges that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserBadges addUserBadges(
		com.nyu.model.UserBadges userBadges)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.addUserBadges(userBadges);
	}

	/**
	* Creates a new user badges with the primary key. Does not add the user badges to the database.
	*
	* @param userBadgeId the primary key for the new user badges
	* @return the new user badges
	*/
	@Override
	public com.nyu.model.UserBadges createUserBadges(long userBadgeId) {
		return _userBadgesLocalService.createUserBadges(userBadgeId);
	}

	/**
	* Deletes the user badges with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges that was removed
	* @throws PortalException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserBadges deleteUserBadges(long userBadgeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.deleteUserBadges(userBadgeId);
	}

	/**
	* Deletes the user badges from the database. Also notifies the appropriate model listeners.
	*
	* @param userBadges the user badges
	* @return the user badges that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserBadges deleteUserBadges(
		com.nyu.model.UserBadges userBadges)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.deleteUserBadges(userBadges);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userBadgesLocalService.dynamicQuery();
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
		return _userBadgesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userBadgesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userBadgesLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _userBadgesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userBadgesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.UserBadges fetchUserBadges(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.fetchUserBadges(userBadgeId);
	}

	/**
	* Returns the user badges with the primary key.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges
	* @throws PortalException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserBadges getUserBadges(long userBadgeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.getUserBadges(userBadgeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user badgeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user badgeses
	* @param end the upper bound of the range of user badgeses (not inclusive)
	* @return the range of user badgeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.UserBadges> getUserBadgeses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.getUserBadgeses(start, end);
	}

	/**
	* Returns the number of user badgeses.
	*
	* @return the number of user badgeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserBadgesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.getUserBadgesesCount();
	}

	/**
	* Updates the user badges in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userBadges the user badges
	* @return the user badges that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.UserBadges updateUserBadges(
		com.nyu.model.UserBadges userBadges)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userBadgesLocalService.updateUserBadges(userBadges);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userBadgesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userBadgesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userBadgesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.nyu.model.UserBadges> getAllUserBadges(
		long userId) {
		return _userBadgesLocalService.getAllUserBadges(userId);
	}

	@Override
	public java.util.List<com.nyu.model.UserBadges> getuserBadgesByBadgeId(
		long badgeId) {
		return _userBadgesLocalService.getuserBadgesByBadgeId(badgeId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserBadgesLocalService getWrappedUserBadgesLocalService() {
		return _userBadgesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserBadgesLocalService(
		UserBadgesLocalService userBadgesLocalService) {
		_userBadgesLocalService = userBadgesLocalService;
	}

	@Override
	public UserBadgesLocalService getWrappedService() {
		return _userBadgesLocalService;
	}

	@Override
	public void setWrappedService(UserBadgesLocalService userBadgesLocalService) {
		_userBadgesLocalService = userBadgesLocalService;
	}

	private UserBadgesLocalService _userBadgesLocalService;
}