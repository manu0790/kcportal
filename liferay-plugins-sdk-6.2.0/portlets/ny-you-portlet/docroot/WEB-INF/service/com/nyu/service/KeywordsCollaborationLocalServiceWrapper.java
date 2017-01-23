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
 * Provides a wrapper for {@link KeywordsCollaborationLocalService}.
 *
 * @author Allwins Rajaiah
 * @see KeywordsCollaborationLocalService
 * @generated
 */
public class KeywordsCollaborationLocalServiceWrapper
	implements KeywordsCollaborationLocalService,
		ServiceWrapper<KeywordsCollaborationLocalService> {
	public KeywordsCollaborationLocalServiceWrapper(
		KeywordsCollaborationLocalService keywordsCollaborationLocalService) {
		_keywordsCollaborationLocalService = keywordsCollaborationLocalService;
	}

	/**
	* Adds the keywords collaboration to the database. Also notifies the appropriate model listeners.
	*
	* @param keywordsCollaboration the keywords collaboration
	* @return the keywords collaboration that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.KeywordsCollaboration addKeywordsCollaboration(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.addKeywordsCollaboration(keywordsCollaboration);
	}

	/**
	* Creates a new keywords collaboration with the primary key. Does not add the keywords collaboration to the database.
	*
	* @param id the primary key for the new keywords collaboration
	* @return the new keywords collaboration
	*/
	@Override
	public com.nyu.model.KeywordsCollaboration createKeywordsCollaboration(
		long id) {
		return _keywordsCollaborationLocalService.createKeywordsCollaboration(id);
	}

	/**
	* Deletes the keywords collaboration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration that was removed
	* @throws PortalException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.KeywordsCollaboration deleteKeywordsCollaboration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.deleteKeywordsCollaboration(id);
	}

	/**
	* Deletes the keywords collaboration from the database. Also notifies the appropriate model listeners.
	*
	* @param keywordsCollaboration the keywords collaboration
	* @return the keywords collaboration that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.KeywordsCollaboration deleteKeywordsCollaboration(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.deleteKeywordsCollaboration(keywordsCollaboration);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _keywordsCollaborationLocalService.dynamicQuery();
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
		return _keywordsCollaborationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keywordsCollaborationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _keywordsCollaborationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _keywordsCollaborationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _keywordsCollaborationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.nyu.model.KeywordsCollaboration fetchKeywordsCollaboration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.fetchKeywordsCollaboration(id);
	}

	/**
	* Returns the keywords collaboration with the primary key.
	*
	* @param id the primary key of the keywords collaboration
	* @return the keywords collaboration
	* @throws PortalException if a keywords collaboration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.KeywordsCollaboration getKeywordsCollaboration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.getKeywordsCollaboration(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the keywords collaborations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.KeywordsCollaborationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of keywords collaborations
	* @param end the upper bound of the range of keywords collaborations (not inclusive)
	* @return the range of keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.KeywordsCollaboration> getKeywordsCollaborations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.getKeywordsCollaborations(start,
			end);
	}

	/**
	* Returns the number of keywords collaborations.
	*
	* @return the number of keywords collaborations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKeywordsCollaborationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.getKeywordsCollaborationsCount();
	}

	/**
	* Updates the keywords collaboration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param keywordsCollaboration the keywords collaboration
	* @return the keywords collaboration that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.KeywordsCollaboration updateKeywordsCollaboration(
		com.nyu.model.KeywordsCollaboration keywordsCollaboration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _keywordsCollaborationLocalService.updateKeywordsCollaboration(keywordsCollaboration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _keywordsCollaborationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_keywordsCollaborationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _keywordsCollaborationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.nyu.model.KeywordsCollaboration getKeyWordCollaborationStatus(
		long keywordId, long userId) {
		return _keywordsCollaborationLocalService.getKeyWordCollaborationStatus(keywordId,
			userId);
	}

	@Override
	public java.util.List<com.nyu.model.KeywordsCollaboration> getKeyWordCollaborationStatusList(
		long keywordId) {
		return _keywordsCollaborationLocalService.getKeyWordCollaborationStatusList(keywordId);
	}

	@Override
	public java.util.List<com.nyu.model.KeywordsCollaboration> getPendingRequestByStatus(
		java.lang.String status) {
		return _keywordsCollaborationLocalService.getPendingRequestByStatus(status);
	}

	@Override
	public java.util.List<com.nyu.model.KeywordsCollaboration> getRequestStatusByUserId(
		long userId) {
		return _keywordsCollaborationLocalService.getRequestStatusByUserId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KeywordsCollaborationLocalService getWrappedKeywordsCollaborationLocalService() {
		return _keywordsCollaborationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKeywordsCollaborationLocalService(
		KeywordsCollaborationLocalService keywordsCollaborationLocalService) {
		_keywordsCollaborationLocalService = keywordsCollaborationLocalService;
	}

	@Override
	public KeywordsCollaborationLocalService getWrappedService() {
		return _keywordsCollaborationLocalService;
	}

	@Override
	public void setWrappedService(
		KeywordsCollaborationLocalService keywordsCollaborationLocalService) {
		_keywordsCollaborationLocalService = keywordsCollaborationLocalService;
	}

	private KeywordsCollaborationLocalService _keywordsCollaborationLocalService;
}