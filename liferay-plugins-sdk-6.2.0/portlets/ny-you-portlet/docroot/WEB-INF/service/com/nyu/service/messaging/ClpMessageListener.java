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

package com.nyu.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.nyu.service.AnswerRequestLocalServiceUtil;
import com.nyu.service.AuditReportLocalServiceUtil;
import com.nyu.service.BasnoLocalServiceUtil;
import com.nyu.service.ClpSerializer;
import com.nyu.service.DocumentFileLocalServiceUtil;
import com.nyu.service.DocumentSectionLocalServiceUtil;
import com.nyu.service.FavouriteLessonsLocalServiceUtil;
import com.nyu.service.KeywordsCollaborationLocalServiceUtil;
import com.nyu.service.KeywordsLocalServiceUtil;
import com.nyu.service.LessonCollaborationLocalServiceUtil;
import com.nyu.service.LessonLocalServiceUtil;
import com.nyu.service.LessonObjectivesLocalServiceUtil;
import com.nyu.service.Lesson_UsergroupsLocalServiceUtil;
import com.nyu.service.NYUUserGroupLocalServiceUtil;
import com.nyu.service.RequestLessonLocalServiceUtil;
import com.nyu.service.SlidesLocalServiceUtil;
import com.nyu.service.UserBadgesLocalServiceUtil;
import com.nyu.service.UserGroupRequestLocalServiceUtil;

/**
 * @author Allwins Rajaiah
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			AnswerRequestLocalServiceUtil.clearService();

			AuditReportLocalServiceUtil.clearService();

			BasnoLocalServiceUtil.clearService();

			DocumentFileLocalServiceUtil.clearService();

			DocumentSectionLocalServiceUtil.clearService();

			FavouriteLessonsLocalServiceUtil.clearService();

			KeywordsLocalServiceUtil.clearService();

			KeywordsCollaborationLocalServiceUtil.clearService();

			LessonLocalServiceUtil.clearService();

			Lesson_UsergroupsLocalServiceUtil.clearService();

			LessonCollaborationLocalServiceUtil.clearService();

			LessonObjectivesLocalServiceUtil.clearService();

			NYUUserGroupLocalServiceUtil.clearService();

			RequestLessonLocalServiceUtil.clearService();

			SlidesLocalServiceUtil.clearService();

			UserBadgesLocalServiceUtil.clearService();

			UserGroupRequestLocalServiceUtil.clearService();
		}
	}
}