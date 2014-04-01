<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="gb2312"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>µÇÂ½</title>
</head>
<body>
	<form action="act_orderAction" method="post">
		¶©µ¥ºÅ£º<input type="text" name="order.order_id"/><br/>
		Æ±ÖÖ£º<input type="text" name="ticketId"/><br>
		<input type="submit" value="Ô¤¶¨"/>
	</form>
</body>
</html>