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

import com.nyu.model.DocumentFile;

import java.util.List;

/**
 * The persistence utility for the document file service. This utility wraps {@link DocumentFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFilePersistence
 * @see DocumentFilePersistenceImpl
 * @generated
 */
public class DocumentFileUtil {
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
	public static void clearCache(DocumentFile documentFile) {
		getPersistence().clearCache(documentFile);
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
	public static List<DocumentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DocumentFile update(DocumentFile documentFile)
		throws SystemException {
		return getPersistence().update(documentFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DocumentFile update(DocumentFile documentFile,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(documentFile, serviceContext);
	}

	/**
	* Returns all the document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findBylessonIdCollection(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonIdCollection(lessonId);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBylessonIdCollection(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonIdCollection(lessonId, start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBylessonIdCollection(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonIdCollection(lessonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBylessonIdCollection_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBylessonIdCollection_First(lessonId, orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBylessonIdCollection_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonIdCollection_First(lessonId, orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBylessonIdCollection_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBylessonIdCollection_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBylessonIdCollection_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonIdCollection_Last(lessonId, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile[] findBylessonIdCollection_PrevAndNext(
		long documentId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBylessonIdCollection_PrevAndNext(documentId, lessonId,
			orderByComparator);
	}

	/**
	* Removes all the document files where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonIdCollection(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonIdCollection(lessonId);
	}

	/**
	* Returns the number of document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonIdCollection(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonIdCollection(lessonId);
	}

	/**
	* Returns all the document files where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findBylessonIdWithCompanyId(
		long companyId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonIdWithCompanyId(companyId, lessonId);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBylessonIdWithCompanyId(
		long companyId, long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonIdWithCompanyId(companyId, lessonId, start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBylessonIdWithCompanyId(
		long companyId, long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonIdWithCompanyId(companyId, lessonId, start,
			end, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBylessonIdWithCompanyId_First(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBylessonIdWithCompanyId_First(companyId, lessonId,
			orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBylessonIdWithCompanyId_First(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonIdWithCompanyId_First(companyId, lessonId,
			orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBylessonIdWithCompanyId_Last(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBylessonIdWithCompanyId_Last(companyId, lessonId,
			orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBylessonIdWithCompanyId_Last(
		long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonIdWithCompanyId_Last(companyId, lessonId,
			orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile[] findBylessonIdWithCompanyId_PrevAndNext(
		long documentId, long companyId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBylessonIdWithCompanyId_PrevAndNext(documentId,
			companyId, lessonId, orderByComparator);
	}

	/**
	* Removes all the document files where companyId = &#63; and lessonId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonIdWithCompanyId(long companyId,
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonIdWithCompanyId(companyId, lessonId);
	}

	/**
	* Returns the number of document files where companyId = &#63; and lessonId = &#63;.
	*
	* @param companyId the company ID
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonIdWithCompanyId(long companyId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonIdWithCompanyId(companyId, lessonId);
	}

	/**
	* Returns all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByStatus(lessonId, resourceType,
			status);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByStatus(lessonId, resourceType,
			status, start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByStatus(lessonId, resourceType,
			status, start, end, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBydocumentFilesListByStatus_First(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByStatus_First(lessonId,
			resourceType, status, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile fetchBydocumentFilesListByStatus_First(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesListByStatus_First(lessonId,
			resourceType, status, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBydocumentFilesListByStatus_Last(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByStatus_Last(lessonId,
			resourceType, status, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile fetchBydocumentFilesListByStatus_Last(
		long lessonId, java.lang.String resourceType, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesListByStatus_Last(lessonId,
			resourceType, status, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile[] findBydocumentFilesListByStatus_PrevAndNext(
		long documentId, long lessonId, java.lang.String resourceType,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByStatus_PrevAndNext(documentId,
			lessonId, resourceType, status, orderByComparator);
	}

	/**
	* Removes all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentFilesListByStatus(long lessonId,
		java.lang.String resourceType, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydocumentFilesListByStatus(lessonId, resourceType, status);
	}

	/**
	* Returns the number of document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param status the status
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFilesListByStatus(long lessonId,
		java.lang.String resourceType, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentFilesListByStatus(lessonId, resourceType,
			status);
	}

	/**
	* Returns all the document files where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByType(
		long lessonId, java.lang.String resourceType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByType(lessonId, resourceType);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByType(
		long lessonId, java.lang.String resourceType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByType(lessonId, resourceType,
			start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByType(
		long lessonId, java.lang.String resourceType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByType(lessonId, resourceType,
			start, end, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBydocumentFilesListByType_First(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByType_First(lessonId, resourceType,
			orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFilesListByType_First(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesListByType_First(lessonId,
			resourceType, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBydocumentFilesListByType_Last(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByType_Last(lessonId, resourceType,
			orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFilesListByType_Last(
		long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesListByType_Last(lessonId, resourceType,
			orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile[] findBydocumentFilesListByType_PrevAndNext(
		long documentId, long lessonId, java.lang.String resourceType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByType_PrevAndNext(documentId,
			lessonId, resourceType, orderByComparator);
	}

	/**
	* Removes all the document files where lessonId = &#63; and resourceType = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentFilesListByType(long lessonId,
		java.lang.String resourceType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydocumentFilesListByType(lessonId, resourceType);
	}

	/**
	* Returns the number of document files where lessonId = &#63; and resourceType = &#63;.
	*
	* @param lessonId the lesson ID
	* @param resourceType the resource type
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFilesListByType(long lessonId,
		java.lang.String resourceType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentFilesListByType(lessonId, resourceType);
	}

	/**
	* Returns all the document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydocumentFilesList(lessonId);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesList(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydocumentFilesList(lessonId, start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesList(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesList(lessonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBydocumentFilesList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesList_First(lessonId, orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFilesList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesList_First(lessonId, orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBydocumentFilesList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesList_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFilesList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesList_Last(lessonId, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile[] findBydocumentFilesList_PrevAndNext(
		long documentId, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesList_PrevAndNext(documentId, lessonId,
			orderByComparator);
	}

	/**
	* Removes all the document files where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentFilesList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydocumentFilesList(lessonId);
	}

	/**
	* Returns the number of document files where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFilesList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydocumentFilesList(lessonId);
	}

	/**
	* Returns all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @return the matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByDocUuid(docUuid, lessonId);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByDocUuid(docUuid, lessonId, start,
			end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentFilesListByDocUuid(docUuid, lessonId, start,
			end, orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBydocumentFilesListByDocUuid_First(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByDocUuid_First(docUuid, lessonId,
			orderByComparator);
	}

	/**
	* Returns the first document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFilesListByDocUuid_First(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesListByDocUuid_First(docUuid, lessonId,
			orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile findBydocumentFilesListByDocUuid_Last(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByDocUuid_Last(docUuid, lessonId,
			orderByComparator);
	}

	/**
	* Returns the last document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFilesListByDocUuid_Last(
		java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFilesListByDocUuid_Last(docUuid, lessonId,
			orderByComparator);
	}

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
	public static com.nyu.model.DocumentFile[] findBydocumentFilesListByDocUuid_PrevAndNext(
		long documentId, java.lang.String docUuid, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFilesListByDocUuid_PrevAndNext(documentId,
			docUuid, lessonId, orderByComparator);
	}

	/**
	* Removes all the document files where docUuid = &#63; and lessonId &ne; &#63; from the database.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydocumentFilesListByDocUuid(docUuid, lessonId);
	}

	/**
	* Returns the number of document files where docUuid = &#63; and lessonId &ne; &#63;.
	*
	* @param docUuid the doc uuid
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFilesListByDocUuid(
		java.lang.String docUuid, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentFilesListByDocUuid(docUuid, lessonId);
	}

	/**
	* Returns the document file where resourceId = &#63; and lessonId = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBydocumentFile(
		long resourceId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence().findBydocumentFile(resourceId, lessonId);
	}

	/**
	* Returns the document file where resourceId = &#63; and lessonId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFile(
		long resourceId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydocumentFile(resourceId, lessonId);
	}

	/**
	* Returns the document file where resourceId = &#63; and lessonId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFile(
		long resourceId, long lessonId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFile(resourceId, lessonId, retrieveFromCache);
	}

	/**
	* Removes the document file where resourceId = &#63; and lessonId = &#63; from the database.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile removeBydocumentFile(
		long resourceId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence().removeBydocumentFile(resourceId, lessonId);
	}

	/**
	* Returns the number of document files where resourceId = &#63; and lessonId = &#63;.
	*
	* @param resourceId the resource ID
	* @param lessonId the lesson ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFile(long resourceId, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydocumentFile(resourceId, lessonId);
	}

	/**
	* Returns the document file where docUuid = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param docUuid the doc uuid
	* @return the matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence().findBydocumentFileListByOnlyDocUuid(docUuid);
	}

	/**
	* Returns the document file where docUuid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param docUuid the doc uuid
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydocumentFileListByOnlyDocUuid(docUuid);
	}

	/**
	* Returns the document file where docUuid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param docUuid the doc uuid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFileListByOnlyDocUuid(docUuid,
			retrieveFromCache);
	}

	/**
	* Removes the document file where docUuid = &#63; from the database.
	*
	* @param docUuid the doc uuid
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile removeBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence().removeBydocumentFileListByOnlyDocUuid(docUuid);
	}

	/**
	* Returns the number of document files where docUuid = &#63;.
	*
	* @param docUuid the doc uuid
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFileListByOnlyDocUuid(
		java.lang.String docUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydocumentFileListByOnlyDocUuid(docUuid);
	}

	/**
	* Returns the document file where docUuid = &#63; and resourceId = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the matching document file
	* @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .findBydocumentFileByUuidAndResourceId(docUuid, resourceId);
	}

	/**
	* Returns the document file where docUuid = &#63; and resourceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFileByUuidAndResourceId(docUuid, resourceId);
	}

	/**
	* Returns the document file where docUuid = &#63; and resourceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document file, or <code>null</code> if a matching document file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentFileByUuidAndResourceId(docUuid, resourceId,
			retrieveFromCache);
	}

	/**
	* Removes the document file where docUuid = &#63; and resourceId = &#63; from the database.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile removeBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence()
				   .removeBydocumentFileByUuidAndResourceId(docUuid, resourceId);
	}

	/**
	* Returns the number of document files where docUuid = &#63; and resourceId = &#63;.
	*
	* @param docUuid the doc uuid
	* @param resourceId the resource ID
	* @return the number of matching document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentFileByUuidAndResourceId(docUuid, resourceId);
	}

	/**
	* Caches the document file in the entity cache if it is enabled.
	*
	* @param documentFile the document file
	*/
	public static void cacheResult(com.nyu.model.DocumentFile documentFile) {
		getPersistence().cacheResult(documentFile);
	}

	/**
	* Caches the document files in the entity cache if it is enabled.
	*
	* @param documentFiles the document files
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.DocumentFile> documentFiles) {
		getPersistence().cacheResult(documentFiles);
	}

	/**
	* Creates a new document file with the primary key. Does not add the document file to the database.
	*
	* @param documentId the primary key for the new document file
	* @return the new document file
	*/
	public static com.nyu.model.DocumentFile create(long documentId) {
		return getPersistence().create(documentId);
	}

	/**
	* Removes the document file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the document file
	* @return the document file that was removed
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile remove(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence().remove(documentId);
	}

	public static com.nyu.model.DocumentFile updateImpl(
		com.nyu.model.DocumentFile documentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(documentFile);
	}

	/**
	* Returns the document file with the primary key or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	*
	* @param documentId the primary key of the document file
	* @return the document file
	* @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile findByPrimaryKey(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentFileException {
		return getPersistence().findByPrimaryKey(documentId);
	}

	/**
	* Returns the document file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param documentId the primary key of the document file
	* @return the document file, or <code>null</code> if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentFile fetchByPrimaryKey(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(documentId);
	}

	/**
	* Returns all the document files.
	*
	* @return the document files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the document files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of document files.
	*
	* @return the number of document files
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocumentFilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocumentFilePersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					DocumentFilePersistence.class.getName());

			ReferenceRegistry.registerReference(DocumentFileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DocumentFilePersistence persistence) {
	}

	private static DocumentFilePersistence _persistence;
}