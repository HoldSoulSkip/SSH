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
<script type="text/javascript">
</script>
</head>
<body>
<input type="text" value="hello" id="te"/>
  <div>
    <table>
      <tr id="orderInfo">
      	<td width="80">订单号：</td>
      	<td><span id="order.orderId"></span></td>
      	<td width="80">定日期：</td>
      	<td><span id="orderorderTime">${showTime}</span></td>    	
      <tr id="consumerInfo">
        <td width="80">订票人：</td>
        <td><span id="account_name">${sessionScope.account.name }</span></td>
        <td width="80">等级：</td>
        <td><span id="level"></span></td>
      <tr  id="consumerInfo">       
        <td width="80">邮箱：</td>
        <td><input type="text" id="email"></td>
       	<td width="80">电话：</td>
       	<td><input type="text" id="phone"></td>     
      </tr>
      <tr id="ticketsInfo">
        <td width="80">使用时间：</td>
        <td><input type="text" id="use_time" value="19910125" onclick="selectDate(this,this);showTickets()"></td>
      <tr>
        <td width="80">票种：</td>
        <td><select name="ticket_type" id="ticket_type" onchange="showPrice()" style="margin-left:2px; width:153px">
        	        <option>---请选择---</option>
        	</select></td>
        <td width="80">票价：</td>
        <td><input type="text" name="price" id="price" disabled> </td>      
      </table>
      <button style="width: 100px;height: 30px">确认订单</button>      
  </div>
  
  <script src="js/jquery-1.11.0.min.js"></script>
  <script src="js/calendar.js"></script>
  <script type="text/javascript">
  var time = $("#use_time").val();
  var prices=new Array();
  var testjson=null;
    function showTickets(){ 
    	window.setInterval("show()",300);
    } ;
    function show(){
    	if($("#use_time").val()!=time){
    		time=$("#use_time").val();
    		var params={
    	    	use_time : $("#use_time").val()
    	    };
    	  $.ajax({
              url : "ticket_action",
              type : "post",
              data : params,
              success : function(json){ 
            	  $("#ticket_type").empty();
            	  testjson = json;
            	  $.each(json, function(index, content){
            		  $("#ticket_type").append("<option>"+content.class_name+"</option>");  //添加一项option  
            		});
            	  $("#price").val(json[0].price);
                  },
              error : function(){alert("服务出错");}
              });  
    	};
    };
	function showPrice(){
		var i = $("#ticket_type").get(0).selectedIndex;
		$("#price").val(testjson[i].price);		
	};
  </script>
</body>
</html>