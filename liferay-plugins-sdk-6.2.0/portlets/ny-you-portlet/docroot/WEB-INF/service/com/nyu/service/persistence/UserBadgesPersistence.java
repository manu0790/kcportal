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

import com.liferay.portal.service.persistence.BasePersistence;

import com.nyu.model.UserBadges;

/**
 * The persistence interface for the user badges service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserBadgesPersistenceImpl
 * @see UserBadgesUtil
 * @generated
 */
public interface UserBadgesPersistence extends BasePersistence<UserBadges> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserBadgesUtil} to access the user badges persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user badgeses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.UserBadges> findByallUserBadges(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserBadges> findByallUserBadges(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserBadges> findByallUserBadges(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges findByallUserBadges_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the first user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByallUserBadges_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges findByallUserBadges_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the last user badges in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByallUserBadges_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.UserBadges[] findByallUserBadges_PrevAndNext(
		long userBadgeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Removes all the user badgeses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByallUserBadges(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user badgeses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public int countByallUserBadges(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user badges where userId = &#63; and badgeId = &#63; or throws a {@link com.nyu.NoSuchUserBadgesException} if it could not be found.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges findByuserBadge(long userId, long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the user badges where userId = &#63; and badgeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByuserBadge(long userId, long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user badges where userId = &#63; and badgeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByuserBadge(long userId, long badgeId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the user badges where userId = &#63; and badgeId = &#63; from the database.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the user badges that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges removeByuserBadge(long userId, long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the number of user badgeses where userId = &#63; and badgeId = &#63;.
	*
	* @param userId the user ID
	* @param badgeId the badge ID
	* @return the number of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserBadge(long userId, long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user badgeses where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @return the matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.UserBadges> findByuserBadgeByBadgeId(
		long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserBadges> findByuserBadgeByBadgeId(
		long badgeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserBadges> findByuserBadgeByBadgeId(
		long badgeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges findByuserBadgeByBadgeId_First(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the first user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByuserBadgeByBadgeId_First(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges
	* @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges findByuserBadgeByBadgeId_Last(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the last user badges in the ordered set where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user badges, or <code>null</code> if a matching user badges could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByuserBadgeByBadgeId_Last(
		long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.UserBadges[] findByuserBadgeByBadgeId_PrevAndNext(
		long userBadgeId, long badgeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Removes all the user badgeses where badgeId = &#63; from the database.
	*
	* @param badgeId the badge ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByuserBadgeByBadgeId(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user badgeses where badgeId = &#63;.
	*
	* @param badgeId the badge ID
	* @return the number of matching user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserBadgeByBadgeId(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user badges in the entity cache if it is enabled.
	*
	* @param userBadges the user badges
	*/
	public void cacheResult(com.nyu.model.UserBadges userBadges);

	/**
	* Caches the user badgeses in the entity cache if it is enabled.
	*
	* @param userBadgeses the user badgeses
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.UserBadges> userBadgeses);

	/**
	* Creates a new user badges with the primary key. Does not add the user badges to the database.
	*
	* @param userBadgeId the primary key for the new user badges
	* @return the new user badges
	*/
	public com.nyu.model.UserBadges create(long userBadgeId);

	/**
	* Removes the user badges with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges that was removed
	* @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges remove(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	public com.nyu.model.UserBadges updateImpl(
		com.nyu.model.UserBadges userBadges)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user badges with the primary key or throws a {@link com.nyu.NoSuchUserBadgesException} if it could not be found.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges
	* @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges findByPrimaryKey(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserBadgesException;

	/**
	* Returns the user badges with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userBadgeId the primary key of the user badges
	* @return the user badges, or <code>null</code> if a user badges with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserBadges fetchByPrimaryKey(long userBadgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user badgeses.
	*
	* @return the user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.UserBadges> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserBadges> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserBadges> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user badgeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user badgeses.
	*
	* @return the number of user badgeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}