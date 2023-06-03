<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        .pad {
            border: black 2px solid;
            border-radius: 8px;
            box-shadow: rgba(0, 0, 0, 0.15) 1.95px 1.95px 2.6px;
            padding:50px 20px;
        }
        .error-message {
            color: red;
            font-style: italic;
        }

        .login-title{
            blur: 100%;
            transform: translateX(-20%);
            animation: zoomIn 0.4s ease-in-out forwards;
            opacity: 0;
        }

        @keyframes zoomIn{
            100% {
                blur:0px;
                transform: translateX(0);
                opacity: 1;
            }
        }


    </style>
</head>
<body>
<div class="container d-flex align-items-center justify-content-center vh-100">
    <div class="text-center pad">
        <h1 class="login-title">Welcome to the Todo login page <i class="fa-solid fa-right-to-bracket ml-1 mb-3"></i></h1>
        <pre class="error-message">${errorMessage}</pre>
        <form method="POST" class="d-flex align-items-center gap-3">
            <label  class="form-label">Username: </label>
            <input type="text" name="username" class="form-control"/>
            <label  class="form-label">Password: </label>
            <input type="password" name="password" class="form-control">
            <input class="btn btn-primary" type="submit">
        </form>
    </div>
</div>


<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>