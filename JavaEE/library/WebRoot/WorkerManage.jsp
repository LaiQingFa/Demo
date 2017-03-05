<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<link href='http://fonts.useso.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
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
									<!--<img id="logo" src="" alt="Logo"/>--> 
								  </a> 								
							</div>
							
							<div class="clearfix"> </div>
						 </div>
						 <div class="header-right">
							<div class="profile_details_left">
							<!--notifications of menu start -->
								<ul class="nofitications-dropdown">
									<li class="dropdown head-dpdn">
										
									<li class="dropdown head-dpdn">
										
									<li class="dropdown head-dpdn">
										
											</li>
										</ul>
									</li>	
								</ul>
								<div class="clearfix"> </div>
							</div>
							<!--notification menu end -->
							<div class="profile_details">		
								<ul>
									<li class="dropdown profile_details_drop">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
											<div class="profile_img">	
												<span class="prfil-img"><img src="images/p1.png" alt=""> </span> 
												<div class="user-name">
													
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
    <div class="blank">
        	<h2>员工查询</h2>
        	<p>员工档案编号查询
        	</p>
    	<form id="cahxun" action="WorkerMnageAction!searchWorker.action" method="post" >
			<input type="text" name="operatorIdnum1" value=""  placeholder="Search..." required="">	
			<input type="submit" value="查询">					
		</form>

    	<div class="blankpage-main">
    	
    	<div class="index_right">
      <div class="h10"></div>
      <table border="0" width="820" class="yujing_cc yjjl4_cc">
              <tr class="hang01">
                <td>员工档案编号</td>
                <td>姓名</td>
                <td>状    态</td>
                <td>电话</td> 
                <td>密码</td>
                <c:if test="${operatorStateIndex==0}"><td>操作</td></c:if> 
                    <c:if test="${operatorStateIndex==1}"><td></td></c:if>   
                        <c:if test="${operatorStateIndex==0}"><td>操作</td></c:if>   
                            <c:if test="${operatorStateIndex==1}"><td></td></c:if>              
            
               
                           
              </tr>
              <tr>
               <td>${operator.operatorIdnum}</td>
                <td>${operator.operatorName}</td>
                <c:if test="${operator.operatorState==0}"><td>超级管理员</td></c:if>
                <c:if test="${operator.operatorState==1}"><td>员工</td></c:if>
                <c:if test="${operator.operatorState==2}"><td>禁用</td></c:if>
		        <td>${operator.operatorPhone}</td>
		        <td>${operatorPasscode}</td>
                
                 <c:if test="${operatorStateIndex==0}"> <td><a href="WorkerMnageAction!updateWorkerINdex.action?operatorIdnum1=${operator.operatorIdnum}&operatorName1=${operator.operatorName}&operatorState=${operator.operatorState}&operatorPhone=${operator.operatorPhone}&operatorPasscode=${operatorPasscode}" class="btn ">修改</a></td></c:if> 
                  <c:if test="${operatorStateIndex==1}"><td></td></c:if> 
                <c:if test="${operatorStateIndex==0}"> <td><a href="WorkerMnageAction!editWorker.action?operatorIdnum1=${operator.operatorIdnum}&operatorName1=${operator.operatorName}&operatorState=${operator.operatorState}" class="btn ">删除</a></td></c:if> 
                  <c:if test="${operatorStateIndex==1}"><td></td></c:if> 
                </tr>
                    
              <tr>
              	<td colspan="9" class="last_anniu"></td>
                </tr>
            </table>
 

    	  </div>
    </div>
</div>
<!--inner block end here-->
<!--copy rights start here-->
<div class="copyrights">
	 <p>图书管理系统@2016</a></p>
</div>	
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
		<script src="js/jquery.nicescroll.js"></script>
		<script src="js/scripts.js"></script>
		<!--//scrolling js-->
<script src="js/bootstrap.js"> </script>
<!-- mother grid end here-->
</body>
</html>
