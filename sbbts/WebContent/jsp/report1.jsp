<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.util.*"%>
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
			<form action = "ad.action" method = "post">
						<div align = "right"><a href="ad.action">Back</a></div>
					</form>
	<%
		Map sess = ActionContext.getContext().getSession();
		List list1 = (List)sess.get("list1");
		//out.println(list1);
		Iterator it = list1.iterator();
		out.println("<table border = '1'>");
		out.println("<tr> <th> List of Users</th></tr>");
		while(it.hasNext())
		{
			out.println("<tr><td>");
			out.println(it.next());
			out.println("</td></tr>");
			
		}
		out.println("</table>");
	%> 
				<br class="clearfix" /><br class="clearfix" /><br class="clearfix" /><br class="clearfix" /><br class="clearfix" />
</div>
				<br class="clearfix" />
				
			</div>
		</div>
			
	
			<%@ include file="footer.jsp"%>
		</div>
	</div>
</body>
</html>
