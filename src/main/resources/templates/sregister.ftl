<!DOCTYPE html>
<html>
<head>
    <title>注册</title>
    <script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
    <script>
        function addStudent() {
            var card = document.getElementById("card").value;
            var name = document.getElementById("name").value;
            var sex = document.getElementById("sex").value;
            var phone = document.getElementById("phone").value;
            $.ajax({
                type: "POST",
                dataType: "json",
                url: '/Sregister',
                contentType: "application/json",
                data: JSON.stringify({
                    "card":card,
                    "name":name,
                    "sex": sex,
                    "phone": phone
                }),
                success: function (result) {

                }
            });

        }
    </script>
</head>
<body>
<#include 'top.ftl'>
<div style="width: 800px;margin: 0 auto">
    <#include 'left.ftl'>

    <form >
        <fieldset>
            <legend>学生注册</legend>
            <table class="formtable" style="width:50%">
                <tr>
                    <td>学号：</td>
                    <td>
                        <input name="card" type="text"  id="card" maxlength="20"/>
                    </td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td>
                        <input name="name" type="text"  id="studentname" maxlength="20"/>
                    </td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td>
                        <input name="sex" type="text" id="sex" maxlength="20" />
                    </td>
                </tr>

                <tr>
                    <td>电话：</td>
                    <td>
                        <input name="phone" type="text"  id="phone" maxlength="20"/>
                    </td>
                </tr>


                <tr>
                    <td style="margin-top: 20px;float: left">
                        <input value="注册" type="button" onclick="addStudent()"/>
                        <input type="reset"  value="重置"/>
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
</div>
</div>

</body>
</html>