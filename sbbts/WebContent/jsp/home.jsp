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
			
			RequestDispatcher rd = request.getRequestDispatcher("su.action");
			rd.forward(request,response);
		}
		request.getSession().removeAttribute("login");
		request.getSession().invalidate();
		
	}
	
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Live Smart - Learn Smart</title>
<link href="http://fonts.googleapis.com/css?family=Abel"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript"
	src='../javascript/jquery-ui/js/jquery-1.9.0.js'></script>
<script type="text/javascript"
	src='../javascript/jquery-ui/js/jquery-ui-1.10.0.custom.js'></script>
<script type="text/javascript"
	src='../javascript/jquery.cookies.2.2.0.min.js'></script>
<script type="text/javascript" src="../javascript/sbts.js"></script>



</head>
<body>


<!-- ================================================================= -->

<div id="outer">
		<div id="wrapper">

			<%@ include file="header.jsp"%>


	<div id="mainbody">
	
	
			<div id="page">
				
				<div id="content">
					<div class="box">
						<h2>Welcome to Online Education System</h2>
						<img class="alignleft" src="../images/pic01.jpg" alt="" />
						<p>
							Student behaviour is an important aspect during the learning process. With the help of their individual traits of learning and browsing of different content, reports can be generated. History related to no. of time view a particular content, no. of click, time devoted on a particular page, etc are useful for analysis of student behaviour.
						</p>
					</div>
					
					
					<br class="clearfix" />
					
					<br class="clearfix" />
				</div>
				
	

<!-- ================================================================= -->
<div  id="sidebar" >
					<div class="box">
						 <h1>Login Form</h1>
						 <div class="login-form" id="login"><br/>
						 
						 <s:form action="su.action" method="post"  theme = 'simple'>
						    	<font color = "red">*</font>Username :&nbsp;<s:textfield name="rm.username" label = "Username" placeholder = "Username"/><br/>
						      	<font color = "red">*</font>Password :&nbsp;&nbsp;<s:password name="rm.password" label = "Password" placeholder = "Password"/><br/>
								<font color = "red">*</font>Account-Type :<s:radio name="rm.accounttype" label="Account-Type" list="{'admin','student'}" /><br/>
						      	<s:submit name="submit" label="Login" align="right" /><br/>
						   </s:form>
							
							<%-- <h1>Login Form</h1>
							click here to login here:
							<s:a href = "login.action" method = "post">LOGIN</s:a>
							<br/> --%>
							
							For registration please click here:
							<s:a href = "register.action" method = "post">REGISTER</s:a>
<!--  ---------------------------------------------------------------------------------------------------------------------->
</div>
					</div>
					
				</div>
				<br class="clearfix" />
			</div>
		</div>
			
	
			<%@ include file="footer.jsp"%>
		</div>
	</div>
</body>
</html>