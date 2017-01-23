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

package com.nyu.service.base;

import com.nyu.service.LessonLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Allwins Rajaiah
 * @generated
 */
public class LessonLocalServiceClpInvoker {
	public LessonLocalServiceClpInvoker() {
		_methodName0 = "addLesson";

		_methodParameterTypes0 = new String[] { "com.nyu.model.Lesson" };

		_methodName1 = "createLesson";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteLesson";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteLesson";

		_methodParameterTypes3 = new String[] { "com.nyu.model.Lesson" };

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchLesson";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "fetchLessonByUuidAndCompanyId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "fetchLessonByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getLesson";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getPersistedModel";

		_methodParameterTypes14 = new String[] { "java.io.Serializable" };

		_methodName15 = "getLessonByUuidAndCompanyId";

		_methodParameterTypes15 = new String[] { "java.lang.String", "long" };

		_methodName16 = "getLessonByUuidAndGroupId";

		_methodParameterTypes16 = new String[] { "java.lang.String", "long" };

		_methodName17 = "getLessons";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "getLessonsCount";

		_methodParameterTypes18 = new String[] {  };

		_methodName19 = "updateLesson";

		_methodParameterTypes19 = new String[] { "com.nyu.model.Lesson" };

		_methodName140 = "getBeanIdentifier";

		_methodParameterTypes140 = new String[] {  };

		_methodName141 = "setBeanIdentifier";

		_methodParameterTypes141 = new String[] { "java.lang.String" };

		_methodName146 = "updateLesson";

		_methodParameterTypes146 = new String[] {
				"com.nyu.model.Lesson",
				"com.liferay.portal.service.ServiceContext", "int",
				"java.lang.String[][]"
			};

		_methodName147 = "getDocumentFileList";

		_methodParameterTypes147 = new String[] { "long" };

		_methodName148 = "getDocumentFile";

		_methodParameterTypes148 = new String[] { "long" };

		_methodName149 = "search";

		_methodParameterTypes149 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName150 = "search";

		_methodParameterTypes150 = new String[] {
				"java.lang.String", "java.lang.String", "long"
			};

		_methodName151 = "launcher";

		_methodParameterTypes151 = new String[] { "java.lang.String", "long" };

		_methodName153 = "getLessonsByStatus";

		_methodParameterTypes153 = new String[] { "java.lang.String", "int", "int" };

		_methodName154 = "getLessonsByPrivacy";

		_methodParameterTypes154 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName155 = "getLessonsByPrivacy";

		_methodParameterTypes155 = new String[] {
				"java.lang.String[][]", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName156 = "getLessonsByCategoryId";

		_methodParameterTypes156 = new String[] { "long" };

		_methodName157 = "addUser";

		_methodParameterTypes157 = new String[] { "long", "long", "long" };

		_methodName158 = "getEntries";

		_methodParameterTypes158 = new String[] { "long" };

		_methodName159 = "getTimeDifference";

		_methodParameterTypes159 = new String[] { "long" };

		_methodName160 = "getLessonsUploadedByAuthor";

		_methodParameterTypes160 = new String[] { "long" };

		_methodName161 = "getLessonsUploadedByAuthorAndStatus";

		_methodParameterTypes161 = new String[] { "long", "java.lang.String" };

		_methodName162 = "findUserAliveLessons";

		_methodParameterTypes162 = new String[] { "long" };

		_methodName163 = "findGroupAliveLessons";

		_methodParameterTypes163 = new String[] { "long" };

		_methodName164 = "getLessonsUploadedByAuthorAndStatus";

		_methodParameterTypes164 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName165 = "getLessonsUploadedByAuthor";

		_methodParameterTypes165 = new String[] { "long", "long" };

		_methodName166 = "findMostFollowedAuthors";

		_methodParameterTypes166 = new String[] {  };

		_methodName167 = "findFollowingAuthors";

		_methodParameterTypes167 = new String[] { "long" };

		_methodName168 = "findLessonByType";

		_methodParameterTypes168 = new String[] { "long", "long", "int" };

		_methodName169 = "findRecentActivity";

		_methodParameterTypes169 = new String[] { "long", "long" };

		_methodName170 = "findLessonActivity";

		_methodParameterTypes170 = new String[] { "long", "long", "long" };

		_methodName171 = "findAndDeleteUserActivity";

		_methodParameterTypes171 = new String[] { "long", "long", "long", "int" };

		_methodName172 = "addSocialActivity";

		_methodParameterTypes172 = new String[] {
				"long", "long", "java.lang.String", "long", "int"
			};

		_methodName173 = "deleteUserSocialActivity";

		_methodParameterTypes173 = new String[] { "long" };

		_methodName174 = "getLessonsByCategoryAndTags";

		_methodParameterTypes174 = new String[] { "java.lang.String", "long" };

		_methodName175 = "getLessonsByCategoryAndTags";

		_methodParameterTypes175 = new String[] {
				"java.lang.String", "long", "long"
			};

		_methodName176 = "performCleanUp";

		_methodParameterTypes176 = new String[] {
				"long", "java.lang.String", "long", "int",
				"java.lang.String[][]"
			};

		_methodName181 = "findAssetLessons";

		_methodParameterTypes181 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName182 = "findAssetFeaturedLessons";

		_methodParameterTypes182 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName183 = "findAssetLessonsByCategory";

		_methodParameterTypes183 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName184 = "findAssetLessonsByTag";

		_methodParameterTypes184 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName185 = "findAssetFeaturedLessonsByTag";

		_methodParameterTypes185 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName186 = "findAssetFeaturedUserGroupLessonsByTag";

		_methodParameterTypes186 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName187 = "findAssetUserGroupLessons";

		_methodParameterTypes187 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName188 = "findAssetUserGroupLessonsByCategory";

		_methodParameterTypes188 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName189 = "findAssetUserGroupLessonsByTag";

		_methodParameterTypes189 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName190 = "findFeaturedUserGroupLessons";

		_methodParameterTypes190 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName191 = "findAssetLessonsByCategoryAndUser";

		_methodParameterTypes191 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName192 = "findAssetLessonsByTagAndUser";

		_methodParameterTypes192 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName193 = "findAssetLessonsByCategoryAndFeatured";

		_methodParameterTypes193 = new String[] {
				"long", "boolean", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName194 = "findAssetLessonsByTagAndFeatured";

		_methodParameterTypes194 = new String[] {
				"long", "boolean", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName195 = "findMyFavouriteLessons";

		_methodParameterTypes195 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String[][]", "int", "int"
			};

		_methodName196 = "findMyLessonsWithCollaborations";

		_methodParameterTypes196 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName197 = "deleteObjectivesOfLesson";

		_methodParameterTypes197 = new String[] { "long" };

		_methodName198 = "getFavouriteLesson";

		_methodParameterTypes198 = new String[] { "long", "long" };

		_methodName199 = "getFavouriteLessonsByUserId";

		_methodParameterTypes199 = new String[] { "long" };

		_methodName200 = "findLessonsWithCollaborations";

		_methodParameterTypes200 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName201 = "findPrivateLessonsIdsBelongToUser";

		_methodParameterTypes201 = new String[] { "long" };

		_methodName202 = "findPrivateLessonsIds";

		_methodParameterTypes202 = new String[] { "java.lang.String[][]" };

		_methodName203 = "getLessonsMarkedAs";

		_methodParameterTypes203 = new String[] { "java.lang.String", "int", "int" };

		_methodName204 = "findArchivedMarkedAsLessonsByTag";

		_methodParameterTypes204 = new String[] {
				"long", "java.lang.String", "int", "int"
			};

		_methodName205 = "findArchivedMarkedAsLessonsByCategory";

		_methodParameterTypes205 = new String[] {
				"long", "java.lang.String", "int", "int"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return LessonLocalServiceUtil.addLesson((com.nyu.model.Lesson)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return LessonLocalServiceUtil.createLesson(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return LessonLocalServiceUtil.deleteLesson(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return LessonLocalServiceUtil.deleteLesson((com.nyu.model.Lesson)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return LessonLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return LessonLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return LessonLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return LessonLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return LessonLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return LessonLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return LessonLocalServiceUtil.fetchLesson(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return LessonLocalServiceUtil.fetchLessonByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return LessonLocalServiceUtil.fetchLessonByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return LessonLocalServiceUtil.getLesson(((Long)arguments[0]).longValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return LessonLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return LessonLocalServiceUtil.getLessons(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsCount();
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			return LessonLocalServiceUtil.updateLesson((com.nyu.model.Lesson)arguments[0]);
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			return LessonLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			LessonLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return LessonLocalServiceUtil.updateLesson((com.nyu.model.Lesson)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1],
				((Integer)arguments[2]).intValue(),
				(java.lang.String[])arguments[3]);
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			return LessonLocalServiceUtil.getDocumentFileList(((Long)arguments[0]).longValue());
		}

		if (_methodName148.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes148, parameterTypes)) {
			return LessonLocalServiceUtil.getDocumentFile(((Long)arguments[0]).longValue());
		}

		if (_methodName149.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes149, parameterTypes)) {
			return LessonLocalServiceUtil.search((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return LessonLocalServiceUtil.search((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			return LessonLocalServiceUtil.launcher((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByStatus((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByPrivacy((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByPrivacy((java.lang.String[])arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByCategoryId(((Long)arguments[0]).longValue());
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			LessonLocalServiceUtil.addUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());

			return null;
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return LessonLocalServiceUtil.getEntries(((Long)arguments[0]).longValue());
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return LessonLocalServiceUtil.getTimeDifference(((Long)arguments[0]).longValue());
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthor(((Long)arguments[0]).longValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthorAndStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return LessonLocalServiceUtil.findUserAliveLessons(((Long)arguments[0]).longValue());
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return LessonLocalServiceUtil.findGroupAliveLessons(((Long)arguments[0]).longValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthorAndStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthor(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return LessonLocalServiceUtil.findMostFollowedAuthors();
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return LessonLocalServiceUtil.findFollowingAuthors(((Long)arguments[0]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return LessonLocalServiceUtil.findLessonByType(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return LessonLocalServiceUtil.findRecentActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return LessonLocalServiceUtil.findLessonActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			LessonLocalServiceUtil.findAndDeleteUserActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue());

			return null;
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			LessonLocalServiceUtil.addSocialActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				((Integer)arguments[4]).intValue());

			return null;
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			LessonLocalServiceUtil.deleteUserSocialActivity(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByCategoryAndTags((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByCategoryAndTags((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			LessonLocalServiceUtil.performCleanUp(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				(java.lang.String[])arguments[4]);

			return null;
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessons((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetFeaturedLessons((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByCategory(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByTag(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetFeaturedLessonsByTag(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetFeaturedUserGroupLessonsByTag(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetUserGroupLessons(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetUserGroupLessonsByCategory(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetUserGroupLessonsByTag(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return LessonLocalServiceUtil.findFeaturedUserGroupLessons(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByCategoryAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByTagAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByCategoryAndFeatured(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByTagAndFeatured(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return LessonLocalServiceUtil.findMyFavouriteLessons(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return LessonLocalServiceUtil.findMyLessonsWithCollaborations(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.String[])arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			LessonLocalServiceUtil.deleteObjectivesOfLesson(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return LessonLocalServiceUtil.getFavouriteLesson(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return LessonLocalServiceUtil.getFavouriteLessonsByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			return LessonLocalServiceUtil.findLessonsWithCollaborations((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return LessonLocalServiceUtil.findPrivateLessonsIdsBelongToUser(((Long)arguments[0]).longValue());
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return LessonLocalServiceUtil.findPrivateLessonsIds((java.lang.String[])arguments[0]);
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsMarkedAs((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return LessonLocalServiceUtil.findArchivedMarkedAsLessonsByTag(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName205.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
			return LessonLocalServiceUtil.findArchivedMarkedAsLessonsByCategory(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName146;
	private String[] _methodParameterTypes146;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName148;
	private String[] _methodParameterTypes148;
	private String _methodName149;
	private String[] _methodParameterTypes149;
	private String _methodName150;
	private String[] _methodParameterTypes150;
	private String _methodName151;
	private String[] _methodParameterTypes151;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
	private String _methodName167;
	private String[] _methodParameterTypes167;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
	private String _methodName183;
	private String[] _methodParameterTypes183;
	private String _methodName184;
	private String[] _methodParameterTypes184;
	private String _methodName185;
	private String[] _methodParameterTypes185;
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName188;
	private String[] _methodParameterTypes188;
	private String _methodName189;
	private String[] _methodParameterTypes189;
	private String _methodName190;
	private String[] _methodParameterTypes190;
	private String _methodName191;
	private String[] _methodParameterTypes191;
	private String _methodName192;
	private String[] _methodParameterTypes192;
	private String _methodName193;
	private String[] _methodParameterTypes193;
	private String _methodName194;
	private String[] _methodParameterTypes194;
	private String _methodName195;
	private String[] _methodParameterTypes195;
	private String _methodName196;
	private String[] _methodParameterTypes196;
	private String _methodName197;
	private String[] _methodParameterTypes197;
	private String _methodName198;
	private String[] _methodParameterTypes198;
	private String _methodName199;
	private String[] _methodParameterTypes199;
	private String _methodName200;
	private String[] _methodParameterTypes200;
	private String _methodName201;
	private String[] _methodParameterTypes201;
	private String _methodName202;
	private String[] _methodParameterTypes202;
	private String _methodName203;
	private String[] _methodParameterTypes203;
	private String _methodName204;
	private String[] _methodParameterTypes204;
	private String _methodName205;
	private String[] _methodParameterTypes205;
}