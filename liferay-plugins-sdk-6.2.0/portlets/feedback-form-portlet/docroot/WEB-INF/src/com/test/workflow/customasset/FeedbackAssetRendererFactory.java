package com.test.workflow.customasset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;
import com.service.feedback.model.Feedback;
import com.service.feedback.service.FeedbackLocalServiceUtil;

public class FeedbackAssetRendererFactory extends BaseAssetRendererFactory{

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException, SystemException {
		Feedback feedback = FeedbackLocalServiceUtil.getFeedback(classPK);
		
		return new FeedbackAssetRenderer(feedback);
	}

	@Override
	public String getClassName() {
		return Feedback.class.getName();
	}

	@Override
	public String getType() {
		return "Feedback";
	}

}
