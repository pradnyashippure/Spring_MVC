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
#form2{
padding: 20px;
}
</style>
</head>
<body>
	<div id="header">
		<table>
			<tr>
				<td><h2>MyApp</h2></td>
				<td>
				<a href="Login.jsp">Sign In</a>
				<a href="index.jsp">Sign UP</a>
			</td>
			</tr>
		</table>
	</div>
	<div style="text-align: center;">
		<div>
		<h2>Forget Password</h2>
		</div>
			<div>
			<form action="OTP" method="post">
			<label>Email:</label>
			<input type="email" name="email"><br>
			<input type="submit" value="Send OTP">
			<input type="reset" value="Clear">
			</form>
			<h4 style ="color:red">${responseMSG}</h4>
	</div>
	<div id="form2">
	<form action="forgetPassword" method="post">
			<label>Email:</label><br>
			<input type="email" name="email"><br>
			<label>OTP:</label><br>
			<input type="number" name="otp"><br>
			<label>New Password:</label><br>
			<input type="password" name="newPassword"><br>
			<label>New Confirm Password:</label><br>
			<input type="password" name="newConfirmPassword"><br>
			<input type="submit" value="Submit">
			<input type="reset" value="Clear">
	</form>
	</div>
	</div>
</body>
</html>