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

import com.nyu.NoSuchAnswerRequestException;

import com.nyu.model.AnswerRequest;
import com.nyu.model.impl.AnswerRequestImpl;
import com.nyu.model.impl.AnswerRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the answer request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AnswerRequestPersistence
 * @see AnswerRequestUtil
 * @generated
 */
public class AnswerRequestPersistenceImpl extends BasePersistenceImpl<AnswerRequest>
	implements AnswerRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AnswerRequestUtil} to access the answer request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AnswerRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED,
			AnswerRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED,
			AnswerRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ANSWERREQUESTLIST =
		new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED,
			AnswerRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAnswerRequestList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERREQUESTLIST =
		new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED,
			AnswerRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAnswerRequestList", new String[] { Long.class.getName() },
			AnswerRequestModelImpl.REQUESTLESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ANSWERREQUESTLIST = new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAnswerRequestList", new String[] { Long.class.getName() });

	/**
	 * Returns all the answer requests where requestLessonId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @return the matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findByAnswerRequestList(long requestLessonId)
		throws SystemException {
		return findByAnswerRequestList(requestLessonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the answer requests where requestLessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestLessonId the request lesson ID
	 * @param start the lower bound of the range of answer requests
	 * @param end the upper bound of the range of answer requests (not inclusive)
	 * @return the range of matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findByAnswerRequestList(long requestLessonId,
		int start, int end) throws SystemException {
		return findByAnswerRequestList(requestLessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the answer requests where requestLessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestLessonId the request lesson ID
	 * @param start the lower bound of the range of answer requests
	 * @param end the upper bound of the range of answer requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findByAnswerRequestList(long requestLessonId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERREQUESTLIST;
			finderArgs = new Object[] { requestLessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ANSWERREQUESTLIST;
			finderArgs = new Object[] {
					requestLessonId,
					
					start, end, orderByComparator
				};
		}

		List<AnswerRequest> list = (List<AnswerRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AnswerRequest answerRequest : list) {
				if ((requestLessonId != answerRequest.getRequestLessonId())) {
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

			query.append(_SQL_SELECT_ANSWERREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ANSWERREQUESTLIST_REQUESTLESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AnswerRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requestLessonId);

				if (!pagination) {
					list = (List<AnswerRequest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AnswerRequest>(list);
				}
				else {
					list = (List<AnswerRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first answer request in the ordered set where requestLessonId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest findByAnswerRequestList_First(long requestLessonId,
		OrderByComparator orderByComparator)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = fetchByAnswerRequestList_First(requestLessonId,
				orderByComparator);

		if (answerRequest != null) {
			return answerRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestLessonId=");
		msg.append(requestLessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnswerRequestException(msg.toString());
	}

	/**
	 * Returns the first answer request in the ordered set where requestLessonId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answer request, or <code>null</code> if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest fetchByAnswerRequestList_First(long requestLessonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AnswerRequest> list = findByAnswerRequestList(requestLessonId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last answer request in the ordered set where requestLessonId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest findByAnswerRequestList_Last(long requestLessonId,
		OrderByComparator orderByComparator)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = fetchByAnswerRequestList_Last(requestLessonId,
				orderByComparator);

		if (answerRequest != null) {
			return answerRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestLessonId=");
		msg.append(requestLessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnswerRequestException(msg.toString());
	}

	/**
	 * Returns the last answer request in the ordered set where requestLessonId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answer request, or <code>null</code> if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest fetchByAnswerRequestList_Last(long requestLessonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAnswerRequestList(requestLessonId);

		if (count == 0) {
			return null;
		}

		List<AnswerRequest> list = findByAnswerRequestList(requestLessonId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the answer requests before and after the current answer request in the ordered set where requestLessonId = &#63;.
	 *
	 * @param answerId the primary key of the current answer request
	 * @param requestLessonId the request lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest[] findByAnswerRequestList_PrevAndNext(long answerId,
		long requestLessonId, OrderByComparator orderByComparator)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = findByPrimaryKey(answerId);

		Session session = null;

		try {
			session = openSession();

			AnswerRequest[] array = new AnswerRequestImpl[3];

			array[0] = getByAnswerRequestList_PrevAndNext(session,
					answerRequest, requestLessonId, orderByComparator, true);

			array[1] = answerRequest;

			array[2] = getByAnswerRequestList_PrevAndNext(session,
					answerRequest, requestLessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AnswerRequest getByAnswerRequestList_PrevAndNext(
		Session session, AnswerRequest answerRequest, long requestLessonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANSWERREQUEST_WHERE);

		query.append(_FINDER_COLUMN_ANSWERREQUESTLIST_REQUESTLESSONID_2);

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
			query.append(AnswerRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(requestLessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(answerRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AnswerRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the answer requests where requestLessonId = &#63; from the database.
	 *
	 * @param requestLessonId the request lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAnswerRequestList(long requestLessonId)
		throws SystemException {
		for (AnswerRequest answerRequest : findByAnswerRequestList(
				requestLessonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(answerRequest);
		}
	}

	/**
	 * Returns the number of answer requests where requestLessonId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @return the number of matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAnswerRequestList(long requestLessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ANSWERREQUESTLIST;

		Object[] finderArgs = new Object[] { requestLessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ANSWERREQUEST_WHERE);

			query.append(_FINDER_COLUMN_ANSWERREQUESTLIST_REQUESTLESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requestLessonId);

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

	private static final String _FINDER_COLUMN_ANSWERREQUESTLIST_REQUESTLESSONID_2 =
		"answerRequest.requestLessonId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COLLABORATIONLESSON =
		new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED,
			AnswerRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCollaborationLesson",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLABORATIONLESSON =
		new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED,
			AnswerRequestImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCollaborationLesson",
			new String[] { Long.class.getName(), Long.class.getName() },
			AnswerRequestModelImpl.REQUESTLESSONID_COLUMN_BITMASK |
			AnswerRequestModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COLLABORATIONLESSON = new FinderPath(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCollaborationLesson",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the answer requests where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @return the matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findByCollaborationLesson(long requestLessonId,
		long userId) throws SystemException {
		return findByCollaborationLesson(requestLessonId, userId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the answer requests where requestLessonId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of answer requests
	 * @param end the upper bound of the range of answer requests (not inclusive)
	 * @return the range of matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findByCollaborationLesson(long requestLessonId,
		long userId, int start, int end) throws SystemException {
		return findByCollaborationLesson(requestLessonId, userId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the answer requests where requestLessonId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of answer requests
	 * @param end the upper bound of the range of answer requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findByCollaborationLesson(long requestLessonId,
		long userId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLABORATIONLESSON;
			finderArgs = new Object[] { requestLessonId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COLLABORATIONLESSON;
			finderArgs = new Object[] {
					requestLessonId, userId,
					
					start, end, orderByComparator
				};
		}

		List<AnswerRequest> list = (List<AnswerRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AnswerRequest answerRequest : list) {
				if ((requestLessonId != answerRequest.getRequestLessonId()) ||
						(userId != answerRequest.getUserId())) {
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

			query.append(_SQL_SELECT_ANSWERREQUEST_WHERE);

			query.append(_FINDER_COLUMN_COLLABORATIONLESSON_REQUESTLESSONID_2);

			query.append(_FINDER_COLUMN_COLLABORATIONLESSON_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AnswerRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requestLessonId);

				qPos.add(userId);

				if (!pagination) {
					list = (List<AnswerRequest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AnswerRequest>(list);
				}
				else {
					list = (List<AnswerRequest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest findByCollaborationLesson_First(long requestLessonId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = fetchByCollaborationLesson_First(requestLessonId,
				userId, orderByComparator);

		if (answerRequest != null) {
			return answerRequest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestLessonId=");
		msg.append(requestLessonId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnswerRequestException(msg.toString());
	}

	/**
	 * Returns the first answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answer request, or <code>null</code> if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest fetchByCollaborationLesson_First(
		long requestLessonId, long userId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AnswerRequest> list = findByCollaborationLesson(requestLessonId,
				userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest findByCollaborationLesson_Last(long requestLessonId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = fetchByCollaborationLesson_Last(requestLessonId,
				userId, orderByComparator);

		if (answerRequest != null) {
			return answerRequest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestLessonId=");
		msg.append(requestLessonId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnswerRequestException(msg.toString());
	}

	/**
	 * Returns the last answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answer request, or <code>null</code> if a matching answer request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest fetchByCollaborationLesson_Last(long requestLessonId,
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCollaborationLesson(requestLessonId, userId);

		if (count == 0) {
			return null;
		}

		List<AnswerRequest> list = findByCollaborationLesson(requestLessonId,
				userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the answer requests before and after the current answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param answerId the primary key of the current answer request
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest[] findByCollaborationLesson_PrevAndNext(
		long answerId, long requestLessonId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = findByPrimaryKey(answerId);

		Session session = null;

		try {
			session = openSession();

			AnswerRequest[] array = new AnswerRequestImpl[3];

			array[0] = getByCollaborationLesson_PrevAndNext(session,
					answerRequest, requestLessonId, userId, orderByComparator,
					true);

			array[1] = answerRequest;

			array[2] = getByCollaborationLesson_PrevAndNext(session,
					answerRequest, requestLessonId, userId, orderByComparator,
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

	protected AnswerRequest getByCollaborationLesson_PrevAndNext(
		Session session, AnswerRequest answerRequest, long requestLessonId,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANSWERREQUEST_WHERE);

		query.append(_FINDER_COLUMN_COLLABORATIONLESSON_REQUESTLESSONID_2);

		query.append(_FINDER_COLUMN_COLLABORATIONLESSON_USERID_2);

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
			query.append(AnswerRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(requestLessonId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(answerRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AnswerRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the answer requests where requestLessonId = &#63; and userId = &#63; from the database.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCollaborationLesson(long requestLessonId, long userId)
		throws SystemException {
		for (AnswerRequest answerRequest : findByCollaborationLesson(
				requestLessonId, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(answerRequest);
		}
	}

	/**
	 * Returns the number of answer requests where requestLessonId = &#63; and userId = &#63;.
	 *
	 * @param requestLessonId the request lesson ID
	 * @param userId the user ID
	 * @return the number of matching answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCollaborationLesson(long requestLessonId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COLLABORATIONLESSON;

		Object[] finderArgs = new Object[] { requestLessonId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ANSWERREQUEST_WHERE);

			query.append(_FINDER_COLUMN_COLLABORATIONLESSON_REQUESTLESSONID_2);

			query.append(_FINDER_COLUMN_COLLABORATIONLESSON_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requestLessonId);

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

	private static final String _FINDER_COLUMN_COLLABORATIONLESSON_REQUESTLESSONID_2 =
		"answerRequest.requestLessonId = ? AND ";
	private static final String _FINDER_COLUMN_COLLABORATIONLESSON_USERID_2 = "answerRequest.userId = ?";

	public AnswerRequestPersistenceImpl() {
		setModelClass(AnswerRequest.class);
	}

	/**
	 * Caches the answer request in the entity cache if it is enabled.
	 *
	 * @param answerRequest the answer request
	 */
	@Override
	public void cacheResult(AnswerRequest answerRequest) {
		EntityCacheUtil.putResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestImpl.class, answerRequest.getPrimaryKey(),
			answerRequest);

		answerRequest.resetOriginalValues();
	}

	/**
	 * Caches the answer requests in the entity cache if it is enabled.
	 *
	 * @param answerRequests the answer requests
	 */
	@Override
	public void cacheResult(List<AnswerRequest> answerRequests) {
		for (AnswerRequest answerRequest : answerRequests) {
			if (EntityCacheUtil.getResult(
						AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
						AnswerRequestImpl.class, answerRequest.getPrimaryKey()) == null) {
				cacheResult(answerRequest);
			}
			else {
				answerRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all answer requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AnswerRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AnswerRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the answer request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AnswerRequest answerRequest) {
		EntityCacheUtil.removeResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestImpl.class, answerRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AnswerRequest> answerRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AnswerRequest answerRequest : answerRequests) {
			EntityCacheUtil.removeResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
				AnswerRequestImpl.class, answerRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new answer request with the primary key. Does not add the answer request to the database.
	 *
	 * @param answerId the primary key for the new answer request
	 * @return the new answer request
	 */
	@Override
	public AnswerRequest create(long answerId) {
		AnswerRequest answerRequest = new AnswerRequestImpl();

		answerRequest.setNew(true);
		answerRequest.setPrimaryKey(answerId);

		return answerRequest;
	}

	/**
	 * Removes the answer request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param answerId the primary key of the answer request
	 * @return the answer request that was removed
	 * @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest remove(long answerId)
		throws NoSuchAnswerRequestException, SystemException {
		return remove((Serializable)answerId);
	}

	/**
	 * Removes the answer request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the answer request
	 * @return the answer request that was removed
	 * @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest remove(Serializable primaryKey)
		throws NoSuchAnswerRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AnswerRequest answerRequest = (AnswerRequest)session.get(AnswerRequestImpl.class,
					primaryKey);

			if (answerRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAnswerRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(answerRequest);
		}
		catch (NoSuchAnswerRequestException nsee) {
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
	protected AnswerRequest removeImpl(AnswerRequest answerRequest)
		throws SystemException {
		answerRequest = toUnwrappedModel(answerRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(answerRequest)) {
				answerRequest = (AnswerRequest)session.get(AnswerRequestImpl.class,
						answerRequest.getPrimaryKeyObj());
			}

			if (answerRequest != null) {
				session.delete(answerRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (answerRequest != null) {
			clearCache(answerRequest);
		}

		return answerRequest;
	}

	@Override
	public AnswerRequest updateImpl(com.nyu.model.AnswerRequest answerRequest)
		throws SystemException {
		answerRequest = toUnwrappedModel(answerRequest);

		boolean isNew = answerRequest.isNew();

		AnswerRequestModelImpl answerRequestModelImpl = (AnswerRequestModelImpl)answerRequest;

		Session session = null;

		try {
			session = openSession();

			if (answerRequest.isNew()) {
				session.save(answerRequest);

				answerRequest.setNew(false);
			}
			else {
				session.merge(answerRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AnswerRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((answerRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERREQUESTLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						answerRequestModelImpl.getOriginalRequestLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ANSWERREQUESTLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERREQUESTLIST,
					args);

				args = new Object[] { answerRequestModelImpl.getRequestLessonId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ANSWERREQUESTLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERREQUESTLIST,
					args);
			}

			if ((answerRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLABORATIONLESSON.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						answerRequestModelImpl.getOriginalRequestLessonId(),
						answerRequestModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COLLABORATIONLESSON,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLABORATIONLESSON,
					args);

				args = new Object[] {
						answerRequestModelImpl.getRequestLessonId(),
						answerRequestModelImpl.getUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COLLABORATIONLESSON,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLABORATIONLESSON,
					args);
			}
		}

		EntityCacheUtil.putResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
			AnswerRequestImpl.class, answerRequest.getPrimaryKey(),
			answerRequest);

		return answerRequest;
	}

	protected AnswerRequest toUnwrappedModel(AnswerRequest answerRequest) {
		if (answerRequest instanceof AnswerRequestImpl) {
			return answerRequest;
		}

		AnswerRequestImpl answerRequestImpl = new AnswerRequestImpl();

		answerRequestImpl.setNew(answerRequest.isNew());
		answerRequestImpl.setPrimaryKey(answerRequest.getPrimaryKey());

		answerRequestImpl.setAnswerId(answerRequest.getAnswerId());
		answerRequestImpl.setRequestLessonId(answerRequest.getRequestLessonId());
		answerRequestImpl.setUserId(answerRequest.getUserId());
		answerRequestImpl.setDescription(answerRequest.getDescription());
		answerRequestImpl.setAppreciateUserIds(answerRequest.getAppreciateUserIds());
		answerRequestImpl.setAppreciateCount(answerRequest.getAppreciateCount());
		answerRequestImpl.setCreateDate(answerRequest.getCreateDate());
		answerRequestImpl.setCheckedAnswer(answerRequest.isCheckedAnswer());
		answerRequestImpl.setOpinionSurvey(answerRequest.getOpinionSurvey());
		answerRequestImpl.setMyLessons(answerRequest.getMyLessons());
		answerRequestImpl.setMyFavouriteLessons(answerRequest.getMyFavouriteLessons());
		answerRequestImpl.setCollaborationLessons(answerRequest.getCollaborationLessons());
		answerRequestImpl.setCollaborationId(answerRequest.getCollaborationId());

		return answerRequestImpl;
	}

	/**
	 * Returns the answer request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the answer request
	 * @return the answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAnswerRequestException, SystemException {
		AnswerRequest answerRequest = fetchByPrimaryKey(primaryKey);

		if (answerRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAnswerRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return answerRequest;
	}

	/**
	 * Returns the answer request with the primary key or throws a {@link com.nyu.NoSuchAnswerRequestException} if it could not be found.
	 *
	 * @param answerId the primary key of the answer request
	 * @return the answer request
	 * @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest findByPrimaryKey(long answerId)
		throws NoSuchAnswerRequestException, SystemException {
		return findByPrimaryKey((Serializable)answerId);
	}

	/**
	 * Returns the answer request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the answer request
	 * @return the answer request, or <code>null</code> if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AnswerRequest answerRequest = (AnswerRequest)EntityCacheUtil.getResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
				AnswerRequestImpl.class, primaryKey);

		if (answerRequest == _nullAnswerRequest) {
			return null;
		}

		if (answerRequest == null) {
			Session session = null;

			try {
				session = openSession();

				answerRequest = (AnswerRequest)session.get(AnswerRequestImpl.class,
						primaryKey);

				if (answerRequest != null) {
					cacheResult(answerRequest);
				}
				else {
					EntityCacheUtil.putResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
						AnswerRequestImpl.class, primaryKey, _nullAnswerRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AnswerRequestModelImpl.ENTITY_CACHE_ENABLED,
					AnswerRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return answerRequest;
	}

	/**
	 * Returns the answer request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param answerId the primary key of the answer request
	 * @return the answer request, or <code>null</code> if a answer request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnswerRequest fetchByPrimaryKey(long answerId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)answerId);
	}

	/**
	 * Returns all the answer requests.
	 *
	 * @return the answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the answer requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answer requests
	 * @param end the upper bound of the range of answer requests (not inclusive)
	 * @return the range of answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the answer requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answer requests
	 * @param end the upper bound of the range of answer requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of answer requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AnswerRequest> findAll(int start, int end,
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

		List<AnswerRequest> list = (List<AnswerRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ANSWERREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANSWERREQUEST;

				if (pagination) {
					sql = sql.concat(AnswerRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AnswerRequest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AnswerRequest>(list);
				}
				else {
					list = (List<AnswerRequest>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the answer requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AnswerRequest answerRequest : findAll()) {
			remove(answerRequest);
		}
	}

	/**
	 * Returns the number of answer requests.
	 *
	 * @return the number of answer requests
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

				Query q = session.createQuery(_SQL_COUNT_ANSWERREQUEST);

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
	 * Initializes the answer request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.AnswerRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AnswerRequest>> listenersList = new ArrayList<ModelListener<AnswerRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AnswerRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AnswerRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ANSWERREQUEST = "SELECT answerRequest FROM AnswerRequest answerRequest";
	private static final String _SQL_SELECT_ANSWERREQUEST_WHERE = "SELECT answerRequest FROM AnswerRequest answerRequest WHERE ";
	private static final String _SQL_COUNT_ANSWERREQUEST = "SELECT COUNT(answerRequest) FROM AnswerRequest answerRequest";
	private static final String _SQL_COUNT_ANSWERREQUEST_WHERE = "SELECT COUNT(answerRequest) FROM AnswerRequest answerRequest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "answerRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AnswerRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AnswerRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AnswerRequestPersistenceImpl.class);
	private static AnswerRequest _nullAnswerRequest = new AnswerRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AnswerRequest> toCacheModel() {
				return _nullAnswerRequestCacheModel;
			}
		};

	private static CacheModel<AnswerRequest> _nullAnswerRequestCacheModel = new CacheModel<AnswerRequest>() {
			@Override
			public AnswerRequest toEntityModel() {
				return _nullAnswerRequest;
			}
		};
}