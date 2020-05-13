<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Earn</title>
</head>
<body>
	<div id="addEarn" class="addEarn">
		<a href="#" data-rel="back"
			class="ui-btn ui-corner-all ui-shadow ui-btn ui-icon-delete ui-btn-icon-notext ui-btn-right">Close</a>
		<center>
			<h2>Add Earning</h2>
			<hr>
			<form:form action="addEarn" method="post" modelAttribute="earn">
				<label for="amount">Amount</label>
				<form:input path="amount" id="amount" />
				<form:errors path="amount" /><br>
				<label for="recievedFrom">Received From</label>
				<form:input path="recievedFrom" id="recievedFrom" />
				<form:errors path="recievedFrom" /><br>
				<label for="description">Description</label>
				<form:input path="description" id="description" />
				<form:errors path="description" />
				<br>
				<center>
					<input type="submit" value="Save Expense">
				</center>

			</form:form>
		</center>
	</div>
</body>
</html>