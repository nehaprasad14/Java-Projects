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
		List lch1 = (List)sess.get("lch1");
		List lch2 = (List)sess.get("lch2");
		
		
	//out.println(list2);
		Iterator it_ch1 = lch1.iterator();
		Iterator it_ch2 = lch2.iterator();
		
		
		out.println("<h3>Number of hits on each chapter.</h3><br/>");
		out.println("<table border = '1' cellpadding='15'>");
		out.println("<tr><th>Sorting Techniques</th><th>Searching Techniques</th></tr>");
		while(it_ch1.hasNext())
		{
			out.println("<tr><td>");
			out.println(it_ch1.next());
			out.println("</td>");
			
		}
		
		while(it_ch2.hasNext())
		{
			out.println("<td>");
			out.println(it_ch2.next());
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