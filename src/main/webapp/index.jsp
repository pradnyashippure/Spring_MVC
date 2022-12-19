<html>
	<head>
		<style type="text/css">
			#header{
			background-color: orange;
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
	  		top:12px;
	    }
	    #form{
	    padding: 10px;
	    }
	    section{
	    	background-color: lightgray;
	    }
				
		</style>
	</head>
<body>
	<div id="header">
		<table>
			<tr>
				<td><h2>MyApp</h2></td>
				<td id="LoginLink">
				<a href="Login.jsp">Sign In</a>
				<a href="ForgetPassword.jsp">Forget Password</a>
				</td>

			</tr>
		</table>
	</div>
	<section style="text-align: center;">
		<div>
			<h3>Sign Up</h3>
		</div>
			<div id = "form">
				<form action="register" method="post" >
				<label>Email:</label><br>
				<input type = "email" name= "email"><br>
				<label>Password:</label><br>
				<input type = "password" name= "password"><br>
				<label>Confirm Password:</label><br>
				<input type = "password" name= "confirmPassword"><br>
				<label>Contact:</label><br>
				<input type = "tel" name= "number"><br>
				<input type = "submit" value="submit">
				<input type="reset" value = "clear">
				</form>
		   </div>
	</section>
</body>
</html>
