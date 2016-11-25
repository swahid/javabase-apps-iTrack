<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!-- 
 @author  Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since	1.0.0
 -->
<t:dashboard_body>
	<jsp:attribute name="header">
		<!-- Header title here -->
		<title>iTrack Dashboard</title>
		<!-- home page javascript functions add -->
		<script src="<c:url value='/resources/js/funtions/home.js' />"></script>
	</jsp:attribute>
	<jsp:attribute name="contentHeader">
		<div class="row">
        <div class="col-xs-12">
            <div class="box-header">
              <h3 class="box-title ">Browse Projects</h3>
            </div>
          </div>
          </div>
	</jsp:attribute>
	
	<jsp:attribute name="sidebar">
	<div class="row">
	<div class="box box-success">
      <ul class="sidebar-menu">
           <li class="active"><a href="projects"><i class="fa fa-link"></i> <span>Projects</span></a></li>
		   <li class="treeview">
              <a href="#"><i class="fa fa-link"></i> <span>Project Types</span><i class="fa fa-angle-down pull-up"></i></a>
              <ul class="treeview-menu">
                <li><a href="dashboard">Dashboard</a></li>
                <li><a href="#">Link in level 2</a></li>
              </ul>
            </li>
         </ul><!-- /.sidebar-menu -->
    </div>
	</div>
	</jsp:attribute>
	
	
	
	<jsp:body>
	<!-- row Table start-->
      <div class="row">
        <div class="col-xs-12" style="padding-left: 4px; padding-right: 4px;">
          <div class="box box-success">
            <div class="box-header">
              <h3 class="box-title">All Projects</h3>

              <div class="box-tools">
                <div class="input-group input-group-sm" style="width: 150px;">
                  <input type="text" name="project_search" class="form-control pull-right" placeholder="Search">

                  <div class="input-group-btn">
                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover" id="issueTable">
                <tr>
                  <th style="width: 150px">Project Name</th>
                  <th>Project Key</th>
                  <th>Project Type</th>
                  <th>Project Lead</th>
                  <th>Category</th>
                  <th style="width: 200px">Project URL</th>
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
</t:dashboard_body>
