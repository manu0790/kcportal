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

import com.nyu.model.AnswerRequest;

/**
 * The persistence interface for the answer request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AnswerRequestPersistenceImpl
 * @see AnswerRequestUtil
 * @generated
 */
public interface AnswerRequestPersistence extends BasePersistence<AnswerRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AnswerRequestUtil} to access the answer request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the answer requests where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @return the matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findByAnswerRequestList(
		long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the answer requests where requestLessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestLessonId the request lesson ID
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @return the range of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findByAnswerRequestList(
		long requestLessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the answer requests where requestLessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestLessonId the request lesson ID
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findByAnswerRequestList(
		long requestLessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest findByAnswerRequestList_First(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest fetchByAnswerRequestList_First(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest findByAnswerRequestList_Last(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest fetchByAnswerRequestList_Last(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the answer requests before and after the current answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param answerId the primary key of the current answer request
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest[] findByAnswerRequestList_PrevAndNext(
		long answerId, long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Removes all the answer requests where requestLessonId = &#63; from the database.
	*
	* @param requestLessonId the request lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAnswerRequestList(long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of answer requests where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @return the number of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByAnswerRequestList(long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the answer requests where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @return the matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findByCollaborationLesson(
		long requestLessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the answer requests where requestLessonId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @return the range of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findByCollaborationLesson(
		long requestLessonId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the answer requests where requestLessonId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findByCollaborationLesson(
		long requestLessonId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest findByCollaborationLesson_First(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest fetchByCollaborationLesson_First(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest findByCollaborationLesson_Last(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest fetchByCollaborationLesson_Last(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the answer requests before and after the current answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param answerId the primary key of the current answer request
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest[] findByCollaborationLesson_PrevAndNext(
		long answerId, long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Removes all the answer requests where requestLessonId = &#63; and userId = &#63; from the database.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCollaborationLesson(long requestLessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of answer requests where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @return the number of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByCollaborationLesson(long requestLessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the answer request in the entity cache if it is enabled.
	*
	* @param answerRequest the answer request
	*/
	public void cacheResult(com.nyu.model.AnswerRequest answerRequest);

	/**
	* Caches the answer requests in the entity cache if it is enabled.
	*
	* @param answerRequests the answer requests
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.AnswerRequest> answerRequests);

	/**
	* Creates a new answer request with the primary key. Does not add the answer request to the database.
	*
	* @param answerId the primary key for the new answer request
	* @return the new answer request
	*/
	public com.nyu.model.AnswerRequest create(long answerId);

	/**
	* Removes the answer request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request that was removed
	* @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest remove(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	public com.nyu.model.AnswerRequest updateImpl(
		com.nyu.model.AnswerRequest answerRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the answer request with the primary key or throws a {@link com.nyu.NoSuchAnswerRequestException} if it could not be found.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest findByPrimaryKey(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException;

	/**
	* Returns the answer request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request, or <code>null</code> if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.AnswerRequest fetchByPrimaryKey(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the answer requests.
	*
	* @return the answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the answer requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @return the range of answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the answer requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.AnswerRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of answer requests
	* @param end the upper bound of the range of answer requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of answer requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.AnswerRequest> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the answer requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of answer requests.
	*
	* @return the number of answer requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}