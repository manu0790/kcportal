package com.test.workflow.customasset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.service.feedback.model.Feedback;
import com.service.feedback.service.FeedbackLocalServiceUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class FeedbackWorkflowHandler extends BaseWorkflowHandler{

	@Override
	public String getClassName() {
		return Feedback.class.getName();
	}

	@Override
	public String getType(Locale locale) {
		return "Feedback";
	}

	@Override
	public Object updateStatus(int status, Map<String, Serializable> workflowContext) throws 
		PortalException, SystemException {
		
		long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		Feedback feedback = FeedbackLocalServiceUtil.getFeedback(resourcePrimKey);
		feedback.setFeedBackStatus(status);
		feedback.setStatusByUserId(userId);
		feedback.setStatusDate(new Date());
		feedback = FeedbackLocalServiceUtil.updateFeedback(feedback);
		
		if(status == WorkflowConstants.STATUS_APPROVED){
			AssetEntryLocalServiceUtil.updateVisible(Feedback.class.getName(), resourcePrimKey, true);
		}else{
			AssetEntryLocalServiceUtil.updateVisible(Feedback.class.getName(), resourcePrimKey, false);
		}
		
		return feedback;
	}

}
