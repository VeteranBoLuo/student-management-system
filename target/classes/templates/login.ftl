<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <script src="js/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <link href="css/bootstrap.css" rel="stylesheet">
    <script>
        function login() {
            var userName = document.getElementById("userName").value;
            var password = document.getElementById("password").value;
            if (userName == "" || password == '') {
                alert("账号密码不能为空！")
            } else {
                $.ajax({
                    type: "POST",
                    url: '/doLogin',
                    data: {
                        "userName": userName,
                        "password": password
                    },
                    success:function (){
                        window.location.href="notifications";
                    },
                    error: function () {
                        alert("账号或密码错误");
                    }


                })
            }
        }
    </script>

</head>
<body>
<div class="all">
    <h1>学生管理系统</h1>

    <div id="content">
        <div id="leftDiv">
            <img src="picture/login.jpg" class="leftImg"/>
        </div>
        <div id="rigthDiv">
            <form>
                <table class="login">
                    <tbody>

                    <tr class="loginTitle">
                        <td><span>账号密码登录</span></td>
                    </tr>

                    <tr>
                        <td><input id="userName" name="userName" type="text" class="user"
                                   placeholder="帐号"/>
                        </td>
                    </tr>
                    <tr>
                        <td><input id="password" name="password" type="password" class="pw"
                                   placeholder="密码"/>
                        </td>
                    </tr>


                    <tr>
                        <td><input id="loginButton" type="button" value="登录" class="btn btn-default" onclick="login()"/>
                        </td>

                    </tr>


                    <tr class="bottom-register">
                        <td><a href="register" style="text-decoration: none">还没账号？去注册</a>
                        <td>
                    </tr>
                    </tbody>
                </table>
                <div style="color: #ff0114">${error!''}</div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
