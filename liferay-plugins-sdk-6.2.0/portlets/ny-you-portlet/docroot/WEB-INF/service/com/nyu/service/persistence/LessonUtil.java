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

import com.nyu.model.Lesson;

import java.util.List;

/**
 * The persistence utility for the lesson service. This utility wraps {@link LessonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonPersistence
 * @see LessonPersistenceImpl
 * @generated
 */
public class LessonUtil {
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
	public static void clearCache(Lesson lesson) {
		getPersistence().clearCache(lesson);
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
	public static List<Lesson> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Lesson> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Lesson> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Lesson update(Lesson lesson) throws SystemException {
		return getPersistence().update(lesson);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Lesson update(Lesson lesson, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lesson, serviceContext);
	}

	/**
	* Returns all the lessons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the lessons where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where uuid = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findByUuid_PrevAndNext(long lessonId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByUuid_PrevAndNext(lessonId, uuid, orderByComparator);
	}

	/**
	* Removes all the lessons where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of lessons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the lesson where uuid = &#63; and groupId = &#63; or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the lesson where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the lesson where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the lesson where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of lessons where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the lessons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the lessons where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findByUuid_C_PrevAndNext(
		long lessonId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(lessonId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the lessons where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of lessons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the lessons where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonNameCollection(
		java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonNameCollection(lessonName);
	}

	/**
	* Returns a range of all the lessons where lessonName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonName the lesson name
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonNameCollection(
		java.lang.String lessonName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonNameCollection(lessonName, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where lessonName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonName the lesson name
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonNameCollection(
		java.lang.String lessonName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonNameCollection(lessonName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonNameCollection_First(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonNameCollection_First(lessonName,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonNameCollection_First(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonNameCollection_First(lessonName,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonNameCollection_Last(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonNameCollection_Last(lessonName,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonNameCollection_Last(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonNameCollection_Last(lessonName,
			orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findBylessonNameCollection_PrevAndNext(
		long lessonId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonNameCollection_PrevAndNext(lessonId,
			lessonName, orderByComparator);
	}

	/**
	* Removes all the lessons where lessonName = &#63; from the database.
	*
	* @param lessonName the lesson name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonNameCollection(java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonNameCollection(lessonName);
	}

	/**
	* Returns the number of lessons where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonNameCollection(java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonNameCollection(lessonName);
	}

	/**
	* Returns all the lessons where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByLessonsMarkedAs(
		java.lang.String markedAs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLessonsMarkedAs(markedAs);
	}

	/**
	* Returns a range of all the lessons where markedAs = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param markedAs the marked as
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByLessonsMarkedAs(
		java.lang.String markedAs, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLessonsMarkedAs(markedAs, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where markedAs = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param markedAs the marked as
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByLessonsMarkedAs(
		java.lang.String markedAs, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLessonsMarkedAs(markedAs, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByLessonsMarkedAs_First(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByLessonsMarkedAs_First(markedAs, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByLessonsMarkedAs_First(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLessonsMarkedAs_First(markedAs, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByLessonsMarkedAs_Last(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByLessonsMarkedAs_Last(markedAs, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByLessonsMarkedAs_Last(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLessonsMarkedAs_Last(markedAs, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where markedAs = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findByLessonsMarkedAs_PrevAndNext(
		long lessonId, java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByLessonsMarkedAs_PrevAndNext(lessonId, markedAs,
			orderByComparator);
	}

	/**
	* Removes all the lessons where markedAs = &#63; from the database.
	*
	* @param markedAs the marked as
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLessonsMarkedAs(java.lang.String markedAs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLessonsMarkedAs(markedAs);
	}

	/**
	* Returns the number of lessons where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLessonsMarkedAs(java.lang.String markedAs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLessonsMarkedAs(markedAs);
	}

	/**
	* Returns all the lessons where status = &#63;.
	*
	* @param status the status
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_status(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessons_status(status);
	}

	/**
	* Returns a range of all the lessons where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_status(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessons_status(status, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_status(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessons_status(status, start, end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessons_status_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessons_status_First(status, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessons_status_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessons_status_First(status, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessons_status_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessons_status_Last(status, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessons_status_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessons_status_Last(status, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where status = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findBylessons_status_PrevAndNext(
		long lessonId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessons_status_PrevAndNext(lessonId, status,
			orderByComparator);
	}

	/**
	* Removes all the lessons where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessons_status(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessons_status(status);
	}

	/**
	* Returns the number of lessons where status = &#63;.
	*
	* @param status the status
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessons_status(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessons_status(status);
	}

	/**
	* Returns all the lessons where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String lessonPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessons_privacy(lessonPrivacy);
	}

	/**
	* Returns a range of all the lessons where lessonPrivacy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonPrivacy the lesson privacy
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String lessonPrivacy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessons_privacy(lessonPrivacy, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where lessonPrivacy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonPrivacy the lesson privacy
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String lessonPrivacy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessons_privacy(lessonPrivacy, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessons_privacy_First(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessons_privacy_First(lessonPrivacy, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessons_privacy_First(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessons_privacy_First(lessonPrivacy,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessons_privacy_Last(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessons_privacy_Last(lessonPrivacy, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessons_privacy_Last(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessons_privacy_Last(lessonPrivacy, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findBylessons_privacy_PrevAndNext(
		long lessonId, java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessons_privacy_PrevAndNext(lessonId, lessonPrivacy,
			orderByComparator);
	}

	/**
	* Returns all the lessons where lessonPrivacy = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonPrivacies the lesson privacies
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String[] lessonPrivacies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessons_privacy(lessonPrivacies);
	}

	/**
	* Returns a range of all the lessons where lessonPrivacy = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonPrivacies the lesson privacies
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String[] lessonPrivacies, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessons_privacy(lessonPrivacies, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where lessonPrivacy = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonPrivacies the lesson privacies
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String[] lessonPrivacies, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessons_privacy(lessonPrivacies, start, end,
			orderByComparator);
	}

	/**
	* Removes all the lessons where lessonPrivacy = &#63; from the database.
	*
	* @param lessonPrivacy the lesson privacy
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessons_privacy(java.lang.String lessonPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessons_privacy(lessonPrivacy);
	}

	/**
	* Returns the number of lessons where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessons_privacy(java.lang.String lessonPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessons_privacy(lessonPrivacy);
	}

	/**
	* Returns the number of lessons where lessonPrivacy = any &#63;.
	*
	* @param lessonPrivacies the lesson privacies
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessons_privacy(java.lang.String[] lessonPrivacies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessons_privacy(lessonPrivacies);
	}

	/**
	* Returns all the lessons where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonNameWithCompanyId(
		long companyId, java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonNameWithCompanyId(companyId, lessonName);
	}

	/**
	* Returns a range of all the lessons where companyId = &#63; and lessonName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonNameWithCompanyId(
		long companyId, java.lang.String lessonName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonNameWithCompanyId(companyId, lessonName, start,
			end);
	}

	/**
	* Returns an ordered range of all the lessons where companyId = &#63; and lessonName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonNameWithCompanyId(
		long companyId, java.lang.String lessonName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonNameWithCompanyId(companyId, lessonName, start,
			end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonNameWithCompanyId_First(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonNameWithCompanyId_First(companyId, lessonName,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonNameWithCompanyId_First(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonNameWithCompanyId_First(companyId, lessonName,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonNameWithCompanyId_Last(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonNameWithCompanyId_Last(companyId, lessonName,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonNameWithCompanyId_Last(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonNameWithCompanyId_Last(companyId, lessonName,
			orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findBylessonNameWithCompanyId_PrevAndNext(
		long lessonId, long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonNameWithCompanyId_PrevAndNext(lessonId,
			companyId, lessonName, orderByComparator);
	}

	/**
	* Removes all the lessons where companyId = &#63; and lessonName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonNameWithCompanyId(long companyId,
		java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonNameWithCompanyId(companyId, lessonName);
	}

	/**
	* Returns the number of lessons where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonNameWithCompanyId(long companyId,
		java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBylessonNameWithCompanyId(companyId, lessonName);
	}

	/**
	* Returns all the lessons where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthor(
		long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonsUploadedByAuthor(currentAuthor);
	}

	/**
	* Returns a range of all the lessons where currentAuthor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param currentAuthor the current author
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthor(
		long currentAuthor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsUploadedByAuthor(currentAuthor, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where currentAuthor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param currentAuthor the current author
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthor(
		long currentAuthor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsUploadedByAuthor(currentAuthor, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonsUploadedByAuthor_First(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthor_First(currentAuthor,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonsUploadedByAuthor_First(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsUploadedByAuthor_First(currentAuthor,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonsUploadedByAuthor_Last(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthor_Last(currentAuthor,
			orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonsUploadedByAuthor_Last(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsUploadedByAuthor_Last(currentAuthor,
			orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findBylessonsUploadedByAuthor_PrevAndNext(
		long lessonId, long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthor_PrevAndNext(lessonId,
			currentAuthor, orderByComparator);
	}

	/**
	* Removes all the lessons where currentAuthor = &#63; from the database.
	*
	* @param currentAuthor the current author
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonsUploadedByAuthor(long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonsUploadedByAuthor(currentAuthor);
	}

	/**
	* Returns the number of lessons where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonsUploadedByAuthor(long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonsUploadedByAuthor(currentAuthor);
	}

	/**
	* Returns all the lessons where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorAndStatus(currentAuthor, status);
	}

	/**
	* Returns a range of all the lessons where currentAuthor = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorAndStatus(currentAuthor,
			status, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where currentAuthor = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorAndStatus(currentAuthor,
			status, start, end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonsUploadedByAuthorAndStatus_First(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorAndStatus_First(currentAuthor,
			status, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonsUploadedByAuthorAndStatus_First(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsUploadedByAuthorAndStatus_First(currentAuthor,
			status, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonsUploadedByAuthorAndStatus_Last(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorAndStatus_Last(currentAuthor,
			status, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonsUploadedByAuthorAndStatus_Last(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsUploadedByAuthorAndStatus_Last(currentAuthor,
			status, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findBylessonsUploadedByAuthorAndStatus_PrevAndNext(
		long lessonId, long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorAndStatus_PrevAndNext(lessonId,
			currentAuthor, status, orderByComparator);
	}

	/**
	* Removes all the lessons where currentAuthor = &#63; and status = &#63; from the database.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBylessonsUploadedByAuthorAndStatus(currentAuthor, status);
	}

	/**
	* Returns the number of lessons where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBylessonsUploadedByAuthorAndStatus(currentAuthor,
			status);
	}

	/**
	* Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findBylessonsUploadedByAuthorByLessonId(lessonId,
			currentAuthor);
	}

	/**
	* Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsUploadedByAuthorByLessonId(lessonId,
			currentAuthor);
	}

	/**
	* Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsUploadedByAuthorByLessonId(lessonId,
			currentAuthor, retrieveFromCache);
	}

	/**
	* Removes the lesson where lessonId = &#63; and currentAuthor = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson removeBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .removeBylessonsUploadedByAuthorByLessonId(lessonId,
			currentAuthor);
	}

	/**
	* Returns the number of lessons where lessonId = &#63; and currentAuthor = &#63;.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBylessonsUploadedByAuthorByLessonId(lessonId,
			currentAuthor);
	}

	/**
	* Returns all the lessons where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the lessons where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where groupId = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findByGroupId_PrevAndNext(
		long lessonId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(lessonId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the lessons where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of lessons where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the lessons where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the lessons where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where companyId = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findByCompanyId_PrevAndNext(
		long lessonId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(lessonId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the lessons where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of lessons where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the lessons where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByG_S(long groupId,
		int lessonStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, lessonStatus);
	}

	/**
	* Returns a range of all the lessons where groupId = &#63; and lessonStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByG_S(long groupId,
		int lessonStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, lessonStatus, start, end);
	}

	/**
	* Returns an ordered range of all the lessons where groupId = &#63; and lessonStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findByG_S(long groupId,
		int lessonStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, lessonStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByG_S_First(long groupId,
		int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByG_S_First(groupId, lessonStatus, orderByComparator);
	}

	/**
	* Returns the first lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByG_S_First(long groupId,
		int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_First(groupId, lessonStatus, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByG_S_Last(long groupId,
		int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByG_S_Last(groupId, lessonStatus, orderByComparator);
	}

	/**
	* Returns the last lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByG_S_Last(long groupId,
		int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_Last(groupId, lessonStatus, orderByComparator);
	}

	/**
	* Returns the lessons before and after the current lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param lessonId the primary key of the current lesson
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson[] findByG_S_PrevAndNext(long lessonId,
		long groupId, int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence()
				   .findByG_S_PrevAndNext(lessonId, groupId, lessonStatus,
			orderByComparator);
	}

	/**
	* Removes all the lessons where groupId = &#63; and lessonStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, int lessonStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, lessonStatus);
	}

	/**
	* Returns the number of lessons where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, int lessonStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, lessonStatus);
	}

	/**
	* Caches the lesson in the entity cache if it is enabled.
	*
	* @param lesson the lesson
	*/
	public static void cacheResult(com.nyu.model.Lesson lesson) {
		getPersistence().cacheResult(lesson);
	}

	/**
	* Caches the lessons in the entity cache if it is enabled.
	*
	* @param lessons the lessons
	*/
	public static void cacheResult(java.util.List<com.nyu.model.Lesson> lessons) {
		getPersistence().cacheResult(lessons);
	}

	/**
	* Creates a new lesson with the primary key. Does not add the lesson to the database.
	*
	* @param lessonId the primary key for the new lesson
	* @return the new lesson
	*/
	public static com.nyu.model.Lesson create(long lessonId) {
		return getPersistence().create(lessonId);
	}

	/**
	* Removes the lesson with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson that was removed
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson remove(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().remove(lessonId);
	}

	public static com.nyu.model.Lesson updateImpl(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lesson);
	}

	/**
	* Returns the lesson with the primary key or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson findByPrimaryKey(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException {
		return getPersistence().findByPrimaryKey(lessonId);
	}

	/**
	* Returns the lesson with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson, or <code>null</code> if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchByPrimaryKey(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lessonId);
	}

	/**
	* Returns all the lessons.
	*
	* @return the lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lessons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lessons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lessons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lessons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lessons.
	*
	* @return the number of lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LessonPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LessonPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					LessonPersistence.class.getName());

			ReferenceRegistry.registerReference(LessonUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LessonPersistence persistence) {
	}

	private static LessonPersistence _persistence;
}