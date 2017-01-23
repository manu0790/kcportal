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
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchRequestLessonException;

import com.nyu.model.RequestLesson;
import com.nyu.model.impl.RequestLessonImpl;
import com.nyu.model.impl.RequestLessonModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the request lesson service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see RequestLessonPersistence
 * @see RequestLessonUtil
 * @generated
 */
public class RequestLessonPersistenceImpl extends BasePersistenceImpl<RequestLesson>
	implements RequestLessonPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RequestLessonUtil} to access the request lesson persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RequestLessonImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED,
			RequestLessonImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED,
			RequestLessonImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTLESSONS =
		new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED,
			RequestLessonImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByrequestLessons",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTLESSONS =
		new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED,
			RequestLessonImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByrequestLessons", new String[] { Long.class.getName() },
			RequestLessonModelImpl.COMPANYID_COLUMN_BITMASK |
			RequestLessonModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTLESSONS = new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrequestLessons",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the request lessons where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findByrequestLessons(long companyId)
		throws SystemException {
		return findByrequestLessons(companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the request lessons where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of request lessons
	 * @param end the upper bound of the range of request lessons (not inclusive)
	 * @return the range of matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findByrequestLessons(long companyId, int start,
		int end) throws SystemException {
		return findByrequestLessons(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the request lessons where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of request lessons
	 * @param end the upper bound of the range of request lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findByrequestLessons(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTLESSONS;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTLESSONS;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<RequestLesson> list = (List<RequestLesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RequestLesson requestLesson : list) {
				if ((companyId != requestLesson.getCompanyId())) {
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

			query.append(_SQL_SELECT_REQUESTLESSON_WHERE);

			query.append(_FINDER_COLUMN_REQUESTLESSONS_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RequestLessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<RequestLesson>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RequestLesson>(list);
				}
				else {
					list = (List<RequestLesson>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first request lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson findByrequestLessons_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = fetchByrequestLessons_First(companyId,
				orderByComparator);

		if (requestLesson != null) {
			return requestLesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRequestLessonException(msg.toString());
	}

	/**
	 * Returns the first request lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request lesson, or <code>null</code> if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson fetchByrequestLessons_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RequestLesson> list = findByrequestLessons(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last request lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson findByrequestLessons_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = fetchByrequestLessons_Last(companyId,
				orderByComparator);

		if (requestLesson != null) {
			return requestLesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRequestLessonException(msg.toString());
	}

	/**
	 * Returns the last request lesson in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request lesson, or <code>null</code> if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson fetchByrequestLessons_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByrequestLessons(companyId);

		if (count == 0) {
			return null;
		}

		List<RequestLesson> list = findByrequestLessons(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the request lessons before and after the current request lesson in the ordered set where companyId = &#63;.
	 *
	 * @param requestLessonId the primary key of the current request lesson
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson[] findByrequestLessons_PrevAndNext(
		long requestLessonId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = findByPrimaryKey(requestLessonId);

		Session session = null;

		try {
			session = openSession();

			RequestLesson[] array = new RequestLessonImpl[3];

			array[0] = getByrequestLessons_PrevAndNext(session, requestLesson,
					companyId, orderByComparator, true);

			array[1] = requestLesson;

			array[2] = getByrequestLessons_PrevAndNext(session, requestLesson,
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

	protected RequestLesson getByrequestLessons_PrevAndNext(Session session,
		RequestLesson requestLesson, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REQUESTLESSON_WHERE);

		query.append(_FINDER_COLUMN_REQUESTLESSONS_COMPANYID_2);

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
			query.append(RequestLessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(requestLesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RequestLesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the request lessons where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByrequestLessons(long companyId)
		throws SystemException {
		for (RequestLesson requestLesson : findByrequestLessons(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(requestLesson);
		}
	}

	/**
	 * Returns the number of request lessons where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByrequestLessons(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUESTLESSONS;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REQUESTLESSON_WHERE);

			query.append(_FINDER_COLUMN_REQUESTLESSONS_COMPANYID_2);

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

	private static final String _FINDER_COLUMN_REQUESTLESSONS_COMPANYID_2 = "requestLesson.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSBASEDONDATE =
		new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED,
			RequestLessonImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonsBasedOnDate",
			new String[] {
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBASEDONDATE =
		new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED,
			RequestLessonImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonsBasedOnDate", new String[] { Date.class.getName() },
			RequestLessonModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONSBASEDONDATE = new FinderPath(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonsBasedOnDate", new String[] { Date.class.getName() });

	/**
	 * Returns all the request lessons where createdDate = &#63;.
	 *
	 * @param createdDate the created date
	 * @return the matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findBylessonsBasedOnDate(Date createdDate)
		throws SystemException {
		return findBylessonsBasedOnDate(createdDate, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the request lessons where createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdDate the created date
	 * @param start the lower bound of the range of request lessons
	 * @param end the upper bound of the range of request lessons (not inclusive)
	 * @return the range of matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findBylessonsBasedOnDate(Date createdDate,
		int start, int end) throws SystemException {
		return findBylessonsBasedOnDate(createdDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the request lessons where createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdDate the created date
	 * @param start the lower bound of the range of request lessons
	 * @param end the upper bound of the range of request lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findBylessonsBasedOnDate(Date createdDate,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBASEDONDATE;
			finderArgs = new Object[] { createdDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONSBASEDONDATE;
			finderArgs = new Object[] { createdDate, start, end, orderByComparator };
		}

		List<RequestLesson> list = (List<RequestLesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RequestLesson requestLesson : list) {
				if (!Validator.equals(createdDate,
							requestLesson.getCreatedDate())) {
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

			query.append(_SQL_SELECT_REQUESTLESSON_WHERE);

			boolean bindCreatedDate = false;

			if (createdDate == null) {
				query.append(_FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_1);
			}
			else {
				bindCreatedDate = true;

				query.append(_FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RequestLessonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedDate) {
					qPos.add(CalendarUtil.getTimestamp(createdDate));
				}

				if (!pagination) {
					list = (List<RequestLesson>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RequestLesson>(list);
				}
				else {
					list = (List<RequestLesson>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first request lesson in the ordered set where createdDate = &#63;.
	 *
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson findBylessonsBasedOnDate_First(Date createdDate,
		OrderByComparator orderByComparator)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = fetchBylessonsBasedOnDate_First(createdDate,
				orderByComparator);

		if (requestLesson != null) {
			return requestLesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdDate=");
		msg.append(createdDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRequestLessonException(msg.toString());
	}

	/**
	 * Returns the first request lesson in the ordered set where createdDate = &#63;.
	 *
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request lesson, or <code>null</code> if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson fetchBylessonsBasedOnDate_First(Date createdDate,
		OrderByComparator orderByComparator) throws SystemException {
		List<RequestLesson> list = findBylessonsBasedOnDate(createdDate, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last request lesson in the ordered set where createdDate = &#63;.
	 *
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson findBylessonsBasedOnDate_Last(Date createdDate,
		OrderByComparator orderByComparator)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = fetchBylessonsBasedOnDate_Last(createdDate,
				orderByComparator);

		if (requestLesson != null) {
			return requestLesson;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdDate=");
		msg.append(createdDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRequestLessonException(msg.toString());
	}

	/**
	 * Returns the last request lesson in the ordered set where createdDate = &#63;.
	 *
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request lesson, or <code>null</code> if a matching request lesson could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson fetchBylessonsBasedOnDate_Last(Date createdDate,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessonsBasedOnDate(createdDate);

		if (count == 0) {
			return null;
		}

		List<RequestLesson> list = findBylessonsBasedOnDate(createdDate,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the request lessons before and after the current request lesson in the ordered set where createdDate = &#63;.
	 *
	 * @param requestLessonId the primary key of the current request lesson
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson[] findBylessonsBasedOnDate_PrevAndNext(
		long requestLessonId, Date createdDate,
		OrderByComparator orderByComparator)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = findByPrimaryKey(requestLessonId);

		Session session = null;

		try {
			session = openSession();

			RequestLesson[] array = new RequestLessonImpl[3];

			array[0] = getBylessonsBasedOnDate_PrevAndNext(session,
					requestLesson, createdDate, orderByComparator, true);

			array[1] = requestLesson;

			array[2] = getBylessonsBasedOnDate_PrevAndNext(session,
					requestLesson, createdDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RequestLesson getBylessonsBasedOnDate_PrevAndNext(
		Session session, RequestLesson requestLesson, Date createdDate,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REQUESTLESSON_WHERE);

		boolean bindCreatedDate = false;

		if (createdDate == null) {
			query.append(_FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_1);
		}
		else {
			bindCreatedDate = true;

			query.append(_FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_2);
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
			query.append(RequestLessonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCreatedDate) {
			qPos.add(CalendarUtil.getTimestamp(createdDate));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(requestLesson);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RequestLesson> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the request lessons where createdDate = &#63; from the database.
	 *
	 * @param createdDate the created date
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonsBasedOnDate(Date createdDate)
		throws SystemException {
		for (RequestLesson requestLesson : findBylessonsBasedOnDate(
				createdDate, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(requestLesson);
		}
	}

	/**
	 * Returns the number of request lessons where createdDate = &#63;.
	 *
	 * @param createdDate the created date
	 * @return the number of matching request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonsBasedOnDate(Date createdDate)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONSBASEDONDATE;

		Object[] finderArgs = new Object[] { createdDate };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REQUESTLESSON_WHERE);

			boolean bindCreatedDate = false;

			if (createdDate == null) {
				query.append(_FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_1);
			}
			else {
				bindCreatedDate = true;

				query.append(_FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedDate) {
					qPos.add(CalendarUtil.getTimestamp(createdDate));
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

	private static final String _FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_1 = "requestLesson.createdDate IS NULL";
	private static final String _FINDER_COLUMN_LESSONSBASEDONDATE_CREATEDDATE_2 = "requestLesson.createdDate = ?";

	public RequestLessonPersistenceImpl() {
		setModelClass(RequestLesson.class);
	}

	/**
	 * Caches the request lesson in the entity cache if it is enabled.
	 *
	 * @param requestLesson the request lesson
	 */
	@Override
	public void cacheResult(RequestLesson requestLesson) {
		EntityCacheUtil.putResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonImpl.class, requestLesson.getPrimaryKey(),
			requestLesson);

		requestLesson.resetOriginalValues();
	}

	/**
	 * Caches the request lessons in the entity cache if it is enabled.
	 *
	 * @param requestLessons the request lessons
	 */
	@Override
	public void cacheResult(List<RequestLesson> requestLessons) {
		for (RequestLesson requestLesson : requestLessons) {
			if (EntityCacheUtil.getResult(
						RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
						RequestLessonImpl.class, requestLesson.getPrimaryKey()) == null) {
				cacheResult(requestLesson);
			}
			else {
				requestLesson.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all request lessons.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RequestLessonImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RequestLessonImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the request lesson.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RequestLesson requestLesson) {
		EntityCacheUtil.removeResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonImpl.class, requestLesson.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RequestLesson> requestLessons) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RequestLesson requestLesson : requestLessons) {
			EntityCacheUtil.removeResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
				RequestLessonImpl.class, requestLesson.getPrimaryKey());
		}
	}

	/**
	 * Creates a new request lesson with the primary key. Does not add the request lesson to the database.
	 *
	 * @param requestLessonId the primary key for the new request lesson
	 * @return the new request lesson
	 */
	@Override
	public RequestLesson create(long requestLessonId) {
		RequestLesson requestLesson = new RequestLessonImpl();

		requestLesson.setNew(true);
		requestLesson.setPrimaryKey(requestLessonId);

		return requestLesson;
	}

	/**
	 * Removes the request lesson with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestLessonId the primary key of the request lesson
	 * @return the request lesson that was removed
	 * @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson remove(long requestLessonId)
		throws NoSuchRequestLessonException, SystemException {
		return remove((Serializable)requestLessonId);
	}

	/**
	 * Removes the request lesson with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the request lesson
	 * @return the request lesson that was removed
	 * @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson remove(Serializable primaryKey)
		throws NoSuchRequestLessonException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RequestLesson requestLesson = (RequestLesson)session.get(RequestLessonImpl.class,
					primaryKey);

			if (requestLesson == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRequestLessonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(requestLesson);
		}
		catch (NoSuchRequestLessonException nsee) {
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
	protected RequestLesson removeImpl(RequestLesson requestLesson)
		throws SystemException {
		requestLesson = toUnwrappedModel(requestLesson);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(requestLesson)) {
				requestLesson = (RequestLesson)session.get(RequestLessonImpl.class,
						requestLesson.getPrimaryKeyObj());
			}

			if (requestLesson != null) {
				session.delete(requestLesson);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (requestLesson != null) {
			clearCache(requestLesson);
		}

		return requestLesson;
	}

	@Override
	public RequestLesson updateImpl(com.nyu.model.RequestLesson requestLesson)
		throws SystemException {
		requestLesson = toUnwrappedModel(requestLesson);

		boolean isNew = requestLesson.isNew();

		RequestLessonModelImpl requestLessonModelImpl = (RequestLessonModelImpl)requestLesson;

		Session session = null;

		try {
			session = openSession();

			if (requestLesson.isNew()) {
				session.save(requestLesson);

				requestLesson.setNew(false);
			}
			else {
				session.merge(requestLesson);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RequestLessonModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((requestLessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTLESSONS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						requestLessonModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTLESSONS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTLESSONS,
					args);

				args = new Object[] { requestLessonModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTLESSONS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTLESSONS,
					args);
			}

			if ((requestLessonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBASEDONDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						requestLessonModelImpl.getOriginalCreatedDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSBASEDONDATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBASEDONDATE,
					args);

				args = new Object[] { requestLessonModelImpl.getCreatedDate() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONSBASEDONDATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONSBASEDONDATE,
					args);
			}
		}

		EntityCacheUtil.putResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
			RequestLessonImpl.class, requestLesson.getPrimaryKey(),
			requestLesson);

		return requestLesson;
	}

	protected RequestLesson toUnwrappedModel(RequestLesson requestLesson) {
		if (requestLesson instanceof RequestLessonImpl) {
			return requestLesson;
		}

		RequestLessonImpl requestLessonImpl = new RequestLessonImpl();

		requestLessonImpl.setNew(requestLesson.isNew());
		requestLessonImpl.setPrimaryKey(requestLesson.getPrimaryKey());

		requestLessonImpl.setRequestLessonId(requestLesson.getRequestLessonId());
		requestLessonImpl.setCompanyId(requestLesson.getCompanyId());
		requestLessonImpl.setGroupId(requestLesson.getGroupId());
		requestLessonImpl.setName(requestLesson.getName());
		requestLessonImpl.setDescription(requestLesson.getDescription());
		requestLessonImpl.setRelatedLink(requestLesson.getRelatedLink());
		requestLessonImpl.setPriority(requestLesson.isPriority());
		requestLessonImpl.setCreatedBy(requestLesson.getCreatedBy());
		requestLessonImpl.setCreatedDate(requestLesson.getCreatedDate());
		requestLessonImpl.setAcceptedBy(requestLesson.getAcceptedBy());
		requestLessonImpl.setStatus(requestLesson.getStatus());
		requestLessonImpl.setAppreciatedUserIds(requestLesson.getAppreciatedUserIds());
		requestLessonImpl.setLastActivity(requestLesson.getLastActivity());
		requestLessonImpl.setAcceptedNote(requestLesson.getAcceptedNote());
		requestLessonImpl.setAnswerType(requestLesson.getAnswerType());
		requestLessonImpl.setSendTo(requestLesson.getSendTo());
		requestLessonImpl.setOpnionSurveyLink(requestLesson.getOpnionSurveyLink());
		requestLessonImpl.setSurveyOptions(requestLesson.getSurveyOptions());

		return requestLessonImpl;
	}

	/**
	 * Returns the request lesson with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the request lesson
	 * @return the request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRequestLessonException, SystemException {
		RequestLesson requestLesson = fetchByPrimaryKey(primaryKey);

		if (requestLesson == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRequestLessonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return requestLesson;
	}

	/**
	 * Returns the request lesson with the primary key or throws a {@link com.nyu.NoSuchRequestLessonException} if it could not be found.
	 *
	 * @param requestLessonId the primary key of the request lesson
	 * @return the request lesson
	 * @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson findByPrimaryKey(long requestLessonId)
		throws NoSuchRequestLessonException, SystemException {
		return findByPrimaryKey((Serializable)requestLessonId);
	}

	/**
	 * Returns the request lesson with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the request lesson
	 * @return the request lesson, or <code>null</code> if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RequestLesson requestLesson = (RequestLesson)EntityCacheUtil.getResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
				RequestLessonImpl.class, primaryKey);

		if (requestLesson == _nullRequestLesson) {
			return null;
		}

		if (requestLesson == null) {
			Session session = null;

			try {
				session = openSession();

				requestLesson = (RequestLesson)session.get(RequestLessonImpl.class,
						primaryKey);

				if (requestLesson != null) {
					cacheResult(requestLesson);
				}
				else {
					EntityCacheUtil.putResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
						RequestLessonImpl.class, primaryKey, _nullRequestLesson);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RequestLessonModelImpl.ENTITY_CACHE_ENABLED,
					RequestLessonImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return requestLesson;
	}

	/**
	 * Returns the request lesson with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestLessonId the primary key of the request lesson
	 * @return the request lesson, or <code>null</code> if a request lesson with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RequestLesson fetchByPrimaryKey(long requestLessonId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)requestLessonId);
	}

	/**
	 * Returns all the request lessons.
	 *
	 * @return the request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the request lessons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of request lessons
	 * @param end the upper bound of the range of request lessons (not inclusive)
	 * @return the range of request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the request lessons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.RequestLessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of request lessons
	 * @param end the upper bound of the range of request lessons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of request lessons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RequestLesson> findAll(int start, int end,
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

		List<RequestLesson> list = (List<RequestLesson>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REQUESTLESSON);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REQUESTLESSON;

				if (pagination) {
					sql = sql.concat(RequestLessonModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RequestLesson>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RequestLesson>(list);
				}
				else {
					list = (List<RequestLesson>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the request lessons from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RequestLesson requestLesson : findAll()) {
			remove(requestLesson);
		}
	}

	/**
	 * Returns the number of request lessons.
	 *
	 * @return the number of request lessons
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

				Query q = session.createQuery(_SQL_COUNT_REQUESTLESSON);

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
	 * Initializes the request lesson persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.RequestLesson")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RequestLesson>> listenersList = new ArrayList<ModelListener<RequestLesson>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RequestLesson>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RequestLessonImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REQUESTLESSON = "SELECT requestLesson FROM RequestLesson requestLesson";
	private static final String _SQL_SELECT_REQUESTLESSON_WHERE = "SELECT requestLesson FROM RequestLesson requestLesson WHERE ";
	private static final String _SQL_COUNT_REQUESTLESSON = "SELECT COUNT(requestLesson) FROM RequestLesson requestLesson";
	private static final String _SQL_COUNT_REQUESTLESSON_WHERE = "SELECT COUNT(requestLesson) FROM RequestLesson requestLesson WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "requestLesson.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RequestLesson exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RequestLesson exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RequestLessonPersistenceImpl.class);
	private static RequestLesson _nullRequestLesson = new RequestLessonImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RequestLesson> toCacheModel() {
				return _nullRequestLessonCacheModel;
			}
		};

	private static CacheModel<RequestLesson> _nullRequestLessonCacheModel = new CacheModel<RequestLesson>() {
			@Override
			public RequestLesson toEntityModel() {
				return _nullRequestLesson;
			}
		};
}