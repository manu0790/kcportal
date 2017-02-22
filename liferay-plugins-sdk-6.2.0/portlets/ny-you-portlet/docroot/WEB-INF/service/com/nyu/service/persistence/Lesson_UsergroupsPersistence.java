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

import com.nyu.model.Lesson_Usergroups;

/**
 * The persistence interface for the lesson_ usergroups service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Lesson_UsergroupsPersistenceImpl
 * @see Lesson_UsergroupsUtil
 * @generated
 */
public interface Lesson_UsergroupsPersistence extends BasePersistence<Lesson_Usergroups> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Lesson_UsergroupsUtil} to access the lesson_ usergroups persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the lesson_ usergroupses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson_Usergroups> findBylessonsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson_Usergroups> findBylessonsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson_Usergroups> findBylessonsByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups findBylessonsByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Returns the first lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups fetchBylessonsByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups findBylessonsByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Returns the last lesson_ usergroups in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups fetchBylessonsByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson_Usergroups[] findBylessonsByGroupId_PrevAndNext(
		Lesson_UsergroupsPK lesson_UsergroupsPK, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Removes all the lesson_ usergroupses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson_ usergroupses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson_ usergroupses where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson_Usergroups> findBygroupsByLessonId(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson_Usergroups> findBygroupsByLessonId(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson_Usergroups> findBygroupsByLessonId(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups findBygroupsByLessonId_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Returns the first lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups fetchBygroupsByLessonId_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups findBygroupsByLessonId_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Returns the last lesson_ usergroups in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson_ usergroups, or <code>null</code> if a matching lesson_ usergroups could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups fetchBygroupsByLessonId_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.Lesson_Usergroups[] findBygroupsByLessonId_PrevAndNext(
		Lesson_UsergroupsPK lesson_UsergroupsPK, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Removes all the lesson_ usergroupses where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygroupsByLessonId(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson_ usergroupses where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public int countBygroupsByLessonId(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the lesson_ usergroups in the entity cache if it is enabled.
	*
	* @param lesson_Usergroups the lesson_ usergroups
	*/
	public void cacheResult(com.nyu.model.Lesson_Usergroups lesson_Usergroups);

	/**
	* Caches the lesson_ usergroupses in the entity cache if it is enabled.
	*
	* @param lesson_Usergroupses the lesson_ usergroupses
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.Lesson_Usergroups> lesson_Usergroupses);

	/**
	* Creates a new lesson_ usergroups with the primary key. Does not add the lesson_ usergroups to the database.
	*
	* @param lesson_UsergroupsPK the primary key for the new lesson_ usergroups
	* @return the new lesson_ usergroups
	*/
	public com.nyu.model.Lesson_Usergroups create(
		Lesson_UsergroupsPK lesson_UsergroupsPK);

	/**
	* Removes the lesson_ usergroups with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	* @return the lesson_ usergroups that was removed
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups remove(
		Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	public com.nyu.model.Lesson_Usergroups updateImpl(
		com.nyu.model.Lesson_Usergroups lesson_Usergroups)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson_ usergroups with the primary key or throws a {@link com.nyu.NoSuchLesson_UsergroupsException} if it could not be found.
	*
	* @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	* @return the lesson_ usergroups
	* @throws com.nyu.NoSuchLesson_UsergroupsException if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups findByPrimaryKey(
		Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLesson_UsergroupsException;

	/**
	* Returns the lesson_ usergroups with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lesson_UsergroupsPK the primary key of the lesson_ usergroups
	* @return the lesson_ usergroups, or <code>null</code> if a lesson_ usergroups with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Lesson_Usergroups fetchByPrimaryKey(
		Lesson_UsergroupsPK lesson_UsergroupsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson_ usergroupses.
	*
	* @return the lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Lesson_Usergroups> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson_Usergroups> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.Lesson_Usergroups> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lesson_ usergroupses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson_ usergroupses.
	*
	* @return the number of lesson_ usergroupses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}