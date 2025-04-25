<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Register Page</title>
	
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      	rel="stylesheet"/>
      	
		<link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css"
      	rel="stylesheet"/>
      	
		<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js">
				</script>
				
	</head>

	<body>
		<div class="container mt-3">
			<div class="row justify-content-center align-items-center">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card" style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
						
							<h3 class="mb-5 text-center">Employee Detail Form</h3>
							<form action="InserServlet" method="post" class="needs-validation" novalidate>

							<div class="form-group">
								<label hidden> ID</label> 
								<input type="text" name="emp_id" class="form-control" 
								    hidden value="${employee.id}">
							</div>
							
							<div>
								<label>Full Name </label> 
								<div class="input-group has-validation">
								<input type="text" name="fullName" class="form-control" required value="${employee.fullName}"/>
									 <div class="invalid-feedback">
            							Please enter a Valid Name
          							</div>
          							</div>
							</div>

							<div class="form-group mt-4 ">
								<label>E-mail</label> 
								<input type="email" name="email" 
								     class="form-control" required value="${employee.email}" />
								<div class="invalid-feedback">
            						Please enter a Valid E-mail
          						</div>
							</div>

							<div class="form-check mt-4">
								<label>Select Gender</label><br> 
								<input type="radio" required name="gender" value="female" class="form-check-input"
									${employee.gender == "female" ? "checked" : ""}> 
								<label class="form-check-label" for="flexRadioFemale">Female</label><br>

								<input type="radio" required name="gender" value="male" class="form-check-input"
									${employee.gender == "male" ? "checked" : ""}> 
								<label class="form-check-label" for="flexRadioMale">Male</label>
								<div class="invalid-feedback">
            						Please choose gender
          						</div>
							</div>

							<div class="form-group mt-4">
								<label> Select Date of Birth </label> 
								<input type="date" name="dob" class="form-control" required
									value="${employee.dob}" />
								<div class="invalid-feedback">
            						Please enter a Valid date of birth
          						</div>
							</div>

							<div class="text-center w-100">
								<input type="submit" value="submit" class="btn btn-success mt-3">
							</div>
						
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="text-center mt-5">
			<h2>Employee Data</h2>
			<div class="col-9 mx-auto">
			
			<table class="table table-striped mt-3">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>E-mail</th>
					<th>Gender</th>
					<th>D.O.B.</th>
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
							<td>
								<button class="btn btn-warning"> 
							  		<a class="text-white" href="EditServlet?edit_id=${employee.id}">Edit</a>
							  	</button>
							</td>
							<td>
								<button class="btn btn-danger">
									<a class="text-white" href="DeleteServlet?delete_id=${employee.id}">Delete</a>
								</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			</div>
		</div>
	</body>
	<script type="text/javascript"><%@include file="validation.js"%></script>
</html>