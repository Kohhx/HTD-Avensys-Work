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
    </style>
</head>
<body>
<div class="container d-flex align-items-center justify-content-center vh-100">
    <div class="text-center pad">
        <h1>Welcome to the login page <i class="fa-solid fa-right-to-bracket ml-1"></i></h1>
        <pre class="error-message">${errorMessage}</pre>
        <form method="POST" class="d-flex align-items-center gap-3">
            Name: <input type="text" name="name">
            Password: <input type="password" name="password">
            <input class="btn btn-primary" type="submit">
        </form>
    </div>
</div>


<script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.js"></script>
</body>
</html>