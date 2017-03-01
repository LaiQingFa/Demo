<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta charset="UTF-8">

		<link rel="stylesheet" href="/User/main.css">

  </head>
  <body style="text-align: center;">
  	<h1>读者信息</h1><hr>
  	
  	<form action="${pageContext.request.contextPath}/servlet/BackServlet" method="POST" >
  		<table border="1" class="big">
  			<tr>
  				<td style="width:150px;">读者姓名</td>
  				<td style="width:350px;">${user.username }</td>
  			</tr>
  			<tr>
  				<td>密码</td>
  				<td>${user.password}
       			</td>
  			</tr>
  			
  			<tr>
  			<td>借阅证编号</td>
  			<td>${user.nickname }</td>
  			</tr>
  			 
  			 <tr>
  			<td>邮箱</td>
  			<td>${user.email }</td>
  			</tr>
  			  			 
  			 <tr>
  			<td colspan='2'></td>

  			</tr>
  			<tr>
  			<td></td>
  			<td><a href="${pageContext.request.contextPath }/successloginJsp.jsp" class="button light hvr-grow">返回首页</a></td>
  			
  			</tr>
  		   </table>
  	</form>
  </body>
</html>
