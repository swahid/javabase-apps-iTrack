<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<!-- 
 @author  	Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since		1.0.0
 -->
 
 <t:dashboard_top>
	<jsp:attribute name="header">
		<script src="<c:url value='/resources/js/funtions/issueViewer.js' />"></script>
	</jsp:attribute>
	<jsp:body>
	 <div class="row">
	<!-- separe div ny column for issue description -->
		<div class="col-md-8">
		<!-- div separate for issue title -->
		<div class="row-md-8" >
          <div class="box box-success" style="height: 400px; width: 100%">
            <div class="box-header with-border">
              <h3 class="box-title">${issue.issuetitle}<br/>
				<small>created ${issue.createby} ${issue.createdate}</small>
              </h3>
              <div class="pull-right">
              	<small>Reporter ${issue.assignee}</small>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body box-success">
              <p>${issue.issueDescription}</p>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        
        
        
        
        
        
		<!-- comments Row section -->
		<div class="row-md-4" >
		<!-- comments section Start -->
          <div class="box box-success">
            <div class="box-header with-border">
              <h3 class="box-title" id="commentSize"> 0 Comments</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body box-success" id="commentList">
            	<!-- dynamicly create Comments Section -->
            
              <!-- <div class="box-body">
                <div class="form-group">
                	<p id="commentBody"> </p>
                </div>
                <div class="box-footer commetns">
                	<div class="pull-right">
		                <p><a href="#" target="_blank" id="commentUsername"></a><br>
		                	<span class="commetsDate"></span>
		                </p>
                	</div>
              </div>
              </div> -->
            </div>
              <!-- comments section end -->
            <!-- /.box-body -->
          </div>
          <!-- comments list end  -->
          
          
          <!-- comments box section start -->
          <div class="box box-success">
            <div class="box-header with-border">
              <h3 class="box-title"> Enter Comments</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body box-success">
              <!-- comments box section start -->
              
              <form id="commentBox" role="form">
              <div class="box-body">
                <div class="form-group">
                  <textarea class="textarea" id="commentDescription" placeholder="Enter Comments..." placeholder="Place some text here" style="width: 100%; height: 200px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;"></textarea>
                  <input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				  <input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				  <input type="hidden" id="commentor" value="${user.username}"/>
				  <input type="hidden" id="userId" value="${user.userid}"/>
				  <input type="hidden" id="issueId" value="${issue.issueid}"/>
				  <input type="hidden" id="issue" value="${issue}"/>
				  <input type="hidden" id="CommentsTitle" value="${issue.issuetitle}"/>
                </div>
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-success">Enter Commnets</button>
              </div>
            </form>
            </div>
            <!-- /.box-body -->
              <!-- comments box section end -->
          </div>
          <!-- /.box -->
        </div>
        <!-- comments Row section end-->
		</div>
		
		
		
		
	<!-- spearate div ny column width for table -->
		<div class="col-md-4">
	          <div class="box box-success">
	            <div class="box-header">
	              <h3 class="box-title">Showing issue #${issue.issueid}</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body table-responsive no-padding">
	              <table class="table table-hover" >
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
	            <!-- /.box-body -->
	          </div>
	          <!-- /.box -->
		</div>
		<!-- column table section end -->
	</div>
	 <!-- end row upper section issue description and table -->
	</jsp:body>
</t:dashboard_top>