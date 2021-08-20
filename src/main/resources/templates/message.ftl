<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我的信息</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>

    </style>
</head>
<body>
<#include 'top.ftl'>

<div style="width: 800px;margin: 0 auto">
    <#include 'left.ftl'>

    <div style="width: 500px;margin: 0 auto;float: left">
        <table class="table">
            <caption>学生信息</caption>
            <thead>
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>联系电话</th>

            </tr>
            </thead>

            <#if students??>
                <#list students as m >
                    <tr>
                        <td>${m.card}</td>
                        <td>${m.name}</td>
                        <td>${m.sex}</td>
                        <td>${m.phone}</td>
                    </tr>
                </#list>
            </#if>

        </table>

    </div>
</div>
</body>
</html>