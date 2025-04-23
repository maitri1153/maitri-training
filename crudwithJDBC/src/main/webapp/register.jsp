<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.apache.logging.log4j.LogManager"%>
<%@page import="org.apache.logging.log4j.Logger"%>

<%!private static final Logger logger = LogManager.getLogger("register.jsp");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
	<script>
		function validate(){
		    if( document.getElementById("fullName").value === ''){
				alert("Please enter your name");
			}
			
			else if( document.getElementById("email").value === ''){
				alert("Please enter your mail-id");
			}
			
			else if(document.querySelectorAll('input[type="radio"]:checked').length == 0){
				alert("Please Select gender...");
			}
		    
			else if( document.getElementById("dob").value === ''){
				alert("Please enter your Date of Birth");
			}
		    
			else if(document.querySelectorAll('input[type="checkbox"]:checked').length == 0){
				alert("Please Select your hobby...");
			}
		}
	</script>
</head>

<body>
	<div class="container mt-5">
		<div class="row justify-content-center align-items-center">
			<div class="col-12 col-lg-9 col-xl-7">
				<div class="card" style="border-radius: 15px;">
					<div class="card-body p-4 p-md-5">
						<h3 class="mb-5">Form...</h3>
						<form action="InserServlet" method="post">

							<div class="form-group">
								<label hidden>ID</label> <input type="text" name="emp_id"
									class="form-control" hidden value="${employee.id}">
							</div>
							<div class="form-group">
								<label>Full Name </label> <input type="text" name="fullName"
									id="fullName" class="form-control" required
									value="${employee.fullName}" />
							</div>

							<div class="form-group">
								<label>E-mail</label> <input type="email" name="email" id="email"
									class="form-control" required placeholder="abc@gmail.com"
									value="${employee.email}" />
							</div>

							<div class="form-group">
								<label>Select Gender</label><br> <input type="radio"
									name="gender" id="gender" value="female"
									${employee.gender == "female" ? "checked" : ""}> <label
									class="form-check-label" for="flexRadioFemale">Female</label><br>

								<input type="radio" name="gender" id="gender" value="male"
									${employee.gender == "male" ? "checked" : ""}> <label
									class="form-check-label" for="flexRadioMale">Male</label>
							</div>

							<div class="form-group">
								<label> Select Date of Birth </label> <input type="date"
									name="dob" id="dob" class="form-control" required
									value="${employee.dob}" />
							</div>

							<div class="form-group">
								<label>Select hobby</label><br> <input type="checkbox"
									name="hobby" value="Dancing" ${isDancing ? "checked" : ""}><label>Dancing</label><br>
								<input type="checkbox" name="hobby" value="Singing"
									${isSinging ? "checked" : ""}><label>Singing</label><br>
								<input type="checkbox" name="hobby" value="Painting"
									${isPainting ? "checked" : ""}><label>Painting</label><br>
							</div>
							<input type="submit" value="submit" class="btn btn-success"
								onClick="validate()">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container mt-5 ">
		<h2>Employee Data</h2>
		<div class="col-11">
			<table class="table table-striped mt-3 align-items-center">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>E-mail</th>
					<th>Gender</th>
					<th>D.O.B.</th>
					<th>Hobby</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>

				<tbody>
					<c:forEach var="employee" items="${employeelist}">
						<tr>
							<td><c:out value="${employee.id}" /></td>
							<td><c:out value="${employee.fullName}" /></td>
							<td><c:out value="${employee.email}" /></td>
							<td><c:out value="${employee.gender}" /></td>
							<td><c:out value="${employee.dob}" /></td>
							<td><c:out value="${employee.hobby}" /></td>
							<td><buttn class="btn btn-outline-warning">
								<a href="EditServlet?edit_id=${employee.id}">Edit</a></buttn></td>
							<td><button class="btn btn-outline-danger">
									<a href="DeleteServlet?delete_id=${employee.id}">Delete</a>
								</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>