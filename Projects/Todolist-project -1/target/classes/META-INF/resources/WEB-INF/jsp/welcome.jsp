<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.css">
        <title>Welcome page</title>
        <style>
            .main{
                margin-top: 30px;
            }

            .banner {
                background-color: dodgerblue ;
                padding: 40px;
                border-radius: 20px;
                color:white;
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
                position: relative;

            }

            .banner-title {
                text-shadow:1px 1px 2px #333333
            }

            .todo-image {
                position: absolute;
                right:0;
            }

            .btn-custom{
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
            }

        </style>
    </head>
    <body>
    <div class="container main">
        <h1> Welcome ${username}, &#128075 !</h1>
        <hr>
        <div class="banner mt-4">
            <img class="todo-image" src="../../Todo.png" alt="">
            <h1 class="mb-3 banner-title">Manage all your Todos here</h1>
            <a class="btn btn-success btn-custom" href="list-todos">Manage</a>
        </div>

    </div>



    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
    <script src="/webjars/jquery/3.6.0/jquery.js"></script>
    </body>
</html>