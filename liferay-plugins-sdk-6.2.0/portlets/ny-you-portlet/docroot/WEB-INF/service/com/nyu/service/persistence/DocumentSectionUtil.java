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

import com.nyu.model.DocumentSection;

import java.util.List;

/**
 * The persistence utility for the document section service. This utility wraps {@link DocumentSectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentSectionPersistence
 * @see DocumentSectionPersistenceImpl
 * @generated
 */
public class DocumentSectionUtil {
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
	public static void clearCache(DocumentSection documentSection) {
		getPersistence().clearCache(documentSection);
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
	public static List<DocumentSection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentSection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentSection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DocumentSection update(DocumentSection documentSection)
		throws SystemException {
		return getPersistence().update(documentSection);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DocumentSection update(DocumentSection documentSection,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(documentSection, serviceContext);
	}

	/**
	* Returns all the document sections where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching document sections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentSection> findBydocumentSectionList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydocumentSectionList(lessonId);
	}

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
	public static java.util.List<com.nyu.model.DocumentSection> findBydocumentSectionList(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydocumentSectionList(lessonId, start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentSection> findBydocumentSectionList(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentSectionList(lessonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document section
	* @throws com.nyu.NoSuchDocumentSectionException if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection findBydocumentSectionList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException {
		return getPersistence()
				   .findBydocumentSectionList_First(lessonId, orderByComparator);
	}

	/**
	* Returns the first document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document section, or <code>null</code> if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection fetchBydocumentSectionList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentSectionList_First(lessonId, orderByComparator);
	}

	/**
	* Returns the last document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document section
	* @throws com.nyu.NoSuchDocumentSectionException if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection findBydocumentSectionList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException {
		return getPersistence()
				   .findBydocumentSectionList_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the last document section in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document section, or <code>null</code> if a matching document section could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection fetchBydocumentSectionList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentSectionList_Last(lessonId, orderByComparator);
	}

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
	public static com.nyu.model.DocumentSection[] findBydocumentSectionList_PrevAndNext(
		long id, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException {
		return getPersistence()
				   .findBydocumentSectionList_PrevAndNext(id, lessonId,
			orderByComparator);
	}

	/**
	* Removes all the document sections where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentSectionList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydocumentSectionList(lessonId);
	}

	/**
	* Returns the number of document sections where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching document sections
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentSectionList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydocumentSectionList(lessonId);
	}

	/**
	* Caches the document section in the entity cache if it is enabled.
	*
	* @param documentSection the document section
	*/
	public static void cacheResult(
		com.nyu.model.DocumentSection documentSection) {
		getPersistence().cacheResult(documentSection);
	}

	/**
	* Caches the document sections in the entity cache if it is enabled.
	*
	* @param documentSections the document sections
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.DocumentSection> documentSections) {
		getPersistence().cacheResult(documentSections);
	}

	/**
	* Creates a new document section with the primary key. Does not add the document section to the database.
	*
	* @param id the primary key for the new document section
	* @return the new document section
	*/
	public static com.nyu.model.DocumentSection create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the document section with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document section
	* @return the document section that was removed
	* @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException {
		return getPersistence().remove(id);
	}

	public static com.nyu.model.DocumentSection updateImpl(
		com.nyu.model.DocumentSection documentSection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(documentSection);
	}

	/**
	* Returns the document section with the primary key or throws a {@link com.nyu.NoSuchDocumentSectionException} if it could not be found.
	*
	* @param id the primary key of the document section
	* @return the document section
	* @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchDocumentSectionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the document section with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the document section
	* @return the document section, or <code>null</code> if a document section with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.DocumentSection fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the document sections.
	*
	* @return the document sections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.DocumentSection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nyu.model.DocumentSection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nyu.model.DocumentSection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the document sections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of document sections.
	*
	* @return the number of document sections
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocumentSectionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocumentSectionPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					DocumentSectionPersistence.class.getName());

			ReferenceRegistry.registerReference(DocumentSectionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DocumentSectionPersistence persistence) {
	}

	private static DocumentSectionPersistence _persistence;
}