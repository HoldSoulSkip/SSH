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
    
    <title>My JSP 'infoList.jsp' starting page</title>
    
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
		<s:if test="infos.isEmpty() == true">目前没有任何公告</s:if >
		<s:else>
			<table>
				<tr>
					<td colspan="10" style="height: 5px"></td>
				</tr>
				<tr>
					<td colspan="10" class="tdHeader">公告：</td>
				</tr>
				<tr>
					<td colspan="10" style="height: 5px"></td>
				</tr>
				<tr>
					<td >ID</td>
					<td >信息标题</td>
					<td >创建时间</td>
					<td >查看</td>
					
				</tr>
				<s:iterator value="infos">
					<s:set var="sId" value="id" />
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="title" /></td>
						<td><s:date name="info_time" format="yyyy/MM/dd HH:mm:ss" /></td>
						<td><s:a action="InfoAction_lookInfo?sid=%{#sId}" >查看</s:a></td>
					</tr>
				</s:iterator>
			</table>
		</s:else>
	</body>
</html>
