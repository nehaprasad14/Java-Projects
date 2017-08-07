<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Register Here !!!</title>

<link href="http://fonts.googleapis.com/css?family=Abel"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src='../javascript/jquery.validate.min.js'></script>
</head>
<body>
<div id="outer">
		<div id="wrapper">

			<%@ include file="header.jsp"%>
			<div id="page">
<div id="register">

	<%-- <s:div>Email Form Division</s:div> --%>
   		<b><s:text name="Please fill in the form below :" /></b>
   			<s:form action="re.action" method="post" theme = "simple">
				First Name :<s:textfield name="rm.firstname" label = "FirstName"/><br/>
				Last Name :<s:textfield name="rm.lastname" label = "LastName"/><br/>
				Age :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name="rm.age" label = "Age"/><br/>
				<font color = "red">*</font>Username :<s:textfield name="rm.username" label = "*UserName"/><br/>
				<font color = "red">*</font>Password :&nbsp;<s:password name="rm.password" label = "*Password"/><br/>
				<font color = "red">*</font>A/C-Type :<s:radio name="rm.accounttype" label = "*Accounttype" list = "{'admin','student'}"/><br/>
				Email : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:textfield name ="rm.email" label = "Email"/><br/>
				Gender : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:radio label="Gender" name="rm.gender" list="{'male','female'}" /><br/>
				<s:submit key="submit" />
   			</s:form>
   			
   </div>
<br class="clearfix" /><br class="clearfix" />
			</div>
		</div>
		<%@ include file="footer.jsp"%>

	</div>
</body>
</html>