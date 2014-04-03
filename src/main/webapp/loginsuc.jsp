<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	OK,欢迎您${sessionScope.account.name }<br>
	<a href="edit_account.jsp">修改信息</a>
	<hr>
	<a href="act_reqEmpowerAction">申请授权</a>
	<hr>
	接收消息列表 <br>
	<s:iterator value="recvMsgs">
	用户<s:property value="sendAccount.id"/>
	<s:property value="content"/>
	<s:property value="state"/>
	<a href="act_empowerAction?accountId=<s:property value="sendAccount.id"/>">授权</a>
	<a href="act_delMsgAction?msgId=<s:property value="id"/>">删除</a><br>
	<br>
	</s:iterator>
	<hr>
	发送消息列表 <br>
	<s:iterator value="sendMsgs">
	用户<s:property value="recvAccount.id"/>
	<s:property value="content"/>
	<s:property value="state"/>
	<a href="act_delMsgAction?msgId=<s:property value="id"/>">删除</a><br>
	</s:iterator>
	<hr>
	订单列表<br>
	订单号&nbsp订单状态&nbsp操作<br>
	<s:iterator value="orders">
	<s:property value="orderId"/>
	<s:property value="orderState"/>
	<a href="act_editOrderAction?ordId=<s:property value='id'/>&&act=1">修改</a>
	<a href="act_delOrderAction?ordId=<s:property value='id'/>">删除</a>
	<a href="act_upgradeOrderAction?ordId=<s:property value='id'/>">审核</a>
	<a href="act_payOrderAction?ordId=<s:property value='id'/>">结账</a>
	<br>
	</s:iterator>
	<hr>
	<a href="act_preOrderAction?act=0">下发订单</a>
	<hr>
</body>
</html>
