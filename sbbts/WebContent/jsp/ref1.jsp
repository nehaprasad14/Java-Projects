<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.*"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.opensymphony.xwork2.ActionContext"%>	
 

<%
	String data = (String)session.getAttribute("login");
	System.out.println("value of login thru : (String)session.getAttribute('login') :" + data);
	String name = request.getParameter("name");
	
	if(data!=null)
	{	
		if(data.equals("false"))
		{	
			RequestDispatcher rd = request.getRequestDispatcher("/login.action");
			rd.forward(request,response);
		}
	}
	Map sess = ActionContext.getContext().getSession();
	String sdata = (String)sess.get("login");
	String d = (String)sess.get("a");
	System.out.println("value of a"+ d);
	System.out.println("value of login thru : (String)ActionContext.getContext().getSession().get('login')"+sdata);
%>
<%=name %>

<html>
	<head>
  		<title>Welcome, you have logged in!!!</title>
  	</head>
  	<body>
 		 Welcome, you have logged in!!!!!!!!!!!!! <br />
 		 
 		 <br/>
 		 <%=data + sdata + request.getContextPath()%>
 		 <br/>
  		<b>Session Time: </b><%= new Date(session.getLastAccessedTime())%>
  			<br />
  			<br />
  		<a href="<%= request.getContextPath() %>/lo.action">Logout</a>
  			<br />
  		You have successfully uploaded <s:property value="myFileFileName"/>
  	</body>
  	
</html>
