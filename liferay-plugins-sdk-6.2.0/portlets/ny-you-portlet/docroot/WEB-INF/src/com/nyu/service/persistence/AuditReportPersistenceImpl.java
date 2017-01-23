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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchAuditReportException;

import com.nyu.model.AuditReport;
import com.nyu.model.impl.AuditReportImpl;
import com.nyu.model.impl.AuditReportModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the audit report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AuditReportPersistence
 * @see AuditReportUtil
 * @generated
 */
public class AuditReportPersistenceImpl extends BasePersistenceImpl<AuditReport>
	implements AuditReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AuditReportUtil} to access the audit report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AuditReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			AuditReportModelImpl.COMPANYID_COLUMN_BITMASK |
			AuditReportModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the audit reports where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the audit reports where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of audit reports
	 * @param end the upper bound of the range of audit reports (not inclusive)
	 * @return the range of matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the audit reports where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of audit reports
	 * @param end the upper bound of the range of audit reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findByCompanyId(long companyId, int start,
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

		List<AuditReport> list = (List<AuditReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AuditReport auditReport : list) {
				if ((companyId != auditReport.getCompanyId())) {
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

			query.append(_SQL_SELECT_AUDITREPORT_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AuditReportModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<AuditReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AuditReport>(list);
				}
				else {
					list = (List<AuditReport>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first audit report in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching audit report
	 * @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (auditReport != null) {
			return auditReport;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAuditReportException(msg.toString());
	}

	/**
	 * Returns the first audit report in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AuditReport> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last audit report in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching audit report
	 * @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (auditReport != null) {
			return auditReport;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAuditReportException(msg.toString());
	}

	/**
	 * Returns the last audit report in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<AuditReport> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the audit reports before and after the current audit report in the ordered set where companyId = &#63;.
	 *
	 * @param auditEventId the primary key of the current audit report
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next audit report
	 * @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport[] findByCompanyId_PrevAndNext(long auditEventId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = findByPrimaryKey(auditEventId);

		Session session = null;

		try {
			session = openSession();

			AuditReport[] array = new AuditReportImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, auditReport,
					companyId, orderByComparator, true);

			array[1] = auditReport;

			array[2] = getByCompanyId_PrevAndNext(session, auditReport,
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

	protected AuditReport getByCompanyId_PrevAndNext(Session session,
		AuditReport auditReport, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_AUDITREPORT_WHERE);

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
			query.append(AuditReportModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(auditReport);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AuditReport> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the audit reports where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (AuditReport auditReport : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(auditReport);
		}
	}

	/**
	 * Returns the number of audit reports where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching audit reports
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

			query.append(_SQL_COUNT_AUDITREPORT_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "auditReport.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE =
		new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByeventType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE =
		new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByeventType",
			new String[] { String.class.getName() },
			AuditReportModelImpl.EVENTTYPE_COLUMN_BITMASK |
			AuditReportModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EVENTTYPE = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByeventType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the audit reports where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findByeventType(String eventType)
		throws SystemException {
		return findByeventType(eventType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the audit reports where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of audit reports
	 * @param end the upper bound of the range of audit reports (not inclusive)
	 * @return the range of matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findByeventType(String eventType, int start,
		int end) throws SystemException {
		return findByeventType(eventType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the audit reports where eventType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param eventType the event type
	 * @param start the lower bound of the range of audit reports
	 * @param end the upper bound of the range of audit reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findByeventType(String eventType, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE;
			finderArgs = new Object[] { eventType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE;
			finderArgs = new Object[] { eventType, start, end, orderByComparator };
		}

		List<AuditReport> list = (List<AuditReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AuditReport auditReport : list) {
				if (!Validator.equals(eventType, auditReport.getEventType())) {
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

			query.append(_SQL_SELECT_AUDITREPORT_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AuditReportModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				if (!pagination) {
					list = (List<AuditReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AuditReport>(list);
				}
				else {
					list = (List<AuditReport>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first audit report in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching audit report
	 * @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport findByeventType_First(String eventType,
		OrderByComparator orderByComparator)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = fetchByeventType_First(eventType,
				orderByComparator);

		if (auditReport != null) {
			return auditReport;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAuditReportException(msg.toString());
	}

	/**
	 * Returns the first audit report in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport fetchByeventType_First(String eventType,
		OrderByComparator orderByComparator) throws SystemException {
		List<AuditReport> list = findByeventType(eventType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last audit report in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching audit report
	 * @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport findByeventType_Last(String eventType,
		OrderByComparator orderByComparator)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = fetchByeventType_Last(eventType,
				orderByComparator);

		if (auditReport != null) {
			return auditReport;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAuditReportException(msg.toString());
	}

	/**
	 * Returns the last audit report in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport fetchByeventType_Last(String eventType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByeventType(eventType);

		if (count == 0) {
			return null;
		}

		List<AuditReport> list = findByeventType(eventType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the audit reports before and after the current audit report in the ordered set where eventType = &#63;.
	 *
	 * @param auditEventId the primary key of the current audit report
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next audit report
	 * @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport[] findByeventType_PrevAndNext(long auditEventId,
		String eventType, OrderByComparator orderByComparator)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = findByPrimaryKey(auditEventId);

		Session session = null;

		try {
			session = openSession();

			AuditReport[] array = new AuditReportImpl[3];

			array[0] = getByeventType_PrevAndNext(session, auditReport,
					eventType, orderByComparator, true);

			array[1] = auditReport;

			array[2] = getByeventType_PrevAndNext(session, auditReport,
					eventType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AuditReport getByeventType_PrevAndNext(Session session,
		AuditReport auditReport, String eventType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_AUDITREPORT_WHERE);

		boolean bindEventType = false;

		if (eventType == null) {
			query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
		}
		else if (eventType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
		}
		else {
			bindEventType = true;

			query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
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
			query.append(AuditReportModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEventType) {
			qPos.add(eventType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(auditReport);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AuditReport> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the audit reports where eventType = &#63; from the database.
	 *
	 * @param eventType the event type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByeventType(String eventType) throws SystemException {
		for (AuditReport auditReport : findByeventType(eventType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(auditReport);
		}
	}

	/**
	 * Returns the number of audit reports where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the number of matching audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByeventType(String eventType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EVENTTYPE;

		Object[] finderArgs = new Object[] { eventType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_AUDITREPORT_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
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

	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1 = "auditReport.eventType IS NULL";
	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2 = "auditReport.eventType = ?";
	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3 = "(auditReport.eventType IS NULL OR auditReport.eventType = '')";

	public AuditReportPersistenceImpl() {
		setModelClass(AuditReport.class);
	}

	/**
	 * Caches the audit report in the entity cache if it is enabled.
	 *
	 * @param auditReport the audit report
	 */
	@Override
	public void cacheResult(AuditReport auditReport) {
		EntityCacheUtil.putResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportImpl.class, auditReport.getPrimaryKey(), auditReport);

		auditReport.resetOriginalValues();
	}

	/**
	 * Caches the audit reports in the entity cache if it is enabled.
	 *
	 * @param auditReports the audit reports
	 */
	@Override
	public void cacheResult(List<AuditReport> auditReports) {
		for (AuditReport auditReport : auditReports) {
			if (EntityCacheUtil.getResult(
						AuditReportModelImpl.ENTITY_CACHE_ENABLED,
						AuditReportImpl.class, auditReport.getPrimaryKey()) == null) {
				cacheResult(auditReport);
			}
			else {
				auditReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all audit reports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AuditReportImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AuditReportImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the audit report.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AuditReport auditReport) {
		EntityCacheUtil.removeResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportImpl.class, auditReport.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AuditReport> auditReports) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AuditReport auditReport : auditReports) {
			EntityCacheUtil.removeResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
				AuditReportImpl.class, auditReport.getPrimaryKey());
		}
	}

	/**
	 * Creates a new audit report with the primary key. Does not add the audit report to the database.
	 *
	 * @param auditEventId the primary key for the new audit report
	 * @return the new audit report
	 */
	@Override
	public AuditReport create(long auditEventId) {
		AuditReport auditReport = new AuditReportImpl();

		auditReport.setNew(true);
		auditReport.setPrimaryKey(auditEventId);

		return auditReport;
	}

	/**
	 * Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditEventId the primary key of the audit report
	 * @return the audit report that was removed
	 * @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport remove(long auditEventId)
		throws NoSuchAuditReportException, SystemException {
		return remove((Serializable)auditEventId);
	}

	/**
	 * Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the audit report
	 * @return the audit report that was removed
	 * @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport remove(Serializable primaryKey)
		throws NoSuchAuditReportException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AuditReport auditReport = (AuditReport)session.get(AuditReportImpl.class,
					primaryKey);

			if (auditReport == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAuditReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(auditReport);
		}
		catch (NoSuchAuditReportException nsee) {
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
	protected AuditReport removeImpl(AuditReport auditReport)
		throws SystemException {
		auditReport = toUnwrappedModel(auditReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(auditReport)) {
				auditReport = (AuditReport)session.get(AuditReportImpl.class,
						auditReport.getPrimaryKeyObj());
			}

			if (auditReport != null) {
				session.delete(auditReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (auditReport != null) {
			clearCache(auditReport);
		}

		return auditReport;
	}

	@Override
	public AuditReport updateImpl(com.nyu.model.AuditReport auditReport)
		throws SystemException {
		auditReport = toUnwrappedModel(auditReport);

		boolean isNew = auditReport.isNew();

		AuditReportModelImpl auditReportModelImpl = (AuditReportModelImpl)auditReport;

		Session session = null;

		try {
			session = openSession();

			if (auditReport.isNew()) {
				session.save(auditReport);

				auditReport.setNew(false);
			}
			else {
				session.merge(auditReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AuditReportModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((auditReportModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						auditReportModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { auditReportModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((auditReportModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						auditReportModelImpl.getOriginalEventType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE,
					args);

				args = new Object[] { auditReportModelImpl.getEventType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE,
					args);
			}
		}

		EntityCacheUtil.putResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
			AuditReportImpl.class, auditReport.getPrimaryKey(), auditReport);

		return auditReport;
	}

	protected AuditReport toUnwrappedModel(AuditReport auditReport) {
		if (auditReport instanceof AuditReportImpl) {
			return auditReport;
		}

		AuditReportImpl auditReportImpl = new AuditReportImpl();

		auditReportImpl.setNew(auditReport.isNew());
		auditReportImpl.setPrimaryKey(auditReport.getPrimaryKey());

		auditReportImpl.setAuditEventId(auditReport.getAuditEventId());
		auditReportImpl.setCompanyId(auditReport.getCompanyId());
		auditReportImpl.setGroupId(auditReport.getGroupId());
		auditReportImpl.setUserId(auditReport.getUserId());
		auditReportImpl.setUserName(auditReport.getUserName());
		auditReportImpl.setCreateDate(auditReport.getCreateDate());
		auditReportImpl.setEventType(auditReport.getEventType());
		auditReportImpl.setClassName(auditReport.getClassName());
		auditReportImpl.setClassPK(auditReport.getClassPK());
		auditReportImpl.setMessage(auditReport.getMessage());
		auditReportImpl.setClientHost(auditReport.getClientHost());
		auditReportImpl.setClientIP(auditReport.getClientIP());
		auditReportImpl.setServerName(auditReport.getServerName());
		auditReportImpl.setServerPort(auditReport.getServerPort());
		auditReportImpl.setSessionID(auditReport.getSessionID());
		auditReportImpl.setAdditionalInfo(auditReport.getAdditionalInfo());

		return auditReportImpl;
	}

	/**
	 * Returns the audit report with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the audit report
	 * @return the audit report
	 * @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAuditReportException, SystemException {
		AuditReport auditReport = fetchByPrimaryKey(primaryKey);

		if (auditReport == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAuditReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return auditReport;
	}

	/**
	 * Returns the audit report with the primary key or throws a {@link com.nyu.NoSuchAuditReportException} if it could not be found.
	 *
	 * @param auditEventId the primary key of the audit report
	 * @return the audit report
	 * @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport findByPrimaryKey(long auditEventId)
		throws NoSuchAuditReportException, SystemException {
		return findByPrimaryKey((Serializable)auditEventId);
	}

	/**
	 * Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the audit report
	 * @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AuditReport auditReport = (AuditReport)EntityCacheUtil.getResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
				AuditReportImpl.class, primaryKey);

		if (auditReport == _nullAuditReport) {
			return null;
		}

		if (auditReport == null) {
			Session session = null;

			try {
				session = openSession();

				auditReport = (AuditReport)session.get(AuditReportImpl.class,
						primaryKey);

				if (auditReport != null) {
					cacheResult(auditReport);
				}
				else {
					EntityCacheUtil.putResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
						AuditReportImpl.class, primaryKey, _nullAuditReport);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
					AuditReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return auditReport;
	}

	/**
	 * Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditEventId the primary key of the audit report
	 * @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AuditReport fetchByPrimaryKey(long auditEventId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)auditEventId);
	}

	/**
	 * Returns all the audit reports.
	 *
	 * @return the audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the audit reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of audit reports
	 * @param end the upper bound of the range of audit reports (not inclusive)
	 * @return the range of audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the audit reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of audit reports
	 * @param end the upper bound of the range of audit reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of audit reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AuditReport> findAll(int start, int end,
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

		List<AuditReport> list = (List<AuditReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_AUDITREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AUDITREPORT;

				if (pagination) {
					sql = sql.concat(AuditReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AuditReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AuditReport>(list);
				}
				else {
					list = (List<AuditReport>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the audit reports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AuditReport auditReport : findAll()) {
			remove(auditReport);
		}
	}

	/**
	 * Returns the number of audit reports.
	 *
	 * @return the number of audit reports
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

				Query q = session.createQuery(_SQL_COUNT_AUDITREPORT);

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
	 * Initializes the audit report persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.AuditReport")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AuditReport>> listenersList = new ArrayList<ModelListener<AuditReport>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AuditReport>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AuditReportImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_AUDITREPORT = "SELECT auditReport FROM AuditReport auditReport";
	private static final String _SQL_SELECT_AUDITREPORT_WHERE = "SELECT auditReport FROM AuditReport auditReport WHERE ";
	private static final String _SQL_COUNT_AUDITREPORT = "SELECT COUNT(auditReport) FROM AuditReport auditReport";
	private static final String _SQL_COUNT_AUDITREPORT_WHERE = "SELECT COUNT(auditReport) FROM AuditReport auditReport WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "auditReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AuditReport exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AuditReport exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AuditReportPersistenceImpl.class);
	private static AuditReport _nullAuditReport = new AuditReportImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AuditReport> toCacheModel() {
				return _nullAuditReportCacheModel;
			}
		};

	private static CacheModel<AuditReport> _nullAuditReportCacheModel = new CacheModel<AuditReport>() {
			@Override
			public AuditReport toEntityModel() {
				return _nullAuditReport;
			}
		};
}