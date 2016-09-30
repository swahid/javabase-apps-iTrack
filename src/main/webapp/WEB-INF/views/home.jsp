<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<html>
<head>
	<title>Home</title>
</head>

<t:dashboard>
	<jsp:body>
		<h1>
			Hello world!  
		</h1>

		<P>  The time on the server is ${serverTime}. </P>
	
	</jsp:body>
</t:dashboard>
</html>