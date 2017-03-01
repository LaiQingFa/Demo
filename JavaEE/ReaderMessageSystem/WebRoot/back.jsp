<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta charset="UTF-8">
		<title>图书馆读者信息管理系统</title>
		<link rel="stylesheet" href="/User/main.css">
  	<script type="text/javascript">
  		function changeImg(img){
  			img.src = img.src+"?time="+new Date().getTime();
  		}
  	</script>
  </head>
  <body style="text-align: center;">
  	<h1>找回密码</h1><hr>
  	<font color="red">${msg }</font>
  	<form action="${pageContext.request.contextPath}/servlet/BackServlet" method="POST" >
  		<table border="1" class="big">
  			<tr>
  				<td style="width:150px;">用户名</td>
  				<td style="width:350px;"><input class="text" type="text" name="name"  "/></td>
  			</tr>
  			<tr>
  				<td>密保问题</td>
  				<td>
  				<select name="question" style="width:350px;">
		       	 	 <c:forEach items="${requestScope.list}" var="question">
		       			<option name="question" value="${question.name}">${question.name}
		       			</option>
		       	  	 </c:forEach>
       			</select>
       			</td>
  			</tr>
  			
  			<tr>
  			<td>密保答案</td>
  			<td><input class="text" type="text" name="answer" /></td>
  			</tr>
  			
  			<tr>
  			<td><input class="btn" type="submit" value="提交"></td>
  			</tr>
  		   </table>
  	</form>
  </body>
</html>
