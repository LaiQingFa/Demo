<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.net.URLDecoder"%>
<%@ taglib uri="http://www.itheima.com/UserTag" prefix="UserTag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta charset="UTF-8">
		<title>图书馆读者信息管理系统</title>
		<link rel="stylesheet" href="/User/main.css">
  </head>
  <body>
  	<div align="center">
 	<h1>${msg }</h1>
 	  <hr>
 	
 	<form action="${pageContext.request.contextPath }/servlet/LoginServlet" method="POST">
		<table border="1" class="big">
			<tr>
				<td style="width:150px;">读者名字:</td>
				<td style="width:350px;"><input  class="text" type="text" name="username" value="<UserTag:URLDecoder content="${cookie.remname.value }" encode="utf-8"/>"/></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input class="text" type="password" name="password"/></td>
			</tr>
		    <tr>
		          <td></td>
				<td><input class="btn" type="submit" value="登录"/></td>
				<%-- <td><a href="${pageContext.request.contextPath }/servlet/firstTurnToBackServlet">忘记密码</a></td> --%>
			</tr>
			
		</table>
		
		 			
		<div>
			
		</div>
		

 	</form>
 	</div>

  </body>
</html>
