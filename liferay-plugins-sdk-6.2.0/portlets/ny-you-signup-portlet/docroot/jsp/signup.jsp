<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.UserEmailAddressException"%>
<%@page import="com.liferay.portal.EmailAddressException"%>
<%@page import="com.liferay.portal.DuplicateUserScreenNameException"%>
<%@page import="com.liferay.portal.DuplicateUserIdException"%>
<%@page import="com.liferay.portal.DuplicateUserEmailAddressException"%>
<%@page import="com.liferay.portal.ContactFullNameException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException"%>
<%@page import="com.liferay.portal.ContactLastNameException"%>
<%@page import="com.liferay.portal.ContactFirstNameException"%>
<%@page import="com.liferay.portal.CompanyMaxUsersException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portlet.expando.model.ExpandoColumnConstants"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet"   prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %> 
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<liferay-theme:defineObjects/>
<<portlet:defineObjects/>

<script src='<%=themeDisplay.getPathThemeJavaScript()%>/jquery/jquery-1.11.0.min.js' type="text/javascript"></script>

<portlet:actionURL var="createAccountURL">
	<portlet:param name="action" value="addUser" />
</portlet:actionURL>

<portlet:resourceURL var="captchURL"></portlet:resourceURL>

<%
	Layout homePageLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), false, "/home");
%>

<liferay-portlet:renderURL portletName="58" var="loginPageUrl" plid="<%=homePageLayout.getPlid() %>">
	<liferay-portlet:param name="struct_action" value="/login/login"/>
</liferay-portlet:renderURL>
<liferay-ui:success key="userPending" message="thank-you-for-creating-an-account.-you-will-be-notified-via-email-at-x-when-your-account-has-been-approved" />

<aui:form method="post" name="userProfileForm" action="<%=createAccountURL%>" onSubmit="event.preventDefault();validateUserDetailsForm()">
	
	<c:if test='<%= SessionMessages.contains(request, "userPending") %>'>
		<%
		String userEmailAddress = (String)SessionMessages.get(request, "userPending");
		%>
		<div class="alert alert-success">
			<%= LanguageUtil.format(pageContext, "thank-you-for-creating-an-account.-you-will-be-notified-via-email-at-x-when-your-account-has-been-approved", userEmailAddress) %>
		</div>
	</c:if>

	<liferay-ui:error exception="<%= CaptchaMaxChallengesException.class %>" message="maximum-number-of-captcha-attempts-exceeded" />
	<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" />
	<liferay-ui:error exception="<%= CompanyMaxUsersException.class %>" message="unable-to-create-user-account-because-the-maximum-number-of-users-has-been-reached" />
	<liferay-ui:error exception="<%= ContactFirstNameException.class %>" message="please-enter-a-valid-first-name" />
	<liferay-ui:error exception="<%= ContactFullNameException.class %>" message="please-enter-a-valid-first-middle-and-last-name" />
	<liferay-ui:error exception="<%= ContactLastNameException.class %>" message="please-enter-a-valid-last-name" />
	<liferay-ui:error exception="<%= DuplicateUserEmailAddressException.class %>" message="the-email-address-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= DuplicateUserIdException.class %>" message="the-user-id-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= DuplicateUserScreenNameException.class %>" message="the-screen-name-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= EmailAddressException.class %>" message="please-enter-a-valid-email-address" />
	<liferay-ui:error exception="<%= UserEmailAddressException.class %>" message="please-enter-a-valid-email-address" />
	
	<aui:input name="redirect" type="hidden" value="<%=loginPageUrl.toString() %>"/>
	
	<aui:input type="text" name="firstName" label="first-name" value='<%=ParamUtil.getString(request, "firstName") %>'>
		<aui:validator name="required"/>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
		
	<aui:input type="text" name="middleName" label="middle-name" value='<%=ParamUtil.getString(request, "middleName") %>'>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
	
	<aui:input type="text" name="lastName" label="last-name" value='<%=ParamUtil.getString(request, "lastName") %>'>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
	 
	<aui:input type="text" name="screenName" label="Username" value='<%=ParamUtil.getString(request, "screenName") %>'>
		<aui:validator name="required"/>
		<aui:validator name="maxLength">30</aui:validator>
	</aui:input>
	
	<aui:input type="text" name="emailAddress" label="email-address" value='<%=ParamUtil.getString(request, "emailAddress") %>'>
		<aui:validator name="required"/>
		<aui:validator name="email"/>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
	
	<aui:field-wrapper label="birth-day">
		<aui:select name="bdMonth" label="" onChange="showNoOfDays(this.value);" inlineField="true">
			<aui:option value="01" label="Jan" selected='<%=ParamUtil.getString(request, "bdMonth").equals("01")?true:false %>'/>
			<aui:option value="02" label="Feb" selected='<%=ParamUtil.getString(request, "bdMonth").equals("02")?true:false %>'/>
			<aui:option value="03" label="Mar" selected='<%=ParamUtil.getString(request, "bdMonth").equals("03")?true:false %>'/>
			<aui:option value="04" label="Apr" selected='<%=ParamUtil.getString(request, "bdMonth").equals("04")?true:false %>'/>
			<aui:option value="05" label="May" selected='<%=ParamUtil.getString(request, "bdMonth").equals("05")?true:false %>'/>
			<aui:option value="06" label="Jun" selected='<%=ParamUtil.getString(request, "bdMonth").equals("06")?true:false %>'/>
			<aui:option value="07" label="Jul" selected='<%=ParamUtil.getString(request, "bdMonth").equals("07")?true:false %>'/>
			<aui:option value="08" label="Aug" selected='<%=ParamUtil.getString(request, "bdMonth").equals("08")?true:false %>'/>
			<aui:option value="09" label="Sept" selected='<%=ParamUtil.getString(request, "bdMonth").equals("09")?true:false %>'/>
			<aui:option value="10" label="Oct" selected='<%=ParamUtil.getString(request, "bdMonth").equals("10")?true:false %>'/>
			<aui:option value="11" label="Nov" selected='<%=ParamUtil.getString(request, "bdMonth").equals("11")?true:false %>'/>
			<aui:option value="12" label="Dec" selected='<%=ParamUtil.getString(request, "bdMonth").equals("12")?true:false %>'/>
		</aui:select>
		
		<aui:select name="bdDay" label="" inlineField="true">
			<c:forEach begin="1" end="31" var="i">
				<aui:option value="${i}" label="${i}" selected='<%=ParamUtil.getString(request, "bdDay").equals("${i}")?true:false %>'/>
			</c:forEach>
		</aui:select>
		<aui:select name="bdYear" label="" inlineField="true">
			<c:forEach begin="1905" end="<%=new Date().getYear()+1900 %>" var="i">
				<aui:option value="${i}" label="${i}" selected='<%=ParamUtil.getString(request, "bdYear").equals("${i}")?true:false %>'/>
			</c:forEach>
		</aui:select>
	</aui:field-wrapper>
			
	
	<div>
		<aui:select name="gender" label="gender">
			<aui:option label="male" value="male" selected='<%=ParamUtil.getString(request, "customGender").equals("male")?true:false %>'/>
			<aui:option label="female" value="female" selected='<%=ParamUtil.getString(request, "customGender").equals("female")?true:false %>'/>
			<aui:option label="Customize"  value="customise" selected='<%=ParamUtil.getString(request, "customGender").equals("customise")?true:false %>'/> 
			<aui:option label="prefer-not-to-disclose"  value="ntd" selected='<%=ParamUtil.getString(request, "customGender").equals("ntd")?true:false %>'/>
		</aui:select>
	</div>
	<div>
		<span id="selectGroup" style="display:none">
			<aui:input type="text" style="margin-top:25px;" name="customGender" placeholder="enter-text-here" label="" value='<%=ParamUtil.getString(request, "customGender")%>'/>
		</span>
		<p id="enterGenderErrorId" style="display:none; color:red; margin-top:-14px;"></p>
	</div>
	
	<liferay-ui:captcha url="<%=captchURL.toString() %>"></liferay-ui:captcha>
	
	<aui:button-row>
		<aui:button type="submit" value="save" cssClass="btn btn-primary btn-large" name="saveButton" />
	</aui:button-row>
