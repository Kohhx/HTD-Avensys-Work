<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            background: rgb(239, 242, 247);
        }

        .main {
            margin-top: 80px;
            display: flex;
            gap: 40px;
        }

        .left {
            width: 70%;
        }

        .right {
            width: 30%;
            background: white;
            border-radius: 8px;
            padding: 20px;
        }

        .grid-container {
            display: grid;
            grid-template-columns: 1fr 1fr;
            margin-top: 30px;
            gap: 25px;
        }

        .category-card {
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            height: 250px;
            background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%, rgba(84, 84, 146, 1) 0%, rgba(0, 164, 216, 1) 50%);
            position: relative;
            transition: all 0.3s ease-in-out;
        }

        .category-card:hover {
            transform: scale(1.05);
        }

        .category-card > img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }

        .category-name {
            position: absolute;
            bottom: 0;
            left: 0;
            right: 0;
            background: linear-gradient(0deg, rgba(1, 1, 1, 1) 0%, rgba(176, 176, 176, 0.8183867296918768) 100%);
            padding: 2px;
            color: white;
            padding: 0.6rem;
            border-bottom-left-radius: 8px;
            border-bottom-right-radius: 8px;
            font-weight: 700;
        }

        .announcement-card {
            background: rgb(239, 242, 247);
            border-radius: 8px;
            padding: 10px;
            margin-bottom: 10px;
            display: flex;
            gap: 8px;
        }

        .right h2 {
            font-size: 1.5rem;
        }

        .announcement-card i {
            font-size: 1.5rem;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<%--Header Partial--%>
<%@ include file="navbar.jsp" %>
<div class="container main">
    <div class="left">
        <div>
            <h1>Welcome ${username}, &#128075 </h1>
        </div>

        <div class="grid-container">

            <a href="/list-employees?page=1">
                <div class="category-card">
                    <img src="../../images/employees-list.png" alt="employees list">
                    <div class="category-name">Employees List</div>
                </div>
            </a>

            <a href="#">
                <div class="category-card">
                    <img src="../../images/employees-review.png" alt="employees review">
                    <div class="category-name">Employees Review</div>
                </div>
            </a>
            <a href="#">
                <div class="category-card">
                    <img src="../../images/employees-attendance.png" alt="employees attendance">
                    <div class="category-name">Employees Attendance</div>
                </div>
            </a>
            <a href="#">
                <div class="category-card">
                    <img src="../../images/employees-tasks.png" alt="employees tasks">
                    <div class="category-name">Employees Tasks</div>
                </div>
            </a>

        </div>
    </div>

    <div class="right">
        <h2 class="mb-4"><i class="fa-solid fa-bullhorn"></i> Recent Announcements</h2>
        <div class="announcement-card">
            <i class="fa-regular fa-window-maximize"></i>
            <div>
                <h4 class="announcement-title">System Maintenance</h4>
                <p class="announcement-sender">Administrator</p>
                <p class="announcement-date">01 Feb 2023, 09:00 AM</p>
            </div>
        </div>

        <div class="announcement-card">
            <i class="fa-regular fa-window-maximize"></i>
            <div>
                <h4 class="announcement-title">Employment Notice</h4>
                <p class="announcement-sender">Senior HR</p>
                <p class="announcement-date">05 May 2023, 14:00 PM</p>
            </div>
        </div>
    </div>


</div>

<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>