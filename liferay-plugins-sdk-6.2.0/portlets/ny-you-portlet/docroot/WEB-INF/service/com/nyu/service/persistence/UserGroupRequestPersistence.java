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

import com.nyu.model.UserGroupRequest;

/**
 * The persistence interface for the user group request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see UserGroupRequestPersistenceImpl
 * @see UserGroupRequestUtil
 * @generated
 */
public interface UserGroupRequestPersistence extends BasePersistence<UserGroupRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserGroupRequestUtil} to access the user group request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or throws a {@link com.nyu.NoSuchUserGroupRequestException} if it could not be found.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest findByfindRequestStatusByUser(
		long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByfindRequestStatusByUser(
		long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user group request where userGroupId = &#63; and requestedBy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByfindRequestStatusByUser(
		long userGroupId, long requestedBy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the user group request where userGroupId = &#63; and requestedBy = &#63; from the database.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the user group request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest removeByfindRequestStatusByUser(
		long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the number of user group requests where userGroupId = &#63; and requestedBy = &#63;.
	*
	* @param userGroupId the user group ID
	* @param requestedBy the requested by
	* @return the number of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByfindRequestStatusByUser(long userGroupId, long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user group requests where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @return the matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserGroupRequest> findByfindGroupRequestByStatus(
		long userGroupId, java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.UserGroupRequest findByfindGroupRequestByStatus_First(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the first user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByfindGroupRequestByStatus_First(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.UserGroupRequest findByfindGroupRequestByStatus_Last(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the last user group request in the ordered set where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByfindGroupRequestByStatus_Last(
		long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.UserGroupRequest[] findByfindGroupRequestByStatus_PrevAndNext(
		long id, long userGroupId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Removes all the user group requests where userGroupId = &#63; and status = &#63; from the database.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfindGroupRequestByStatus(long userGroupId,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user group requests where userGroupId = &#63; and status = &#63;.
	*
	* @param userGroupId the user group ID
	* @param status the status
	* @return the number of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByfindGroupRequestByStatus(long userGroupId,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user group requests where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @return the matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.UserGroupRequest> findByrequestedBy(
		long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserGroupRequest> findByrequestedBy(
		long requestedBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserGroupRequest> findByrequestedBy(
		long requestedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest findByrequestedBy_First(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the first user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByrequestedBy_First(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest findByrequestedBy_Last(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the last user group request in the ordered set where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user group request, or <code>null</code> if a matching user group request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByrequestedBy_Last(
		long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.UserGroupRequest[] findByrequestedBy_PrevAndNext(
		long id, long requestedBy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Removes all the user group requests where requestedBy = &#63; from the database.
	*
	* @param requestedBy the requested by
	* @throws SystemException if a system exception occurred
	*/
	public void removeByrequestedBy(long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user group requests where requestedBy = &#63;.
	*
	* @param requestedBy the requested by
	* @return the number of matching user group requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByrequestedBy(long requestedBy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user group request in the entity cache if it is enabled.
	*
	* @param userGroupRequest the user group request
	*/
	public void cacheResult(com.nyu.model.UserGroupRequest userGroupRequest);

	/**
	* Caches the user group requests in the entity cache if it is enabled.
	*
	* @param userGroupRequests the user group requests
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.UserGroupRequest> userGroupRequests);

	/**
	* Creates a new user group request with the primary key. Does not add the user group request to the database.
	*
	* @param id the primary key for the new user group request
	* @return the new user group request
	*/
	public com.nyu.model.UserGroupRequest create(long id);

	/**
	* Removes the user group request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user group request
	* @return the user group request that was removed
	* @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	public com.nyu.model.UserGroupRequest updateImpl(
		com.nyu.model.UserGroupRequest userGroupRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user group request with the primary key or throws a {@link com.nyu.NoSuchUserGroupRequestException} if it could not be found.
	*
	* @param id the primary key of the user group request
	* @return the user group request
	* @throws com.nyu.NoSuchUserGroupRequestException if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchUserGroupRequestException;

	/**
	* Returns the user group request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user group request
	* @return the user group request, or <code>null</code> if a user group request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.UserGroupRequest fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user group requests.
	*
	* @return the user group requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.UserGroupRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserGroupRequest> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.UserGroupRequest> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user group requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user group requests.
	*
	* @return the number of user group requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}