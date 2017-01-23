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

import com.nyu.model.Lesson_Usergroups;

import java.util.List;

/**
 * The persistence utility for the lesson_ usergroups service. This utility wraps {@link Lesson_UsergroupsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson_UsergroupsPersistence
 * @see Lesson_UsergroupsPersistenceImpl
 * @generated
 */
public class Lesson_UsergroupsUtil {
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
	public static void clearCache(Lesson_Usergroups lesson_Usergroups) {
		getPersistence().clearCache(lesson_Usergroups);
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
	public static List<Lesson_Usergroups> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Lesson_Usergroups> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Lesson_Usergroups> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Lesson_Usergroups update(Lesson_Usergroups lesson_Usergroups)
		throws SystemException {
		return getPersistence().update(lesson_Usergroups);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Lesson_Usergroups update(
		Lesson_Usergroups lesson_Usergroups, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lesson_Usergroups, serviceContext);
	}

	/**
	* Returns all the lesson_ usergroupses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findBylessonsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonsByGroupId(groupId);
	}

	/**
	* Returns a range of all the lesson_ usergroupses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of lesson_ usergroupses
	* @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	* @return the range of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findBylessonsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonsByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the lesson_ usergroupses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of lesson_ usergroupses
	* @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findBylessonsByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonsByGroupId(groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups findBylessonsByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence()
				   .findBylessonsByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups fetchBylessonsByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups findBylessonsByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence()
				   .findBylessonsByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups fetchBylessonsByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonsByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the lesson_ usergroupses before and after the current lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param lesson_UsergroupsPK the primary key of the current lesson_ usergroups
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups[] findBylessonsByGroupId_PrevAndNext(
		com.nyu.service.persistence.Lesson_UsergroupsPK lesson_UsergroupsPK,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence()
				   .findBylessonsByGroupId_PrevAndNext(lesson_UsergroupsPK,
			groupId, orderByComparator);
	}

	/**
	* Removes all the lesson_ usergroupses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonsByGroupId(groupId);
	}

	/**
	* Returns the number of lesson_ usergroupses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonsByGroupId(groupId);
	}

	/**
	* Returns all the lesson_ usergroupses where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findBygroupsByLessonId(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupsByLessonId(lessonId);
	}

	/**
	* Returns a range of all the lesson_ usergroupses where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of lesson_ usergroupses
	* @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	* @return the range of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findBygroupsByLessonId(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupsByLessonId(lessonId, start, end);
	}

	/**
	* Returns an ordered range of all the lesson_ usergroupses where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of lesson_ usergroupses
	* @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findBygroupsByLessonId(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupsByLessonId(lessonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups findBygroupsByLessonId_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence()
				   .findBygroupsByLessonId_First(lessonId, orderByComparator);
	}

	/**
	* Returns the first lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups fetchBygroupsByLessonId_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygroupsByLessonId_First(lessonId, orderByComparator);
	}

	/**
	* Returns the last lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups findBygroupsByLessonId_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence()
				   .findBygroupsByLessonId_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the last lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups fetchBygroupsByLessonId_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygroupsByLessonId_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the lesson_ usergroupses before and after the current lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lesson_UsergroupsPK the primary key of the current lesson_ usergroups
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups[] findBygroupsByLessonId_PrevAndNext(
		com.nyu.service.persistence.Lesson_UsergroupsPK lesson_UsergroupsPK,
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence()
				   .findBygroupsByLessonId_PrevAndNext(lesson_UsergroupsPK,
			lessonId, orderByComparator);
	}

	/**
	* Removes all the lesson_ usergroupses where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygroupsByLessonId(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygroupsByLessonId(lessonId);
	}

	/**
	* Returns the number of lesson_ usergroupses where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygroupsByLessonId(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygroupsByLessonId(lessonId);
	}

	/**
	* Caches the lesson_ usergroups in the entity cache if it is enabled.
	*
	* @param lesson_Usergroups the lesson_ usergroups
	*/
	public static void cacheResult(
		com.nyu.model.Lesson_Usergroups lesson_Usergroups) {
		getPersistence().cacheResult(lesson_Usergroups);
	}

	/**
	* Caches the lesson_ usergroupses in the entity cache if it is enabled.
	*
	* @param lesson_Usergroupses the lesson_ usergroupses
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.Lesson_Usergroups> lesson_Usergroupses) {
		getPersistence().cacheResult(lesson_Usergroupses);
	}

	/**
	* Creates a new lesson_ usergroups with the primary key. Does not add the lesson_ usergroups to the database.
	*
	* @param lesson_UsergroupsPK the primary key for the new lesson_ usergroups
	* @return the new lesson_ usergroups
	*/
	public static com.nyu.model.Lesson_Usergroups create(
		com.nyu.service.persistence.Lesson_UsergroupsPK lesson_UsergroupsPK) {
		return getPersistence().create(lesson_UsergroupsPK);
	}

	/**
	* Removes the lesson_ usergroups with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	* @return the lesson_ usergroups that was removed
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups remove(
		com.nyu.service.persistence.Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence().remove(lesson_UsergroupsPK);
	}

	public static com.nyu.model.Lesson_Usergroups updateImpl(
		com.nyu.model.Lesson_Usergroups lesson_Usergroups)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lesson_Usergroups);
	}

	/**
	* Returns the lesson_ usergroups with the primary key or throws a {@link com.nyu.NoSuchLesson_UsergroupsException} if it could not be found.
	*
	* @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	* @return the lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups findByPrimaryKey(
		com.nyu.service.persistence.Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException {
		return getPersistence().findByPrimaryKey(lesson_UsergroupsPK);
	}

	/**
	* Returns the lesson_ usergroups with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	* @return the lesson_ usergroups, or <code>null</code> if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson_Usergroups fetchByPrimaryKey(
		com.nyu.service.persistence.Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lesson_UsergroupsPK);
	}

	/**
	* Returns all the lesson_ usergroupses.
	*
	* @return the lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lesson_ usergroupses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson_ usergroupses
	* @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	* @return the range of lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lesson_ usergroupses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.Lesson_UsergroupsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson_ usergroupses
	* @param end the upper bound of the range of lesson_ usergroupses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Lesson_Usergroups> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lesson_ usergroupses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lesson_ usergroupses.
	*
	* @return the number of lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Lesson_UsergroupsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Lesson_UsergroupsPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					Lesson_UsergroupsPersistence.class.getName());

			ReferenceRegistry.registerReference(Lesson_UsergroupsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(Lesson_UsergroupsPersistence persistence) {
	}

	private static Lesson_UsergroupsPersistence _persistence;
}