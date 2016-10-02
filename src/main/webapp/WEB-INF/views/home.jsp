<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<html>
<head>
	<title>Home</title>
</head>

<t:dashboard>
	
	<jsp:attribute name="contentHeader">
		<div class="row">
        <div class="col-xs-12">
            <div class="box-header">
              <h3 class="box-title ">Open Issue</h3>
              	<button type="submit" class="btn btn-Success pull-right">New issue</button>
            </div>
          </div>
          </div>
	</jsp:attribute>
	<jsp:body>
	<!-- row Table start-->
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Responsive Hover Table</h3>

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