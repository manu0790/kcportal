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

/**
 * @author Allwins Rajaiah
 */
public interface LessonFinder {
	public java.util.Map<java.lang.Long, java.lang.Long> findMostFollowedAuthors();

	public java.util.Map<java.lang.Long, java.lang.Long> findFollowingAuthors(
		long userId1);

	public java.util.Map<java.lang.Long, java.lang.Long> findLessonByType(
		long clasNameId, long lessonId, int type);

	public java.util.Map<java.lang.Long, java.lang.Long> findRecentActivity(
		long clasNameId, long userId);

	public java.util.Map<java.lang.Long, java.lang.Long> findLessonActivity(
		long clasNameId, long classPK, long userId);

	public void findAndDeleteUserActivity(long userId, long clasPk,
		long createdDate, int type);

	public void findAndDeleteUserActivityByType(long userId, long clasPk,
		long createdDate, int type);

	public java.util.List<com.nyu.model.Lesson> findAssetLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end);

	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end);

	public java.util.List<com.nyu.model.Lesson> findLessonsWithCollaborations(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end);

	public java.util.Set<java.lang.Long> findPrivateLessonsIdsBelongToUser(
		long userId);

	public java.util.Set<java.lang.Long> findPrivateLessonsIds(
		java.lang.String[] privacy);

	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategory(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end);

	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByCategory(
		long userGroupId, long categoryId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetMarkedAsLessonsByTag(
		long tagId, java.lang.String markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetMarkedAsLessonsByCategory(
		long categoryId, java.lang.String markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findFeaturedUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end);

	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndUser(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndUser(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndFeatured(
		long categoryId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndFeatured(
		long tagId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public java.util.List<com.nyu.model.Lesson> findMyLessonsWithCollaborations(
		long userId, java.lang.String orderBy, java.lang.String[] markedAs,
		int start, int end);

	public java.util.List<com.nyu.model.Lesson> findMyFavouriteLessons(
		long userId, java.lang.String status, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end);

	public void deleteObjectivesOfLesson(long lessonId);

	public void deleteSectionOfLesson(long lessonId);

	public void deleteCollaborationOfLesson(long lessonId);

	public void deleteFavouriteLesson(long lessonId);

	public java.util.List<com.nyu.model.DocumentFile> findResourceDocumentsWithPermission(
		java.lang.String resourceType, java.lang.String status,
		java.lang.String[] permission);

	public java.util.Set<java.lang.Long> findResourceDocumentsIdsWithPermission(
		java.lang.String resourceType, java.lang.String[] permission,
		long lessonId);
}