<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <title>$Title$</title>
    <style>
        .main {
            margin-top: 30px;
        }

        td {
            vertical-align: middle;
        }

        .pad {
            border: black 2px solid;
            border-radius: 8px;
            box-shadow: rgba(0, 0, 0, 0.15) 1.95px 1.95px 2.6px;
            padding: 30px 20px;
        }
    </style>
</head>
<body>
<div class="container main">
    <h1>Hey <b>${username} &#128075</b>, welcome to your todos</h1>
    <hr>
    <div class="pad">
        <h1>List of Todos</h1>
        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Status</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.userName}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td>
                        <a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>
                    </td>
                    <td>
                        <a href="update-todo?id=${todo.id}" class="btn btn-warning">Update</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <a href="add-todo" class="btn btn-success">
            + Add Todo
        </a></div>

</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>