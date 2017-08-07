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
		if(str.equals("false"))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("home.action");
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
					<form action = "lo.action" method = "post">
						<div align = "right"><a href="lo.action">Logout</a></div>
					</form>
				
				<div class="box">
						 <h1>Welcome Administrator !! </h1>
						 <div class="login-form" id="login"><br/>
						 
						 
						    	<a href = "admin.action">show list of students</a><br/>
								<a href = "admin2.action">Number of hits on each section</a><br/>
								<a href = "admin3.action">Number of hits on each chapter</a>
						 
							
							<%-- <h1>Login Form</h1>
							click here to login here:
							<s:a href = "login.action" method = "post">LOGIN</s:a>
							<br/> --%>
							
							
<!--  ---------------------------------------------------------------------------------------------------------------------->
						</div>
					</div>
				
				<%-- <div id="content">
					<div class="box">
						<h2>Welcome to Online Education System</h2>
						<img class="alignleft" src="../images/pic01.jpg" alt="" />
						<p>
							This is <strong>Prolific</strong>, a free, fully standards-compliant CSS  by  CSS Templates. The images used in this template are from <a href="http://fotogrph.com/">Fotogrph</a>. This free template is released under a Creative Commons Attributions 3.0 license, so you are pretty much free to do whatever you want with it (even use it commercially) provided you keep the footer credits intact. Aside from that, have fun with it :)
						</p>
					</div>
					
					
					<br class="clearfix" />
					
					<br class="clearfix" />
				</div>
				
 --%>	

<!-- ================================================================= -->
<div  id="sidebar" >
					<%-- <div class="box">
						 <h1>Welcome Administrator !! </h1>
						 <div class="login-form" id="login"><br/>
						 
						 
						    	<a href = "admin.action">show list of students</a><br/>
								<a href = "admin2.action">show list of students who visited example section</a>
						 
							
							<h1>Login Form</h1>
							click here to login here:
							<s:a href = "login.action" method = "post">LOGIN</s:a>
							<br/>
							
							
<!--  ---------------------------------------------------------------------------------------------------------------------->
						</div>
					</div> --%>
</div>
				<br class="clearfix" />
			</div>
		</div>
			
	
			<%@ include file="footer.jsp"%>
		</div>
	</div>
</body>
</html>
















<%-- <%@page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href = "admin.action">show list of students</a><br/>
	
	<a href = "admin2.action">show list of students who visited example section</a>
	
	
	
	
</body>
</html> --%>