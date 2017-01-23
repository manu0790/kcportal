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

import com.nyu.model.RequestLesson;

import java.util.List;

/**
 * The persistence utility for the request lesson service. This utility wraps {@link RequestLessonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see RequestLessonPersistence
 * @see RequestLessonPersistenceImpl
 * @generated
 */
public class RequestLessonUtil {
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
	public static void clearCache(RequestLesson requestLesson) {
		getPersistence().clearCache(requestLesson);
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
	public static List<RequestLesson> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RequestLesson> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RequestLesson> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RequestLesson update(RequestLesson requestLesson)
		throws SystemException {
		return getPersistence().update(requestLesson);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RequestLesson update(RequestLesson requestLesson,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(requestLesson, serviceContext);
	}

	/**
	* Returns all the request lessons where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching request lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.RequestLesson> findByrequestLessons(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestLessons(companyId);
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
	public static java.util.List<com.nyu.model.RequestLesson> findByrequestLessons(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestLessons(companyId, start, end);
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
	public static java.util.List<com.nyu.model.RequestLesson> findByrequestLessons(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByrequestLessons(companyId, start, end,
			orderByComparator);
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
	public static com.nyu.model.RequestLesson findByrequestLessons_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence()
				   .findByrequestLessons_First(companyId, orderByComparator);
	}

	/**
	* Returns the first request lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching request lesson, or <code>null</code> if a matching request lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson fetchByrequestLessons_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestLessons_First(companyId, orderByComparator);
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
	public static com.nyu.model.RequestLesson findByrequestLessons_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence()
				   .findByrequestLessons_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last request lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching request lesson, or <code>null</code> if a matching request lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson fetchByrequestLessons_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestLessons_Last(companyId, orderByComparator);
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
	public static com.nyu.model.RequestLesson[] findByrequestLessons_PrevAndNext(
		long requestLessonId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence()
				   .findByrequestLessons_PrevAndNext(requestLessonId,
			companyId, orderByComparator);
	}

	/**
	* Removes all the request lessons where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByrequestLessons(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByrequestLessons(companyId);
	}

	/**
	* Returns the number of request lessons where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching request lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByrequestLessons(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByrequestLessons(companyId);
	}

	/**
	* Returns all the request lessons where createdDate = &#63;.
	*
	* @param createdDate the created date
	* @return the matching request lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.RequestLesson> findBylessonsBasedOnDate(
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonsBasedOnDate(createdDate);
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
	public static java.util.List<com.nyu.model.RequestLesson> findBylessonsBasedOnDate(
		java.util.Date createdDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonsBasedOnDate(createdDate, start, end);
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
	public static java.util.List<com.nyu.model.RequestLesson> findBylessonsBasedOnDate(
		java.util.Date createdDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsBasedOnDate(createdDate, start, end,
			orderByComparator);
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
	public static com.nyu.model.RequestLesson findBylessonsBasedOnDate_First(
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence()
				   .findBylessonsBasedOnDate_First(createdDate,
			orderByComparator);
	}

	/**
	* Returns the first request lesson in the ordered set where createdDate = &#63;.
	*
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching request lesson, or <code>null</code> if a matching request lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson fetchBylessonsBasedOnDate_First(
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsBasedOnDate_First(createdDate,
			orderByComparator);
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
	public static com.nyu.model.RequestLesson findBylessonsBasedOnDate_Last(
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence()
				   .findBylessonsBasedOnDate_Last(createdDate, orderByComparator);
	}

	/**
	* Returns the last request lesson in the ordered set where createdDate = &#63;.
	*
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching request lesson, or <code>null</code> if a matching request lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson fetchBylessonsBasedOnDate_Last(
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsBasedOnDate_Last(createdDate,
			orderByComparator);
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
	public static com.nyu.model.RequestLesson[] findBylessonsBasedOnDate_PrevAndNext(
		long requestLessonId, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence()
				   .findBylessonsBasedOnDate_PrevAndNext(requestLessonId,
			createdDate, orderByComparator);
	}

	/**
	* Removes all the request lessons where createdDate = &#63; from the database.
	*
	* @param createdDate the created date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonsBasedOnDate(java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonsBasedOnDate(createdDate);
	}

	/**
	* Returns the number of request lessons where createdDate = &#63;.
	*
	* @param createdDate the created date
	* @return the number of matching request lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonsBasedOnDate(java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonsBasedOnDate(createdDate);
	}

	/**
	* Caches the request lesson in the entity cache if it is enabled.
	*
	* @param requestLesson the request lesson
	*/
	public static void cacheResult(com.nyu.model.RequestLesson requestLesson) {
		getPersistence().cacheResult(requestLesson);
	}

	/**
	* Caches the request lessons in the entity cache if it is enabled.
	*
	* @param requestLessons the request lessons
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.RequestLesson> requestLessons) {
		getPersistence().cacheResult(requestLessons);
	}

	/**
	* Creates a new request lesson with the primary key. Does not add the request lesson to the database.
	*
	* @param requestLessonId the primary key for the new request lesson
	* @return the new request lesson
	*/
	public static com.nyu.model.RequestLesson create(long requestLessonId) {
		return getPersistence().create(requestLessonId);
	}

	/**
	* Removes the request lesson with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestLessonId the primary key of the request lesson
	* @return the request lesson that was removed
	* @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson remove(long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence().remove(requestLessonId);
	}

	public static com.nyu.model.RequestLesson updateImpl(
		com.nyu.model.RequestLesson requestLesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(requestLesson);
	}

	/**
	* Returns the request lesson with the primary key or throws a {@link com.nyu.NoSuchRequestLessonException} if it could not be found.
	*
	* @param requestLessonId the primary key of the request lesson
	* @return the request lesson
	* @throws com.nyu.NoSuchRequestLessonException if a request lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson findByPrimaryKey(
		long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchRequestLessonException {
		return getPersistence().findByPrimaryKey(requestLessonId);
	}

	/**
	* Returns the request lesson with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requestLessonId the primary key of the request lesson
	* @return the request lesson, or <code>null</code> if a request lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.RequestLesson fetchByPrimaryKey(
		long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(requestLessonId);
	}

	/**
	* Returns all the request lessons.
	*
	* @return the request lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.RequestLesson> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.nyu.model.RequestLesson> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.nyu.model.RequestLesson> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the request lessons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of request lessons.
	*
	* @return the number of request lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RequestLessonPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RequestLessonPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					RequestLessonPersistence.class.getName());

			ReferenceRegistry.registerReference(RequestLessonUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RequestLessonPersistence persistence) {
	}

	private static RequestLessonPersistence _persistence;
}