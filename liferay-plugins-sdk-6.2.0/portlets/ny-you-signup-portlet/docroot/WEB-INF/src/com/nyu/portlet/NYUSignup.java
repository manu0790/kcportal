package com.nyu.portlet;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * Portlet implementation class NYUSignup
 */
public class NYUSignup extends MVCPortlet {

	public void processAction(ActionRequest actionRequest, ActionResponse actinoResponse) throws PortletException {
		
	}

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException{
		CaptchaUtil.serveImage(resourceRequest, resourceResponse);
	}

}
