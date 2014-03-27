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
    
    <title>My JSP 'reg.jsp' starting page</title>
    
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
    <s:form action="accAction_doReg" namespace="/" method="post">
    <table>
    	<tr>
    		<td>用户名：</td>
    		<td><s:textfield name="account.name" />
    		<s:fielderror><s:param>name</s:param></s:fielderror>
    		</td>
    	</tr>
    	<tr>
    		<td>密码：</td>
    		<td><s:password name="account.password" />
    	    	<s:fielderror><s:param  value="password"/></s:fielderror>
    		</td>
    	</tr>
    	<tr>
    		<td>确认密码：</td>
    		<td><s:password name="confirmPassword"/>
    			
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2">
    			<s:submit value="注册" />
    	    </td>
    	</tr>
    	</table>
    </s:form>
  </body>
</html>
