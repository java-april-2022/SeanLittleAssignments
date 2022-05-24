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


	 <div class="container d-flex">
	<!--  Student Register -->
        <form:form action="/registration" method="post" class="p-3 col-4 mx-auto my-5 bg-secondary text-light" modelAttribute="newUser">
            <h2 class="display text-info bg-dark p-2">Register</h2>
            <div class="form-group">
                
                <form:label path="firstName">First Name:</form:label>
                <form:errors class="text-danger" path="firstName"/>
                <form:input path="firstName" class="form-control"/>
                
                <form:label path="lastName">Last Name:</form:label>
                <form:errors class="text-danger" path="lastName"/>
                <form:input path="lastName" class="form-control"/>
                
                <form:label path="email">Email Address:</form:label>
                <form:errors class="text-danger" path="email"/>
                <form:input path="email" class="form-control"/>
               
                <form:label path="password">Password:</form:label>
                <form:errors class="text-danger" path="password"/>
                <form:password path="password" class="form-control"/>
                
                <form:label path="confirm">Confirm Password:</form:label>
                <form:errors class="text-danger" path="confirm"/>
                <form:password path="confirm" class="form-control"/>
            </div>
            
            <input type="submit" value="Register" class="btn btn-info btn-outline-dark">
        </form:form> 
        
        <!-- Student Login -->
        <form:form action="/login" method="post" class="p-3 col-4 mx-auto my-5 bg-secondary text-light" modelAttribute="newLogin">
          <h2 class="display text-info bg-dark p-2">Login</h2>
         
            <div class="form-group">
                <form:label path="email">Email Address:</form:label>
                <form:errors class="text-danger" path="email"/>
                <form:input path="email" class="form-control"/>
               	
               	<form:label path="password">Password:</form:label>
                <form:errors class="text-danger" path="password"/>
                <form:password path="password" class="form-control"/>
            </div>
            <input type="submit" value="Login" class="btn btn-info btn-outline-dark">
        </form:form>
    </div>


</body>
</html>



