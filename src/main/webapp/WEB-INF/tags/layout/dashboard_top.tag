<%@tag description="iTrack Layout" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="sidebar" fragment="true" %>
<%@attribute name="contentHeader" fragment="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
 @author  Saurav Wahid<swahidfx@gmail.com>
 @version	1.0.0
 @since	1.0.0
 -->
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>IssueTracking System</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css' />">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<c:url value='/resources/css/AdminLTE.min.css' />">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="<c:url value='/resources/css/skins/skin-green-light.min.css' />">
    <!-- REQUIRED JS SCRIPTS -->

    <!-- jQuery 2.1.4 -->
    <script src="<c:url value='/resources/jquery/2.1.4/jquery.min.js' />"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
    <!-- AdminLTE App -->
    <script src="<c:url value='/resources/js/app.min.js' />"></script>
    <script src="<c:url value='/resources/js/moment.js' />"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <jsp:invoke fragment="header"/>
  </head>
  <!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |
  |               | sidebar-mini                            |
  |---------------------------------------------------------|
  -->
<body class="hold-transition skin-green-light layout-top-nav">
    <c:url var="index" value="/" />
    <div class="wrapper">

      <!-- Main Header -->
      <header class="main-header">
        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top">
           <div class="navbar-header">
          <a href="{index}" class="navbar-brand"><b>iTrack</b>System</a>
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
            <i class="fa fa-bars"></i>
          </button>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse pull-left" id="navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">DashBoard<span class="sr-only">(current)</span></a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Project <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#">Search Project</a></li>
                <li><a href="#">Current Project</a></li>
                <li class="divider"></li>
                <li><a href="#">View All Project</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Issue <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#">Current Search</a></li>
                <li><a href="#">Search For issues</a></li>
                <li class="divider"></li>
                <li><a href="#">Open My Issue</a></li>
                <li><a href="#">Reported by Me</a></li>
                <li class="divider"></li>
                <li><a href="#">Recent Open Issue</a></li>
                <li><a href="#">Recent Close Issue</a></li>
                <li><a href="#">Recent Pending Issue</a></li>
              </ul>
            </li>
          </ul>
          
        </div>
          
          <!-- Navbar Right Menu -->
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              
              <!-- User Account Menu -->
              <li class="dropdown user user-menu">
                <!-- Menu Toggle Button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <!-- The user image in the navbar-->
                  <img src="<c:url value='/resources/images/avatar.png' />" class="user-image" alt="User Image">
                  <!-- hidden-xs hides the username on small devices so only the image appears. -->
                  <span class="hidden-xs">${user.username}</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- The user image in the menu -->
                  <li class="user-header">
                    <img src="<c:url value='/resources/images/avatar.png' />" class="img-circle" alt="User Image">
                    <p>
                      ${user.firstName} ${user.lastName} - ${user.role.rolename}
                      <small>Member since ${user.regdate}</small>
                    </p>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="profile" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href='<c:url value="/logout"></c:url>' class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
       		<jsp:invoke fragment="contentHeader"/>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- Your Page Content Here -->
            <jsp:doBody/>
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <!-- Main Footer -->
      <footer class="main-footer">
        <!-- Default to the left -->
        <jsp:invoke fragment="footer"/>
        <strong>Copyright &copy; 2016 <a href="#">@Javabase Inc.</a></strong> All rights reserved.
      </footer>
    </div><!-- ./wrapper -->


    <!-- Optionally, you can add Slimscroll and FastClick plugins.
         Both of these plugins are recommended to enhance the
         user experience. Slimscroll is required when using the
         fixed layout. -->
  </body>
</html>
