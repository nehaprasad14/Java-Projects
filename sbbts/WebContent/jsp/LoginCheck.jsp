<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="cdac.action.LoginAction"%><html>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
 	<head>
  		<title>Check validate!</title>
  	</head>
  	<body>
  	<%
	//out.println(ActionContext.getContext().getSession().get("login"));
	//out.println(session.getAttribute("login"));
	String str = (String)session.getAttribute("login");
	if(session.getAttribute("login") != null )
	{
		if(str.equals("true"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/success.jsp");
			rd.forward(request,response);
		}
	}
	
%>
  	
  	
  		<s:if test="#str == 'false'">
  			<jsp:forward page="/jsp/login.jsp" />  
  			<s:else><jsp:forward page="/jsp/success.jsp" /></s:else>
 		 </s:if>
 		 
  	
  	</body>
</html>
