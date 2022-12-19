<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#header {
	background-color: lightpink;
	padding: 10px;
}

#header table {
	width: 100%;
}
#header h2 {
	color: navy;
	position: relative;
	top: 5px;
}
#header a{
			float: right;
			margin: 20px;
			}
#SignUpLink{
text-align: right;
margin: 20px;
}
#SignUpLink a{
text-align: right;
margin: 20px;
}
</style>
</head>
<body>
	<div id="header">
		<table>
			<tr>
				<td><h2>MyApp</h2></td>
				<td>
				<a href="Login.jsp">LogOut</a>
				<div id="SignUpLink">
				<a href="getMyProfile/${responseMSG}">MyProfile</a>
				</div>
			</td>

			</tr>
		</table>
	</div>
	<h4> Welcome ${responseMSG}</h4>
	<div>
	<h3>Profile Details</h3>
	<div>Email id : ${details.email}</div>
	<div>Contact  : ${details.number}</div>
	</div>
</body>
</html>