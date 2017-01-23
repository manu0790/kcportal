<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="feedbackURL" />

<liferay-ui:success key="feedback-submit-success" message="Feedback has been submited successfully." />

<aui:form cssClass="form-horizontal" method="post" action="<%=feedbackURL.toString() %>">
  <aui:input name="subject" type="text" label="Subject" /> 
  <aui:input name="feedback" type="text" label="Feedback text" />
  <aui:button type="submit" name="feedbackSubmit" cssClass="btn btn-primary" value="Submit"/>
</aui:form>
