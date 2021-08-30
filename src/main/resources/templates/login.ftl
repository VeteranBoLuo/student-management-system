<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<#--界面借鉴地址https://goatchen.coding.net/public/html-css/HTML-CSS/git/files/master/-->
    <title>登录</title>
    <style>
        a{
            text-decoration:none;

        }
        a:link{color:red}
        a:hover {color:gray}
        body{

            display: flex;
            justify-content: center;
        }
        .a{
            position:relative;
            top: 50px;
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
            outline: none;
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
            <h1><a href="/">1登录</a>/<a href="register">注册</a></h1>
            <form action="/doLogin" method="post" >
                <input name="userName" type="text" class="line" placeholder="账号">
                <input name="password" type="password" class="line" placeholder="密码">
                <button type="submit"  class="g" style="cursor: pointer">登录</button>
                <div style="color: #ff0114">${error!''}</div>
            </form>
        </div>
    </div>
</div>
</body>
</html>