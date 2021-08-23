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
                    }else {
                        alert("请填写完整！")
                    }
                }
            });

        }
    </script>
</head>
<body>


<form>
    <p>姓名：<input name="name" type="text" id="name"  size="15"/></p>
    <p>用户名：<input name="userName" type="text" id="userName"  size="15"/></p>
    <p>密　码：<input name="password" type="password" id="password"  size="16" /></p>
    <p><input type="button" value="注册" onclick="addUser()">&nbsp;<input type="button" value="返回" onclick="window.history.back()"></p>
</form>

</body>
</html>
