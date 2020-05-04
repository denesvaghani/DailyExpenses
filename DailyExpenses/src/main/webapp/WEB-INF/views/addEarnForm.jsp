<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<form:form action="updatedExpenses" method="post"
				modelAttribute="earn">
				<table>
					<tr>
						<td><label for="id">Spent Id</label></td>
						<td><form:input path="idEarn" id="id" /></td>
						<form:errors path="idEarn" />
					</tr>
					<tr>
						<td><label for="amount">Amount</label></td>
						<td><form:input path="amount" id="amount" /></td>
						<form:errors path="amount" />
					</tr>
					<tr>
						<td><label for="recievedFrom">Description</label></td>
						<td><form:input path="recievedFrom" id="recievedFrom" /></td>
						<form:errors path="recievedFrom" />
					</tr>
					<tr>
						<td><label for="description">Description</label></td>
						<td><form:input path="description" id="description" /></td>
						<form:errors path="description" />
					</tr>
					<tr>
						<td colspan="2">
							<center>
								<input type="submit" value="Save Expense">
							</center>
						</td>
					</tr>
				</table>
			</form:form>
		</center>
	</div>
</body>
</html>