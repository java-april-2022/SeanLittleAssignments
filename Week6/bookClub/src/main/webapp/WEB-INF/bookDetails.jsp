<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Details</title>
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
		<div class="card">
			<div
				class="card-header bg-dark d-flex justify-content-between align-items-center">
				<h1 class="display-4 survey text-info">Book Details</h1>
				<a href="/dashboard" class="btn btn-info btn-outline-dark p-2">Dashboard</a>
			</div>
			<div class="card-body bg-secondary text-light">
				<table class="table table-info table-striped table-hover">
					<tbody>
						<tr>
							<th scope="row">Title</th>
							<td>${book.title}</td>
						</tr>
						<tr>
							<th scope="row">Author</th>
							<td>${book.author}</td>
						</tr>
						<tr>
							<th scope="row">Thoughts</th>
							<td>${book.thoughts}</td>
						</tr>
						<tr>
							<th scope="row">Created By</th>
							<td>${book.user.firstName}</td>
						</tr>
					</tbody>
				</table>

				<c:if test="${book.user.id == loggedInUser.id}">
					<div class="d-flex">
						<a href="/books/edit/${book.id}"
							class="btn btn-info btn-outline-dark">Edit</a>
							&nbsp;
						<form:form action= "/books/delete/${book.id}" method="delete">
								<button class="btn btn-info btn-outline-dark">Delete</button>
						</form:form>
					</div>
				</c:if>

			</div>




		</div>
	</div>

</body>
</html>