
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
