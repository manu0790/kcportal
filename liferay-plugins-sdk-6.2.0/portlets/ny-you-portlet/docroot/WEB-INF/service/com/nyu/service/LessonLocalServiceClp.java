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

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author Allwins Rajaiah
 * @generated
 */
public class LessonLocalServiceClp implements LessonLocalService {
	public LessonLocalServiceClp(InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

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

		_methodName20 = "getBeanIdentifier";

		_methodParameterTypes20 = new String[] {  };

		_methodName21 = "setBeanIdentifier";

		_methodParameterTypes21 = new String[] { "java.lang.String" };

		_methodName23 = "updateLesson";

		_methodParameterTypes23 = new String[] {
				"com.nyu.model.Lesson",
				"com.liferay.portal.service.ServiceContext", "int",
				"java.lang.String[][]"
			};

		_methodName24 = "getDocumentFileList";

		_methodParameterTypes24 = new String[] { "long" };

		_methodName25 = "getDocumentFile";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "search";

		_methodParameterTypes26 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName27 = "search";

		_methodParameterTypes27 = new String[] {
				"java.lang.String", "java.lang.String", "long"
			};

		_methodName28 = "launcher";

		_methodParameterTypes28 = new String[] { "java.lang.String", "long" };

		_methodName29 = "getLessonsByStatus";

		_methodParameterTypes29 = new String[] { "java.lang.String", "int", "int" };

		_methodName30 = "getLessonsByPrivacy";

		_methodParameterTypes30 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName31 = "getLessonsByPrivacy";

		_methodParameterTypes31 = new String[] {
				"java.lang.String[][]", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName32 = "getLessonsByCategoryId";

		_methodParameterTypes32 = new String[] { "long" };

		_methodName33 = "addUser";

		_methodParameterTypes33 = new String[] { "long", "long", "long" };

		_methodName34 = "getEntries";

		_methodParameterTypes34 = new String[] { "long" };

		_methodName35 = "getTimeDifference";

		_methodParameterTypes35 = new String[] { "long" };

		_methodName36 = "getLessonsUploadedByAuthor";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "getLessonsUploadedByAuthorAndStatus";

		_methodParameterTypes37 = new String[] { "long", "java.lang.String" };

		_methodName38 = "findUserAliveLessons";

		_methodParameterTypes38 = new String[] { "long" };

		_methodName39 = "findGroupAliveLessons";

		_methodParameterTypes39 = new String[] { "long" };

		_methodName40 = "getLessonsUploadedByAuthorAndStatus";

		_methodParameterTypes40 = new String[] {
				"long", "java.lang.String", "long"
			};

		_methodName41 = "getLessonsUploadedByAuthor";

		_methodParameterTypes41 = new String[] { "long", "long" };

		_methodName42 = "findMostFollowedAuthors";

		_methodParameterTypes42 = new String[] {  };

		_methodName43 = "findFollowingAuthors";

		_methodParameterTypes43 = new String[] { "long" };

		_methodName44 = "findLessonByType";

		_methodParameterTypes44 = new String[] { "long", "long", "int" };

		_methodName45 = "findRecentActivity";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "findLessonActivity";

		_methodParameterTypes46 = new String[] { "long", "long", "long" };

		_methodName47 = "findAndDeleteUserActivity";

		_methodParameterTypes47 = new String[] { "long", "long", "long", "int" };

		_methodName48 = "addSocialActivity";

		_methodParameterTypes48 = new String[] {
				"long", "long", "java.lang.String", "long", "int"
			};

		_methodName49 = "deleteUserSocialActivity";

		_methodParameterTypes49 = new String[] { "long" };

		_methodName50 = "getLessonsByCategoryAndTags";

		_methodParameterTypes50 = new String[] { "java.lang.String", "long" };

		_methodName51 = "getLessonsByCategoryAndTags";

		_methodParameterTypes51 = new String[] {
				"java.lang.String", "long", "long"
			};

		_methodName52 = "performCleanUp";

		_methodParameterTypes52 = new String[] {
				"long", "java.lang.String", "long", "int",
				"java.lang.String[][]"
			};

		_methodName53 = "findAssetLessons";

		_methodParameterTypes53 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName54 = "findAssetFeaturedLessons";

		_methodParameterTypes54 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName55 = "findAssetLessonsByCategory";

		_methodParameterTypes55 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName56 = "findAssetLessonsByTag";

		_methodParameterTypes56 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName57 = "findAssetFeaturedLessonsByTag";

		_methodParameterTypes57 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName58 = "findAssetFeaturedUserGroupLessonsByTag";

		_methodParameterTypes58 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName59 = "findAssetUserGroupLessons";

		_methodParameterTypes59 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName60 = "findAssetUserGroupLessonsByCategory";

		_methodParameterTypes60 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName61 = "findAssetUserGroupLessonsByTag";

		_methodParameterTypes61 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName62 = "findFeaturedUserGroupLessons";

		_methodParameterTypes62 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName63 = "findAssetLessonsByCategoryAndUser";

		_methodParameterTypes63 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName64 = "findAssetLessonsByTagAndUser";

		_methodParameterTypes64 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName65 = "findAssetLessonsByCategoryAndFeatured";

		_methodParameterTypes65 = new String[] {
				"long", "boolean", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName66 = "findAssetLessonsByTagAndFeatured";

		_methodParameterTypes66 = new String[] {
				"long", "boolean", "java.lang.String", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName67 = "findMyFavouriteLessons";

		_methodParameterTypes67 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String[][]", "int", "int"
			};

		_methodName68 = "findMyLessonsWithCollaborations";

		_methodParameterTypes68 = new String[] {
				"long", "java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName69 = "deleteObjectivesOfLesson";

		_methodParameterTypes69 = new String[] { "long" };

		_methodName70 = "getFavouriteLesson";

		_methodParameterTypes70 = new String[] { "long", "long" };

		_methodName71 = "getFavouriteLessonsByUserId";

		_methodParameterTypes71 = new String[] { "long" };

		_methodName72 = "findLessonsWithCollaborations";

		_methodParameterTypes72 = new String[] {
				"java.lang.String", "long", "java.lang.String[][]",
				"java.lang.String", "java.lang.String[][]", "int", "int"
			};

		_methodName73 = "findPrivateLessonsIdsBelongToUser";

		_methodParameterTypes73 = new String[] { "long" };

		_methodName74 = "findPrivateLessonsIds";

		_methodParameterTypes74 = new String[] { "java.lang.String[][]" };

		_methodName75 = "getLessonsMarkedAs";

		_methodParameterTypes75 = new String[] { "java.lang.String", "int", "int" };

		_methodName76 = "findArchivedMarkedAsLessonsByTag";

		_methodParameterTypes76 = new String[] {
				"long", "java.lang.String", "int", "int"
			};

		_methodName77 = "findArchivedMarkedAsLessonsByCategory";

		_methodParameterTypes77 = new String[] {
				"long", "java.lang.String", "int", "int"
			};
	}

	@Override
	public com.nyu.model.Lesson addLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(lesson) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson createLesson(long lessonId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson deleteLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson deleteLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(lesson) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public com.nyu.model.Lesson fetchLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson fetchLessonByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson fetchLessonByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson getLesson(long lessonId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson getLessonByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson getLessonByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessons(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getLessonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.nyu.model.Lesson updateLesson(com.nyu.model.Lesson lesson)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { ClpSerializer.translateInput(lesson) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName21,
				_methodParameterTypes21,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.nyu.model.Lesson updateLesson(com.nyu.model.Lesson lesson,
		com.liferay.portal.service.ServiceContext serviceContext, int type,
		java.lang.String[] unpublishDocIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] {
						ClpSerializer.translateInput(lesson),
						
					ClpSerializer.translateInput(serviceContext),
						
					type,
						
					ClpSerializer.translateInput(unpublishDocIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.DocumentFile> getDocumentFileList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.DocumentFile>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.DocumentFile getDocumentFile(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.DocumentFile)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> search(
		java.lang.String searchText, java.lang.String searchType)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26,
					new Object[] {
						ClpSerializer.translateInput(searchText),
						
					ClpSerializer.translateInput(searchType)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> search(
		java.lang.String searchText, java.lang.String searchType, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						ClpSerializer.translateInput(searchText),
						
					ClpSerializer.translateInput(searchType),
						
					companyId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String launcher(java.lang.String key, long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] { ClpSerializer.translateInput(key), lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByStatus(
		java.lang.String status, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						ClpSerializer.translateInput(status),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByPrivacy(
		java.lang.String lessonPrivacy, java.lang.String orderBy,
		java.lang.String orderByType, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
					new Object[] {
						ClpSerializer.translateInput(lessonPrivacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(orderByType),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByPrivacy(
		java.lang.String[] lessonPrivacy, java.lang.String orderBy,
		java.lang.String orderByType, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] {
						ClpSerializer.translateInput(lessonPrivacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(orderByType),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32, new Object[] { categoryId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void addUser(long userId, long lessionId, long groupId) {
		try {
			_invokableLocalService.invokeMethod(_methodName33,
				_methodParameterTypes33,
				new Object[] { userId, lessionId, groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.util.List<com.liferay.portlet.asset.model.AssetEntry> getEntries(
		long lessonId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.portlet.asset.model.AssetEntry>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getTimeDifference(long diff) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName35,
					_methodParameterTypes35, new Object[] { diff });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthor(
		long authorId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName36,
					_methodParameterTypes36, new Object[] { authorId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthorAndStatus(
		long authorId, java.lang.String status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName37,
					_methodParameterTypes37,
					new Object[] { authorId, ClpSerializer.translateInput(
							status) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findUserAliveLessons(
		long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName38,
					_methodParameterTypes38, new Object[] { userId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findGroupAliveLessons(
		long groupId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName39,
					_methodParameterTypes39, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsUploadedByAuthorAndStatus(
		long authorId, java.lang.String status, long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName40,
					_methodParameterTypes40,
					new Object[] {
						authorId,
						
					ClpSerializer.translateInput(status),
						
					userId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.nyu.model.Lesson getLessonsUploadedByAuthor(long lessonId,
		long authorId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName41,
					_methodParameterTypes41, new Object[] { lessonId, authorId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.nyu.model.Lesson)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findMostFollowedAuthors() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName42,
					_methodParameterTypes42, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Map<java.lang.Long, java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findFollowingAuthors(
		long userId1) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName43,
					_methodParameterTypes43, new Object[] { userId1 });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Map<java.lang.Long, java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findLessonByType(
		long clasNameId, long lessonId, int type) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName44,
					_methodParameterTypes44,
					new Object[] { clasNameId, lessonId, type });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Map<java.lang.Long, java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findRecentActivity(
		long clasNameId, long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName45,
					_methodParameterTypes45, new Object[] { clasNameId, userId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Map<java.lang.Long, java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.Long> findLessonActivity(
		long clasNameId, long classPK, long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName46,
					_methodParameterTypes46,
					new Object[] { clasNameId, classPK, userId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Map<java.lang.Long, java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void findAndDeleteUserActivity(long userId, long clasPk,
		long createdDate, int type) {
		try {
			_invokableLocalService.invokeMethod(_methodName47,
				_methodParameterTypes47,
				new Object[] { userId, clasPk, createdDate, type });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addSocialActivity(long userId, long groupId,
		java.lang.String cls, long classPk, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName48,
				_methodParameterTypes48,
				new Object[] {
					userId,
					
				groupId,
					
				ClpSerializer.translateInput(cls),
					
				classPk,
					
				type
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteUserSocialActivity(long activityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName49,
				_methodParameterTypes49, new Object[] { activityId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.util.Set<com.nyu.model.Lesson> getLessonsByCategoryAndTags(
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName50,
					_methodParameterTypes50,
					new Object[] {
						ClpSerializer.translateInput(className),
						
					classPK
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Set<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Set<com.nyu.model.Lesson> getLessonsByCategoryAndTags(
		java.lang.String className, long classPK, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName51,
					_methodParameterTypes51,
					new Object[] {
						ClpSerializer.translateInput(className),
						
					classPK,
						
					userId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Set<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void performCleanUp(long lessonId, java.lang.String funType,
		long userId, int type, java.lang.String[] unpublishDocIds) {
		try {
			_invokableLocalService.invokeMethod(_methodName52,
				_methodParameterTypes52,
				new Object[] {
					lessonId,
					
				ClpSerializer.translateInput(funType),
					
				userId,
					
				type,
					
				ClpSerializer.translateInput(unpublishDocIds)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName53,
					_methodParameterTypes53,
					new Object[] {
						ClpSerializer.translateInput(status),
						
					userId,
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessons(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName54,
					_methodParameterTypes54,
					new Object[] {
						ClpSerializer.translateInput(status),
						
					userId,
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategory(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName55,
					_methodParameterTypes55,
					new Object[] {
						categoryId,
						
					userId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName56,
					_methodParameterTypes56,
					new Object[] {
						tagId,
						
					userId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedLessonsByTag(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName57,
					_methodParameterTypes57,
					new Object[] {
						tagId,
						
					userId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetFeaturedUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName58,
					_methodParameterTypes58,
					new Object[] {
						userGroupId,
						
					tagId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName59,
					_methodParameterTypes59,
					new Object[] {
						userGroupId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByCategory(
		long userGroupId, long categoryId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName60,
					_methodParameterTypes60,
					new Object[] {
						userGroupId,
						
					categoryId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetUserGroupLessonsByTag(
		long userGroupId, long tagId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName61,
					_methodParameterTypes61,
					new Object[] {
						userGroupId,
						
					tagId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findFeaturedUserGroupLessons(
		long userGroupId, java.lang.String status, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName62,
					_methodParameterTypes62,
					new Object[] {
						userGroupId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndUser(
		long categoryId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName63,
					_methodParameterTypes63,
					new Object[] {
						categoryId,
						
					userId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndUser(
		long tagId, long userId, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName64,
					_methodParameterTypes64,
					new Object[] {
						tagId,
						
					userId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByCategoryAndFeatured(
		long categoryId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName65,
					_methodParameterTypes65,
					new Object[] {
						categoryId,
						
					featured,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findAssetLessonsByTagAndFeatured(
		long tagId, boolean featured, java.lang.String status,
		java.lang.String[] privacy, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName66,
					_methodParameterTypes66,
					new Object[] {
						tagId,
						
					featured,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findMyFavouriteLessons(
		long userId, java.lang.String status, java.lang.String orderBy,
		java.lang.String[] markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName67,
					_methodParameterTypes67,
					new Object[] {
						userId,
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findMyLessonsWithCollaborations(
		long userId, java.lang.String orderBy, java.lang.String[] markedAs,
		int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName68,
					_methodParameterTypes68,
					new Object[] {
						userId,
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteObjectivesOfLesson(long lessonId) {
		try {
			_invokableLocalService.invokeMethod(_methodName69,
				_methodParameterTypes69, new Object[] { lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Boolean getFavouriteLesson(long userId, long lessonId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName70,
					_methodParameterTypes70, new Object[] { userId, lessonId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.Boolean)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getFavouriteLessonsByUserId(
		long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName71,
					_methodParameterTypes71, new Object[] { userId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findLessonsWithCollaborations(
		java.lang.String status, long userId, java.lang.String[] privacy,
		java.lang.String orderBy, java.lang.String[] markedAs, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName72,
					_methodParameterTypes72,
					new Object[] {
						ClpSerializer.translateInput(status),
						
					userId,
						
					ClpSerializer.translateInput(privacy),
						
					ClpSerializer.translateInput(orderBy),
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Set<java.lang.Long> findPrivateLessonsIdsBelongToUser(
		long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName73,
					_methodParameterTypes73, new Object[] { userId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Set<java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.Set<java.lang.Long> findPrivateLessonsIds(
		java.lang.String[] status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName74,
					_methodParameterTypes74,
					new Object[] { ClpSerializer.translateInput(status) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.Set<java.lang.Long>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> getLessonsMarkedAs(
		java.lang.String markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName75,
					_methodParameterTypes75,
					new Object[] {
						ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findArchivedMarkedAsLessonsByTag(
		long tagId, java.lang.String markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName76,
					_methodParameterTypes76,
					new Object[] {
						tagId,
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.nyu.model.Lesson> findArchivedMarkedAsLessonsByCategory(
		long categoryId, java.lang.String markedAs, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName77,
					_methodParameterTypes77,
					new Object[] {
						categoryId,
						
					ClpSerializer.translateInput(markedAs),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.nyu.model.Lesson>)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableLocalService _invokableLocalService;
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
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
}