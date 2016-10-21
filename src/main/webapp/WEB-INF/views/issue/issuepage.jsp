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
		<div class="box-body table-responsive no-padding">
              <table class="table table-hover">
                <tr>
                  <th>Project</th>
                  <td>${issue.project.proejcttitle}</td>
                </tr>
                <tr>
                  <th>Priority</th>
                  <td>${issue.priority}</td>
                </tr>
                <tr>
                  <th>Type</th>
                  <td>${issue.type}</td>
                </tr>
                <tr>
                  <th>Assignee</th>
                  <td>${issue.assignee}</td>
                </tr>
                <tr>
                  <th>State</th>
                  <td>${issue.state}</td>
                </tr>
                <tr>
                  <th>Fixed Date</th>
                  <td>${issue.fixeddate}</td>
                </tr>
                <tr>
                  <th>Fixed By</th>
                  <td>${issue.fixedby}</td>
                </tr>
                <tr>
                  <th>Verified By</th>
                  <td>${issue.verifiedby}</td>
                </tr>
              </table>
         </div>
	</div>
	</jsp:body>
</t:dashboard_top>