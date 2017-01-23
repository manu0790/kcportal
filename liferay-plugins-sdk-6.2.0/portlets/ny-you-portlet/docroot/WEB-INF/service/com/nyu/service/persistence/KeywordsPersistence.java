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

import com.nyu.model.Keywords;

/**
 * The persistence interface for the keywords service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see KeywordsPersistenceImpl
 * @see KeywordsUtil
 * @generated
 */
public interface KeywordsPersistence extends BasePersistence<Keywords> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeywordsUtil} to access the keywords persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the keywords in the entity cache if it is enabled.
	*
	* @param keywords the keywords
	*/
	public void cacheResult(com.nyu.model.Keywords keywords);

	/**
	* Caches the keywordses in the entity cache if it is enabled.
	*
	* @param keywordses the keywordses
	*/
	public void cacheResult(java.util.List<com.nyu.model.Keywords> keywordses);

	/**
	* Creates a new keywords with the primary key. Does not add the keywords to the database.
	*
	* @param id the primary key for the new keywords
	* @return the new keywords
	*/
	public com.nyu.model.Keywords create(long id);

	/**
	* Removes the keywords with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the keywords
	* @return the keywords that was removed
	* @throws com.nyu.NoSuchKeywordsException if a keywords with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Keywords remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsException;

	public com.nyu.model.Keywords updateImpl(com.nyu.model.Keywords keywords)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the keywords with the primary key or throws a {@link com.nyu.NoSuchKeywordsException} if it could not be found.
	*
	* @param id the primary key of the keywords
	* @return the keywords
	* @throws com.nyu.NoSuchKeywordsException if a keywords with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Keywords findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchKeywordsException;

	/**
	* Returns the keywords with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the keywords
	* @return the keywords, or <code>null</code> if a keywords with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.Keywords fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the keywordses.
	*
	* @return the keywordses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Keywords> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the keywordses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of keywordses
	* @param end the upper bound of the range of keywordses (not inclusive)
	* @return the range of keywordses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Keywords> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the keywordses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of keywordses
	* @param end the upper bound of the range of keywordses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of keywordses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.Keywords> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the keywordses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of keywordses.
	*
	* @return the number of keywordses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}