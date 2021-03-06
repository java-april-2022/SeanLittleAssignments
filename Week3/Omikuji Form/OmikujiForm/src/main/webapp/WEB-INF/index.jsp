<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="UTF-8">
<title>Omikuji App</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>

<body>
<h1></h1>


<div class="container d-flex">
        <form action="/getInfo" method="post" class="p-3 col-6 mx-auto my-5 bg-secondary text-light">
            <h2 class="display text-info bg-dark p-2">Send an Omikuji!!!</h2>
            <div class="form-group">
                
                <div class="row mb-3">
                <label class="col-sm-8 col-form-label">Pick any number between 1 & 25:</label>
                <div class="col-sm-6">
	                <select class="form-select" name="num">
	                	<option selected>choose a number!</option>
	                	<c:forEach var="i" begin="5" end="25" step="1">
	                		<option ><c:out value="${i}"></c:out></option>
	                	</c:forEach>
					</select>
                </div>
                </div>
                
                <label>Enter the name of a city:</label>
                <input type="text" name="city" class="form-control">
                
                <label>Enter the name of any real person:</label>
                <input type="text" name="person" class="form-control">
                
                <label>Enter professional endeavor or hobby:</label>
                <input type="text" name="hobby" class="form-control">
                
                <label>Enter any type of of living thing:</label>
                <input type="text" name="livingThing" class="form-control">
                
                <label>Say something nice to someone:</label>
                <textarea class="form-control" name="niceThing"></textarea>
            </div>
            <h4 class="pt-2" >Send and show a friend!!!</h4>
            <input type="submit" value="Submit" class="btn btn-info btn-outline-dark">
        </form> 
</div>


</body>
</html>