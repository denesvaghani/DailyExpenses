<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
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
				<th>Given To</th>
				<th>Amount</th>
				<th>Description</th>
				<th>Time</th>
			</tr>
				<c:forEach items="${spentList}" var="spent">
					<tr>
						<td><b>${spent.spentIn}</b></td>
						<td><b>${spent.amount}</b></td>
						<td><b>${spent.description}</b></td>
						<td><b>${spent.spentTimeStamp}</b></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="right-container">
			<h3 align="center">Earn</h3>
			<hr>

			<table style="width: 100%">
			<tr>
				<th>Received From</th>
				<th>Amount</th>
				<th>Description</th>
				<th>Time</th>
			</tr>
				<c:forEach items="${earnList}" var="earn">
					<tr>
						<td><b>${earn.recievedFrom}</b></td>
						<td><b>${earn.amount}</b></td>
						<td><b>${earn.description}</b></td>
						<td><b>${earn.earnTimeStamp}</b></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>


	<div>
		<form>
			<center>

				<input type="submit" formaction="addSpentForm" value="Add Spent" />

			</center>
			<center>
				<input type="submit" formaction="addEarnForm" value="Add Earning">
			</center>
		</form>
	</div>
</body>
</html>