<%--<head>--%>
<%--  <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">--%>
<%--  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">--%>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    nav {
        background: rgb(11, 25, 48);
        display: flex;
        justify-content: space-between;
        align-items: center;
        color: white;
        padding: 8px 20px;
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        z-index: 100 !important;
    }

    .logo-text * {
        line-height: 0.5rem;
    }

    .logo-text h6 {
        background: rgb(223, 81, 87);
        color: white;
        letter-spacing: 0.13rem;
        border-radius: 3px;
        width: fit-content;
        padding: 3px;
        font-size: 0.7rem;
    }

    .logo-text h5 {
        color: white;
        font-weight: bold;
    }

    .logo-text > h5 > span {
        color: rgb(85, 122, 221);
        font-weight: bold;
    }

    i {
        cursor: pointer;
    }

    .vertical-line {
        height: 30px;
        width: 1.5px;
        background: white;
    }

    .avatar {
        height: 35px;
        width: 35px;
        border-radius: 50%;
        border: 1.5px solid white;
        object-fit: cover;
    }

    a {
        text-decoration: none;
        color: white;
    }
</style>

<header>
    <nav>
        <div class="d-flex align-items-center gap-3">
            <a href=""> <i class="fa-solid fa-bars fs-2"></i></a>
            <a href="/welcome">
                <div class="logo-text">
                    <h6>Singapore</h6>
                    <h5>Employment <span>Management</span>
                        Portal</h5>
                </div>
            </a>
        </div>

        <div class="d-flex align-items-center gap-3">
            <a href="#">
                <i class="fa-regular fa-bell fs-4"></i>
            </a>
            <a href="/logout">
                <i class="fa-solid fa-arrow-right-from-bracket fs-4"></i>
            </a>
            <div class="vertical-line"></div>
            <div>
                <img class="avatar"
                     src="https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg"
                     alt="myprofile">
            </div>
            <a href="#">
                <i class="fa-solid fa-ellipsis-vertical fs-4"></i>
            </a>
        </div>
    </nav>
</header>
