<%@page import="com.quinnox.ordermanagementsystem.daomodel.Order"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link href="http://fonts.googleapis.com/css?family=Abel"
	rel="stylesheet" type="text/css" />
</head>
<body>
<%
Boolean logg=(Boolean)session.getAttribute("Logged");
if(logg==null||logg==false)
{
//	System.out.println("logged null");

%>

<jsp:forward page="/index.jsp"></jsp:forward>

<%} else{%>
<div id="outer"><%@include file="/loggerDetails.jsp"%>
<div id="wrapper">

<div id="mainbody">
<div id="page">


<%
	ArrayList auditLogList=(ArrayList)request.getAttribute("auditLogList");
	int orderid=0;
	int userid=0;
	String status=null;
	String time=null;
	String role=null;
	String comments=null;
	String uName=null;

%>

<fieldset style="width: 240pt height :150pt">
<div align="center">
<form action="Manager.jsp" method="post" >
<table align="center" border="1">
	<caption>ORDER STATUS</caption>

	<tr>
		<th align="CENTER">ORDER ID</th>
		<th align="CENTER">USER ID</th>
		<th align="CENTER">USER NAME</th>
		<th align="CENTER">STATUS</th>
		<th align="CENTER">DECISION BY</th>
		<th align="CENTER">TIME</th>
		<th align="CENTER">COMMENTS(INCASE OF REJECTION)</th>
</tr>

<%
		 for(Object obj:auditLogList)
		 {
			 Order order=(Order)obj;
		
	%>
	<tr>
		<td><%=order.getOrderId()%></td>
		<td><%=order.getPlacedById()%></td>
		<td><%=order.getuName()%></td>
		<td><%=order.getStatus()%></td>
		<td><%=order.getRole()%></td>
		<td><%=order.getTime()%></td>
		<td><%=order.getComments()%></td>
	</tr>
		<%
		}
	
		%>
		</table>
	</form>
	</div>
	</fieldset>
<%} %>
<br class="clearfix" />
<br class="clearfix" />
<br class="clearfix" />
<br class="clearfix" />
<br class="clearfix" />
</div>
<br class="clearfix" />

</div>
</div>


<%@ include file="/footer.jsp"%></div>
</body>
</html>