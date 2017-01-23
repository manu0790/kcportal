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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchLessonObjectivesException;

import com.nyu.model.LessonObjectives;
import com.nyu.model.impl.LessonObjectivesImpl;
import com.nyu.model.impl.LessonObjectivesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the lesson objectives service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonObjectivesPersistence
 * @see LessonObjectivesUtil
 * @generated
 */
public class LessonObjectivesPersistenceImpl extends BasePersistenceImpl<LessonObjectives>
	implements LessonObjectivesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LessonObjectivesUtil} to access the lesson objectives persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LessonObjectivesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesModelImpl.FINDER_CACHE_ENABLED,
			LessonObjectivesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesModelImpl.FINDER_CACHE_ENABLED,
			LessonObjectivesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST =
		new FinderPath(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesModelImpl.FINDER_CACHE_ENABLED,
			LessonObjectivesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonObjectivesList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST =
		new FinderPath(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesModelImpl.FINDER_CACHE_ENABLED,
			LessonObjectivesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonObjectivesList",
			new String[] { Long.class.getName() },
			LessonObjectivesModelImpl.LESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONOBJECTIVESLIST = new FinderPath(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonObjectivesList", new String[] { Long.class.getName() });

	/**
	 * Returns all the lesson objectiveses where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the matching lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonObjectives> findBylessonObjectivesList(long lessonId)
		throws SystemException {
		return findBylessonObjectivesList(lessonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson objectiveses where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of lesson objectiveses
	 * @param end the upper bound of the range of lesson objectiveses (not inclusive)
	 * @return the range of matching lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonObjectives> findBylessonObjectivesList(long lessonId,
		int start, int end) throws SystemException {
		return findBylessonObjectivesList(lessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson objectiveses where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of lesson objectiveses
	 * @param end the upper bound of the range of lesson objectiveses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonObjectives> findBylessonObjectivesList(long lessonId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST;
			finderArgs = new Object[] { lessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST;
			finderArgs = new Object[] { lessonId, start, end, orderByComparator };
		}

		List<LessonObjectives> list = (List<LessonObjectives>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LessonObjectives lessonObjectives : list) {
				if ((lessonId != lessonObjectives.getLessonId())) {
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

			query.append(_SQL_SELECT_LESSONOBJECTIVES_WHERE);

			query.append(_FINDER_COLUMN_LESSONOBJECTIVESLIST_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonObjectivesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<LessonObjectives>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonObjectives>(list);
				}
				else {
					list = (List<LessonObjectives>)QueryUtil.list(q,
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
	 * Returns the first lesson objectives in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson objectives
	 * @throws com.nyu.NoSuchLessonObjectivesException if a matching lesson objectives could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives findBylessonObjectivesList_First(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonObjectivesException, SystemException {
		LessonObjectives lessonObjectives = fetchBylessonObjectivesList_First(lessonId,
				orderByComparator);

		if (lessonObjectives != null) {
			return lessonObjectives;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonObjectivesException(msg.toString());
	}

	/**
	 * Returns the first lesson objectives in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson objectives, or <code>null</code> if a matching lesson objectives could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives fetchBylessonObjectivesList_First(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LessonObjectives> list = findBylessonObjectivesList(lessonId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson objectives in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson objectives
	 * @throws com.nyu.NoSuchLessonObjectivesException if a matching lesson objectives could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives findBylessonObjectivesList_Last(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonObjectivesException, SystemException {
		LessonObjectives lessonObjectives = fetchBylessonObjectivesList_Last(lessonId,
				orderByComparator);

		if (lessonObjectives != null) {
			return lessonObjectives;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonObjectivesException(msg.toString());
	}

	/**
	 * Returns the last lesson objectives in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson objectives, or <code>null</code> if a matching lesson objectives could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives fetchBylessonObjectivesList_Last(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessonObjectivesList(lessonId);

		if (count == 0) {
			return null;
		}

		List<LessonObjectives> list = findBylessonObjectivesList(lessonId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson objectiveses before and after the current lesson objectives in the ordered set where lessonId = &#63;.
	 *
	 * @param id the primary key of the current lesson objectives
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson objectives
	 * @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives[] findBylessonObjectivesList_PrevAndNext(long id,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchLessonObjectivesException, SystemException {
		LessonObjectives lessonObjectives = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LessonObjectives[] array = new LessonObjectivesImpl[3];

			array[0] = getBylessonObjectivesList_PrevAndNext(session,
					lessonObjectives, lessonId, orderByComparator, true);

			array[1] = lessonObjectives;

			array[2] = getBylessonObjectivesList_PrevAndNext(session,
					lessonObjectives, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LessonObjectives getBylessonObjectivesList_PrevAndNext(
		Session session, LessonObjectives lessonObjectives, long lessonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSONOBJECTIVES_WHERE);

		query.append(_FINDER_COLUMN_LESSONOBJECTIVESLIST_LESSONID_2);

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
			query.append(LessonObjectivesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lessonObjectives);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LessonObjectives> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson objectiveses where lessonId = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonObjectivesList(long lessonId)
		throws SystemException {
		for (LessonObjectives lessonObjectives : findBylessonObjectivesList(
				lessonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lessonObjectives);
		}
	}

	/**
	 * Returns the number of lesson objectiveses where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the number of matching lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonObjectivesList(long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONOBJECTIVESLIST;

		Object[] finderArgs = new Object[] { lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSONOBJECTIVES_WHERE);

			query.append(_FINDER_COLUMN_LESSONOBJECTIVESLIST_LESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

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

	private static final String _FINDER_COLUMN_LESSONOBJECTIVESLIST_LESSONID_2 = "lessonObjectives.lessonId = ?";

	public LessonObjectivesPersistenceImpl() {
		setModelClass(LessonObjectives.class);
	}

	/**
	 * Caches the lesson objectives in the entity cache if it is enabled.
	 *
	 * @param lessonObjectives the lesson objectives
	 */
	@Override
	public void cacheResult(LessonObjectives lessonObjectives) {
		EntityCacheUtil.putResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesImpl.class, lessonObjectives.getPrimaryKey(),
			lessonObjectives);

		lessonObjectives.resetOriginalValues();
	}

	/**
	 * Caches the lesson objectiveses in the entity cache if it is enabled.
	 *
	 * @param lessonObjectiveses the lesson objectiveses
	 */
	@Override
	public void cacheResult(List<LessonObjectives> lessonObjectiveses) {
		for (LessonObjectives lessonObjectives : lessonObjectiveses) {
			if (EntityCacheUtil.getResult(
						LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
						LessonObjectivesImpl.class,
						lessonObjectives.getPrimaryKey()) == null) {
				cacheResult(lessonObjectives);
			}
			else {
				lessonObjectives.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lesson objectiveses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LessonObjectivesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LessonObjectivesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lesson objectives.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LessonObjectives lessonObjectives) {
		EntityCacheUtil.removeResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesImpl.class, lessonObjectives.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LessonObjectives> lessonObjectiveses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LessonObjectives lessonObjectives : lessonObjectiveses) {
			EntityCacheUtil.removeResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
				LessonObjectivesImpl.class, lessonObjectives.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lesson objectives with the primary key. Does not add the lesson objectives to the database.
	 *
	 * @param id the primary key for the new lesson objectives
	 * @return the new lesson objectives
	 */
	@Override
	public LessonObjectives create(long id) {
		LessonObjectives lessonObjectives = new LessonObjectivesImpl();

		lessonObjectives.setNew(true);
		lessonObjectives.setPrimaryKey(id);

		return lessonObjectives;
	}

	/**
	 * Removes the lesson objectives with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the lesson objectives
	 * @return the lesson objectives that was removed
	 * @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives remove(long id)
		throws NoSuchLessonObjectivesException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the lesson objectives with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lesson objectives
	 * @return the lesson objectives that was removed
	 * @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives remove(Serializable primaryKey)
		throws NoSuchLessonObjectivesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LessonObjectives lessonObjectives = (LessonObjectives)session.get(LessonObjectivesImpl.class,
					primaryKey);

			if (lessonObjectives == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLessonObjectivesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lessonObjectives);
		}
		catch (NoSuchLessonObjectivesException nsee) {
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
	protected LessonObjectives removeImpl(LessonObjectives lessonObjectives)
		throws SystemException {
		lessonObjectives = toUnwrappedModel(lessonObjectives);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lessonObjectives)) {
				lessonObjectives = (LessonObjectives)session.get(LessonObjectivesImpl.class,
						lessonObjectives.getPrimaryKeyObj());
			}

			if (lessonObjectives != null) {
				session.delete(lessonObjectives);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lessonObjectives != null) {
			clearCache(lessonObjectives);
		}

		return lessonObjectives;
	}

	@Override
	public LessonObjectives updateImpl(
		com.nyu.model.LessonObjectives lessonObjectives)
		throws SystemException {
		lessonObjectives = toUnwrappedModel(lessonObjectives);

		boolean isNew = lessonObjectives.isNew();

		LessonObjectivesModelImpl lessonObjectivesModelImpl = (LessonObjectivesModelImpl)lessonObjectives;

		Session session = null;

		try {
			session = openSession();

			if (lessonObjectives.isNew()) {
				session.save(lessonObjectives);

				lessonObjectives.setNew(false);
			}
			else {
				session.merge(lessonObjectives);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LessonObjectivesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lessonObjectivesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonObjectivesModelImpl.getOriginalLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONOBJECTIVESLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST,
					args);

				args = new Object[] { lessonObjectivesModelImpl.getLessonId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONOBJECTIVESLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONOBJECTIVESLIST,
					args);
			}
		}

		EntityCacheUtil.putResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
			LessonObjectivesImpl.class, lessonObjectives.getPrimaryKey(),
			lessonObjectives);

		return lessonObjectives;
	}

	protected LessonObjectives toUnwrappedModel(
		LessonObjectives lessonObjectives) {
		if (lessonObjectives instanceof LessonObjectivesImpl) {
			return lessonObjectives;
		}

		LessonObjectivesImpl lessonObjectivesImpl = new LessonObjectivesImpl();

		lessonObjectivesImpl.setNew(lessonObjectives.isNew());
		lessonObjectivesImpl.setPrimaryKey(lessonObjectives.getPrimaryKey());

		lessonObjectivesImpl.setId(lessonObjectives.getId());
		lessonObjectivesImpl.setLessonId(lessonObjectives.getLessonId());
		lessonObjectivesImpl.setObjective(lessonObjectives.getObjective());
		lessonObjectivesImpl.setModifiedDate(lessonObjectives.getModifiedDate());

		return lessonObjectivesImpl;
	}

	/**
	 * Returns the lesson objectives with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson objectives
	 * @return the lesson objectives
	 * @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLessonObjectivesException, SystemException {
		LessonObjectives lessonObjectives = fetchByPrimaryKey(primaryKey);

		if (lessonObjectives == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLessonObjectivesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lessonObjectives;
	}

	/**
	 * Returns the lesson objectives with the primary key or throws a {@link com.nyu.NoSuchLessonObjectivesException} if it could not be found.
	 *
	 * @param id the primary key of the lesson objectives
	 * @return the lesson objectives
	 * @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives findByPrimaryKey(long id)
		throws NoSuchLessonObjectivesException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the lesson objectives with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson objectives
	 * @return the lesson objectives, or <code>null</code> if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LessonObjectives lessonObjectives = (LessonObjectives)EntityCacheUtil.getResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
				LessonObjectivesImpl.class, primaryKey);

		if (lessonObjectives == _nullLessonObjectives) {
			return null;
		}

		if (lessonObjectives == null) {
			Session session = null;

			try {
				session = openSession();

				lessonObjectives = (LessonObjectives)session.get(LessonObjectivesImpl.class,
						primaryKey);

				if (lessonObjectives != null) {
					cacheResult(lessonObjectives);
				}
				else {
					EntityCacheUtil.putResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
						LessonObjectivesImpl.class, primaryKey,
						_nullLessonObjectives);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LessonObjectivesModelImpl.ENTITY_CACHE_ENABLED,
					LessonObjectivesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lessonObjectives;
	}

	/**
	 * Returns the lesson objectives with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the lesson objectives
	 * @return the lesson objectives, or <code>null</code> if a lesson objectives with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonObjectives fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the lesson objectiveses.
	 *
	 * @return the lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonObjectives> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson objectiveses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lesson objectiveses
	 * @param end the upper bound of the range of lesson objectiveses (not inclusive)
	 * @return the range of lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonObjectives> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson objectiveses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lesson objectiveses
	 * @param end the upper bound of the range of lesson objectiveses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lesson objectiveses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonObjectives> findAll(int start, int end,
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

		List<LessonObjectives> list = (List<LessonObjectives>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LESSONOBJECTIVES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LESSONOBJECTIVES;

				if (pagination) {
					sql = sql.concat(LessonObjectivesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LessonObjectives>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonObjectives>(list);
				}
				else {
					list = (List<LessonObjectives>)QueryUtil.list(q,
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
	 * Removes all the lesson objectiveses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LessonObjectives lessonObjectives : findAll()) {
			remove(lessonObjectives);
		}
	}

	/**
	 * Returns the number of lesson objectiveses.
	 *
	 * @return the number of lesson objectiveses
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

				Query q = session.createQuery(_SQL_COUNT_LESSONOBJECTIVES);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the lesson objectives persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.LessonObjectives")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LessonObjectives>> listenersList = new ArrayList<ModelListener<LessonObjectives>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LessonObjectives>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LessonObjectivesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LESSONOBJECTIVES = "SELECT lessonObjectives FROM LessonObjectives lessonObjectives";
	private static final String _SQL_SELECT_LESSONOBJECTIVES_WHERE = "SELECT lessonObjectives FROM LessonObjectives lessonObjectives WHERE ";
	private static final String _SQL_COUNT_LESSONOBJECTIVES = "SELECT COUNT(lessonObjectives) FROM LessonObjectives lessonObjectives";
	private static final String _SQL_COUNT_LESSONOBJECTIVES_WHERE = "SELECT COUNT(lessonObjectives) FROM LessonObjectives lessonObjectives WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lessonObjectives.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LessonObjectives exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LessonObjectives exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LessonObjectivesPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static LessonObjectives _nullLessonObjectives = new LessonObjectivesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LessonObjectives> toCacheModel() {
				return _nullLessonObjectivesCacheModel;
			}
		};

	private static CacheModel<LessonObjectives> _nullLessonObjectivesCacheModel = new CacheModel<LessonObjectives>() {
			@Override
			public LessonObjectives toEntityModel() {
				return _nullLessonObjectives;
			}
		};
}