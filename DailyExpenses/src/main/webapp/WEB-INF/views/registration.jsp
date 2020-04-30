<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<script type="text/javascript">
	function checkPasswordMatching() {

		var pass = document.getElementById("password").value;
		var conf_pass = document.getElementById("confirm_password").value;
		if (pass == conf_pass)
			return true;
		else {
			alert('Confirm password does not match')
			return false;
		}
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

	<form:form action="registeruser" method="post"
		onsubmit="return checkPasswordMatching()" modelAttribute="user">
		<label for="first_name">First Name </label>
		<form:input path="firstName" id="first_name" />
		<form:errors path="firstName"></form:errors>
		<br />
		<label for="last_name">Last Name </label>
		<form:input path="lastName" id="last_name" />
		<form:errors path="lastName"></form:errors>
		<br />
		<label for="phone">Phone Number </label>
		<form:input path="phoneNumber" id="phone" />
		<form:errors path="phoneNumber"></form:errors>
		<br />
		<label for="user_name">User Name </label>
		<form:input path="userName" id=" user_name" />
		<form:errors path="userName"></form:errors>
		<br />
		<label for="password">Password </label>
		<form:password path="password" id="password" />
		<form:errors path="password"></form:errors>
		<br />
		<label for="confirm_password">Confirm Password </label>
		<form:password path="confirm_password" id="confirm_password" />
		<form:errors path="confirm_password"></form:errors>
		<br />

		<form:button>Submit</form:button>
	</form:form>
</body>
</html>