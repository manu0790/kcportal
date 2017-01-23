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

import com.nyu.model.UserGroupRequest;

import java.util.List;

/**
 * The persistence utility for the user group request service. This utility wraps {@link UserGroupRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserGroupRequestPersistence
 * @see UserGroupRequestPersistenceImpl
 * @generated
 */
public class UserGroupRequestUtil {
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
	public static void clearCache(UserGroupRequest userGroupRequest) {
		getPersistence().clearCache(userGroupRequest);
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
	public static List<UserGroupRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserGroupRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserGroupRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserGroupRequest update(UserGroupRequest userGroupRequest)
		throws SystemException {
		return getPersistence().update(userGroupRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserGroupRequest update(UserGroupRequest userGroupRequest,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userGroupRequest, serviceContext);
	}

	/**
	* Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or throws a {@link com.nyu.NoSuchUserGroupRequestException} if it could not be found.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest findByfindRequestStatusByUser(
		long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByfindRequestStatusByUser(userGroupId, requestedBy);
	}

	/**
	* Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByfindRequestStatusByUser(
		long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindRequestStatusByUser(userGroupId, requestedBy);
	}

	/**
	* Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByfindRequestStatusByUser(
		long userGroupId, long requestedBy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindRequestStatusByUser(userGroupId, requestedBy,
			retrieveFromCache);
	}

	/**
	* Removes the user group request where userGroupId = &#63; and requestedBy = &#63; from the database.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the user group request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest removeByfindRequestStatusByUser(
		long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .removeByfindRequestStatusByUser(userGroupId, requestedBy);
	}

	/**
	* Returns the number of user group requests where userGroupId = &#63; and requestedBy = &#63;.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the number of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindRequestStatusByUser(long userGroupId,
		long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindRequestStatusByUser(userGroupId, requestedBy);
	}

	/**
	* Returns all the user group requests where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @return the matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindGroupRequestByStatus(userGroupId, status);
	}

	/**
	* Returns a range of all the user group requests where userGroupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @return the range of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindGroupRequestByStatus(userGroupId, status, start,
			end);
	}

	/**
	* Returns an ordered range of all the user group requests where userGroupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindGroupRequestByStatus(userGroupId, status, start,
			end, orderByComparator);
	}

	/**
	* Returns the first user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest findByfindGroupRequestByStatus_First(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByfindGroupRequestByStatus_First(userGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the first user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByfindGroupRequestByStatus_First(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindGroupRequestByStatus_First(userGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the last user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest findByfindGroupRequestByStatus_Last(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByfindGroupRequestByStatus_Last(userGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the last user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByfindGroupRequestByStatus_Last(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindGroupRequestByStatus_Last(userGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the user group requests before and after the current user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param id the primary key of the current user group request
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest[] findByfindGroupRequestByStatus_PrevAndNext(
		long id, long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByfindGroupRequestByStatus_PrevAndNext(id, userGroupId,
			status, orderByComparator);
	}

	/**
	* Removes all the user group requests where userGroupId = &#63; and status = &#63; from the database.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindGroupRequestByStatus(long userGroupId,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfindGroupRequestByStatus(userGroupId, status);
	}

	/**
	* Returns the number of user group requests where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @return the number of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindGroupRequestByStatus(long userGroupId,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindGroupRequestByStatus(userGroupId, status);
	}

	/**
	* Returns all the user group requests where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @return the matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findByrequestedBy(
		long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestedBy(requestedBy);
	}

	/**
	* Returns a range of all the user group requests where requestedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestedBy the requested by
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @return the range of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findByrequestedBy(
		long requestedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestedBy(requestedBy, start, end);
	}

	/**
	* Returns an ordered range of all the user group requests where requestedBy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestedBy the requested by
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findByrequestedBy(
		long requestedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByrequestedBy(requestedBy, start, end, orderByComparator);
	}

	/**
	* Returns the first user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest findByrequestedBy_First(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByrequestedBy_First(requestedBy, orderByComparator);
	}

	/**
	* Returns the first user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByrequestedBy_First(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestedBy_First(requestedBy, orderByComparator);
	}

	/**
	* Returns the last user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest findByrequestedBy_Last(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByrequestedBy_Last(requestedBy, orderByComparator);
	}

	/**
	* Returns the last user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByrequestedBy_Last(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestedBy_Last(requestedBy, orderByComparator);
	}

	/**
	* Returns the user group requests before and after the current user group request in the ordered set where requestedBy = &#63;.
	*
	* @param id the primary key of the current user group request
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest[] findByrequestedBy_PrevAndNext(
		long id, long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence()
				   .findByrequestedBy_PrevAndNext(id, requestedBy,
			orderByComparator);
	}

	/**
	* Removes all the user group requests where requestedBy = &#63; from the database.
	*
	* @param requestedBy the requested by
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByrequestedBy(long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByrequestedBy(requestedBy);
	}

	/**
	* Returns the number of user group requests where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @return the number of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByrequestedBy(long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByrequestedBy(requestedBy);
	}

	/**
	* Caches the user group request in the entity cache if it is enabled.
	*
	* @param userGroupRequest the user group request
	*/
	public static void cacheResult(
		com.nyu.model.UserGroupRequest userGroupRequest) {
		getPersistence().cacheResult(userGroupRequest);
	}

	/**
	* Caches the user group requests in the entity cache if it is enabled.
	*
	* @param userGroupRequests the user group requests
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.UserGroupRequest> userGroupRequests) {
		getPersistence().cacheResult(userGroupRequests);
	}

	/**
	* Creates a new user group request with the primary key. Does not add the user group request to the database.
	*
	* @param id the primary key for the new user group request
	* @return the new user group request
	*/
	public static com.nyu.model.UserGroupRequest create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user group request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user group request
	* @return the user group request that was removed
	* @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence().remove(id);
	}

	public static com.nyu.model.UserGroupRequest updateImpl(
		com.nyu.model.UserGroupRequest userGroupRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userGroupRequest);
	}

	/**
	* Returns the user group request with the primary key or throws a {@link com.nyu.NoSuchUserGroupRequestException} if it could not be found.
	*
	* @param id the primary key of the user group request
	* @return the user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user group request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user group request
	* @return the user group request, or <code>null</code> if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.UserGroupRequest fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user group requests.
	*
	* @return the user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user group requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @return the range of user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user group requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.UserGroupRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user group requests
	* @param end the upper bound of the range of user group requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.UserGroupRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user group requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user group requests.
	*
	* @return the number of user group requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserGroupRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserGroupRequestPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					UserGroupRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(UserGroupRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserGroupRequestPersistence persistence) {
	}

	private static UserGroupRequestPersistence _persistence;
}