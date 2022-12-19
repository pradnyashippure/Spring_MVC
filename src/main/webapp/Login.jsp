<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyApp</title>
	<link rel="icon"  href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREKEH4sv4EYEGqAXRYHiuVJ50OwNwlbJi4iA&usqp=CAU">
<style type="text/css">
			#header{
			background-color: lightpink;
			padding: 10px;
			}
			
			#header table{
			width: 100%;
			}
			
			#header a{
			float: right;
			margin-right: 10px;
	   }
	  #header h2{
	  		color: navy;
	  		position:relative;
	  		top:5px;
	    }
	    #form{
	    padding: 10px;
	    }
	    section{
	    	background-color: skyblue;
	    }
				
		</style>
</head>
<body>
	<div id="header">
		<table>
			<tr>
				<td><h2>MyApp</h2></td>
				<td id="SignUpLink">
				<a href="index.jsp">Sign Up</a>
				<a href="ForgetPassword.jsp">Forget Password</a>
				</td>

			</tr>
		</table>
	</div>
	<section style="text-align: center;">
		<div>
			<h3>Sign In</h3>
		</div>
			<div id = "form">
				<form action="login" method="post" >
				<label>Email:</label><br>
				<input type = "email" name= "email"><br>
				<label>Password:</label><br>
				<input type = "password" name= "password"><br>
				<input type = "submit" value="submit">
				<input type="reset" value = "clear">
				</form>
		   </div>
		   <div>
		   <h4>${responseMSG}</h4>
		   </div>
	</section>
</body>
</html>