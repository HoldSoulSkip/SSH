<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>ע��</title>
</head>
<body>
	<form action="act_registerAction" method="post">
		�˺ţ�<input type="text" name="account.name"/><br>
		����:<input type="password" name="account.password"/><br>
		�绰:<input type="text" name="account.tel"/><br>
		����:<input type="text" name="account.email"/><br>
		<input type="submit" value="�ύ"/>
	</form>
</body>
</html>