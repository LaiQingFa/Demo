<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>河北大学工商学院图书管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">  
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="css/swipebox.css">
<!-- //Custom Theme files -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script> 
<!-- //js -->
<!-- web-fonts -->
<link href='http://fonts.useso.com/css?family=Cinzel+Decorative:400,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- //web-fonts -->
<!-- start-smooth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
		
		$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<!-- //end-smooth-scrolling -->	
</head>
  
  <body>
	<!-- banner -->
	<div class="banner">
		<div class="header"><!-- header -->
			<div class="container">		
				<nav class="navbar navbar-default">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1><a  href="#">Library</a></h1>
					</div>
					<!-- navbar-header -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#" class="active">首页</a></li>
							<li><a href="#about" class="scroll">关于</a></li>
							<li><a href="#menu" class="scroll">未来</a></li>

						</ul>	
						<div class="clearfix"> </div>	
					</div>
				</nav>
			</div> 
		</div>
		<!-- //header -->
		
		<!-- banner-text -->
		<div class="banner-text"> 
			<div class="flexslider">
				<ul class="slides">
					<li>
						<h2>用户登陆  </h2>
						<p>窗 竹 影 摇 书 案 上 ，野 泉 声 入 砚 池  中 。少 年 辛 苦 终 事 成 ， 莫 向 光 明 惰 寸 功 - - 〔 唐 〕杜 荀 鹤 《 闲 居 书 事 》 .</p>
						<a href="#" class="more" data-toggle="modal" data-target="#myModal">LOGIN</a>  
					</li>
					<li>
						<p>读 书 切 戒 在 慌 忙 ， 涵 泳 工 夫 兴 味 长 。未 晓 不 妨 权 放 过 ， 切 身 须 要 急 思 量  - - 宋  。 陆 九 渊《 读 书 》 .</p>				  
					</li>
				</ul>
			</div>  
			<!-- modal -->
			<div class="modal about-modal fade" id="myModal" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header"> 
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
							<h4 class="modal-title">欢迎登陆图书管理系统</h4>
						</div> 
						<div class="modal-body book-form">
							<form action="LoginOutAction!loginCheck.action" method="post">
								<div class="phone_email">
									<label>登陆账号: </label>
									<div class="form-text">									
										<input type="text" name="operatorName"  placeholder="User Name" required="">
									</div> 
								</div>
								<div class="phone_email phone_email1">
									<label>密码 : </label>
									<div class="form-text">										
									<input type="text" name="operatorPasscode" placeholder="password" required="">
									</div>
								</div>
								<input type="submit" value="登陆" />										
							</form>
						</div>
						<!-- Calendar -->
						<link rel="stylesheet" href="css/jquery-ui.css" />
						<script src="js/jquery-ui.js"></script>
						<script>
								$(function() {
									$( "#datepicker" ).datepicker();
								});
						</script>
						<!-- //Calendar -->  
					</div>
				</div>
			</div>
			<!-- //modal -->  
			<!-- FlexSlider -->
			<script defer src="js/jquery.flexslider.js"></script>
			<script type="text/javascript">
			$(window).load(function() {
			  $('.flexslider').flexslider({
				animation: "slide",
				controlsContainer: $(".custom-controls-container"),
				customDirectionNav: $(".custom-navigation a")
			  });
			});
			</script>
			<!-- //FlexSlider -->
		</div> 
		<!-- //banner-text --> 
	</div>
	<!-- //banner --> 
	<!-- welcome --> 
	<div id="about" class="welcome"> 
		<div class="container">
			<div class="agile-title">
				<h3> Welcome !</h3>
			</div>
			<div class="w3ls-row">
				<div class="col-md-6 welcome-left">
					<div class="welcome-img">
						<img src="images/picture.jpg" class="img-responsive zoom-img" alt=""/>
					</div>
					<div class="col-md-6 welcome-left-grids">
						<div class="welcome-img">
							<img src="images/image2.jpg" class="img-responsive zoom-img" alt=""/>
						</div>
					</div>
					<div class="col-md-6 welcome-left-grids">
						<div class="welcome-img">
							<img src="images/image3.jpg" class="img-responsive zoom-img" alt=""/>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-6 welcome-right"> 
					<p>河北大学工商学院创建于2001年，是由河北大学举办，经河北省人民政府批准，教育部首批确认的实施本科学历教育的全日制普通高等院校。河北大学工商学院位于河北大学新校区，以培养面向服务京津冀发展高素质应用型人才为目标，设置文、理、工、经、法、管、艺术等多个学科门类专业，是目前河北省办学规模最大、教学特色鲜明的综合性学院之一 </p>
					<div class="open-hours-row">
						<div class="col-md-3 open-hours-left">
							<h4>开  馆  时  间 </h4>
						</div>
						<div class="col-md-3 open-hours-left">
							<h6>周一至周五(周四除外)</h6>
							<h5>8am - 21pm</h5> 
						</div>
						<div class="col-md-3 open-hours-left">
							<h6> 周  四 </h6>
							<h5>8am - 2pm</h5> 
						</div>
						<div class="col-md-3 open-hours-left">
							<h6>周六至周日</h6>
							<h5>8am - 21pm</h5> 
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div> 
		</div>
	</div>
	<!-- //welcome --> 
	<!-- slid -->
	<div class="menu">
		<div class="container">
			<h4>Hebei University</h4>
			<h5>1000k <span>BOOKS</span></h5>
			<p>学院徽志是圆形徽标，与河北大学校徽一脉相承，蓝色代表河北大学，枫叶代表河北大学创新发展的新兴力量，下部的曲线表示水纹，有地理方位的寓意，也比喻对人才的培养。外环上方是“河北大学”的英文大写，下方是工商学院的篆写同河北大学字体相同。</p>
		</div> 
	</div>
	<!-- //slid -->
			
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="social-icon">
				<a href="#" class="social-button twitter"><i class="fa fa-twitter"></i></a>
				<a href="#" class="social-button facebook"><i class="fa fa-facebook"></i></a> 
				<a href="#" class="social-button google"><i class="fa fa-google-plus"></i></a> 
				<a href="#" class="social-button dribbble"><i class="fa fa-dribbble"></i></a>
				<a href="#" class="social-button skype"><i class="fa fa-skype"></i></a>
			</div>
			<p>河北大学工商学院 &copy; 2016.11.13.</p>
		</div>
	</div>
	<!-- //footer -->	 
	<!-- swipe box js -->
	<script src="js/jquery.swipebox.min.js"></script> 
	<script type="text/javascript">
			jQuery(function($) {
				$(".swipebox").swipebox();
			});
	</script>
	<!-- //swipe box js --> 
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->  
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>
