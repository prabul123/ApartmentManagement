<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apartment Management</title>
<style>

body {
    background-image: url("https://example.com/your-image.jpg"); /* Use a valid image URL */
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
}

.heading {
	color: navy;
	font-family: Arial, sans-serif; /* Correct the font-family */
}

.sub1 {
	color: #6a040f;
	margin-top: 80px;
	position: relative; /* Correct spelling of 'position' */
	padding: 10px;
}

.success {
	color: green;
}

.failure {
	color: red;
}

h3 {
    color: #4cf50f;
}

input {
    color: #b3101b;
}

body {
    color: #f00cc6;
}

.signup {
    box-shadow: 0px 0px 5px 5px #4fa8b0;
    margin: 100px auto;
    padding: 20px;
    border-radius: 10px;
    text-align: center;
    margin-top: -5px;
}

</style>
</head>
          
<body>
	<div align="center">
		<h1 class="heading">Apartment Management</h1>
		<h3 class="sub1">Create your Profile</h3>
		<% String success = (String) request.getAttribute("success");
		if (success != null) { %>
		<h3 class="success"><%= success %></h3>
		<% } %>

		<% String failure = (String) request.getAttribute("failure");
		if (failure != null) { %>
		<h3 class="failure"><%= failure %></h3>
		<% } %>

		<form action="signup" method="post">
			<table class="signup">
				<tr>
					<td>Enter your name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr><td colspan="2"><br></td></tr>
				<tr>
					<td>Enter your phone number:</td>
					<td><input type="tel" name="phone"></td>
				</tr>
				<tr><td colspan="2"><br></td></tr>
				<tr>
					<td>Enter your email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr><td colspan="2"><br></td></tr>
				<tr>
					<td>Enter your password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr><td colspan="2"><br></td></tr>
				<tr>
					<td colspan="2"><input type="submit" value="Create Profile"></td>
				</tr>
			</table>
		</form>
		<div align="center">
			<b>Already have an account?</b> <a href="login.jsp">Login</a>
		</div>
	</div>
</body>
</html>
