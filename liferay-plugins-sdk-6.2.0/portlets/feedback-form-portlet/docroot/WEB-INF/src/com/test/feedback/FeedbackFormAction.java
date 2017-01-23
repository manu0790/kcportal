package com.test.feedback;

import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.service.feedback.model.Feedback;
import com.service.feedback.service.FeedbackLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class FeedbackFormAction
 */
public class FeedbackFormAction extends MVCPortlet {

	public void processAction(ActionRequest request, ActionResponse response){
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		String subject = ParamUtil.getString(request, "subject");
		String feedbackText = ParamUtil.getString(request, "feedback");
		
		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(Feedback.class.getName(), request);
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		long userId = themeDisplay.getUserId();
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		Feedback feedback = null;
		WorkflowDefinitionLink workflowDefinitionLink = null;
		try {
			feedback = FeedbackLocalServiceUtil.saveFeedback(subject, feedbackText, userId, companyId, groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		try {
			workflowDefinitionLink = WorkflowDefinitionLinkLocalServiceUtil.getDefaultWorkflowDefinitionLink(
					companyId, Feedback.class.getName(), 0, 0);
		} catch (Exception e) {
			if(e instanceof NoSuchWorkflowDefinitionLinkException){
				SessionMessages.add(request.getPortletSession(),"workflow-not-enabled");
			}
			e.printStackTrace();
		} 
		if(feedback != null && workflowDefinitionLink != null){
			try {
				//add feedback asset in asset entry table
				AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), feedback.getGroupId(),
						Feedback.class.getName(), feedback.getFeedbackId(),
						serviceContext.getAssetCategoryIds(),
						serviceContext.getAssetTagNames());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//start workflow instance to feedback.
			try {
				WorkflowHandlerRegistryUtil.startWorkflowInstance(companyId, userId, Feedback.class.getName(),
						feedback.getPrimaryKey(), feedback, serviceContext);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(feedback==null){
			SessionErrors.add(request.getPortletSession(),"feedback-submit-failed");
		}else{
			SessionMessages.add(request.getPortletSession(),"feedback-submit-success");
		}
	}

}
