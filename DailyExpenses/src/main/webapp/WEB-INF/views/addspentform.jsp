<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Spent</title>
</head>
<body>
	<div id="addSpent" class="addSpent">
		<a href="#" data-rel="back"
			class="ui-btn ui-corner-all ui-shadow ui-btn ui-icon-delete ui-btn-icon-notext ui-btn-right">Close</a>
		<center>
			<h2>Add Spent</h2>
			<hr>
			<form:form action="addSpent" method="post" modelAttribute="spent">
				<label for="spentin">Give to</label>
				<form:input id="spentin"  path="spentIn" />
				<form:errors path="spentIn" /><br>
				<label for="amount">Amount</label>
				<form:input  id="amount" path="amount" /><br>
				<label for="description">Description</label>
				<form:input id="description" path="description"  />
				<center>
					<input type="submit" value="Save Expense">
				</center>

			</form:form>
		</center>
	</div>
</body>
</html>