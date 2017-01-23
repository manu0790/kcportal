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

import com.nyu.model.Slides;

/**
 * The persistence interface for the slides service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see SlidesPersistenceImpl
 * @see SlidesUtil
 * @generated
 */
public interface SlidesPersistence extends BasePersistence<Slides> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SlidesUtil} to access the slides persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the slides where id = &#63; or throws a {@link com.nyu.NoSuchSlidesException} if it could not be found.
	*
	* @param id the ID
	* @return the matching slides
	* @throws com.nyu.NoSuchSlidesException if a matching slides could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides findBygetSlide(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchSlidesException;

	/**
	* Returns the slides where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching slides, or <code>null</code> if a matching slides could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides fetchBygetSlide(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the slides where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching slides, or <code>null</code> if a matching slides could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides fetchBygetSlide(long id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the slides where id = &#63; from the database.
	*
	* @param id the ID
	* @return the slides that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides removeBygetSlide(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchSlidesException;

	/**
	* Returns the number of slideses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching slideses
	* @throws SystemException if a system exception occurred
	*/
	public int countBygetSlide(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the slides in the entity cache if it is enabled.
	*
	* @param slides the slides
	*/
	public void cacheResult(com.nyu.model.Slides slides);

	/**
	* Caches the slideses in the entity cache if it is enabled.
	*
	* @param slideses the slideses
	*/
	public void cacheResult(java.util.List<com.nyu.model.Slides> slideses);

	/**
	* Creates a new slides with the primary key. Does not add the slides to the database.
	*
	* @param id the primary key for the new slides
	* @return the new slides
	*/
	public com.nyu.model.Slides create(long id);

	/**
	* Removes the slides with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the slides
	* @return the slides that was removed
	* @throws com.nyu.NoSuchSlidesException if a slides with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchSlidesException;

	public com.nyu.model.Slides updateImpl(com.nyu.model.Slides slides)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the slides with the primary key or throws a {@link com.nyu.NoSuchSlidesException} if it could not be found.
	*
	* @param id the primary key of the slides
	* @return the slides
	* @throws com.nyu.NoSuchSlidesException if a slides with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchSlidesException;

	/**
	* Returns the slides with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the slides
	* @return the slides, or <code>null</code> if a slides with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Slides fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the slideses.
	*
	* @return the slideses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Slides> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the slideses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of slideses
	* @param end the upper bound of the range of slideses (not inclusive)
	* @return the range of slideses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Slides> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the slideses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of slideses
	* @param end the upper bound of the range of slideses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of slideses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Slides> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the slideses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of slideses.
	*
	* @return the number of slideses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}