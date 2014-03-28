<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>注册</title>
</head>
<body>
	<form action="act_registerAction" method="post">
		账号：<input type="text" name="account.name"/><br>
		密码:<input type="password" name="account.password"/><br>
		电话:<input type="text" name="account.tel"/><br>
		邮箱:<input type="text" name="account.email"/><br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>