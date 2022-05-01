<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>

</head>
<body>


	<div class="container p-3 col-10 mx-auto my-5 bg-secondary text-light">
		<h2 class="display text-light">Save Travels</h2>
		<table class="table table-info table-striped table-hover">
			<thead>
				<tr>
					<th scope="col">Expense</th>
					<th scope="col">Vendor</th>
					<th scope="col">Amount</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allExpenses}" var="expense">
					<tr>
						<td><a href="/expenseDetails/${expense.id}">${expense.name}</a></td>
						<td><c:out value="${expense.vendor}"></c:out></td>
						<td><c:out value="${expense.amount}"></c:out></td>
						<td class="d-flex">
							<a href="/edit/${expense.id}" class="btn btn-info btn-outline-dark ml-2">Edit</a>
							<form:form action="/delete/${expense.id}" method="delete">
								<button class="btn btn-info btn-outline-dark ml-2" >Delete</button>
							</form:form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<a href="/new" class="btn btn-info btn-outline-dark">New Expense</a>
	</div>


</body>
</html>



