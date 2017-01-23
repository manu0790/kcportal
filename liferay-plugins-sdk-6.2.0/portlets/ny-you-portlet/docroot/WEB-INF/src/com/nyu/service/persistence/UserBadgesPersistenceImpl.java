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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchUserBadgesException;

import com.nyu.model.UserBadges;
import com.nyu.model.impl.UserBadgesImpl;
import com.nyu.model.impl.UserBadgesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user badges service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserBadgesPersistence
 * @see UserBadgesUtil
 * @generated
 */
public class UserBadgesPersistenceImpl extends BasePersistenceImpl<UserBadges>
	implements UserBadgesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserBadgesUtil} to access the user badges persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserBadgesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLUSERBADGES =
		new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByallUserBadges",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLUSERBADGES =
		new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByallUserBadges",
			new String[] { Long.class.getName() },
			UserBadgesModelImpl.USERID_COLUMN_BITMASK |
			UserBadgesModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALLUSERBADGES = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByallUserBadges",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user badgeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserBadges> findByallUserBadges(long userId)
		throws SystemException {
		return findByallUserBadges(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserBadges> findByallUserBadges(long userId, int start, int end)
		throws SystemException {
		return findByallUserBadges(userId, start, end, null);
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
	@Override
	public List<UserBadges> findByallUserBadges(long userId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLUSERBADGES;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLUSERBADGES;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<UserBadges> list = (List<UserBadges>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserBadges userBadges : list) {
				if ((userId != userBadges.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_USERBADGES_WHERE);

			query.append(_FINDER_COLUMN_ALLUSERBADGES_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserBadgesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserBadges>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserBadges>(list);
				}
				else {
					list = (List<UserBadges>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public UserBadges findByallUserBadges_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = fetchByallUserBadges_First(userId,
				orderByComparator);

		if (userBadges != null) {
			return userBadges;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserBadgesException(msg.toString());
	}

	/**
	 * Returns the first user badges in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user badges, or <code>null</code> if a matching user badges could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByallUserBadges_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserBadges> list = findByallUserBadges(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserBadges findByallUserBadges_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = fetchByallUserBadges_Last(userId,
				orderByComparator);

		if (userBadges != null) {
			return userBadges;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserBadgesException(msg.toString());
	}

	/**
	 * Returns the last user badges in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user badges, or <code>null</code> if a matching user badges could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByallUserBadges_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByallUserBadges(userId);

		if (count == 0) {
			return null;
		}

		List<UserBadges> list = findByallUserBadges(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserBadges[] findByallUserBadges_PrevAndNext(long userBadgeId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = findByPrimaryKey(userBadgeId);

		Session session = null;

		try {
			session = openSession();

			UserBadges[] array = new UserBadgesImpl[3];

			array[0] = getByallUserBadges_PrevAndNext(session, userBadges,
					userId, orderByComparator, true);

			array[1] = userBadges;

			array[2] = getByallUserBadges_PrevAndNext(session, userBadges,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserBadges getByallUserBadges_PrevAndNext(Session session,
		UserBadges userBadges, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERBADGES_WHERE);

		query.append(_FINDER_COLUMN_ALLUSERBADGES_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(UserBadgesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userBadges);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserBadges> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user badgeses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByallUserBadges(long userId) throws SystemException {
		for (UserBadges userBadges : findByallUserBadges(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userBadges);
		}
	}

	/**
	 * Returns the number of user badgeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByallUserBadges(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALLUSERBADGES;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERBADGES_WHERE);

			query.append(_FINDER_COLUMN_ALLUSERBADGES_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ALLUSERBADGES_USERID_2 = "userBadges.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_USERBADGE = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByuserBadge",
			new String[] { Long.class.getName(), Long.class.getName() },
			UserBadgesModelImpl.USERID_COLUMN_BITMASK |
			UserBadgesModelImpl.BADGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERBADGE = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserBadge",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the user badges where userId = &#63; and badgeId = &#63; or throws a {@link com.nyu.NoSuchUserBadgesException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @param badgeId the badge ID
	 * @return the matching user badges
	 * @throws com.nyu.NoSuchUserBadgesException if a matching user badges could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges findByuserBadge(long userId, long badgeId)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = fetchByuserBadge(userId, badgeId);

		if (userBadges == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", badgeId=");
			msg.append(badgeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserBadgesException(msg.toString());
		}

		return userBadges;
	}

	/**
	 * Returns the user badges where userId = &#63; and badgeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param badgeId the badge ID
	 * @return the matching user badges, or <code>null</code> if a matching user badges could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByuserBadge(long userId, long badgeId)
		throws SystemException {
		return fetchByuserBadge(userId, badgeId, true);
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
	@Override
	public UserBadges fetchByuserBadge(long userId, long badgeId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userId, badgeId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERBADGE,
					finderArgs, this);
		}

		if (result instanceof UserBadges) {
			UserBadges userBadges = (UserBadges)result;

			if ((userId != userBadges.getUserId()) ||
					(badgeId != userBadges.getBadgeId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_USERBADGES_WHERE);

			query.append(_FINDER_COLUMN_USERBADGE_USERID_2);

			query.append(_FINDER_COLUMN_USERBADGE_BADGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(badgeId);

				List<UserBadges> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERBADGE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserBadgesPersistenceImpl.fetchByuserBadge(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserBadges userBadges = list.get(0);

					result = userBadges;

					cacheResult(userBadges);

					if ((userBadges.getUserId() != userId) ||
							(userBadges.getBadgeId() != badgeId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERBADGE,
							finderArgs, userBadges);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERBADGE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (UserBadges)result;
		}
	}

	/**
	 * Removes the user badges where userId = &#63; and badgeId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param badgeId the badge ID
	 * @return the user badges that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges removeByuserBadge(long userId, long badgeId)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = findByuserBadge(userId, badgeId);

		return remove(userBadges);
	}

	/**
	 * Returns the number of user badgeses where userId = &#63; and badgeId = &#63;.
	 *
	 * @param userId the user ID
	 * @param badgeId the badge ID
	 * @return the number of matching user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByuserBadge(long userId, long badgeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERBADGE;

		Object[] finderArgs = new Object[] { userId, badgeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERBADGES_WHERE);

			query.append(_FINDER_COLUMN_USERBADGE_USERID_2);

			query.append(_FINDER_COLUMN_USERBADGE_BADGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(badgeId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERBADGE_USERID_2 = "userBadges.userId = ? AND ";
	private static final String _FINDER_COLUMN_USERBADGE_BADGEID_2 = "userBadges.badgeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERBADGEBYBADGEID =
		new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserBadgeByBadgeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERBADGEBYBADGEID =
		new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, UserBadgesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByuserBadgeByBadgeId", new String[] { Long.class.getName() },
			UserBadgesModelImpl.BADGEID_COLUMN_BITMASK |
			UserBadgesModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERBADGEBYBADGEID = new FinderPath(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByuserBadgeByBadgeId", new String[] { Long.class.getName() });

	/**
	 * Returns all the user badgeses where badgeId = &#63;.
	 *
	 * @param badgeId the badge ID
	 * @return the matching user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserBadges> findByuserBadgeByBadgeId(long badgeId)
		throws SystemException {
		return findByuserBadgeByBadgeId(badgeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserBadges> findByuserBadgeByBadgeId(long badgeId, int start,
		int end) throws SystemException {
		return findByuserBadgeByBadgeId(badgeId, start, end, null);
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
	@Override
	public List<UserBadges> findByuserBadgeByBadgeId(long badgeId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERBADGEBYBADGEID;
			finderArgs = new Object[] { badgeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERBADGEBYBADGEID;
			finderArgs = new Object[] { badgeId, start, end, orderByComparator };
		}

		List<UserBadges> list = (List<UserBadges>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserBadges userBadges : list) {
				if ((badgeId != userBadges.getBadgeId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_USERBADGES_WHERE);

			query.append(_FINDER_COLUMN_USERBADGEBYBADGEID_BADGEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserBadgesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(badgeId);

				if (!pagination) {
					list = (List<UserBadges>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserBadges>(list);
				}
				else {
					list = (List<UserBadges>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public UserBadges findByuserBadgeByBadgeId_First(long badgeId,
		OrderByComparator orderByComparator)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = fetchByuserBadgeByBadgeId_First(badgeId,
				orderByComparator);

		if (userBadges != null) {
			return userBadges;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("badgeId=");
		msg.append(badgeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserBadgesException(msg.toString());
	}

	/**
	 * Returns the first user badges in the ordered set where badgeId = &#63;.
	 *
	 * @param badgeId the badge ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user badges, or <code>null</code> if a matching user badges could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByuserBadgeByBadgeId_First(long badgeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserBadges> list = findByuserBadgeByBadgeId(badgeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserBadges findByuserBadgeByBadgeId_Last(long badgeId,
		OrderByComparator orderByComparator)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = fetchByuserBadgeByBadgeId_Last(badgeId,
				orderByComparator);

		if (userBadges != null) {
			return userBadges;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("badgeId=");
		msg.append(badgeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserBadgesException(msg.toString());
	}

	/**
	 * Returns the last user badges in the ordered set where badgeId = &#63;.
	 *
	 * @param badgeId the badge ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user badges, or <code>null</code> if a matching user badges could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByuserBadgeByBadgeId_Last(long badgeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByuserBadgeByBadgeId(badgeId);

		if (count == 0) {
			return null;
		}

		List<UserBadges> list = findByuserBadgeByBadgeId(badgeId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserBadges[] findByuserBadgeByBadgeId_PrevAndNext(long userBadgeId,
		long badgeId, OrderByComparator orderByComparator)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = findByPrimaryKey(userBadgeId);

		Session session = null;

		try {
			session = openSession();

			UserBadges[] array = new UserBadgesImpl[3];

			array[0] = getByuserBadgeByBadgeId_PrevAndNext(session, userBadges,
					badgeId, orderByComparator, true);

			array[1] = userBadges;

			array[2] = getByuserBadgeByBadgeId_PrevAndNext(session, userBadges,
					badgeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserBadges getByuserBadgeByBadgeId_PrevAndNext(Session session,
		UserBadges userBadges, long badgeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERBADGES_WHERE);

		query.append(_FINDER_COLUMN_USERBADGEBYBADGEID_BADGEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(UserBadgesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(badgeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userBadges);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserBadges> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user badgeses where badgeId = &#63; from the database.
	 *
	 * @param badgeId the badge ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByuserBadgeByBadgeId(long badgeId)
		throws SystemException {
		for (UserBadges userBadges : findByuserBadgeByBadgeId(badgeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userBadges);
		}
	}

	/**
	 * Returns the number of user badgeses where badgeId = &#63;.
	 *
	 * @param badgeId the badge ID
	 * @return the number of matching user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByuserBadgeByBadgeId(long badgeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERBADGEBYBADGEID;

		Object[] finderArgs = new Object[] { badgeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERBADGES_WHERE);

			query.append(_FINDER_COLUMN_USERBADGEBYBADGEID_BADGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(badgeId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERBADGEBYBADGEID_BADGEID_2 = "userBadges.badgeId = ?";

	public UserBadgesPersistenceImpl() {
		setModelClass(UserBadges.class);
	}

	/**
	 * Caches the user badges in the entity cache if it is enabled.
	 *
	 * @param userBadges the user badges
	 */
	@Override
	public void cacheResult(UserBadges userBadges) {
		EntityCacheUtil.putResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesImpl.class, userBadges.getPrimaryKey(), userBadges);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERBADGE,
			new Object[] { userBadges.getUserId(), userBadges.getBadgeId() },
			userBadges);

		userBadges.resetOriginalValues();
	}

	/**
	 * Caches the user badgeses in the entity cache if it is enabled.
	 *
	 * @param userBadgeses the user badgeses
	 */
	@Override
	public void cacheResult(List<UserBadges> userBadgeses) {
		for (UserBadges userBadges : userBadgeses) {
			if (EntityCacheUtil.getResult(
						UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
						UserBadgesImpl.class, userBadges.getPrimaryKey()) == null) {
				cacheResult(userBadges);
			}
			else {
				userBadges.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user badgeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserBadgesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserBadgesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user badges.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserBadges userBadges) {
		EntityCacheUtil.removeResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesImpl.class, userBadges.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userBadges);
	}

	@Override
	public void clearCache(List<UserBadges> userBadgeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserBadges userBadges : userBadgeses) {
			EntityCacheUtil.removeResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
				UserBadgesImpl.class, userBadges.getPrimaryKey());

			clearUniqueFindersCache(userBadges);
		}
	}

	protected void cacheUniqueFindersCache(UserBadges userBadges) {
		if (userBadges.isNew()) {
			Object[] args = new Object[] {
					userBadges.getUserId(), userBadges.getBadgeId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERBADGE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERBADGE, args,
				userBadges);
		}
		else {
			UserBadgesModelImpl userBadgesModelImpl = (UserBadgesModelImpl)userBadges;

			if ((userBadgesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERBADGE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userBadges.getUserId(), userBadges.getBadgeId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERBADGE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERBADGE, args,
					userBadges);
			}
		}
	}

	protected void clearUniqueFindersCache(UserBadges userBadges) {
		UserBadgesModelImpl userBadgesModelImpl = (UserBadgesModelImpl)userBadges;

		Object[] args = new Object[] {
				userBadges.getUserId(), userBadges.getBadgeId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERBADGE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERBADGE, args);

		if ((userBadgesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERBADGE.getColumnBitmask()) != 0) {
			args = new Object[] {
					userBadgesModelImpl.getOriginalUserId(),
					userBadgesModelImpl.getOriginalBadgeId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERBADGE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERBADGE, args);
		}
	}

	/**
	 * Creates a new user badges with the primary key. Does not add the user badges to the database.
	 *
	 * @param userBadgeId the primary key for the new user badges
	 * @return the new user badges
	 */
	@Override
	public UserBadges create(long userBadgeId) {
		UserBadges userBadges = new UserBadgesImpl();

		userBadges.setNew(true);
		userBadges.setPrimaryKey(userBadgeId);

		return userBadges;
	}

	/**
	 * Removes the user badges with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userBadgeId the primary key of the user badges
	 * @return the user badges that was removed
	 * @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges remove(long userBadgeId)
		throws NoSuchUserBadgesException, SystemException {
		return remove((Serializable)userBadgeId);
	}

	/**
	 * Removes the user badges with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user badges
	 * @return the user badges that was removed
	 * @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges remove(Serializable primaryKey)
		throws NoSuchUserBadgesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserBadges userBadges = (UserBadges)session.get(UserBadgesImpl.class,
					primaryKey);

			if (userBadges == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserBadgesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userBadges);
		}
		catch (NoSuchUserBadgesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserBadges removeImpl(UserBadges userBadges)
		throws SystemException {
		userBadges = toUnwrappedModel(userBadges);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userBadges)) {
				userBadges = (UserBadges)session.get(UserBadgesImpl.class,
						userBadges.getPrimaryKeyObj());
			}

			if (userBadges != null) {
				session.delete(userBadges);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userBadges != null) {
			clearCache(userBadges);
		}

		return userBadges;
	}

	@Override
	public UserBadges updateImpl(com.nyu.model.UserBadges userBadges)
		throws SystemException {
		userBadges = toUnwrappedModel(userBadges);

		boolean isNew = userBadges.isNew();

		UserBadgesModelImpl userBadgesModelImpl = (UserBadgesModelImpl)userBadges;

		Session session = null;

		try {
			session = openSession();

			if (userBadges.isNew()) {
				session.save(userBadges);

				userBadges.setNew(false);
			}
			else {
				session.merge(userBadges);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserBadgesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userBadgesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLUSERBADGES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userBadgesModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLUSERBADGES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLUSERBADGES,
					args);

				args = new Object[] { userBadgesModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLUSERBADGES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLUSERBADGES,
					args);
			}

			if ((userBadgesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERBADGEBYBADGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userBadgesModelImpl.getOriginalBadgeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERBADGEBYBADGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERBADGEBYBADGEID,
					args);

				args = new Object[] { userBadgesModelImpl.getBadgeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERBADGEBYBADGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERBADGEBYBADGEID,
					args);
			}
		}

		EntityCacheUtil.putResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
			UserBadgesImpl.class, userBadges.getPrimaryKey(), userBadges);

		clearUniqueFindersCache(userBadges);
		cacheUniqueFindersCache(userBadges);

		return userBadges;
	}

	protected UserBadges toUnwrappedModel(UserBadges userBadges) {
		if (userBadges instanceof UserBadgesImpl) {
			return userBadges;
		}

		UserBadgesImpl userBadgesImpl = new UserBadgesImpl();

		userBadgesImpl.setNew(userBadges.isNew());
		userBadgesImpl.setPrimaryKey(userBadges.getPrimaryKey());

		userBadgesImpl.setUserBadgeId(userBadges.getUserBadgeId());
		userBadgesImpl.setUserId(userBadges.getUserId());
		userBadgesImpl.setBadgeId(userBadges.getBadgeId());
		userBadgesImpl.setBadgeUrl(userBadges.getBadgeUrl());
		userBadgesImpl.setCreatedDate(userBadges.getCreatedDate());

		return userBadgesImpl;
	}

	/**
	 * Returns the user badges with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user badges
	 * @return the user badges
	 * @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserBadgesException, SystemException {
		UserBadges userBadges = fetchByPrimaryKey(primaryKey);

		if (userBadges == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserBadgesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userBadges;
	}

	/**
	 * Returns the user badges with the primary key or throws a {@link com.nyu.NoSuchUserBadgesException} if it could not be found.
	 *
	 * @param userBadgeId the primary key of the user badges
	 * @return the user badges
	 * @throws com.nyu.NoSuchUserBadgesException if a user badges with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges findByPrimaryKey(long userBadgeId)
		throws NoSuchUserBadgesException, SystemException {
		return findByPrimaryKey((Serializable)userBadgeId);
	}

	/**
	 * Returns the user badges with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user badges
	 * @return the user badges, or <code>null</code> if a user badges with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserBadges userBadges = (UserBadges)EntityCacheUtil.getResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
				UserBadgesImpl.class, primaryKey);

		if (userBadges == _nullUserBadges) {
			return null;
		}

		if (userBadges == null) {
			Session session = null;

			try {
				session = openSession();

				userBadges = (UserBadges)session.get(UserBadgesImpl.class,
						primaryKey);

				if (userBadges != null) {
					cacheResult(userBadges);
				}
				else {
					EntityCacheUtil.putResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
						UserBadgesImpl.class, primaryKey, _nullUserBadges);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserBadgesModelImpl.ENTITY_CACHE_ENABLED,
					UserBadgesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userBadges;
	}

	/**
	 * Returns the user badges with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userBadgeId the primary key of the user badges
	 * @return the user badges, or <code>null</code> if a user badges with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserBadges fetchByPrimaryKey(long userBadgeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userBadgeId);
	}

	/**
	 * Returns all the user badgeses.
	 *
	 * @return the user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserBadges> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<UserBadges> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<UserBadges> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<UserBadges> list = (List<UserBadges>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERBADGES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERBADGES;

				if (pagination) {
					sql = sql.concat(UserBadgesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserBadges>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserBadges>(list);
				}
				else {
					list = (List<UserBadges>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user badgeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserBadges userBadges : findAll()) {
			remove(userBadges);
		}
	}

	/**
	 * Returns the number of user badgeses.
	 *
	 * @return the number of user badgeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERBADGES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the user badges persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.UserBadges")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserBadges>> listenersList = new ArrayList<ModelListener<UserBadges>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserBadges>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(UserBadgesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERBADGES = "SELECT userBadges FROM UserBadges userBadges";
	private static final String _SQL_SELECT_USERBADGES_WHERE = "SELECT userBadges FROM UserBadges userBadges WHERE ";
	private static final String _SQL_COUNT_USERBADGES = "SELECT COUNT(userBadges) FROM UserBadges userBadges";
	private static final String _SQL_COUNT_USERBADGES_WHERE = "SELECT COUNT(userBadges) FROM UserBadges userBadges WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userBadges.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserBadges exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserBadges exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserBadgesPersistenceImpl.class);
	private static UserBadges _nullUserBadges = new UserBadgesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserBadges> toCacheModel() {
				return _nullUserBadgesCacheModel;
			}
		};

	private static CacheModel<UserBadges> _nullUserBadgesCacheModel = new CacheModel<UserBadges>() {
			@Override
			public UserBadges toEntityModel() {
				return _nullUserBadges;
			}
		};
}