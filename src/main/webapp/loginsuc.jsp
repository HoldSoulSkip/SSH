<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>
	OK,欢迎您${sessionScope.account.name }
	<hr>
	<a href="act_reqEmpowerAction">申请授权</a>
	<hr>
	接收消息列表 <br>
	<s:iterator value="recvMsgs">
	用户<s:property value="sendAccount.id"/>
	<s:property value="content"/>
	<s:property value="state"/>
	<a href="act_empowerAction?accountId=<s:property value="sendAccount.id"/>">授权</a><br>
	</s:iterator>
	<hr>
	发送消息列表 <br>
	<s:iterator value="sendMsgs">
	用户<s:property value="recvAccount.id"/>
	<s:property value="content"/>
	<s:property value="state"/><br>
	</s:iterator>
	<hr>
	订单列表<br>
	<s:iterator value="orders">
	订单号：<s:property value="order_id"/>
	<s:property value="order_state"/><br>
	</s:iterator>
	<hr>
	<a href="order.jsp">下发订单</a>
	<hr>
</body>
</html>