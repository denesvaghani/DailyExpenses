<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<br>
	<br>

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
					<td><label for="description">Description</label></td>
					<td><form:input path="description" id="description" /></td>
					<form:errors path="description" />
				</tr>
				<tr>
					<td colspan="2"><center>
							<input type="submit" value="Save Expense">
						</center></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>