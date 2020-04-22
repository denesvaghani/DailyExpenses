<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<br>
	<br>

	<center>
		<h2>Add Spent</h2>
		<hr>
		<form:form action="spent/updatedExpenses" method="post" modelAttribute="addSpent">
			<table>
				<tr>
					<td><label for="id">Spent Id</label></td>
					<td><form:input type="text" path="idSpent" id="id" /></td>
				</tr>
				<tr>
					<td><label for="amount">Amount</label></td>
					<td><form:input type="text" path="amount" id="amount" /></td>
				</tr>
				<tr>
					<td><label for="description">Description</label></td>
					<td><form:input type="textbox" path="description"
							id="description" /></td>
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