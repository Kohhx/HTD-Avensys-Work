<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <title>Employees List</title>
    <style>
        body {
            background: rgb(239, 242, 247);
        }

        .main {
            margin-top: 80px;
        }

        td {
            vertical-align: middle;
        }

        .table-card {
            background: white;
            /*padding: 20px;*/
            border-radius: 20px;
        }

        .fa-magnifying-glass {
            margin-right: -25px;
            z-index: 100;
            color: rgb(126, 131, 157)
        }

        .search-bar-input {
            background: rgb(239, 242, 247);
            border: none;
            outline: none;
            font-size: 1.25rem;
            border-radius: 7px;
            padding: 5px 5px 5px 35px;
        }

        .custom-table {
            margin: 0;
        }

        .pagination {
            padding: 5px 0px 5px 15px;
            background: rgb(225, 228, 232);
            margin: 0;
            font-size: 0.8rem;
            border-bottom-left-radius: 20px;
            border-bottom-right-radius: 20px;
        }

        .arrow {
            margin-right: 10px;
            margin-left: 10px;
        }
        .avatar-small {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            object-fit: cover;
        }
    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container main">
    <h1>Welcome <b>${username}</b>, This is the Employee List</h1>

    <div class="table-card mt-4">

        <div class="d-flex align-items-center justify-content-between p-4">
            <h3>Employee List</h3>
            <div class="d-flex align-items-center gap-3">
                <form>
                    <div class="search-bar-container d-flex align-items-center"><i
                            class="fa-solid fa-magnifying-glass"></i>
                        <input class="search-bar-input" type="text"></div>

                    <button type="submit" hidden>submit</button>
                </form>
                <a href="add-employee" class="btn btn-success">
                    Add Employee
                </a>
            </div>
        </div>

        <%--    table here--%>
        <div class="table-responsive">
            <table class="table table-striped-columns table-hover custom-table">
                <thead>
                <tr class="table-secondary">
                    <th>Id</th>
                    <th class="text-center">Profile Image</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Address</th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <c:if test="${employee.profileUrl == null}">
                        <td class="text-center"><img class="avatar-small" src="${defaultProfileUrl}" alt="profile image"></td>
                        </c:if>
                        <c:if test="${employee.profileUrl != null}">
                            <td class="text-center"><img class="avatar-small" src="${employee.profileUrl}" alt="employee profile"></td>
                        </c:if>
<%--                        <td class="text-center"><img class="avatar-small" src="${employee.profileUrl}" alt="employee profile"></td>--%>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.gender}</td>
                        <td>${employee.email}</td>
                        <td>${employee.age}</td>
                        <td>${employee.address}</td>
                        <td class="text-center">
                            <a href="delete-employee?id=${employee.id}" class="btn btn-danger">Delete</a>
                        </td>
                        <td class="text-center">
                            <a href="update-employee?id=${employee.id}" class="btn btn-warning">Update</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <div class="pagination">
                <span>1 of 4 </span>
                <div class="arrow"><a href=""><<</a></div>
                <span> 1 </span>
                <div class="arrow"><a href="">>></a></div>
            </div>
        </div>
    </div>


</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>