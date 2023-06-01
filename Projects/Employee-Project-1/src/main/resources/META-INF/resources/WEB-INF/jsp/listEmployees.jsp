<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
  <title>Employees List</title>
  <style>
    td {
      vertical-align: middle;
    }
  </style>
</head>
<body>
<div class="container">
  <div>Hey <b>${username}</b>, Welcome to the Employee List</div>
  <hr>
  <a href="add-employee" class="btn btn-success">
    Add Employee
  </a>
  <table class="table">
    <thead>
    <tr>
      <th>Id</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Age</th>
      <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employees}" var="employee">
      <tr>
        <td>${employee.id}</td>
        <td>${employee.firstName}</td>
        <td>${employee.lastName}</td>
        <td>${employee.email}</td>
        <td>${employee.age}</td>
        <td>${employee.address}</td>
        <td>
          <a href="delete-employee?id=${employee.id}" class="btn btn-danger">Delete</a>
        </td>
        <td>
          <a href="update-employee?id=${employee.id}" class="btn btn-warning">Update</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>



</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>