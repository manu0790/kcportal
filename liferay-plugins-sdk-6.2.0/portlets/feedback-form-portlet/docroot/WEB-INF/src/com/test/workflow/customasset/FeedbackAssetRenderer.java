package com.test.workflow.customasset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;
import com.service.feedback.model.Feedback;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class FeedbackAssetRenderer extends BaseAssetRenderer{

	private Feedback _feedback;
	
	public FeedbackAssetRenderer(Feedback feedback) {
		_feedback = feedback;
	}
	
	@Override
	public String getClassName() {
		return Feedback.class.getName();
	}

	@Override
	public long getClassPK() {
		return _feedback.getPrimaryKey();
	}

	@Override
	public long getGroupId() {
		return _feedback.getGroupId();
	}

	@Override
	public String getSummary(Locale arg0) {
		return _feedback.getFeedbackText();
	}

	@Override
	public String getTitle(Locale arg0) {
		return _feedback.getFeedbackSubject();
	}

	@Override
	public long getUserId() {
		return _feedback.getUserId();
	}

	@Override
	public String getUserName() {
		String username = null;
		try {
			username = UserLocalServiceUtil.getUser(_feedback.getUserId()).getFullName();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return username;
	}

	@Override
	public String getUuid() {
		return _feedback.getUuid();
	}

	@Override
	public String render(RenderRequest request, RenderResponse response, String template) throws Exception {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			request.setAttribute("feedBackObject",_feedback);
			return "/html/view.jsp";
		}else{
			return null;
		}
	}

}
