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
				<td width="20%"><form:input path="name" /></td>
				<td width="20%"><form:errors path="name" cssClass="error" /></td>
				<td align="right">Surname:</td>
				<td width="20%"><form:input path="surnames" /></td>
				<td width="20%"><form:errors path="surnames" cssClass="error" />
			<tr>
				<td align="right">DNI:</td>
				<td width="20%"><form:input path="dni" /></td>
				<td width="20%"><form:errors path="dni" cssClass="error" /></td>
				</td>

			</tr>
		</table>
		<br>
		<table width="65%" bgcolor="f8f8ff" border="0" cellspacing="0"
			cellpadding="5">

			<tr>
				<!-- STREET -->
				<td align="right" width="20%">Street:</td>
				<td width="20%"><form:input path="street" /></td>
				<td width="20%"><form:errors path="street" cssClass="error" />
				</td>

				<!-- BLOCK NUMBER -->
				<td align="right" width="20%">Block Number:</td>
				<td width="20%"><form:input path="blockNumber" /></td>
				<td width="20%"><form:errors path="blockNumber"
						cssClass="error" /></td>
				<!-- FLOOR -->
				<td align="right" width="20%">Floor:</td>
				<td width="20%"><form:input path="floor" /></td>
				<td width="20%"><form:errors path="floor" cssClass="error" /></td>
				<!-- DOOR -->
				<td align="right" width="20%">Door:</td>
				<td width="20%"><form:input path="door" /></td>
				<td width="20%"><form:errors path="door" cssClass="error" /></td>
			</tr>

			<tr>
				<!-- LOCALITY -->
				<td align="right" width="20%">Locality:</td>
				<td width="20%"><form:input path="locality" /></td>
				<td width="20%"><form:errors path="locality" cssClass="error" />
				</td>
				<!-- PROVINCE -->
				<td align="right" width="20%">Province:</td>
				<td width="20%"><form:input path="province" /></td>
				<td width="20%"><form:errors path="province" cssClass="error" />
				</td>

				<!-- ZIP CODE -->
				<td align="right" width="50%">Zip Code:</td>
				<td width="20%"><form:input path="zipCode" /></td>
				<td width="20%"><form:errors path="zipCode" cssClass="error" />
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Create client">
	</form:form>
	<a href="<c:url value="mainpage.htm"/>">List of clients</a>
</body>
</html>