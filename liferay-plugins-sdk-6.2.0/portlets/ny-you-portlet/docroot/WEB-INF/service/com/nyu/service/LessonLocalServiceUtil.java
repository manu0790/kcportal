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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Lesson. This utility wraps
 * {@link com.nyu.service.impl.LessonLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Allwins Rajaiah
 * @see LessonLocalService
 * @see com.nyu.service.base.LessonLocalServiceBaseImpl
 * @see com.nyu.service.impl.LessonLocalServiceImpl
 * @generated
 */
public class LessonLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.nyu.service.impl.LessonLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the lesson to the database. Also notifies the appropriate model listeners.
	*
	* @param lesson the lesson
	* @return the lesson that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson addLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLesson(lesson);
	}

	/**
	* Creates a new lesson with the primary key. Does not add the lesson to the database.
	*
	* @param lessonId the primary key for the new lesson
	* @return the new lesson
	*/
	public static com.nyu.model.Lesson createLesson(long lessonId) {
		return getService().createLesson(lessonId);
	}

	/**
	* Deletes the lesson with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson that was removed
	* @throws PortalException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson deleteLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLesson(lessonId);
	}

	/**
	* Deletes the lesson from the database. Also notifies the appropriate model listeners.
	*
	* @param lesson the lesson
	* @return the lesson that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson deleteLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLesson(lesson);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.nyu.model.Lesson fetchLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLesson(lessonId);
	}

	/**
	* Returns the lesson with the matching UUID and company.
	*
	* @param uuid the lesson's UUID
	* @param companyId the primary key of the company
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchLessonByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLessonByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the lesson matching the UUID and group.
	*
	* @param uuid the lesson's UUID
	* @param groupId the primary key of the group
	* @return the matching lesson, or <code>null</code> if a matching lesson could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson fetchLessonByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLessonByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the lesson with the primary key.
	*
	* @param lessonId the primary key of the lesson
	* @return the lesson
	* @throws PortalException if a lesson with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson getLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLesson(lessonId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static com.nyu.model.Lesson getLessonByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLessonByUuidAndCompanyId(uuid, companyId);
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
	public static com.nyu.model.Lesson getLessonByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLessonByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.nyu.model.Lesson> getLessons(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLessons(start, end);
	}

	/**
	* Returns the number of lessons.
	*
	* @return the number of lessons
	* @throws SystemException if a system exception occurred
	*/
	public static int getLessonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLessonsCount();
	}

	/**
	* Updates the lesson in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lesson the lesson
	* @return the lesson that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.Lesson updateLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLesson(lesson);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.nyu.model.Lesson updateLesson(
		com.nyu.model.Lesson lesson,
		com.liferay.portal.service.ServiceContext serviceContext, int type,
		java.lang.String[] unpublishDocIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateLesson(lesson, serviceContext, type, unpublishDocIds);
	}

	public static java.util.List<com.nyu.model.DocumentFile> getDocumentFileList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentFileList(lessonId);
	}

	public static com.nyu.model.DocumentFile getDocumentFile(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentFile(lessonId);
	}

	public static java.util.List<com.nyu.model.Lesson> search(
		java.lang.String searchText, java.lang.String searchType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().search(searchText, searchType);
	}

	public static java.util.List<com.nyu.model.Lesson> search(
		java.lang.String searchText, java.lang.String searchType, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().search(searchText, searchType, companyId);
	}

	public static java.lang.String launcher(java.lang.String key, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().launcher(key, lessonId);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsByStatus(
		java.lang.String status, int start, int end) {
		return getService().getLessonsByStatus(status, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsByPrivacy(
		java.lang.String lessonPrivacy, java.lang.String orderBy,
		java.lang.String orderByType, int start, int end) {
		return getService()
				   .getLessonsByPrivacy(lessonPrivacy, orderBy, orderByType,
			start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsByPrivacy(
		java.lang.String[] lessonPrivacy, java.lang.String orderBy,
		java.lang.String orderByType, int start, int end) {
		return getService()
				   .getLessonsByPrivacy(lessonPrivacy, orderBy, orderByType,
			start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLessonsByCategoryId(categoryId);
	}

	public static void addUser(long userId, long lessionId, long groupId) {
		getService().addUser(userId, lessionId, groupId);
	}

	public static java.util.List<com.liferay.portlet.asset.model.AssetEntry> getEntries(
		long lessonId) {
		return getService().getEntries(lessonId);
	}

	public static java.lang.String getTimeDifference(long diff) {
		return getService().getTimeDifference(diff);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthor(
		long authorId) {
		return getService().getLessonsUploadedByAuthor(authorId);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthorAndStatus(
		long authorId, java.lang.String status) {
		return getService().getLessonsUploadedByAuthorAndStatus(authorId, status);
	}

	public static java.util.List<com.nyu.model.Lesson> findUserAliveLessons(
		long userId) {
		return getService().findUserAliveLessons(userId);
	}

	public static java.util.List<com.nyu.model.Lesson> findGroupAliveLessons(
		long groupId) {
		return getService().findGroupAliveLessons(groupId);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthorAndStatus(
		long authorId, java.lang.String status, long userId) {
		return getService()
				   .getLessonsUploadedByAuthorAndStatus(authorId, status, userId);
	}

	public static com.nyu.model.Lesson getLessonsUploadedByAuthor(
		long lessonId, long authorId) {
		return getService().getLessonsUploadedByAuthor(lessonId, authorId);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findMostFollowedAuthors() {
		return getService().findMostFollowedAuthors();
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findFollowingAuthors(
		long userId1) {
		return getService().findFollowingAuthors(userId1);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findLessonByType(
		long clasNameId, long lessonId, int type) {
		return getService().findLessonByType(clasNameId, lessonId, type);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findRecentActivity(
		long clasNameId, long userId) {
		return getService().findRecentActivity(clasNameId, userId);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findLessonActivity(
		long clasNameId, long classPK, long userId) {
		return getService().findLessonActivity(clasNameId, classPK, userId);
	}

	public static void findAndDeleteUserActivity(long userId, long clasPk,
		long createdDate, int type) {
		getService().findAndDeleteUserActivity(userId, clasPk, createdDate, type);
	}

	public static void addSocialActivity(long userId, long groupId,
		java.lang.String cls, long classPk, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().addSocialActivity(userId, groupId, cls, classPk, type);
	}

	public static void deleteUserSocialActivity(long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserSocialActivity(activityId);
	}

	public static java.util.Set<com.nyu.model.Lesson> getLessonsByCategoryAndTags(
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLessonsByCategoryAndTags(className, classPK);
	}

	public static java.util.Set<com.nyu.model.Lesson> getLessonsByCategoryAndTags(
		java.lang.String className, long classPK, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLessonsByCategoryAndTags(className, classPK, userId);
	}

	public static void performCleanUp(long lessonId, java.lang.String funType,
		long userId, int type, java.lang.String[] unpublishDocIds) {
		getService()
			.performCleanUp(lessonId, funType, userId, type, unpublishDocIds);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getService()
				   .findAssetLessons(status, userId, privacy, orderBy,
			markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getService()
				   .findAssetFeaturedLessons(status, userId, privacy, orderBy,
			markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategory(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetLessonsByCategory(categoryId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetLessonsByTag(tagId, userId, status, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetFeaturedLessonsByTag(tagId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetFeaturedUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetFeaturedUserGroupLessonsByTag(userGroupId, tagId,
			status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getService()
				   .findAssetUserGroupLessons(userGroupId, status, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByCategory(
		long userGroupId, long categoryId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetUserGroupLessonsByCategory(userGroupId,
			categoryId, status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetUserGroupLessonsByTag(userGroupId, tagId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findFeaturedUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getService()
				   .findFeaturedUserGroupLessons(userGroupId, status, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndUser(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetLessonsByCategoryAndUser(categoryId, userId,
			status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndUser(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetLessonsByTagAndUser(tagId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndFeatured(
		long categoryId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetLessonsByCategoryAndFeatured(categoryId, featured,
			status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndFeatured(
		long tagId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findAssetLessonsByTagAndFeatured(tagId, featured, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findMyFavouriteLessons(
		long userId, java.lang.String status, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getService()
				   .findMyFavouriteLessons(userId, status, orderBy, markedAs,
			start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findMyLessonsWithCollaborations(
		long userId, java.lang.String orderBy, java.lang.String[] markedAs,
		int start, int end) {
		return getService()
				   .findMyLessonsWithCollaborations(userId, orderBy, markedAs,
			start, end);
	}

	public static void deleteObjectivesOfLesson(long lessonId) {
		getService().deleteObjectivesOfLesson(lessonId);
	}

	public static java.lang.Boolean getFavouriteLesson(long userId,
		long lessonId) {
		return getService().getFavouriteLesson(userId, lessonId);
	}

	public static java.util.List<com.nyu.model.Lesson> getFavouriteLessonsByUserId(
		long userId) {
		return getService().getFavouriteLessonsByUserId(userId);
	}

	public static java.util.List<com.nyu.model.Lesson> findLessonsWithCollaborations(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getService()
				   .findLessonsWithCollaborations(status, userId, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.Set<java.lang.Long> findPrivateLessonsIdsBelongToUser(
		long userId) {
		return getService().findPrivateLessonsIdsBelongToUser(userId);
	}

	public static java.util.Set<java.lang.Long> findPrivateLessonsIds(
		java.lang.String[] status) {
		return getService().findPrivateLessonsIds(status);
	}

	public static java.util.List<com.nyu.model.Lesson> getLessonsMarkedAs(
		java.lang.String markedAs, int start, int end) {
		return getService().getLessonsMarkedAs(markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findArchivedMarkedAsLessonsByTag(
		long tagId, java.lang.String markedAs, int start, int end) {
		return getService()
				   .findArchivedMarkedAsLessonsByTag(tagId, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findArchivedMarkedAsLessonsByCategory(
		long categoryId, java.lang.String markedAs, int start, int end) {
		return getService()
				   .findArchivedMarkedAsLessonsByCategory(categoryId, markedAs,
			start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static LessonLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LessonLocalService.class.getName());

			if (invokableLocalService instanceof LessonLocalService) {
				_service = (LessonLocalService)invokableLocalService;
			}
			else {
				_service = new LessonLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LessonLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LessonLocalService service) {
	}

	private static LessonLocalService _service;
}