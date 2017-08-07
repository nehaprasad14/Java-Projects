<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@page import="com.opensymphony.xwork2.ActionContext"%>

<%
	//out.println(ActionContext.getContext().getSession().get("login"));
	//out.println(session.getAttribute("login"));
	
	if(session.getAttribute("login") != null )
	{
		String str = (String)session.getAttribute("login");
		if(str.equals("true"))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/success.jsp");
			rd.forward(request,response);
		}
		request.getSession().removeAttribute("login");
		request.getSession().invalidate();
		
	}
	
	
	
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.opensymphony.xwork2.ActionSupport;"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Browing Behavior Tracking System</title>
</head>
<body>
	<s:form action="su.action" method="post">
    	<s:textfield name="rm.username" label = "Username"/><br/>
      	<s:password name="rm.password" label = "Password"/><br/>
		<s:radio name="rm.accounttype" label="Account-Type" list="{'admin','student'}" /><br/>
      	<s:submit name="submit" label="Login" align="center" /><br/>
   </s:form>
</body>
</html>