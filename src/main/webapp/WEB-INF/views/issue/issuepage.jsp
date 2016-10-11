<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!-- 
 @author  Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since	1.0.0
 -->
 
 <t:dashboard_top>
	<jsp:attribute name="header">
	</jsp:attribute>

	<jsp:body>
	<div class="col-md-8">
		<div>
			<h2>${issue.issueid} ${issue.issuetitle}</h2>
			<span>issue created by ${issue.createby} ${issue.createdate}</span>
		</div>
		<div style="height: 300px;width: 100%">
			<p>${issue.issueDescription}</p>
		</div>
	</div>
	<div class="col-md-4">
		<h6>Issue State : ${issue.state}</h6>
	</div>
	</jsp:body>
</t:dashboard_top>