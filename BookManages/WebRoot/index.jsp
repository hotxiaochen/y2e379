<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript" src="js/jquery-1.8.0.min.js" ></script>
  
  <body>
  
  <h2>图书系统管理员欢迎您</h2>
 
  
  <s:form action="bookall.action" method="post" id="form" >
  	
  	<s:hidden id="pIndex" name="page.pageIndex" value="1" />
  <div>
	<table border="1" >
		<tr>
			<th colspan="8"><h2>图书详细信息列表</h2></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		
		<tr>
			<th>书名</th>
			<th>作者</th>
			<th>出版社</th>
			<th>出版日期</th>
			<th>页数</th>
			<th>价格</th>
			<th>内容摘要</th>
			<th>操作</th>
		</tr>
		<s:if test="page.list.size() > 0">
		<s:iterator value="page.list" var="item" >
			<tr>
				<td><s:property value="#item.bookCode" /> </td>
				<td><s:property value="#item.bookName" /></td>
				<td><s:property value="#item.bookAtuthor" /></td>
				<td><s:property value="#item.publishRess" /></td>
			</tr>
		</s:iterator>
		</s:if>
		<s:else>
			<tr>
				<th colspan="6" >对不起没有符合条件的结果</th>
			</tr>
		</s:else>
	</table>
  </div>
     <s:if test="page.pageIndex > 1">
	 	<a  href="javascript:pageInfo(${page.pageIndex-1 });" >上一页</a>
     </s:if>
	 <s:if test="page.pageIndex-2 >=1">
	 	<a href="javascript:pageInfo(${page.pageIndex-2 });" ><s:property value="page.pageIndex-2" /> </a>
	 </s:if>
	 <s:if test="page.pageIndex-1 >=1">
	 	<a href="javascript:pageInfo(${page.pageIndex-1 });" ><s:property value="page.pageIndex-1" /> </a>
	 </s:if>
	 
	 <s:property value="page.pageIndex" />
	 
	 <s:if test="page.pageIndex+1 <= page.totalPage ">
	 	<a href="javascript:pageInfo(${page.pageIndex+1 });" ><s:property value="page.pageIndex+1" /> </a>
	 </s:if>
	 <s:if test="page.pageIndex+2 <= page.totalPage ">
	 	<a href="javascript:pageInfo(${page.pageIndex+2 });" ><s:property value="page.pageIndex+2" /> </a>
	 </s:if>
	 
	 <s:if test="page.pageIndex < page.totalPage">
	 	<a href="javascript:pageInfo(${page.pageIndex+1 });" >下一页</a>
	 </s:if>
	 总：<s:property value="page.totalPage" />
  </s:form>
  </body>
  <script type="text/javascript">
 
	 function pageInfo(num){
		/*  alert($("#pIndex").val()); */
		 $("#pIndex").val(num);
		/*  alert($("#pIndex").val()); */
		 $("#form").submit();
	 }
	
  </script>
</html>
