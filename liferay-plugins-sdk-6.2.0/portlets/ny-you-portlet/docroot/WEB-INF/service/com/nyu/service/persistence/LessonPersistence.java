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

import com.nyu.model.Lesson;

/**
 * The persistence interface for the lesson service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonPersistenceImpl
 * @see LessonUtil
 * @generated
 */
public interface LessonPersistence extends BasePersistence<Lesson> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LessonUtil} to access the lesson persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the lessons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findByUuid_PrevAndNext(long lessonId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson where uuid = &#63; and groupId = &#63; or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the lesson where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the lesson where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the number of lessons where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findByUuid_C_PrevAndNext(long lessonId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findBylessonNameCollection(
		java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonNameCollection(
		java.lang.String lessonName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonNameCollection(
		java.lang.String lessonName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessonNameCollection_First(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonNameCollection_First(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessonNameCollection_Last(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonNameCollection_Last(
		java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findBylessonNameCollection_PrevAndNext(
		long lessonId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where lessonName = &#63; from the database.
	*
	* @param lessonName the lesson name
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonNameCollection(java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where lessonName = &#63;.
	*
	* @param lessonName the lesson name
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonNameCollection(java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findByLessonsMarkedAs(
		java.lang.String markedAs)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByLessonsMarkedAs(
		java.lang.String markedAs, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByLessonsMarkedAs(
		java.lang.String markedAs, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByLessonsMarkedAs_First(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByLessonsMarkedAs_First(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByLessonsMarkedAs_Last(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByLessonsMarkedAs_Last(
		java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findByLessonsMarkedAs_PrevAndNext(
		long lessonId, java.lang.String markedAs,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where markedAs = &#63; from the database.
	*
	* @param markedAs the marked as
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLessonsMarkedAs(java.lang.String markedAs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where markedAs = &#63;.
	*
	* @param markedAs the marked as
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByLessonsMarkedAs(java.lang.String markedAs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where status = &#63;.
	*
	* @param status the status
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findBylessons_status(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_status(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_status(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessons_status_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessons_status_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessons_status_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessons_status_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findBylessons_status_PrevAndNext(
		long lessonId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessons_status(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where status = &#63;.
	*
	* @param status the status
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessons_status(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String lessonPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String lessonPrivacy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String lessonPrivacy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessons_privacy_First(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessons_privacy_First(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessons_privacy_Last(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessons_privacy_Last(
		java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findBylessons_privacy_PrevAndNext(
		long lessonId, java.lang.String lessonPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String[] lessonPrivacies)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String[] lessonPrivacies, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessons_privacy(
		java.lang.String[] lessonPrivacies, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lessons where lessonPrivacy = &#63; from the database.
	*
	* @param lessonPrivacy the lesson privacy
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessons_privacy(java.lang.String lessonPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where lessonPrivacy = &#63;.
	*
	* @param lessonPrivacy the lesson privacy
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessons_privacy(java.lang.String lessonPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where lessonPrivacy = any &#63;.
	*
	* @param lessonPrivacies the lesson privacies
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessons_privacy(java.lang.String[] lessonPrivacies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findBylessonNameWithCompanyId(
		long companyId, java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonNameWithCompanyId(
		long companyId, java.lang.String lessonName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonNameWithCompanyId(
		long companyId, java.lang.String lessonName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findBylessonNameWithCompanyId_First(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonNameWithCompanyId_First(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findBylessonNameWithCompanyId_Last(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonNameWithCompanyId_Last(
		long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findBylessonNameWithCompanyId_PrevAndNext(
		long lessonId, long companyId, java.lang.String lessonName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where companyId = &#63; and lessonName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonNameWithCompanyId(long companyId,
		java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where companyId = &#63; and lessonName = &#63;.
	*
	* @param companyId the company ID
	* @param lessonName the lesson name
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonNameWithCompanyId(long companyId,
		java.lang.String lessonName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthor(
		long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthor(
		long currentAuthor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthor(
		long currentAuthor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessonsUploadedByAuthor_First(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonsUploadedByAuthor_First(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessonsUploadedByAuthor_Last(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonsUploadedByAuthor_Last(
		long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findBylessonsUploadedByAuthor_PrevAndNext(
		long lessonId, long currentAuthor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where currentAuthor = &#63; from the database.
	*
	* @param currentAuthor the current author
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonsUploadedByAuthor(long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where currentAuthor = &#63;.
	*
	* @param currentAuthor the current author
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonsUploadedByAuthor(long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findBylessonsUploadedByAuthorAndStatus(
		long currentAuthor, java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findBylessonsUploadedByAuthorAndStatus_First(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonsUploadedByAuthorAndStatus_First(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findBylessonsUploadedByAuthorAndStatus_Last(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonsUploadedByAuthorAndStatus_Last(
		long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findBylessonsUploadedByAuthorAndStatus_PrevAndNext(
		long lessonId, long currentAuthor, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where currentAuthor = &#63; and status = &#63; from the database.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonsUploadedByAuthorAndStatus(long currentAuthor,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where currentAuthor = &#63; and status = &#63;.
	*
	* @param currentAuthor the current author
	* @param status the status
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonsUploadedByAuthorAndStatus(long currentAuthor,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson where lessonId = &#63; and currentAuthor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the lesson where lessonId = &#63; and currentAuthor = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson removeBylessonsUploadedByAuthorByLessonId(
		long lessonId, long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the number of lessons where lessonId = &#63; and currentAuthor = &#63;.
	*
	* @param lessonId the lesson ID
	* @param currentAuthor the current author
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonsUploadedByAuthorByLessonId(long lessonId,
		long currentAuthor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByGroupId(long groupId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findByGroupId_PrevAndNext(long lessonId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson
	* @throws com.nyu.NoSuchLessonException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findByCompanyId_PrevAndNext(long lessonId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @return the matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findByG_S(long groupId,
		int lessonStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByG_S(long groupId,
		int lessonStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findByG_S(long groupId,
		int lessonStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findByG_S_First(long groupId, int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the first lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByG_S_First(long groupId,
		int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson findByG_S_Last(long groupId, int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the last lesson in the ordered set where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByG_S_Last(long groupId, int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson[] findByG_S_PrevAndNext(long lessonId,
		long groupId, int lessonStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Removes all the lessons where groupId = &#63; and lessonStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, int lessonStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons where groupId = &#63; and lessonStatus = &#63;.
	*
	* @param groupId the group ID
	* @param lessonStatus the lesson status
	* @return the number of matching lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, int lessonStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the lesson in the entity cache if it is enabled.
	*
	* @param lesson the lesson
	*/
	public void cacheResult(com.nyu.model.Lesson lesson);

	/**
	* Caches the lessons in the entity cache if it is enabled.
	*
	* @param lessons the lessons
	*/
	public void cacheResult(java.util.List<com.nyu.model.Lesson> lessons);

	/**
	* Creates a new lesson with the primary key. Does not add the lesson to the database.
	*
	* @param lessonId the primary key for the new lesson
	* @return the new lesson
	*/
	public com.nyu.model.Lesson create(long lessonId);

	/**
	* Removes the lesson with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson that was removed
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson remove(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	public com.nyu.model.Lesson updateImpl(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson with the primary key or throws a {@link com.nyu.NoSuchLessonException} if it could not be found.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson
	* @throws com.nyu.NoSuchLessonException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson findByPrimaryKey(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonException;

	/**
	* Returns the lesson with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson, or <code>null</code> if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson fetchByPrimaryKey(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lessons.
	*
	* @return the lessons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lessons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lessons.
	*
	* @return the number of lessons
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}