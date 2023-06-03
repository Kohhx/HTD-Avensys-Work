<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Todo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        .error {
            color: red;
        }

        .main {
            margin-top: 30px;
        }


        .pad {
            border: black 2px solid;
            border-radius: 8px;
            box-shadow: rgba(0, 0, 0, 0.15) 1.95px 1.95px 2.6px;
            padding: 30px 20px;
        }

        .form-check-input {
            width:3rem !important;
            height: 1.5rem;
        }
        .switch-label{
            margin-top: 8px;
        }

    </style>
</head>
<body>
<div class="container main w-50">

    <div class="pad">
        <h1 class="mt-2">Create Todo todo <i class="ml-2 fa-solid fa-pen"></i></h1>
        <form:form method="post" modelAttribute="todo">
            <div class="mb-3">
                <label class="form-label">Description</label>
                <form:input type="text" class="form-control" id="Description" path="description"/>
                <form:errors path="description" cssClass="error"/>
            </div>
            <div class="mb-3">
                <label class="form-label">Target Date</label>
                <form:input type="date" value="${formattedDate}" class="form-control" id="date" path="targetDate"/>
                <form:errors path="targetDate" cssClass="error"/>
            </div>
            <div class="mb-3 d-flex align-items-center gap-2">
                <label class="form-label switch-label">Done</label>
                <div class="form-check form-switch">
                    <form:checkbox class="form-check-input text-lg" path="done" />
                </div>
                <form:errors path="done" cssClass="error"/>
            </div>

            <%--        // These path follow the names from todo.java--%>
            <form:input type="hidden" path="userName"/>
            <form:input type="hidden" path="id"/>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>

</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>