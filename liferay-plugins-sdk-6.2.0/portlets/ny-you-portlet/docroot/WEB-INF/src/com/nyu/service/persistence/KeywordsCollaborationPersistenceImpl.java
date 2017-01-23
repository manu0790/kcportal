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

import com.nyu.NoSuchKeywordsCollaborationException;

import com.nyu.model.KeywordsCollaboration;
import com.nyu.model.impl.KeywordsCollaborationImpl;
import com.nyu.model.impl.KeywordsCollaborationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the keywords collaboration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see KeywordsCollaborationPersistence
 * @see KeywordsCollaborationUtil
 * @generated
 */
public class KeywordsCollaborationPersistenceImpl extends BasePersistenceImpl<KeywordsCollaboration>
	implements KeywordsCollaborationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KeywordsCollaborationUtil} to access the keywords collaboration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KeywordsCollaborationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTSTATUS = new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByrequestStatus",
			new String[] { Long.class.getName(), Long.class.getName() },
			KeywordsCollaborationModelImpl.KEYWORDID_COLUMN_BITMASK |
			KeywordsCollaborationModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTSTATUS = new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrequestStatus",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or throws a {@link com.nyu.NoSuchKeywordsCollaborationException} if it could not be found.
	 *
	 * @param keywordId the keyword ID
	 * @param userId the user ID
	 * @return the matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findByrequestStatus(long keywordId, long userId)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchByrequestStatus(keywordId,
				userId);

		if (keywordsCollaboration == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keywordId=");
			msg.append(keywordId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchKeywordsCollaborationException(msg.toString());
		}

		return keywordsCollaboration;
	}

	/**
	 * Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keywordId the keyword ID
	 * @param userId the user ID
	 * @return the matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchByrequestStatus(long keywordId,
		long userId) throws SystemException {
		return fetchByrequestStatus(keywordId, userId, true);
	}

	/**
	 * Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keywordId the keyword ID
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchByrequestStatus(long keywordId,
		long userId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { keywordId, userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
					finderArgs, this);
		}

		if (result instanceof KeywordsCollaboration) {
			KeywordsCollaboration keywordsCollaboration = (KeywordsCollaboration)result;

			if ((keywordId != keywordsCollaboration.getKeywordId()) ||
					(userId != keywordsCollaboration.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_REQUESTSTATUS_KEYWORDID_2);

			query.append(_FINDER_COLUMN_REQUESTSTATUS_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keywordId);

				qPos.add(userId);

				List<KeywordsCollaboration> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"KeywordsCollaborationPersistenceImpl.fetchByrequestStatus(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					KeywordsCollaboration keywordsCollaboration = list.get(0);

					result = keywordsCollaboration;

					cacheResult(keywordsCollaboration);

					if ((keywordsCollaboration.getKeywordId() != keywordId) ||
							(keywordsCollaboration.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
							finderArgs, keywordsCollaboration);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
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
			return (KeywordsCollaboration)result;
		}
	}

	/**
	 * Removes the keywords collaboration where keywordId = &#63; and userId = &#63; from the database.
	 *
	 * @param keywordId the keyword ID
	 * @param userId the user ID
	 * @return the keywords collaboration that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration removeByrequestStatus(long keywordId,
		long userId)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = findByrequestStatus(keywordId,
				userId);

		return remove(keywordsCollaboration);
	}

	/**
	 * Returns the number of keywords collaborations where keywordId = &#63; and userId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @param userId the user ID
	 * @return the number of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByrequestStatus(long keywordId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUESTSTATUS;

		Object[] finderArgs = new Object[] { keywordId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KEYWORDSCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_REQUESTSTATUS_KEYWORDID_2);

			query.append(_FINDER_COLUMN_REQUESTSTATUS_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keywordId);

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

	private static final String _FINDER_COLUMN_REQUESTSTATUS_KEYWORDID_2 = "keywordsCollaboration.keywordId = ? AND ";
	private static final String _FINDER_COLUMN_REQUESTSTATUS_USERID_2 = "keywordsCollaboration.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KEYWORDEXISTENCE =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBykeywordExistence",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDEXISTENCE =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBykeywordExistence", new String[] { Long.class.getName() },
			KeywordsCollaborationModelImpl.KEYWORDID_COLUMN_BITMASK |
			KeywordsCollaborationModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEYWORDEXISTENCE = new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBykeywordExistence", new String[] { Long.class.getName() });

	/**
	 * Returns all the keywords collaborations where keywordId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @return the matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBykeywordExistence(long keywordId)
		throws SystemException {
		return findBykeywordExistence(keywordId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the keywords collaborations where keywordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keywordId the keyword ID
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @return the range of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBykeywordExistence(long keywordId,
		int start, int end) throws SystemException {
		return findBykeywordExistence(keywordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the keywords collaborations where keywordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keywordId the keyword ID
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBykeywordExistence(long keywordId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDEXISTENCE;
			finderArgs = new Object[] { keywordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KEYWORDEXISTENCE;
			finderArgs = new Object[] { keywordId, start, end, orderByComparator };
		}

		List<KeywordsCollaboration> list = (List<KeywordsCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeywordsCollaboration keywordsCollaboration : list) {
				if ((keywordId != keywordsCollaboration.getKeywordId())) {
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

			query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_KEYWORDEXISTENCE_KEYWORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keywordId);

				if (!pagination) {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeywordsCollaboration>(list);
				}
				else {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
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
	 * Returns the first keywords collaboration in the ordered set where keywordId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findBykeywordExistence_First(long keywordId,
		OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchBykeywordExistence_First(keywordId,
				orderByComparator);

		if (keywordsCollaboration != null) {
			return keywordsCollaboration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keywordId=");
		msg.append(keywordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeywordsCollaborationException(msg.toString());
	}

	/**
	 * Returns the first keywords collaboration in the ordered set where keywordId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchBykeywordExistence_First(long keywordId,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeywordsCollaboration> list = findBykeywordExistence(keywordId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last keywords collaboration in the ordered set where keywordId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findBykeywordExistence_Last(long keywordId,
		OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchBykeywordExistence_Last(keywordId,
				orderByComparator);

		if (keywordsCollaboration != null) {
			return keywordsCollaboration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keywordId=");
		msg.append(keywordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeywordsCollaborationException(msg.toString());
	}

	/**
	 * Returns the last keywords collaboration in the ordered set where keywordId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchBykeywordExistence_Last(long keywordId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBykeywordExistence(keywordId);

		if (count == 0) {
			return null;
		}

		List<KeywordsCollaboration> list = findBykeywordExistence(keywordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the keywords collaborations before and after the current keywords collaboration in the ordered set where keywordId = &#63;.
	 *
	 * @param id the primary key of the current keywords collaboration
	 * @param keywordId the keyword ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration[] findBykeywordExistence_PrevAndNext(long id,
		long keywordId, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeywordsCollaboration[] array = new KeywordsCollaborationImpl[3];

			array[0] = getBykeywordExistence_PrevAndNext(session,
					keywordsCollaboration, keywordId, orderByComparator, true);

			array[1] = keywordsCollaboration;

			array[2] = getBykeywordExistence_PrevAndNext(session,
					keywordsCollaboration, keywordId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KeywordsCollaboration getBykeywordExistence_PrevAndNext(
		Session session, KeywordsCollaboration keywordsCollaboration,
		long keywordId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_KEYWORDEXISTENCE_KEYWORDID_2);

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
			query.append(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keywordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keywordsCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeywordsCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the keywords collaborations where keywordId = &#63; from the database.
	 *
	 * @param keywordId the keyword ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBykeywordExistence(long keywordId)
		throws SystemException {
		for (KeywordsCollaboration keywordsCollaboration : findBykeywordExistence(
				keywordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keywordsCollaboration);
		}
	}

	/**
	 * Returns the number of keywords collaborations where keywordId = &#63;.
	 *
	 * @param keywordId the keyword ID
	 * @return the number of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBykeywordExistence(long keywordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEYWORDEXISTENCE;

		Object[] finderArgs = new Object[] { keywordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEYWORDSCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_KEYWORDEXISTENCE_KEYWORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keywordId);

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

	private static final String _FINDER_COLUMN_KEYWORDEXISTENCE_KEYWORDID_2 = "keywordsCollaboration.keywordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBykeywordCollaListbyStatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBykeywordCollaListbyStatus",
			new String[] { String.class.getName() },
			KeywordsCollaborationModelImpl.STATUS_COLUMN_BITMASK |
			KeywordsCollaborationModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEYWORDCOLLALISTBYSTATUS =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBykeywordCollaListbyStatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the keywords collaborations where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBykeywordCollaListbyStatus(
		String status) throws SystemException {
		return findBykeywordCollaListbyStatus(status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the keywords collaborations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @return the range of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBykeywordCollaListbyStatus(
		String status, int start, int end) throws SystemException {
		return findBykeywordCollaListbyStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the keywords collaborations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBykeywordCollaListbyStatus(
		String status, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<KeywordsCollaboration> list = (List<KeywordsCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeywordsCollaboration keywordsCollaboration : list) {
				if (!Validator.equals(status, keywordsCollaboration.getStatus())) {
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

			query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
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
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeywordsCollaboration>(list);
				}
				else {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
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
	 * Returns the first keywords collaboration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findBykeywordCollaListbyStatus_First(
		String status, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchBykeywordCollaListbyStatus_First(status,
				orderByComparator);

		if (keywordsCollaboration != null) {
			return keywordsCollaboration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeywordsCollaborationException(msg.toString());
	}

	/**
	 * Returns the first keywords collaboration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchBykeywordCollaListbyStatus_First(
		String status, OrderByComparator orderByComparator)
		throws SystemException {
		List<KeywordsCollaboration> list = findBykeywordCollaListbyStatus(status,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last keywords collaboration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findBykeywordCollaListbyStatus_Last(
		String status, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchBykeywordCollaListbyStatus_Last(status,
				orderByComparator);

		if (keywordsCollaboration != null) {
			return keywordsCollaboration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeywordsCollaborationException(msg.toString());
	}

	/**
	 * Returns the last keywords collaboration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchBykeywordCollaListbyStatus_Last(
		String status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBykeywordCollaListbyStatus(status);

		if (count == 0) {
			return null;
		}

		List<KeywordsCollaboration> list = findBykeywordCollaListbyStatus(status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the keywords collaborations before and after the current keywords collaboration in the ordered set where status = &#63;.
	 *
	 * @param id the primary key of the current keywords collaboration
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration[] findBykeywordCollaListbyStatus_PrevAndNext(
		long id, String status, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeywordsCollaboration[] array = new KeywordsCollaborationImpl[3];

			array[0] = getBykeywordCollaListbyStatus_PrevAndNext(session,
					keywordsCollaboration, status, orderByComparator, true);

			array[1] = keywordsCollaboration;

			array[2] = getBykeywordCollaListbyStatus_PrevAndNext(session,
					keywordsCollaboration, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KeywordsCollaboration getBykeywordCollaListbyStatus_PrevAndNext(
		Session session, KeywordsCollaboration keywordsCollaboration,
		String status, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_2);
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
			query.append(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(keywordsCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeywordsCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the keywords collaborations where status = &#63; from the database.
	 *
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBykeywordCollaListbyStatus(String status)
		throws SystemException {
		for (KeywordsCollaboration keywordsCollaboration : findBykeywordCollaListbyStatus(
				status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keywordsCollaboration);
		}
	}

	/**
	 * Returns the number of keywords collaborations where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBykeywordCollaListbyStatus(String status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEYWORDCOLLALISTBYSTATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEYWORDSCOLLABORATION_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_1 =
		"keywordsCollaboration.status IS NULL";
	private static final String _FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_2 =
		"keywordsCollaboration.status = ?";
	private static final String _FINDER_COLUMN_KEYWORDCOLLALISTBYSTATUS_STATUS_3 =
		"(keywordsCollaboration.status IS NULL OR keywordsCollaboration.status = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetRequestStatusByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetRequestStatusByUserId",
			new String[] { Long.class.getName() },
			KeywordsCollaborationModelImpl.USERID_COLUMN_BITMASK |
			KeywordsCollaborationModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GETREQUESTSTATUSBYUSERID =
		new FinderPath(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetRequestStatusByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the keywords collaborations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId) throws SystemException {
		return findBygetRequestStatusByUserId(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the keywords collaborations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @return the range of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId, int start, int end) throws SystemException {
		return findBygetRequestStatusByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the keywords collaborations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<KeywordsCollaboration> list = (List<KeywordsCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeywordsCollaboration keywordsCollaboration : list) {
				if ((userId != keywordsCollaboration.getUserId())) {
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

			query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_GETREQUESTSTATUSBYUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeywordsCollaboration>(list);
				}
				else {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
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
	 * Returns the first keywords collaboration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findBygetRequestStatusByUserId_First(
		long userId, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchBygetRequestStatusByUserId_First(userId,
				orderByComparator);

		if (keywordsCollaboration != null) {
			return keywordsCollaboration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeywordsCollaborationException(msg.toString());
	}

	/**
	 * Returns the first keywords collaboration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchBygetRequestStatusByUserId_First(
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		List<KeywordsCollaboration> list = findBygetRequestStatusByUserId(userId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last keywords collaboration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findBygetRequestStatusByUserId_Last(
		long userId, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchBygetRequestStatusByUserId_Last(userId,
				orderByComparator);

		if (keywordsCollaboration != null) {
			return keywordsCollaboration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeywordsCollaborationException(msg.toString());
	}

	/**
	 * Returns the last keywords collaboration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchBygetRequestStatusByUserId_Last(
		long userId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBygetRequestStatusByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<KeywordsCollaboration> list = findBygetRequestStatusByUserId(userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the keywords collaborations before and after the current keywords collaboration in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current keywords collaboration
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration[] findBygetRequestStatusByUserId_PrevAndNext(
		long id, long userId, OrderByComparator orderByComparator)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeywordsCollaboration[] array = new KeywordsCollaborationImpl[3];

			array[0] = getBygetRequestStatusByUserId_PrevAndNext(session,
					keywordsCollaboration, userId, orderByComparator, true);

			array[1] = keywordsCollaboration;

			array[2] = getBygetRequestStatusByUserId_PrevAndNext(session,
					keywordsCollaboration, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KeywordsCollaboration getBygetRequestStatusByUserId_PrevAndNext(
		Session session, KeywordsCollaboration keywordsCollaboration,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEYWORDSCOLLABORATION_WHERE);

		query.append(_FINDER_COLUMN_GETREQUESTSTATUSBYUSERID_USERID_2);

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
			query.append(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keywordsCollaboration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeywordsCollaboration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the keywords collaborations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygetRequestStatusByUserId(long userId)
		throws SystemException {
		for (KeywordsCollaboration keywordsCollaboration : findBygetRequestStatusByUserId(
				userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keywordsCollaboration);
		}
	}

	/**
	 * Returns the number of keywords collaborations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygetRequestStatusByUserId(long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GETREQUESTSTATUSBYUSERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEYWORDSCOLLABORATION_WHERE);

			query.append(_FINDER_COLUMN_GETREQUESTSTATUSBYUSERID_USERID_2);

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

	private static final String _FINDER_COLUMN_GETREQUESTSTATUSBYUSERID_USERID_2 =
		"keywordsCollaboration.userId = ?";

	public KeywordsCollaborationPersistenceImpl() {
		setModelClass(KeywordsCollaboration.class);
	}

	/**
	 * Caches the keywords collaboration in the entity cache if it is enabled.
	 *
	 * @param keywordsCollaboration the keywords collaboration
	 */
	@Override
	public void cacheResult(KeywordsCollaboration keywordsCollaboration) {
		EntityCacheUtil.putResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			keywordsCollaboration.getPrimaryKey(), keywordsCollaboration);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
			new Object[] {
				keywordsCollaboration.getKeywordId(),
				keywordsCollaboration.getUserId()
			}, keywordsCollaboration);

		keywordsCollaboration.resetOriginalValues();
	}

	/**
	 * Caches the keywords collaborations in the entity cache if it is enabled.
	 *
	 * @param keywordsCollaborations the keywords collaborations
	 */
	@Override
	public void cacheResult(List<KeywordsCollaboration> keywordsCollaborations) {
		for (KeywordsCollaboration keywordsCollaboration : keywordsCollaborations) {
			if (EntityCacheUtil.getResult(
						KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
						KeywordsCollaborationImpl.class,
						keywordsCollaboration.getPrimaryKey()) == null) {
				cacheResult(keywordsCollaboration);
			}
			else {
				keywordsCollaboration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all keywords collaborations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KeywordsCollaborationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KeywordsCollaborationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the keywords collaboration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeywordsCollaboration keywordsCollaboration) {
		EntityCacheUtil.removeResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			keywordsCollaboration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(keywordsCollaboration);
	}

	@Override
	public void clearCache(List<KeywordsCollaboration> keywordsCollaborations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KeywordsCollaboration keywordsCollaboration : keywordsCollaborations) {
			EntityCacheUtil.removeResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
				KeywordsCollaborationImpl.class,
				keywordsCollaboration.getPrimaryKey());

			clearUniqueFindersCache(keywordsCollaboration);
		}
	}

	protected void cacheUniqueFindersCache(
		KeywordsCollaboration keywordsCollaboration) {
		if (keywordsCollaboration.isNew()) {
			Object[] args = new Object[] {
					keywordsCollaboration.getKeywordId(),
					keywordsCollaboration.getUserId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTSTATUS, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS, args,
				keywordsCollaboration);
		}
		else {
			KeywordsCollaborationModelImpl keywordsCollaborationModelImpl = (KeywordsCollaborationModelImpl)keywordsCollaboration;

			if ((keywordsCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keywordsCollaboration.getKeywordId(),
						keywordsCollaboration.getUserId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTSTATUS,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
					args, keywordsCollaboration);
			}
		}
	}

	protected void clearUniqueFindersCache(
		KeywordsCollaboration keywordsCollaboration) {
		KeywordsCollaborationModelImpl keywordsCollaborationModelImpl = (KeywordsCollaborationModelImpl)keywordsCollaboration;

		Object[] args = new Object[] {
				keywordsCollaboration.getKeywordId(),
				keywordsCollaboration.getUserId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTSTATUS, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS, args);

		if ((keywordsCollaborationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REQUESTSTATUS.getColumnBitmask()) != 0) {
			args = new Object[] {
					keywordsCollaborationModelImpl.getOriginalKeywordId(),
					keywordsCollaborationModelImpl.getOriginalUserId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTSTATUS,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTSTATUS,
				args);
		}
	}

	/**
	 * Creates a new keywords collaboration with the primary key. Does not add the keywords collaboration to the database.
	 *
	 * @param id the primary key for the new keywords collaboration
	 * @return the new keywords collaboration
	 */
	@Override
	public KeywordsCollaboration create(long id) {
		KeywordsCollaboration keywordsCollaboration = new KeywordsCollaborationImpl();

		keywordsCollaboration.setNew(true);
		keywordsCollaboration.setPrimaryKey(id);

		return keywordsCollaboration;
	}

	/**
	 * Removes the keywords collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the keywords collaboration
	 * @return the keywords collaboration that was removed
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration remove(long id)
		throws NoSuchKeywordsCollaborationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the keywords collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the keywords collaboration
	 * @return the keywords collaboration that was removed
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration remove(Serializable primaryKey)
		throws NoSuchKeywordsCollaborationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KeywordsCollaboration keywordsCollaboration = (KeywordsCollaboration)session.get(KeywordsCollaborationImpl.class,
					primaryKey);

			if (keywordsCollaboration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeywordsCollaborationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keywordsCollaboration);
		}
		catch (NoSuchKeywordsCollaborationException nsee) {
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
	protected KeywordsCollaboration removeImpl(
		KeywordsCollaboration keywordsCollaboration) throws SystemException {
		keywordsCollaboration = toUnwrappedModel(keywordsCollaboration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keywordsCollaboration)) {
				keywordsCollaboration = (KeywordsCollaboration)session.get(KeywordsCollaborationImpl.class,
						keywordsCollaboration.getPrimaryKeyObj());
			}

			if (keywordsCollaboration != null) {
				session.delete(keywordsCollaboration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keywordsCollaboration != null) {
			clearCache(keywordsCollaboration);
		}

		return keywordsCollaboration;
	}

	@Override
	public KeywordsCollaboration updateImpl(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration)
		throws SystemException {
		keywordsCollaboration = toUnwrappedModel(keywordsCollaboration);

		boolean isNew = keywordsCollaboration.isNew();

		KeywordsCollaborationModelImpl keywordsCollaborationModelImpl = (KeywordsCollaborationModelImpl)keywordsCollaboration;

		Session session = null;

		try {
			session = openSession();

			if (keywordsCollaboration.isNew()) {
				session.save(keywordsCollaboration);

				keywordsCollaboration.setNew(false);
			}
			else {
				session.merge(keywordsCollaboration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KeywordsCollaborationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((keywordsCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDEXISTENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keywordsCollaborationModelImpl.getOriginalKeywordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYWORDEXISTENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDEXISTENCE,
					args);

				args = new Object[] {
						keywordsCollaborationModelImpl.getKeywordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYWORDEXISTENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDEXISTENCE,
					args);
			}

			if ((keywordsCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keywordsCollaborationModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYWORDCOLLALISTBYSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS,
					args);

				args = new Object[] { keywordsCollaborationModelImpl.getStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYWORDCOLLALISTBYSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEYWORDCOLLALISTBYSTATUS,
					args);
			}

			if ((keywordsCollaborationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keywordsCollaborationModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETREQUESTSTATUSBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID,
					args);

				args = new Object[] { keywordsCollaborationModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETREQUESTSTATUSBYUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GETREQUESTSTATUSBYUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
			KeywordsCollaborationImpl.class,
			keywordsCollaboration.getPrimaryKey(), keywordsCollaboration);

		clearUniqueFindersCache(keywordsCollaboration);
		cacheUniqueFindersCache(keywordsCollaboration);

		return keywordsCollaboration;
	}

	protected KeywordsCollaboration toUnwrappedModel(
		KeywordsCollaboration keywordsCollaboration) {
		if (keywordsCollaboration instanceof KeywordsCollaborationImpl) {
			return keywordsCollaboration;
		}

		KeywordsCollaborationImpl keywordsCollaborationImpl = new KeywordsCollaborationImpl();

		keywordsCollaborationImpl.setNew(keywordsCollaboration.isNew());
		keywordsCollaborationImpl.setPrimaryKey(keywordsCollaboration.getPrimaryKey());

		keywordsCollaborationImpl.setId(keywordsCollaboration.getId());
		keywordsCollaborationImpl.setCompanyId(keywordsCollaboration.getCompanyId());
		keywordsCollaborationImpl.setGroupId(keywordsCollaboration.getGroupId());
		keywordsCollaborationImpl.setKeywordId(keywordsCollaboration.getKeywordId());
		keywordsCollaborationImpl.setKeywordName(keywordsCollaboration.getKeywordName());
		keywordsCollaborationImpl.setUserId(keywordsCollaboration.getUserId());
		keywordsCollaborationImpl.setUserName(keywordsCollaboration.getUserName());
		keywordsCollaborationImpl.setStatus(keywordsCollaboration.getStatus());
		keywordsCollaborationImpl.setCreatedDate(keywordsCollaboration.getCreatedDate());
		keywordsCollaborationImpl.setModifiedDate(keywordsCollaboration.getModifiedDate());
		keywordsCollaborationImpl.setMarkAs(keywordsCollaboration.getMarkAs());

		return keywordsCollaborationImpl;
	}

	/**
	 * Returns the keywords collaboration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the keywords collaboration
	 * @return the keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeywordsCollaborationException, SystemException {
		KeywordsCollaboration keywordsCollaboration = fetchByPrimaryKey(primaryKey);

		if (keywordsCollaboration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeywordsCollaborationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keywordsCollaboration;
	}

	/**
	 * Returns the keywords collaboration with the primary key or throws a {@link com.nyu.NoSuchKeywordsCollaborationException} if it could not be found.
	 *
	 * @param id the primary key of the keywords collaboration
	 * @return the keywords collaboration
	 * @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration findByPrimaryKey(long id)
		throws NoSuchKeywordsCollaborationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the keywords collaboration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the keywords collaboration
	 * @return the keywords collaboration, or <code>null</code> if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KeywordsCollaboration keywordsCollaboration = (KeywordsCollaboration)EntityCacheUtil.getResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
				KeywordsCollaborationImpl.class, primaryKey);

		if (keywordsCollaboration == _nullKeywordsCollaboration) {
			return null;
		}

		if (keywordsCollaboration == null) {
			Session session = null;

			try {
				session = openSession();

				keywordsCollaboration = (KeywordsCollaboration)session.get(KeywordsCollaborationImpl.class,
						primaryKey);

				if (keywordsCollaboration != null) {
					cacheResult(keywordsCollaboration);
				}
				else {
					EntityCacheUtil.putResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
						KeywordsCollaborationImpl.class, primaryKey,
						_nullKeywordsCollaboration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KeywordsCollaborationModelImpl.ENTITY_CACHE_ENABLED,
					KeywordsCollaborationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keywordsCollaboration;
	}

	/**
	 * Returns the keywords collaboration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the keywords collaboration
	 * @return the keywords collaboration, or <code>null</code> if a keywords collaboration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeywordsCollaboration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the keywords collaborations.
	 *
	 * @return the keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the keywords collaborations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @return the range of keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the keywords collaborations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of keywords collaborations
	 * @param end the upper bound of the range of keywords collaborations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of keywords collaborations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeywordsCollaboration> findAll(int start, int end,
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

		List<KeywordsCollaboration> list = (List<KeywordsCollaboration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEYWORDSCOLLABORATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEYWORDSCOLLABORATION;

				if (pagination) {
					sql = sql.concat(KeywordsCollaborationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeywordsCollaboration>(list);
				}
				else {
					list = (List<KeywordsCollaboration>)QueryUtil.list(q,
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
	 * Removes all the keywords collaborations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KeywordsCollaboration keywordsCollaboration : findAll()) {
			remove(keywordsCollaboration);
		}
	}

	/**
	 * Returns the number of keywords collaborations.
	 *
	 * @return the number of keywords collaborations
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

				Query q = session.createQuery(_SQL_COUNT_KEYWORDSCOLLABORATION);

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
	 * Initializes the keywords collaboration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.KeywordsCollaboration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KeywordsCollaboration>> listenersList = new ArrayList<ModelListener<KeywordsCollaboration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KeywordsCollaboration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KeywordsCollaborationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEYWORDSCOLLABORATION = "SELECT keywordsCollaboration FROM KeywordsCollaboration keywordsCollaboration";
	private static final String _SQL_SELECT_KEYWORDSCOLLABORATION_WHERE = "SELECT keywordsCollaboration FROM KeywordsCollaboration keywordsCollaboration WHERE ";
	private static final String _SQL_COUNT_KEYWORDSCOLLABORATION = "SELECT COUNT(keywordsCollaboration) FROM KeywordsCollaboration keywordsCollaboration";
	private static final String _SQL_COUNT_KEYWORDSCOLLABORATION_WHERE = "SELECT COUNT(keywordsCollaboration) FROM KeywordsCollaboration keywordsCollaboration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keywordsCollaboration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KeywordsCollaboration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KeywordsCollaboration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KeywordsCollaborationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static KeywordsCollaboration _nullKeywordsCollaboration = new KeywordsCollaborationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KeywordsCollaboration> toCacheModel() {
				return _nullKeywordsCollaborationCacheModel;
			}
		};

	private static CacheModel<KeywordsCollaboration> _nullKeywordsCollaborationCacheModel =
		new CacheModel<KeywordsCollaboration>() {
			@Override
			public KeywordsCollaboration toEntityModel() {
				return _nullKeywordsCollaboration;
			}
		};
}