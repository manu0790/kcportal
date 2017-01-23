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

import com.nyu.model.Basno;

/**
 * The persistence interface for the basno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see BasnoPersistenceImpl
 * @see BasnoUtil
 * @generated
 */
public interface BasnoPersistence extends BasePersistence<Basno> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BasnoUtil} to access the basno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the basno in the entity cache if it is enabled.
	*
	* @param basno the basno
	*/
	public void cacheResult(com.nyu.model.Basno basno);

	/**
	* Caches the basnos in the entity cache if it is enabled.
	*
	* @param basnos the basnos
	*/
	public void cacheResult(java.util.List<com.nyu.model.Basno> basnos);

	/**
	* Creates a new basno with the primary key. Does not add the basno to the database.
	*
	* @param badgeId the primary key for the new basno
	* @return the new basno
	*/
	public com.nyu.model.Basno create(long badgeId);

	/**
	* Removes the basno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param badgeId the primary key of the basno
	* @return the basno that was removed
	* @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Basno remove(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchBasnoException;

	public com.nyu.model.Basno updateImpl(com.nyu.model.Basno basno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the basno with the primary key or throws a {@link com.nyu.NoSuchBasnoException} if it could not be found.
	*
	* @param badgeId the primary key of the basno
	* @return the basno
	* @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Basno findByPrimaryKey(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchBasnoException;

	/**
	* Returns the basno with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param badgeId the primary key of the basno
	* @return the basno, or <code>null</code> if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Basno fetchByPrimaryKey(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the basnos.
	*
	* @return the basnos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Basno> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the basnos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basnos
	* @param end the upper bound of the range of basnos (not inclusive)
	* @return the range of basnos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Basno> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the basnos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of basnos
	* @param end the upper bound of the range of basnos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of basnos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Basno> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the basnos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of basnos.
	*
	* @return the number of basnos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}