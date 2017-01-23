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
import com.liferay.portal.kernel.util.ArrayUtil;
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
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchLessonException;

import com.nyu.model.Lesson;
import com.nyu.model.impl.LessonImpl;
import com.nyu.model.impl.LessonModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the lesson service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonPersistence
 * @see LessonUtil
 * @generated
 */
public class LessonPersistenceImpl extends BasePersistenceImpl<Lesson>
	implements LessonPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LessonUtil} to access the lesson persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LessonImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			LessonModelImpl.UUID_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the lessons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!Validator.equals(uuid, lesson.getUuid())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByUuid_First(uuid, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByUuid_Last(uuid, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where uuid = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findByUuid_PrevAndNext(long lessonId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getByUuid_PrevAndNext(session, lesson, uuid,
					orderByComparator, true);

			array[1] = lesson;

			array[2] = getByUuid_PrevAndNext(session, lesson, uuid,
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

	protected Lesson getByUuid_PrevAndNext(Session session, Lesson lesson,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (Lesson lesson : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "lesson.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "lesson.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(lesson.uuid IS NULL OR lesson.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			LessonModelImpl.UUID_COLUMN_BITMASK |
			LessonModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the lesson where uuid = &#63; and groupId = &#63; or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByUUID_G(String uuid, long groupId)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByUUID_G(uuid, groupId);

		if (lesson == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchLessonException(msg.toString());
		}

		return lesson;
	}

	/**
	 * Returns the lesson where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the lesson where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Lesson) {
			Lesson lesson = (Lesson)result;

			if (!Validator.equals(uuid, lesson.getUuid()) ||
					(groupId != lesson.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Lesson> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Lesson lesson = list.get(0);

					result = lesson;

					cacheResult(lesson);

					if ((lesson.getUuid() == null) ||
							!lesson.getUuid().equals(uuid) ||
							(lesson.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, lesson);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
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
			return (Lesson)result;
		}
	}

	/**
	 * Removes the lesson where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lesson that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson removeByUUID_G(String uuid, long groupId)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByUUID_G(uuid, groupId);

		return remove(lesson);
	}

	/**
	 * Returns the number of lessons where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "lesson.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "lesson.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(lesson.uuid IS NULL OR lesson.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "lesson.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			LessonModelImpl.UUID_COLUMN_BITMASK |
			LessonModelImpl.COMPANYID_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the lessons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!Validator.equals(uuid, lesson.getUuid()) ||
						(companyId != lesson.getCompanyId())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findByUuid_C_PrevAndNext(long lessonId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, lesson, uuid,
					companyId, orderByComparator, true);

			array[1] = lesson;

			array[2] = getByUuid_C_PrevAndNext(session, lesson, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getByUuid_C_PrevAndNext(Session session, Lesson lesson,
		String uuid, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (Lesson lesson : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "lesson.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "lesson.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(lesson.uuid IS NULL OR lesson.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "lesson.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONNAMECOLLECTION =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonNameCollection",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMECOLLECTION =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonNameCollection",
			new String[] { String.class.getName() },
			LessonModelImpl.LESSONNAME_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONNAMECOLLECTION = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonNameCollection",
			new String[] { String.class.getName() });

	/**
	 * Returns all the lessons where lessonName = &#63;.
	 *
	 * @param lessonName the lesson name
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonNameCollection(String lessonName)
		throws SystemException {
		return findBylessonNameCollection(lessonName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where lessonName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonName the lesson name
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonNameCollection(String lessonName,
		int start, int end) throws SystemException {
		return findBylessonNameCollection(lessonName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where lessonName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonName the lesson name
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonNameCollection(String lessonName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMECOLLECTION;
			finderArgs = new Object[] { lessonName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONNAMECOLLECTION;
			finderArgs = new Object[] { lessonName, start, end, orderByComparator };
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!Validator.equals(lessonName, lesson.getLessonName())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindLessonName = false;

			if (lessonName == null) {
				query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_1);
			}
			else if (lessonName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_3);
			}
			else {
				bindLessonName = true;

				query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLessonName) {
					qPos.add(lessonName);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where lessonName = &#63;.
	 *
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonNameCollection_First(String lessonName,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonNameCollection_First(lessonName,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonName=");
		msg.append(lessonName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where lessonName = &#63;.
	 *
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonNameCollection_First(String lessonName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findBylessonNameCollection(lessonName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where lessonName = &#63;.
	 *
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonNameCollection_Last(String lessonName,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonNameCollection_Last(lessonName,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonName=");
		msg.append(lessonName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where lessonName = &#63;.
	 *
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonNameCollection_Last(String lessonName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessonNameCollection(lessonName);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findBylessonNameCollection(lessonName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where lessonName = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findBylessonNameCollection_PrevAndNext(long lessonId,
		String lessonName, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getBylessonNameCollection_PrevAndNext(session, lesson,
					lessonName, orderByComparator, true);

			array[1] = lesson;

			array[2] = getBylessonNameCollection_PrevAndNext(session, lesson,
					lessonName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getBylessonNameCollection_PrevAndNext(Session session,
		Lesson lesson, String lessonName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		boolean bindLessonName = false;

		if (lessonName == null) {
			query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_1);
		}
		else if (lessonName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_3);
		}
		else {
			bindLessonName = true;

			query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLessonName) {
			qPos.add(lessonName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where lessonName = &#63; from the database.
	 *
	 * @param lessonName the lesson name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonNameCollection(String lessonName)
		throws SystemException {
		for (Lesson lesson : findBylessonNameCollection(lessonName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where lessonName = &#63;.
	 *
	 * @param lessonName the lesson name
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonNameCollection(String lessonName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONNAMECOLLECTION;

		Object[] finderArgs = new Object[] { lessonName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindLessonName = false;

			if (lessonName == null) {
				query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_1);
			}
			else if (lessonName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_3);
			}
			else {
				bindLessonName = true;

				query.append(_FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLessonName) {
					qPos.add(lessonName);
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

	private static final String _FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_1 =
		"lesson.lessonName IS NULL";
	private static final String _FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_2 =
		"lesson.lessonName = ?";
	private static final String _FINDER_COLUMN_LESSONNAMECOLLECTION_LESSONNAME_3 =
		"(lesson.lessonName IS NULL OR lesson.lessonName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSMARKEDAS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLessonsMarkedAs",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSMARKEDAS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLessonsMarkedAs",
			new String[] { String.class.getName() },
			LessonModelImpl.MARKEDAS_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONSMARKEDAS = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLessonsMarkedAs", new String[] { String.class.getName() });

	/**
	 * Returns all the lessons where markedAs = &#63;.
	 *
	 * @param markedAs the marked as
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByLessonsMarkedAs(String markedAs)
		throws SystemException {
		return findByLessonsMarkedAs(markedAs, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where markedAs = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param markedAs the marked as
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByLessonsMarkedAs(String markedAs, int start,
		int end) throws SystemException {
		return findByLessonsMarkedAs(markedAs, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where markedAs = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param markedAs the marked as
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByLessonsMarkedAs(String markedAs, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSMARKEDAS;
			finderArgs = new Object[] { markedAs };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSMARKEDAS;
			finderArgs = new Object[] { markedAs, start, end, orderByComparator };
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!Validator.equals(markedAs, lesson.getMarkedAs())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindMarkedAs = false;

			if (markedAs == null) {
				query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_1);
			}
			else if (markedAs.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_3);
			}
			else {
				bindMarkedAs = true;

				query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMarkedAs) {
					qPos.add(markedAs);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where markedAs = &#63;.
	 *
	 * @param markedAs the marked as
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByLessonsMarkedAs_First(String markedAs,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByLessonsMarkedAs_First(markedAs, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("markedAs=");
		msg.append(markedAs);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where markedAs = &#63;.
	 *
	 * @param markedAs the marked as
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByLessonsMarkedAs_First(String markedAs,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findByLessonsMarkedAs(markedAs, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where markedAs = &#63;.
	 *
	 * @param markedAs the marked as
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByLessonsMarkedAs_Last(String markedAs,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByLessonsMarkedAs_Last(markedAs, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("markedAs=");
		msg.append(markedAs);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where markedAs = &#63;.
	 *
	 * @param markedAs the marked as
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByLessonsMarkedAs_Last(String markedAs,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLessonsMarkedAs(markedAs);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findByLessonsMarkedAs(markedAs, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where markedAs = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param markedAs the marked as
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findByLessonsMarkedAs_PrevAndNext(long lessonId,
		String markedAs, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getByLessonsMarkedAs_PrevAndNext(session, lesson,
					markedAs, orderByComparator, true);

			array[1] = lesson;

			array[2] = getByLessonsMarkedAs_PrevAndNext(session, lesson,
					markedAs, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getByLessonsMarkedAs_PrevAndNext(Session session,
		Lesson lesson, String markedAs, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		boolean bindMarkedAs = false;

		if (markedAs == null) {
			query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_1);
		}
		else if (markedAs.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_3);
		}
		else {
			bindMarkedAs = true;

			query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMarkedAs) {
			qPos.add(markedAs);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where markedAs = &#63; from the database.
	 *
	 * @param markedAs the marked as
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLessonsMarkedAs(String markedAs)
		throws SystemException {
		for (Lesson lesson : findByLessonsMarkedAs(markedAs, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where markedAs = &#63;.
	 *
	 * @param markedAs the marked as
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLessonsMarkedAs(String markedAs)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONSMARKEDAS;

		Object[] finderArgs = new Object[] { markedAs };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindMarkedAs = false;

			if (markedAs == null) {
				query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_1);
			}
			else if (markedAs.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_3);
			}
			else {
				bindMarkedAs = true;

				query.append(_FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMarkedAs) {
					qPos.add(markedAs);
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

	private static final String _FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_1 = "lesson.markedAs IS NULL";
	private static final String _FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_2 = "lesson.markedAs = ?";
	private static final String _FINDER_COLUMN_LESSONSMARKEDAS_MARKEDAS_3 = "(lesson.markedAs IS NULL OR lesson.markedAs = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_STATUS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylessons_status",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_STATUS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBylessons_status",
			new String[] { String.class.getName() },
			LessonModelImpl.STATUS_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONS_STATUS = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylessons_status",
			new String[] { String.class.getName() });

	/**
	 * Returns all the lessons where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_status(String status)
		throws SystemException {
		return findBylessons_status(status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_status(String status, int start, int end)
		throws SystemException {
		return findBylessons_status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_status(String status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!Validator.equals(status, lesson.getStatus())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessons_status_First(String status,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessons_status_First(status, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessons_status_First(String status,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findBylessons_status(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessons_status_Last(String status,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessons_status_Last(status, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessons_status_Last(String status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessons_status(status);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findBylessons_status(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where status = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findBylessons_status_PrevAndNext(long lessonId,
		String status, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getBylessons_status_PrevAndNext(session, lesson, status,
					orderByComparator, true);

			array[1] = lesson;

			array[2] = getBylessons_status_PrevAndNext(session, lesson, status,
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

	protected Lesson getBylessons_status_PrevAndNext(Session session,
		Lesson lesson, String status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where status = &#63; from the database.
	 *
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessons_status(String status) throws SystemException {
		for (Lesson lesson : findBylessons_status(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessons_status(String status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONS_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_LESSONS_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
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

	private static final String _FINDER_COLUMN_LESSONS_STATUS_STATUS_1 = "lesson.status IS NULL";
	private static final String _FINDER_COLUMN_LESSONS_STATUS_STATUS_2 = "lesson.status = ?";
	private static final String _FINDER_COLUMN_LESSONS_STATUS_STATUS_3 = "(lesson.status IS NULL OR lesson.status = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_PRIVACY =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylessons_privacy",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_PRIVACY =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBylessons_privacy",
			new String[] { String.class.getName() },
			LessonModelImpl.LESSONPRIVACY_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONS_PRIVACY = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessons_privacy", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_LESSONS_PRIVACY =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countBylessons_privacy",
			new String[] { String.class.getName() });

	/**
	 * Returns all the lessons where lessonPrivacy = &#63;.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_privacy(String lessonPrivacy)
		throws SystemException {
		return findBylessons_privacy(lessonPrivacy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where lessonPrivacy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_privacy(String lessonPrivacy, int start,
		int end) throws SystemException {
		return findBylessons_privacy(lessonPrivacy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where lessonPrivacy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_privacy(String lessonPrivacy, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_PRIVACY;
			finderArgs = new Object[] { lessonPrivacy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_PRIVACY;
			finderArgs = new Object[] {
					lessonPrivacy,
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!Validator.equals(lessonPrivacy, lesson.getLessonPrivacy())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean bindLessonPrivacy = false;

			if (lessonPrivacy == null) {
				query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_1);
			}
			else if (lessonPrivacy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_3);
			}
			else {
				bindLessonPrivacy = true;

				query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLessonPrivacy) {
					qPos.add(lessonPrivacy);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where lessonPrivacy = &#63;.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessons_privacy_First(String lessonPrivacy,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessons_privacy_First(lessonPrivacy,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonPrivacy=");
		msg.append(lessonPrivacy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where lessonPrivacy = &#63;.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessons_privacy_First(String lessonPrivacy,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findBylessons_privacy(lessonPrivacy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where lessonPrivacy = &#63;.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessons_privacy_Last(String lessonPrivacy,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessons_privacy_Last(lessonPrivacy,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonPrivacy=");
		msg.append(lessonPrivacy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where lessonPrivacy = &#63;.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessons_privacy_Last(String lessonPrivacy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessons_privacy(lessonPrivacy);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findBylessons_privacy(lessonPrivacy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where lessonPrivacy = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param lessonPrivacy the lesson privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findBylessons_privacy_PrevAndNext(long lessonId,
		String lessonPrivacy, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getBylessons_privacy_PrevAndNext(session, lesson,
					lessonPrivacy, orderByComparator, true);

			array[1] = lesson;

			array[2] = getBylessons_privacy_PrevAndNext(session, lesson,
					lessonPrivacy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getBylessons_privacy_PrevAndNext(Session session,
		Lesson lesson, String lessonPrivacy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		boolean bindLessonPrivacy = false;

		if (lessonPrivacy == null) {
			query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_1);
		}
		else if (lessonPrivacy.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_3);
		}
		else {
			bindLessonPrivacy = true;

			query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLessonPrivacy) {
			qPos.add(lessonPrivacy);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the lessons where lessonPrivacy = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonPrivacies the lesson privacies
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_privacy(String[] lessonPrivacies)
		throws SystemException {
		return findBylessons_privacy(lessonPrivacies, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where lessonPrivacy = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonPrivacies the lesson privacies
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_privacy(String[] lessonPrivacies,
		int start, int end) throws SystemException {
		return findBylessons_privacy(lessonPrivacies, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where lessonPrivacy = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonPrivacies the lesson privacies
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessons_privacy(String[] lessonPrivacies,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if ((lessonPrivacies != null) && (lessonPrivacies.length == 1)) {
			return findBylessons_privacy(lessonPrivacies[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(lessonPrivacies) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(lessonPrivacies),
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_PRIVACY,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if (!ArrayUtil.contains(lessonPrivacies,
							lesson.getLessonPrivacy())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_LESSON_WHERE);

			boolean conjunctionable = false;

			if ((lessonPrivacies == null) || (lessonPrivacies.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < lessonPrivacies.length; i++) {
					String lessonPrivacy = lessonPrivacies[i];

					if (lessonPrivacy == null) {
						query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_4);
					}
					else if (lessonPrivacy.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_6);
					}
					else {
						query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_5);
					}

					if ((i + 1) < lessonPrivacies.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append("lesson.status='published'");

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (lessonPrivacies != null) {
					qPos.add(lessonPrivacies);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_PRIVACY,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONS_PRIVACY,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the lessons where lessonPrivacy = &#63; from the database.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessons_privacy(String lessonPrivacy)
		throws SystemException {
		for (Lesson lesson : findBylessons_privacy(lessonPrivacy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where lessonPrivacy = &#63;.
	 *
	 * @param lessonPrivacy the lesson privacy
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessons_privacy(String lessonPrivacy)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONS_PRIVACY;

		Object[] finderArgs = new Object[] { lessonPrivacy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean bindLessonPrivacy = false;

			if (lessonPrivacy == null) {
				query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_1);
			}
			else if (lessonPrivacy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_3);
			}
			else {
				bindLessonPrivacy = true;

				query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLessonPrivacy) {
					qPos.add(lessonPrivacy);
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

	/**
	 * Returns the number of lessons where lessonPrivacy = any &#63;.
	 *
	 * @param lessonPrivacies the lesson privacies
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessons_privacy(String[] lessonPrivacies)
		throws SystemException {
		Object[] finderArgs = new Object[] { StringUtil.merge(lessonPrivacies) };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_LESSONS_PRIVACY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_LESSON_WHERE);

			boolean conjunctionable = false;

			if ((lessonPrivacies == null) || (lessonPrivacies.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < lessonPrivacies.length; i++) {
					String lessonPrivacy = lessonPrivacies[i];

					if (lessonPrivacy == null) {
						query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_4);
					}
					else if (lessonPrivacy.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_6);
					}
					else {
						query.append(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_5);
					}

					if ((i + 1) < lessonPrivacies.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append("lesson.status='published'");

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (lessonPrivacies != null) {
					qPos.add(lessonPrivacies);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_LESSONS_PRIVACY,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_LESSONS_PRIVACY,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_1 = "lesson.lessonPrivacy IS NULL AND lesson.status='published'";
	private static final String _FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_2 = "lesson.lessonPrivacy = ? AND lesson.status='published'";
	private static final String _FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_3 = "(lesson.lessonPrivacy IS NULL OR lesson.lessonPrivacy = '') AND lesson.status='published'";
	private static final String _FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_4 = "(" +
		removeConjunction(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_1) +
		")";
	private static final String _FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_5 = "(" +
		removeConjunction(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_2) +
		")";
	private static final String _FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_6 = "(" +
		removeConjunction(_FINDER_COLUMN_LESSONS_PRIVACY_LESSONPRIVACY_3) +
		")";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonNameWithCompanyId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonNameWithCompanyId",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonModelImpl.COMPANYID_COLUMN_BITMASK |
			LessonModelImpl.LESSONNAME_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONNAMEWITHCOMPANYID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonNameWithCompanyId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lessons where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonNameWithCompanyId(long companyId,
		String lessonName) throws SystemException {
		return findBylessonNameWithCompanyId(companyId, lessonName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where companyId = &#63; and lessonName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonNameWithCompanyId(long companyId,
		String lessonName, int start, int end) throws SystemException {
		return findBylessonNameWithCompanyId(companyId, lessonName, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the lessons where companyId = &#63; and lessonName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonNameWithCompanyId(long companyId,
		String lessonName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID;
			finderArgs = new Object[] { companyId, lessonName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID;
			finderArgs = new Object[] {
					companyId, lessonName,
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if ((companyId != lesson.getCompanyId()) ||
						!Validator.equals(lessonName, lesson.getLessonName())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_COMPANYID_2);

			boolean bindLessonName = false;

			if (lessonName == null) {
				query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_1);
			}
			else if (lessonName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_3);
			}
			else {
				bindLessonName = true;

				query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindLessonName) {
					qPos.add(lessonName);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonNameWithCompanyId_First(long companyId,
		String lessonName, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonNameWithCompanyId_First(companyId,
				lessonName, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", lessonName=");
		msg.append(lessonName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonNameWithCompanyId_First(long companyId,
		String lessonName, OrderByComparator orderByComparator)
		throws SystemException {
		List<Lesson> list = findBylessonNameWithCompanyId(companyId,
				lessonName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonNameWithCompanyId_Last(long companyId,
		String lessonName, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonNameWithCompanyId_Last(companyId,
				lessonName, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", lessonName=");
		msg.append(lessonName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonNameWithCompanyId_Last(long companyId,
		String lessonName, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBylessonNameWithCompanyId(companyId, lessonName);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findBylessonNameWithCompanyId(companyId,
				lessonName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findBylessonNameWithCompanyId_PrevAndNext(long lessonId,
		long companyId, String lessonName, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getBylessonNameWithCompanyId_PrevAndNext(session,
					lesson, companyId, lessonName, orderByComparator, true);

			array[1] = lesson;

			array[2] = getBylessonNameWithCompanyId_PrevAndNext(session,
					lesson, companyId, lessonName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getBylessonNameWithCompanyId_PrevAndNext(Session session,
		Lesson lesson, long companyId, String lessonName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_COMPANYID_2);

		boolean bindLessonName = false;

		if (lessonName == null) {
			query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_1);
		}
		else if (lessonName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_3);
		}
		else {
			bindLessonName = true;

			query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (bindLessonName) {
			qPos.add(lessonName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where companyId = &#63; and lessonName = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonNameWithCompanyId(long companyId,
		String lessonName) throws SystemException {
		for (Lesson lesson : findBylessonNameWithCompanyId(companyId,
				lessonName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where companyId = &#63; and lessonName = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonName the lesson name
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonNameWithCompanyId(long companyId, String lessonName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONNAMEWITHCOMPANYID;

		Object[] finderArgs = new Object[] { companyId, lessonName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_COMPANYID_2);

			boolean bindLessonName = false;

			if (lessonName == null) {
				query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_1);
			}
			else if (lessonName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_3);
			}
			else {
				bindLessonName = true;

				query.append(_FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (bindLessonName) {
					qPos.add(lessonName);
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

	private static final String _FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_COMPANYID_2 =
		"lesson.companyId = ? AND ";
	private static final String _FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_1 =
		"lesson.lessonName IS NULL";
	private static final String _FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_2 =
		"lesson.lessonName = ?";
	private static final String _FINDER_COLUMN_LESSONNAMEWITHCOMPANYID_LESSONNAME_3 =
		"(lesson.lessonName IS NULL OR lesson.lessonName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonsUploadedByAuthor",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonsUploadedByAuthor",
			new String[] { Long.class.getName() },
			LessonModelImpl.CURRENTAUTHOR_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHOR = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonsUploadedByAuthor",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lessons where currentAuthor = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonsUploadedByAuthor(long currentAuthor)
		throws SystemException {
		return findBylessonsUploadedByAuthor(currentAuthor, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where currentAuthor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param currentAuthor the current author
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonsUploadedByAuthor(long currentAuthor,
		int start, int end) throws SystemException {
		return findBylessonsUploadedByAuthor(currentAuthor, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where currentAuthor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param currentAuthor the current author
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonsUploadedByAuthor(long currentAuthor,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR;
			finderArgs = new Object[] { currentAuthor };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR;
			finderArgs = new Object[] {
					currentAuthor,
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if ((currentAuthor != lesson.getCurrentAuthor())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHOR_CURRENTAUTHOR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(currentAuthor);

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where currentAuthor = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonsUploadedByAuthor_First(long currentAuthor,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonsUploadedByAuthor_First(currentAuthor,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("currentAuthor=");
		msg.append(currentAuthor);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where currentAuthor = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonsUploadedByAuthor_First(long currentAuthor,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findBylessonsUploadedByAuthor(currentAuthor, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where currentAuthor = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonsUploadedByAuthor_Last(long currentAuthor,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonsUploadedByAuthor_Last(currentAuthor,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("currentAuthor=");
		msg.append(currentAuthor);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where currentAuthor = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonsUploadedByAuthor_Last(long currentAuthor,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessonsUploadedByAuthor(currentAuthor);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findBylessonsUploadedByAuthor(currentAuthor,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where currentAuthor = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param currentAuthor the current author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findBylessonsUploadedByAuthor_PrevAndNext(long lessonId,
		long currentAuthor, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getBylessonsUploadedByAuthor_PrevAndNext(session,
					lesson, currentAuthor, orderByComparator, true);

			array[1] = lesson;

			array[2] = getBylessonsUploadedByAuthor_PrevAndNext(session,
					lesson, currentAuthor, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getBylessonsUploadedByAuthor_PrevAndNext(Session session,
		Lesson lesson, long currentAuthor, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHOR_CURRENTAUTHOR_2);

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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(currentAuthor);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where currentAuthor = &#63; from the database.
	 *
	 * @param currentAuthor the current author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonsUploadedByAuthor(long currentAuthor)
		throws SystemException {
		for (Lesson lesson : findBylessonsUploadedByAuthor(currentAuthor,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where currentAuthor = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonsUploadedByAuthor(long currentAuthor)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHOR;

		Object[] finderArgs = new Object[] { currentAuthor };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHOR_CURRENTAUTHOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(currentAuthor);

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

	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHOR_CURRENTAUTHOR_2 =
		"lesson.currentAuthor = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonsUploadedByAuthorAndStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonsUploadedByAuthorAndStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			LessonModelImpl.CURRENTAUTHOR_COLUMN_BITMASK |
			LessonModelImpl.STATUS_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonsUploadedByAuthorAndStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the lessons where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, String status) throws SystemException {
		return findBylessonsUploadedByAuthorAndStatus(currentAuthor, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where currentAuthor = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, String status, int start, int end)
		throws SystemException {
		return findBylessonsUploadedByAuthorAndStatus(currentAuthor, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where currentAuthor = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, String status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS;
			finderArgs = new Object[] { currentAuthor, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS;
			finderArgs = new Object[] {
					currentAuthor, status,
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if ((currentAuthor != lesson.getCurrentAuthor()) ||
						!Validator.equals(status, lesson.getStatus())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_CURRENTAUTHOR_2);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(currentAuthor);

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonsUploadedByAuthorAndStatus_First(
		long currentAuthor, String status, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonsUploadedByAuthorAndStatus_First(currentAuthor,
				status, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("currentAuthor=");
		msg.append(currentAuthor);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonsUploadedByAuthorAndStatus_First(
		long currentAuthor, String status, OrderByComparator orderByComparator)
		throws SystemException {
		List<Lesson> list = findBylessonsUploadedByAuthorAndStatus(currentAuthor,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonsUploadedByAuthorAndStatus_Last(
		long currentAuthor, String status, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonsUploadedByAuthorAndStatus_Last(currentAuthor,
				status, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("currentAuthor=");
		msg.append(currentAuthor);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonsUploadedByAuthorAndStatus_Last(
		long currentAuthor, String status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBylessonsUploadedByAuthorAndStatus(currentAuthor,
				status);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findBylessonsUploadedByAuthorAndStatus(currentAuthor,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param currentAuthor the current author
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findBylessonsUploadedByAuthorAndStatus_PrevAndNext(
		long lessonId, long currentAuthor, String status,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getBylessonsUploadedByAuthorAndStatus_PrevAndNext(session,
					lesson, currentAuthor, status, orderByComparator, true);

			array[1] = lesson;

			array[2] = getBylessonsUploadedByAuthorAndStatus_PrevAndNext(session,
					lesson, currentAuthor, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getBylessonsUploadedByAuthorAndStatus_PrevAndNext(
		Session session, Lesson lesson, long currentAuthor, String status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_CURRENTAUTHOR_2);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_2);
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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(currentAuthor);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where currentAuthor = &#63; and status = &#63; from the database.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonsUploadedByAuthorAndStatus(long currentAuthor,
		String status) throws SystemException {
		for (Lesson lesson : findBylessonsUploadedByAuthorAndStatus(
				currentAuthor, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where currentAuthor = &#63; and status = &#63;.
	 *
	 * @param currentAuthor the current author
	 * @param status the status
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonsUploadedByAuthorAndStatus(long currentAuthor,
		String status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS;

		Object[] finderArgs = new Object[] { currentAuthor, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_CURRENTAUTHOR_2);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(currentAuthor);

				if (bindStatus) {
					qPos.add(status);
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

	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_CURRENTAUTHOR_2 =
		"lesson.currentAuthor = ? AND ";
	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_1 =
		"lesson.status IS NULL";
	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_2 =
		"lesson.status = ?";
	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORANDSTATUS_STATUS_3 =
		"(lesson.status IS NULL OR lesson.status = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_ENTITY,
			"fetchBylessonsUploadedByAuthorByLessonId",
			new String[] { Long.class.getName(), Long.class.getName() },
			LessonModelImpl.LESSONID_COLUMN_BITMASK |
			LessonModelImpl.CURRENTAUTHOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonsUploadedByAuthorByLessonId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	 *
	 * @param lessonId the lesson ID
	 * @param currentAuthor the current author
	 * @return the matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor) throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchBylessonsUploadedByAuthorByLessonId(lessonId,
				currentAuthor);

		if (lesson == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("lessonId=");
			msg.append(lessonId);

			msg.append(", currentAuthor=");
			msg.append(currentAuthor);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchLessonException(msg.toString());
		}

		return lesson;
	}

	/**
	 * Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param lessonId the lesson ID
	 * @param currentAuthor the current author
	 * @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor) throws SystemException {
		return fetchBylessonsUploadedByAuthorByLessonId(lessonId,
			currentAuthor, true);
	}

	/**
	 * Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param lessonId the lesson ID
	 * @param currentAuthor the current author
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { lessonId, currentAuthor };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
					finderArgs, this);
		}

		if (result instanceof Lesson) {
			Lesson lesson = (Lesson)result;

			if ((lessonId != lesson.getLessonId()) ||
					(currentAuthor != lesson.getCurrentAuthor())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORBYLESSONID_LESSONID_2);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORBYLESSONID_CURRENTAUTHOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				qPos.add(currentAuthor);

				List<Lesson> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"LessonPersistenceImpl.fetchBylessonsUploadedByAuthorByLessonId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Lesson lesson = list.get(0);

					result = lesson;

					cacheResult(lesson);

					if ((lesson.getLessonId() != lessonId) ||
							(lesson.getCurrentAuthor() != currentAuthor)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
							finderArgs, lesson);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
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
			return (Lesson)result;
		}
	}

	/**
	 * Removes the lesson where lessonId = &#63; and currentAuthor = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param currentAuthor the current author
	 * @return the lesson that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson removeBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor) throws NoSuchLessonException, SystemException {
		Lesson lesson = findBylessonsUploadedByAuthorByLessonId(lessonId,
				currentAuthor);

		return remove(lesson);
	}

	/**
	 * Returns the number of lessons where lessonId = &#63; and currentAuthor = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param currentAuthor the current author
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID;

		Object[] finderArgs = new Object[] { lessonId, currentAuthor };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORBYLESSONID_LESSONID_2);

			query.append(_FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORBYLESSONID_CURRENTAUTHOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				qPos.add(currentAuthor);

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

	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORBYLESSONID_LESSONID_2 =
		"lesson.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_LESSONSUPLOADEDBYAUTHORBYLESSONID_CURRENTAUTHOR_2 =
		"lesson.currentAuthor = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			LessonModelImpl.GROUPID_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lessons where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if ((groupId != lesson.getGroupId())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByGroupId_First(groupId, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByGroupId_Last(groupId, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where groupId = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findByGroupId_PrevAndNext(long lessonId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, lesson, groupId,
					orderByComparator, true);

			array[1] = lesson;

			array[2] = getByGroupId_PrevAndNext(session, lesson, groupId,
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

	protected Lesson getByGroupId_PrevAndNext(Session session, Lesson lesson,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (Lesson lesson : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "lesson.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			LessonModelImpl.COMPANYID_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lessons where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the lessons where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if ((companyId != lesson.getCompanyId())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByCompanyId_First(companyId, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByCompanyId_Last(companyId, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where companyId = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findByCompanyId_PrevAndNext(long lessonId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, lesson, companyId,
					orderByComparator, true);

			array[1] = lesson;

			array[2] = getByCompanyId_PrevAndNext(session, lesson, companyId,
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

	protected Lesson getByCompanyId_PrevAndNext(Session session, Lesson lesson,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Lesson lesson : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "lesson.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, LessonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() },
			LessonModelImpl.GROUPID_COLUMN_BITMASK |
			LessonModelImpl.LESSONSTATUS_COLUMN_BITMASK |
			LessonModelImpl.UPLOADEDTIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the lessons where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @return the matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByG_S(long groupId, int lessonStatus)
		throws SystemException {
		return findByG_S(groupId, lessonStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByG_S(long groupId, int lessonStatus, int start,
		int end) throws SystemException {
		return findByG_S(groupId, lessonStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findByG_S(long groupId, int lessonStatus, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] { groupId, lessonStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] {
					groupId, lessonStatus,
					
					start, end, orderByComparator
				};
		}

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson lesson : list) {
				if ((groupId != lesson.getGroupId()) ||
						(lessonStatus != lesson.getLessonStatus())) {
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

			query.append(_SQL_SELECT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_LESSONSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(lessonStatus);

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByG_S_First(long groupId, int lessonStatus,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByG_S_First(groupId, lessonStatus,
				orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", lessonStatus=");
		msg.append(lessonStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the first lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByG_S_First(long groupId, int lessonStatus,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson> list = findByG_S(groupId, lessonStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson
	 * @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByG_S_Last(long groupId, int lessonStatus,
		OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByG_S_Last(groupId, lessonStatus, orderByComparator);

		if (lesson != null) {
			return lesson;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", lessonStatus=");
		msg.append(lessonStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLessonException(msg.toString());
	}

	/**
	 * Returns the last lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByG_S_Last(long groupId, int lessonStatus,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_S(groupId, lessonStatus);

		if (count == 0) {
			return null;
		}

		List<Lesson> list = findByG_S(groupId, lessonStatus, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lessons before and after the current lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param lessonId the primary key of the current lesson
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson[] findByG_S_PrevAndNext(long lessonId, long groupId,
		int lessonStatus, OrderByComparator orderByComparator)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = findByPrimaryKey(lessonId);

		Session session = null;

		try {
			session = openSession();

			Lesson[] array = new LessonImpl[3];

			array[0] = getByG_S_PrevAndNext(session, lesson, groupId,
					lessonStatus, orderByComparator, true);

			array[1] = lesson;

			array[2] = getByG_S_PrevAndNext(session, lesson, groupId,
					lessonStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson getByG_S_PrevAndNext(Session session, Lesson lesson,
		long groupId, int lessonStatus, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_LESSONSTATUS_2);

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
			query.append(LessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(lessonStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lessons where groupId = &#63; and lessonStatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_S(long groupId, int lessonStatus)
		throws SystemException {
		for (Lesson lesson : findByG_S(groupId, lessonStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons where groupId = &#63; and lessonStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param lessonStatus the lesson status
	 * @return the number of matching lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_S(long groupId, int lessonStatus)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, lessonStatus };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LESSON_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_LESSONSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(lessonStatus);

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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "lesson.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_LESSONSTATUS_2 = "lesson.lessonStatus = ?";

	public LessonPersistenceImpl() {
		setModelClass(Lesson.class);
	}

	/**
	 * Caches the lesson in the entity cache if it is enabled.
	 *
	 * @param lesson the lesson
	 */
	@Override
	public void cacheResult(Lesson lesson) {
		EntityCacheUtil.putResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonImpl.class, lesson.getPrimaryKey(), lesson);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { lesson.getUuid(), lesson.getGroupId() }, lesson);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
			new Object[] { lesson.getLessonId(), lesson.getCurrentAuthor() },
			lesson);

		lesson.resetOriginalValues();
	}

	/**
	 * Caches the lessons in the entity cache if it is enabled.
	 *
	 * @param lessons the lessons
	 */
	@Override
	public void cacheResult(List<Lesson> lessons) {
		for (Lesson lesson : lessons) {
			if (EntityCacheUtil.getResult(
						LessonModelImpl.ENTITY_CACHE_ENABLED, LessonImpl.class,
						lesson.getPrimaryKey()) == null) {
				cacheResult(lesson);
			}
			else {
				lesson.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lessons.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LessonImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LessonImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lesson.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Lesson lesson) {
		EntityCacheUtil.removeResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonImpl.class, lesson.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(lesson);
	}

	@Override
	public void clearCache(List<Lesson> lessons) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Lesson lesson : lessons) {
			EntityCacheUtil.removeResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
				LessonImpl.class, lesson.getPrimaryKey());

			clearUniqueFindersCache(lesson);
		}
	}

	protected void cacheUniqueFindersCache(Lesson lesson) {
		if (lesson.isNew()) {
			Object[] args = new Object[] { lesson.getUuid(), lesson.getGroupId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, lesson);

			args = new Object[] { lesson.getLessonId(), lesson.getCurrentAuthor() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
				args, lesson);
		}
		else {
			LessonModelImpl lessonModelImpl = (LessonModelImpl)lesson;

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lesson.getUuid(), lesson.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					lesson);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lesson.getLessonId(), lesson.getCurrentAuthor()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
					args, lesson);
			}
		}
	}

	protected void clearUniqueFindersCache(Lesson lesson) {
		LessonModelImpl lessonModelImpl = (LessonModelImpl)lesson;

		Object[] args = new Object[] { lesson.getUuid(), lesson.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((lessonModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					lessonModelImpl.getOriginalUuid(),
					lessonModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { lesson.getLessonId(), lesson.getCurrentAuthor() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
			args);

		if ((lessonModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID.getColumnBitmask()) != 0) {
			args = new Object[] {
					lessonModelImpl.getOriginalLessonId(),
					lessonModelImpl.getOriginalCurrentAuthor()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_LESSONSUPLOADEDBYAUTHORBYLESSONID,
				args);
		}
	}

	/**
	 * Creates a new lesson with the primary key. Does not add the lesson to the database.
	 *
	 * @param lessonId the primary key for the new lesson
	 * @return the new lesson
	 */
	@Override
	public Lesson create(long lessonId) {
		Lesson lesson = new LessonImpl();

		lesson.setNew(true);
		lesson.setPrimaryKey(lessonId);

		String uuid = PortalUUIDUtil.generate();

		lesson.setUuid(uuid);

		return lesson;
	}

	/**
	 * Removes the lesson with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lessonId the primary key of the lesson
	 * @return the lesson that was removed
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson remove(long lessonId)
		throws NoSuchLessonException, SystemException {
		return remove((Serializable)lessonId);
	}

	/**
	 * Removes the lesson with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lesson
	 * @return the lesson that was removed
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson remove(Serializable primaryKey)
		throws NoSuchLessonException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Lesson lesson = (Lesson)session.get(LessonImpl.class, primaryKey);

			if (lesson == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLessonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lesson);
		}
		catch (NoSuchLessonException nsee) {
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
	protected Lesson removeImpl(Lesson lesson) throws SystemException {
		lesson = toUnwrappedModel(lesson);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lesson)) {
				lesson = (Lesson)session.get(LessonImpl.class,
						lesson.getPrimaryKeyObj());
			}

			if (lesson != null) {
				session.delete(lesson);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lesson != null) {
			clearCache(lesson);
		}

		return lesson;
	}

	@Override
	public Lesson updateImpl(com.nyu.model.Lesson lesson)
		throws SystemException {
		lesson = toUnwrappedModel(lesson);

		boolean isNew = lesson.isNew();

		LessonModelImpl lessonModelImpl = (LessonModelImpl)lesson;

		if (Validator.isNull(lesson.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			lesson.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (lesson.isNew()) {
				session.save(lesson);

				lesson.setNew(false);
			}
			else {
				session.merge(lesson);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LessonModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { lessonModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { lessonModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalUuid(),
						lessonModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						lessonModelImpl.getUuid(),
						lessonModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMECOLLECTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalLessonName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONNAMECOLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMECOLLECTION,
					args);

				args = new Object[] { lessonModelImpl.getLessonName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONNAMECOLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMECOLLECTION,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSMARKEDAS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalMarkedAs()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSMARKEDAS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSMARKEDAS,
					args);

				args = new Object[] { lessonModelImpl.getMarkedAs() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSMARKEDAS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSMARKEDAS,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { lessonModelImpl.getOriginalStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONS_STATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_STATUS,
					args);

				args = new Object[] { lessonModelImpl.getStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONS_STATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_STATUS,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_PRIVACY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalLessonPrivacy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONS_PRIVACY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_PRIVACY,
					args);

				args = new Object[] { lessonModelImpl.getLessonPrivacy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONS_PRIVACY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONS_PRIVACY,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalCompanyId(),
						lessonModelImpl.getOriginalLessonName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONNAMEWITHCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID,
					args);

				args = new Object[] {
						lessonModelImpl.getCompanyId(),
						lessonModelImpl.getLessonName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONNAMEWITHCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONNAMEWITHCOMPANYID,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalCurrentAuthor()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHOR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR,
					args);

				args = new Object[] { lessonModelImpl.getCurrentAuthor() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHOR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHOR,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalCurrentAuthor(),
						lessonModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS,
					args);

				args = new Object[] {
						lessonModelImpl.getCurrentAuthor(),
						lessonModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSUPLOADEDBYAUTHORANDSTATUS,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { lessonModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { lessonModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((lessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lessonModelImpl.getOriginalGroupId(),
						lessonModelImpl.getOriginalLessonStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);

				args = new Object[] {
						lessonModelImpl.getGroupId(),
						lessonModelImpl.getLessonStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);
			}
		}

		EntityCacheUtil.putResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
			LessonImpl.class, lesson.getPrimaryKey(), lesson);

		clearUniqueFindersCache(lesson);
		cacheUniqueFindersCache(lesson);

		return lesson;
	}

	protected Lesson toUnwrappedModel(Lesson lesson) {
		if (lesson instanceof LessonImpl) {
			return lesson;
		}

		LessonImpl lessonImpl = new LessonImpl();

		lessonImpl.setNew(lesson.isNew());
		lessonImpl.setPrimaryKey(lesson.getPrimaryKey());

		lessonImpl.setUuid(lesson.getUuid());
		lessonImpl.setLessonId(lesson.getLessonId());
		lessonImpl.setCompanyId(lesson.getCompanyId());
		lessonImpl.setGroupId(lesson.getGroupId());
		lessonImpl.setLessonName(lesson.getLessonName());
		lessonImpl.setDescription(lesson.getDescription());
		lessonImpl.setAuthor(lesson.getAuthor());
		lessonImpl.setCourseId(lesson.getCourseId());
		lessonImpl.setAppreciatedUserIds(lesson.getAppreciatedUserIds());
		lessonImpl.setAppreciateCount(lesson.getAppreciateCount());
		lessonImpl.setUploadedTime(lesson.getUploadedTime());
		lessonImpl.setUploadedById(lesson.getUploadedById());
		lessonImpl.setUploadedByName(lesson.getUploadedByName());
		lessonImpl.setLessonNote(lesson.getLessonNote());
		lessonImpl.setStatus(lesson.getStatus());
		lessonImpl.setRequestLessonId(lesson.getRequestLessonId());
		lessonImpl.setLessonPrivacy(lesson.getLessonPrivacy());
		lessonImpl.setFeatured(lesson.isFeatured());
		lessonImpl.setCreator(lesson.getCreator());
		lessonImpl.setSecondaryAuthor(lesson.getSecondaryAuthor());
		lessonImpl.setCreateDate(lesson.getCreateDate());
		lessonImpl.setCreateBy(lesson.getCreateBy());
		lessonImpl.setUpdatedDate(lesson.getUpdatedDate());
		lessonImpl.setUpdatedBy(lesson.getUpdatedBy());
		lessonImpl.setPermission(lesson.getPermission());
		lessonImpl.setMarkedAs(lesson.getMarkedAs());
		lessonImpl.setMarkedBy(lesson.getMarkedBy());
		lessonImpl.setMarkedContent(lesson.getMarkedContent());
		lessonImpl.setCurrentAuthor(lesson.getCurrentAuthor());
		lessonImpl.setShareWithProfile(lesson.getShareWithProfile());
		lessonImpl.setPublishWithProfile(lesson.getPublishWithProfile());
		lessonImpl.setPublishedProfile(lesson.getPublishedProfile());
		lessonImpl.setVersion(lesson.getVersion());
		lessonImpl.setLessonStatus(lesson.getLessonStatus());
		lessonImpl.setStatusByUserId(lesson.getStatusByUserId());
		lessonImpl.setStatusDate(lesson.getStatusDate());

		return lessonImpl;
	}

	/**
	 * Returns the lesson with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson
	 * @return the lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLessonException, SystemException {
		Lesson lesson = fetchByPrimaryKey(primaryKey);

		if (lesson == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLessonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lesson;
	}

	/**
	 * Returns the lesson with the primary key or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	 *
	 * @param lessonId the primary key of the lesson
	 * @return the lesson
	 * @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson findByPrimaryKey(long lessonId)
		throws NoSuchLessonException, SystemException {
		return findByPrimaryKey((Serializable)lessonId);
	}

	/**
	 * Returns the lesson with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson
	 * @return the lesson, or <code>null</code> if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Lesson lesson = (Lesson)EntityCacheUtil.getResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
				LessonImpl.class, primaryKey);

		if (lesson == _nullLesson) {
			return null;
		}

		if (lesson == null) {
			Session session = null;

			try {
				session = openSession();

				lesson = (Lesson)session.get(LessonImpl.class, primaryKey);

				if (lesson != null) {
					cacheResult(lesson);
				}
				else {
					EntityCacheUtil.putResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
						LessonImpl.class, primaryKey, _nullLesson);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LessonModelImpl.ENTITY_CACHE_ENABLED,
					LessonImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lesson;
	}

	/**
	 * Returns the lesson with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lessonId the primary key of the lesson
	 * @return the lesson, or <code>null</code> if a lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson fetchByPrimaryKey(long lessonId) throws SystemException {
		return fetchByPrimaryKey((Serializable)lessonId);
	}

	/**
	 * Returns all the lessons.
	 *
	 * @return the lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lessons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @return the range of lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lessons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lessons
	 * @param end the upper bound of the range of lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson> findAll(int start, int end,
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

		List<Lesson> list = (List<Lesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LESSON);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LESSON;

				if (pagination) {
					sql = sql.concat(LessonModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson>(list);
				}
				else {
					list = (List<Lesson>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the lessons from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Lesson lesson : findAll()) {
			remove(lesson);
		}
	}

	/**
	 * Returns the number of lessons.
	 *
	 * @return the number of lessons
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

				Query q = session.createQuery(_SQL_COUNT_LESSON);

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
	 * Initializes the lesson persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.Lesson")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Lesson>> listenersList = new ArrayList<ModelListener<Lesson>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Lesson>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LessonImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LESSON = "SELECT lesson FROM Lesson lesson";
	private static final String _SQL_SELECT_LESSON_WHERE = "SELECT lesson FROM Lesson lesson WHERE ";
	private static final String _SQL_COUNT_LESSON = "SELECT COUNT(lesson) FROM Lesson lesson";
	private static final String _SQL_COUNT_LESSON_WHERE = "SELECT COUNT(lesson) FROM Lesson lesson WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lesson.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Lesson exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Lesson exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LessonPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "featured"
			});
	private static Lesson _nullLesson = new LessonImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Lesson> toCacheModel() {
				return _nullLessonCacheModel;
			}
		};

	private static CacheModel<Lesson> _nullLessonCacheModel = new CacheModel<Lesson>() {
			@Override
			public Lesson toEntityModel() {
				return _nullLesson;
			}
		};
}