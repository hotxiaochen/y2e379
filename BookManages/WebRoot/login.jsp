<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  <h2>图书借阅系统</h2>
  <s:form action="userlogin.action" method="post" >
  <table>
  	<tr>
  	<th>登陆账号：</th>
  	<th>
  		<s:textfield name="BookUser.Name" />
  	</th>
  	</tr>
  	<tr>
  	<tr>
  	<th>登陆密码：</th>
  	<th>
  		<s:password name="BookUser.Password" />
  	</th>
  	</tr>
  	<tr>
  	<th colspan="2" >
  		<s:submit value="登陆" />
 	 </th>
  	</tr>
  </table>
  	
  </s:form>
  
  </body>
</html>
