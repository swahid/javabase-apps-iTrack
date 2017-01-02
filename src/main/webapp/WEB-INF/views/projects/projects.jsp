<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>

<t:dashboard_body>
	<jsp:attribute name="header">
		<!-- Header title here -->
		<title>iTrack Dashboard</title>
		<!-- home page javascript functions add -->
		<script src="<c:url value='/resources/js/funtions/projects.js' />"></script>
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
	
	<jsp:attribute name="sidebarUserPanel">
		<div class="pull-left image">
           <img src="" class="img-circle" alt="Image">
         </div>
         <div class="pull-left info">
           <p>All Projects</p>
           <!-- Status -->
           <!-- <a href="#"><i class="fa fa-circle text-success"></i> Online</a> -->
         </div>
	</jsp:attribute>
	<jsp:attribute name="sidebarMenu">
		<li class="active"><a href="dashboard"><i class="fa fa-link"></i> <span>Dashboard</span></a></li>
        <li class="treeview">
          <a href="#"><i class="fa fa-link"></i> <span>Multilevel</span></a>
          <ul class="treeview-menu">
            <li><a href="#">Link in level 2</a></li>
            <li><a href="#">Link in level 2</a></li>
          </ul>
        </li>
	</jsp:attribute>
	
	
	<jsp:body>
	
	<!-- row Table start-->
      <div class="row">
        <div class="col-xs-12">
          <div class="box box-success">
            <div class="box-header">
              <h3 class="box-title">All Projects</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive">
              <table class="table table-hover" id="projectTable">
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
