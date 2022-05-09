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
		<div class="card">
			<div class="card-header bg-dark">
				<h1 class="display-4 survey text-info">Dojo Details</h1>
			</div>
			<div class="card-body bg-secondary text-light">
				<table class="table table-info table-striped table-hover">
					<tbody>
						<tr>
							<th scope="row">Dojo Name:</th>
							<td>${dojo.name}</td>
						</tr>
						<tr>
							<th scope="row">Location:</th>
							<td>${dojo.location}</td>
						</tr>
					</tbody>
				</table>



			</div>



			<a href="/" class="btn btn-info btn-outline-dark">Home</a>


		</div>
	</div>

</body>
</html>