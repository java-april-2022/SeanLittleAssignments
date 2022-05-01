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

	<div class="container">
	<div class="card-body bg-secondary text-light">
		<div class="card-header bg-dark">
			<h1 class="display-4 survey text-info">Edit Your Expense</h1>
			<div class="card-body bg-secondary text-light">

				<form:form action="/create" method="post" modelAttribute="newExpense">
					<p>
						<form:label path="name" class="col-sm-2 col-form-label left">Expense</form:label>
						<form:input path="name" class="form-control"/>
						<form:errors class="text-danger" path="name" />
					</p>
					<p>
						<form:label path="vendor" class="col-sm-2 col-form-label left">Vendor</form:label>
						<form:input path="vendor" class="form-control"/>
						<form:errors class="text-danger" path="vendor" />
					</p>
					<p>
						<form:label path="amount" class="col-sm-2 col-form-label left">Amount</form:label>
						<form:input path="amount" class="form-control"/>
						<form:errors class="text-danger" path="amount" />
					</p>
					<button class="btn btn-info btn-outline-dark">Update Expense</button>

				</form:form>
			</div>
		</div>
	</div>
	</div>


</body>
</html>