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

import com.nyu.model.DocumentFile;

/**
 * The persistence interface for the document file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFilePersistenceImpl
 * @see DocumentFileUtil
 * @generated
 */
public interface DocumentFilePersistence extends BasePersistence<DocumentFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentFileUtil} to access the document file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBylessonIdCollection(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBylessonIdCollection(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBylessonIdCollection(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBylessonIdCollection_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBylessonIdCollection_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBylessonIdCollection_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBylessonIdCollection_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document files before and after the current document file in the ordered set where lessonId = &#63;.
	*
	* @param documentId the primary key of the current document file
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile[] findBylessonIdCollection_PrevAndNext(
		long documentId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Removes all the document files where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonIdCollection(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonIdCollection(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document files where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBylessonIdWithCompanyId(
		long companyId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files where companyId = &#63; and lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBylessonIdWithCompanyId(
		long companyId, long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files where companyId = &#63; and lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBylessonIdWithCompanyId(
		long companyId, long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBylessonIdWithCompanyId_First(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the first document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBylessonIdWithCompanyId_First(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBylessonIdWithCompanyId_Last(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the last document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBylessonIdWithCompanyId_Last(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document files before and after the current document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param documentId the primary key of the current document file
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile[] findBylessonIdWithCompanyId_PrevAndNext(
		long documentId, long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Removes all the document files where companyId = &#63; and lessonId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylessonIdWithCompanyId(long companyId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBylessonIdWithCompanyId(long companyId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesListByStatus_First(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesListByStatus_First(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesListByStatus_Last(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesListByStatus_Last(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document files before and after the current document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param documentId the primary key of the current document file
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile[] findBydocumentFilesListByStatus_PrevAndNext(
		long documentId, long lessonId, java.lang.String resourceType,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Removes all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentFilesListByStatus(long lessonId,
		java.lang.String resourceType, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFilesListByStatus(long lessonId,
		java.lang.String resourceType, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document files where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByType(
		long lessonId, java.lang.String resourceType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files where lessonId = &#63; and resourceType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByType(
		long lessonId, java.lang.String resourceType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files where lessonId = &#63; and resourceType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByType(
		long lessonId, java.lang.String resourceType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesListByType_First(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesListByType_First(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesListByType_Last(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesListByType_Last(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document files before and after the current document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param documentId the primary key of the current document file
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile[] findBydocumentFilesListByType_PrevAndNext(
		long documentId, long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Removes all the document files where lessonId = &#63; and resourceType = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentFilesListByType(long lessonId,
		java.lang.String resourceType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFilesListByType(long lessonId,
		java.lang.String resourceType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesList(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesList(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document files before and after the current document file in the ordered set where lessonId = &#63;.
	*
	* @param documentId the primary key of the current document file
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile[] findBydocumentFilesList_PrevAndNext(
		long documentId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Removes all the document files where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentFilesList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFilesList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesListByDocUuid_First(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the first document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesListByDocUuid_First(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFilesListByDocUuid_Last(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the last document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFilesListByDocUuid_Last(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document files before and after the current document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param documentId the primary key of the current document file
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile[] findBydocumentFilesListByDocUuid_PrevAndNext(
		long documentId, java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Removes all the document files where docUuid = &#63; and lessonId &ne; &#63; from the database.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentFilesListByDocUuid(java.lang.String docUuid,
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFilesListByDocUuid(java.lang.String docUuid,
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file where resourceId = &#63; and lessonId = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFile(long resourceId,
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the document file where resourceId = &#63; and lessonId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFile(long resourceId,
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file where resourceId = &#63; and lessonId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFile(long resourceId,
		long lessonId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the document file where resourceId = &#63; and lessonId = &#63; from the database.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile removeBydocumentFile(long resourceId,
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the number of document files where resourceId = &#63; and lessonId = &#63;.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFile(long resourceId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file where docUuid = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param docUuid the doc uuid
	* @return the matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the document file where docUuid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param docUuid the doc uuid
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file where docUuid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param docUuid the doc uuid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the document file where docUuid = &#63; from the database.
	*
	* @param docUuid the doc uuid
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile removeBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the number of document files where docUuid = &#63;.
	*
	* @param docUuid the doc uuid
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFileListByOnlyDocUuid(java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file where docUuid = &#63; and resourceId = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the document file where docUuid = &#63; and resourceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file where docUuid = &#63; and resourceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the document file where docUuid = &#63; and resourceId = &#63; from the database.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile removeBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the number of document files where docUuid = &#63; and resourceId = &#63;.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the document file in the entity cache if it is enabled.
	*
	* @param documentFile the document file
	*/
	public void cacheResult(com.nyu.model.DocumentFile documentFile);

	/**
	* Caches the document files in the entity cache if it is enabled.
	*
	* @param documentFiles the document files
	*/
	public void cacheResult(
		java.util.List<com.nyu.model.DocumentFile> documentFiles);

	/**
	* Creates a new document file with the primary key. Does not add the document file to the database.
	*
	* @param documentId the primary key for the new document file
	* @return the new document file
	*/
	public com.nyu.model.DocumentFile create(long documentId);

	/**
	* Removes the document file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the document file
	* @return the document file that was removed
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile remove(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	public com.nyu.model.DocumentFile updateImpl(
		com.nyu.model.DocumentFile documentFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document file with the primary key or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param documentId the primary key of the document file
	* @return the document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile findByPrimaryKey(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException;

	/**
	* Returns the document file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param documentId the primary key of the document file
	* @return the document file, or <code>null</code> if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nyu.model.DocumentFile fetchByPrimaryKey(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document files.
	*
	* @return the document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @return the range of document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document files
	* @param end the upper bound of the range of document files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of document files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nyu.model.DocumentFile> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the document files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document files.
	*
	* @return the number of document files
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}