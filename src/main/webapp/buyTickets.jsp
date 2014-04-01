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
    <table>
      <tr id="orderInfo">
      	<td width="80">订单号：<td><span id="orderId"></span>
      	<td width="80">定日期：<td><span id="orderTime">${showTime}</span>      	
      <tr id="consumerInfo">
        <td width="80">订票人：<td><span id="account_name"></span>
        <td width="80">等级：<td><span id="level"></span> 
      <tr  id="consumerInfo">       
        <td width="80">邮箱：<td><input type="text" id="email">
       	<td width="80">电话：<td><input type="text" id="phone">        
      </tr>
      <tr id="ticketsInfo">
        <td width="80">使用时间：<td><input type="text" id="beginTime" onclick="selectDate(this,this)">
      </tr>
      <tr>
        <td width="80">票种：<td><select name="ticket_type" id="ticket_type" onchange="" style="margin-left:2px; width:153px">
        	        <option>---请选择---</option>
        	      </select>
        <td width="80">票价：<td><input type="text" name="price" id="price" disabled>       
      </table>
      <button style="width: 100px;height: 30px">确认订单</button>
    </div>  
    
  </div>
  
  <script src="/ss/js/jquery-1.11.0.min.js"></script>
  <script src="/ss/js/calendar.js"></script>
  <script type="text/javascript">
  </script>
</body>
</html>