<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
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

            <#if student??>
                <tr>
                    <td>${student.card}</td>
                    <td>${student.name}</td>
                    <td>${student.sex}</td>
                    <td>${student.phone}</td>
                </tr>
            </#if>

        </table>

    </div>
</div>
</body>
</html>