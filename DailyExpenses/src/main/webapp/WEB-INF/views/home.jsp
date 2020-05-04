<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today's Avak and Javak</title>
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript">
	function addSpentOpen() {
		closeEarn();
		document.getElementById("addSpent").style.display = "block";
	}
	function addEarnOpen() {
		closeSpent();
		document.getElementById("addEarn").style.display = "block";
	}
	function closeSpent() {
		document.getElementById("addSpent").style.display = "none";
	}
	function closeEarn() {
		document.getElementById("addEarn").style.display = "none";
	}
</script>
<style type="text/css">
.addSpent {
	display: none;
	width: 25%;
	hight: 15% px;
	margin-left: auto;
	margin-right: auto;
	background: skyblue;
}

.addEarn {
	display: none;
	width: 25%;
	hight: 15% px;
	margin-left: auto;
	margin-right: auto;
	background: yellow;
}
</style>
</head>
<body>

	<div>
		<h1 align="center">Today's Avak and Javak</h1>
		<hr>
	</div>
	<div class="main-container"
		style="display: grid; grid-template-columns: 1fr 1fr; grid-gap: 20px;">

		<div class="left-container">
			<h3 align="center">Spent</h3>
			<hr>

			<table style="width: 100%">
				<tr>
					<td><b>${addSpent.idSpent}</b></td>
					<td><b>${addSpent.amount}</b></td>
					<td><b>${addSpent.description}</b></td>
				</tr>
			</table>
		</div>
		<div class="right-container">
			<h3 align="center">Earn</h3>
			<hr>

			<table style="width: 100%">
				<tr>
					<td><b>${addEarn.idEarn}</b></td>
					<td><b>${addEarn.amount}</b></td>
					<td><b>${addEarn.description}</b></td>
				</tr>
			</table>
		</div>
	</div>
	<div id="addSpent" class="addSpent">
		<a href="#" data-rel="back"
			class="ui-btn ui-corner-all ui-shadow ui-btn ui-icon-delete ui-btn-icon-notext ui-btn-right">Close</a>
		<center>
			<h2>Add Spent</h2>
			<hr>
			<form:form action="updatedExpenses" method="post"
				modelAttribute="spent">
				<table>
					<tr>
						<td><label for="id">Spent Id</label></td>
						<td><form:input path="idSpent" id="id" /></td>
						<form:errors path="idSpent" />
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
								<input type="submit" value="Save Expense" onclick="closeSpent()">
							</center></td>
					</tr>
				</table>
			</form:form>
		</center>
	</div>
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
						<td><label for="description">Description</label></td>
						<td><form:input path="description" id="description" /></td>
						<form:errors path="description" />
					</tr>
					<tr>
						<td colspan="2"><center>
								<input type="submit" value="Save Expense" onclick="closeEarn()">
							</center></td>
					</tr>
				</table>
			</form:form>
		</center>
	</div>
	<div>
		<p align="center">
			<input type="submit" onClick="addSpentOpen()" value="Add Spent" />
		<p>
		<p align="center">
			<input type="submit" onClick="addEarnOpen()" value="Add Earning">
		<p>
	</div>
</body>
</html>