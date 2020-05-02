<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Daily Expenses</title>
<link rel="icon" src="/WEB-INF/imgs/DailyExpenses-logo.png"
	type="image/x-icon">

<script type="text/javascript">
	function validate() {
		var userName = document.getElementById("userName").value;
		var password = document.getElementById("password").value;

		if (userName.length < 2) {
			alert('Username can not be less than 2 character')
			return false
		} else if (password.length < 4) {
			alert('Password length can not be less than 4 character')
			return false
		}

		return true
	}
</script>

<style type="text/css">
{
.errors {
	position: fixed;
	color: red;
}
</style>
</head>
<body align="center">
	<h1>Daily Expenses</h1>
	<form:form action="login" method="post" onsubmit="return validate()"
		modelAttribute="loginForm">
		<label for="userName">User Name</label>
		<form:input id="userName" path="userName" />
		<form:errors path="userName" />
		<br />
		<label for="password">Password</label>
		<form:password id="password" path="password" />
		<form:errors path="password" />
		<br />
		<input type="submit" value="Login">
	</form:form>

	<a href="registration"> Register</a>
</body>
</html>