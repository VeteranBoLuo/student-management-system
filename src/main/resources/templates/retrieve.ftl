<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>查询</title>

</head>

<body>

<#include 'top.ftl'>

<div style="width: 800px;margin: 0 auto">
    <#include 'left.ftl'>

    <form action="/Retrieve" method="post">
        <fieldset>
            <legend>搜索学生</legend>
            <table class="formtable" style="width:50%">
                <tr>
                    <td>搜索学生的学号：</td>
                    <td>
                        <input name="card" type="text"  id="card" maxlength="20"/>
                    </td>
                </tr>


                <tr>
                    <td style="margin-top: 20px;float: left">
                        <input type="submit"  value="搜索" class="btn btn-primary"/>
                        <input type="reset"  value="重置" class="btn btn-primary"/>
                    </td>
                </tr>
            </table>


        </fieldset>


    </form>
</div>

</body>
</html>