<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yang Wang
  Date: 16/2/1
  Time: 下午4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <jsp:include page="/WEB-INF/common/meta.jsp"/>
    <title>商城主页</title>

</head>
<body>
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<section class="content">

    <div class="container">
        <div class="row">
            <div class="col-md-12" role="main" id="commodityListByCreateDate">

            </div>
        </div>

        <div class="row">
            <aside class="col-md-4">
                <p><h1>123123123123</h1></p>
            </aside>
            <main class="col-md-8" id="commodityListBySales" >

            </main>
        </div>
    </div>
</section>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

<script>

//    function loadCommodity() {
//        console.log("4444444444")
//        $.ajax({
//            url:"commodity/commodityListBySales",
//            async:true,
//            type:"get",
//            success:function (response) {
//                $("#commodityList").html(response);
//            }
//        }
//        );
//    }

    $(document).ready(function(){
        console.log('ready');
        var commodityListBySales = document.getElementById("commodityListBySales");
        var commodityListByCreateDate = document.getElementById("commodityListByCreateDate");

        $("#commodityListBySales").load("commodity/commodityListBySales",function (response) {
            $("#commodityListBySales").html(response);
        });

        $("#commodityListByCreateDate").load("commodity/commodityListByCreateDate",function (response) {
            console.log(response)
            $("#commodityListByCreateDate").html(response);
        })

//        loadCommodity();
    });
</script>

</body>
</html>
