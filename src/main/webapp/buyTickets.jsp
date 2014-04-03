<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta content="X-UA-Compatible" content="IE=Edge">
<title>购票</title>
</head>
<body>

  <div>
    <div>
    <form action="act_orderAction" method="post">
    <input type="hidden" name="act" value='<s:property value="act"/>'/>
	<input type="hidden" name="ordId" value='<s:property value="ordId"/>'/>
    <table>
      <tr id="orderInfo">
      	<td width="80">订单号：<td><input type="text" name="order.orderId" value='<s:property value="orderId"/>' readonly="readonly"/>
      	<td width="80">定日期：<td><input type="text" name="order.orderTime" value='<s:property value="orderTime"/>' readonly="readonly"/>     	
      <tr id="consumerInfo">
        <td width="80">订票人：<td>${sessionScope.account.name }
        <td width="80">等级：<td><s:property value="account.level"/> 
      <tr  id="consumerInfo">       
        <td width="80">邮箱：<td><input type="text" name="order.email" value='<s:property value="email"/>'/>
       	<td width="80">电话：<td><input type="text" name="order.tel" value='<s:property value="tel"/>'/>        
      </tr>
      <tr id="ticketsInfo">
        <td width="80">使用时间：<td><input type="text" name="order.ticUseTime" value="<s:property value="orderUseTime"/>" onclick="selectDate(this,this)">
      </tr>
      <tr>
        <td width="80">票种：<td><select name="ticket_type" id="ticket_id" onchange="" style="margin-left:2px; width:153px">
        	        <option>---请选择---</option>
        	      </select><input type="hidden" name="ticketId" value="1"/>
        <td width="80">票价：<td><input type="text" name="price" id="price" disabled>       
      </table>
      <input type="submit" style="width: 100px;height: 30px" value="确认订单"/>
      </form>
    </div>  
    
  </div>
  
  <script src="js/jquery-1.11.0.min.js"></script>
  <script src="js/calendar.js"></script>
  <script type="text/javascript">
  </script>
</body>
</html>