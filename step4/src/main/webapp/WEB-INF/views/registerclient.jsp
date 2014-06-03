<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="title" /></title>
<style>
.error {
	color: red;
}
</style>
</head>

<body>
	<h1>
		<fmt:message key="register.heading" />
	</h1>
	<form:form method="post" commandName="clientData">
		<table width="50%" bgcolor="f8f8ff" border="0" cellspacing="0"
			cellpadding="5">
			<tr>
				<td align="right">Name:</td>
				<td width="20%"><form:input path="personName" /></td>
				<td width="20%"><form:errors path="personName" cssClass="error" /></td>
				<td align="right">Surname:</td>
				<td width="20%"><form:input path="surnames" /></td>
				<td width="20%"><form:errors path="surnames" cssClass="error" />
			<tr>
				<td align="right">DNI:</td>
				<td width="20%"><form:input path="dni" /></td>
				<td width="20%"><form:errors path="dni" cssClass="error" /></td>
				</td>
				<!-- Phone Number -->
				<td align="right" width="20%">Phone Number:</td>
				<td width="20%"><form:input path="phoneNumber1" /></td>
				<td width="20%"><form:errors path="phoneNumber1"
						cssClass="error" /></td>
			</tr>
		</table>
		<br>
		<table width="50%" bgcolor="f8f8ff" border="0" cellspacing="0"
			cellpadding="5">

			<tr>
				<!-- Address -->
				<td align="right" width="20%">Address:</td>
				<td width="20%"><form:input path="address" /></td>
				<td width="20%"><form:errors path="address" cssClass="error" />
			</tr>
			<tr>	
				<!-- Civil State -->
				<td align="right" width="20%">Civil State:</td>
				<td width="20%"><form:input path="civilState" /></td>
				<td width="20%"><form:errors path="civilState" cssClass="error" />
				</td>
				<!-- PROFESSION -->
				<td align="right" width="20%">Profession:</td>
				<td width="20%"><form:input path="profession" /></td>
				<td width="20%"><form:errors path="profession" cssClass="error" /></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Create client">
	</form:form>
	<a href="<c:url value="mainpage.htm"/>">List of clients</a>
</body>
</html>