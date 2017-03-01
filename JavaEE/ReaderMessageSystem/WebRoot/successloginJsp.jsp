<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- SITE TITLE -->
<title></title>

<!-- =========================
   Meta Information
============================== -->
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">

<!-- =========================
   Bootstrap and animation
============================== -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/animate.min.css">

<!-- =========================
   Fonts, typography and icons
============================== -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/typography.css">

<!-- =========================
   Carousel, lightbox and circle generator
============================== -->
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/nivo-lightbox.css">
<link rel="stylesheet" href="css/nivo-lightbox-default.css">
<link rel="stylesheet" href="css/jquery.circliful.css">

<!-- ***** Custom Stylesheet ***** -->
<link rel="stylesheet" href="css/main-blue.css">

<!-- ***** Responsive fixes ***** -->
<link rel="stylesheet" href="css/responsive.css">

<!-- Header scripts -->
<script src="js/vendor/modernizr-2.8.3.min.js"></script>
<script src="js/queryloader2.min.js"></script>

<!-- =========================
   Preloader
============================== -->
<script>
	window.addEventListener('DOMContentLoaded', function() {
		"use strict";
		new QueryLoader2(document.querySelector("body"), {
			barColor: "#3498db",
			backgroundColor: "#111",
			percentage: true,
			barHeight: 1,
			minimumTime: 200,
			fadeOutTime: 1000
		});
	});
	var alert_color_success_background = '#3498db';
	var alert_color_error_background = '#CF000F';

</script>
</head>
  
  <body>
<!--[if lt IE 8]>
	<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<!-- =========================
   Fullscreen menu
============================== -->


<!-- *****  hamburger icon ***** -->
<a href="javascript:void(0)" class="menu-trigger">
   <div class="hamburger">
	 <div class="menui top-menu"></div>
	 <div class="menui mid-menu"></div>
	 <div class="menui bottom-menu"></div>
   </div>
</a>


<!-- =========================
   Header
============================== -->
<header id="header">
	<div id="myCarousel" class="carousel slide">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
			<li data-target="#myCarousel" data-slide-to="4"></li>
		</ol>

		<!-- Wrapper for Slides -->
		<div class="carousel-inner">


			<!-- =========================
			   Header item 1
			============================== -->
			<div class="item active">

				<!-- Set the first background image using inline CSS below. -->
				<div class="fill" style="background-image:url('img/slider/slider-3.jpg');">
				</div>
				<div class="carousel-caption">
					<h1 class="light mab-none">图书馆读者信息管理系统</h1>
					<h1 class="light margin-bottom-medium mat-none">${sessionScope.user.username} <strong class="bold-text"> 您已成功登陆</strong></h1>
					<p class="light margin-bottom-medium"><a style="margin-left:200px;" href="${pageContext.request.contextPath }/servlet/TurnToPersonServlet?name=${sessionScope.user.username}">个人信息</a></p>
					
					<p class="light margin-bottom-medium"><a style="margin-left:200px;" href="${pageContext.request.contextPath }/servlet/ShowChengyuanList">读者信息查询以及操作</a></p>
					
					<p class="light margin-bottom-medium">Industrial and Commercial College，Hebei University</p>
					<div class="call-button">
						<div class="row">
		
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="overlay"></div>
			</div>

			<!-- =========================
			   Header item 2
			============================== -->


			<!-- =========================
			   Header item 3
			============================== -->

			<!-- =========================
			   Header item 4
			============================== -->
			
			<!-- =========================
			   Header item 5
			============================== -->

		</div> <!-- *** end wrapper *** -->

		<!-- Carousel Controls -->
		<a class="left carousel-control hidden-xs" href="#myCarousel" data-slide="prev">
			<span class="icon-prev icon-arrow-left"></span>
		</a>
		<a class="right carousel-control hidden-xs" href="#myCarousel" data-slide="next">
			<span class="icon-next icon-arrow-right"></span>
		</a>
	</div>
</header> <!-- *** end Header *** -->


<!-- =========================
   Call to action
============================== -->
<section id="call-to-action" class="call-to-action main-bg">
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-1 col-sm-6 col-sm-offset-1 col-xs-12 wow slideInLeft animated">
				<p class="light-text">图书馆读者信息管理系统有待完善，如果没有必要，可以退出</p>
			</div>
			
			<div class="col-md-4 col-sm-4 col-xs-12 button-container wow slideInRight animated">
				<a href="${pageContext.request.contextPath }/servlet/LogoutServlet" class="button light internal-link pull-left hvr-grow" data-rel="#portfolio">退出</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</section> <!-- *** end call-to-action *** -->





<!-- =========================
   Footer
============================== -->
<footer id="footer" class="footer">
	<div class="container padding-large text-center">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<p class="margin-bottom-medium">河北大学工商学院，位于保定市，建于2001年，是由河北大学创办，经河北省人民政府批准，教育部首批确认的实施本科学历教育的全日制普通高等院校。[1] 
河北大学工商学院位于河北大学新校区，以培养面向服务京津冀发展高素质应用型人才为目标，设置文、理、工、经、法、管、艺术等多个学科门类专业，是目前河北省办学规模最大、教学特色鲜明的综合性学院之一。</p>

				<!-- =========================
				   Social icons
				============================== -->
				<ul class="social margin-bottom-medium">
					<li class="facebook hvr-pulse"><a href="#"><i class="fa fa-facebook"></i></a></li>
					<li class="twitter hvr-pulse"><a href="#"><i class="fa fa-twitter"></i></a></li>
					<li class="g-plus hvr-pulse"><a href="#"><i class="fa fa-google-plus"></i></a></li>
					<li class="linkedin hvr-pulse"><a href="#"><i class="fa fa-linkedin"></i></a></li>
					<li class="youtube hvr-pulse"><a href="#"><i class="fa fa-youtube"></i></a></li>
					<li class="instagram hvr-pulse"><a href="#"><i class="fa fa-instagram"></i></a></li>
					<li class="behance hvr-pulse"><a href="#"><i class="fa fa-behance"></i></a></li>
					<li class="dribbble hvr-pulse"><a href="#"><i class="fa fa-dribbble"></i></a></li>
				</ul>
				<p class="copyright">
					Copyright &copy; 2016.Industrial and Commercial College，Hebei University</a>
				</p>
			</div>
		</div>
	</div>
</footer> <!-- *** end Footer *** -->

<!-- =========================
   Back to top button
============================== -->
<div class="back-to-top" data-rel="header">
	<i class="icon-up"></i>
</div>

<!-- =========================
 JavaScripts
============================== -->
<script src="js/vendor/jquery-1.11.1.js"></script>
<script src="js/vendor/jquery-migrate-1.2.1.min.js"></script>
<!---<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBOsiOjjoOiFBmXLU0adNjsnCKLpcDfRyI"></script>--->
<script src="js/twitterFetcher_min.js"></script>
<script src="js/vendor/bootstrap.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/imagesloaded.pkgd.min.js"></script>
<script src="js/jquery.easing.min.js"></script>
<script src="js/appear.js"></script>
<script src="js/jquery.circliful.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/nivo-lightbox.min.js"></script>
<script src="js/isotope.pkgd.min.js"></script>
<script src="js/notie.js"></script>
<script src="js/main.js"></script>
</body>
</html>
