<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- SITE TITLE -->
<title>UniversityLibrary</title>

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
<link rel="stylesheet" href="css/main.css">

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
			barColor: "#e74c3c",
			backgroundColor: "#111",
			percentage: true,
			barHeight: 1,
			minimumTime: 200,
			fadeOutTime: 1000
		});
	});
	var alert_color_success_background = '#e74c3c';
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
				<div class="fill" style="background-image:url('img/slider/slider-4.jpg');">
				</div>
				<div class="carousel-caption">
					<h1 class="light mab-none"><strong class="bold-text">图书馆读者信息管理系统</strong></h1>				
					<p class="light margin-bottom-medium">Library reader information management system</p>
					<div class="call-button">
						<div class="row">
							<div class="col-md-4 col-md-offset-2 col-sm-4 col-sm-offset-2 col-xs-12">
								<a href="<%=basePath %>/login.jsp" class="button pull-right internal-link bold-text light hvr-grow" data-rel="#portfolio">登陆</a>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<a href="${pageContext.request.contextPath }/servlet/TurnTo" class="button pull-left internal-link bold-text main-bg hvr-grow" data-rel="#about-us">注册</a>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="overlay"></div>
			</div>

<!-- =========================
 



<!-- =========================
   Map
============================== -->
<section id="map" class="map">
	<div id="map-container">

	</div>
</section> <!-- *** end Map Container *** -->


<!-- =========================
   Send Message
============================== -->
<section id="send-message" class="send-message main-bg white-color text-center">
	<div class="send-icon" data-toggle="modal" data-target="#contact-form">
		<i class="fa fa-paper-plane"></i>
	</div>
	<p class="light-text">Have any <span class="bold-text">project</span>? Send a <span class="bold-text">message</span ></p>

	

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
