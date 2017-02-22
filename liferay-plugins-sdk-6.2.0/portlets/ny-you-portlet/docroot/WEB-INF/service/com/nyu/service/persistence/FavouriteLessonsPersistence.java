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

import com.nyu.model.FavouriteLessons;

/**
 * The persistence interface for the favourite lessons service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see FavouriteLessonsPersistenceImpl
 * @see FavouriteLessonsUtil
 * @generated
 */
public interface FavouriteLessonsPersistence extends BasePersistence<FavouriteLessons> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FavouriteLessonsUtil} to access the favourite lessons persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the favourite lessonses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.FavouriteLessons> findByfavouriteLessonsByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.FavouriteLessons> findByfavouriteLessonsByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.FavouriteLessons> findByfavouriteLessonsByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons findByfavouriteLessonsByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException;

	/**
	* Returns the first favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite lessons, or <code>null</code> if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons fetchByfavouriteLessonsByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons findByfavouriteLessonsByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException;

	/**
	* Returns the last favourite lessons in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite lessons, or <code>null</code> if a matching favourite lessons could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons fetchByfavouriteLessonsByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.nyu.model.FavouriteLessons[] findByfavouriteLessonsByUserId_PrevAndNext(
		FavouriteLessonsPK favouriteLessonsPK, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException;

	/**
	* Removes all the favourite lessonses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfavouriteLessonsByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of favourite lessonses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public int countByfavouriteLessonsByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the favourite lessons in the entity cache if it is enabled.
	*
	* @param favouriteLessons the favourite lessons
	*/
	public void cacheResult(com.nyu.model.FavouriteLessons favouriteLessons);

	/**
	* Caches the favourite lessonses in the entity cache if it is enabled.
	*
	* @param favouriteLessonses the favourite lessonses
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.FavouriteLessons> favouriteLessonses);

	/**
	* Creates a new favourite lessons with the primary key. Does not add the favourite lessons to the database.
	*
	* @param favouriteLessonsPK the primary key for the new favourite lessons
	* @return the new favourite lessons
	*/
	public com.nyu.model.FavouriteLessons create(
		FavouriteLessonsPK favouriteLessonsPK);

	/**
	* Removes the favourite lessons with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons that was removed
	* @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons remove(
		FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException;

	public com.nyu.model.FavouriteLessons updateImpl(
		com.nyu.model.FavouriteLessons favouriteLessons)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the favourite lessons with the primary key or throws a {@link com.nyu.NoSuchFavouriteLessonsException} if it could not be found.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons
	* @throws com.nyu.NoSuchFavouriteLessonsException if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons findByPrimaryKey(
		FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchFavouriteLessonsException;

	/**
	* Returns the favourite lessons with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favouriteLessonsPK the primary key of the favourite lessons
	* @return the favourite lessons, or <code>null</code> if a favourite lessons with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.FavouriteLessons fetchByPrimaryKey(
		FavouriteLessonsPK favouriteLessonsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the favourite lessonses.
	*
	* @return the favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.FavouriteLessons> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.FavouriteLessons> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.nyu.model.FavouriteLessons> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the favourite lessonses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of favourite lessonses.
	*
	* @return the number of favourite lessonses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}