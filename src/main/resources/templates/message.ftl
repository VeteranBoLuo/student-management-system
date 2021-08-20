<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>个人信息</title>
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <style>
        #page-total{
            width: 1000px;
            margin: 0 auto;
        }
        #message{
            display:flex;


        }
        table{
            margin-top: 15px;
            margin-left: 30px;
            border-collapse:collapse;
            width: 500px;
        }
        #message-right{
            width: 200px;
            display: inline-block;
        }


    </style>
</head>
<body>
<div id="page-total" >

    <#include 'top.ftl'>

<div id="message">
    <#include 'left.ftl'>

    <div>
        <table class="table table-hover" style="width: 500px">
            <caption><b>个人信息</b></caption>
            <thead>
                <th>姓名</th>
                <th>用户名</th>
                <th>密码</th>
                <th>权限</th>
            </thead>
            <tr>
                <td>${user.name}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td>管理员</td>
            </tr>
        </table>
    </div>

</div>


</div>
</body>
</html>