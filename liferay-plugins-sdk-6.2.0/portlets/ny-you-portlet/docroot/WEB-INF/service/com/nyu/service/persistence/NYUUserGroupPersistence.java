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

import com.nyu.model.NYUUserGroup;

/**
 * The persistence interface for the n y u user group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroupPersistenceImpl
 * @see NYUUserGroupUtil
 * @generated
 */
public interface NYUUserGroupPersistence extends BasePersistence<NYUUserGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NYUUserGroupUtil} to access the n y u user group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the n y u user groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user groups before and after the current n y u user group in the ordered set where uuid = &#63;.
	*
	* @param userGroupId the primary key of the current n y u user group
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup[] findByUuid_PrevAndNext(
		long userGroupId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Removes all the n y u user groups where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user group where uuid = &#63; and groupId = &#63; or throws a {@link com.nyu.NoSuchNYUUserGroupException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the n y u user group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the n y u user group where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the n y u user group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the number of n y u user groups where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the n y u user groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user groups before and after the current n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param userGroupId the primary key of the current n y u user group
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup[] findByUuid_C_PrevAndNext(
		long userGroupId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Removes all the n y u user groups where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the n y u user groups where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findBygroupPrivacy(
		java.lang.String groupPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups where groupPrivacy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupPrivacy the group privacy
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findBygroupPrivacy(
		java.lang.String groupPrivacy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups where groupPrivacy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupPrivacy the group privacy
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findBygroupPrivacy(
		java.lang.String groupPrivacy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findBygroupPrivacy_First(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the first n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchBygroupPrivacy_First(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findBygroupPrivacy_Last(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the last n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchBygroupPrivacy_Last(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user groups before and after the current n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param userGroupId the primary key of the current n y u user group
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup[] findBygroupPrivacy_PrevAndNext(
		long userGroupId, java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Removes all the n y u user groups where groupPrivacy = &#63; from the database.
	*
	* @param groupPrivacy the group privacy
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygroupPrivacy(java.lang.String groupPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countBygroupPrivacy(java.lang.String groupPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the n y u user groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user groups before and after the current n y u user group in the ordered set where groupId = &#63;.
	*
	* @param userGroupId the primary key of the current n y u user group
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup[] findByGroupId_PrevAndNext(
		long userGroupId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Removes all the n y u user groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the n y u user groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the first n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the last n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user groups before and after the current n y u user group in the ordered set where companyId = &#63;.
	*
	* @param userGroupId the primary key of the current n y u user group
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup[] findByCompanyId_PrevAndNext(
		long userGroupId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Removes all the n y u user groups where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the n y u user groups where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByG_S(long groupId,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByG_S(long groupId,
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findByG_S(long groupId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByG_S_First(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user groups before and after the current n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param userGroupId the primary key of the current n y u user group
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup[] findByG_S_PrevAndNext(
		long userGroupId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Removes all the n y u user groups where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the n y u user group in the entity cache if it is enabled.
	*
	* @param nyuUserGroup the n y u user group
	*/
	public void cacheResult(com.nyu.model.NYUUserGroup nyuUserGroup);

	/**
	* Caches the n y u user groups in the entity cache if it is enabled.
	*
	* @param nyuUserGroups the n y u user groups
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.NYUUserGroup> nyuUserGroups);

	/**
	* Creates a new n y u user group with the primary key. Does not add the n y u user group to the database.
	*
	* @param userGroupId the primary key for the new n y u user group
	* @return the new n y u user group
	*/
	public com.nyu.model.NYUUserGroup create(long userGroupId);

	/**
	* Removes the n y u user group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group that was removed
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup remove(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	public com.nyu.model.NYUUserGroup updateImpl(
		com.nyu.model.NYUUserGroup nyuUserGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the n y u user group with the primary key or throws a {@link com.nyu.NoSuchNYUUserGroupException} if it could not be found.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup findByPrimaryKey(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException;

	/**
	* Returns the n y u user group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group, or <code>null</code> if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.NYUUserGroup fetchByPrimaryKey(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the n y u user groups.
	*
	* @return the n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the n y u user groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @return the range of n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the n y u user groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.NYUUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of n y u user groups
	* @param end the upper bound of the range of n y u user groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.NYUUserGroup> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the n y u user groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of n y u user groups.
	*
	* @return the number of n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}