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
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchNYUUserGroupException;

import com.nyu.model.NYUUserGroup;
import com.nyu.model.impl.NYUUserGroupImpl;
import com.nyu.model.impl.NYUUserGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the n y u user group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroupPersistence
 * @see NYUUserGroupUtil
 * @generated
 */
public class NYUUserGroupPersistenceImpl extends BasePersistenceImpl<NYUUserGroup>
	implements NYUUserGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NYUUserGroupUtil} to access the n y u user group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NYUUserGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			NYUUserGroupModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the n y u user groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n y u user groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByUuid(String uuid, int start, int end,
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

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NYUUserGroup nyuUserGroup : list) {
				if (!Validator.equals(uuid, nyuUserGroup.getUuid())) {
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

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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
				query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
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
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n y u user group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByUuid_First(uuid, orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the first n y u user group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<NYUUserGroup> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n y u user group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByUuid_Last(uuid, orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the last n y u user group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NYUUserGroup> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n y u user groups before and after the current n y u user group in the ordered set where uuid = &#63;.
	 *
	 * @param userGroupId the primary key of the current n y u user group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup[] findByUuid_PrevAndNext(long userGroupId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByPrimaryKey(userGroupId);

		Session session = null;

		try {
			session = openSession();

			NYUUserGroup[] array = new NYUUserGroupImpl[3];

			array[0] = getByUuid_PrevAndNext(session, nyuUserGroup, uuid,
					orderByComparator, true);

			array[1] = nyuUserGroup;

			array[2] = getByUuid_PrevAndNext(session, nyuUserGroup, uuid,
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

	protected NYUUserGroup getByUuid_PrevAndNext(Session session,
		NYUUserGroup nyuUserGroup, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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
			query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(nyuUserGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NYUUserGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n y u user groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (NYUUserGroup nyuUserGroup : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching n y u user groups
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

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "nyuUserGroup.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "nyuUserGroup.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(nyuUserGroup.uuid IS NULL OR nyuUserGroup.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			NYUUserGroupModelImpl.UUID_COLUMN_BITMASK |
			NYUUserGroupModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the n y u user group where uuid = &#63; and groupId = &#63; or throws a {@link com.nyu.NoSuchNYUUserGroupException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByUUID_G(String uuid, long groupId)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByUUID_G(uuid, groupId);

		if (nyuUserGroup == null) {
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

			throw new NoSuchNYUUserGroupException(msg.toString());
		}

		return nyuUserGroup;
	}

	/**
	 * Returns the n y u user group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the n y u user group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof NYUUserGroup) {
			NYUUserGroup nyuUserGroup = (NYUUserGroup)result;

			if (!Validator.equals(uuid, nyuUserGroup.getUuid()) ||
					(groupId != nyuUserGroup.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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

				List<NYUUserGroup> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					NYUUserGroup nyuUserGroup = list.get(0);

					result = nyuUserGroup;

					cacheResult(nyuUserGroup);

					if ((nyuUserGroup.getUuid() == null) ||
							!nyuUserGroup.getUuid().equals(uuid) ||
							(nyuUserGroup.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, nyuUserGroup);
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
			return (NYUUserGroup)result;
		}
	}

	/**
	 * Removes the n y u user group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the n y u user group that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup removeByUUID_G(String uuid, long groupId)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByUUID_G(uuid, groupId);

		return remove(nyuUserGroup);
	}

	/**
	 * Returns the number of n y u user groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching n y u user groups
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

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "nyuUserGroup.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "nyuUserGroup.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(nyuUserGroup.uuid IS NULL OR nyuUserGroup.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "nyuUserGroup.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			NYUUserGroupModelImpl.UUID_COLUMN_BITMASK |
			NYUUserGroupModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the n y u user groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n y u user groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NYUUserGroup nyuUserGroup : list) {
				if (!Validator.equals(uuid, nyuUserGroup.getUuid()) ||
						(companyId != nyuUserGroup.getCompanyId())) {
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

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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
				query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
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
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the first n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NYUUserGroup> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the last n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NYUUserGroup> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n y u user groups before and after the current n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param userGroupId the primary key of the current n y u user group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup[] findByUuid_C_PrevAndNext(long userGroupId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByPrimaryKey(userGroupId);

		Session session = null;

		try {
			session = openSession();

			NYUUserGroup[] array = new NYUUserGroupImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, nyuUserGroup, uuid,
					companyId, orderByComparator, true);

			array[1] = nyuUserGroup;

			array[2] = getByUuid_C_PrevAndNext(session, nyuUserGroup, uuid,
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

	protected NYUUserGroup getByUuid_C_PrevAndNext(Session session,
		NYUUserGroup nyuUserGroup, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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
			query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(nyuUserGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NYUUserGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n y u user groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (NYUUserGroup nyuUserGroup : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching n y u user groups
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

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "nyuUserGroup.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "nyuUserGroup.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(nyuUserGroup.uuid IS NULL OR nyuUserGroup.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "nyuUserGroup.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPPRIVACY =
		new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupPrivacy",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPPRIVACY =
		new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupPrivacy",
			new String[] { String.class.getName() },
			NYUUserGroupModelImpl.GROUPPRIVACY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPPRIVACY = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupPrivacy",
			new String[] { String.class.getName() });

	/**
	 * Returns all the n y u user groups where groupPrivacy = &#63;.
	 *
	 * @param groupPrivacy the group privacy
	 * @return the matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findBygroupPrivacy(String groupPrivacy)
		throws SystemException {
		return findBygroupPrivacy(groupPrivacy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n y u user groups where groupPrivacy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupPrivacy the group privacy
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findBygroupPrivacy(String groupPrivacy,
		int start, int end) throws SystemException {
		return findBygroupPrivacy(groupPrivacy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups where groupPrivacy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupPrivacy the group privacy
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findBygroupPrivacy(String groupPrivacy,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPPRIVACY;
			finderArgs = new Object[] { groupPrivacy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPPRIVACY;
			finderArgs = new Object[] {
					groupPrivacy,
					
					start, end, orderByComparator
				};
		}

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NYUUserGroup nyuUserGroup : list) {
				if (!Validator.equals(groupPrivacy,
							nyuUserGroup.getGroupPrivacy())) {
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

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

			boolean bindGroupPrivacy = false;

			if (groupPrivacy == null) {
				query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_1);
			}
			else if (groupPrivacy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_3);
			}
			else {
				bindGroupPrivacy = true;

				query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGroupPrivacy) {
					qPos.add(groupPrivacy);
				}

				if (!pagination) {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n y u user group in the ordered set where groupPrivacy = &#63;.
	 *
	 * @param groupPrivacy the group privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findBygroupPrivacy_First(String groupPrivacy,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchBygroupPrivacy_First(groupPrivacy,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupPrivacy=");
		msg.append(groupPrivacy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the first n y u user group in the ordered set where groupPrivacy = &#63;.
	 *
	 * @param groupPrivacy the group privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchBygroupPrivacy_First(String groupPrivacy,
		OrderByComparator orderByComparator) throws SystemException {
		List<NYUUserGroup> list = findBygroupPrivacy(groupPrivacy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n y u user group in the ordered set where groupPrivacy = &#63;.
	 *
	 * @param groupPrivacy the group privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findBygroupPrivacy_Last(String groupPrivacy,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchBygroupPrivacy_Last(groupPrivacy,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupPrivacy=");
		msg.append(groupPrivacy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the last n y u user group in the ordered set where groupPrivacy = &#63;.
	 *
	 * @param groupPrivacy the group privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchBygroupPrivacy_Last(String groupPrivacy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBygroupPrivacy(groupPrivacy);

		if (count == 0) {
			return null;
		}

		List<NYUUserGroup> list = findBygroupPrivacy(groupPrivacy, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n y u user groups before and after the current n y u user group in the ordered set where groupPrivacy = &#63;.
	 *
	 * @param userGroupId the primary key of the current n y u user group
	 * @param groupPrivacy the group privacy
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup[] findBygroupPrivacy_PrevAndNext(long userGroupId,
		String groupPrivacy, OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByPrimaryKey(userGroupId);

		Session session = null;

		try {
			session = openSession();

			NYUUserGroup[] array = new NYUUserGroupImpl[3];

			array[0] = getBygroupPrivacy_PrevAndNext(session, nyuUserGroup,
					groupPrivacy, orderByComparator, true);

			array[1] = nyuUserGroup;

			array[2] = getBygroupPrivacy_PrevAndNext(session, nyuUserGroup,
					groupPrivacy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NYUUserGroup getBygroupPrivacy_PrevAndNext(Session session,
		NYUUserGroup nyuUserGroup, String groupPrivacy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

		boolean bindGroupPrivacy = false;

		if (groupPrivacy == null) {
			query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_1);
		}
		else if (groupPrivacy.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_3);
		}
		else {
			bindGroupPrivacy = true;

			query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_2);
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
			query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindGroupPrivacy) {
			qPos.add(groupPrivacy);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nyuUserGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NYUUserGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n y u user groups where groupPrivacy = &#63; from the database.
	 *
	 * @param groupPrivacy the group privacy
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygroupPrivacy(String groupPrivacy)
		throws SystemException {
		for (NYUUserGroup nyuUserGroup : findBygroupPrivacy(groupPrivacy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups where groupPrivacy = &#63;.
	 *
	 * @param groupPrivacy the group privacy
	 * @return the number of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygroupPrivacy(String groupPrivacy)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPPRIVACY;

		Object[] finderArgs = new Object[] { groupPrivacy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

			boolean bindGroupPrivacy = false;

			if (groupPrivacy == null) {
				query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_1);
			}
			else if (groupPrivacy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_3);
			}
			else {
				bindGroupPrivacy = true;

				query.append(_FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGroupPrivacy) {
					qPos.add(groupPrivacy);
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

	private static final String _FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_1 = "nyuUserGroup.groupPrivacy IS NULL";
	private static final String _FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_2 = "nyuUserGroup.groupPrivacy = ?";
	private static final String _FINDER_COLUMN_GROUPPRIVACY_GROUPPRIVACY_3 = "(nyuUserGroup.groupPrivacy IS NULL OR nyuUserGroup.groupPrivacy = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			NYUUserGroupModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the n y u user groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n y u user groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByGroupId(long groupId, int start, int end,
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

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NYUUserGroup nyuUserGroup : list) {
				if ((groupId != nyuUserGroup.getGroupId())) {
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

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n y u user group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByGroupId_First(groupId,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the first n y u user group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NYUUserGroup> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n y u user group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the last n y u user group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<NYUUserGroup> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n y u user groups before and after the current n y u user group in the ordered set where groupId = &#63;.
	 *
	 * @param userGroupId the primary key of the current n y u user group
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup[] findByGroupId_PrevAndNext(long userGroupId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByPrimaryKey(userGroupId);

		Session session = null;

		try {
			session = openSession();

			NYUUserGroup[] array = new NYUUserGroupImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, nyuUserGroup, groupId,
					orderByComparator, true);

			array[1] = nyuUserGroup;

			array[2] = getByGroupId_PrevAndNext(session, nyuUserGroup, groupId,
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

	protected NYUUserGroup getByGroupId_PrevAndNext(Session session,
		NYUUserGroup nyuUserGroup, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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
			query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nyuUserGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NYUUserGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n y u user groups where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (NYUUserGroup nyuUserGroup : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching n y u user groups
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

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "nyuUserGroup.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			NYUUserGroupModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the n y u user groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the n y u user groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NYUUserGroup nyuUserGroup : list) {
				if ((companyId != nyuUserGroup.getCompanyId())) {
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

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n y u user group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the first n y u user group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NYUUserGroup> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n y u user group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the last n y u user group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<NYUUserGroup> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n y u user groups before and after the current n y u user group in the ordered set where companyId = &#63;.
	 *
	 * @param userGroupId the primary key of the current n y u user group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup[] findByCompanyId_PrevAndNext(long userGroupId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByPrimaryKey(userGroupId);

		Session session = null;

		try {
			session = openSession();

			NYUUserGroup[] array = new NYUUserGroupImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, nyuUserGroup,
					companyId, orderByComparator, true);

			array[1] = nyuUserGroup;

			array[2] = getByCompanyId_PrevAndNext(session, nyuUserGroup,
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

	protected NYUUserGroup getByCompanyId_PrevAndNext(Session session,
		NYUUserGroup nyuUserGroup, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

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
			query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nyuUserGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NYUUserGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n y u user groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (NYUUserGroup nyuUserGroup : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching n y u user groups
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

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "nyuUserGroup.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, NYUUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() },
			NYUUserGroupModelImpl.GROUPID_COLUMN_BITMASK |
			NYUUserGroupModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the n y u user groups where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByG_S(long groupId, int status)
		throws SystemException {
		return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the n y u user groups where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByG_S(long groupId, int status, int start,
		int end) throws SystemException {
		return findByG_S(groupId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] { groupId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] {
					groupId, status,
					
					start, end, orderByComparator
				};
		}

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NYUUserGroup nyuUserGroup : list) {
				if ((groupId != nyuUserGroup.getGroupId()) ||
						(status != nyuUserGroup.getStatus())) {
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

			query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				if (!pagination) {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByG_S_First(long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByG_S_First(groupId, status,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the first n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByG_S_First(long groupId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		List<NYUUserGroup> list = findByG_S(groupId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByG_S_Last(long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByG_S_Last(groupId, status,
				orderByComparator);

		if (nyuUserGroup != null) {
			return nyuUserGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNYUUserGroupException(msg.toString());
	}

	/**
	 * Returns the last n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByG_S_Last(long groupId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_S(groupId, status);

		if (count == 0) {
			return null;
		}

		List<NYUUserGroup> list = findByG_S(groupId, status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n y u user groups before and after the current n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param userGroupId the primary key of the current n y u user group
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup[] findByG_S_PrevAndNext(long userGroupId, long groupId,
		int status, OrderByComparator orderByComparator)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = findByPrimaryKey(userGroupId);

		Session session = null;

		try {
			session = openSession();

			NYUUserGroup[] array = new NYUUserGroupImpl[3];

			array[0] = getByG_S_PrevAndNext(session, nyuUserGroup, groupId,
					status, orderByComparator, true);

			array[1] = nyuUserGroup;

			array[2] = getByG_S_PrevAndNext(session, nyuUserGroup, groupId,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NYUUserGroup getByG_S_PrevAndNext(Session session,
		NYUUserGroup nyuUserGroup, long groupId, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NYUUSERGROUP_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_STATUS_2);

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
			query.append(NYUUserGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nyuUserGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NYUUserGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n y u user groups where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_S(long groupId, int status) throws SystemException {
		for (NYUUserGroup nyuUserGroup : findByG_S(groupId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_S(long groupId, int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NYUUSERGROUP_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "nyuUserGroup.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_STATUS_2 = "nyuUserGroup.status = ?";

	public NYUUserGroupPersistenceImpl() {
		setModelClass(NYUUserGroup.class);
	}

	/**
	 * Caches the n y u user group in the entity cache if it is enabled.
	 *
	 * @param nyuUserGroup the n y u user group
	 */
	@Override
	public void cacheResult(NYUUserGroup nyuUserGroup) {
		EntityCacheUtil.putResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupImpl.class, nyuUserGroup.getPrimaryKey(), nyuUserGroup);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { nyuUserGroup.getUuid(), nyuUserGroup.getGroupId() },
			nyuUserGroup);

		nyuUserGroup.resetOriginalValues();
	}

	/**
	 * Caches the n y u user groups in the entity cache if it is enabled.
	 *
	 * @param nyuUserGroups the n y u user groups
	 */
	@Override
	public void cacheResult(List<NYUUserGroup> nyuUserGroups) {
		for (NYUUserGroup nyuUserGroup : nyuUserGroups) {
			if (EntityCacheUtil.getResult(
						NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
						NYUUserGroupImpl.class, nyuUserGroup.getPrimaryKey()) == null) {
				cacheResult(nyuUserGroup);
			}
			else {
				nyuUserGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all n y u user groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NYUUserGroupImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NYUUserGroupImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the n y u user group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NYUUserGroup nyuUserGroup) {
		EntityCacheUtil.removeResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupImpl.class, nyuUserGroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(nyuUserGroup);
	}

	@Override
	public void clearCache(List<NYUUserGroup> nyuUserGroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NYUUserGroup nyuUserGroup : nyuUserGroups) {
			EntityCacheUtil.removeResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
				NYUUserGroupImpl.class, nyuUserGroup.getPrimaryKey());

			clearUniqueFindersCache(nyuUserGroup);
		}
	}

	protected void cacheUniqueFindersCache(NYUUserGroup nyuUserGroup) {
		if (nyuUserGroup.isNew()) {
			Object[] args = new Object[] {
					nyuUserGroup.getUuid(), nyuUserGroup.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				nyuUserGroup);
		}
		else {
			NYUUserGroupModelImpl nyuUserGroupModelImpl = (NYUUserGroupModelImpl)nyuUserGroup;

			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroup.getUuid(), nyuUserGroup.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					nyuUserGroup);
			}
		}
	}

	protected void clearUniqueFindersCache(NYUUserGroup nyuUserGroup) {
		NYUUserGroupModelImpl nyuUserGroupModelImpl = (NYUUserGroupModelImpl)nyuUserGroup;

		Object[] args = new Object[] {
				nyuUserGroup.getUuid(), nyuUserGroup.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((nyuUserGroupModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					nyuUserGroupModelImpl.getOriginalUuid(),
					nyuUserGroupModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new n y u user group with the primary key. Does not add the n y u user group to the database.
	 *
	 * @param userGroupId the primary key for the new n y u user group
	 * @return the new n y u user group
	 */
	@Override
	public NYUUserGroup create(long userGroupId) {
		NYUUserGroup nyuUserGroup = new NYUUserGroupImpl();

		nyuUserGroup.setNew(true);
		nyuUserGroup.setPrimaryKey(userGroupId);

		String uuid = PortalUUIDUtil.generate();

		nyuUserGroup.setUuid(uuid);

		return nyuUserGroup;
	}

	/**
	 * Removes the n y u user group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userGroupId the primary key of the n y u user group
	 * @return the n y u user group that was removed
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup remove(long userGroupId)
		throws NoSuchNYUUserGroupException, SystemException {
		return remove((Serializable)userGroupId);
	}

	/**
	 * Removes the n y u user group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the n y u user group
	 * @return the n y u user group that was removed
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup remove(Serializable primaryKey)
		throws NoSuchNYUUserGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NYUUserGroup nyuUserGroup = (NYUUserGroup)session.get(NYUUserGroupImpl.class,
					primaryKey);

			if (nyuUserGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNYUUserGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nyuUserGroup);
		}
		catch (NoSuchNYUUserGroupException nsee) {
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
	protected NYUUserGroup removeImpl(NYUUserGroup nyuUserGroup)
		throws SystemException {
		nyuUserGroup = toUnwrappedModel(nyuUserGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nyuUserGroup)) {
				nyuUserGroup = (NYUUserGroup)session.get(NYUUserGroupImpl.class,
						nyuUserGroup.getPrimaryKeyObj());
			}

			if (nyuUserGroup != null) {
				session.delete(nyuUserGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nyuUserGroup != null) {
			clearCache(nyuUserGroup);
		}

		return nyuUserGroup;
	}

	@Override
	public NYUUserGroup updateImpl(com.nyu.model.NYUUserGroup nyuUserGroup)
		throws SystemException {
		nyuUserGroup = toUnwrappedModel(nyuUserGroup);

		boolean isNew = nyuUserGroup.isNew();

		NYUUserGroupModelImpl nyuUserGroupModelImpl = (NYUUserGroupModelImpl)nyuUserGroup;

		if (Validator.isNull(nyuUserGroup.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			nyuUserGroup.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (nyuUserGroup.isNew()) {
				session.save(nyuUserGroup);

				nyuUserGroup.setNew(false);
			}
			else {
				session.merge(nyuUserGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NYUUserGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroupModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { nyuUserGroupModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroupModelImpl.getOriginalUuid(),
						nyuUserGroupModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						nyuUserGroupModelImpl.getUuid(),
						nyuUserGroupModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPPRIVACY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroupModelImpl.getOriginalGroupPrivacy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPPRIVACY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPPRIVACY,
					args);

				args = new Object[] { nyuUserGroupModelImpl.getGroupPrivacy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPPRIVACY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPPRIVACY,
					args);
			}

			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroupModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { nyuUserGroupModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroupModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { nyuUserGroupModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((nyuUserGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nyuUserGroupModelImpl.getOriginalGroupId(),
						nyuUserGroupModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);

				args = new Object[] {
						nyuUserGroupModelImpl.getGroupId(),
						nyuUserGroupModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);
			}
		}

		EntityCacheUtil.putResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			NYUUserGroupImpl.class, nyuUserGroup.getPrimaryKey(), nyuUserGroup);

		clearUniqueFindersCache(nyuUserGroup);
		cacheUniqueFindersCache(nyuUserGroup);

		return nyuUserGroup;
	}

	protected NYUUserGroup toUnwrappedModel(NYUUserGroup nyuUserGroup) {
		if (nyuUserGroup instanceof NYUUserGroupImpl) {
			return nyuUserGroup;
		}

		NYUUserGroupImpl nyuUserGroupImpl = new NYUUserGroupImpl();

		nyuUserGroupImpl.setNew(nyuUserGroup.isNew());
		nyuUserGroupImpl.setPrimaryKey(nyuUserGroup.getPrimaryKey());

		nyuUserGroupImpl.setUuid(nyuUserGroup.getUuid());
		nyuUserGroupImpl.setUserGroupId(nyuUserGroup.getUserGroupId());
		nyuUserGroupImpl.setCompanyId(nyuUserGroup.getCompanyId());
		nyuUserGroupImpl.setGroupId(nyuUserGroup.getGroupId());
		nyuUserGroupImpl.setGroupPrivacy(nyuUserGroup.getGroupPrivacy());
		nyuUserGroupImpl.setAppreciatedUserIds(nyuUserGroup.getAppreciatedUserIds());
		nyuUserGroupImpl.setAppreciateCount(nyuUserGroup.getAppreciateCount());
		nyuUserGroupImpl.setCreatedDate(nyuUserGroup.getCreatedDate());
		nyuUserGroupImpl.setCreatedBy(nyuUserGroup.getCreatedBy());
		nyuUserGroupImpl.setUpdatedDate(nyuUserGroup.getUpdatedDate());
		nyuUserGroupImpl.setUpdatedBy(nyuUserGroup.getUpdatedBy());
		nyuUserGroupImpl.setAdministrators(nyuUserGroup.getAdministrators());
		nyuUserGroupImpl.setAbout(nyuUserGroup.getAbout());
		nyuUserGroupImpl.setTitle(nyuUserGroup.getTitle());
		nyuUserGroupImpl.setStatus(nyuUserGroup.getStatus());
		nyuUserGroupImpl.setStatusByUserId(nyuUserGroup.getStatusByUserId());
		nyuUserGroupImpl.setStatusDate(nyuUserGroup.getStatusDate());

		return nyuUserGroupImpl;
	}

	/**
	 * Returns the n y u user group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the n y u user group
	 * @return the n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNYUUserGroupException, SystemException {
		NYUUserGroup nyuUserGroup = fetchByPrimaryKey(primaryKey);

		if (nyuUserGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNYUUserGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nyuUserGroup;
	}

	/**
	 * Returns the n y u user group with the primary key or throws a {@link com.nyu.NoSuchNYUUserGroupException} if it could not be found.
	 *
	 * @param userGroupId the primary key of the n y u user group
	 * @return the n y u user group
	 * @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup findByPrimaryKey(long userGroupId)
		throws NoSuchNYUUserGroupException, SystemException {
		return findByPrimaryKey((Serializable)userGroupId);
	}

	/**
	 * Returns the n y u user group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the n y u user group
	 * @return the n y u user group, or <code>null</code> if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NYUUserGroup nyuUserGroup = (NYUUserGroup)EntityCacheUtil.getResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
				NYUUserGroupImpl.class, primaryKey);

		if (nyuUserGroup == _nullNYUUserGroup) {
			return null;
		}

		if (nyuUserGroup == null) {
			Session session = null;

			try {
				session = openSession();

				nyuUserGroup = (NYUUserGroup)session.get(NYUUserGroupImpl.class,
						primaryKey);

				if (nyuUserGroup != null) {
					cacheResult(nyuUserGroup);
				}
				else {
					EntityCacheUtil.putResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
						NYUUserGroupImpl.class, primaryKey, _nullNYUUserGroup);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NYUUserGroupModelImpl.ENTITY_CACHE_ENABLED,
					NYUUserGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nyuUserGroup;
	}

	/**
	 * Returns the n y u user group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userGroupId the primary key of the n y u user group
	 * @return the n y u user group, or <code>null</code> if a n y u user group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NYUUserGroup fetchByPrimaryKey(long userGroupId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userGroupId);
	}

	/**
	 * Returns all the n y u user groups.
	 *
	 * @return the n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n y u user groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @return the range of n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the n y u user groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of n y u user groups
	 * @param end the upper bound of the range of n y u user groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of n y u user groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NYUUserGroup> findAll(int start, int end,
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

		List<NYUUserGroup> list = (List<NYUUserGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NYUUSERGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NYUUSERGROUP;

				if (pagination) {
					sql = sql.concat(NYUUserGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NYUUserGroup>(list);
				}
				else {
					list = (List<NYUUserGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the n y u user groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NYUUserGroup nyuUserGroup : findAll()) {
			remove(nyuUserGroup);
		}
	}

	/**
	 * Returns the number of n y u user groups.
	 *
	 * @return the number of n y u user groups
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

				Query q = session.createQuery(_SQL_COUNT_NYUUSERGROUP);

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
	 * Initializes the n y u user group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.NYUUserGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NYUUserGroup>> listenersList = new ArrayList<ModelListener<NYUUserGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NYUUserGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NYUUserGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NYUUSERGROUP = "SELECT nyuUserGroup FROM NYUUserGroup nyuUserGroup";
	private static final String _SQL_SELECT_NYUUSERGROUP_WHERE = "SELECT nyuUserGroup FROM NYUUserGroup nyuUserGroup WHERE ";
	private static final String _SQL_COUNT_NYUUSERGROUP = "SELECT COUNT(nyuUserGroup) FROM NYUUserGroup nyuUserGroup";
	private static final String _SQL_COUNT_NYUUSERGROUP_WHERE = "SELECT COUNT(nyuUserGroup) FROM NYUUserGroup nyuUserGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nyuUserGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NYUUserGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NYUUserGroup exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NYUUserGroupPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static NYUUserGroup _nullNYUUserGroup = new NYUUserGroupImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NYUUserGroup> toCacheModel() {
				return _nullNYUUserGroupCacheModel;
			}
		};

	private static CacheModel<NYUUserGroup> _nullNYUUserGroupCacheModel = new CacheModel<NYUUserGroup>() {
			@Override
			public NYUUserGroup toEntityModel() {
				return _nullNYUUserGroup;
			}
		};
}