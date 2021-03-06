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

<div class="container d-flex">
<div class="card text-center col-6 mx-auto my-5">
  <div class="card-header text-info bg-dark p-2">
    <h3 >Here's Your Omikuji!!!</h3>
  </div>
  <div class="card-body bg-secondary text-light">
    <!-- <h5 class="card-title">Special title treatment</h5> -->
    
    <p class="card-text"><c:out value="${result}"/></p>
    <a href="/again" class="btn btn-info btn-outline-dark">Try Another :)</a>
  </div>
  
  <div class="card-footer text-info bg-dark p-2">
    Thanks for playing!
  </div>
</div>
</div>
</body>
</html>