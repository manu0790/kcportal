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

package com.service.feedback.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.service.feedback.model.Feedback;
import com.service.feedback.service.base.FeedbackLocalServiceBaseImpl;

import java.util.Date;

/**
 * The implementation of the feedback local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.service.feedback.service.FeedbackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author manu.tomar
 * @see com.service.feedback.service.base.FeedbackLocalServiceBaseImpl
 * @see com.service.feedback.service.FeedbackLocalServiceUtil
 */
public class FeedbackLocalServiceImpl extends FeedbackLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.service.feedback.service.FeedbackLocalServiceUtil} to access the feedback local service.
	 */
	public Feedback saveFeedback(String subject, String feedbackText, long userId, long companyId, long groupId) throws SystemException{
		long feedbackId = counterLocalService.increment(Feedback.class.getName());
		Feedback feedback = feedbackPersistence.create(feedbackId);
		feedback.setFeedbackSubject(subject);
		feedback.setFeedbackText(feedbackText);
		feedback.setFeedbackDate(new Date());
		feedback.setCompanyId(companyId);
		feedback.setGroupId(groupId);
		feedback.setUserId(userId);
		feedback.setFeedBackStatus(WorkflowConstants.STATUS_DRAFT);
		feedback.setStatusByUserId(userId);
		
		return feedbackPersistence.update(feedback);
		
	}
}