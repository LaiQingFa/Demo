<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta charset="UTF-8">

		<link rel="stylesheet" href="/User/main.css">

  </head>
  <body style="text-align: center;">
  	<h1>读者信息</h1><hr>
  	
  <%-- 	<form action="${pageContext.request.contextPath}/servlet/BackServlet" method="POST" > --%>
  		<table border="1" class="big">
  			<tr>
  				<td>读者姓名</td>
  				<td>借阅证编号</td>

                <td>操作</td>
  			</tr>
  
  			 	 <%-- <s:iterator value="listuser" var="user" status="n"> --%>
  			 	 
  			 	 
  			     <tr>
		         <td>${user1username }</td>
		         <td>${user1nickname }</td>
                 <td><a href="${pageContext.request.contextPath }/servlet/ShanchuServlet?username=${user1username}">删除</a></td>    
		         </tr>
		       	 <tr>
		         <td>${user2username}</td>
		         <td>${user2nickname }</td>

                 <td><a href="${pageContext.request.contextPath }/servlet/ShanchuServlet?username=${user2username}">删除</a></td>    
		         </tr>
		      	 <tr>
		         <td>${user3username }</td>
		         <td>${user3nickname}</td>
                 <td><a href="${pageContext.request.contextPath }/servlet/ShanchuServlet?username=${user2username}">删除</a></td>    
		         </tr>
		        <tr>
		         <td>${user4username}</td>
		         <td>${user4nickname }</td>
                 <td><a href="${pageContext.request.contextPath }/servlet/ShanchuServlet?username=${user4username}">删除</a></td>    
		         </tr>
		         <tr>
		         <td></td>
		         <td></td>
                 <td></td>    
		         </tr>
		      <%--    </s:iterator>	 --%>				
  			<tr>
  			<td></td>
			  <td></td>
  			<td ><a href="${pageContext.request.contextPath }/successloginJsp.jsp" class="button light hvr-grow">返回首页</a></td>
  				<td ></td>
  			</tr>
  		   </table>
  <!-- 	</form> -->
  </body>
</html>
