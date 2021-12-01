<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Employee</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div align="center">
		<h2>New Employee</h2>
		<div class="container col-sm-4">
			<form:form action="save" method="post" modelAttribute="employee">
				<table border="0" cellpadding="5">
					<tr>
						<td>Name:</td>
						<td><form:input path="empName" class="form-control" /></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><form:input path="empEmail" class="form-control" /></td>
					</tr>
					<tr>
						<td>Address:</td>
						<td><form:input path="empAddress" class="form-control" /></td>
					</tr>
					<tr>
						<td colspan="2"><input class="btn btn-primary" type="submit"
							value="Save"></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>