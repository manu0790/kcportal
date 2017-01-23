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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.nyu.model.AuditReport;

import java.util.List;

/**
 * The persistence utility for the audit report service. This utility wraps {@link AuditReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AuditReportPersistence
 * @see AuditReportPersistenceImpl
 * @generated
 */
public class AuditReportUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(AuditReport auditReport) {
		getPersistence().clearCache(auditReport);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AuditReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AuditReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AuditReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AuditReport update(AuditReport auditReport)
		throws SystemException {
		return getPersistence().update(auditReport);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AuditReport update(AuditReport auditReport,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(auditReport, serviceContext);
	}

	/**
	* Returns all the audit reports where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.AuditReport> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
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
	public static java.util.List<com.nyu.model.AuditReport> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
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
	public static java.util.List<com.nyu.model.AuditReport> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
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
	public static com.nyu.model.AuditReport findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first audit report in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
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
	public static com.nyu.model.AuditReport findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last audit report in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
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
	public static com.nyu.model.AuditReport[] findByCompanyId_PrevAndNext(
		long auditEventId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(auditEventId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the audit reports where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of audit reports where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the audit reports where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.AuditReport> findByeventType(
		java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByeventType(eventType);
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
	public static java.util.List<com.nyu.model.AuditReport> findByeventType(
		java.lang.String eventType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByeventType(eventType, start, end);
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
	public static java.util.List<com.nyu.model.AuditReport> findByeventType(
		java.lang.String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByeventType(eventType, start, end, orderByComparator);
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
	public static com.nyu.model.AuditReport findByeventType_First(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence()
				   .findByeventType_First(eventType, orderByComparator);
	}

	/**
	* Returns the first audit report in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport fetchByeventType_First(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByeventType_First(eventType, orderByComparator);
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
	public static com.nyu.model.AuditReport findByeventType_Last(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence()
				   .findByeventType_Last(eventType, orderByComparator);
	}

	/**
	* Returns the last audit report in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport fetchByeventType_Last(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByeventType_Last(eventType, orderByComparator);
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
	public static com.nyu.model.AuditReport[] findByeventType_PrevAndNext(
		long auditEventId, java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence()
				   .findByeventType_PrevAndNext(auditEventId, eventType,
			orderByComparator);
	}

	/**
	* Removes all the audit reports where eventType = &#63; from the database.
	*
	* @param eventType the event type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByeventType(java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByeventType(eventType);
	}

	/**
	* Returns the number of audit reports where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the number of matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByeventType(java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByeventType(eventType);
	}

	/**
	* Caches the audit report in the entity cache if it is enabled.
	*
	* @param auditReport the audit report
	*/
	public static void cacheResult(com.nyu.model.AuditReport auditReport) {
		getPersistence().cacheResult(auditReport);
	}

	/**
	* Caches the audit reports in the entity cache if it is enabled.
	*
	* @param auditReports the audit reports
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.AuditReport> auditReports) {
		getPersistence().cacheResult(auditReports);
	}

	/**
	* Creates a new audit report with the primary key. Does not add the audit report to the database.
	*
	* @param auditEventId the primary key for the new audit report
	* @return the new audit report
	*/
	public static com.nyu.model.AuditReport create(long auditEventId) {
		return getPersistence().create(auditEventId);
	}

	/**
	* Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param auditEventId the primary key of the audit report
	* @return the audit report that was removed
	* @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport remove(long auditEventId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence().remove(auditEventId);
	}

	public static com.nyu.model.AuditReport updateImpl(
		com.nyu.model.AuditReport auditReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(auditReport);
	}

	/**
	* Returns the audit report with the primary key or throws a {@link com.nyu.NoSuchAuditReportException} if it could not be found.
	*
	* @param auditEventId the primary key of the audit report
	* @return the audit report
	* @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport findByPrimaryKey(long auditEventId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException {
		return getPersistence().findByPrimaryKey(auditEventId);
	}

	/**
	* Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param auditEventId the primary key of the audit report
	* @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AuditReport fetchByPrimaryKey(long auditEventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(auditEventId);
	}

	/**
	* Returns all the audit reports.
	*
	* @return the audit reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.AuditReport> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.nyu.model.AuditReport> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.nyu.model.AuditReport> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the audit reports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of audit reports.
	*
	* @return the number of audit reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AuditReportPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AuditReportPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					AuditReportPersistence.class.getName());

			ReferenceRegistry.registerReference(AuditReportUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AuditReportPersistence persistence) {
	}

	private static AuditReportPersistence _persistence;
}