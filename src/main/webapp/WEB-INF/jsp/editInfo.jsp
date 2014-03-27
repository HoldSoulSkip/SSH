<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加/编辑公告内容</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:form action="InfoAction_saveOrUpdate" namespace="/" method="post">
    		<table>
			<tr>
				<td class="tdHeader">增加/编辑公告内容:</td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form action="InfoAction_saveOrUpdatePage" namespace="/" method="post">
								<s:hidden name="info.id" />
								<s:hidden name="sid" />
								<table>
									<tr>
										<td class="tdFormLabel">公告标题:</td>
										<td class="tdFormControl"><s:textfield name="info.title" cssClass="text" value="%{info.title }"/></td>
									</tr>
									<tr>
										<td class="tdFormLabel">公告内容:</td>
										<td class="tdFormControl"><s:textarea name="info.content" cssClass="text" cols="20" rows="8" value="%{info.content }"/></td>
									</tr>
									<tr>
										<td class="tdFormLabel"></td>
										<td class="tdFormControl"><s:submit value="确定" cssClass="btn" /></td>
									</tr>
								</table>
								</s:form>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
    </s:form>
  </body>
</html>
