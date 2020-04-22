<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today's Avak and Javak</title>
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
	<div>
		<p align="center">
			<a href="addSpent"> Add Spent</a>
		<p>
		<p align="center">
			<a href="addEarning"> Add Earning</a>
		<p>
	</div>
</body>
</html>