<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruitiest of all Fruit Loops</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">

</head>
<body>

	<div class="container bg-secondary pl-2"></div>
	<h1 class="display-3">Fruit Store</h1>
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th scope="col">Fruit</th>
				<th scope="col">Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="fruit" items="${fruitLoop}">
			<tr>
				<td><c:out value="${fruit.name}"/></td>
				<td><c:out value="${fruit.price}"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>