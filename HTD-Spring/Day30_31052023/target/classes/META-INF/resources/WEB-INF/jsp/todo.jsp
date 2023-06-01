<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Todo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="mt-5" >Enter Todo Details</h1>
    <form:form method="post" modelAttribute="todo">
        <div class="mb-3">
            <label  class="form-label">Description</label>
            <form:input type="text" class="form-control" id="Description" path="description" required="required"/>
            <form:errors path="description" cssClass="error"/>
        </div>
        <div class="mb-3">
            <label  class="form-label">Target Date</label>
            <form:input type="date" class="form-control" id="date" path="targetDate" required="required" />
        </div>

<%--        // These path follow the names from todo.java--%>
        <form:input type="hidden" path="userName"/>
        <form:input type="hidden" path="id" />
        <form:input type="hidden" path="done"/>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>