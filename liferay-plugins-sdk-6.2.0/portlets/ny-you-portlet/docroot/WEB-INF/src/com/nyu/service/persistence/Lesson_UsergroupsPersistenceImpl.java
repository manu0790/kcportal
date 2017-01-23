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

import com.nyu.NoSuchLesson_UsergroupsException;

import com.nyu.model.Lesson_Usergroups;
import com.nyu.model.impl.Lesson_UsergroupsImpl;
import com.nyu.model.impl.Lesson_UsergroupsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the lesson_ usergroups service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson_UsergroupsPersistence
 * @see Lesson_UsergroupsUtil
 * @generated
 */
public class Lesson_UsergroupsPersistenceImpl extends BasePersistenceImpl<Lesson_Usergroups>
	implements Lesson_UsergroupsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Lesson_UsergroupsUtil} to access the lesson_ usergroups persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Lesson_UsergroupsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSBYGROUPID =
		new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylessonsByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBYGROUPID =
		new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonsByGroupId", new String[] { Long.class.getName() },
			Lesson_UsergroupsModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONSBYGROUPID = new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonsByGroupId", new String[] { Long.class.getName() });

	/**
	 * Returns all the lesson_ usergroupses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findBylessonsByGroupId(long groupId)
		throws SystemException {
		return findBylessonsByGroupId(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson_ usergroupses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lesson_ usergroupses
	 * @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	 * @return the range of matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findBylessonsByGroupId(long groupId,
		int start, int end) throws SystemException {
		return findBylessonsByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson_ usergroupses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lesson_ usergroupses
	 * @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findBylessonsByGroupId(long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBYGROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSBYGROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<Lesson_Usergroups> list = (List<Lesson_Usergroups>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson_Usergroups lesson_Usergroups : list) {
				if ((groupId != lesson_Usergroups.getGroupId())) {
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

			query.append(_SQL_SELECT_LESSON_USERGROUPS_WHERE);

			query.append(_FINDER_COLUMN_LESSONSBYGROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Lesson_UsergroupsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Lesson_Usergroups>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson_Usergroups>(list);
				}
				else {
					list = (List<Lesson_Usergroups>)QueryUtil.list(q,
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
	 * Returns the first lesson_ usergroups in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups findBylessonsByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = fetchBylessonsByGroupId_First(groupId,
				orderByComparator);

		if (lesson_Usergroups != null) {
			return lesson_Usergroups;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLesson_UsergroupsException(msg.toString());
	}

	/**
	 * Returns the first lesson_ usergroups in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups fetchBylessonsByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson_Usergroups> list = findBylessonsByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson_ usergroups in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups findBylessonsByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = fetchBylessonsByGroupId_Last(groupId,
				orderByComparator);

		if (lesson_Usergroups != null) {
			return lesson_Usergroups;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLesson_UsergroupsException(msg.toString());
	}

	/**
	 * Returns the last lesson_ usergroups in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups fetchBylessonsByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessonsByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Lesson_Usergroups> list = findBylessonsByGroupId(groupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson_ usergroupses before and after the current lesson_ usergroups in the ordered set where groupId = &#63;.
	 *
	 * @param lesson_UsergroupsPK the primary key of the current lesson_ usergroups
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups[] findBylessonsByGroupId_PrevAndNext(
		Lesson_UsergroupsPK lesson_UsergroupsPK, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = findByPrimaryKey(lesson_UsergroupsPK);

		Session session = null;

		try {
			session = openSession();

			Lesson_Usergroups[] array = new Lesson_UsergroupsImpl[3];

			array[0] = getBylessonsByGroupId_PrevAndNext(session,
					lesson_Usergroups, groupId, orderByComparator, true);

			array[1] = lesson_Usergroups;

			array[2] = getBylessonsByGroupId_PrevAndNext(session,
					lesson_Usergroups, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson_Usergroups getBylessonsByGroupId_PrevAndNext(
		Session session, Lesson_Usergroups lesson_Usergroups, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_USERGROUPS_WHERE);

		query.append(_FINDER_COLUMN_LESSONSBYGROUPID_GROUPID_2);

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
			query.append(Lesson_UsergroupsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson_Usergroups);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson_Usergroups> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson_ usergroupses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonsByGroupId(long groupId)
		throws SystemException {
		for (Lesson_Usergroups lesson_Usergroups : findBylessonsByGroupId(
				groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson_Usergroups);
		}
	}

	/**
	 * Returns the number of lesson_ usergroupses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonsByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONSBYGROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_USERGROUPS_WHERE);

			query.append(_FINDER_COLUMN_LESSONSBYGROUPID_GROUPID_2);

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

	private static final String _FINDER_COLUMN_LESSONSBYGROUPID_GROUPID_2 = "lesson_Usergroups.id.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPSBYLESSONID =
		new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupsByLessonId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPSBYLESSONID =
		new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygroupsByLessonId", new String[] { Long.class.getName() },
			Lesson_UsergroupsModelImpl.LESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPSBYLESSONID = new FinderPath(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygroupsByLessonId", new String[] { Long.class.getName() });

	/**
	 * Returns all the lesson_ usergroupses where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findBygroupsByLessonId(long lessonId)
		throws SystemException {
		return findBygroupsByLessonId(lessonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson_ usergroupses where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of lesson_ usergroupses
	 * @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	 * @return the range of matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findBygroupsByLessonId(long lessonId,
		int start, int end) throws SystemException {
		return findBygroupsByLessonId(lessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson_ usergroupses where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of lesson_ usergroupses
	 * @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findBygroupsByLessonId(long lessonId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPSBYLESSONID;
			finderArgs = new Object[] { lessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPSBYLESSONID;
			finderArgs = new Object[] { lessonId, start, end, orderByComparator };
		}

		List<Lesson_Usergroups> list = (List<Lesson_Usergroups>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Lesson_Usergroups lesson_Usergroups : list) {
				if ((lessonId != lesson_Usergroups.getLessonId())) {
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

			query.append(_SQL_SELECT_LESSON_USERGROUPS_WHERE);

			query.append(_FINDER_COLUMN_GROUPSBYLESSONID_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Lesson_UsergroupsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<Lesson_Usergroups>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson_Usergroups>(list);
				}
				else {
					list = (List<Lesson_Usergroups>)QueryUtil.list(q,
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
	 * Returns the first lesson_ usergroups in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups findBygroupsByLessonId_First(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = fetchBygroupsByLessonId_First(lessonId,
				orderByComparator);

		if (lesson_Usergroups != null) {
			return lesson_Usergroups;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLesson_UsergroupsException(msg.toString());
	}

	/**
	 * Returns the first lesson_ usergroups in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups fetchBygroupsByLessonId_First(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Lesson_Usergroups> list = findBygroupsByLessonId(lessonId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lesson_ usergroups in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups findBygroupsByLessonId_Last(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = fetchBygroupsByLessonId_Last(lessonId,
				orderByComparator);

		if (lesson_Usergroups != null) {
			return lesson_Usergroups;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLesson_UsergroupsException(msg.toString());
	}

	/**
	 * Returns the last lesson_ usergroups in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups fetchBygroupsByLessonId_Last(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBygroupsByLessonId(lessonId);

		if (count == 0) {
			return null;
		}

		List<Lesson_Usergroups> list = findBygroupsByLessonId(lessonId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lesson_ usergroupses before and after the current lesson_ usergroups in the ordered set where lessonId = &#63;.
	 *
	 * @param lesson_UsergroupsPK the primary key of the current lesson_ usergroups
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups[] findBygroupsByLessonId_PrevAndNext(
		Lesson_UsergroupsPK lesson_UsergroupsPK, long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = findByPrimaryKey(lesson_UsergroupsPK);

		Session session = null;

		try {
			session = openSession();

			Lesson_Usergroups[] array = new Lesson_UsergroupsImpl[3];

			array[0] = getBygroupsByLessonId_PrevAndNext(session,
					lesson_Usergroups, lessonId, orderByComparator, true);

			array[1] = lesson_Usergroups;

			array[2] = getBygroupsByLessonId_PrevAndNext(session,
					lesson_Usergroups, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Lesson_Usergroups getBygroupsByLessonId_PrevAndNext(
		Session session, Lesson_Usergroups lesson_Usergroups, long lessonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LESSON_USERGROUPS_WHERE);

		query.append(_FINDER_COLUMN_GROUPSBYLESSONID_LESSONID_2);

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
			query.append(Lesson_UsergroupsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lesson_Usergroups);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Lesson_Usergroups> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lesson_ usergroupses where lessonId = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygroupsByLessonId(long lessonId)
		throws SystemException {
		for (Lesson_Usergroups lesson_Usergroups : findBygroupsByLessonId(
				lessonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lesson_Usergroups);
		}
	}

	/**
	 * Returns the number of lesson_ usergroupses where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the number of matching lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygroupsByLessonId(long lessonId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPSBYLESSONID;

		Object[] finderArgs = new Object[] { lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LESSON_USERGROUPS_WHERE);

			query.append(_FINDER_COLUMN_GROUPSBYLESSONID_LESSONID_2);

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

	private static final String _FINDER_COLUMN_GROUPSBYLESSONID_LESSONID_2 = "lesson_Usergroups.id.lessonId = ?";

	public Lesson_UsergroupsPersistenceImpl() {
		setModelClass(Lesson_Usergroups.class);
	}

	/**
	 * Caches the lesson_ usergroups in the entity cache if it is enabled.
	 *
	 * @param lesson_Usergroups the lesson_ usergroups
	 */
	@Override
	public void cacheResult(Lesson_Usergroups lesson_Usergroups) {
		EntityCacheUtil.putResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class, lesson_Usergroups.getPrimaryKey(),
			lesson_Usergroups);

		lesson_Usergroups.resetOriginalValues();
	}

	/**
	 * Caches the lesson_ usergroupses in the entity cache if it is enabled.
	 *
	 * @param lesson_Usergroupses the lesson_ usergroupses
	 */
	@Override
	public void cacheResult(List<Lesson_Usergroups> lesson_Usergroupses) {
		for (Lesson_Usergroups lesson_Usergroups : lesson_Usergroupses) {
			if (EntityCacheUtil.getResult(
						Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
						Lesson_UsergroupsImpl.class,
						lesson_Usergroups.getPrimaryKey()) == null) {
				cacheResult(lesson_Usergroups);
			}
			else {
				lesson_Usergroups.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lesson_ usergroupses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Lesson_UsergroupsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Lesson_UsergroupsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lesson_ usergroups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Lesson_Usergroups lesson_Usergroups) {
		EntityCacheUtil.removeResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class, lesson_Usergroups.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Lesson_Usergroups> lesson_Usergroupses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Lesson_Usergroups lesson_Usergroups : lesson_Usergroupses) {
			EntityCacheUtil.removeResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
				Lesson_UsergroupsImpl.class, lesson_Usergroups.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lesson_ usergroups with the primary key. Does not add the lesson_ usergroups to the database.
	 *
	 * @param lesson_UsergroupsPK the primary key for the new lesson_ usergroups
	 * @return the new lesson_ usergroups
	 */
	@Override
	public Lesson_Usergroups create(Lesson_UsergroupsPK lesson_UsergroupsPK) {
		Lesson_Usergroups lesson_Usergroups = new Lesson_UsergroupsImpl();

		lesson_Usergroups.setNew(true);
		lesson_Usergroups.setPrimaryKey(lesson_UsergroupsPK);

		return lesson_Usergroups;
	}

	/**
	 * Removes the lesson_ usergroups with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	 * @return the lesson_ usergroups that was removed
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups remove(Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws NoSuchLesson_UsergroupsException, SystemException {
		return remove((Serializable)lesson_UsergroupsPK);
	}

	/**
	 * Removes the lesson_ usergroups with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lesson_ usergroups
	 * @return the lesson_ usergroups that was removed
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups remove(Serializable primaryKey)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Lesson_Usergroups lesson_Usergroups = (Lesson_Usergroups)session.get(Lesson_UsergroupsImpl.class,
					primaryKey);

			if (lesson_Usergroups == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLesson_UsergroupsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lesson_Usergroups);
		}
		catch (NoSuchLesson_UsergroupsException nsee) {
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
	protected Lesson_Usergroups removeImpl(Lesson_Usergroups lesson_Usergroups)
		throws SystemException {
		lesson_Usergroups = toUnwrappedModel(lesson_Usergroups);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lesson_Usergroups)) {
				lesson_Usergroups = (Lesson_Usergroups)session.get(Lesson_UsergroupsImpl.class,
						lesson_Usergroups.getPrimaryKeyObj());
			}

			if (lesson_Usergroups != null) {
				session.delete(lesson_Usergroups);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lesson_Usergroups != null) {
			clearCache(lesson_Usergroups);
		}

		return lesson_Usergroups;
	}

	@Override
	public Lesson_Usergroups updateImpl(
		com.nyu.model.Lesson_Usergroups lesson_Usergroups)
		throws SystemException {
		lesson_Usergroups = toUnwrappedModel(lesson_Usergroups);

		boolean isNew = lesson_Usergroups.isNew();

		Lesson_UsergroupsModelImpl lesson_UsergroupsModelImpl = (Lesson_UsergroupsModelImpl)lesson_Usergroups;

		Session session = null;

		try {
			session = openSession();

			if (lesson_Usergroups.isNew()) {
				session.save(lesson_Usergroups);

				lesson_Usergroups.setNew(false);
			}
			else {
				session.merge(lesson_Usergroups);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !Lesson_UsergroupsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lesson_UsergroupsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBYGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lesson_UsergroupsModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSBYGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBYGROUPID,
					args);

				args = new Object[] { lesson_UsergroupsModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSBYGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBYGROUPID,
					args);
			}

			if ((lesson_UsergroupsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPSBYLESSONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lesson_UsergroupsModelImpl.getOriginalLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPSBYLESSONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPSBYLESSONID,
					args);

				args = new Object[] { lesson_UsergroupsModelImpl.getLessonId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPSBYLESSONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPSBYLESSONID,
					args);
			}
		}

		EntityCacheUtil.putResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
			Lesson_UsergroupsImpl.class, lesson_Usergroups.getPrimaryKey(),
			lesson_Usergroups);

		return lesson_Usergroups;
	}

	protected Lesson_Usergroups toUnwrappedModel(
		Lesson_Usergroups lesson_Usergroups) {
		if (lesson_Usergroups instanceof Lesson_UsergroupsImpl) {
			return lesson_Usergroups;
		}

		Lesson_UsergroupsImpl lesson_UsergroupsImpl = new Lesson_UsergroupsImpl();

		lesson_UsergroupsImpl.setNew(lesson_Usergroups.isNew());
		lesson_UsergroupsImpl.setPrimaryKey(lesson_Usergroups.getPrimaryKey());

		lesson_UsergroupsImpl.setLessonId(lesson_Usergroups.getLessonId());
		lesson_UsergroupsImpl.setGroupId(lesson_Usergroups.getGroupId());

		return lesson_UsergroupsImpl;
	}

	/**
	 * Returns the lesson_ usergroups with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson_ usergroups
	 * @return the lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLesson_UsergroupsException, SystemException {
		Lesson_Usergroups lesson_Usergroups = fetchByPrimaryKey(primaryKey);

		if (lesson_Usergroups == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLesson_UsergroupsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lesson_Usergroups;
	}

	/**
	 * Returns the lesson_ usergroups with the primary key or throws a {@link com.nyu.NoSuchLesson_UsergroupsException} if it could not be found.
	 *
	 * @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	 * @return the lesson_ usergroups
	 * @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups findByPrimaryKey(
		Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws NoSuchLesson_UsergroupsException, SystemException {
		return findByPrimaryKey((Serializable)lesson_UsergroupsPK);
	}

	/**
	 * Returns the lesson_ usergroups with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lesson_ usergroups
	 * @return the lesson_ usergroups, or <code>null</code> if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Lesson_Usergroups lesson_Usergroups = (Lesson_Usergroups)EntityCacheUtil.getResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
				Lesson_UsergroupsImpl.class, primaryKey);

		if (lesson_Usergroups == _nullLesson_Usergroups) {
			return null;
		}

		if (lesson_Usergroups == null) {
			Session session = null;

			try {
				session = openSession();

				lesson_Usergroups = (Lesson_Usergroups)session.get(Lesson_UsergroupsImpl.class,
						primaryKey);

				if (lesson_Usergroups != null) {
					cacheResult(lesson_Usergroups);
				}
				else {
					EntityCacheUtil.putResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
						Lesson_UsergroupsImpl.class, primaryKey,
						_nullLesson_Usergroups);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Lesson_UsergroupsModelImpl.ENTITY_CACHE_ENABLED,
					Lesson_UsergroupsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lesson_Usergroups;
	}

	/**
	 * Returns the lesson_ usergroups with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	 * @return the lesson_ usergroups, or <code>null</code> if a lesson_ usergroups with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lesson_Usergroups fetchByPrimaryKey(
		Lesson_UsergroupsPK lesson_UsergroupsPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)lesson_UsergroupsPK);
	}

	/**
	 * Returns all the lesson_ usergroupses.
	 *
	 * @return the lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lesson_ usergroupses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lesson_ usergroupses
	 * @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	 * @return the range of lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lesson_ usergroupses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lesson_ usergroupses
	 * @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lesson_ usergroupses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lesson_Usergroups> findAll(int start, int end,
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

		List<Lesson_Usergroups> list = (List<Lesson_Usergroups>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LESSON_USERGROUPS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LESSON_USERGROUPS;

				if (pagination) {
					sql = sql.concat(Lesson_UsergroupsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Lesson_Usergroups>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lesson_Usergroups>(list);
				}
				else {
					list = (List<Lesson_Usergroups>)QueryUtil.list(q,
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
	 * Removes all the lesson_ usergroupses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Lesson_Usergroups lesson_Usergroups : findAll()) {
			remove(lesson_Usergroups);
		}
	}

	/**
	 * Returns the number of lesson_ usergroupses.
	 *
	 * @return the number of lesson_ usergroupses
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

				Query q = session.createQuery(_SQL_COUNT_LESSON_USERGROUPS);

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
	 * Initializes the lesson_ usergroups persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.Lesson_Usergroups")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Lesson_Usergroups>> listenersList = new ArrayList<ModelListener<Lesson_Usergroups>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Lesson_Usergroups>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Lesson_UsergroupsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LESSON_USERGROUPS = "SELECT lesson_Usergroups FROM Lesson_Usergroups lesson_Usergroups";
	private static final String _SQL_SELECT_LESSON_USERGROUPS_WHERE = "SELECT lesson_Usergroups FROM Lesson_Usergroups lesson_Usergroups WHERE ";
	private static final String _SQL_COUNT_LESSON_USERGROUPS = "SELECT COUNT(lesson_Usergroups) FROM Lesson_Usergroups lesson_Usergroups";
	private static final String _SQL_COUNT_LESSON_USERGROUPS_WHERE = "SELECT COUNT(lesson_Usergroups) FROM Lesson_Usergroups lesson_Usergroups WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lesson_Usergroups.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Lesson_Usergroups exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Lesson_Usergroups exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Lesson_UsergroupsPersistenceImpl.class);
	private static Lesson_Usergroups _nullLesson_Usergroups = new Lesson_UsergroupsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Lesson_Usergroups> toCacheModel() {
				return _nullLesson_UsergroupsCacheModel;
			}
		};

	private static CacheModel<Lesson_Usergroups> _nullLesson_UsergroupsCacheModel =
		new CacheModel<Lesson_Usergroups>() {
			@Override
			public Lesson_Usergroups toEntityModel() {
				return _nullLesson_Usergroups;
			}
		};
}