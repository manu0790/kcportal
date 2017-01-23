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

package com.nyu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DocumentFileLocalService}.
 *
 * @author Allwins Rajaiah
 * @see DocumentFileLocalService
 * @generated
 */
public class DocumentFileLocalServiceWrapper implements DocumentFileLocalService,
	ServiceWrapper<DocumentFileLocalService> {
	public DocumentFileLocalServiceWrapper(
		DocumentFileLocalService documentFileLocalService) {
		_documentFileLocalService = documentFileLocalService;
	}

	/**
	* Adds the document file to the database. Also notifies the appropriate model listeners.
	*
	* @param documentFile the document file
	* @return the document file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.DocumentFile addDocumentFile(
		com.nyu.model.DocumentFile documentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.addDocumentFile(documentFile);
	}

	/**
	* Creates a new document file with the primary key. Does not add the document file to the database.
	*
	* @param documentId the primary key for the new document file
	* @return the new document file
	*/
	@Override
	public com.nyu.model.DocumentFile createDocumentFile(long documentId) {
		return _documentFileLocalService.createDocumentFile(documentId);
	}

	/**
	* Deletes the document file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the document file
	* @return the document file that was removed
	* @throws PortalException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.DocumentFile deleteDocumentFile(long documentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.deleteDocumentFile(documentId);
	}

	/**
	* Deletes the document file from the database. Also notifies the appropriate model listeners.
	*
	* @param documentFile the document file
	* @return the document file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.DocumentFile deleteDocumentFile(
		com.nyu.model.DocumentFile documentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.deleteDocumentFile(documentFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentFileLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.DocumentFile fetchDocumentFile(long documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.fetchDocumentFile(documentId);
	}

	/**
	* Returns the document file with the primary key.
	*
	* @param documentId the primary key of the document file
	* @return the document file
	* @throws PortalException if a document file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.DocumentFile getDocumentFile(long documentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.getDocumentFile(documentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.nyu.model.DocumentFile> getDocumentFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.getDocumentFiles(start, end);
	}

	/**
	* Returns the number of document files.
	*
	* @return the number of document files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocumentFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.getDocumentFilesCount();
	}

	/**
	* Updates the document file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentFile the document file
	* @return the document file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.DocumentFile updateDocumentFile(
		com.nyu.model.DocumentFile documentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentFileLocalService.updateDocumentFile(documentFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _documentFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_documentFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _documentFileLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.nyu.model.DocumentFile getDocumentFile(long resourceId,
		long lessonId) {
		return _documentFileLocalService.getDocumentFile(resourceId, lessonId);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> getDocumentExisting(
		long resourceId) {
		return _documentFileLocalService.getDocumentExisting(resourceId);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> CheckResourceIdExist(
		long resourceId) {
		return _documentFileLocalService.CheckResourceIdExist(resourceId);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> getDocumentFiles(
		long lessonId) {
		return _documentFileLocalService.getDocumentFiles(lessonId);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> getDocumentFilesByDocUuid(
		java.lang.String docId, long lessonId) {
		return _documentFileLocalService.getDocumentFilesByDocUuid(docId,
			lessonId);
	}

	@Override
	public com.nyu.model.DocumentFile getDocumentFilesByReferenceId(
		java.lang.String referenceId) {
		return _documentFileLocalService.getDocumentFilesByReferenceId(referenceId);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> findResourceDocumentsWithPermission(
		java.lang.String resourceType, java.lang.String status,
		java.lang.String[] permission) {
		return _documentFileLocalService.findResourceDocumentsWithPermission(resourceType,
			status, permission);
	}

	@Override
	public java.util.Set<java.lang.Long> findResourceDocumentsIdsWithPermission(
		java.lang.String resourceType, java.lang.String[] permission,
		long lessonId) {
		return _documentFileLocalService.findResourceDocumentsIdsWithPermission(resourceType,
			permission, lessonId);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> findResourceDocumentsBylessonIdAndStatus(
		long lessonId, java.lang.String resourceType, java.lang.String status) {
		return _documentFileLocalService.findResourceDocumentsBylessonIdAndStatus(lessonId,
			resourceType, status);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> findResourceDocumentsBylessonIdAndType(
		long lessonId, java.lang.String resourceType) {
		return _documentFileLocalService.findResourceDocumentsBylessonIdAndType(lessonId,
			resourceType);
	}

	@Override
	public boolean isLessonIsPublishable(long lessonId,
		java.lang.String resourceType, java.lang.String status) {
		return _documentFileLocalService.isLessonIsPublishable(lessonId,
			resourceType, status);
	}

	@Override
	public com.nyu.model.DocumentFile findDocumentFileByUuidAndResourceId(
		java.lang.String docUuid, long resourceId) {
		return _documentFileLocalService.findDocumentFileByUuidAndResourceId(docUuid,
			resourceId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocumentFileLocalService getWrappedDocumentFileLocalService() {
		return _documentFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocumentFileLocalService(
		DocumentFileLocalService documentFileLocalService) {
		_documentFileLocalService = documentFileLocalService;
	}

	@Override
	public DocumentFileLocalService getWrappedService() {
		return _documentFileLocalService;
	}

	@Override
	public void setWrappedService(
		DocumentFileLocalService documentFileLocalService) {
		_documentFileLocalService = documentFileLocalService;
	}

	private DocumentFileLocalService _documentFileLocalService;
}