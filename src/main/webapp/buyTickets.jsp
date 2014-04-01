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
      <ul id="orderInfo">
      	<li>
      		订单号：<span id="orderId" style="width: 100">11111111111</span>
      		预定日期：<span id="orderTime" style="width: 100">${showTime}</span>
      	</li>
      </ul>
      <ul id="consumerInfo">
        <li>
        	订票人：<span id="account_name" style="width: 100"></span>
        	等级：<span id="level" style="width: 100"></span>
        </li>
        <li>
        	邮箱：<input type="text" id="email" style="width: 100">
       		电话：<input type="text" id="phone" style="width: 100">
        </li>
      </ul>
      <ul id="ticketsInfo">
        <li>
        	使用时间：<input type="text" id="beginTime" onclick="">
        	票种：<select name="ticket_type" id="ticket_type" onchange="">
        	  <option>--请选择--</option>
        	</select>
        	票价：<input type="text" name="price" id="price" disabled>
        </li>
      </ul>
      <ul>
        <li><button>确认订单</button>
      </ul>
    </div>  
    
  </div>
  
  <script src="/ss/js/jquery-1.11.0.min.js"></script>
  <script src="/ss/js/jquery-2.0.3.min.js"></script>
  <script type="text/javascript">
	function showTime(){
		var nowDate = new Date();
		//alert(nowDate.toLocaleTimeString());
		var date = nowDate.toLocaleString();
		alert(date);
		$("#orderTime").each(function(){
			$(this).html(date);
			});
		
	}
	$("#showTime").click(function(){
		var nowDate = new Date();
		var date = nowDate.toLocaleString();
		alert(date);
		$("#orderTime").html(date);
		});
	$.ajax();
  </script>
</body>
</html>