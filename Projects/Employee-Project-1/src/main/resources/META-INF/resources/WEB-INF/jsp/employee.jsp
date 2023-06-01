<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="mt-5">Enter Todo Details</h1>
    <form:form method="post" modelAttribute="employee">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <form:input type="text" class="form-control" id="name" path="name" required="required"/>
<%--            <form:errors path="name" cssClass="error"/>--%>
        </div>
        <div class="mb-3">
            <label class="form-label">Age</label>
            <form:input type="number" class="form-control" id="name" path="age" required="required"/>
<%--            <form:errors path="age" cssClass="error"/>--%>
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <form:input type="text" class="form-control" id="address" path="address" required="required"/>
<%--            <form:errors path="address" cssClass="error"/>--%>
        </div>

        <%--    Hidden input--%>
        <form:input type="hidden" path="id"/>

        <button type="submit" class="btn btn-primary">Create Employee</button>
    </form:form>
</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>