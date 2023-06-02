<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        div {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            line-height: 2.1rem;
        }

        .main {
            height: 100vh;
        }

        .left {
            width: 50%;
            background: rgb(11, 25, 48);
        }

        .right {
            width: 50%;
            background: rgb(239, 242, 247);
        }

        .left h3 {
            background: rgb(223, 81, 87);
            color: white;
            letter-spacing: 0.5rem;
            border-radius: 5px;
            width: fit-content;
        }

        .right-header-1 {
            color: white;
            font-size: 3rem;
            font-weight: bold;
        }

        .right-header-2 {
            color: rgb(85, 122, 221);
            font-size: 3rem;
            font-weight: bold;
        }

        .login-card {
            background: white;
            padding: 50px;
            border-radius: 10px;
            box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
        }

        .login-icon-container {
            margin-top: -120px;
        }

        .login-icon {
            height: 130px;
            width: 130px;
            border-radius: 100%;
            animation: zoomIn 0.4s 3s ease-in-out forwards;
            opacity: 0;
        }

        @keyframes zoomIn {
            from {
                transform: scale(0.3);
            }
            to {
                transform: scale(1);
                opacity: 1;
            }
        }

        .form-control {
            width: 300px;
        }

        .btn-rounded-outline {
            margin-top: 1rem;
            border-radius: 100vh;
            border: transparent 1px solid;
            background: rgb(8, 83, 244);
            width: 100%;
            padding: 5px 50px;
            color: white;
            transition: all 0.2s ease-in-out;
        }

        .btn-rounded-outline:hover {
            border: rgb(8, 83, 244) 1px solid;
            background: transparent;
            color: rgb(8, 83, 244);
        }

        .error {
            color: red;
            font-size: 0.9rem;
            font-style: italic;
        }


    </style>
</head>
<body>
<div class="main d-flex">
    <div class="left d-flex align-items-center justify-content-center">
        <div>
            <h3>Singapore</h3>
            <div>
                <span class="right-header-1" id="first-line">Employment</span>
            </div>
            <div>
                <span class="right-header-2" id="second-line">Management</span>
            </div>
            <div>
                <span class="right-header-1" id="third-line">Portal</span>
            </div>
        </div>
    </div>

    <div class="right d-flex align-items-center justify-content-center">
        <div class="login-card">
            <div class="text-center login-icon-container"><img class="login-icon" src="../../images/login.png"
                                                               alt="login icon"></div>
            <h4 class="text-center mt-2">Login <i class="ml-2 fa-regular fa-user"></i></i></h4>
            <div class="error">${errorMessage}</div>
            <form method="post">
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" name="username" required/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password" required/>
                </div>
                <button class="btn-rounded-outline" type="submit">Login</button>
            </form>
        </div>
    </div>

</div>


<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
<script src="../../js/login.js" type="module"></script>
</body>
</html>