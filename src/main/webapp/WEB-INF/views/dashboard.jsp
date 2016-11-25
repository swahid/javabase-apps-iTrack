<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!-- 
 @author  Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since	1.0.0
 -->
<t:dashboard_top>

	<jsp:attribute name="header">
		<!-- Header title here -->
		<title>iTrack System Dashboard</title>
		<!-- home page javascript functions add -->
		<script src="<c:url value='/resources/js/funtions/home.js' />"></script>
	</jsp:attribute>
	
	
	<jsp:attribute name="contentHeader">
		<div class="row">
        <div class="col-xs-12">
            <div class="box-header">
              <h3 class="box-title ">System DashBoard</h3>
            </div>
          </div>
          </div>
	</jsp:attribute>
	
	
	<jsp:body>
	<div class="row">
	<!-- divided by column wise 1st left side part start -->
		<div class="col-md-8">
			<!-- 1st box Dashboard start-->
			<div class="box box-primary box-solid">
	            <div class="box-header with-border">
	              <h3 class="box-title">Quick Links</h3>
	              <div class="box-tools pull-right">
	                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
	                </button>
	              </div>
	              <!-- /.box-tools -->
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              	<b>NAVIGATION</b><br>
					<a href="projects">Browse Projects</a><br>
					<a href="teams">Browse Teams</a><br>
					<a href="issue">Search for Issues</a><br>
					<a href="issue/create">Create Issue</a><br>
	            </div>
          	</div>
          	<!-- 1st box Dashboard end-->
          	
          	<!-- **************************************************************** -->
          	
          	<!-- 2nd box Dashboard start-->
          	<div class="box box-primary box-solid">
	            <div class="box-header with-border">
	              <h3 class="box-title">Issues in progress</h3>
	              <div class="box-tools pull-right">
	                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
	                </button>
	              </div>
	              <!-- /.box-tools -->
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              You currently have no <a href="home">issues</a> in progress.
	            </div>
          	</div>
          	<!-- 2nd box Dashboard end-->
          	
          	<!-- **************************************************************** -->
          	
          	<!-- 3rd box Dashboard start-->
          	<div class="box box-primary box-solid">
	            <div class="box-header with-border">
	              <h3 class="box-title">Assigned to Me</h3>
	              <div class="box-tools pull-right">
	                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
	                </button>
	              </div>
	              <!-- /.box-tools -->
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              You currently have no <a href="home">issues</a> assigned to you. Enjoy your day!
	            </div>
          	</div>
          	<!-- 3rd box Dashboard end-->
		</div>
		<!-- divided by column wise 1st left side part end -->
		
		<!-- =========================================================== -->
		<!-- page divider with 2 part column wise -->
		 
		<!-- divided by column wise 1st right side part start -->
		<div class="col-md-4">
	         <div class="box box-primary box-solid">
	            <div class="box-header with-border">
	              <h3 class="box-title">Projects</h3>
	              <div class="box-tools pull-right">
	                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
	                </button>
	              </div>
	              <!-- /.box-tools -->
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              No Project Out There
	            </div>
          	</div>
		</div>
		<!-- divided by column wise 1st right side part end -->
		<!-- =========================================================== -->
	</div>
	 <!-- end row upper section issue description and table -->
	 <!-- =========================================================== -->
	 
	</jsp:body>
</t:dashboard_top>
