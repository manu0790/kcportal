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

import com.nyu.NoSuchUserGroupRequestException;

import com.nyu.model.UserGroupRequest;
import com.nyu.model.impl.UserGroupRequestImpl;
import com.nyu.model.impl.UserGroupRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user group request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserGroupRequestPersistence
 * @see UserGroupRequestUtil
 * @generated
 */
public class UserGroupRequestPersistenceImpl extends BasePersistenceImpl<UserGroupRequest>
	implements UserGroupRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserGroupRequestUtil} to access the user group request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserGroupRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER = new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByfindRequestStatusByUser",
			new String[] { Long.class.getName(), Long.class.getName() },
			UserGroupRequestModelImpl.USERGROUPID_COLUMN_BITMASK |
			UserGroupRequestModelImpl.REQUESTEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDREQUESTSTATUSBYUSER = new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindRequestStatusByUser",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or throws a {@link com.nyu.NoSuchUserGroupRequestException} if it could not be found.
	 *
	 * @param userGroupId the user group ID
	 * @param requestedBy the requested by
	 * @return the matching user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByfindRequestStatusByUser(long userGroupId,
		long requestedBy)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = fetchByfindRequestStatusByUser(userGroupId,
				requestedBy);

		if (userGroupRequest == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userGroupId=");
			msg.append(userGroupId);

			msg.append(", requestedBy=");
			msg.append(requestedBy);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserGroupRequestException(msg.toString());
		}

		return userGroupRequest;
	}

	/**
	 * Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userGroupId the user group ID
	 * @param requestedBy the requested by
	 * @return the matching user group request, or <code>null</code> if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByfindRequestStatusByUser(long userGroupId,
		long requestedBy) throws SystemException {
		return fetchByfindRequestStatusByUser(userGroupId, requestedBy, true);
	}

	/**
	 * Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userGroupId the user group ID
	 * @param requestedBy the requested by
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user group request, or <code>null</code> if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByfindRequestStatusByUser(long userGroupId,
		long requestedBy, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userGroupId, requestedBy };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
					finderArgs, this);
		}

		if (result instanceof UserGroupRequest) {
			UserGroupRequest userGroupRequest = (UserGroupRequest)result;

			if ((userGroupId != userGroupRequest.getUserGroupId()) ||
					(requestedBy != userGroupRequest.getRequestedBy())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_USERGROUPREQUEST_WHERE);

			query.append(_FINDER_COLUMN_FINDREQUESTSTATUSBYUSER_USERGROUPID_2);

			query.append(_FINDER_COLUMN_FINDREQUESTSTATUSBYUSER_REQUESTEDBY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userGroupId);

				qPos.add(requestedBy);

				List<UserGroupRequest> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserGroupRequestPersistenceImpl.fetchByfindRequestStatusByUser(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserGroupRequest userGroupRequest = list.get(0);

					result = userGroupRequest;

					cacheResult(userGroupRequest);

					if ((userGroupRequest.getUserGroupId() != userGroupId) ||
							(userGroupRequest.getRequestedBy() != requestedBy)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
							finderArgs, userGroupRequest);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
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
			return (UserGroupRequest)result;
		}
	}

	/**
	 * Removes the user group request where userGroupId = &#63; and requestedBy = &#63; from the database.
	 *
	 * @param userGroupId the user group ID
	 * @param requestedBy the requested by
	 * @return the user group request that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest removeByfindRequestStatusByUser(long userGroupId,
		long requestedBy)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = findByfindRequestStatusByUser(userGroupId,
				requestedBy);

		return remove(userGroupRequest);
	}

	/**
	 * Returns the number of user group requests where userGroupId = &#63; and requestedBy = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param requestedBy the requested by
	 * @return the number of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindRequestStatusByUser(long userGroupId, long requestedBy)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDREQUESTSTATUSBYUSER;

		Object[] finderArgs = new Object[] { userGroupId, requestedBy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERGROUPREQUEST_WHERE);

			query.append(_FINDER_COLUMN_FINDREQUESTSTATUSBYUSER_USERGROUPID_2);

			query.append(_FINDER_COLUMN_FINDREQUESTSTATUSBYUSER_REQUESTEDBY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userGroupId);

				qPos.add(requestedBy);

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

	private static final String _FINDER_COLUMN_FINDREQUESTSTATUSBYUSER_USERGROUPID_2 =
		"userGroupRequest.userGroupId = ? AND ";
	private static final String _FINDER_COLUMN_FINDREQUESTSTATUSBYUSER_REQUESTEDBY_2 =
		"userGroupRequest.requestedBy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS =
		new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindGroupRequestByStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS =
		new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindGroupRequestByStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			UserGroupRequestModelImpl.USERGROUPID_COLUMN_BITMASK |
			UserGroupRequestModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDGROUPREQUESTBYSTATUS =
		new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindGroupRequestByStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the user group requests where userGroupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @return the matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, String status) throws SystemException {
		return findByfindGroupRequestByStatus(userGroupId, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user group requests where userGroupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param start the lower bound of the range of user group requests
	 * @param end the upper bound of the range of user group requests (not inclusive)
	 * @return the range of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, String status, int start, int end)
		throws SystemException {
		return findByfindGroupRequestByStatus(userGroupId, status, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the user group requests where userGroupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param start the lower bound of the range of user group requests
	 * @param end the upper bound of the range of user group requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, String status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS;
			finderArgs = new Object[] { userGroupId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS;
			finderArgs = new Object[] {
					userGroupId, status,
					
					start, end, orderByComparator
				};
		}

		List<UserGroupRequest> list = (List<UserGroupRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserGroupRequest userGroupRequest : list) {
				if ((userGroupId != userGroupRequest.getUserGroupId()) ||
						!Validator.equals(status, userGroupRequest.getStatus())) {
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

			query.append(_SQL_SELECT_USERGROUPREQUEST_WHERE);

			query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_USERGROUPID_2);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserGroupRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userGroupId);

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<UserGroupRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserGroupRequest>(list);
				}
				else {
					list = (List<UserGroupRequest>)QueryUtil.list(q,
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
	 * Returns the first user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByfindGroupRequestByStatus_First(
		long userGroupId, String status, OrderByComparator orderByComparator)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = fetchByfindGroupRequestByStatus_First(userGroupId,
				status, orderByComparator);

		if (userGroupRequest != null) {
			return userGroupRequest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userGroupId=");
		msg.append(userGroupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserGroupRequestException(msg.toString());
	}

	/**
	 * Returns the first user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user group request, or <code>null</code> if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByfindGroupRequestByStatus_First(
		long userGroupId, String status, OrderByComparator orderByComparator)
		throws SystemException {
		List<UserGroupRequest> list = findByfindGroupRequestByStatus(userGroupId,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByfindGroupRequestByStatus_Last(
		long userGroupId, String status, OrderByComparator orderByComparator)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = fetchByfindGroupRequestByStatus_Last(userGroupId,
				status, orderByComparator);

		if (userGroupRequest != null) {
			return userGroupRequest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userGroupId=");
		msg.append(userGroupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserGroupRequestException(msg.toString());
	}

	/**
	 * Returns the last user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user group request, or <code>null</code> if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByfindGroupRequestByStatus_Last(
		long userGroupId, String status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByfindGroupRequestByStatus(userGroupId, status);

		if (count == 0) {
			return null;
		}

		List<UserGroupRequest> list = findByfindGroupRequestByStatus(userGroupId,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user group requests before and after the current user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current user group request
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest[] findByfindGroupRequestByStatus_PrevAndNext(
		long id, long userGroupId, String status,
		OrderByComparator orderByComparator)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserGroupRequest[] array = new UserGroupRequestImpl[3];

			array[0] = getByfindGroupRequestByStatus_PrevAndNext(session,
					userGroupRequest, userGroupId, status, orderByComparator,
					true);

			array[1] = userGroupRequest;

			array[2] = getByfindGroupRequestByStatus_PrevAndNext(session,
					userGroupRequest, userGroupId, status, orderByComparator,
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

	protected UserGroupRequest getByfindGroupRequestByStatus_PrevAndNext(
		Session session, UserGroupRequest userGroupRequest, long userGroupId,
		String status, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERGROUPREQUEST_WHERE);

		query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_USERGROUPID_2);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_2);
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
			query.append(UserGroupRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userGroupId);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userGroupRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserGroupRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user group requests where userGroupId = &#63; and status = &#63; from the database.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindGroupRequestByStatus(long userGroupId, String status)
		throws SystemException {
		for (UserGroupRequest userGroupRequest : findByfindGroupRequestByStatus(
				userGroupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userGroupRequest);
		}
	}

	/**
	 * Returns the number of user group requests where userGroupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the user group ID
	 * @param status the status
	 * @return the number of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindGroupRequestByStatus(long userGroupId, String status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDGROUPREQUESTBYSTATUS;

		Object[] finderArgs = new Object[] { userGroupId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERGROUPREQUEST_WHERE);

			query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_USERGROUPID_2);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userGroupId);

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

	private static final String _FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_USERGROUPID_2 =
		"userGroupRequest.userGroupId = ? AND ";
	private static final String _FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_1 =
		"userGroupRequest.status IS NULL";
	private static final String _FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_2 =
		"userGroupRequest.status = ?";
	private static final String _FINDER_COLUMN_FINDGROUPREQUESTBYSTATUS_STATUS_3 =
		"(userGroupRequest.status IS NULL OR userGroupRequest.status = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTEDBY =
		new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByrequestedBy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTEDBY =
		new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED,
			UserGroupRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrequestedBy",
			new String[] { Long.class.getName() },
			UserGroupRequestModelImpl.REQUESTEDBY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTEDBY = new FinderPath(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrequestedBy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user group requests where requestedBy = &#63;.
	 *
	 * @param requestedBy the requested by
	 * @return the matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findByrequestedBy(long requestedBy)
		throws SystemException {
		return findByrequestedBy(requestedBy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user group requests where requestedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestedBy the requested by
	 * @param start the lower bound of the range of user group requests
	 * @param end the upper bound of the range of user group requests (not inclusive)
	 * @return the range of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findByrequestedBy(long requestedBy,
		int start, int end) throws SystemException {
		return findByrequestedBy(requestedBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user group requests where requestedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestedBy the requested by
	 * @param start the lower bound of the range of user group requests
	 * @param end the upper bound of the range of user group requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findByrequestedBy(long requestedBy,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTEDBY;
			finderArgs = new Object[] { requestedBy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTEDBY;
			finderArgs = new Object[] { requestedBy, start, end, orderByComparator };
		}

		List<UserGroupRequest> list = (List<UserGroupRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserGroupRequest userGroupRequest : list) {
				if ((requestedBy != userGroupRequest.getRequestedBy())) {
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

			query.append(_SQL_SELECT_USERGROUPREQUEST_WHERE);

			query.append(_FINDER_COLUMN_REQUESTEDBY_REQUESTEDBY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserGroupRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requestedBy);

				if (!pagination) {
					list = (List<UserGroupRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserGroupRequest>(list);
				}
				else {
					list = (List<UserGroupRequest>)QueryUtil.list(q,
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
	 * Returns the first user group request in the ordered set where requestedBy = &#63;.
	 *
	 * @param requestedBy the requested by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByrequestedBy_First(long requestedBy,
		OrderByComparator orderByComparator)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = fetchByrequestedBy_First(requestedBy,
				orderByComparator);

		if (userGroupRequest != null) {
			return userGroupRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestedBy=");
		msg.append(requestedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserGroupRequestException(msg.toString());
	}

	/**
	 * Returns the first user group request in the ordered set where requestedBy = &#63;.
	 *
	 * @param requestedBy the requested by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user group request, or <code>null</code> if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByrequestedBy_First(long requestedBy,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserGroupRequest> list = findByrequestedBy(requestedBy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user group request in the ordered set where requestedBy = &#63;.
	 *
	 * @param requestedBy the requested by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByrequestedBy_Last(long requestedBy,
		OrderByComparator orderByComparator)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = fetchByrequestedBy_Last(requestedBy,
				orderByComparator);

		if (userGroupRequest != null) {
			return userGroupRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestedBy=");
		msg.append(requestedBy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserGroupRequestException(msg.toString());
	}

	/**
	 * Returns the last user group request in the ordered set where requestedBy = &#63;.
	 *
	 * @param requestedBy the requested by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user group request, or <code>null</code> if a matching user group request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByrequestedBy_Last(long requestedBy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByrequestedBy(requestedBy);

		if (count == 0) {
			return null;
		}

		List<UserGroupRequest> list = findByrequestedBy(requestedBy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user group requests before and after the current user group request in the ordered set where requestedBy = &#63;.
	 *
	 * @param id the primary key of the current user group request
	 * @param requestedBy the requested by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest[] findByrequestedBy_PrevAndNext(long id,
		long requestedBy, OrderByComparator orderByComparator)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserGroupRequest[] array = new UserGroupRequestImpl[3];

			array[0] = getByrequestedBy_PrevAndNext(session, userGroupRequest,
					requestedBy, orderByComparator, true);

			array[1] = userGroupRequest;

			array[2] = getByrequestedBy_PrevAndNext(session, userGroupRequest,
					requestedBy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserGroupRequest getByrequestedBy_PrevAndNext(Session session,
		UserGroupRequest userGroupRequest, long requestedBy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERGROUPREQUEST_WHERE);

		query.append(_FINDER_COLUMN_REQUESTEDBY_REQUESTEDBY_2);

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
			query.append(UserGroupRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(requestedBy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userGroupRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserGroupRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user group requests where requestedBy = &#63; from the database.
	 *
	 * @param requestedBy the requested by
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByrequestedBy(long requestedBy) throws SystemException {
		for (UserGroupRequest userGroupRequest : findByrequestedBy(
				requestedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userGroupRequest);
		}
	}

	/**
	 * Returns the number of user group requests where requestedBy = &#63;.
	 *
	 * @param requestedBy the requested by
	 * @return the number of matching user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByrequestedBy(long requestedBy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUESTEDBY;

		Object[] finderArgs = new Object[] { requestedBy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERGROUPREQUEST_WHERE);

			query.append(_FINDER_COLUMN_REQUESTEDBY_REQUESTEDBY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(requestedBy);

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

	private static final String _FINDER_COLUMN_REQUESTEDBY_REQUESTEDBY_2 = "userGroupRequest.requestedBy = ?";

	public UserGroupRequestPersistenceImpl() {
		setModelClass(UserGroupRequest.class);
	}

	/**
	 * Caches the user group request in the entity cache if it is enabled.
	 *
	 * @param userGroupRequest the user group request
	 */
	@Override
	public void cacheResult(UserGroupRequest userGroupRequest) {
		EntityCacheUtil.putResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestImpl.class, userGroupRequest.getPrimaryKey(),
			userGroupRequest);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
			new Object[] {
				userGroupRequest.getUserGroupId(),
				userGroupRequest.getRequestedBy()
			}, userGroupRequest);

		userGroupRequest.resetOriginalValues();
	}

	/**
	 * Caches the user group requests in the entity cache if it is enabled.
	 *
	 * @param userGroupRequests the user group requests
	 */
	@Override
	public void cacheResult(List<UserGroupRequest> userGroupRequests) {
		for (UserGroupRequest userGroupRequest : userGroupRequests) {
			if (EntityCacheUtil.getResult(
						UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
						UserGroupRequestImpl.class,
						userGroupRequest.getPrimaryKey()) == null) {
				cacheResult(userGroupRequest);
			}
			else {
				userGroupRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user group requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserGroupRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserGroupRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user group request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserGroupRequest userGroupRequest) {
		EntityCacheUtil.removeResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestImpl.class, userGroupRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userGroupRequest);
	}

	@Override
	public void clearCache(List<UserGroupRequest> userGroupRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserGroupRequest userGroupRequest : userGroupRequests) {
			EntityCacheUtil.removeResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
				UserGroupRequestImpl.class, userGroupRequest.getPrimaryKey());

			clearUniqueFindersCache(userGroupRequest);
		}
	}

	protected void cacheUniqueFindersCache(UserGroupRequest userGroupRequest) {
		if (userGroupRequest.isNew()) {
			Object[] args = new Object[] {
					userGroupRequest.getUserGroupId(),
					userGroupRequest.getRequestedBy()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDREQUESTSTATUSBYUSER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
				args, userGroupRequest);
		}
		else {
			UserGroupRequestModelImpl userGroupRequestModelImpl = (UserGroupRequestModelImpl)userGroupRequest;

			if ((userGroupRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userGroupRequest.getUserGroupId(),
						userGroupRequest.getRequestedBy()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FINDREQUESTSTATUSBYUSER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
					args, userGroupRequest);
			}
		}
	}

	protected void clearUniqueFindersCache(UserGroupRequest userGroupRequest) {
		UserGroupRequestModelImpl userGroupRequestModelImpl = (UserGroupRequestModelImpl)userGroupRequest;

		Object[] args = new Object[] {
				userGroupRequest.getUserGroupId(),
				userGroupRequest.getRequestedBy()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDREQUESTSTATUSBYUSER,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
			args);

		if ((userGroupRequestModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER.getColumnBitmask()) != 0) {
			args = new Object[] {
					userGroupRequestModelImpl.getOriginalUserGroupId(),
					userGroupRequestModelImpl.getOriginalRequestedBy()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDREQUESTSTATUSBYUSER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FINDREQUESTSTATUSBYUSER,
				args);
		}
	}

	/**
	 * Creates a new user group request with the primary key. Does not add the user group request to the database.
	 *
	 * @param id the primary key for the new user group request
	 * @return the new user group request
	 */
	@Override
	public UserGroupRequest create(long id) {
		UserGroupRequest userGroupRequest = new UserGroupRequestImpl();

		userGroupRequest.setNew(true);
		userGroupRequest.setPrimaryKey(id);

		return userGroupRequest;
	}

	/**
	 * Removes the user group request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user group request
	 * @return the user group request that was removed
	 * @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest remove(long id)
		throws NoSuchUserGroupRequestException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user group request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user group request
	 * @return the user group request that was removed
	 * @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest remove(Serializable primaryKey)
		throws NoSuchUserGroupRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserGroupRequest userGroupRequest = (UserGroupRequest)session.get(UserGroupRequestImpl.class,
					primaryKey);

			if (userGroupRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserGroupRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userGroupRequest);
		}
		catch (NoSuchUserGroupRequestException nsee) {
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
	protected UserGroupRequest removeImpl(UserGroupRequest userGroupRequest)
		throws SystemException {
		userGroupRequest = toUnwrappedModel(userGroupRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userGroupRequest)) {
				userGroupRequest = (UserGroupRequest)session.get(UserGroupRequestImpl.class,
						userGroupRequest.getPrimaryKeyObj());
			}

			if (userGroupRequest != null) {
				session.delete(userGroupRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userGroupRequest != null) {
			clearCache(userGroupRequest);
		}

		return userGroupRequest;
	}

	@Override
	public UserGroupRequest updateImpl(
		com.nyu.model.UserGroupRequest userGroupRequest)
		throws SystemException {
		userGroupRequest = toUnwrappedModel(userGroupRequest);

		boolean isNew = userGroupRequest.isNew();

		UserGroupRequestModelImpl userGroupRequestModelImpl = (UserGroupRequestModelImpl)userGroupRequest;

		Session session = null;

		try {
			session = openSession();

			if (userGroupRequest.isNew()) {
				session.save(userGroupRequest);

				userGroupRequest.setNew(false);
			}
			else {
				session.merge(userGroupRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserGroupRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userGroupRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userGroupRequestModelImpl.getOriginalUserGroupId(),
						userGroupRequestModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDGROUPREQUESTBYSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS,
					args);

				args = new Object[] {
						userGroupRequestModelImpl.getUserGroupId(),
						userGroupRequestModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDGROUPREQUESTBYSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDGROUPREQUESTBYSTATUS,
					args);
			}

			if ((userGroupRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTEDBY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userGroupRequestModelImpl.getOriginalRequestedBy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTEDBY,
					args);

				args = new Object[] { userGroupRequestModelImpl.getRequestedBy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTEDBY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTEDBY,
					args);
			}
		}

		EntityCacheUtil.putResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
			UserGroupRequestImpl.class, userGroupRequest.getPrimaryKey(),
			userGroupRequest);

		clearUniqueFindersCache(userGroupRequest);
		cacheUniqueFindersCache(userGroupRequest);

		return userGroupRequest;
	}

	protected UserGroupRequest toUnwrappedModel(
		UserGroupRequest userGroupRequest) {
		if (userGroupRequest instanceof UserGroupRequestImpl) {
			return userGroupRequest;
		}

		UserGroupRequestImpl userGroupRequestImpl = new UserGroupRequestImpl();

		userGroupRequestImpl.setNew(userGroupRequest.isNew());
		userGroupRequestImpl.setPrimaryKey(userGroupRequest.getPrimaryKey());

		userGroupRequestImpl.setId(userGroupRequest.getId());
		userGroupRequestImpl.setUserGroupId(userGroupRequest.getUserGroupId());
		userGroupRequestImpl.setCompanyId(userGroupRequest.getCompanyId());
		userGroupRequestImpl.setGroupId(userGroupRequest.getGroupId());
		userGroupRequestImpl.setUserGroupOwner(userGroupRequest.getUserGroupOwner());
		userGroupRequestImpl.setRequestDate(userGroupRequest.getRequestDate());
		userGroupRequestImpl.setRequestedBy(userGroupRequest.getRequestedBy());
		userGroupRequestImpl.setStatus(userGroupRequest.getStatus());

		return userGroupRequestImpl;
	}

	/**
	 * Returns the user group request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user group request
	 * @return the user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserGroupRequestException, SystemException {
		UserGroupRequest userGroupRequest = fetchByPrimaryKey(primaryKey);

		if (userGroupRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserGroupRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userGroupRequest;
	}

	/**
	 * Returns the user group request with the primary key or throws a {@link com.nyu.NoSuchUserGroupRequestException} if it could not be found.
	 *
	 * @param id the primary key of the user group request
	 * @return the user group request
	 * @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest findByPrimaryKey(long id)
		throws NoSuchUserGroupRequestException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user group request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user group request
	 * @return the user group request, or <code>null</code> if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserGroupRequest userGroupRequest = (UserGroupRequest)EntityCacheUtil.getResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
				UserGroupRequestImpl.class, primaryKey);

		if (userGroupRequest == _nullUserGroupRequest) {
			return null;
		}

		if (userGroupRequest == null) {
			Session session = null;

			try {
				session = openSession();

				userGroupRequest = (UserGroupRequest)session.get(UserGroupRequestImpl.class,
						primaryKey);

				if (userGroupRequest != null) {
					cacheResult(userGroupRequest);
				}
				else {
					EntityCacheUtil.putResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
						UserGroupRequestImpl.class, primaryKey,
						_nullUserGroupRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserGroupRequestModelImpl.ENTITY_CACHE_ENABLED,
					UserGroupRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userGroupRequest;
	}

	/**
	 * Returns the user group request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user group request
	 * @return the user group request, or <code>null</code> if a user group request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserGroupRequest fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user group requests.
	 *
	 * @return the user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user group requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user group requests
	 * @param end the upper bound of the range of user group requests (not inclusive)
	 * @return the range of user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user group requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user group requests
	 * @param end the upper bound of the range of user group requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user group requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserGroupRequest> findAll(int start, int end,
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

		List<UserGroupRequest> list = (List<UserGroupRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERGROUPREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERGROUPREQUEST;

				if (pagination) {
					sql = sql.concat(UserGroupRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserGroupRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserGroupRequest>(list);
				}
				else {
					list = (List<UserGroupRequest>)QueryUtil.list(q,
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
	 * Removes all the user group requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserGroupRequest userGroupRequest : findAll()) {
			remove(userGroupRequest);
		}
	}

	/**
	 * Returns the number of user group requests.
	 *
	 * @return the number of user group requests
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

				Query q = session.createQuery(_SQL_COUNT_USERGROUPREQUEST);

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
	 * Initializes the user group request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.UserGroupRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserGroupRequest>> listenersList = new ArrayList<ModelListener<UserGroupRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserGroupRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserGroupRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERGROUPREQUEST = "SELECT userGroupRequest FROM UserGroupRequest userGroupRequest";
	private static final String _SQL_SELECT_USERGROUPREQUEST_WHERE = "SELECT userGroupRequest FROM UserGroupRequest userGroupRequest WHERE ";
	private static final String _SQL_COUNT_USERGROUPREQUEST = "SELECT COUNT(userGroupRequest) FROM UserGroupRequest userGroupRequest";
	private static final String _SQL_COUNT_USERGROUPREQUEST_WHERE = "SELECT COUNT(userGroupRequest) FROM UserGroupRequest userGroupRequest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userGroupRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserGroupRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserGroupRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserGroupRequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static UserGroupRequest _nullUserGroupRequest = new UserGroupRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserGroupRequest> toCacheModel() {
				return _nullUserGroupRequestCacheModel;
			}
		};

	private static CacheModel<UserGroupRequest> _nullUserGroupRequestCacheModel = new CacheModel<UserGroupRequest>() {
			@Override
			public UserGroupRequest toEntityModel() {
				return _nullUserGroupRequest;
			}
		};
}