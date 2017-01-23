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

import com.nyu.model.KeywordsCollaboration;

import java.util.List;

/**
 * The persistence utility for the keywords collaboration service. This utility wraps {@link KeywordsCollaborationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see KeywordsCollaborationPersistence
 * @see KeywordsCollaborationPersistenceImpl
 * @generated
 */
public class KeywordsCollaborationUtil {
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
	public static void clearCache(KeywordsCollaboration keywordsCollaboration) {
		getPersistence().clearCache(keywordsCollaboration);
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
	public static List<KeywordsCollaboration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KeywordsCollaboration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KeywordsCollaboration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KeywordsCollaboration update(
		KeywordsCollaboration keywordsCollaboration) throws SystemException {
		return getPersistence().update(keywordsCollaboration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KeywordsCollaboration update(
		KeywordsCollaboration keywordsCollaboration,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(keywordsCollaboration, serviceContext);
	}

	/**
	* Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or throws a {@link com.nyu.NoSuchKeywordsCollaborationException} if it could not be found.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findByrequestStatus(
		long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence().findByrequestStatus(keywordId, userId);
	}

	/**
	* Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchByrequestStatus(
		long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByrequestStatus(keywordId, userId);
	}

	/**
	* Returns the keywords collaboration where keywordId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchByrequestStatus(
		long keywordId, long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestStatus(keywordId, userId, retrieveFromCache);
	}

	/**
	* Removes the keywords collaboration where keywordId = &#63; and userId = &#63; from the database.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the keywords collaboration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration removeByrequestStatus(
		long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence().removeByrequestStatus(keywordId, userId);
	}

	/**
	* Returns the number of keywords collaborations where keywordId = &#63; and userId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param userId the user ID
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByrequestStatus(long keywordId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByrequestStatus(keywordId, userId);
	}

	/**
	* Returns all the keywords collaborations where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @return the matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordExistence(
		long keywordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBykeywordExistence(keywordId);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordExistence(
		long keywordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBykeywordExistence(keywordId, start, end);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordExistence(
		long keywordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBykeywordExistence(keywordId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findBykeywordExistence_First(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBykeywordExistence_First(keywordId, orderByComparator);
	}

	/**
	* Returns the first keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchBykeywordExistence_First(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBykeywordExistence_First(keywordId, orderByComparator);
	}

	/**
	* Returns the last keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findBykeywordExistence_Last(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBykeywordExistence_Last(keywordId, orderByComparator);
	}

	/**
	* Returns the last keywords collaboration in the ordered set where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchBykeywordExistence_Last(
		long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBykeywordExistence_Last(keywordId, orderByComparator);
	}

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
	public static com.nyu.model.KeywordsCollaboration[] findBykeywordExistence_PrevAndNext(
		long id, long keywordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBykeywordExistence_PrevAndNext(id, keywordId,
			orderByComparator);
	}

	/**
	* Removes all the keywords collaborations where keywordId = &#63; from the database.
	*
	* @param keywordId the keyword ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBykeywordExistence(long keywordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBykeywordExistence(keywordId);
	}

	/**
	* Returns the number of keywords collaborations where keywordId = &#63;.
	*
	* @param keywordId the keyword ID
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static int countBykeywordExistence(long keywordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBykeywordExistence(keywordId);
	}

	/**
	* Returns all the keywords collaborations where status = &#63;.
	*
	* @param status the status
	* @return the matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordCollaListbyStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBykeywordCollaListbyStatus(status);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordCollaListbyStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBykeywordCollaListbyStatus(status, start, end);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBykeywordCollaListbyStatus(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBykeywordCollaListbyStatus(status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findBykeywordCollaListbyStatus_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBykeywordCollaListbyStatus_First(status,
			orderByComparator);
	}

	/**
	* Returns the first keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchBykeywordCollaListbyStatus_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBykeywordCollaListbyStatus_First(status,
			orderByComparator);
	}

	/**
	* Returns the last keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findBykeywordCollaListbyStatus_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBykeywordCollaListbyStatus_Last(status,
			orderByComparator);
	}

	/**
	* Returns the last keywords collaboration in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchBykeywordCollaListbyStatus_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBykeywordCollaListbyStatus_Last(status,
			orderByComparator);
	}

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
	public static com.nyu.model.KeywordsCollaboration[] findBykeywordCollaListbyStatus_PrevAndNext(
		long id, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBykeywordCollaListbyStatus_PrevAndNext(id, status,
			orderByComparator);
	}

	/**
	* Removes all the keywords collaborations where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBykeywordCollaListbyStatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBykeywordCollaListbyStatus(status);
	}

	/**
	* Returns the number of keywords collaborations where status = &#63;.
	*
	* @param status the status
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static int countBykeywordCollaListbyStatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBykeywordCollaListbyStatus(status);
	}

	/**
	* Returns all the keywords collaborations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygetRequestStatusByUserId(userId);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygetRequestStatusByUserId(userId, start, end);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findBygetRequestStatusByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygetRequestStatusByUserId(userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findBygetRequestStatusByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBygetRequestStatusByUserId_First(userId,
			orderByComparator);
	}

	/**
	* Returns the first keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchBygetRequestStatusByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygetRequestStatusByUserId_First(userId,
			orderByComparator);
	}

	/**
	* Returns the last keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findBygetRequestStatusByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBygetRequestStatusByUserId_Last(userId,
			orderByComparator);
	}

	/**
	* Returns the last keywords collaboration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching keywords collaboration, or <code>null</code> if a matching keywords collaboration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchBygetRequestStatusByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygetRequestStatusByUserId_Last(userId,
			orderByComparator);
	}

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
	public static com.nyu.model.KeywordsCollaboration[] findBygetRequestStatusByUserId_PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence()
				   .findBygetRequestStatusByUserId_PrevAndNext(id, userId,
			orderByComparator);
	}

	/**
	* Removes all the keywords collaborations where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygetRequestStatusByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygetRequestStatusByUserId(userId);
	}

	/**
	* Returns the number of keywords collaborations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygetRequestStatusByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygetRequestStatusByUserId(userId);
	}

	/**
	* Caches the keywords collaboration in the entity cache if it is enabled.
	*
	* @param keywordsCollaboration the keywords collaboration
	*/
	public static void cacheResult(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration) {
		getPersistence().cacheResult(keywordsCollaboration);
	}

	/**
	* Caches the keywords collaborations in the entity cache if it is enabled.
	*
	* @param keywordsCollaborations the keywords collaborations
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.KeywordsCollaboration> keywordsCollaborations) {
		getPersistence().cacheResult(keywordsCollaborations);
	}

	/**
	* Creates a new keywords collaboration with the primary key. Does not add the keywords collaboration to the database.
	*
	* @param id the primary key for the new keywords collaboration
	* @return the new keywords collaboration
	*/
	public static com.nyu.model.KeywordsCollaboration create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the keywords collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration that was removed
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence().remove(id);
	}

	public static com.nyu.model.KeywordsCollaboration updateImpl(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(keywordsCollaboration);
	}

	/**
	* Returns the keywords collaboration with the primary key or throws a {@link com.nyu.NoSuchKeywordsCollaborationException} if it could not be found.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration
	* @throws com.nyu.NoSuchKeywordsCollaborationException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsCollaborationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the keywords collaboration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration, or <code>null</code> if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.KeywordsCollaboration fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the keywords collaborations.
	*
	* @return the keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nyu.model.KeywordsCollaboration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the keywords collaborations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of keywords collaborations.
	*
	* @return the number of keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KeywordsCollaborationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KeywordsCollaborationPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					KeywordsCollaborationPersistence.class.getName());

			ReferenceRegistry.registerReference(KeywordsCollaborationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KeywordsCollaborationPersistence persistence) {
	}

	private static KeywordsCollaborationPersistence _persistence;
}