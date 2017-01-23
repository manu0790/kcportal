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

import com.nyu.model.NYUUserGroup;

import java.util.List;

/**
 * The persistence utility for the n y u user group service. This utility wraps {@link NYUUserGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroupPersistence
 * @see NYUUserGroupPersistenceImpl
 * @generated
 */
public class NYUUserGroupUtil {
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
	public static void clearCache(NYUUserGroup nyuUserGroup) {
		getPersistence().clearCache(nyuUserGroup);
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
	public static List<NYUUserGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NYUUserGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NYUUserGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NYUUserGroup update(NYUUserGroup nyuUserGroup)
		throws SystemException {
		return getPersistence().update(nyuUserGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NYUUserGroup update(NYUUserGroup nyuUserGroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nyuUserGroup, serviceContext);
	}

	/**
	* Returns all the n y u user groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup[] findByUuid_PrevAndNext(
		long userGroupId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByUuid_PrevAndNext(userGroupId, uuid, orderByComparator);
	}

	/**
	* Removes all the n y u user groups where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of n y u user groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the n y u user group where uuid = &#63; and groupId = &#63; or throws a {@link com.nyu.NoSuchNYUUserGroupException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the n y u user group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the n y u user group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the n y u user group where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the n y u user group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of n y u user groups where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the n y u user groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup[] findByUuid_C_PrevAndNext(
		long userGroupId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(userGroupId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the n y u user groups where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of n y u user groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the n y u user groups where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findBygroupPrivacy(
		java.lang.String groupPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupPrivacy(groupPrivacy);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findBygroupPrivacy(
		java.lang.String groupPrivacy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupPrivacy(groupPrivacy, start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findBygroupPrivacy(
		java.lang.String groupPrivacy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupPrivacy(groupPrivacy, start, end,
			orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findBygroupPrivacy_First(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findBygroupPrivacy_First(groupPrivacy, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchBygroupPrivacy_First(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygroupPrivacy_First(groupPrivacy, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findBygroupPrivacy_Last(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findBygroupPrivacy_Last(groupPrivacy, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchBygroupPrivacy_Last(
		java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygroupPrivacy_Last(groupPrivacy, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup[] findBygroupPrivacy_PrevAndNext(
		long userGroupId, java.lang.String groupPrivacy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findBygroupPrivacy_PrevAndNext(userGroupId, groupPrivacy,
			orderByComparator);
	}

	/**
	* Removes all the n y u user groups where groupPrivacy = &#63; from the database.
	*
	* @param groupPrivacy the group privacy
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygroupPrivacy(java.lang.String groupPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygroupPrivacy(groupPrivacy);
	}

	/**
	* Returns the number of n y u user groups where groupPrivacy = &#63;.
	*
	* @param groupPrivacy the group privacy
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygroupPrivacy(java.lang.String groupPrivacy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygroupPrivacy(groupPrivacy);
	}

	/**
	* Returns all the n y u user groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup[] findByGroupId_PrevAndNext(
		long userGroupId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(userGroupId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the n y u user groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of n y u user groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the n y u user groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup[] findByCompanyId_PrevAndNext(
		long userGroupId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(userGroupId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the n y u user groups where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of n y u user groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the n y u user groups where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findByG_S(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByG_S(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup findByG_S_First(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByG_S_First(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup findByG_S_Last(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last n y u user group in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n y u user group, or <code>null</code> if a matching n y u user group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByG_S_Last(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

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
	public static com.nyu.model.NYUUserGroup[] findByG_S_PrevAndNext(
		long userGroupId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence()
				   .findByG_S_PrevAndNext(userGroupId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the n y u user groups where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of n y u user groups where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Caches the n y u user group in the entity cache if it is enabled.
	*
	* @param nyuUserGroup the n y u user group
	*/
	public static void cacheResult(com.nyu.model.NYUUserGroup nyuUserGroup) {
		getPersistence().cacheResult(nyuUserGroup);
	}

	/**
	* Caches the n y u user groups in the entity cache if it is enabled.
	*
	* @param nyuUserGroups the n y u user groups
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.NYUUserGroup> nyuUserGroups) {
		getPersistence().cacheResult(nyuUserGroups);
	}

	/**
	* Creates a new n y u user group with the primary key. Does not add the n y u user group to the database.
	*
	* @param userGroupId the primary key for the new n y u user group
	* @return the new n y u user group
	*/
	public static com.nyu.model.NYUUserGroup create(long userGroupId) {
		return getPersistence().create(userGroupId);
	}

	/**
	* Removes the n y u user group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group that was removed
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup remove(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().remove(userGroupId);
	}

	public static com.nyu.model.NYUUserGroup updateImpl(
		com.nyu.model.NYUUserGroup nyuUserGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nyuUserGroup);
	}

	/**
	* Returns the n y u user group with the primary key or throws a {@link com.nyu.NoSuchNYUUserGroupException} if it could not be found.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group
	* @throws com.nyu.NoSuchNYUUserGroupException if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup findByPrimaryKey(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchNYUUserGroupException {
		return getPersistence().findByPrimaryKey(userGroupId);
	}

	/**
	* Returns the n y u user group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userGroupId the primary key of the n y u user group
	* @return the n y u user group, or <code>null</code> if a n y u user group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.NYUUserGroup fetchByPrimaryKey(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userGroupId);
	}

	/**
	* Returns all the n y u user groups.
	*
	* @return the n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.NYUUserGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nyu.model.NYUUserGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the n y u user groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of n y u user groups.
	*
	* @return the number of n y u user groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NYUUserGroupPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NYUUserGroupPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					NYUUserGroupPersistence.class.getName());

			ReferenceRegistry.registerReference(NYUUserGroupUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NYUUserGroupPersistence persistence) {
	}

	private static NYUUserGroupPersistence _persistence;
}