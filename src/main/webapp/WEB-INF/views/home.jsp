<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
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
            <form role="form">
              <div class="box-body">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="Title" autocomplete="off">
                </div>
                <!-- Dscription textarea -->
                <div class="form-group">
                  <textarea class="form-control" rows="3" placeholder="Description"></textarea>
                </div>
                	<!-- Assignees Combo -->
                <div class="form-group">
                <select class="form-control select2" style="width: 100%;" >
                  <option selected="selected">Select a Assignees</option>
                  <option>Saurav</option>
                  <option>Rashed</option>
                </select>
              </div>
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
              <table class="table table-hover">
                <tr>
                  <th>No#</th>
                  <th style="width: 500px">Issue</th>
                  <th>Status</th>
                  <th>Creator</th>
                  <th>Assignee</th>
                  <th>Date</th>
                </tr>
                <tr>
                  <td>183</td>
                  <td>John Doe</td>
                  <td><span class="label label-success">Open</span></td>
                  <td>11-7-2014</td>
                  <td>Bacon </td>
                  <td>Bacon </td>
                </tr>
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