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

import com.nyu.model.AnswerRequest;

import java.util.List;

/**
 * The persistence utility for the answer request service. This utility wraps {@link AnswerRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see AnswerRequestPersistence
 * @see AnswerRequestPersistenceImpl
 * @generated
 */
public class AnswerRequestUtil {
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
	public static void clearCache(AnswerRequest answerRequest) {
		getPersistence().clearCache(answerRequest);
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
	public static List<AnswerRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AnswerRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AnswerRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AnswerRequest update(AnswerRequest answerRequest)
		throws SystemException {
		return getPersistence().update(answerRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AnswerRequest update(AnswerRequest answerRequest,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(answerRequest, serviceContext);
	}

	/**
	* Returns all the answer requests where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @return the matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.AnswerRequest> findByAnswerRequestList(
		long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAnswerRequestList(requestLessonId);
	}

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
	public static java.util.List<com.nyu.model.AnswerRequest> findByAnswerRequestList(
		long requestLessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAnswerRequestList(requestLessonId, start, end);
	}

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
	public static java.util.List<com.nyu.model.AnswerRequest> findByAnswerRequestList(
		long requestLessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAnswerRequestList(requestLessonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest findByAnswerRequestList_First(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence()
				   .findByAnswerRequestList_First(requestLessonId,
			orderByComparator);
	}

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest fetchByAnswerRequestList_First(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAnswerRequestList_First(requestLessonId,
			orderByComparator);
	}

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest findByAnswerRequestList_Last(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence()
				   .findByAnswerRequestList_Last(requestLessonId,
			orderByComparator);
	}

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest fetchByAnswerRequestList_Last(
		long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAnswerRequestList_Last(requestLessonId,
			orderByComparator);
	}

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
	public static com.nyu.model.AnswerRequest[] findByAnswerRequestList_PrevAndNext(
		long answerId, long requestLessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence()
				   .findByAnswerRequestList_PrevAndNext(answerId,
			requestLessonId, orderByComparator);
	}

	/**
	* Removes all the answer requests where requestLessonId = &#63; from the database.
	*
	* @param requestLessonId the request lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAnswerRequestList(long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAnswerRequestList(requestLessonId);
	}

	/**
	* Returns the number of answer requests where requestLessonId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @return the number of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAnswerRequestList(long requestLessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAnswerRequestList(requestLessonId);
	}

	/**
	* Returns all the answer requests where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @return the matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.AnswerRequest> findByCollaborationLesson(
		long requestLessonId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCollaborationLesson(requestLessonId, userId);
	}

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
	public static java.util.List<com.nyu.model.AnswerRequest> findByCollaborationLesson(
		long requestLessonId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCollaborationLesson(requestLessonId, userId, start,
			end);
	}

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
	public static java.util.List<com.nyu.model.AnswerRequest> findByCollaborationLesson(
		long requestLessonId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCollaborationLesson(requestLessonId, userId, start,
			end, orderByComparator);
	}

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
	public static com.nyu.model.AnswerRequest findByCollaborationLesson_First(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence()
				   .findByCollaborationLesson_First(requestLessonId, userId,
			orderByComparator);
	}

	/**
	* Returns the first answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest fetchByCollaborationLesson_First(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCollaborationLesson_First(requestLessonId, userId,
			orderByComparator);
	}

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
	public static com.nyu.model.AnswerRequest findByCollaborationLesson_Last(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence()
				   .findByCollaborationLesson_Last(requestLessonId, userId,
			orderByComparator);
	}

	/**
	* Returns the last answer request in the ordered set where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching answer request, or <code>null</code> if a matching answer request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest fetchByCollaborationLesson_Last(
		long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCollaborationLesson_Last(requestLessonId, userId,
			orderByComparator);
	}

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
	public static com.nyu.model.AnswerRequest[] findByCollaborationLesson_PrevAndNext(
		long answerId, long requestLessonId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence()
				   .findByCollaborationLesson_PrevAndNext(answerId,
			requestLessonId, userId, orderByComparator);
	}

	/**
	* Removes all the answer requests where requestLessonId = &#63; and userId = &#63; from the database.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCollaborationLesson(long requestLessonId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCollaborationLesson(requestLessonId, userId);
	}

	/**
	* Returns the number of answer requests where requestLessonId = &#63; and userId = &#63;.
	*
	* @param requestLessonId the request lesson ID
	* @param userId the user ID
	* @return the number of matching answer requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCollaborationLesson(long requestLessonId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCollaborationLesson(requestLessonId, userId);
	}

	/**
	* Caches the answer request in the entity cache if it is enabled.
	*
	* @param answerRequest the answer request
	*/
	public static void cacheResult(com.nyu.model.AnswerRequest answerRequest) {
		getPersistence().cacheResult(answerRequest);
	}

	/**
	* Caches the answer requests in the entity cache if it is enabled.
	*
	* @param answerRequests the answer requests
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.AnswerRequest> answerRequests) {
		getPersistence().cacheResult(answerRequests);
	}

	/**
	* Creates a new answer request with the primary key. Does not add the answer request to the database.
	*
	* @param answerId the primary key for the new answer request
	* @return the new answer request
	*/
	public static com.nyu.model.AnswerRequest create(long answerId) {
		return getPersistence().create(answerId);
	}

	/**
	* Removes the answer request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request that was removed
	* @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest remove(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence().remove(answerId);
	}

	public static com.nyu.model.AnswerRequest updateImpl(
		com.nyu.model.AnswerRequest answerRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(answerRequest);
	}

	/**
	* Returns the answer request with the primary key or throws a {@link com.nyu.NoSuchAnswerRequestException} if it could not be found.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request
	* @throws com.nyu.NoSuchAnswerRequestException if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest findByPrimaryKey(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchAnswerRequestException {
		return getPersistence().findByPrimaryKey(answerId);
	}

	/**
	* Returns the answer request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param answerId the primary key of the answer request
	* @return the answer request, or <code>null</code> if a answer request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.AnswerRequest fetchByPrimaryKey(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(answerId);
	}

	/**
	* Returns all the answer requests.
	*
	* @return the answer requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.AnswerRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nyu.model.AnswerRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nyu.model.AnswerRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the answer requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of answer requests.
	*
	* @return the number of answer requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AnswerRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AnswerRequestPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					AnswerRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(AnswerRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AnswerRequestPersistence persistence) {
	}

	private static AnswerRequestPersistence _persistence;
}