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

import com.nyu.model.FavouriteLessons;

import java.util.List;

/**
 * The persistence utility for the favourite lessons service. This utility wraps {@link FavouriteLessonsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessonsPersistence
 * @see FavouriteLessonsPersistenceImpl
 * @generated
 */
public class FavouriteLessonsUtil {
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
	public static void clearCache(FavouriteLessons favouriteLessons) {
		getPersistence().clearCache(favouriteLessons);
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
	public static List<FavouriteLessons> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FavouriteLessons> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FavouriteLessons> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FavouriteLessons update(FavouriteLessons favouriteLessons)
		throws SystemException {
		return getPersistence().update(favouriteLessons);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FavouriteLessons update(FavouriteLessons favouriteLessons,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(favouriteLessons, serviceContext);
	}

	/**
	* Returns all the favourite lessonses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.FavouriteLessons> findByfavouriteLessonsByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfavouriteLessonsByUserId(userId);
	}

	/**
	* Returns a range of all the favourite lessonses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favourite lessonses
	* @param end the upper bound of the range of favourite lessonses (not inclusive)
	* @return the range of matching favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.FavouriteLessons> findByfavouriteLessonsByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfavouriteLessonsByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the favourite lessonses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favourite lessonses
	* @param end the upper bound of the range of favourite lessonses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.FavouriteLessons> findByfavouriteLessonsByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfavouriteLessonsByUserId(userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons findByfavouriteLessonsByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException {
		return getPersistence()
				   .findByfavouriteLessonsByUserId_First(userId,
			orderByComparator);
	}

	/**
	* Returns the first favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite lessons, or <code>null</code> if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons fetchByfavouriteLessonsByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfavouriteLessonsByUserId_First(userId,
			orderByComparator);
	}

	/**
	* Returns the last favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons findByfavouriteLessonsByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException {
		return getPersistence()
				   .findByfavouriteLessonsByUserId_Last(userId,
			orderByComparator);
	}

	/**
	* Returns the last favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite lessons, or <code>null</code> if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons fetchByfavouriteLessonsByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfavouriteLessonsByUserId_Last(userId,
			orderByComparator);
	}

	/**
	* Returns the favourite lessonses before and after the current favourite lessons in the ordered set where userId = &#63;.
	*
	* @param favouriteLessonsPK the primary key of the current favourite lessons
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons[] findByfavouriteLessonsByUserId_PrevAndNext(
		FavouriteLessonsPK favouriteLessonsPK, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException {
		return getPersistence()
				   .findByfavouriteLessonsByUserId_PrevAndNext(favouriteLessonsPK,
			userId, orderByComparator);
	}

	/**
	* Removes all the favourite lessonses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfavouriteLessonsByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfavouriteLessonsByUserId(userId);
	}

	/**
	* Returns the number of favourite lessonses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfavouriteLessonsByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfavouriteLessonsByUserId(userId);
	}

	/**
	* Caches the favourite lessons in the entity cache if it is enabled.
	*
	* @param favouriteLessons the favourite lessons
	*/
	public static void cacheResult(
		com.nyu.model.FavouriteLessons favouriteLessons) {
		getPersistence().cacheResult(favouriteLessons);
	}

	/**
	* Caches the favourite lessonses in the entity cache if it is enabled.
	*
	* @param favouriteLessonses the favourite lessonses
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.FavouriteLessons> favouriteLessonses) {
		getPersistence().cacheResult(favouriteLessonses);
	}

	/**
	* Creates a new favourite lessons with the primary key. Does not add the favourite lessons to the database.
	*
	* @param favouriteLessonsPK the primary key for the new favourite lessons
	* @return the new favourite lessons
	*/
	public static com.nyu.model.FavouriteLessons create(
		FavouriteLessonsPK favouriteLessonsPK) {
		return getPersistence().create(favouriteLessonsPK);
	}

	/**
	* Removes the favourite lessons with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons that was removed
	* @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons remove(
		FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException {
		return getPersistence().remove(favouriteLessonsPK);
	}

	public static com.nyu.model.FavouriteLessons updateImpl(
		com.nyu.model.FavouriteLessons favouriteLessons)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(favouriteLessons);
	}

	/**
	* Returns the favourite lessons with the primary key or throws a {@link com.nyu.NoSuchFavouriteLessonsException} if it could not be found.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons findByPrimaryKey(
		FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException {
		return getPersistence().findByPrimaryKey(favouriteLessonsPK);
	}

	/**
	* Returns the favourite lessons with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons, or <code>null</code> if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.FavouriteLessons fetchByPrimaryKey(
		FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(favouriteLessonsPK);
	}

	/**
	* Returns all the favourite lessonses.
	*
	* @return the favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.FavouriteLessons> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the favourite lessonses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourite lessonses
	* @param end the upper bound of the range of favourite lessonses (not inclusive)
	* @return the range of favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.FavouriteLessons> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the favourite lessonses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.FavouriteLessonsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourite lessonses
	* @param end the upper bound of the range of favourite lessonses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.FavouriteLessons> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the favourite lessonses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of favourite lessonses.
	*
	* @return the number of favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FavouriteLessonsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FavouriteLessonsPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					FavouriteLessonsPersistence.class.getName());

			ReferenceRegistry.registerReference(FavouriteLessonsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FavouriteLessonsPersistence persistence) {
	}

	private static FavouriteLessonsPersistence _persistence;
}