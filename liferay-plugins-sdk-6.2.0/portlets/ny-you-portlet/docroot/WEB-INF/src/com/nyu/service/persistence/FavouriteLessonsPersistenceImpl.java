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

import com.nyu.NoSuchFavouriteLessonsException;

import com.nyu.model.FavouriteLessons;
import com.nyu.model.impl.FavouriteLessonsImpl;
import com.nyu.model.impl.FavouriteLessonsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the favourite lessons service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessonsPersistence
 * @see FavouriteLessonsUtil
 * @generated
 */
public class FavouriteLessonsPersistenceImpl extends BasePersistenceImpl<FavouriteLessons>
	implements FavouriteLessonsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FavouriteLessonsUtil} to access the favourite lessons persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FavouriteLessonsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsModelImpl.FINDER_CACHE_ENABLED,
			FavouriteLessonsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsModelImpl.FINDER_CACHE_ENABLED,
			FavouriteLessonsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID =
		new FinderPath(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsModelImpl.FINDER_CACHE_ENABLED,
			FavouriteLessonsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfavouriteLessonsByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID =
		new FinderPath(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsModelImpl.FINDER_CACHE_ENABLED,
			FavouriteLessonsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfavouriteLessonsByUserId",
			new String[] { Long.class.getName() },
			FavouriteLessonsModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FAVOURITELESSONSBYUSERID =
		new FinderPath(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfavouriteLessonsByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the favourite lessonses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching favourite lessonses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FavouriteLessons> findByfavouriteLessonsByUserId(long userId)
		throws SystemException {
		return findByfavouriteLessonsByUserId(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the favourite lessonses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of favourite lessonses
	 * @param end the upper bound of the range of favourite lessonses (not inclusive)
	 * @return the range of matching favourite lessonses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FavouriteLessons> findByfavouriteLessonsByUserId(long userId,
		int start, int end) throws SystemException {
		return findByfavouriteLessonsByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the favourite lessonses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of favourite lessonses
	 * @param end the upper bound of the range of favourite lessonses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching favourite lessonses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FavouriteLessons> findByfavouriteLessonsByUserId(long userId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<FavouriteLessons> list = (List<FavouriteLessons>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FavouriteLessons favouriteLessons : list) {
				if ((userId != favouriteLessons.getUserId())) {
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

			query.append(_SQL_SELECT_FAVOURITELESSONS_WHERE);

			query.append(_FINDER_COLUMN_FAVOURITELESSONSBYUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FavouriteLessonsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<FavouriteLessons>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FavouriteLessons>(list);
				}
				else {
					list = (List<FavouriteLessons>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first favourite lessons in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favourite lessons
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a matching favourite lessons could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons findByfavouriteLessonsByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchFavouriteLessonsException, SystemException {
		FavouriteLessons favouriteLessons = fetchByfavouriteLessonsByUserId_First(userId,
				orderByComparator);

		if (favouriteLessons != null) {
			return favouriteLessons;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFavouriteLessonsException(msg.toString());
	}

	/**
	 * Returns the first favourite lessons in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favourite lessons, or <code>null</code> if a matching favourite lessons could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons fetchByfavouriteLessonsByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FavouriteLessons> list = findByfavouriteLessonsByUserId(userId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last favourite lessons in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favourite lessons
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a matching favourite lessons could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons findByfavouriteLessonsByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchFavouriteLessonsException, SystemException {
		FavouriteLessons favouriteLessons = fetchByfavouriteLessonsByUserId_Last(userId,
				orderByComparator);

		if (favouriteLessons != null) {
			return favouriteLessons;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFavouriteLessonsException(msg.toString());
	}

	/**
	 * Returns the last favourite lessons in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favourite lessons, or <code>null</code> if a matching favourite lessons could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons fetchByfavouriteLessonsByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfavouriteLessonsByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<FavouriteLessons> list = findByfavouriteLessonsByUserId(userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the favourite lessonses before and after the current favourite lessons in the ordered set where userId = &#63;.
	 *
	 * @param favouriteLessonsPK the primary key of the current favourite lessons
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next favourite lessons
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons[] findByfavouriteLessonsByUserId_PrevAndNext(
		FavouriteLessonsPK favouriteLessonsPK, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchFavouriteLessonsException, SystemException {
		FavouriteLessons favouriteLessons = findByPrimaryKey(favouriteLessonsPK);

		Session session = null;

		try {
			session = openSession();

			FavouriteLessons[] array = new FavouriteLessonsImpl[3];

			array[0] = getByfavouriteLessonsByUserId_PrevAndNext(session,
					favouriteLessons, userId, orderByComparator, true);

			array[1] = favouriteLessons;

			array[2] = getByfavouriteLessonsByUserId_PrevAndNext(session,
					favouriteLessons, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FavouriteLessons getByfavouriteLessonsByUserId_PrevAndNext(
		Session session, FavouriteLessons favouriteLessons, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAVOURITELESSONS_WHERE);

		query.append(_FINDER_COLUMN_FAVOURITELESSONSBYUSERID_USERID_2);

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
			query.append(FavouriteLessonsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(favouriteLessons);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FavouriteLessons> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the favourite lessonses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfavouriteLessonsByUserId(long userId)
		throws SystemException {
		for (FavouriteLessons favouriteLessons : findByfavouriteLessonsByUserId(
				userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(favouriteLessons);
		}
	}

	/**
	 * Returns the number of favourite lessonses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching favourite lessonses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfavouriteLessonsByUserId(long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FAVOURITELESSONSBYUSERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAVOURITELESSONS_WHERE);

			query.append(_FINDER_COLUMN_FAVOURITELESSONSBYUSERID_USERID_2);

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

	private static final String _FINDER_COLUMN_FAVOURITELESSONSBYUSERID_USERID_2 =
		"favouriteLessons.id.userId = ?";

	public FavouriteLessonsPersistenceImpl() {
		setModelClass(FavouriteLessons.class);
	}

	/**
	 * Caches the favourite lessons in the entity cache if it is enabled.
	 *
	 * @param favouriteLessons the favourite lessons
	 */
	@Override
	public void cacheResult(FavouriteLessons favouriteLessons) {
		EntityCacheUtil.putResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsImpl.class, favouriteLessons.getPrimaryKey(),
			favouriteLessons);

		favouriteLessons.resetOriginalValues();
	}

	/**
	 * Caches the favourite lessonses in the entity cache if it is enabled.
	 *
	 * @param favouriteLessonses the favourite lessonses
	 */
	@Override
	public void cacheResult(List<FavouriteLessons> favouriteLessonses) {
		for (FavouriteLessons favouriteLessons : favouriteLessonses) {
			if (EntityCacheUtil.getResult(
						FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
						FavouriteLessonsImpl.class,
						favouriteLessons.getPrimaryKey()) == null) {
				cacheResult(favouriteLessons);
			}
			else {
				favouriteLessons.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all favourite lessonses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FavouriteLessonsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FavouriteLessonsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the favourite lessons.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FavouriteLessons favouriteLessons) {
		EntityCacheUtil.removeResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsImpl.class, favouriteLessons.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FavouriteLessons> favouriteLessonses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FavouriteLessons favouriteLessons : favouriteLessonses) {
			EntityCacheUtil.removeResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
				FavouriteLessonsImpl.class, favouriteLessons.getPrimaryKey());
		}
	}

	/**
	 * Creates a new favourite lessons with the primary key. Does not add the favourite lessons to the database.
	 *
	 * @param favouriteLessonsPK the primary key for the new favourite lessons
	 * @return the new favourite lessons
	 */
	@Override
	public FavouriteLessons create(FavouriteLessonsPK favouriteLessonsPK) {
		FavouriteLessons favouriteLessons = new FavouriteLessonsImpl();

		favouriteLessons.setNew(true);
		favouriteLessons.setPrimaryKey(favouriteLessonsPK);

		return favouriteLessons;
	}

	/**
	 * Removes the favourite lessons with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param favouriteLessonsPK the primary key of the favourite lessons
	 * @return the favourite lessons that was removed
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons remove(FavouriteLessonsPK favouriteLessonsPK)
		throws NoSuchFavouriteLessonsException, SystemException {
		return remove((Serializable)favouriteLessonsPK);
	}

	/**
	 * Removes the favourite lessons with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the favourite lessons
	 * @return the favourite lessons that was removed
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons remove(Serializable primaryKey)
		throws NoSuchFavouriteLessonsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FavouriteLessons favouriteLessons = (FavouriteLessons)session.get(FavouriteLessonsImpl.class,
					primaryKey);

			if (favouriteLessons == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFavouriteLessonsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(favouriteLessons);
		}
		catch (NoSuchFavouriteLessonsException nsee) {
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
	protected FavouriteLessons removeImpl(FavouriteLessons favouriteLessons)
		throws SystemException {
		favouriteLessons = toUnwrappedModel(favouriteLessons);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(favouriteLessons)) {
				favouriteLessons = (FavouriteLessons)session.get(FavouriteLessonsImpl.class,
						favouriteLessons.getPrimaryKeyObj());
			}

			if (favouriteLessons != null) {
				session.delete(favouriteLessons);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (favouriteLessons != null) {
			clearCache(favouriteLessons);
		}

		return favouriteLessons;
	}

	@Override
	public FavouriteLessons updateImpl(
		com.nyu.model.FavouriteLessons favouriteLessons)
		throws SystemException {
		favouriteLessons = toUnwrappedModel(favouriteLessons);

		boolean isNew = favouriteLessons.isNew();

		FavouriteLessonsModelImpl favouriteLessonsModelImpl = (FavouriteLessonsModelImpl)favouriteLessons;

		Session session = null;

		try {
			session = openSession();

			if (favouriteLessons.isNew()) {
				session.save(favouriteLessons);

				favouriteLessons.setNew(false);
			}
			else {
				session.merge(favouriteLessons);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FavouriteLessonsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((favouriteLessonsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						favouriteLessonsModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FAVOURITELESSONSBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID,
					args);

				args = new Object[] { favouriteLessonsModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FAVOURITELESSONSBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FAVOURITELESSONSBYUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
			FavouriteLessonsImpl.class, favouriteLessons.getPrimaryKey(),
			favouriteLessons);

		return favouriteLessons;
	}

	protected FavouriteLessons toUnwrappedModel(
		FavouriteLessons favouriteLessons) {
		if (favouriteLessons instanceof FavouriteLessonsImpl) {
			return favouriteLessons;
		}

		FavouriteLessonsImpl favouriteLessonsImpl = new FavouriteLessonsImpl();

		favouriteLessonsImpl.setNew(favouriteLessons.isNew());
		favouriteLessonsImpl.setPrimaryKey(favouriteLessons.getPrimaryKey());

		favouriteLessonsImpl.setUserId(favouriteLessons.getUserId());
		favouriteLessonsImpl.setLessonId(favouriteLessons.getLessonId());

		return favouriteLessonsImpl;
	}

	/**
	 * Returns the favourite lessons with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the favourite lessons
	 * @return the favourite lessons
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFavouriteLessonsException, SystemException {
		FavouriteLessons favouriteLessons = fetchByPrimaryKey(primaryKey);

		if (favouriteLessons == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFavouriteLessonsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return favouriteLessons;
	}

	/**
	 * Returns the favourite lessons with the primary key or throws a {@link com.nyu.NoSuchFavouriteLessonsException} if it could not be found.
	 *
	 * @param favouriteLessonsPK the primary key of the favourite lessons
	 * @return the favourite lessons
	 * @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons findByPrimaryKey(
		FavouriteLessonsPK favouriteLessonsPK)
		throws NoSuchFavouriteLessonsException, SystemException {
		return findByPrimaryKey((Serializable)favouriteLessonsPK);
	}

	/**
	 * Returns the favourite lessons with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the favourite lessons
	 * @return the favourite lessons, or <code>null</code> if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FavouriteLessons favouriteLessons = (FavouriteLessons)EntityCacheUtil.getResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
				FavouriteLessonsImpl.class, primaryKey);

		if (favouriteLessons == _nullFavouriteLessons) {
			return null;
		}

		if (favouriteLessons == null) {
			Session session = null;

			try {
				session = openSession();

				favouriteLessons = (FavouriteLessons)session.get(FavouriteLessonsImpl.class,
						primaryKey);

				if (favouriteLessons != null) {
					cacheResult(favouriteLessons);
				}
				else {
					EntityCacheUtil.putResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
						FavouriteLessonsImpl.class, primaryKey,
						_nullFavouriteLessons);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FavouriteLessonsModelImpl.ENTITY_CACHE_ENABLED,
					FavouriteLessonsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return favouriteLessons;
	}

	/**
	 * Returns the favourite lessons with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param favouriteLessonsPK the primary key of the favourite lessons
	 * @return the favourite lessons, or <code>null</code> if a favourite lessons with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FavouriteLessons fetchByPrimaryKey(
		FavouriteLessonsPK favouriteLessonsPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)favouriteLessonsPK);
	}

	/**
	 * Returns all the favourite lessonses.
	 *
	 * @return the favourite lessonses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FavouriteLessons> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FavouriteLessons> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the favourite lessonses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of favourite lessonses
	 * @param end the upper bound of the range of favourite lessonses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of favourite lessonses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FavouriteLessons> findAll(int start, int end,
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

		List<FavouriteLessons> list = (List<FavouriteLessons>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FAVOURITELESSONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAVOURITELESSONS;

				if (pagination) {
					sql = sql.concat(FavouriteLessonsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FavouriteLessons>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FavouriteLessons>(list);
				}
				else {
					list = (List<FavouriteLessons>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the favourite lessonses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FavouriteLessons favouriteLessons : findAll()) {
			remove(favouriteLessons);
		}
	}

	/**
	 * Returns the number of favourite lessonses.
	 *
	 * @return the number of favourite lessonses
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

				Query q = session.createQuery(_SQL_COUNT_FAVOURITELESSONS);

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
	 * Initializes the favourite lessons persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.FavouriteLessons")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FavouriteLessons>> listenersList = new ArrayList<ModelListener<FavouriteLessons>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FavouriteLessons>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FavouriteLessonsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FAVOURITELESSONS = "SELECT favouriteLessons FROM FavouriteLessons favouriteLessons";
	private static final String _SQL_SELECT_FAVOURITELESSONS_WHERE = "SELECT favouriteLessons FROM FavouriteLessons favouriteLessons WHERE ";
	private static final String _SQL_COUNT_FAVOURITELESSONS = "SELECT COUNT(favouriteLessons) FROM FavouriteLessons favouriteLessons";
	private static final String _SQL_COUNT_FAVOURITELESSONS_WHERE = "SELECT COUNT(favouriteLessons) FROM FavouriteLessons favouriteLessons WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "favouriteLessons.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FavouriteLessons exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FavouriteLessons exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FavouriteLessonsPersistenceImpl.class);
	private static FavouriteLessons _nullFavouriteLessons = new FavouriteLessonsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FavouriteLessons> toCacheModel() {
				return _nullFavouriteLessonsCacheModel;
			}
		};

	private static CacheModel<FavouriteLessons> _nullFavouriteLessonsCacheModel = new CacheModel<FavouriteLessons>() {
			@Override
			public FavouriteLessons toEntityModel() {
				return _nullFavouriteLessons;
			}
		};
}