<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>  
 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css"
	media="screen">
<title><decorator:title default="Welcome" /> <!--被装饰页面的Title-->
</title>
<decorator:head />
</head>
<body bgcolor="Gainsboro ">
	<div style="width: 90%;height: 100%">



		<div>
			<div align="center">
			  <img src="imgs/head1.jpg" width="800" height="150">
			</div>
		</div>
		<div class="divWhiteLine"></div>
		<div class="divNavigatorOuterFrame" style="margin-left: 200px;width: 800px">
			<div class="divNavigatorInnerFrame">
				<s:a href="login.jsp" namespace="/">[首页]</s:a>
				&nbsp;
				<s:a action="InfoAction_toLookInfoList" namespace="/">[公告]</s:a>
				&nbsp;
				<s:a action="" namespace="/">[订单]</s:a>
				&nbsp;
				<s:if test="#session['account'] != null">
					<div class="divNavigatorOuterFrame">
						<div class="divNavigatorInnerFrame" style="text-align: right;">
							<s:property value="#session['account'].name" />
							&nbsp;&nbsp;
						</div>
					</div>
					<div class="divWhiteLine"></div>

				</s:if>
				<s:else>
					<s:a href="login.jsp" namespace="/">[登陆]</s:a>&nbsp;
		<s:a action="" namespace="/">[用户注册]</s:a>&nbsp;
		</s:else>
			</div>
		</div>


		<div style="margin-left: 200px;height: 400px">
		<img src="imgs/gg1.jpg" align="left" width="200" height="400"/>
		<div align="left" style="margin-left: 50px;width: 750px"">
		<decorator:body />
		<!--被装饰页面的body-->
		</div>
		
</div>
	

		<div class="divWhiteLine" align="center">
			<p id="cp">
				@2014&nbsp;hhjt&nbsp;&nbsp;沪ICP证030173号&nbsp;<img src="imgs/gs.gif">
			</p>
		</div>
	</div>
</body>
</html>