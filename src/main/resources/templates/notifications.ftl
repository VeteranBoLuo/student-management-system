<!DOCTYPE html>
<html>
<head>
  <title>CoolMeeting会议管理系统</title>

  <style>
    li{list-style-type:none;margin-left: -40px}
  </style>

  <script>
    function addMessage() {
      var name = document.getElementById("name").value;
      $.ajax({
        type: "POST",
        dataType: "json",
        url: '/user/save',
        contentType: "application/json",
        data: JSON.stringify({
          "name":name,
          "userName": userName,
          "password": password
        }),
        success: function (result) {
          if ("" !=result.name&&"" != result.userName&&"" != result.password) {
            alert("注册成功");
            window.location.href="/";
          }else {
            alert("请填写完整！")
          }
        }
      });

    }
  </script>
</head>

<body>
<#include 'top.ftl'>
<div style="width: 800px;margin: 0 auto">

  <#include 'left.ftl'>
  <textarea cols="60" rows="10" >
    暂无事项
</textarea>





</div>

</body>
</html>