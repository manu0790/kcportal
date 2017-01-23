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

import com.nyu.model.LessonCollaboration;

/**
 * The persistence interface for the lesson collaboration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonCollaborationPersistenceImpl
 * @see LessonCollaborationUtil
 * @generated
 */
public interface LessonCollaborationPersistence extends BasePersistence<LessonCollaboration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LessonCollaborationUtil} to access the lesson collaboration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the lesson collaboration where lessonId = &#63; and userId = &#63; or throws a {@link com.nyu.NoSuchLessonCollaborationException} if it could not be found.
	*
	* @param lessonId the lesson ID
	* @param userId the user ID
	* @return the matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findBylessonCollabUserExistence(
		long lessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the lesson collaboration where lessonId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param lessonId the lesson ID
	* @param userId the user ID
	* @return the matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchBylessonCollabUserExistence(
		long lessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaboration where lessonId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param lessonId the lesson ID
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchBylessonCollabUserExistence(
		long lessonId, long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the lesson collaboration where lessonId = &#63; and userId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param userId the user ID
	* @return the lesson collaboration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration removeBylessonCollabUserExistence(
		long lessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the number of lesson collaborations where lessonId = &#63; and userId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param userId the user ID
	* @return the number of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonCollabUserExistence(long lessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @return the matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findBylessonCollabUserList(
		long lessonId, java.lang.String memberStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findBylessonCollabUserList(
		long lessonId, java.lang.String memberStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findBylessonCollabUserList(
		long lessonId, java.lang.String memberStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findBylessonCollabUserList_First(
		long lessonId, java.lang.String memberStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the first lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchBylessonCollabUserList_First(
		long lessonId, java.lang.String memberStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findBylessonCollabUserList_Last(
		long lessonId, java.lang.String memberStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the last lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchBylessonCollabUserList_Last(
		long lessonId, java.lang.String memberStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param id the primary key of the current lesson collaboration
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration[] findBylessonCollabUserList_PrevAndNext(
		long id, long lessonId, java.lang.String memberStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Removes all the lesson collaborations where lessonId = &#63; and memberStatus = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonCollabUserList(long lessonId,
		java.lang.String memberStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson collaborations where lessonId = &#63; and memberStatus = &#63;.
	*
	* @param lessonId the lesson ID
	* @param memberStatus the member status
	* @return the number of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonCollabUserList(long lessonId,
		java.lang.String memberStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson collaborations where lessonId = &#63; and type = &#63;.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @return the matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findBylessonCollabUserListByType(
		long lessonId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lesson collaborations where lessonId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findBylessonCollabUserListByType(
		long lessonId, java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lesson collaborations where lessonId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findBylessonCollabUserListByType(
		long lessonId, java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findBylessonCollabUserListByType_First(
		long lessonId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the first lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchBylessonCollabUserListByType_First(
		long lessonId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findBylessonCollabUserListByType_Last(
		long lessonId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the last lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchBylessonCollabUserListByType_Last(
		long lessonId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where lessonId = &#63; and type = &#63;.
	*
	* @param id the primary key of the current lesson collaboration
	* @param lessonId the lesson ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration[] findBylessonCollabUserListByType_PrevAndNext(
		long id, long lessonId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Removes all the lesson collaborations where lessonId = &#63; and type = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonCollabUserListByType(long lessonId,
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson collaborations where lessonId = &#63; and type = &#63;.
	*
	* @param lessonId the lesson ID
	* @param type the type
	* @return the number of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonCollabUserListByType(long lessonId,
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson collaborations where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @return the matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonCollabByUserId(
		long userId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lesson collaborations where userId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param type the type
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonCollabByUserId(
		long userId, java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lesson collaborations where userId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param type the type
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonCollabByUserId(
		long userId, java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByallLessonCollabByUserId_First(
		long userId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the first lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByallLessonCollabByUserId_First(
		long userId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByallLessonCollabByUserId_Last(
		long userId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the last lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByallLessonCollabByUserId_Last(
		long userId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where userId = &#63; and type = &#63;.
	*
	* @param id the primary key of the current lesson collaboration
	* @param userId the user ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration[] findByallLessonCollabByUserId_PrevAndNext(
		long id, long userId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Removes all the lesson collaborations where userId = &#63; and type = &#63; from the database.
	*
	* @param userId the user ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByallLessonCollabByUserId(long userId,
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson collaborations where userId = &#63; and type = &#63;.
	*
	* @param userId the user ID
	* @param type the type
	* @return the number of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countByallLessonCollabByUserId(long userId, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson collaborations where userId = &#63; and accessPermission = &#63;.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @return the matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonAccessPermissionByUserId(
		long userId, java.lang.String accessPermission)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lesson collaborations where userId = &#63; and accessPermission = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonAccessPermissionByUserId(
		long userId, java.lang.String accessPermission, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lesson collaborations where userId = &#63; and accessPermission = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonAccessPermissionByUserId(
		long userId, java.lang.String accessPermission, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByallLessonAccessPermissionByUserId_First(
		long userId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the first lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByallLessonAccessPermissionByUserId_First(
		long userId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByallLessonAccessPermissionByUserId_Last(
		long userId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the last lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByallLessonAccessPermissionByUserId_Last(
		long userId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where userId = &#63; and accessPermission = &#63;.
	*
	* @param id the primary key of the current lesson collaboration
	* @param userId the user ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration[] findByallLessonAccessPermissionByUserId_PrevAndNext(
		long id, long userId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Removes all the lesson collaborations where userId = &#63; and accessPermission = &#63; from the database.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @throws SystemException if a system exception occurred
	*/
	public void removeByallLessonAccessPermissionByUserId(long userId,
		java.lang.String accessPermission)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson collaborations where userId = &#63; and accessPermission = &#63;.
	*
	* @param userId the user ID
	* @param accessPermission the access permission
	* @return the number of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countByallLessonAccessPermissionByUserId(long userId,
		java.lang.String accessPermission)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @return the matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonAccessPermissionByLessonId(
		long lessonId, java.lang.String accessPermission)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonAccessPermissionByLessonId(
		long lessonId, java.lang.String accessPermission, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findByallLessonAccessPermissionByLessonId(
		long lessonId, java.lang.String accessPermission, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByallLessonAccessPermissionByLessonId_First(
		long lessonId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the first lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByallLessonAccessPermissionByLessonId_First(
		long lessonId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByallLessonAccessPermissionByLessonId_Last(
		long lessonId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the last lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson collaboration, or <code>null</code> if a matching lesson collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByallLessonAccessPermissionByLessonId_Last(
		long lessonId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaborations before and after the current lesson collaboration in the ordered set where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param id the primary key of the current lesson collaboration
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration[] findByallLessonAccessPermissionByLessonId_PrevAndNext(
		long id, long lessonId, java.lang.String accessPermission,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Removes all the lesson collaborations where lessonId = &#63; and accessPermission = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @throws SystemException if a system exception occurred
	*/
	public void removeByallLessonAccessPermissionByLessonId(long lessonId,
		java.lang.String accessPermission)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson collaborations where lessonId = &#63; and accessPermission = &#63;.
	*
	* @param lessonId the lesson ID
	* @param accessPermission the access permission
	* @return the number of matching lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countByallLessonAccessPermissionByLessonId(long lessonId,
		java.lang.String accessPermission)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the lesson collaboration in the entity cache if it is enabled.
	*
	* @param lessonCollaboration the lesson collaboration
	*/
	public void cacheResult(
		com.nyu.model.LessonCollaboration lessonCollaboration);

	/**
	* Caches the lesson collaborations in the entity cache if it is enabled.
	*
	* @param lessonCollaborations the lesson collaborations
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.LessonCollaboration> lessonCollaborations);

	/**
	* Creates a new lesson collaboration with the primary key. Does not add the lesson collaboration to the database.
	*
	* @param id the primary key for the new lesson collaboration
	* @return the new lesson collaboration
	*/
	public com.nyu.model.LessonCollaboration create(long id);

	/**
	* Removes the lesson collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lesson collaboration
	* @return the lesson collaboration that was removed
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	public com.nyu.model.LessonCollaboration updateImpl(
		com.nyu.model.LessonCollaboration lessonCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lesson collaboration with the primary key or throws a {@link com.nyu.NoSuchLessonCollaborationException} if it could not be found.
	*
	* @param id the primary key of the lesson collaboration
	* @return the lesson collaboration
	* @throws com.nyu.NoSuchLessonCollaborationException if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonCollaborationException;

	/**
	* Returns the lesson collaboration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lesson collaboration
	* @return the lesson collaboration, or <code>null</code> if a lesson collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.LessonCollaboration fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lesson collaborations.
	*
	* @return the lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lesson collaborations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @return the range of lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lesson collaborations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson collaborations
	* @param end the upper bound of the range of lesson collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.LessonCollaboration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lesson collaborations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lesson collaborations.
	*
	* @return the number of lesson collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}