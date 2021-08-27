<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>删除学生</title>


</head>
<body>
<#include 'top.ftl'>
<div style="width: 800px;margin: 0 auto">
    <#include 'left.ftl'>

    <form action="/Delete" method="post">
        <fieldset>
            <legend>删除学生</legend>
            <table style="width:50%">
                <tr>
                    <td>删除学生的学号：</td>
                    <td>
                        <input name="card" type="text"  id="card" maxlength="20"/>
                    </td>
                </tr>


                <tr>
                    <td style="margin-top: 20px;float: left">
                        <input type="submit"  value="删除" class="btn"/>
                        <input type="reset"  value="重置" class="btn"/>
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
</div>
</div>
</body>
</html>