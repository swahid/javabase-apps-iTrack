<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!-- 
 @author  Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since	1.0.0
 -->
<t:dashboard>
	<jsp:attribute name="header">
		<!-- Header title here -->
		<title>iTrack Dashboard</title>
		<!-- home page javascript functions add -->
		<script src="resources/js/funtions/home.js"></script>
	</jsp:attribute>
	<jsp:attribute name="contentHeader">
		<div class="row">
        <div class="col-xs-12">
            <div class="box-header">
              <h3 class="box-title ">Open Issue</h3>
              	<button class="btn btn-success pull-right" onclick="createIssueForm_Popup();return false;">New Issue</button>
            </div>
          </div>
          </div>
	</jsp:attribute>
	<jsp:body>
	<!-- dialog box form create issue start -->
	<div id="createIssueForm" class="col-md-6" style="display: none;">
		<div class="box box-success">
            <div class="box-header with-border">
              <h3 class="box-title">Create Issue</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" id="issueCreateForm" action="#" method="post" autocomplete="on">
              <div class="box-body">
                <div class="form-group">
                  <input type="text" id=issueTitle class="form-control" placeholder="Title">
                </div>
                <!-- Dscription textarea -->
                <div class="form-group">
                  <textarea class="form-control" id="issueDescription" rows="3" placeholder="Description"></textarea>
                </div>
                	<!-- Assignees Combo -->
                <div class="form-group">
                <select class="form-control select2" style="width: 100%;" id="assignee">
                  <option selected="selected">Select a Assignees</option>
                  <option>Saurav</option>
                  <option>Rashed</option>
                </select>
              </div>
              <input type="hidden" id="csrfToken" value="${_csrf.token}"/>
			  <input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
			  <input type="hidden" id="username" value="${user.username}"/>
              <!-- /.form-group -->
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-success pull-right">Submit New Issue</button>
              </div>
            </form>
          </div>
    </div>
	<!-- dialog box form create issue end -->
	<!-- row Table start-->
      <div class="row">
        <div class="col-xs-12">
          <div class="box box-success">
            <div class="box-header">
              <h3 class="box-title">Pending Issue</h3>

              <div class="box-tools">
                <div class="input-group input-group-sm" style="width: 150px;">
                  <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                  <div class="input-group-btn">
                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover" id="issueTable">
               <thead>
                <tr>
                  <th>No#</th>
                  <th style="width: 500px">Issue</th>
                  <th>Status</th>
                  <th>Creator</th>
                  <th>Assignee</th>
                  <th>Date</th>
                </tr>
                <thead>
                <tbody id="tableBody">
                            
                </tbody>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
      </div>
	<!-- row Table end-->
	</jsp:body>
</t:dashboard>
</html>