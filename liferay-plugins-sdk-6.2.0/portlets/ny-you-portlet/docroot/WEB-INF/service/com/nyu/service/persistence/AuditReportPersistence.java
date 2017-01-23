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

import com.liferay.portal.service.persistence.BasePersistence;

import com.nyu.model.AuditReport;

/**
 * The persistence interface for the audit report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AuditReportPersistenceImpl
 * @see AuditReportUtil
 * @generated
 */
public interface AuditReportPersistence extends BasePersistence<AuditReport> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuditReportUtil} to access the audit report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the audit reports where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AuditReport> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.AuditReport> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.AuditReport> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first audit report in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit report
	* @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Returns the first audit report in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last audit report in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit report
	* @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Returns the last audit report in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.AuditReport[] findByCompanyId_PrevAndNext(
		long auditEventId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Removes all the audit reports where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of audit reports where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the audit reports where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AuditReport> findByeventType(
		java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.AuditReport> findByeventType(
		java.lang.String eventType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.AuditReport> findByeventType(
		java.lang.String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first audit report in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit report
	* @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport findByeventType_First(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Returns the first audit report in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport fetchByeventType_First(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last audit report in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit report
	* @throws com.nyu.NoSuchAuditReportException if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport findByeventType_Last(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Returns the last audit report in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport fetchByeventType_Last(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.AuditReport[] findByeventType_PrevAndNext(
		long auditEventId, java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Removes all the audit reports where eventType = &#63; from the database.
	*
	* @param eventType the event type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByeventType(java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of audit reports where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the number of matching audit reports
	* @throws SystemException if a system exception occurred
	*/
	public int countByeventType(java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the audit report in the entity cache if it is enabled.
	*
	* @param auditReport the audit report
	*/
	public void cacheResult(com.nyu.model.AuditReport auditReport);

	/**
	* Caches the audit reports in the entity cache if it is enabled.
	*
	* @param auditReports the audit reports
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.AuditReport> auditReports);

	/**
	* Creates a new audit report with the primary key. Does not add the audit report to the database.
	*
	* @param auditEventId the primary key for the new audit report
	* @return the new audit report
	*/
	public com.nyu.model.AuditReport create(long auditEventId);

	/**
	* Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param auditEventId the primary key of the audit report
	* @return the audit report that was removed
	* @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport remove(long auditEventId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	public com.nyu.model.AuditReport updateImpl(
		com.nyu.model.AuditReport auditReport)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the audit report with the primary key or throws a {@link com.nyu.NoSuchAuditReportException} if it could not be found.
	*
	* @param auditEventId the primary key of the audit report
	* @return the audit report
	* @throws com.nyu.NoSuchAuditReportException if a audit report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport findByPrimaryKey(long auditEventId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAuditReportException;

	/**
	* Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param auditEventId the primary key of the audit report
	* @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AuditReport fetchByPrimaryKey(long auditEventId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the audit reports.
	*
	* @return the audit reports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AuditReport> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.AuditReport> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.AuditReport> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the audit reports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of audit reports.
	*
	* @return the number of audit reports
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}