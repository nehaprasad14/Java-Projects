<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="cdac.model.RegisterModel"%>
<%-- <%@ include file="authenticate.jsp"%> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Browsing Behavior Tracking System - You are logged in</title>
<link href="http://fonts.googleapis.com/css?family=Abel"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src='../javascript/jquery-ui/js/jquery-1.9.0.js'></script>
<script type="text/javascript" src='../javascript/jquery-ui/js/jquery-ui-1.10.0.custom.js'></script>
<script type="text/javascript" src='../javascript/jquery.cookies.2.2.0.min.js'></script>
<script type="text/javascript" src='../javascript/sbts.js'></script>

<link type='text/css' rel='stylesheet'  href='../javascript/jquery-ui/css/smoothness/jquery-ui-1.10.0.custom.css'></link>
<link type='text/css' rel='stylesheet' href='../css/sbts.css'></link>
</head>
<body>
<div id="outer">

		<div id="wrapper">

			<%@ include file="header.jsp"%>
			<div id="page">
	<%
	String data = (String)session.getAttribute("login");
	System.out.println("value of login thru : (String)session.getAttribute('login') :" + data);
	String name = request.getParameter("uname");
	
	RegisterModel rm = (RegisterModel)ActionContext.getContext().getSession().get("rm");
	String uname = rm.getUsername();
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
<h1><%="Welcome - "+uname.toUpperCase() %></h1>
	
	<%-- <a href="<%= request.getContextPath() %>/lo.action">Logout</a><br/> --%>
	<form action = "lo.action" method = "post">
		<div align = "right"><a href="lo.action">Logout</a></div>
	</form>
	<div id="leftpane" class="left1">
		<script language="javascript">
			var xmlhttp;
			var i,k,l;
			if (window.XMLHttpRequest)
			{
				xmlhttp = new XMLHttpRequest();
			} else 
			{
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			xmlhttp.open("GET", "../xml/DataStructure.xml", false);
			xmlhttp.send();
			xmlDoc = xmlhttp.responseXML;
			x = xmlDoc.getElementsByTagName("Chapter");

			//1111111111 ul started of main tree
			document.write("<ul id='menu'>"); // main tree started
			
			
			for (i = 0; i < x.length; i++) 
			{
				//document.write("HIII................11........................................");
				var opt1 = x[i].getElementsByTagName("ChName")[0].childNodes[0].nodeValue;
				var ch=x[i].getAttribute("id");
				
													//first li started of Chapter
				document.write("<li class='chapter'><div id='"+ch+"'><a href="+"#"+">" + opt1 + "</a></div><br/>"); // techniquessssssss

				///--------------------------------------------------------------------
							
				str = "../xml/"+opt1 + ".xml";
				//-------------------------------------------------------------------
				xmlhttp.open("GET", str, false);
				xmlhttp.send();
				xmlDoc = xmlhttp.responseXML;
				x1 = xmlDoc.getElementsByTagName("TOPIC");
				// 2nd ul started of topic name
				document.write("<ul style='display:none;'>"); // display noneeeeeeeeeeeee
				for (k = 0; k < x1.length; k++) 
				{
					var opt2 = x1[k].getElementsByTagName("TOPIC_NAME")[0].childNodes[0].nodeValue;
					var opt11 = x1[k].getAttribute("id");
					//2nd LI started of sub topic
					document.write("<li class='topic' ><div id='"+opt11+"'><a href="+"#"+">" + opt2 + "</a></div><br/>"); // list of content container
					x2 = xmlDoc.getElementsByTagName("TOPIC")[k].getElementsByTagName("SUB_TOPIC");
					
					// 3rd ul started of subtopic
					
							document.write("<ul style='display:none;'>"); // display none
									for (l = 0; l < x2.length; l++) 
									{
										var opt4 = x1[k].getElementsByTagName("SUB_TOPIC")[l].childNodes[1].childNodes[0].nodeValue;
										var opt10 = x1[k].getElementsByTagName("SUB_TOPIC")[l].getElementsByTagName("SUB_TOPIC_ID")[0].childNodes[0].nodeValue;
										
										document.write("<li class='sub_topic'><div id='"+opt10+"'><a href="+"#"+">" +opt4+ "</a></div></li><br/>");
										
										
									}
							// 3rd ul ended of sub topic , end of display none
							document.write("</ul>");
							//2nd li ended of sub topic
					document.write("</li>");
					
				}
				//2nd ul ended of topic
				document.write("</ul>");
				//1st li ended of chapter
				document.write("</li>");
				
			}
			document.write("</ul>");
		</script>
	</div>
	<div id="contents">
		<div id="accordion">
			<h3><div id="intro">Introduction</div></h3>
			<div id="intro1" style="min-height: 200px">
				<p>
				
						
				</p>
			</div >
			<h3><div id="def">Definition</div></h3>
			<div id="def1" style="min-height: 200px">
				<p></p>
			</div>
			<h3><div id="ex">Example</div></h3>
			<div id="ex1" style="min-height: 200px">
				<p></p>
				
			</div>
			<h3><div id="summary">Summary</div></h3>
			<div id="summary1" style="min-height: 200px">
				<p>
				
				
				
				
				
				</p>
				
			</div>
			<h3><div id="assign">Assignment</div></h3>
			<div id="assign1" style="min-height: 200px">
				<p></p>
			</div>


			<h3><div id="img1">Image</div></h3>
			<div id="img11" style="min-height: 200px">
				<p></p>
			</div>

			<h3><div id="audio">Audio</div></h3>
			<div id="audio1" style="min-height: 200px">
				<p></p>
			</div>

			<h3><div id="video">Video</div></h3>
			<div id="video1" style="min-height: 200px">
				<p></p>
			</div>

		</div>
	</div>
	
		<!-- ............................................. -->		
				<br class="clearfix" />
				<br class="clearfix" />
				<br class="clearfix" />
				<br class="clearfix" />
			</div>
		</div>
		<%@ include file="footer.jsp"%>

	</div>
</body>
</html>