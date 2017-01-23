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

import com.nyu.model.Basno;

import java.util.List;

/**
 * The persistence utility for the basno service. This utility wraps {@link BasnoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see BasnoPersistence
 * @see BasnoPersistenceImpl
 * @generated
 */
public class BasnoUtil {
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
	public static void clearCache(Basno basno) {
		getPersistence().clearCache(basno);
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
	public static List<Basno> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Basno> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Basno> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Basno update(Basno basno) throws SystemException {
		return getPersistence().update(basno);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Basno update(Basno basno, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(basno, serviceContext);
	}

	/**
	* Caches the basno in the entity cache if it is enabled.
	*
	* @param basno the basno
	*/
	public static void cacheResult(com.nyu.model.Basno basno) {
		getPersistence().cacheResult(basno);
	}

	/**
	* Caches the basnos in the entity cache if it is enabled.
	*
	* @param basnos the basnos
	*/
	public static void cacheResult(java.util.List<com.nyu.model.Basno> basnos) {
		getPersistence().cacheResult(basnos);
	}

	/**
	* Creates a new basno with the primary key. Does not add the basno to the database.
	*
	* @param badgeId the primary key for the new basno
	* @return the new basno
	*/
	public static com.nyu.model.Basno create(long badgeId) {
		return getPersistence().create(badgeId);
	}

	/**
	* Removes the basno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param badgeId the primary key of the basno
	* @return the basno that was removed
	* @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Basno remove(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchBasnoException {
		return getPersistence().remove(badgeId);
	}

	public static com.nyu.model.Basno updateImpl(com.nyu.model.Basno basno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(basno);
	}

	/**
	* Returns the basno with the primary key or throws a {@link com.nyu.NoSuchBasnoException} if it could not be found.
	*
	* @param badgeId the primary key of the basno
	* @return the basno
	* @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Basno findByPrimaryKey(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchBasnoException {
		return getPersistence().findByPrimaryKey(badgeId);
	}

	/**
	* Returns the basno with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param badgeId the primary key of the basno
	* @return the basno, or <code>null</code> if a basno with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Basno fetchByPrimaryKey(long badgeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(badgeId);
	}

	/**
	* Returns all the basnos.
	*
	* @return the basnos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.Basno> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nyu.model.Basno> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nyu.model.Basno> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the basnos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of basnos.
	*
	* @return the number of basnos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BasnoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BasnoPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					BasnoPersistence.class.getName());

			ReferenceRegistry.registerReference(BasnoUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BasnoPersistence persistence) {
	}

	private static BasnoPersistence _persistence;
}