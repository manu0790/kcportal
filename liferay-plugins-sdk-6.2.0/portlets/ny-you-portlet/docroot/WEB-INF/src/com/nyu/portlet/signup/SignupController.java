package com.nyu.portlet.signup;

import com.liferay.portal.CompanyMaxUsersException;
import com.liferay.portal.ContactFirstNameException;
import com.liferay.portal.ContactFullNameException;
import com.liferay.portal.ContactLastNameException;
import com.liferay.portal.DuplicateUserEmailAddressException;
import com.liferay.portal.DuplicateUserScreenNameException;
import com.liferay.portal.EmailAddressException;
import com.liferay.portal.GroupFriendlyURLException;
import com.liferay.portal.NoSuchLayoutException;
import com.liferay.portal.RequiredFieldException;
import com.liferay.portal.RequiredUserException;
import com.liferay.portal.ReservedUserEmailAddressException;
import com.liferay.portal.ReservedUserScreenNameException;
import com.liferay.portal.TermsOfUseException;
import com.liferay.portal.UserEmailAddressException;
import com.liferay.portal.UserIdException;
import com.liferay.portal.UserPasswordException;
import com.liferay.portal.UserScreenNameException;
import com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoTable;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoTableLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil;
import com.nyu.util.Constant;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * Portlet implementation class SignupController
 */
@Controller(value = "SignupController") 
@RequestMapping("VIEW")
public class SignupController{
	private static Logger _log = Logger.getLogger(SignupController.class);

	@RenderMapping
	public String view(RenderRequest request, RenderResponse response)throws PortletException,SystemException{
		
		
		return Constant.SIGNUP_VIEW_JSP;
		
	}
	
	@ResourceMapping
	public void serveResource(ResourceRequest request, ResourceResponse response)throws PortletException, IOException{
		CaptchaUtil.serveImage(request, response);
	}
	
	@ActionMapping(params="action=addUser")
	public void addUser(ActionRequest request, ActionResponse response)throws Exception{
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
				WebKeys.THEME_DISPLAY);

			Company company = themeDisplay.getCompany();

			if (!company.isStrangers()) {
				throw new PrincipalException();
			}

			try {
				CaptchaUtil.check(request);

				boolean autoPassword = true;
				String password1 = null;
				String password2 = null;
				boolean autoScreenName = false;
				String screenName = ParamUtil.getString(request, "screenName");
				String emailAddress = ParamUtil.getString(
					request, "emailAddress");
				long facebookId = ParamUtil.getLong(request, "facebookId");
				String openId = ParamUtil.getString(request, "openId");
				String firstName = ParamUtil.getString(request, "firstName");
				String middleName = ParamUtil.getString(request, "middleName");
				String lastName = ParamUtil.getString(request, "lastName");
				int prefixId = ParamUtil.getInteger(request, "prefixId");
				int suffixId = ParamUtil.getInteger(request, "suffixId");
				boolean male = ParamUtil.getBoolean(request, "male", true);
				String customGender = ParamUtil.getString(request, "customGender","Male");
				
				String birthDay = ParamUtil.getString(request, Constant.COMMON_BD_DAY);
				String birthMonth = ParamUtil.getString(request, Constant.COMMON_BD_MONTH);
				String birthYear = ParamUtil.getString(request, Constant.COMMON_BD_YEAR);
				birthDay = birthDay.length()<=1 ? Constant.COMMON_STRING_ZERO+birthDay : birthDay;
				birthMonth = birthMonth.length()<=1 ? Constant.COMMON_STRING_ZERO+birthMonth : birthMonth;
				
				int birthdayMonth = Integer.valueOf(birthMonth);
				int birthdayDay = Integer.valueOf(birthDay);
				int birthdayYear = Integer.valueOf(birthYear);
				
				String jobTitle = ParamUtil.getString(request, "jobTitle");
				long[] groupIds = null;
				long[] organizationIds = null;
				long[] roleIds = null;
				long[] userGroupIds = null;
				boolean sendEmail = true;

				ServiceContext serviceContext = ServiceContextFactory.getInstance(
					User.class.getName(), request);

				User user = UserServiceUtil.addUserWithWorkflow(
					company.getCompanyId(), autoPassword, password1, password2,
					autoScreenName, screenName, emailAddress, facebookId, openId,
					themeDisplay.getLocale(), firstName, middleName, lastName, prefixId,
					suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
					groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
					serviceContext);
				
				long userClassNameId = ClassNameLocalServiceUtil.getClassNameId(User.class.getName());
				ExpandoTable table = ExpandoTableLocalServiceUtil.getDefaultTable(themeDisplay.getCompanyId(), userClassNameId );
				ExpandoColumn column = ExpandoColumnLocalServiceUtil.getColumn(table.getTableId(), "custom-gender");
				ExpandoValue expandoValue = ExpandoValueLocalServiceUtil.addValue(userClassNameId ,table.getTableId(), 
						column.getColumnId(), user.getUserId(), customGender);

				// Session messages

				if (user.getStatus() == WorkflowConstants.STATUS_APPROVED) {
					SessionMessages.add(
						request, "userAdded", user.getEmailAddress());
					SessionMessages.add(
						request, "userAddedPassword",
						user.getPasswordUnencrypted());
				}
				else {
					SessionMessages.add(
						request, "userPending", user.getEmailAddress());
				}
				
				try {
					Layout layout = LayoutLocalServiceUtil.getFriendlyURLLayout(
						themeDisplay.getScopeGroupId(), false,
						PropsUtil.get(PropsKeys.COMPANY_SECURITY_STRANGERS_URL));

					String redirect = PortalUtil.getLayoutURL(layout, themeDisplay);
					
					redirect = PortalUtil.escapeRedirect(redirect);
					
					response.sendRedirect(redirect);
				}
				catch (NoSuchLayoutException nsle) {
				}
			}
			catch (Exception e) {
				if (e instanceof DuplicateUserEmailAddressException ||
					e instanceof DuplicateUserScreenNameException) {

					String emailAddress = ParamUtil.getString(
						request, "emailAddress");

					User user = UserLocalServiceUtil.fetchUserByEmailAddress(
						themeDisplay.getCompanyId(), emailAddress);

					if ((user == null) ||
						(user.getStatus() != WorkflowConstants.STATUS_INCOMPLETE)) {

						SessionErrors.add(request, e.getClass(), e);
					}
				}
				else if (e instanceof CaptchaMaxChallengesException ||
						 e instanceof CaptchaTextException ||
						 e instanceof CompanyMaxUsersException ||
						 e instanceof ContactFirstNameException ||
						 e instanceof ContactFullNameException ||
						 e instanceof ContactLastNameException ||
						 e instanceof EmailAddressException ||
						 e instanceof GroupFriendlyURLException ||
						 e instanceof RequiredFieldException ||
						 e instanceof RequiredUserException ||
						 e instanceof ReservedUserEmailAddressException ||
						 e instanceof ReservedUserScreenNameException ||
						 e instanceof TermsOfUseException ||
						 e instanceof UserEmailAddressException ||
						 e instanceof UserIdException ||
						 e instanceof UserPasswordException ||
						 e instanceof UserScreenNameException) {

					SessionErrors.add(request, e.getClass(), e);
			}else {
				throw e;
			}
			PortalUtil.copyRequestParameters(request, response);
		}
	}
}
