<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!-- 
 @author  Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since	1.0.0
 -->
 
 <t:dashboard_top>
	<jsp:attribute name="header">
	</jsp:attribute>
	<jsp:attribute name="contentHeader">
		<div class="row">
        <div class="col-xs-12">
            <div class="box-header">
              <h3 class="box-title "><c:out value="${issue.issuetitle}"></c:out></h3>
              <p class="pull-right">${issue.createby}</p>
            </div>
          </div>
          </div>
	</jsp:attribute>
	<jsp:body>
	</jsp:body>
</t:dashboard_top>