</aui:form>


<script type="text/javascript">
	var monthNumbers;
	var birthDateMonth;
	
	AUI().ready('aui-node',function(A) {
		monthNumbers = ["31", "28", "31", "30", "31","30", "31", "31", "30", "31","30", "31"];
		birthDateMonth = '01';
		$('#<portlet:namespace/>bdMonth').val(birthDateMonth);
	    showNoOfDays(birthDateMonth);
			
		var genderValue = 'male';
		$('#<portlet:namespace/>gender').val(genderValue);
	    
	    if(genderValue.toLowerCase() != "male" && genderValue.toLowerCase() != "female" && genderValue.toLowerCase() != "ntd"){
			$('#selectGroup').show();
		}
	    
		$('#<portlet:namespace/>gender').on('change',function(){
			if($(this).val().toLowerCase() != "male" && $(this).val().toLowerCase() != "female" && $(this).val().toLowerCase() != "ntd"){
				$('#selectGroup').show();
			}else{
				$('#selectGroup').hide(); 
			}
		});
	});
	
	$("#<portlet:namespace/>gender").on('change', function(){
		$("#<portlet:namespace/>customGender").val($("#<portlet:namespace/>gender").val());
	});
	
	function validateUserDetailsForm(){
		$("#successMessage").hide();
		var noErrors = true;
		var customizedgender = $("#<portlet:namespace/>customGender").val();
		var genderDropDown = $("#<portlet:namespace/>gender").val();
		var specialRegex =/[a-z0-9 ]$/gi;			
		if((genderDropDown != 'male' && genderDropDown != 'female' && genderDropDown != 'ntd') && customizedgender.trim()==''){
			$("#enterGenderErrorId").html('<liferay-ui:message key="please-enter-the-customized-gender-here" />').show();
			noErrors = false; 
			return noErrors;
		}else if((genderDropDown != 'male' && genderDropDown != 'female' && genderDropDown != 'ntd') && customizedgender.trim().length > 75){
			$("#enterGenderErrorId").html('<liferay-ui:message key="maximum-75-characters-allowed" />').show();
			noErrors = false; 
			return noErrors;
		}else if((genderDropDown != 'male' && genderDropDown != 'female' && genderDropDown != 'ntd') && (!specialRegex.test(customizedgender)))
		{	$("#enterGenderErrorId").html('No Special characters Allowed.').show();
			noErrors = false; 
			return noErrors;
		}
		if(noErrors){
			$(".about-me-error").addClass('hide').parent().removeClass('error');
			$("#enterGenderErrorId").hide();
			$("#<portlet:namespace/>userProfileForm").submit();
		}
		return noErrors;
	}  
				
	function showNoOfDays(month){
		var no_of_Days = monthNumbers[month-1];
		$("#<portlet:namespace/>bdDay option").show();
		$("#<portlet:namespace/>bdDay option").each(function(i){
			if(!(i <= no_of_Days-1)){
				$( this ).hide();
			}	
		});		  
	}
</script>