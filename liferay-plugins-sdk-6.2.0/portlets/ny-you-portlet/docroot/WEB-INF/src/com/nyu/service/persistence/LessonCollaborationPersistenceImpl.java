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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchLessonCollaborationException;

import com.nyu.model.LessonCollaboration;
import com.nyu.model.impl.LessonCollaborationImpl;
import com.nyu.model.impl.LessonCollaborationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the lesson collaboration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonCollaborationPersistence
 * @see LessonCollaborationUtil
 * @generated
 */
public class LessonCollaborationPersistenceImpl extends BasePersistenceImpl<LessonCollaboration>
	implements LessonCollaborationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LessonCollaborationUtil} to access the lesson collaboration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LessonCollaborationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBylessonCollabUserExistence",
			new String[] { Long.class.getName(), Long.class.getName() },
			LessonCollaborationModelImpl.LESSONID_COLUMN_BITMASK |
			LessonCollaborationModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONCOLLABUSEREXISTENCE =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonCollabUserExistence",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the lesson collaboration where lessonId = &#63; and userId = &#63; or throws a {@link com.nyu.NoSuchLessonCollaborationException} if it could not be found.
	 *
	 * @param lessonId the lesson ID
	 * @param userId the user ID
	 * @return the matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findBylessonCollabUserExistence(long lessonId,
		long userId) throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchBylessonCollabUserExistence(lessonId,
				userId);

		if (lessonCollaboration == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("lessonId=");
			msg.append(lessonId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchLessonCollaborationException(msg.toString());
		}

		return lessonCollaboration;
	}

	/**
	 * Returns the lesson collaboration where lessonId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param lessonId the lesson ID
	 * @param userId the user ID
	 * @return the matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchBylessonCollabUserExistence(long lessonId,
		long userId) throws SystemException {
		return fetchBylessonCollabUserExistence(lessonId, userId, true);
	}

	/**
	 * Returns the lesson collaboration where lessonId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param lessonId the lesson ID
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchBylessonCollabUserExistence(long lessonId,
		long userId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { lessonId, userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
					finderArgs, this);
		}

		if (result instanceof LessonCollaboration) {
			LessonCollaboration lessonCollaboration = (LessonCollaboration)result;

			if ((lessonId != lessonCollaboration.getLessonId()) ||
					(userId != lessonCollaboration.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSEREXISTENCE_LESSONID_2);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSEREXISTENCE_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				qPos.add(userId);

				List<LessonCollaboration> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"LessonCollaborationPersistenceImpl.fetchBylessonCollabUserExistence(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					LessonCollaboration lessonCollaboration = list.get(0);

					result = lessonCollaboration;

					cacheResult(lessonCollaboration);

					if ((lessonCollaboration.getLessonId() != lessonId) ||
							(lessonCollaboration.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
							finderArgs, lessonCollaboration);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
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
			return (LessonCollaboration)result;
		}
	}

	/**
	 * Removes the lesson collaboration where lessonId = &#63; and userId = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param userId the user ID
	 * @return the lesson collaboration that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration removeBylessonCollabUserExistence(
		long lessonId, long userId)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = findBylessonCollabUserExistence(lessonId,
				userId);

		return remove(lessonCollaboration);
	}

	/**
	 * Returns the number of lesson collaborations where lessonId = &#63; and userId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param userId the user ID
	 * @return the number of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonCollabUserExistence(long lessonId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONCOLLABUSEREXISTENCE;

		Object[] finderArgs = new Object[] { lessonId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSEREXISTENCE_LESSONID_2);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSEREXISTENCE_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

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

	private static final String _FINDER_COLUMN_LESSONCOLLABUSEREXISTENCE_LESSONID_2 =
		"lessonCollaboration.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSEREXISTENCE_USERID_2 =
		"lessonCollaboration.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonCollabUserList",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonCollabUserList",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonCollaborationModelImpl.LESSONID_COLUMN_BITMASK |
			LessonCollaborationModelImpl.MEMBERSTATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLIST = new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonCollabUserList",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @return the matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findBylessonCollabUserList(long lessonId,
		String memberStatus) throws SystemException {
		return findBylessonCollabUserList(lessonId, memberStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @return the range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findBylessonCollabUserList(long lessonId,
		String memberStatus, int start, int end) throws SystemException {
		return findBylessonCollabUserList(lessonId, memberStatus, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findBylessonCollabUserList(long lessonId,
		String memberStatus, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST;
			finderArgs = new Object[] { lessonId, memberStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST;
			finderArgs = new Object[] {
					lessonId, memberStatus,
					
					start, end, orderByComparator
				};
		}

		List<LessonCollaboration> list = (List<LessonCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LessonCollaboration lessonCollaboration : list) {
				if ((lessonId != lessonCollaboration.getLessonId()) ||
						!Validator.equals(memberStatus,
							lessonCollaboration.getMemberStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_LESSONID_2);

			boolean bindMemberStatus = false;

			if (memberStatus == null) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_1);
			}
			else if (memberStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_3);
			}
			else {
				bindMemberStatus = true;

				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindMemberStatus) {
					qPos.add(memberStatus);
				}

				if (!pagination) {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonCollaboration>(list);
				}
				else {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
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
	 * Returns the first lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findBylessonCollabUserList_First(long lessonId,
		String memberStatus, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchBylessonCollabUserList_First(lessonId,
				memberStatus, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", memberStatus=");
		msg.append(memberStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the first lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchBylessonCollabUserList_First(
		long lessonId, String memberStatus, OrderByComparator orderByComparator)
		throws SystemException {
		List<LessonCollaboration> list = findBylessonCollabUserList(lessonId,
				memberStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findBylessonCollabUserList_Last(long lessonId,
		String memberStatus, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchBylessonCollabUserList_Last(lessonId,
				memberStatus, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", memberStatus=");
		msg.append(memberStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchBylessonCollabUserList_Last(long lessonId,
		String memberStatus, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBylessonCollabUserList(lessonId, memberStatus);

		if (count == 0) {
			return null;
		}

		List<LessonCollaboration> list = findBylessonCollabUserList(lessonId,
				memberStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param id the primary key of the current lesson collaboration
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration[] findBylessonCollabUserList_PrevAndNext(
		long id, long lessonId, String memberStatus,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LessonCollaboration[] array = new LessonCollaborationImpl[3];

			array[0] = getBylessonCollabUserList_PrevAndNext(session,
					lessonCollaboration, lessonId, memberStatus,
					orderByComparator, true);

			array[1] = lessonCollaboration;

			array[2] = getBylessonCollabUserList_PrevAndNext(session,
					lessonCollaboration, lessonId, memberStatus,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LessonCollaboration getBylessonCollabUserList_PrevAndNext(
		Session session, LessonCollaboration lessonCollaboration,
		long lessonId, String memberStatus,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_LESSONID_2);

		boolean bindMemberStatus = false;

		if (memberStatus == null) {
			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_1);
		}
		else if (memberStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_3);
		}
		else {
			bindMemberStatus = true;

			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_2);
		}

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
			query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (bindMemberStatus) {
			qPos.add(memberStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lessonCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LessonCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson collaborations where lessonId = &#63; and memberStatus = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonCollabUserList(long lessonId, String memberStatus)
		throws SystemException {
		for (LessonCollaboration lessonCollaboration : findBylessonCollabUserList(
				lessonId, memberStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(lessonCollaboration);
		}
	}

	/**
	 * Returns the number of lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param memberStatus the member status
	 * @return the number of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonCollabUserList(long lessonId, String memberStatus)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLIST;

		Object[] finderArgs = new Object[] { lessonId, memberStatus };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_LESSONID_2);

			boolean bindMemberStatus = false;

			if (memberStatus == null) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_1);
			}
			else if (memberStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_3);
			}
			else {
				bindMemberStatus = true;

				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindMemberStatus) {
					qPos.add(memberStatus);
				}

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

	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLIST_LESSONID_2 = "lessonCollaboration.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_1 =
		"lessonCollaboration.memberStatus IS NULL";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_2 =
		"lessonCollaboration.memberStatus = ?";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLIST_MEMBERSTATUS_3 =
		"(lessonCollaboration.memberStatus IS NULL OR lessonCollaboration.memberStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonCollabUserListByType",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonCollabUserListByType",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonCollaborationModelImpl.LESSONID_COLUMN_BITMASK |
			LessonCollaborationModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLISTBYTYPE =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonCollabUserListByType",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lesson collaborations where lessonId = &#63; and type = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @return the matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findBylessonCollabUserListByType(
		long lessonId, String type) throws SystemException {
		return findBylessonCollabUserListByType(lessonId, type,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson collaborations where lessonId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @return the range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findBylessonCollabUserListByType(
		long lessonId, String type, int start, int end)
		throws SystemException {
		return findBylessonCollabUserListByType(lessonId, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson collaborations where lessonId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findBylessonCollabUserListByType(
		long lessonId, String type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE;
			finderArgs = new Object[] { lessonId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE;
			finderArgs = new Object[] {
					lessonId, type,
					
					start, end, orderByComparator
				};
		}

		List<LessonCollaboration> list = (List<LessonCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LessonCollaboration lessonCollaboration : list) {
				if ((lessonId != lessonCollaboration.getLessonId()) ||
						!Validator.equals(type, lessonCollaboration.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_LESSONID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindType) {
					qPos.add(type);
				}

				if (!pagination) {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonCollaboration>(list);
				}
				else {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
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
	 * Returns the first lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findBylessonCollabUserListByType_First(
		long lessonId, String type, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchBylessonCollabUserListByType_First(lessonId,
				type, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the first lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchBylessonCollabUserListByType_First(
		long lessonId, String type, OrderByComparator orderByComparator)
		throws SystemException {
		List<LessonCollaboration> list = findBylessonCollabUserListByType(lessonId,
				type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findBylessonCollabUserListByType_Last(
		long lessonId, String type, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchBylessonCollabUserListByType_Last(lessonId,
				type, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchBylessonCollabUserListByType_Last(
		long lessonId, String type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBylessonCollabUserListByType(lessonId, type);

		if (count == 0) {
			return null;
		}

		List<LessonCollaboration> list = findBylessonCollabUserListByType(lessonId,
				type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	 *
	 * @param id the primary key of the current lesson collaboration
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration[] findBylessonCollabUserListByType_PrevAndNext(
		long id, long lessonId, String type, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LessonCollaboration[] array = new LessonCollaborationImpl[3];

			array[0] = getBylessonCollabUserListByType_PrevAndNext(session,
					lessonCollaboration, lessonId, type, orderByComparator, true);

			array[1] = lessonCollaboration;

			array[2] = getBylessonCollabUserListByType_PrevAndNext(session,
					lessonCollaboration, lessonId, type, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LessonCollaboration getBylessonCollabUserListByType_PrevAndNext(
		Session session, LessonCollaboration lessonCollaboration,
		long lessonId, String type, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_LESSONID_2);

		boolean bindType = false;

		if (type == null) {
			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_1);
		}
		else if (type.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_3);
		}
		else {
			bindType = true;

			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_2);
		}

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
			query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (bindType) {
			qPos.add(type);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lessonCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LessonCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson collaborations where lessonId = &#63; and type = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonCollabUserListByType(long lessonId, String type)
		throws SystemException {
		for (LessonCollaboration lessonCollaboration : findBylessonCollabUserListByType(
				lessonId, type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lessonCollaboration);
		}
	}

	/**
	 * Returns the number of lesson collaborations where lessonId = &#63; and type = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param type the type
	 * @return the number of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonCollabUserListByType(long lessonId, String type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLISTBYTYPE;

		Object[] finderArgs = new Object[] { lessonId, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_LESSONID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindType) {
					qPos.add(type);
				}

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

	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_LESSONID_2 =
		"lessonCollaboration.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_1 =
		"lessonCollaboration.type IS NULL";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_2 =
		"lessonCollaboration.type = ?";
	private static final String _FINDER_COLUMN_LESSONCOLLABUSERLISTBYTYPE_TYPE_3 =
		"(lessonCollaboration.type IS NULL OR lessonCollaboration.type = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByallLessonCollabByUserId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByallLessonCollabByUserId",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonCollaborationModelImpl.USERID_COLUMN_BITMASK |
			LessonCollaborationModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALLLESSONCOLLABBYUSERID = new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByallLessonCollabByUserId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lesson collaborations where userId = &#63; and type = &#63;.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @return the matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonCollabByUserId(
		long userId, String type) throws SystemException {
		return findByallLessonCollabByUserId(userId, type, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson collaborations where userId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @return the range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonCollabByUserId(
		long userId, String type, int start, int end) throws SystemException {
		return findByallLessonCollabByUserId(userId, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson collaborations where userId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonCollabByUserId(
		long userId, String type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID;
			finderArgs = new Object[] { userId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID;
			finderArgs = new Object[] {
					userId, type,
					
					start, end, orderByComparator
				};
		}

		List<LessonCollaboration> list = (List<LessonCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LessonCollaboration lessonCollaboration : list) {
				if ((userId != lessonCollaboration.getUserId()) ||
						!Validator.equals(type, lessonCollaboration.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_USERID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindType) {
					qPos.add(type);
				}

				if (!pagination) {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonCollaboration>(list);
				}
				else {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
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
	 * Returns the first lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByallLessonCollabByUserId_First(
		long userId, String type, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByallLessonCollabByUserId_First(userId,
				type, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the first lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByallLessonCollabByUserId_First(
		long userId, String type, OrderByComparator orderByComparator)
		throws SystemException {
		List<LessonCollaboration> list = findByallLessonCollabByUserId(userId,
				type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByallLessonCollabByUserId_Last(long userId,
		String type, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByallLessonCollabByUserId_Last(userId,
				type, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByallLessonCollabByUserId_Last(
		long userId, String type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByallLessonCollabByUserId(userId, type);

		if (count == 0) {
			return null;
		}

		List<LessonCollaboration> list = findByallLessonCollabByUserId(userId,
				type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	 *
	 * @param id the primary key of the current lesson collaboration
	 * @param userId the user ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration[] findByallLessonCollabByUserId_PrevAndNext(
		long id, long userId, String type, OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LessonCollaboration[] array = new LessonCollaborationImpl[3];

			array[0] = getByallLessonCollabByUserId_PrevAndNext(session,
					lessonCollaboration, userId, type, orderByComparator, true);

			array[1] = lessonCollaboration;

			array[2] = getByallLessonCollabByUserId_PrevAndNext(session,
					lessonCollaboration, userId, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LessonCollaboration getByallLessonCollabByUserId_PrevAndNext(
		Session session, LessonCollaboration lessonCollaboration, long userId,
		String type, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_USERID_2);

		boolean bindType = false;

		if (type == null) {
			query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_1);
		}
		else if (type.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_3);
		}
		else {
			bindType = true;

			query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_2);
		}

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
			query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (bindType) {
			qPos.add(type);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lessonCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LessonCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson collaborations where userId = &#63; and type = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByallLessonCollabByUserId(long userId, String type)
		throws SystemException {
		for (LessonCollaboration lessonCollaboration : findByallLessonCollabByUserId(
				userId, type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lessonCollaboration);
		}
	}

	/**
	 * Returns the number of lesson collaborations where userId = &#63; and type = &#63;.
	 *
	 * @param userId the user ID
	 * @param type the type
	 * @return the number of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByallLessonCollabByUserId(long userId, String type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALLLESSONCOLLABBYUSERID;

		Object[] finderArgs = new Object[] { userId, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_USERID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindType) {
					qPos.add(type);
				}

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

	private static final String _FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_USERID_2 = "lessonCollaboration.userId = ? AND ";
	private static final String _FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_1 = "lessonCollaboration.type IS NULL";
	private static final String _FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_2 = "lessonCollaboration.type = ?";
	private static final String _FINDER_COLUMN_ALLLESSONCOLLABBYUSERID_TYPE_3 = "(lessonCollaboration.type IS NULL OR lessonCollaboration.type = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByallLessonAccessPermissionByUserId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByallLessonAccessPermissionByUserId",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonCollaborationModelImpl.USERID_COLUMN_BITMASK |
			LessonCollaborationModelImpl.ACCESSPERMISSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYUSERID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByallLessonAccessPermissionByUserId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lesson collaborations where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @return the matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonAccessPermissionByUserId(
		long userId, String accessPermission) throws SystemException {
		return findByallLessonAccessPermissionByUserId(userId,
			accessPermission, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson collaborations where userId = &#63; and accessPermission = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @return the range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonAccessPermissionByUserId(
		long userId, String accessPermission, int start, int end)
		throws SystemException {
		return findByallLessonAccessPermissionByUserId(userId,
			accessPermission, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson collaborations where userId = &#63; and accessPermission = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonAccessPermissionByUserId(
		long userId, String accessPermission, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID;
			finderArgs = new Object[] { userId, accessPermission };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID;
			finderArgs = new Object[] {
					userId, accessPermission,
					
					start, end, orderByComparator
				};
		}

		List<LessonCollaboration> list = (List<LessonCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LessonCollaboration lessonCollaboration : list) {
				if ((userId != lessonCollaboration.getUserId()) ||
						!Validator.equals(accessPermission,
							lessonCollaboration.getAccessPermission())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_USERID_2);

			boolean bindAccessPermission = false;

			if (accessPermission == null) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_1);
			}
			else if (accessPermission.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_3);
			}
			else {
				bindAccessPermission = true;

				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindAccessPermission) {
					qPos.add(accessPermission);
				}

				if (!pagination) {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonCollaboration>(list);
				}
				else {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
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
	 * Returns the first lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByallLessonAccessPermissionByUserId_First(
		long userId, String accessPermission,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByallLessonAccessPermissionByUserId_First(userId,
				accessPermission, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", accessPermission=");
		msg.append(accessPermission);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the first lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByallLessonAccessPermissionByUserId_First(
		long userId, String accessPermission,
		OrderByComparator orderByComparator) throws SystemException {
		List<LessonCollaboration> list = findByallLessonAccessPermissionByUserId(userId,
				accessPermission, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByallLessonAccessPermissionByUserId_Last(
		long userId, String accessPermission,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByallLessonAccessPermissionByUserId_Last(userId,
				accessPermission, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", accessPermission=");
		msg.append(accessPermission);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByallLessonAccessPermissionByUserId_Last(
		long userId, String accessPermission,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByallLessonAccessPermissionByUserId(userId,
				accessPermission);

		if (count == 0) {
			return null;
		}

		List<LessonCollaboration> list = findByallLessonAccessPermissionByUserId(userId,
				accessPermission, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param id the primary key of the current lesson collaboration
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration[] findByallLessonAccessPermissionByUserId_PrevAndNext(
		long id, long userId, String accessPermission,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LessonCollaboration[] array = new LessonCollaborationImpl[3];

			array[0] = getByallLessonAccessPermissionByUserId_PrevAndNext(session,
					lessonCollaboration, userId, accessPermission,
					orderByComparator, true);

			array[1] = lessonCollaboration;

			array[2] = getByallLessonAccessPermissionByUserId_PrevAndNext(session,
					lessonCollaboration, userId, accessPermission,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LessonCollaboration getByallLessonAccessPermissionByUserId_PrevAndNext(
		Session session, LessonCollaboration lessonCollaboration, long userId,
		String accessPermission, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_USERID_2);

		boolean bindAccessPermission = false;

		if (accessPermission == null) {
			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_1);
		}
		else if (accessPermission.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_3);
		}
		else {
			bindAccessPermission = true;

			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_2);
		}

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
			query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (bindAccessPermission) {
			qPos.add(accessPermission);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lessonCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LessonCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson collaborations where userId = &#63; and accessPermission = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByallLessonAccessPermissionByUserId(long userId,
		String accessPermission) throws SystemException {
		for (LessonCollaboration lessonCollaboration : findByallLessonAccessPermissionByUserId(
				userId, accessPermission, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(lessonCollaboration);
		}
	}

	/**
	 * Returns the number of lesson collaborations where userId = &#63; and accessPermission = &#63;.
	 *
	 * @param userId the user ID
	 * @param accessPermission the access permission
	 * @return the number of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByallLessonAccessPermissionByUserId(long userId,
		String accessPermission) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYUSERID;

		Object[] finderArgs = new Object[] { userId, accessPermission };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_USERID_2);

			boolean bindAccessPermission = false;

			if (accessPermission == null) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_1);
			}
			else if (accessPermission.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_3);
			}
			else {
				bindAccessPermission = true;

				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindAccessPermission) {
					qPos.add(accessPermission);
				}

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

	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_USERID_2 =
		"lessonCollaboration.userId = ? AND ";
	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_1 =
		"lessonCollaboration.accessPermission IS NULL";
	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_2 =
		"lessonCollaboration.accessPermission = ?";
	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYUSERID_ACCESSPERMISSION_3 =
		"(lessonCollaboration.accessPermission IS NULL OR lessonCollaboration.accessPermission = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByallLessonAccessPermissionByLessonId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED,
			LessonCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByallLessonAccessPermissionByLessonId",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonCollaborationModelImpl.LESSONID_COLUMN_BITMASK |
			LessonCollaborationModelImpl.ACCESSPERMISSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYLESSONID =
		new FinderPath(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByallLessonAccessPermissionByLessonId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @return the matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonAccessPermissionByLessonId(
		long lessonId, String accessPermission) throws SystemException {
		return findByallLessonAccessPermissionByLessonId(lessonId,
			accessPermission, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @return the range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonAccessPermissionByLessonId(
		long lessonId, String accessPermission, int start, int end)
		throws SystemException {
		return findByallLessonAccessPermissionByLessonId(lessonId,
			accessPermission, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findByallLessonAccessPermissionByLessonId(
		long lessonId, String accessPermission, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID;
			finderArgs = new Object[] { lessonId, accessPermission };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID;
			finderArgs = new Object[] {
					lessonId, accessPermission,
					
					start, end, orderByComparator
				};
		}

		List<LessonCollaboration> list = (List<LessonCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LessonCollaboration lessonCollaboration : list) {
				if ((lessonId != lessonCollaboration.getLessonId()) ||
						!Validator.equals(accessPermission,
							lessonCollaboration.getAccessPermission())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_LESSONID_2);

			boolean bindAccessPermission = false;

			if (accessPermission == null) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_1);
			}
			else if (accessPermission.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_3);
			}
			else {
				bindAccessPermission = true;

				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindAccessPermission) {
					qPos.add(accessPermission);
				}

				if (!pagination) {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonCollaboration>(list);
				}
				else {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
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
	 * Returns the first lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByallLessonAccessPermissionByLessonId_First(
		long lessonId, String accessPermission,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByallLessonAccessPermissionByLessonId_First(lessonId,
				accessPermission, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", accessPermission=");
		msg.append(accessPermission);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the first lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByallLessonAccessPermissionByLessonId_First(
		long lessonId, String accessPermission,
		OrderByComparator orderByComparator) throws SystemException {
		List<LessonCollaboration> list = findByallLessonAccessPermissionByLessonId(lessonId,
				accessPermission, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByallLessonAccessPermissionByLessonId_Last(
		long lessonId, String accessPermission,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByallLessonAccessPermissionByLessonId_Last(lessonId,
				accessPermission, orderByComparator);

		if (lessonCollaboration != null) {
			return lessonCollaboration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", accessPermission=");
		msg.append(accessPermission);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonCollaborationException(msg.toString());
	}

	/**
	 * Returns the last lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByallLessonAccessPermissionByLessonId_Last(
		long lessonId, String accessPermission,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByallLessonAccessPermissionByLessonId(lessonId,
				accessPermission);

		if (count == 0) {
			return null;
		}

		List<LessonCollaboration> list = findByallLessonAccessPermissionByLessonId(lessonId,
				accessPermission, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param id the primary key of the current lesson collaboration
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration[] findByallLessonAccessPermissionByLessonId_PrevAndNext(
		long id, long lessonId, String accessPermission,
		OrderByComparator orderByComparator)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LessonCollaboration[] array = new LessonCollaborationImpl[3];

			array[0] = getByallLessonAccessPermissionByLessonId_PrevAndNext(session,
					lessonCollaboration, lessonId, accessPermission,
					orderByComparator, true);

			array[1] = lessonCollaboration;

			array[2] = getByallLessonAccessPermissionByLessonId_PrevAndNext(session,
					lessonCollaboration, lessonId, accessPermission,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LessonCollaboration getByallLessonAccessPermissionByLessonId_PrevAndNext(
		Session session, LessonCollaboration lessonCollaboration,
		long lessonId, String accessPermission,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSONCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_LESSONID_2);

		boolean bindAccessPermission = false;

		if (accessPermission == null) {
			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_1);
		}
		else if (accessPermission.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_3);
		}
		else {
			bindAccessPermission = true;

			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_2);
		}

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
			query.append(LessonCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (bindAccessPermission) {
			qPos.add(accessPermission);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lessonCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LessonCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson collaborations where lessonId = &#63; and accessPermission = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByallLessonAccessPermissionByLessonId(long lessonId,
		String accessPermission) throws SystemException {
		for (LessonCollaboration lessonCollaboration : findByallLessonAccessPermissionByLessonId(
				lessonId, accessPermission, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lessonCollaboration);
		}
	}

	/**
	 * Returns the number of lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param accessPermission the access permission
	 * @return the number of matching lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByallLessonAccessPermissionByLessonId(long lessonId,
		String accessPermission) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYLESSONID;

		Object[] finderArgs = new Object[] { lessonId, accessPermission };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSONCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_LESSONID_2);

			boolean bindAccessPermission = false;

			if (accessPermission == null) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_1);
			}
			else if (accessPermission.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_3);
			}
			else {
				bindAccessPermission = true;

				query.append(_FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindAccessPermission) {
					qPos.add(accessPermission);
				}

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

	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_LESSONID_2 =
		"lessonCollaboration.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_1 =
		"lessonCollaboration.accessPermission IS NULL";
	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_2 =
		"lessonCollaboration.accessPermission = ?";
	private static final String _FINDER_COLUMN_ALLLESSONACCESSPERMISSIONBYLESSONID_ACCESSPERMISSION_3 =
		"(lessonCollaboration.accessPermission IS NULL OR lessonCollaboration.accessPermission = '')";

	public LessonCollaborationPersistenceImpl() {
		setModelClass(LessonCollaboration.class);
	}

	/**
	 * Caches the lesson collaboration in the entity cache if it is enabled.
	 *
	 * @param lessonCollaboration the lesson collaboration
	 */
	@Override
	public void cacheResult(LessonCollaboration lessonCollaboration) {
		EntityCacheUtil.putResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationImpl.class, lessonCollaboration.getPrimaryKey(),
			lessonCollaboration);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
			new Object[] {
				lessonCollaboration.getLessonId(),
				lessonCollaboration.getUserId()
			}, lessonCollaboration);

		lessonCollaboration.resetOriginalValues();
	}

	/**
	 * Caches the lesson collaborations in the entity cache if it is enabled.
	 *
	 * @param lessonCollaborations the lesson collaborations
	 */
	@Override
	public void cacheResult(List<LessonCollaboration> lessonCollaborations) {
		for (LessonCollaboration lessonCollaboration : lessonCollaborations) {
			if (EntityCacheUtil.getResult(
						LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
						LessonCollaborationImpl.class,
						lessonCollaboration.getPrimaryKey()) == null) {
				cacheResult(lessonCollaboration);
			}
			else {
				lessonCollaboration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lesson collaborations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LessonCollaborationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LessonCollaborationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lesson collaboration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LessonCollaboration lessonCollaboration) {
		EntityCacheUtil.removeResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationImpl.class, lessonCollaboration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(lessonCollaboration);
	}

	@Override
	public void clearCache(List<LessonCollaboration> lessonCollaborations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LessonCollaboration lessonCollaboration : lessonCollaborations) {
			EntityCacheUtil.removeResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
				LessonCollaborationImpl.class,
				lessonCollaboration.getPrimaryKey());

			clearUniqueFindersCache(lessonCollaboration);
		}
	}

	protected void cacheUniqueFindersCache(
		LessonCollaboration lessonCollaboration) {
		if (lessonCollaboration.isNew()) {
			Object[] args = new Object[] {
					lessonCollaboration.getLessonId(),
					lessonCollaboration.getUserId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSEREXISTENCE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
				args, lessonCollaboration);
		}
		else {
			LessonCollaborationModelImpl lessonCollaborationModelImpl = (LessonCollaborationModelImpl)lessonCollaboration;

			if ((lessonCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonCollaboration.getLessonId(),
						lessonCollaboration.getUserId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSEREXISTENCE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
					args, lessonCollaboration);
			}
		}
	}

	protected void clearUniqueFindersCache(
		LessonCollaboration lessonCollaboration) {
		LessonCollaborationModelImpl lessonCollaborationModelImpl = (LessonCollaborationModelImpl)lessonCollaboration;

		Object[] args = new Object[] {
				lessonCollaboration.getLessonId(),
				lessonCollaboration.getUserId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSEREXISTENCE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
			args);

		if ((lessonCollaborationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE.getColumnBitmask()) != 0) {
			args = new Object[] {
					lessonCollaborationModelImpl.getOriginalLessonId(),
					lessonCollaborationModelImpl.getOriginalUserId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSEREXISTENCE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LESSONCOLLABUSEREXISTENCE,
				args);
		}
	}

	/**
	 * Creates a new lesson collaboration with the primary key. Does not add the lesson collaboration to the database.
	 *
	 * @param id the primary key for the new lesson collaboration
	 * @return the new lesson collaboration
	 */
	@Override
	public LessonCollaboration create(long id) {
		LessonCollaboration lessonCollaboration = new LessonCollaborationImpl();

		lessonCollaboration.setNew(true);
		lessonCollaboration.setPrimaryKey(id);

		return lessonCollaboration;
	}

	/**
	 * Removes the lesson collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the lesson collaboration
	 * @return the lesson collaboration that was removed
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration remove(long id)
		throws NoSuchLessonCollaborationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the lesson collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lesson collaboration
	 * @return the lesson collaboration that was removed
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration remove(Serializable primaryKey)
		throws NoSuchLessonCollaborationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LessonCollaboration lessonCollaboration = (LessonCollaboration)session.get(LessonCollaborationImpl.class,
					primaryKey);

			if (lessonCollaboration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLessonCollaborationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lessonCollaboration);
		}
		catch (NoSuchLessonCollaborationException nsee) {
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
	protected LessonCollaboration removeImpl(
		LessonCollaboration lessonCollaboration) throws SystemException {
		lessonCollaboration = toUnwrappedModel(lessonCollaboration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lessonCollaboration)) {
				lessonCollaboration = (LessonCollaboration)session.get(LessonCollaborationImpl.class,
						lessonCollaboration.getPrimaryKeyObj());
			}

			if (lessonCollaboration != null) {
				session.delete(lessonCollaboration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lessonCollaboration != null) {
			clearCache(lessonCollaboration);
		}

		return lessonCollaboration;
	}

	@Override
	public LessonCollaboration updateImpl(
		com.nyu.model.LessonCollaboration lessonCollaboration)
		throws SystemException {
		lessonCollaboration = toUnwrappedModel(lessonCollaboration);

		boolean isNew = lessonCollaboration.isNew();

		LessonCollaborationModelImpl lessonCollaborationModelImpl = (LessonCollaborationModelImpl)lessonCollaboration;

		Session session = null;

		try {
			session = openSession();

			if (lessonCollaboration.isNew()) {
				session.save(lessonCollaboration);

				lessonCollaboration.setNew(false);
			}
			else {
				session.merge(lessonCollaboration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LessonCollaborationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lessonCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonCollaborationModelImpl.getOriginalLessonId(),
						lessonCollaborationModelImpl.getOriginalMemberStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST,
					args);

				args = new Object[] {
						lessonCollaborationModelImpl.getLessonId(),
						lessonCollaborationModelImpl.getMemberStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLIST,
					args);
			}

			if ((lessonCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonCollaborationModelImpl.getOriginalLessonId(),
						lessonCollaborationModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLISTBYTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE,
					args);

				args = new Object[] {
						lessonCollaborationModelImpl.getLessonId(),
						lessonCollaborationModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONCOLLABUSERLISTBYTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONCOLLABUSERLISTBYTYPE,
					args);
			}

			if ((lessonCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonCollaborationModelImpl.getOriginalUserId(),
						lessonCollaborationModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLLESSONCOLLABBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID,
					args);

				args = new Object[] {
						lessonCollaborationModelImpl.getUserId(),
						lessonCollaborationModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLLESSONCOLLABBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONCOLLABBYUSERID,
					args);
			}

			if ((lessonCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonCollaborationModelImpl.getOriginalUserId(),
						lessonCollaborationModelImpl.getOriginalAccessPermission()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID,
					args);

				args = new Object[] {
						lessonCollaborationModelImpl.getUserId(),
						lessonCollaborationModelImpl.getAccessPermission()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYUSERID,
					args);
			}

			if ((lessonCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonCollaborationModelImpl.getOriginalLessonId(),
						lessonCollaborationModelImpl.getOriginalAccessPermission()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYLESSONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID,
					args);

				args = new Object[] {
						lessonCollaborationModelImpl.getLessonId(),
						lessonCollaborationModelImpl.getAccessPermission()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLLESSONACCESSPERMISSIONBYLESSONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLLESSONACCESSPERMISSIONBYLESSONID,
					args);
			}
		}

		EntityCacheUtil.putResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			LessonCollaborationImpl.class, lessonCollaboration.getPrimaryKey(),
			lessonCollaboration);

		clearUniqueFindersCache(lessonCollaboration);
		cacheUniqueFindersCache(lessonCollaboration);

		return lessonCollaboration;
	}

	protected LessonCollaboration toUnwrappedModel(
		LessonCollaboration lessonCollaboration) {
		if (lessonCollaboration instanceof LessonCollaborationImpl) {
			return lessonCollaboration;
		}

		LessonCollaborationImpl lessonCollaborationImpl = new LessonCollaborationImpl();

		lessonCollaborationImpl.setNew(lessonCollaboration.isNew());
		lessonCollaborationImpl.setPrimaryKey(lessonCollaboration.getPrimaryKey());

		lessonCollaborationImpl.setId(lessonCollaboration.getId());
		lessonCollaborationImpl.setLessonId(lessonCollaboration.getLessonId());
		lessonCollaborationImpl.setUserId(lessonCollaboration.getUserId());
		lessonCollaborationImpl.setMemberStatus(lessonCollaboration.getMemberStatus());
		lessonCollaborationImpl.setType(lessonCollaboration.getType());
		lessonCollaborationImpl.setAccessPermission(lessonCollaboration.getAccessPermission());

		return lessonCollaborationImpl;
	}

	/**
	 * Returns the lesson collaboration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson collaboration
	 * @return the lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLessonCollaborationException, SystemException {
		LessonCollaboration lessonCollaboration = fetchByPrimaryKey(primaryKey);

		if (lessonCollaboration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLessonCollaborationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lessonCollaboration;
	}

	/**
	 * Returns the lesson collaboration with the primary key or throws a {@link com.nyu.NoSuchLessonCollaborationException} if it could not be found.
	 *
	 * @param id the primary key of the lesson collaboration
	 * @return the lesson collaboration
	 * @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration findByPrimaryKey(long id)
		throws NoSuchLessonCollaborationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the lesson collaboration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson collaboration
	 * @return the lesson collaboration, or <code>null</code> if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LessonCollaboration lessonCollaboration = (LessonCollaboration)EntityCacheUtil.getResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
				LessonCollaborationImpl.class, primaryKey);

		if (lessonCollaboration == _nullLessonCollaboration) {
			return null;
		}

		if (lessonCollaboration == null) {
			Session session = null;

			try {
				session = openSession();

				lessonCollaboration = (LessonCollaboration)session.get(LessonCollaborationImpl.class,
						primaryKey);

				if (lessonCollaboration != null) {
					cacheResult(lessonCollaboration);
				}
				else {
					EntityCacheUtil.putResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
						LessonCollaborationImpl.class, primaryKey,
						_nullLessonCollaboration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LessonCollaborationModelImpl.ENTITY_CACHE_ENABLED,
					LessonCollaborationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lessonCollaboration;
	}

	/**
	 * Returns the lesson collaboration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the lesson collaboration
	 * @return the lesson collaboration, or <code>null</code> if a lesson collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LessonCollaboration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the lesson collaborations.
	 *
	 * @return the lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson collaborations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @return the range of lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson collaborations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lesson collaborations
	 * @param end the upper bound of the range of lesson collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lesson collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LessonCollaboration> findAll(int start, int end,
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

		List<LessonCollaboration> list = (List<LessonCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LESSONCOLLABORATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LESSONCOLLABORATION;

				if (pagination) {
					sql = sql.concat(LessonCollaborationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LessonCollaboration>(list);
				}
				else {
					list = (List<LessonCollaboration>)QueryUtil.list(q,
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
	 * Removes all the lesson collaborations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LessonCollaboration lessonCollaboration : findAll()) {
			remove(lessonCollaboration);
		}
	}

	/**
	 * Returns the number of lesson collaborations.
	 *
	 * @return the number of lesson collaborations
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

				Query q = session.createQuery(_SQL_COUNT_LESSONCOLLABORATION);

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
	 * Initializes the lesson collaboration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.LessonCollaboration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LessonCollaboration>> listenersList = new ArrayList<ModelListener<LessonCollaboration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LessonCollaboration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LessonCollaborationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LESSONCOLLABORATION = "SELECT lessonCollaboration FROM LessonCollaboration lessonCollaboration";
	private static final String _SQL_SELECT_LESSONCOLLABORATION_WHERE = "SELECT lessonCollaboration FROM LessonCollaboration lessonCollaboration WHERE ";
	private static final String _SQL_COUNT_LESSONCOLLABORATION = "SELECT COUNT(lessonCollaboration) FROM LessonCollaboration lessonCollaboration";
	private static final String _SQL_COUNT_LESSONCOLLABORATION_WHERE = "SELECT COUNT(lessonCollaboration) FROM LessonCollaboration lessonCollaboration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lessonCollaboration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LessonCollaboration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LessonCollaboration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LessonCollaborationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "type"
			});
	private static LessonCollaboration _nullLessonCollaboration = new LessonCollaborationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LessonCollaboration> toCacheModel() {
				return _nullLessonCollaborationCacheModel;
			}
		};

	private static CacheModel<LessonCollaboration> _nullLessonCollaborationCacheModel =
		new CacheModel<LessonCollaboration>() {
			@Override
			public LessonCollaboration toEntityModel() {
				return _nullLessonCollaboration;
			}
		};
}