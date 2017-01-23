package com.liferay.portal.tou;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.struts.BaseStrutsAction;
import com.liferay.portal.kernel.struts.StrutsAction;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoTable;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoTableLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil;

public class CustomTermsOfUse extends BaseStrutsAction {
	public String execute(StrutsAction originalStrutsAction,HttpServletRequest request, HttpServletResponse response)throws Exception {
		User user = PortalUtil.getUser(request);
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long userClassNameId = ClassNameLocalServiceUtil.getClassNameId(User.class.getName());
		ExpandoTable UsersCustomFieldTable = ExpandoTableLocalServiceUtil.getDefaultTable(themeDisplay.getCompanyId(), userClassNameId);
		ExpandoColumn column = ExpandoColumnLocalServiceUtil.getColumn(UsersCustomFieldTable.getTableId(), "agree-date");
		ExpandoValueLocalServiceUtil.addValue(userClassNameId ,UsersCustomFieldTable.getTableId(), 
				column.getColumnId(), user.getUserId(), new Date().toString());
		//user.getExpandoBridge().setAttribute("agree-date", new Date());
		return originalStrutsAction.execute(request,response); 
	}
}
