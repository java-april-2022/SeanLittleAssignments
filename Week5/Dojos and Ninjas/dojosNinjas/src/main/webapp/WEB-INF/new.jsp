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

	<div class="containerp-3 col-10 mx-auto my-5 bg-secondary text-light">
	<div class="card-body bg-secondary text-light">
		<div class="card-header bg-dark">
			<h1 class="display-4 survey text-info">New Dojo</h1>
			<div class="card-body bg-secondary text-light">

				<form:form action="/create" method="post" modelAttribute="newDojo">
					<p>
						<form:label path="name" class="col-sm-2 col-form-label left">Dojo Name</form:label>
						<form:input path="name" class="form-control"/>
						<form:errors class="text-danger" path="name" />
					</p>
					<p>
						<form:label path="location" class="col-sm-2 col-form-label left">Location</form:label>
						<form:input path="location" class="form-control"/>
						<form:errors class="text-danger" path="location" />
					</p>
					<button class="btn btn-info btn-outline-dark">Add Dojo</button>

				</form:form>
			</div>
		</div>
	</div>
	</div>


</body>
</html>