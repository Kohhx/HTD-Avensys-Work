<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        body {
            background: rgb(239, 242, 247);
        }

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .main {
            margin-top: 80px;
        }
        .error {
            color: red;
            font-style: italic;
        }
    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container main">
    <h1 class="mt-5">${title}</h1>
    <form:form method="post" modelAttribute="employee">
        <div class="d-flex justify-content-between gap-5">
            <div class="mb-3 w-100">
                <label class="form-label">First Name</label>
                <form:input type="text" class="form-control" id="firstName" path="firstName" required="required"/>
                                <form:errors path="firstName" cssClass="error"/>
            </div>
            <div class="mb-3 w-100">
                <label class="form-label">Last Name</label>
                <form:input type="text" class="form-control" id="lastName" path="lastName" required="required"/>
                                <form:errors path="lastName" cssClass="error"/>
            </div>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <form:input type="text" class="form-control" id="email" path="email" />
                            <form:errors path="email" cssClass="error"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Age</label>
            <form:input type="number" class="form-control" id="name" path="age" required="required"/>
                            <form:errors path="age" cssClass="error"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <form:input type="text" class="form-control" id="address" path="address" required="required"/>
                            <form:errors path="address" cssClass="error"/>
        </div>

        <%--    Hidden input--%>
        <form:input type="hidden" path="id"/>

        <c:if test="${type == 'create'}">
            <button type="submit" class="btn btn-primary">Create employee</button>
        </c:if>
        <c:if test="${type == 'update'}">
            <button type="submit" class="btn btn-primary">Update employee</button>
        </c:if>
    </form:form>
</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>