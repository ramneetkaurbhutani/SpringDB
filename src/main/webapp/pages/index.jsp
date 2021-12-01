<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Manager</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div align="center">
		<h2>Employee Manager</h2>
		<div class="container col-sm-4">
			<form method="get" action="search">
				<div class="row">
					<div class="col">
						<input class="form-control" type="text" placeholder="Search"
							aria-label="Search" name="keyword" />
					</div>
					<div class="col">
						<input class="btn btn-primary" type="submit" value="Search" />
					</div>
				</div>
			</form>
		</div>
		<br> <br>
		<h3>
			<a href="/new">Add Employee</a>
		</h3>
		<table class="table table-striped">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">E-mail</th>
				<th scope="col">Address</th>
				<th scope="col">Action</th>
			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.empId}</td>
					<td>${employee.empName}</td>
					<td>${employee.empEmail}</td>
					<td>${employee.empAddress}</td>
					<td><a href="/edit?empId=${employee.empId}">Edit</a>
						&nbsp;&nbsp;&nbsp; <a href="/delete?empId=${employee.empId}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>