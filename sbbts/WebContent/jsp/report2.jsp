<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.util.*"%>

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
		List lintro = (List)sess.get("lintro");
		List ldef = (List)sess.get("ldef");
		List lex = (List)sess.get("lex");
		List lsummary = (List)sess.get("lsummary");
		List lassign = (List)sess.get("lassign");
		List limg1 = (List)sess.get("limg1");
		List laudio = (List)sess.get("laudio");
		List lvideo = (List)sess.get("lvideo");
		
	//out.println(list2);
		Iterator it_intro = lintro.iterator();
		Iterator it_def = ldef.iterator();
		Iterator it_ex = lex.iterator();
		Iterator it_summary = lsummary.iterator();
		Iterator it_assign = lassign.iterator();
		Iterator it_img1 = limg1.iterator();
		Iterator it_audio = laudio.iterator();
		Iterator it_video = lvideo.iterator();
		
		out.println("<h3>Number of hits on each section.</h3><br/>");
		out.println("<table border = '1' cellpadding='15'>");
		out.println("<tr><th>Introduction</th><th>Definition</th><th>Example</th><th>Summary</th><th>Assignment</th><th>Image</th><th>Audio</th><th>Video</th></tr>");
		while(it_intro.hasNext())
		{
			out.println("<tr><td>");
			out.println(it_intro.next());
			out.println("</td>");
			
		}
		while(it_def.hasNext())
		{
			out.println("<td>");
			out.println(it_def.next());
			out.println("</td>");
			
		}
		while(it_ex.hasNext())
		{
			out.println("<td>");
			out.println(it_ex.next());
			out.println("</td>");
			
		}
		while(it_summary.hasNext())
		{
			out.println("<td>");
			out.println(it_summary.next());
			out.println("</td>");
			
		}
		while(it_assign.hasNext())
		{
			out.println("<td>");
			out.println(it_assign.next());
			out.println("</td>");
			
		}
		while(it_img1.hasNext())
		{
			out.println("<td>");
			out.println(it_img1.next());
			out.println("</td>");
			
		}
		while(it_audio.hasNext())
		{
			out.println("<td>");
			out.println(it_audio.next());
			out.println("</td>");
			
		}
		while(it_video.hasNext())
		{
			out.println("<td>");
			out.println(it_video.next());
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
	