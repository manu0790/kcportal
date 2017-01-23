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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.nyu.model.AnswerRequestClp;
import com.nyu.model.AuditReportClp;
import com.nyu.model.BasnoClp;
import com.nyu.model.DocumentFileClp;
import com.nyu.model.DocumentSectionClp;
import com.nyu.model.FavouriteLessonsClp;
import com.nyu.model.KeywordsClp;
import com.nyu.model.KeywordsCollaborationClp;
import com.nyu.model.LessonClp;
import com.nyu.model.LessonCollaborationClp;
import com.nyu.model.LessonObjectivesClp;
import com.nyu.model.Lesson_UsergroupsClp;
import com.nyu.model.NYUUserGroupClp;
import com.nyu.model.RequestLessonClp;
import com.nyu.model.SlidesClp;
import com.nyu.model.UserBadgesClp;
import com.nyu.model.UserGroupRequestClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Allwins Rajaiah
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"ny-you-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"ny-you-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "ny-you-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AnswerRequestClp.class.getName())) {
			return translateInputAnswerRequest(oldModel);
		}

		if (oldModelClassName.equals(AuditReportClp.class.getName())) {
			return translateInputAuditReport(oldModel);
		}

		if (oldModelClassName.equals(BasnoClp.class.getName())) {
			return translateInputBasno(oldModel);
		}

		if (oldModelClassName.equals(DocumentFileClp.class.getName())) {
			return translateInputDocumentFile(oldModel);
		}

		if (oldModelClassName.equals(DocumentSectionClp.class.getName())) {
			return translateInputDocumentSection(oldModel);
		}

		if (oldModelClassName.equals(FavouriteLessonsClp.class.getName())) {
			return translateInputFavouriteLessons(oldModel);
		}

		if (oldModelClassName.equals(KeywordsClp.class.getName())) {
			return translateInputKeywords(oldModel);
		}

		if (oldModelClassName.equals(KeywordsCollaborationClp.class.getName())) {
			return translateInputKeywordsCollaboration(oldModel);
		}

		if (oldModelClassName.equals(LessonClp.class.getName())) {
			return translateInputLesson(oldModel);
		}

		if (oldModelClassName.equals(Lesson_UsergroupsClp.class.getName())) {
			return translateInputLesson_Usergroups(oldModel);
		}

		if (oldModelClassName.equals(LessonCollaborationClp.class.getName())) {
			return translateInputLessonCollaboration(oldModel);
		}

		if (oldModelClassName.equals(LessonObjectivesClp.class.getName())) {
			return translateInputLessonObjectives(oldModel);
		}

		if (oldModelClassName.equals(NYUUserGroupClp.class.getName())) {
			return translateInputNYUUserGroup(oldModel);
		}

		if (oldModelClassName.equals(RequestLessonClp.class.getName())) {
			return translateInputRequestLesson(oldModel);
		}

		if (oldModelClassName.equals(SlidesClp.class.getName())) {
			return translateInputSlides(oldModel);
		}

		if (oldModelClassName.equals(UserBadgesClp.class.getName())) {
			return translateInputUserBadges(oldModel);
		}

		if (oldModelClassName.equals(UserGroupRequestClp.class.getName())) {
			return translateInputUserGroupRequest(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputAnswerRequest(BaseModel<?> oldModel) {
		AnswerRequestClp oldClpModel = (AnswerRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAnswerRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAuditReport(BaseModel<?> oldModel) {
		AuditReportClp oldClpModel = (AuditReportClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAuditReportRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputBasno(BaseModel<?> oldModel) {
		BasnoClp oldClpModel = (BasnoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBasnoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocumentFile(BaseModel<?> oldModel) {
		DocumentFileClp oldClpModel = (DocumentFileClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocumentFileRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocumentSection(BaseModel<?> oldModel) {
		DocumentSectionClp oldClpModel = (DocumentSectionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocumentSectionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFavouriteLessons(BaseModel<?> oldModel) {
		FavouriteLessonsClp oldClpModel = (FavouriteLessonsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFavouriteLessonsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputKeywords(BaseModel<?> oldModel) {
		KeywordsClp oldClpModel = (KeywordsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getKeywordsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputKeywordsCollaboration(
		BaseModel<?> oldModel) {
		KeywordsCollaborationClp oldClpModel = (KeywordsCollaborationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getKeywordsCollaborationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLesson(BaseModel<?> oldModel) {
		LessonClp oldClpModel = (LessonClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLessonRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLesson_Usergroups(BaseModel<?> oldModel) {
		Lesson_UsergroupsClp oldClpModel = (Lesson_UsergroupsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLesson_UsergroupsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLessonCollaboration(
		BaseModel<?> oldModel) {
		LessonCollaborationClp oldClpModel = (LessonCollaborationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLessonCollaborationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLessonObjectives(BaseModel<?> oldModel) {
		LessonObjectivesClp oldClpModel = (LessonObjectivesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLessonObjectivesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputNYUUserGroup(BaseModel<?> oldModel) {
		NYUUserGroupClp oldClpModel = (NYUUserGroupClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getNYUUserGroupRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRequestLesson(BaseModel<?> oldModel) {
		RequestLessonClp oldClpModel = (RequestLessonClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRequestLessonRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSlides(BaseModel<?> oldModel) {
		SlidesClp oldClpModel = (SlidesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSlidesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserBadges(BaseModel<?> oldModel) {
		UserBadgesClp oldClpModel = (UserBadgesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserBadgesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserGroupRequest(BaseModel<?> oldModel) {
		UserGroupRequestClp oldClpModel = (UserGroupRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserGroupRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("com.nyu.model.impl.AnswerRequestImpl")) {
			return translateOutputAnswerRequest(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.AuditReportImpl")) {
			return translateOutputAuditReport(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.BasnoImpl")) {
			return translateOutputBasno(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.DocumentFileImpl")) {
			return translateOutputDocumentFile(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.DocumentSectionImpl")) {
			return translateOutputDocumentSection(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.FavouriteLessonsImpl")) {
			return translateOutputFavouriteLessons(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.KeywordsImpl")) {
			return translateOutputKeywords(oldModel);
		}

		if (oldModelClassName.equals(
					"com.nyu.model.impl.KeywordsCollaborationImpl")) {
			return translateOutputKeywordsCollaboration(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.LessonImpl")) {
			return translateOutputLesson(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.Lesson_UsergroupsImpl")) {
			return translateOutputLesson_Usergroups(oldModel);
		}

		if (oldModelClassName.equals(
					"com.nyu.model.impl.LessonCollaborationImpl")) {
			return translateOutputLessonCollaboration(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.LessonObjectivesImpl")) {
			return translateOutputLessonObjectives(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.NYUUserGroupImpl")) {
			return translateOutputNYUUserGroup(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.RequestLessonImpl")) {
			return translateOutputRequestLesson(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.SlidesImpl")) {
			return translateOutputSlides(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.UserBadgesImpl")) {
			return translateOutputUserBadges(oldModel);
		}

		if (oldModelClassName.equals("com.nyu.model.impl.UserGroupRequestImpl")) {
			return translateOutputUserGroupRequest(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.nyu.NoSuchAnswerRequestException")) {
			return new com.nyu.NoSuchAnswerRequestException();
		}

		if (className.equals("com.nyu.NoSuchAuditReportException")) {
			return new com.nyu.NoSuchAuditReportException();
		}

		if (className.equals("com.nyu.NoSuchBasnoException")) {
			return new com.nyu.NoSuchBasnoException();
		}

		if (className.equals("com.nyu.NoSuchDocumentFileException")) {
			return new com.nyu.NoSuchDocumentFileException();
		}

		if (className.equals("com.nyu.NoSuchDocumentSectionException")) {
			return new com.nyu.NoSuchDocumentSectionException();
		}

		if (className.equals("com.nyu.NoSuchFavouriteLessonsException")) {
			return new com.nyu.NoSuchFavouriteLessonsException();
		}

		if (className.equals("com.nyu.NoSuchKeywordsException")) {
			return new com.nyu.NoSuchKeywordsException();
		}

		if (className.equals("com.nyu.NoSuchKeywordsCollaborationException")) {
			return new com.nyu.NoSuchKeywordsCollaborationException();
		}

		if (className.equals("com.nyu.NoSuchLessonException")) {
			return new com.nyu.NoSuchLessonException();
		}

		if (className.equals("com.nyu.NoSuchLesson_UsergroupsException")) {
			return new com.nyu.NoSuchLesson_UsergroupsException();
		}

		if (className.equals("com.nyu.NoSuchLessonCollaborationException")) {
			return new com.nyu.NoSuchLessonCollaborationException();
		}

		if (className.equals("com.nyu.NoSuchLessonObjectivesException")) {
			return new com.nyu.NoSuchLessonObjectivesException();
		}

		if (className.equals("com.nyu.NoSuchNYUUserGroupException")) {
			return new com.nyu.NoSuchNYUUserGroupException();
		}

		if (className.equals("com.nyu.NoSuchRequestLessonException")) {
			return new com.nyu.NoSuchRequestLessonException();
		}

		if (className.equals("com.nyu.NoSuchSlidesException")) {
			return new com.nyu.NoSuchSlidesException();
		}

		if (className.equals("com.nyu.NoSuchUserBadgesException")) {
			return new com.nyu.NoSuchUserBadgesException();
		}

		if (className.equals("com.nyu.NoSuchUserGroupRequestException")) {
			return new com.nyu.NoSuchUserGroupRequestException();
		}

		return throwable;
	}

	public static Object translateOutputAnswerRequest(BaseModel<?> oldModel) {
		AnswerRequestClp newModel = new AnswerRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAnswerRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAuditReport(BaseModel<?> oldModel) {
		AuditReportClp newModel = new AuditReportClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAuditReportRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputBasno(BaseModel<?> oldModel) {
		BasnoClp newModel = new BasnoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBasnoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocumentFile(BaseModel<?> oldModel) {
		DocumentFileClp newModel = new DocumentFileClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocumentFileRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocumentSection(BaseModel<?> oldModel) {
		DocumentSectionClp newModel = new DocumentSectionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocumentSectionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFavouriteLessons(BaseModel<?> oldModel) {
		FavouriteLessonsClp newModel = new FavouriteLessonsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFavouriteLessonsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputKeywords(BaseModel<?> oldModel) {
		KeywordsClp newModel = new KeywordsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setKeywordsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputKeywordsCollaboration(
		BaseModel<?> oldModel) {
		KeywordsCollaborationClp newModel = new KeywordsCollaborationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setKeywordsCollaborationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLesson(BaseModel<?> oldModel) {
		LessonClp newModel = new LessonClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLessonRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLesson_Usergroups(BaseModel<?> oldModel) {
		Lesson_UsergroupsClp newModel = new Lesson_UsergroupsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLesson_UsergroupsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLessonCollaboration(
		BaseModel<?> oldModel) {
		LessonCollaborationClp newModel = new LessonCollaborationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLessonCollaborationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLessonObjectives(BaseModel<?> oldModel) {
		LessonObjectivesClp newModel = new LessonObjectivesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLessonObjectivesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputNYUUserGroup(BaseModel<?> oldModel) {
		NYUUserGroupClp newModel = new NYUUserGroupClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setNYUUserGroupRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRequestLesson(BaseModel<?> oldModel) {
		RequestLessonClp newModel = new RequestLessonClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRequestLessonRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSlides(BaseModel<?> oldModel) {
		SlidesClp newModel = new SlidesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSlidesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserBadges(BaseModel<?> oldModel) {
		UserBadgesClp newModel = new UserBadgesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserBadgesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserGroupRequest(BaseModel<?> oldModel) {
		UserGroupRequestClp newModel = new UserGroupRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserGroupRequestRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}