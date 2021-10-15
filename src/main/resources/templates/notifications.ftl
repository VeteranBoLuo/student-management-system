<!DOCTYPE html>
<html>
<head>
  <title>公告</title>
  <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
  <style>
    li{list-style-type:none;margin-left: -40px}
    .img{
     width: 500px;
      height: 250px;
      border-radius: 10px;
    }
  </style>
</head>

<body>
<#include 'top.ftl'>
<div style="width: 800px;margin: 0 auto">

  <#include 'left.ftl'>
  <div id="app">
   <a href="#"><img :src="num[i]" class="img"/></a>
  </div>
</div>
  <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
  <script>
    var app = new Vue({
      el: "#app",
      data: {
        i:0,
        num: ["picture/login1.jpg","picture/login2.jpg","picture/login3.jpg"]
      },
      methods: {
        do:function(){
          this.i++
          if(this.i>2){
            this.i=0
          }

        }
      },
      mounted() {
        this.timer = setInterval(this.do, 3000);
      },

    })
  </script>

</body>
</html>