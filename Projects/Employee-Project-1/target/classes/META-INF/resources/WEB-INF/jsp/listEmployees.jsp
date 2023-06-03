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

        .arrow > a {
            text-decoration: none;
            cursor: pointer;
            color: black;
        }

        .arrow > a:hover {
            color: rgb(85, 122, 221);
        }

        .avatar-small {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            object-fit: cover;
        }

        .arrow-disabled {
            margin-right: 10px;
            margin-left: 10px;
            color: rgb(126, 131, 157);
        }

        td, th {
            padding: 10px 15px !important;
            font-size: 1rem;
        }

        .btn-custom {
            white-space: nowrap;
        }
    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container main mb-5">
    <h1>Welcome <b>${username}</b>, This is the Employee List</h1>

    <div class="table-card mt-4">

        <div class="d-flex align-items-center justify-content-between p-4">
            <h3>Employee List</h3>
            <div class="d-flex align-items-center gap-3">
                <form method="get" action="/list-employees?page=1&">
                    <div class="search-bar-container d-flex align-items-center"><i
                            class="fa-solid fa-magnifying-glass"></i>
                        <input class="search-bar-input" value="${search}" type="text" name="search"></div>
                    <input hidden type="text" value=1 name="page">
                    <button type="submit" hidden>submit</button>
                </form>
                <c:if test="${role == 'ADMIN'}">
                    <a href="add-employee" class="btn btn-success">
                        + Add Employee
                    </a>
                </c:if>
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
                    <c:if test="${role == 'ADMIN'}">
                        <th></th>
                        <th></th>
                    </c:if>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <c:if test="${employee.profileUrl == null}">
                            <td class="text-center"><img class="avatar-small" src="${defaultProfileUrl}"
                                                         alt="profile image"></td>
                        </c:if>
                        <c:if test="${employee.profileUrl != null}">
                            <td class="text-center"><img class="avatar-small" src="${employee.profileUrl}"
                                                         alt="employee profile"></td>
                        </c:if>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.gender}</td>
                        <td>${employee.email}</td>
                        <td>${employee.age}</td>
                        <td>${employee.address}</td>
                        <td class="text-center">
                            <a href="employee/${employee.id}" class="btn btn-secondary btn-custom">View Profile</a>
                        </td>
                        <c:if test="${role == 'ADMIN'}">
                            <td class="text-center">
                                <a href="update-employee?id=${employee.id}" class="btn btn-warning">Update</a>
                            </td>
                            <td class="text-center">
                                <a href="delete-employee?id=${employee.id}" class="btn btn-danger">Delete</a>
                            </td>
                        </c:if>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <%--            <div class="pagination">--%>
            <%--                <span>1 of 4 </span>--%>
            <%--                <div class="arrow"><a href=""><<</a></div>--%>
            <%--                <span> 1 </span>--%>
            <%--                <div class="arrow"><a href="">>></a></div>--%>
            <%--            </div>--%>

            <div class="pagination">
                <span>${page} of ${totalPages} </span>
                <c:if test="${page > 1}">
                    <div class="arrow"><a href="/list-employees?page=${page-1}&search=${search}"><<</a></div>
                </c:if>
                <c:if test="${page == 1}">
                    <div class="arrow-disabled"><<</div>
                </c:if>
                <span> ${page} </span>
                <c:if test="${page < totalPages}">
                    <div class="arrow"><a href="/list-employees?page=${page+1}&search=${search}">>></a></div>
                </c:if>
            </div>
        </div>
    </div>


</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>