<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!--js-->
<script src="js/jquery-2.1.1.min.js"></script> 
<!--icons-css-->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!--Google Fonts-->
<link href='http://fonts.useso.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
<!-- <link href='http://fonts.useso.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'> -->
<!--static chart-->
<script src="js/Chart.min.js"></script>
<!--//charts-->
<!-- geo chart -->
    <script src="http://cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
<!--     <script>window.modernizr || document.write('<script src="lib/modernizr/modernizr-custom.js"><\/script>')</script> -->
    <!--<script src="lib/html5shiv/html5shiv.js"></script>-->
     <!-- Chartinator  -->
    <script src="js/chartinator.js" ></script>
   

<!--skycons-icons-->
<script src="js/skycons.js"></script>
<!--//skycons-icons-->
</head>


<body>	
<div class="page-container">	
   <div class="left-content">
	   <div class="mother-grid-inner">
            <!--header start here-->
				<div class="header-main">
					<div class="header-left">
							<div class="logo-name">
									<a href="LoginOutAction!loginindex.action"> <h1>Library</h1> 
							
								  </a> 								
							</div>

						 </div>

          
							   <div class="profile_details">		
								<ul>
									<li class="dropdown profile_details_drop">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
											<div class="profile_img">	
												<span class="prfil-img"><img src="images/p1.png" alt=""> </span> 
												<div class="user-name">
											     <span>名字：${operatorName}</span>
													<span>操作员编号：${operatorIdnum}</span>
												</div>
												<i class="fa fa-angle-down lnr"></i>
												<i class="fa fa-angle-up lnr"></i>
												<div class="clearfix"></div>	
											</div>	
										</a>
										<ul class="dropdown-menu drp-mnu">
										
											<li> <a href="LoginOutAction!LogOut.action"><i class="fa fa-sign-out"></i> 退出</a> </li>
										</ul>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>				
						</div>
				     <div class="clearfix"> </div>	
				</div>
<!--heder end here-->
<!-- script-for sticky-nav -->
		<script>
		$(document).ready(function() {
			 var navoffeset=$(".header-main").offset().top;
			 $(window).scroll(function(){
				var scrollpos=$(window).scrollTop(); 
				if(scrollpos >=navoffeset){
					$(".header-main").addClass("fixed");
				}else{
					$(".header-main").removeClass("fixed");
				}
			 });
			 
		});
		</script>
		<!-- /script-for sticky-nav -->
<!--inner block start here-->
<div class="inner-block">



   <form  id="cahxun1" action="WorkerMnageAction!addWorker.action" method="post">
   <!--bagets-->
     <div class="typo-badges">
       <div class="appearance">
			 <h3 class="ghj">员工登记</h3>
				<div class="col-md-6">
					  <table class="table table-bordered">
						<tbody>
							<tr>
								<td>员工档案编号</td>
								<td><span class="badge">员工档案编号默认按流水号自增</span></td>
							</tr>
							<tr>
								<td>姓名(默认状态为启用)</td>
								<td><input name="operatorName1" value="" type="text"></td>
							</tr>
						</tbody>
					  </table>                    
				</div>
					<div class="col-md-6">
					  <table class="table table-bordered">
						<tbody>
							<tr>
								<td>登陆密码</td>
								<td><input name="operatorPasscode" value=""  type="text"></td>
							</tr>
							<tr>
								<td>电话</td>
								<td><input name="operatorPhone" value=""  type="text"></td>
							</tr>
						</tbody>
					  </table>                    
				</div>
				
			   <div class="clearfix"> </div>
			</div>
    <!--bagets-->
        	 	<div class="compose-block">
    	 		<input type="submit" value="确定">	
    	 	
    	 	</div>
    	 	</div>
     </form>


<!--copy rights start here-->

<!--COPY rights end here-->
</div>
</div>
<!--slider menu-->
    <div class="sidebar-menu">
		  	<div class="logo"> <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="#"> <span id="logo" ></span> 
			      <!--<img id="logo" src="" alt="Logo"/>--> 
			  </a> </div>		  
		    <div class="menu">
		      <ul id="menu" >
		        <li><a href="#"><i class="fa fa-cogs"></i><span>图书录入管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
		          <ul>
		           	 <li><a href="BookManageAction!BookCHAXUNINdex.action">图书查询</a></li>
		            <li><a href="BookManageAction!BookDengjiInDEX.action">图书录入</a></li>            
		          </ul>
		        </li>
		        <li id="menu-comunicacao" ><a href="#"><i class="fa fa-book nav_icon"></i><span>图书借阅管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
		          <ul id="menu-comunicacao-sub" >
		            <li id="menu-mensagens" ><a href="BorrowMessageAction!BorrowMessageDengjiINdex.action">图书借阅信息登记</a>		              
		            </li>
		            <li id="menu-arquivos" ><a href="BorrowMessageAction!BorrowMessageChaxunINdex.action">图书借阅信息查询</a></li>
		          </ul>
		        </li>
		        <li id="menu-academico" ><a href="#"><i class="fa fa-file-text"></i><span>读者信息管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
		          <ul id="menu-academico-sub" >
		           <li id="menu-academico-boletim" ><a href="ReaderMessageAction!addReaderIndex.action">新增读者</a></li>	
		            <li id="menu-academico-boletim" ><a href="ReaderMessageAction!manageReaderIndex.action">读者信息操作</a></li>		            
		          </ul>
		        </li>
		    
		         <li><a href="#"><i class="fa fa-cog"></i><span>员工管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
		         	 <ul id="menu-academico-sub" >
			            <li id="menu-academico-avaliacoes" ><a href="WorkerMnageAction!addWorkerIndex.action">员工添加</a></li>
                        <li id="menu-academico-avaliacoes" ><a href="WorkerMnageAction!workerManageIndex.action">员工信息操作</a></li>
		             </ul>
		         </li>
		      
		      </ul>
		    </div>
	 </div>
	<div class="clearfix"> </div>
</div>
<!--slide bar menu end here-->
<script>
var toggle = true;
            
$(".sidebar-icon").click(function() {                
  if (toggle)
  {
    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
    $("#menu span").css({"position":"absolute"});
  }
  else
  {
    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
    setTimeout(function() {
      $("#menu span").css({"position":"relative"});
    }, 400);
  }               
                toggle = !toggle;
            });
</script>
<!--scrolling js-->
<script src="/library/js/laydate/laydate.js"></script>
		<script src="js/jquery.nicescroll.js"></script>
		<script src="js/scripts.js"></script>
		<!--//scrolling js-->
<script src="js/bootstrap.js"> </script>
<!-- mother grid end here-->
</body>
</html>
