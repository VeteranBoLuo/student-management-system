<!DOCTYPE HTML>
<html >
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
    <script>
        function addUser() {
            var name = document.getElementById("name").value;
            var userName = document.getElementById("userName").value;
            var password = document.getElementById("password").value;
            $.ajax({
                type: "POST",
                dataType: "json",
                url: '/user/save',
                contentType: "application/json",
                data: JSON.stringify({
                    "name":name,
                    "userName": userName,
                    "password": password
                }),
                success: function (result) {
                    if ("" !=result.name&&"" != result.userName&&"" != result.password) {
                        alert("注册成功");
                        window.location.href="/";
                    }else {
                        alert("请填写完整！")
                    }
                }
            });

        }
    </script>

    <style>
        a{
            text-decoration:none;

        }
        a:link{color:black}
        a:hover {color:gray}
        body{
            display: flex;
            justify-content: center;
        }

        .a{
            position:relative;
            top: 100px;
            width: 1100px;
            height: 550px;
            box-shadow: 0 5px 15px rgba(0,0,0,.8);
            display: flex;
        }
        .left{
            width: 800px;
            height: 550px;
            background-image: url("picture/201515-158211451517f1.jpg");
            /* 让图片适应大小 */
            background-size: cover;
        }
        .right{
            width: 300px;
            height: 550px;
            background-color: white;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .login{
            width: 250px;
            height: 500px;
        }
        .login h1{
            font: 900 30px '';
        }
        .line{
            width: 230px;
            margin: 20px 0;
            border: 0;
            padding: 10px;
            border-bottom: 3px solid rgb(80,80,170);
            font: 900 16px '';
        }
        .g{
            position: absolute;
            margin: 20px;
            bottom: 40px;
            display: block;
            width: 200px;
            height: 60px;
            font: 900 30px '';
            text-decoration: none;
            line-height: 50px;
            border-radius: 30px;
            background-image: linear-gradient(to left,
            #9c88ff,#3cadeb);
            text-align: center;
        }
    </style>
</head>
<body>
<div class="a">
    <div class="left"></div>
    <div class="right">
        <div class="login">
            <h1><a href="/">Login</a>/<a href="register">Register</a></h1>
            <form>
                <input id="name" name="name" type="text" class="line" placeholder="用户名">
                <input id="userName" name="userName" type="text" class="line" placeholder="账号">
                <input id="password" name="password" type="password" class="line" placeholder="密码">
                <input type="button" onclick="addUser()" value="注册" class="g" style="cursor: pointer"/>

            </form>
        </div>
    </div>
</div>
</body>
</html>
