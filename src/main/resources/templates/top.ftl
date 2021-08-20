<#--<!DOCTYPE html>-->
<#--<html lang="en" xmlns:th="http://www.thymeleaf.org">-->
<#--<head>-->
<#--    <meta charset="UTF-8">-->
<#--    <title>测试</title>-->
<#--</head>-->
<#--<style>-->
<#--    #top{-->
<#--        height: 50px;-->
<#--        width: auto;-->
<#--        background-color: darkgrey;-->
<#--    }-->
<#--    #top_center{-->
<#--        margin-left: 35%;-->
<#--        display: inline-block;-->
<#--        width: 300px;-->
<#--    }-->
<#--    #top_right{-->
<#--        display: inline-block;-->
<#--        width: 100px;-->
<#--        float: right;-->
<#--        margin-right: 2%;-->
<#--    }-->
<#--</style>-->
<#--<body>-->

<#--<div id="top">-->

<#--    <div id="top_center">-->
<#--        <p style="text-align: center;font-size: 30px">学生管理系统</p>-->
<#--    </div>-->

<#--    <div id="top_right">-->
<#--    你好：<strong> ${user.name}</strong>-->
<#--    </div>-->
<#--</div>-->


<#--</body>-->
<#--</html>-->
<div style="width: 800px;height: 100px;margin: 0 auto">

    <div style="text-align: center;font-size: 25px;margin-top: 20px">
        欢迎访问学生管理系统
    </div>
    <div style="text-align: right">
        欢迎您，
        <#if currentuser??>
            <strong>${currentuser.name!''}</strong>
        </#if>
        <a href="/">重新登录</a>
    </div>
</div>
