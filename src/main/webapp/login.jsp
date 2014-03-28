<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>登陆</title>
</head>
<body>
	<form action="act_loginAction" method="post">
		账号：<input type="text" name="username"/><br>
		密码:<input type="password" name="password"/><br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>