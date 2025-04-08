<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.apache.logging.log4j.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"crossorigin="anonymous">
</head> 
<body>
<%! private static final Logger logger = LogManager.getLogger();%>>
<% logger.info("index.jsp Started......"); %>
    <div class="row g-0 d-flex align-items-center">
      <div class="col-lg-6">
        <div class="card-body py-5 px-md-5">
		<h1>Login</h1>
		
         <form action="LoginServlet" method="post">
            <div data-mdb-input-init class="form-outline mb-4">
              <label class="form-label">User ID</label>
              <input type="text" class="form-control" name="userID" />
            </div>

            <div data-mdb-input-init class="form-outline mb-4">
              <label class="form-label">Password</label>
              <input type="password" class="form-control" name="password"/>
            </div>
            <label><c:out value= "${message}"/></label>
            <button value="submit" type="submit" data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-block mb-4">
            Log In</button> 
          </form>
        </div>
      </div>
    </div>
</body>
</html>
