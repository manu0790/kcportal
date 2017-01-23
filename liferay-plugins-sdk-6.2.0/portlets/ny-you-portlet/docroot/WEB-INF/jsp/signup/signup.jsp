<%@include file="/WEB-INF/jsp/init.jsp" %>

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
<%@page import="com.liferay.portal.kernel.util.JavaConstants"%>
<%@page import="com.liferay.portal.model.Layout"%>
<style type="text/css">
	.buttonitem-icon-only{height:auto !important}
	.ui-state-highlight, .ui-widget-content .ui-state-highlight, .ui-widget-header .ui-state-highlight {
		border-radius: 0;
		height: auto;
		margin-top: 0;
	}
</style>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src='<%=themeDisplay.getPathThemeJavaScript()%>/jquery/jquery-1.11.0.min.js' type="text/javascript"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<portlet:actionURL var="createAccountURL">
	<portlet:param name="action" value="addUser" />
</portlet:actionURL>

<portlet:resourceURL var="captchaURL" />

<%	PortletRequest portletRequest = (PortletRequest)request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);	%>

<aui:form method="post" name="userProfileForm" action="<%=createAccountURL%>" onSubmit="event.preventDefault();validateUserDetailsForm()">
	
	<c:if test='<%= SessionMessages.contains(portletRequest, "userPending") %>'>
		<%
		String userEmailAddress = (String)SessionMessages.get(portletRequest, "userPending");
		%>
		<div class="alert alert-success">
			<%= LanguageUtil.format(pageContext, "thank-you-for-creating-an-account.-you-will-be-notified-via-email-at-x-when-your-account-has-been-approved", userEmailAddress) %>
		</div>
	</c:if>
	
	<aui:model-context model="<%=User.class %>" bean="<%=null %>"/>

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
	
	<aui:input type="text" name="screenName" label="Username" value='<%=ParamUtil.getString(request, "screenName") %>'>
		<aui:validator name="required"/>
		<aui:validator name="maxLength">30</aui:validator>
	</aui:input>
	
	<aui:input type="text" name="emailAddress" label="email-address" value='<%=ParamUtil.getString(request, "emailAddress") %>'>
		<aui:validator name="required"/>
		<aui:validator name="email"/>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
	
	<aui:input type="text" name="firstName" label="first-name" value='<%=ParamUtil.getString(request, "firstName") %>'>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
		
	<aui:input type="text" name="lastName" label="last-name" value='<%=ParamUtil.getString(request, "lastName") %>'>
		<aui:validator name="maxLength">75</aui:validator>
	</aui:input>
	 
	
	<!-- <div id="birthDatePicker"></div> -->
	
	
	<div class="aui-datepicker" id="<portlet:namespace />fromDatePicker">
		<aui:input type="text" label="Birthdate" name="birthDate" readonly="readonly" />
		<span id="<portlet:namespace />birthDateButton" class="buttonitem-icon icon icon-calendar" style="font-size:25px;vertical-align:auto;"></span>
	</div>
	<div><p id="bdErrorId" style="display:none; color:red; margin-top:-14px;"></p></div>
	
	<%-- <aui:field-wrapper label="birth-day">
		<aui:select name="bdMonth" label="" onChange="showNoOfDays(this.value);" inlineField="true" required="true" showEmptyOption="true">
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
		
		<aui:select name="bdDay" label="" inlineField="true" required="true" showEmptyOption="true">
			<c:forEach begin="1" end="31" var="i">
				<aui:option value="${i}" label="${i}" selected='<%=ParamUtil.getString(request, "bdDay").equals("${i}")?true:false %>'/>
			</c:forEach>
		</aui:select>
		<aui:select name="bdYear" label="" inlineField="true" required="true" showEmptyOption="true">
			<c:forEach begin="1905" end="<%=new Date().getYear()+1900 %>" var="i">
				<aui:option value="${i}" label="${i}" selected='<%=ParamUtil.getString(request, "bdYear").equals("${i}")?true:false %>'/>
			</c:forEach>
		</aui:select>
	</aui:field-wrapper> --%>
			
	<div>
		<aui:select name="gender" label="gender" required="true" showEmptyOption="true">
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
	
	<aui:select name="have_health_insurance" label="Have health insurance?" required="true" showEmptyOption="true">
		<aui:option label="no" value="no" selected='<%=ParamUtil.getString(request, "have_health_insurance").equals("no")?true:false %>'/>
		<aui:option label="yes" value="yes" selected='<%=ParamUtil.getString(request, "have_health_insurance").equals("yes")?true:false %>'/>
	</aui:select>
	
	<aui:input type="text" name="zipcode" label="Zipcode" value='<%=ParamUtil.getString(request, "zipcode") %>'>
		<aui:validator name="required"/>
	</aui:input>
	
	<%-- <aui:input classPK="<%= 0 %>" model="<%= User.class %>" name="categories" type="assetCategories" />
	<liferay-ui:asset-categories-selector classPK="<%=0 %>" className="<%=User.class.getName() %>" /> --%>
	
	<div>
		<h3><liferay-ui:message key="interests" /></h3>
		<label for=""><liferay-ui:message key="categories" /></label>
		<aui:field-wrapper>
			<aui:fieldset>
				<aui:input type="assetCategories" id="categories"
					name="categories" label="categories"></aui:input>
			</aui:fieldset>
			</br>
			<aui:fieldset cssClass="onlyTags">
				<aui:input id="tags" name="tags" type="assetTags" label="tags" />
			</aui:fieldset>
		</aui:field-wrapper>
	</div>
	
	<liferay-ui:captcha url="<%=captchaURL %>"></liferay-ui:captcha>
	
	<aui:button-row>
		<aui:button type="submit" value="save" cssClass="btn btn-primary btn-large" name="saveButton" />
	</aui:button-row>
