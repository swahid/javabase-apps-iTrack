<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<html>
<head>
	<title>Home</title>
</head>

<t:dashboard>
	<jsp:body>
		<h1>
			Hello <c:out value="${user.firstName}"></c:out>
		</h1>

		<P>  The time on the server is <c:out value="${user.role.rolename}"></c:out> </P>
	
	</jsp:body>
</t:dashboard>
</html>