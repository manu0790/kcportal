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
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Allwins Rajaiah
 */
public class LessonFinderUtil {
	public static java.util.Map<java.lang.Long, java.lang.Long> findMostFollowedAuthors() {
		return getFinder().findMostFollowedAuthors();
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findFollowingAuthors(
		long userId1) {
		return getFinder().findFollowingAuthors(userId1);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findLessonByType(
		long clasNameId, long lessonId, int type) {
		return getFinder().findLessonByType(clasNameId, lessonId, type);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findRecentActivity(
		long clasNameId, long userId) {
		return getFinder().findRecentActivity(clasNameId, userId);
	}

	public static java.util.Map<java.lang.Long, java.lang.Long> findLessonActivity(
		long clasNameId, long classPK, long userId) {
		return getFinder().findLessonActivity(clasNameId, classPK, userId);
	}

	public static void findAndDeleteUserActivity(long userId, long clasPk,
		long createdDate, int type) {
		getFinder().findAndDeleteUserActivity(userId, clasPk, createdDate, type);
	}

	public static void findAndDeleteUserActivityByType(long userId,
		long clasPk, long createdDate, int type) {
		getFinder()
			.findAndDeleteUserActivityByType(userId, clasPk, createdDate, type);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getFinder()
				   .findAssetLessons(status, userId, privacy, orderBy,
			markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getFinder()
				   .findAssetFeaturedLessons(status, userId, privacy, orderBy,
			markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findLessonsWithCollaborations(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getFinder()
				   .findLessonsWithCollaborations(status, userId, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.Set<java.lang.Long> findPrivateLessonsIdsBelongToUser(
		long userId) {
		return getFinder().findPrivateLessonsIdsBelongToUser(userId);
	}

	public static java.util.Set<java.lang.Long> findPrivateLessonsIds(
		java.lang.String[] privacy) {
		return getFinder().findPrivateLessonsIds(privacy);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategory(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetLessonsByCategory(categoryId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetLessonsByTag(tagId, userId, status, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetFeaturedLessonsByTag(tagId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getFinder()
				   .findAssetUserGroupLessons(userGroupId, status, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByCategory(
		long userGroupId, long categoryId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetUserGroupLessonsByCategory(userGroupId,
			categoryId, status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetMarkedAsLessonsByTag(
		long tagId, java.lang.String markedAs, int start, int end) {
		return getFinder()
				   .findAssetMarkedAsLessonsByTag(tagId, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetMarkedAsLessonsByCategory(
		long categoryId, java.lang.String markedAs, int start, int end) {
		return getFinder()
				   .findAssetMarkedAsLessonsByCategory(categoryId, markedAs,
			start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetUserGroupLessonsByTag(userGroupId, tagId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetFeaturedUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetFeaturedUserGroupLessonsByTag(userGroupId, tagId,
			status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findFeaturedUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		return getFinder()
				   .findFeaturedUserGroupLessons(userGroupId, status, privacy,
			orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndUser(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetLessonsByCategoryAndUser(categoryId, userId,
			status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndUser(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetLessonsByTagAndUser(tagId, userId, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndFeatured(
		long categoryId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetLessonsByCategoryAndFeatured(categoryId, featured,
			status, privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndFeatured(
		long tagId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findAssetLessonsByTagAndFeatured(tagId, featured, status,
			privacy, orderBy, markedAs, start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findMyLessonsWithCollaborations(
		long userId, java.lang.String orderBy, java.lang.String[] markedAs,
		int start, int end) {
		return getFinder()
				   .findMyLessonsWithCollaborations(userId, orderBy, markedAs,
			start, end);
	}

	public static java.util.List<com.nyu.model.Lesson> findMyFavouriteLessons(
		long userId, java.lang.String status, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		return getFinder()
				   .findMyFavouriteLessons(userId, status, orderBy, markedAs,
			start, end);
	}

	public static void deleteObjectivesOfLesson(long lessonId) {
		getFinder().deleteObjectivesOfLesson(lessonId);
	}

	public static void deleteSectionOfLesson(long lessonId) {
		getFinder().deleteSectionOfLesson(lessonId);
	}

	public static void deleteCollaborationOfLesson(long lessonId) {
		getFinder().deleteCollaborationOfLesson(lessonId);
	}

	public static void deleteFavouriteLesson(long lessonId) {
		getFinder().deleteFavouriteLesson(lessonId);
	}

	public static java.util.List<com.nyu.model.DocumentFile> findResourceDocumentsWithPermission(
		java.lang.String resourceType, java.lang.String status,
		java.lang.String[] permission) {
		return getFinder()
				   .findResourceDocumentsWithPermission(resourceType, status,
			permission);
	}

	public static java.util.Set<java.lang.Long> findResourceDocumentsIdsWithPermission(
		java.lang.String resourceType, java.lang.String[] permission,
		long lessonId) {
		return getFinder()
				   .findResourceDocumentsIdsWithPermission(resourceType,
			permission, lessonId);
	}

	public static LessonFinder getFinder() {
		if (_finder == null) {
			_finder = (LessonFinder)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					LessonFinder.class.getName());

			ReferenceRegistry.registerReference(LessonFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(LessonFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(LessonFinderUtil.class, "_finder");
	}

	private static LessonFinder _finder;
}