<%@ page import="org.jrao.testpacl.ExercisePACL" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<p>
This is the <b>Test Pacl</b> portlet in View mode.
</p>

<p>
Please enter the path to a text file to use for testing. If the security
requirements are satisfied, the file is read and the file's content is written
to standard output.
</p>

<portlet:actionURL name="inputTestFilePath" var="inputTestFilePathURL"></portlet:actionURL>

<aui:form action="<%= inputTestFilePathURL %>" name="<portlet:namespace />-form">
	<aui:fieldset>
		<aui:input name="testFilePath" />
	</aui:fieldset>
</aui:form>