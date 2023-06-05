<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Employee</title>
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

        .main-profile {
            margin-top: 80px;
            margin-bottom: 60px;
            background: white;
            padding: 0 0px 50px 0px !important;
            border-radius: 20px;
        }

        .profile-image {
            height: 150px;
            width: 150px;
            border-radius: 50%;
            object-fit: cover;
            border: 3px solid white;
            margin-bottom: -250px;
        }

        .banner-custom {
            background: rgb(11, 19, 36);
            color: white;
            height: 180px;
            position: relative;
            border-top-left-radius: 20px;
            border-top-right-radius: 20px;
            padding: 0px 50px;
        }

        .name {
            display: inline;
            bottom: 0;
            position: absolute;
            margin-bottom: 20px;
            margin-left: 30px;
            font-size: 2rem;
            font-weight: bold;
        }


        .profile-image-container input {
            width: 100%;
        }

        .btn-rounded-outline {
            margin-top: 1rem;
            border-radius: 100vh;
            border: transparent 1px solid;
            background: rgb(68, 98, 212);
            padding: 5px 40px;
            color: white;
            transition: all 0.2s ease-in-out;
            width: 150px;
            white-space: nowrap;
        }

        .btn-rounded-outline:hover {
            border: rgb(68, 98, 212) 1px solid;
            background: transparent;
            color: rgb(68, 98, 212);
        }

        .info {
            padding: 0px 50px;
        }

        .info-card {
            background: rgb(239, 242, 247);
            padding: 25px;
            border-radius: 20px;
            margin-top: 60px;
        }

        .info-title {
            text-shadow: 2px 2px 3px rgba(92, 92, 92, 0.8);
            margin-top: -40px;
        }

        .info-details {
            margin-top: 20px;
        }
    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container main-profile w-50">
    <div class="banner-custom mb-5">
        <c:if test="${employee.profileUrl == null}">
            <img class="profile-image" src="${defaultProfileUrl}" alt="profile image">
        </c:if>
        <c:if test="${employee.profileUrl != null}">
            <img class="profile-image" src="${employee.profileUrl}" alt="profile image">
        </c:if>
        <div class="name">
            <span>${employee.firstName}</span>
            <span>${employee.lastName}</span>
        </div>
    </div>

    <div class="info">
        <a href="/update-employee?id=${employee.id}">
            <button class="btn-rounded-outline">Edit profile</button>
        </a>

        <div class="info-card">
            <h4 class="info-title">Bio</h4>
            <div class="info-details">
                <p><b>First Name</b>: ${employee.firstName}</p>
                <p><b>Last Name</b>: ${employee.lastName}</p>
                <p><b>Age</b>: ${employee.age}</p>
            </div>
        </div>

        <div class="info-card">
            <h4 class="info-title">Details</h4>
            <div class="info-details">
                <p><b>Email</b>: ${employee.email}</p>
                <p><b>Address</b>: ${employee.address}</p>
            </div>
        </div>
    </div>
</div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>