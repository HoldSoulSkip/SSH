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
	OK,��ӭ��${sessionScope.account.name }
	<hr>
	<a href="act_reqEmpowerAction">������Ȩ</a>
	<hr>
	������Ϣ�б� <br>
	<s:iterator value="recvMsgs">
	�û�<s:property value="sendAccount.id"/>
	<s:property value="content"/>
	<s:property value="state"/>
	<a href="act_empowerAction?accountId=<s:property value="sendAccount.id"/>">��Ȩ</a><br>
	</s:iterator>
	<hr>
	������Ϣ�б� <br>
	<s:iterator value="sendMsgs">
	�û�<s:property value="recvAccount.id"/>
	<s:property value="content"/>
	<s:property value="state"/><br>
	</s:iterator>
	<hr>
	�����б�<br>
	<s:iterator value="orders">
	�����ţ�<s:property value="order_id"/>
	<s:property value="order_state"/><br>
	</s:iterator>
	<hr>
	<a href="order.jsp">�·�����</a>
	<hr>
</body>
</html>