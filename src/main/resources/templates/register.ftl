<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员注册</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <link href="css/bootstrap.css" rel="stylesheet">
    <script>
        function addUser() {
            var name = document.getElementById("name").value;
            var userName = document.getElementById("userName").value;
            var password = document.getElementById("password").value;
            if (name == "" || userName == "" || password == "") {
                alert("请填写完整")
            } else {
                $.ajax({
                    type: "POST",
                    dataType: "json",
                    url: '/user/save',
                    contentType: "application/json",
                    data: JSON.stringify({
                        "name": name,
                        "userName": userName,
                        "password": password
                    }),
                    success: function (result) {
                        if ("" != result.name && "" != result.userName && "" != result.password) {
                            alert("注册成功");
                            window.location.href = "/";
                        }
                    },
                    error: function () {
                        alert("账号已被注册");
                    }

                });
            }


        }
    </script>
<style>
    #bottom{
        text-decoration: none;
        float: right;
        font-size: 13px;
        margin-right: 5px;
    }
</style>

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
                        <td><span>注册账号</span></td>
                    </tr>
                    <tr>
                        <td><input id="name" name="name" type="text" class="user"
                                   placeholder="用户名"/>
                        </td>
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
                        <td><input id="loginButton" type="button" value="注册" class="btn btn-default"
                                   onclick="addUser()"/></td>

                    </tr>

                    </tbody>
                </table>
                <div style="color: #ff0114">${error!''}</div>
            </form>
           <a href="/" id="bottom" title="跳转到登录页面">已有帐号？ 点此登录</a>
        </div>
    </div>
</div>
</body>
</html>
