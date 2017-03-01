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
  	<h1>读者信息注册</h1><hr>
  	<font color="red">${msg }</font>
  	<form action="${pageContext.request.contextPath}/servlet/RegistServlet" method="POST" >
  		<table border="1" class="big"  cellspacing="0" cellpadding="0">
  			<tr>
  				<td style="width:150px;">读者名字</td>
  				<td style="width:350px;"><input class="text" type="text" name="username" value="${param.username }" /></td>
  			</tr>
  			<tr>
  				<td>密码</td>
  				<td><input style="width:350px;height:30px;" type="password" name="password" /></td>
  			</tr>
  			<tr>
  				<td>确认密码</td>
  				<td><input style="width:350px;height:30px;" type="password" name="password2" /></td>
  			</tr>
  			<tr>
  				<td>图书证编号</td>
  				<td><input class="text" type="text" name="nickname" value="${param.nickname }"/></td>
  			</tr>
  			<tr>
  				<td>邮箱</td>
  				<td><input class="text" type="text" name="email" value="${param.email }" /></td>
  			</tr>
  			<tr>
  				<td>密保问题</td>
  				<td>
  				<select name="question"  style="width:350px;height:30px;" >
		       	 	 <c:forEach items="${requestScope.list}" var="question">
		       			<option  value="${question.name}">${question.name}
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
  				<td>验证码</td>
  				<td><input class="text" type="text" name="valistr" /></td>
  			</tr>
  			<tr>
  				
  				<td><img src="${pageContext.request.contextPath }/servlet/ValiImg" style="cursor: pointer" onclick="changeImg(this)"/></td>
  				<td><input class="btn" type="submit" value="注册" /></td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>
