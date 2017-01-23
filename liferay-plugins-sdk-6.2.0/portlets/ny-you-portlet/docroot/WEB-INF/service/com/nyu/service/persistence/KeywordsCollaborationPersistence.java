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

import com.nyu.model.KeywordsCollaboration;

/**
 * The persistence interface for the keywords collaboration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see KeywordsCollaborationPersistenceImpl
 * @see KeywordsCollaborationUtil
 * @generated
 */
public interface KeywordsCollaborationPersistence extends BasePersistence<KeywordsCollaboration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeywordsCollaborationUtil} to access the keywords collaboration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or throws a {@link com.nyu.NoSuchKeywordsCollaborationException} if it could not be found.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findByrequestStatus(
		long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchByrequestStatus(
		long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchByrequestStatus(
		long keywordId, long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the keywords collaboration where keywordId = &#63; and userId = &#63; from the database.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the keywords collaboration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration removeByrequestStatus(
		long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the number of keywords collaborations where keywordId = &#63; and userId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countByrequestStatus(long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the keywords collaborations where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @return the matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordExistence(
		long keywordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the keywords collaborations where keywordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keywordId the keyword ID
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @return the range of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordExistence(
		long keywordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the keywords collaborations where keywordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keywordId the keyword ID
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordExistence(
		long keywordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findBykeywordExistence_First(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the first keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchBykeywordExistence_First(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findBykeywordExistence_Last(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the last keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchBykeywordExistence_Last(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the keywords collaborations before and after the current keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param id the primary key of the current keywords collaboration
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration[] findBykeywordExistence_PrevAndNext(
		long id, long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Removes all the keywords collaborations where keywordId = &#63; from the database.
	*
	* @param keywordId the keyword ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBykeywordExistence(long keywordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of keywords collaborations where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countBykeywordExistence(long keywordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the keywords collaborations where status = &#63;.
	*
	* @param status the status
	* @return the matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordCollaListbyStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the keywords collaborations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @return the range of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordCollaListbyStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the keywords collaborations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordCollaListbyStatus(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findBykeywordCollaListbyStatus_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the first keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchBykeywordCollaListbyStatus_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findBykeywordCollaListbyStatus_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the last keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchBykeywordCollaListbyStatus_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the keywords collaborations before and after the current keywords collaboration in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current keywords collaboration
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration[] findBykeywordCollaListbyStatus_PrevAndNext(
		long id, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Removes all the keywords collaborations where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBykeywordCollaListbyStatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of keywords collaborations where status = &#63;.
	*
	* @param status the status
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countBykeywordCollaListbyStatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the keywords collaborations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the keywords collaborations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @return the range of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the keywords collaborations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findBygetRequestStatusByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the first keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchBygetRequestStatusByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findBygetRequestStatusByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the last keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchBygetRequestStatusByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the keywords collaborations before and after the current keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current keywords collaboration
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration[] findBygetRequestStatusByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Removes all the keywords collaborations where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygetRequestStatusByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of keywords collaborations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countBygetRequestStatusByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the keywords collaboration in the entity cache if it is enabled.
	*
	* @param keywordsCollaboration the keywords collaboration
	*/
	public void cacheResult(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration);

	/**
	* Caches the keywords collaborations in the entity cache if it is enabled.
	*
	* @param keywordsCollaborations the keywords collaborations
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.KeywordsCollaboration> keywordsCollaborations);

	/**
	* Creates a new keywords collaboration with the primary key. Does not add the keywords collaboration to the database.
	*
	* @param id the primary key for the new keywords collaboration
	* @return the new keywords collaboration
	*/
	public com.nyu.model.KeywordsCollaboration create(long id);

	/**
	* Removes the keywords collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration that was removed
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	public com.nyu.model.KeywordsCollaboration updateImpl(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the keywords collaboration with the primary key or throws a {@link com.nyu.NoSuchKeywordsCollaborationException} if it could not be found.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException;

	/**
	* Returns the keywords collaboration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration, or <code>null</code> if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.KeywordsCollaboration fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the keywords collaborations.
	*
	* @return the keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the keywords collaborations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @return the range of keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the keywords collaborations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.KeywordsCollaboration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the keywords collaborations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of keywords collaborations.
	*
	* @return the number of keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}