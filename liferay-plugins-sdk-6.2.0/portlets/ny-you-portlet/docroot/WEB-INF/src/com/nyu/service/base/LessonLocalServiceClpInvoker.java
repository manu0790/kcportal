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

		_methodName146 = "getLessonById";

		_methodParameterTypes146 = new String[] { "long" };

		_methodName147 = "updateLesson";

		_methodParameterTypes147 = new String[] {
				"com.nyu.model.Lesson",
				"com.liferay.portal.service.ServiceContext", "int",
				"java.lang.String[][]"
			};

		_methodName148 = "updateLessonByModel";

		_methodParameterTypes148 = new String[] { "com.nyu.model.Lesson" };

		_methodName149 = "updateLessonStatusById";

		_methodParameterTypes149 = new String[] { "long" };

		_methodName150 = "getDocumentFileList";

		_methodParameterTypes150 = new String[] { "long" };

		_methodName151 = "getDocumentFile";

		_methodParameterTypes151 = new String[] { "long" };

		_methodName152 = "search";

		_methodParameterTypes152 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName153 = "search";

		_methodParameterTypes153 = new String[] {
				"java.lang.String", "java.lang.String", "long"
			};

		_methodName154 = "launcher";

		_methodParameterTypes154 = new String[] { "java.lang.String", "long" };

		_methodName156 = "getLessonsByStatus";

		_methodParameterTypes156 = new String[] { "java.lang.String", "int", "int" };

		_methodName157 = "getLessonsByPrivacy";

		_methodParameterTypes157 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName158 = "getLessonsByPrivacy";

		_methodParameterTypes158 = new String[] {
				"java.lang.String[][]", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName159 = "getLessonsByCategoryId";

		_methodParameterTypes159 = new String[] { "long" };

		_methodName160 = "addUser";

		_methodParameterTypes160 = new String[] { "long", "long", "long" };

		_methodName161 = "getEntries";

		_methodParameterTypes161 = new String[] { "long" };

		_methodName162 = "getTimeDifference";

		_methodParameterTypes162 = new String[] { "long" };

		_methodName163 = "getLessonsUploadedByAuthor";

		_methodParameterTypes163 = new String[] { "long" };

		_methodName164 = "getLessonsUploadedByAuthorAndStatus";

		_methodParameterTypes164 = new String[] { "long", "java.lang.String" };

		_methodName165 = "findUserAliveLessons";

		_methodParameterTypes165 = new String[] { "long" };

		_methodName166 = "findGroupAliveLessons";

		_methodParameterTypes166 = new String[] { "long" };

		_methodName167 = "getLessonsUploadedByAuthorAndStatus";

		_methodParameterTypes167 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName168 = "getLessonsUploadedByAuthor";

		_methodParameterTypes168 = new String[] { "long", "long" };

		_methodName169 = "findMostFollowedAuthors";

		_methodParameterTypes169 = new String[] {  };

		_methodName170 = "findFollowingAuthors";

		_methodParameterTypes170 = new String[] { "long" };

		_methodName171 = "findLessonByType";

		_methodParameterTypes171 = new String[] { "long", "long", "int" };

		_methodName172 = "findRecentActivity";

		_methodParameterTypes172 = new String[] { "long", "long" };

		_methodName173 = "findLessonActivity";

		_methodParameterTypes173 = new String[] { "long", "long", "long" };

		_methodName174 = "findAndDeleteUserActivity";

		_methodParameterTypes174 = new String[] { "long", "long", "long", "int" };

		_methodName175 = "addSocialActivity";

		_methodParameterTypes175 = new String[] {
				"long", "long", "java.lang.String", "long", "int"
			};

		_methodName176 = "deleteUserSocialActivity";

		_methodParameterTypes176 = new String[] { "long" };

		_methodName177 = "getLessonsByCategoryAndTags";

		_methodParameterTypes177 = new String[] { "java.lang.String", "long" };

		_methodName178 = "getLessonsByCategoryAndTags";

		_methodParameterTypes178 = new String[] {
				"java.lang.String", "long", "long"
			};

		_methodName179 = "performCleanUp";

		_methodParameterTypes179 = new String[] {
				"long", "java.lang.String", "long", "int",
				"java.lang.String[][]"
			};

		_methodName184 = "findAssetLessons";

		_methodParameterTypes184 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName185 = "findAssetFeaturedLessons";

		_methodParameterTypes185 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName186 = "findAssetLessonsByCategory";

		_methodParameterTypes186 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName187 = "findAssetLessonsByTag";

		_methodParameterTypes187 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName188 = "findAssetFeaturedLessonsByTag";

		_methodParameterTypes188 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName189 = "findAssetFeaturedUserGroupLessonsByTag";

		_methodParameterTypes189 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName190 = "findAssetUserGroupLessons";

		_methodParameterTypes190 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName191 = "findAssetUserGroupLessonsByCategory";

		_methodParameterTypes191 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName192 = "findAssetUserGroupLessonsByTag";

		_methodParameterTypes192 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName193 = "findFeaturedUserGroupLessons";

		_methodParameterTypes193 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName194 = "findAssetLessonsByCategoryAndUser";

		_methodParameterTypes194 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName195 = "findAssetLessonsByTagAndUser";

		_methodParameterTypes195 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName196 = "findAssetLessonsByCategoryAndFeatured";

		_methodParameterTypes196 = new String[] {
				"long", "boolean", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName197 = "findAssetLessonsByTagAndFeatured";

		_methodParameterTypes197 = new String[] {
				"long", "boolean", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName198 = "findMyFavouriteLessons";

		_methodParameterTypes198 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String[][]", "int", "int"
			};

		_methodName199 = "findMyLessonsWithCollaborations";

		_methodParameterTypes199 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName200 = "deleteObjectivesOfLesson";

		_methodParameterTypes200 = new String[] { "long" };

		_methodName201 = "getFavouriteLesson";

		_methodParameterTypes201 = new String[] { "long", "long" };

		_methodName202 = "getFavouriteLessonsByUserId";

		_methodParameterTypes202 = new String[] { "long" };

		_methodName203 = "findLessonsWithCollaborations";

		_methodParameterTypes203 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName204 = "findPrivateLessonsIdsBelongToUser";

		_methodParameterTypes204 = new String[] { "long" };

		_methodName205 = "findPrivateLessonsIds";

		_methodParameterTypes205 = new String[] { "java.lang.String[][]" };

		_methodName206 = "getLessonsMarkedAs";

		_methodParameterTypes206 = new String[] { "java.lang.String", "int", "int" };

		_methodName207 = "findArchivedMarkedAsLessonsByTag";

		_methodParameterTypes207 = new String[] {
				"long", "java.lang.String", "int", "int"
			};

		_methodName208 = "findArchivedMarkedAsLessonsByCategory";

		_methodParameterTypes208 = new String[] {
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
			return LessonLocalServiceUtil.getLessonById(((Long)arguments[0]).longValue());
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			return LessonLocalServiceUtil.updateLesson((com.nyu.model.Lesson)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1],
				((Integer)arguments[2]).intValue(),
				(java.lang.String[])arguments[3]);
		}

		if (_methodName148.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes148, parameterTypes)) {
			return LessonLocalServiceUtil.updateLessonByModel((com.nyu.model.Lesson)arguments[0]);
		}

		if (_methodName149.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes149, parameterTypes)) {
			return LessonLocalServiceUtil.updateLessonStatusById(((Long)arguments[0]).longValue());
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return LessonLocalServiceUtil.getDocumentFileList(((Long)arguments[0]).longValue());
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			return LessonLocalServiceUtil.getDocumentFile(((Long)arguments[0]).longValue());
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return LessonLocalServiceUtil.search((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return LessonLocalServiceUtil.search((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return LessonLocalServiceUtil.launcher((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByStatus((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByPrivacy((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByPrivacy((java.lang.String[])arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByCategoryId(((Long)arguments[0]).longValue());
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			LessonLocalServiceUtil.addUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());

			return null;
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return LessonLocalServiceUtil.getEntries(((Long)arguments[0]).longValue());
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return LessonLocalServiceUtil.getTimeDifference(((Long)arguments[0]).longValue());
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthor(((Long)arguments[0]).longValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthorAndStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return LessonLocalServiceUtil.findUserAliveLessons(((Long)arguments[0]).longValue());
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return LessonLocalServiceUtil.findGroupAliveLessons(((Long)arguments[0]).longValue());
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthorAndStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], ((Long)arguments[2]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsUploadedByAuthor(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return LessonLocalServiceUtil.findMostFollowedAuthors();
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return LessonLocalServiceUtil.findFollowingAuthors(((Long)arguments[0]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return LessonLocalServiceUtil.findLessonByType(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return LessonLocalServiceUtil.findRecentActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return LessonLocalServiceUtil.findLessonActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			LessonLocalServiceUtil.findAndDeleteUserActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue());

			return null;
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			LessonLocalServiceUtil.addSocialActivity(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				((Integer)arguments[4]).intValue());

			return null;
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			LessonLocalServiceUtil.deleteUserSocialActivity(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByCategoryAndTags((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsByCategoryAndTags((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			LessonLocalServiceUtil.performCleanUp(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				(java.lang.String[])arguments[4]);

			return null;
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessons((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetFeaturedLessons((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByCategory(((Long)arguments[0]).longValue(),
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
			return LessonLocalServiceUtil.findAssetLessonsByTag(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetFeaturedLessonsByTag(((Long)arguments[0]).longValue(),
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
			return LessonLocalServiceUtil.findAssetFeaturedUserGroupLessonsByTag(((Long)arguments[0]).longValue(),
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
			return LessonLocalServiceUtil.findAssetUserGroupLessons(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetUserGroupLessonsByCategory(((Long)arguments[0]).longValue(),
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
			return LessonLocalServiceUtil.findAssetUserGroupLessonsByTag(((Long)arguments[0]).longValue(),
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
			return LessonLocalServiceUtil.findFeaturedUserGroupLessons(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByCategoryAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByTagAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByCategoryAndFeatured(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName197.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes197, parameterTypes)) {
			return LessonLocalServiceUtil.findAssetLessonsByTagAndFeatured(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				(java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				(java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return LessonLocalServiceUtil.findMyFavouriteLessons(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String[])arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return LessonLocalServiceUtil.findMyLessonsWithCollaborations(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.String[])arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			LessonLocalServiceUtil.deleteObjectivesOfLesson(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return LessonLocalServiceUtil.getFavouriteLesson(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return LessonLocalServiceUtil.getFavouriteLessonsByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return LessonLocalServiceUtil.findLessonsWithCollaborations((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2],
				(java.lang.String)arguments[3],
				(java.lang.String[])arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return LessonLocalServiceUtil.findPrivateLessonsIdsBelongToUser(((Long)arguments[0]).longValue());
		}

		if (_methodName205.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
			return LessonLocalServiceUtil.findPrivateLessonsIds((java.lang.String[])arguments[0]);
		}

		if (_methodName206.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes206, parameterTypes)) {
			return LessonLocalServiceUtil.getLessonsMarkedAs((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName207.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes207, parameterTypes)) {
			return LessonLocalServiceUtil.findArchivedMarkedAsLessonsByTag(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName208.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
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
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
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
	private String _methodName177;
	private String[] _methodParameterTypes177;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
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
	private String _methodName206;
	private String[] _methodParameterTypes206;
	private String _methodName207;
	private String[] _methodParameterTypes207;
	private String _methodName208;
	private String[] _methodParameterTypes208;
}