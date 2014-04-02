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
<body>
	<div style="width: 90%;height: 100%">



		<div>
			<div align="center" style="height: 50px;">
				<p style="font-family:Courier New;font-size: 30px;">欢迎使用网上订票系统</p>
			</div>
		</div>
		<div class="divWhiteLine"></div>
		<div class="divNavigatorOuterFrame">
			<div class="divNavigatorInnerFrame">
				<s:a action="" namespace="/">[首页]</s:a>
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



		<decorator:body />
		<!--被装饰页面的body-->

		<div class="divWhiteLine" align="center">
			<p id="cp">
				@2014&nbsp;hhjt&nbsp;&nbsp;沪ICP证030173号&nbsp;<img src="imgs/gs.gif">
			</p>
		</div>
	</div>
</body>
</html>