</aui:form>

<script type="text/javascript">
	$( "#<portlet:namespace/>birthDate" ).datepicker({
		changeMonth: true,
		changeYear: true,
		yearRange: "1905:"+new Date().getFullYear(),
		showOn: "button",
		buttonText: $('#<portlet:namespace/>birthDateButton'),
		onSelect: function(){
			$("#<portlet:namespace/>birthDate").focus();
		}
	});
	

/*AUI().ready( 'aui-autocomplete', 'aui-io-request','aui-datepicker-select-deprecated', function(A){
	var datepicker = new A.DatePickerSelect({
		calendar: {
			selectedDates: [new Date(1905,1,1)],
			dateFormat: '%d/%m/%y'
		},
		dayNodeName: 'bdDay',
		monthNodeName: 'bdMonth',
		yearNodeName: 'bdYear',
		nullableDay: true,
		nullableMonth: true,
		nullableYear: true,
		yearRange: [ 1905, new Date().getFullYear() ]
	}).render('#birthDatePicker');

	validate = function() {
		var date1;
		var date2;

        datepicker.calendar.eachSelectedDate(function(date) {
              date1= date.getTime();
		});
alert(date1);
		if(!date1){
			$("#bdErrorId").html('<liferay-ui:message key="please-enter-the-birthday-date" />').show();
			return false;
		}else{
			return true;
		}

	};
});*/

	validate = function() {
		var date1;
        date1 = $("#<portlet:namespace/>birthDate").val();

		if(!date1){
			$("#bdErrorId").html('<liferay-ui:message key="please-enter-the-birthday-date" />').show();
			$("#<portlet:namespace/>birthDate").focus();
			return false;
		}else{
			return true;
		}
	};

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
		if($("#<portlet:namespace/>gender").val() != "customise"){
			$("#<portlet:namespace/>customGender").val($("#<portlet:namespace/>gender").val());
		}else{
			$("#<portlet:namespace/>customGender").val("");
		}
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
		noErrors = validate();
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