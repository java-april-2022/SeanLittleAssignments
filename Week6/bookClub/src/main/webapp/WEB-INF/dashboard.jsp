<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
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
			<h1 class="display-4 survey text-info">Welcome <c:out value="${loggedInUser.firstName}"/></h1>
			<div class="card-body bg-secondary text-light">
			<table class="table table-info table-striped table-hover">
			<thead>
				<tr>
					<th scope="col">Title</th>
					<th scope="col">Author</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="book">
					<tr>
						<td><a href="/books/bookDetails/${book.id}">${book.title}</a></td>
						<td><c:out value="${book.author}"></c:out></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
				<a href="/new" class="btn btn-info btn-outline-dark">New</a>
				<a href="/logout" class="btn btn-info btn-outline-dark">Logout</a>
				
			</div>
		</div>
	</div>
	</div>


</body>
</html>

