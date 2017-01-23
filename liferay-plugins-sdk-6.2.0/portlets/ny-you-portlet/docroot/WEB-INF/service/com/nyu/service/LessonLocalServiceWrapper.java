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
 * Provides a wrapper for {@link LessonLocalService}.
 *
 * @author Allwins Rajaiah
 * @see LessonLocalService
 * @generated
 */
public class LessonLocalServiceWrapper implements LessonLocalService,
	ServiceWrapper<LessonLocalService> {
	public LessonLocalServiceWrapper(LessonLocalService lessonLocalService) {
		_lessonLocalService = lessonLocalService;
	}

	/**
	* Adds the lesson to the database. Also notifies the appropriate model listeners.
	*
	* @param lesson the lesson
	* @return the lesson that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson addLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.addLesson(lesson);
	}

	/**
	* Creates a new lesson with the primary key. Does not add the lesson to the database.
	*
	* @param lessonId the primary key for the new lesson
	* @return the new lesson
	*/
	@Override
	public com.nyu.model.Lesson createLesson(long lessonId) {
		return _lessonLocalService.createLesson(lessonId);
	}

	/**
	* Deletes the lesson with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson that was removed
	* @throws PortalException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson deleteLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.deleteLesson(lessonId);
	}

	/**
	* Deletes the lesson from the database. Also notifies the appropriate model listeners.
	*
	* @param lesson the lesson
	* @return the lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson deleteLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.deleteLesson(lesson);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lessonLocalService.dynamicQuery();
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
		return _lessonLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lessonLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lessonLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _lessonLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lessonLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nyu.model.Lesson fetchLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.fetchLesson(lessonId);
	}

	/**
	* Returns the lesson with the matching UUID and company.
	*
	* @param uuid the lesson's UUID
	* @param companyId the primary key of the company
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson fetchLessonByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.fetchLessonByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the lesson matching the UUID and group.
	*
	* @param uuid the lesson's UUID
	* @param groupId the primary key of the group
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson fetchLessonByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.fetchLessonByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the lesson with the primary key.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson
	* @throws PortalException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson getLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLesson(lessonId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the lesson with the matching UUID and company.
	*
	* @param uuid the lesson's UUID
	* @param companyId the primary key of the company
	* @return the matching lesson
	* @throws PortalException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson getLessonByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessonByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the lesson matching the UUID and group.
	*
	* @param uuid the lesson's UUID
	* @param groupId the primary key of the group
	* @return the matching lesson
	* @throws PortalException if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson getLessonByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessonByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the lessons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lessons
	* @param end the upper bound of the range of lessons (not inclusive)
	* @return the range of lessons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.nyu.model.Lesson> getLessons(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessons(start, end);
	}

	/**
	* Returns the number of lessons.
	*
	* @return the number of lessons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLessonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessonsCount();
	}

	/**
	* Updates the lesson in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lesson the lesson
	* @return the lesson that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.nyu.model.Lesson updateLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.updateLesson(lesson);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lessonLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lessonLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lessonLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.nyu.model.Lesson updateLesson(com.nyu.model.Lesson lesson,
		com.liferay.portal.service.ServiceContext serviceContext, int type,
		java.lang.String[] unpublishDocIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.updateLesson(lesson, serviceContext, type,
			unpublishDocIds);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> getDocumentFileList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getDocumentFileList(lessonId);
	}

	@Override
	public com.nyu.model.DocumentFile getDocumentFile(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getDocumentFile(lessonId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> search(
		java.lang.String searchText, java.lang.String searchType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.search(searchText, searchType);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> search(
		java.lang.String searchText, java.lang.String searchType, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.search(searchText, searchType, companyId);
	}

	@Override
	public java.lang.String launcher(java.lang.String key, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.launcher(key, lessonId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByStatus(
		java.lang.String status, int start, int end) {
		return _lessonLocalService.getLessonsByStatus(status, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByPrivacy(
		java.lang.String lessonPrivacy, java.lang.String orderBy,
		java.lang.String orderByType, int start, int end) {
		return _lessonLocalService.getLessonsByPrivacy(lessonPrivacy, orderBy,
			orderByType, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByPrivacy(
		java.lang.String[] lessonPrivacy, java.lang.String orderBy,
		java.lang.String orderByType, int start, int end) {
		return _lessonLocalService.getLessonsByPrivacy(lessonPrivacy, orderBy,
			orderByType, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessonsByCategoryId(categoryId);
	}

	@Override
	public void addUser(long userId, long lessionId, long groupId) {
		_lessonLocalService.addUser(userId, lessionId, groupId);
	}

	@Override
	public java.util.List<com.liferay.portlet.asset.model.AssetEntry> getEntries(
		long lessonId) {
		return _lessonLocalService.getEntries(lessonId);
	}

	@Override
	public java.lang.String getTimeDifference(long diff) {
		return _lessonLocalService.getTimeDifference(diff);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthor(
		long authorId) {
		return _lessonLocalService.getLessonsUploadedByAuthor(authorId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthorAndStatus(
		long authorId, java.lang.String status) {
		return _lessonLocalService.getLessonsUploadedByAuthorAndStatus(authorId,
			status);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findUserAliveLessons(
		long userId) {
		return _lessonLocalService.findUserAliveLessons(userId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findGroupAliveLessons(
		long groupId) {
		return _lessonLocalService.findGroupAliveLessons(groupId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthorAndStatus(
		long authorId, java.lang.String status, long userId) {
		return _lessonLocalService.getLessonsUploadedByAuthorAndStatus(authorId,
			status, userId);
	}

	@Override
	public com.nyu.model.Lesson getLessonsUploadedByAuthor(long lessonId,
		long authorId) {
		return _lessonLocalService.getLessonsUploadedByAuthor(lessonId, authorId);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findMostFollowedAuthors() {
		return _lessonLocalService.findMostFollowedAuthors();
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findFollowingAuthors(
		long userId1) {
		return _lessonLocalService.findFollowingAuthors(userId1);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findLessonByType(
		long clasNameId, long lessonId, int type) {
		return _lessonLocalService.findLessonByType(clasNameId, lessonId, type);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findRecentActivity(
		long clasNameId, long userId) {
		return _lessonLocalService.findRecentActivity(clasNameId, userId);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findLessonActivity(
		long clasNameId, long classPK, long userId) {
		return _lessonLocalService.findLessonActivity(clasNameId, classPK,
			userId);
	}

	@Override
	public void findAndDeleteUserActivity(long userId, long clasPk,
		long createdDate, int type) {
		_lessonLocalService.findAndDeleteUserActivity(userId, clasPk,
			createdDate, type);
	}

	@Override
	public void addSocialActivity(long userId, long groupId,
		java.lang.String cls, long classPk, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_lessonLocalService.addSocialActivity(userId, groupId, cls, classPk,
			type);
	}

	@Override
	public void deleteUserSocialActivity(long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_lessonLocalService.deleteUserSocialActivity(activityId);
	}

	@Override
	public java.util.Set<com.nyu.model.Lesson> getLessonsByCategoryAndTags(
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessonsByCategoryAndTags(className,
			classPK);
	}

	@Override
	public java.util.Set<com.nyu.model.Lesson> getLessonsByCategoryAndTags(
		java.lang.String className, long classPK, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lessonLocalService.getLessonsByCategoryAndTags(className,
			classPK, userId);
	}

	@Override
	public void performCleanUp(long lessonId, java.lang.String funType,
		long userId, int type, java.lang.String[] unpublishDocIds) {
		_lessonLocalService.performCleanUp(lessonId, funType, userId, type,
			unpublishDocIds);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return _lessonLocalService.findAssetLessons(status, userId, privacy,
			orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return _lessonLocalService.findAssetFeaturedLessons(status, userId,
			privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategory(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetLessonsByCategory(categoryId,
			userId, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetLessonsByTag(tagId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetFeaturedLessonsByTag(tagId, userId,
			status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetFeaturedUserGroupLessonsByTag(userGroupId,
			tagId, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return _lessonLocalService.findAssetUserGroupLessons(userGroupId,
			status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByCategory(
		long userGroupId, long categoryId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetUserGroupLessonsByCategory(userGroupId,
			categoryId, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetUserGroupLessonsByTag(userGroupId,
			tagId, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findFeaturedUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return _lessonLocalService.findFeaturedUserGroupLessons(userGroupId,
			status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndUser(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetLessonsByCategoryAndUser(categoryId,
			userId, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndUser(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetLessonsByTagAndUser(tagId, userId,
			status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndFeatured(
		long categoryId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetLessonsByCategoryAndFeatured(categoryId,
			featured, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndFeatured(
		long tagId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findAssetLessonsByTagAndFeatured(tagId,
			featured, status, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findMyFavouriteLessons(
		long userId, java.lang.String status, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return _lessonLocalService.findMyFavouriteLessons(userId, status,
			orderBy, markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findMyLessonsWithCollaborations(
		long userId, java.lang.String orderBy, java.lang.String[] markedAs,
		int start, int end) {
		return _lessonLocalService.findMyLessonsWithCollaborations(userId,
			orderBy, markedAs, start, end);
	}

	@Override
	public void deleteObjectivesOfLesson(long lessonId) {
		_lessonLocalService.deleteObjectivesOfLesson(lessonId);
	}

	@Override
	public java.lang.Boolean getFavouriteLesson(long userId, long lessonId) {
		return _lessonLocalService.getFavouriteLesson(userId, lessonId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getFavouriteLessonsByUserId(
		long userId) {
		return _lessonLocalService.getFavouriteLessonsByUserId(userId);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findLessonsWithCollaborations(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return _lessonLocalService.findLessonsWithCollaborations(status,
			userId, privacy, orderBy, markedAs, start, end);
	}

	@Override
	public java.util.Set<java.lang.Long> findPrivateLessonsIdsBelongToUser(
		long userId) {
		return _lessonLocalService.findPrivateLessonsIdsBelongToUser(userId);
	}

	@Override
	public java.util.Set<java.lang.Long> findPrivateLessonsIds(
		java.lang.String[] status) {
		return _lessonLocalService.findPrivateLessonsIds(status);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsMarkedAs(
		java.lang.String markedAs, int start, int end) {
		return _lessonLocalService.getLessonsMarkedAs(markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findArchivedMarkedAsLessonsByTag(
		long tagId, java.lang.String markedAs, int start, int end) {
		return _lessonLocalService.findArchivedMarkedAsLessonsByTag(tagId,
			markedAs, start, end);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findArchivedMarkedAsLessonsByCategory(
		long categoryId, java.lang.String markedAs, int start, int end) {
		return _lessonLocalService.findArchivedMarkedAsLessonsByCategory(categoryId,
			markedAs, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LessonLocalService getWrappedLessonLocalService() {
		return _lessonLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLessonLocalService(
		LessonLocalService lessonLocalService) {
		_lessonLocalService = lessonLocalService;
	}

	@Override
	public LessonLocalService getWrappedService() {
		return _lessonLocalService;
	}

	@Override
	public void setWrappedService(LessonLocalService lessonLocalService) {
		_lessonLocalService = lessonLocalService;
	}

	private LessonLocalService _lessonLocalService;
}