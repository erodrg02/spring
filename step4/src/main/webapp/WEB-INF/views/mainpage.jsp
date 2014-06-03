<!-- PAGINA INICIAL -->
<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
	<head>
		<title><fmt:message key="title" /></title>
	</head>
	<body>
	
		<h3>CLIENTS</h3>
		
		<c:forEach items="${model.clients}" var="person">
		<table width="50%" bgcolor="f8f8ff" border="0" cellspacing="0"
			cellpadding="5">
		
			<tr>
				<td align="left" width=10%><c:out value="${person.personName}" /></td>
		
				<td align="left" width=90%><c:out value="${person.surnames}" /></td>
			</tr>
		</table>
		<br>
		<table width="50%" bgcolor="f8f8ff" border="0" cellspacing="0"
			cellpadding="5">
			<tr>
				<td align="left" width="5%"><c:out value="${person.dni}" /></td>
			</tr>
			</table>
			<hr>
	</c:forEach>
	
	<br>
	<a href="<c:url value="registerclient.htm"/>">Register a new client</a>
	<br>
</body>
</html>