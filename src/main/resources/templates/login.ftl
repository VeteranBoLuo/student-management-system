<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<#include 'top.ftl'>
<div style="width: 800px;margin: 0 auto">
<form action="/doLogin" method="post">
   <p> <input type="text" name="userName" placeholder="用户名" /></p>
    <p>  <input type="password" name="password" placeholder="密码" /></p>
    <div style="margin-top: 10px">
        <input type="submit" value="登录" class="btn " style="margin-left: 120px"/>
        <input type="button" value="注册" class="btn" onclick="window.location.href='register';"style="margin-left: 50px"/>
    </div>
    <div style="color: #ff0114">${error!''}</div>
</form>


</div>


</body>
</html>
