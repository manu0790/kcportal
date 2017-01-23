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

import com.nyu.model.DocumentSection;

/**
 * The persistence interface for the document section service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentSectionPersistenceImpl
 * @see DocumentSectionUtil
 * @generated
 */
public interface DocumentSectionPersistence extends BasePersistence<DocumentSection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentSectionUtil} to access the document section persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the document sections where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching document sections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentSection> findBydocumentSectionList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document sections where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document sections
	* @param end the upper bound of the range of document sections (not inclusive)
	* @return the range of matching document sections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentSection> findBydocumentSectionList(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document sections where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document sections
	* @param end the upper bound of the range of document sections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document sections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentSection> findBydocumentSectionList(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document section
	* @throws com.nyu.NoSuchDocumentSectionException if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection findBydocumentSectionList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException;

	/**
	* Returns the first document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document section, or <code>null</code> if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection fetchBydocumentSectionList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document section
	* @throws com.nyu.NoSuchDocumentSectionException if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection findBydocumentSectionList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException;

	/**
	* Returns the last document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document section, or <code>null</code> if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection fetchBydocumentSectionList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document sections before and after the current document section in the ordered set where lessonId = &#63;.
	*
	* @param id the primary key of the current document section
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document section
	* @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection[] findBydocumentSectionList_PrevAndNext(
		long id, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException;

	/**
	* Removes all the document sections where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentSectionList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document sections where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching document sections
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentSectionList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the document section in the entity cache if it is enabled.
	*
	* @param documentSection the document section
	*/
	public void cacheResult(com.nyu.model.DocumentSection documentSection);

	/**
	* Caches the document sections in the entity cache if it is enabled.
	*
	* @param documentSections the document sections
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.DocumentSection> documentSections);

	/**
	* Creates a new document section with the primary key. Does not add the document section to the database.
	*
	* @param id the primary key for the new document section
	* @return the new document section
	*/
	public com.nyu.model.DocumentSection create(long id);

	/**
	* Removes the document section with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document section
	* @return the document section that was removed
	* @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException;

	public com.nyu.model.DocumentSection updateImpl(
		com.nyu.model.DocumentSection documentSection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document section with the primary key or throws a {@link com.nyu.NoSuchDocumentSectionException} if it could not be found.
	*
	* @param id the primary key of the document section
	* @return the document section
	* @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException;

	/**
	* Returns the document section with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the document section
	* @return the document section, or <code>null</code> if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentSection fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document sections.
	*
	* @return the document sections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentSection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document sections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document sections
	* @param end the upper bound of the range of document sections (not inclusive)
	* @return the range of document sections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentSection> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document sections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document sections
	* @param end the upper bound of the range of document sections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of document sections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentSection> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the document sections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document sections.
	*
	* @return the number of document sections
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}