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

package com.nyu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.nyu.model.UserBadges;

import java.util.List;

/**
 * The persistence utility for the user badges service. This utility wraps {@link UserBadgesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserBadgesPersistence
 * @see UserBadgesPersistenceImpl
 * @generated
 */
public class UserBadgesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UserBadges userBadges) {
		getPersistence().clearCache(userBadges);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserBadges> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserBadges> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserBadges> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserBadges update(UserBadges userBadges)
		throws SystemException {
		return getPersistence().update(userBadges);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserBadges update(UserBadges userBadges,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userBadges, serviceContext);
	}

	/**
	* Returns all the user badgeses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findByallUserBadges(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByallUserBadges(userId);
	}

	/**
	* Returns a range of all the user badgeses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user badgeses
	* @param end the upper bound of the range of user badgeses (not inclusive)
	* @return the range of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findByallUserBadges(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByallUserBadges(userId, start, end);
	}

	/**
	* Returns an ordered range of all the user badgeses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user badgeses
	* @param end the upper bound of the range of user badgeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findByallUserBadges(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByallUserBadges(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges findByallUserBadges_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence()
				   .findByallUserBadges_First(userId, orderByComparator);
	}

	/**
	* Returns the first user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByallUserBadges_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByallUserBadges_First(userId, orderByComparator);
	}

	/**
	* Returns the last user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges findByallUserBadges_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence()
				   .findByallUserBadges_Last(userId, orderByComparator);
	}

	/**
	* Returns the last user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByallUserBadges_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByallUserBadges_Last(userId, orderByComparator);
	}

	/**
	* Returns the user badgeses before and after the current user badges in the ordered set where userId = &#63;.
	*
	* @param userBadgeId the primary key of the current user badges
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user badges
	* @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges[] findByallUserBadges_PrevAndNext(
		long userBadgeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence()
				   .findByallUserBadges_PrevAndNext(userBadgeId, userId,
			orderByComparator);
	}

	/**
	* Removes all the user badgeses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByallUserBadges(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByallUserBadges(userId);
	}

	/**
	* Returns the number of user badgeses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByallUserBadges(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByallUserBadges(userId);
	}

	/**
	* Returns the user badges where userId = &#63; and badgeId = &#63; or throws a {@link com.nyu.NoSuchUserBadgesException} if it could not be found.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges findByuserBadge(long userId,
		long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence().findByuserBadge(userId, badgeId);
	}

	/**
	* Returns the user badges where userId = &#63; and badgeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByuserBadge(long userId,
		long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserBadge(userId, badgeId);
	}

	/**
	* Returns the user badges where userId = &#63; and badgeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByuserBadge(long userId,
		long badgeId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByuserBadge(userId, badgeId, retrieveFromCache);
	}

	/**
	* Removes the user badges where userId = &#63; and badgeId = &#63; from the database.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the user badges that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges removeByuserBadge(long userId,
		long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence().removeByuserBadge(userId, badgeId);
	}

	/**
	* Returns the number of user badgeses where userId = &#63; and badgeId = &#63;.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the number of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserBadge(long userId, long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserBadge(userId, badgeId);
	}

	/**
	* Returns all the user badgeses where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @return the matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findByuserBadgeByBadgeId(
		long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserBadgeByBadgeId(badgeId);
	}

	/**
	* Returns a range of all the user badgeses where badgeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param badgeId the badge ID
	* @param start the lower bound of the range of user badgeses
	* @param end the upper bound of the range of user badgeses (not inclusive)
	* @return the range of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findByuserBadgeByBadgeId(
		long badgeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserBadgeByBadgeId(badgeId, start, end);
	}

	/**
	* Returns an ordered range of all the user badgeses where badgeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param badgeId the badge ID
	* @param start the lower bound of the range of user badgeses
	* @param end the upper bound of the range of user badgeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findByuserBadgeByBadgeId(
		long badgeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByuserBadgeByBadgeId(badgeId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges findByuserBadgeByBadgeId_First(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence()
				   .findByuserBadgeByBadgeId_First(badgeId, orderByComparator);
	}

	/**
	* Returns the first user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByuserBadgeByBadgeId_First(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByuserBadgeByBadgeId_First(badgeId, orderByComparator);
	}

	/**
	* Returns the last user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges findByuserBadgeByBadgeId_Last(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence()
				   .findByuserBadgeByBadgeId_Last(badgeId, orderByComparator);
	}

	/**
	* Returns the last user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByuserBadgeByBadgeId_Last(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByuserBadgeByBadgeId_Last(badgeId, orderByComparator);
	}

	/**
	* Returns the user badgeses before and after the current user badges in the ordered set where badgeId = &#63;.
	*
	* @param userBadgeId the primary key of the current user badges
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user badges
	* @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges[] findByuserBadgeByBadgeId_PrevAndNext(
		long userBadgeId, long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence()
				   .findByuserBadgeByBadgeId_PrevAndNext(userBadgeId, badgeId,
			orderByComparator);
	}

	/**
	* Removes all the user badgeses where badgeId = &#63; from the database.
	*
	* @param badgeId the badge ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByuserBadgeByBadgeId(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByuserBadgeByBadgeId(badgeId);
	}

	/**
	* Returns the number of user badgeses where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @return the number of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserBadgeByBadgeId(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserBadgeByBadgeId(badgeId);
	}

	/**
	* Caches the user badges in the entity cache if it is enabled.
	*
	* @param userBadges the user badges
	*/
	public static void cacheResult(com.nyu.model.UserBadges userBadges) {
		getPersistence().cacheResult(userBadges);
	}

	/**
	* Caches the user badgeses in the entity cache if it is enabled.
	*
	* @param userBadgeses the user badgeses
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.UserBadges> userBadgeses) {
		getPersistence().cacheResult(userBadgeses);
	}

	/**
	* Creates a new user badges with the primary key. Does not add the user badges to the database.
	*
	* @param userBadgeId the primary key for the new user badges
	* @return the new user badges
	*/
	public static com.nyu.model.UserBadges create(long userBadgeId) {
		return getPersistence().create(userBadgeId);
	}

	/**
	* Removes the user badges with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges that was removed
	* @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges remove(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence().remove(userBadgeId);
	}

	public static com.nyu.model.UserBadges updateImpl(
		com.nyu.model.UserBadges userBadges)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userBadges);
	}

	/**
	* Returns the user badges with the primary key or throws a {@link com.nyu.NoSuchUserBadgesException} if it could not be found.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges
	* @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges findByPrimaryKey(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException {
		return getPersistence().findByPrimaryKey(userBadgeId);
	}

	/**
	* Returns the user badges with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges, or <code>null</code> if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserBadges fetchByPrimaryKey(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userBadgeId);
	}

	/**
	* Returns all the user badgeses.
	*
	* @return the user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.nyu.model.UserBadges> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user badgeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserBadgesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user badgeses
	* @param end the upper bound of the range of user badgeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserBadges> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user badgeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user badgeses.
	*
	* @return the number of user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserBadgesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserBadgesPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					UserBadgesPersistence.class.getName());

			ReferenceRegistry.registerReference(UserBadgesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserBadgesPersistence persistence) {
	}

	private static UserBadgesPersistence _persistence;
}