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
  
  
  <s:form action="bookadd.action" method="post" >
  <table>
  
  <tr>
  	<th colspan="2"><h2>增加图书</h2></th>
  	<th></th>
  	<tr>
  	
  	<th>书名：</th>
  	<th>
  		<s:textfield name="Book.Name" />
  	</th>
  	
  	</tr>
  	
  	<tr>
  	<th>作者：</th>
  	<th>
  		<s:password name="BookUser.Atuthor" />
  	</th>
  	</tr>
  	
  	<tr>
  	<th>出版社：</th>
  	<th>
  		<s:password name="BookUser.Publish" />
  	</th>
  	</tr>
  	
  	 <tr>
  	<th>出版日期：</th>
  	<th>
  		<s:password name="BookUser.PublishDate" />
  	</th>
  	</tr>
  	
  	<tr>
  	<th>页数：</th>
  	<th>
  		<s:password name="BookUser.Page" />
  	</th>
  	</tr>
  	
  	<tr>
  	<th>价格：</th>
  	<th>
  		<s:password name="BookUser.Price" />
  	</th>
  	</tr>
  	
  	<tr>
  	<th>内容摘要：</th>
  	<th>
  		<s:password name="BookUser.Content" />
  	</th>
  	</tr>
  	<tr>
  	<th colspan="2" >
  		<s:submit value="提交" /><s:submit value="返回" />
 	 </th>
  	</tr>
  </table>
  	
  </s:form>
  
  </body>
</html>
