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
        <%--commodityListByCreateDate.jsp--%>
      </div>
    </div>

    <div class="row">
      <aside class="col-md-4" id="categoryList">
        <%--categoryList.jsp--%>
      </aside>
      <div class="col-md-8">
        <div class="row" style="padding-right: 15px;" align="right">
          <a type="button" class="btn btn-primary" id="search">点击按钮进行商品搜索</a>
        </div>
        <main id="commodityListBySales">
          <%--commodityListBySales.jsp--%>
        </main>
      </div>

    </div>
  </div>
</section>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<%--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<script src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js"/>"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

<script>
  $(document).ready(function () {
    var commodityListBySales = document.getElementById("commodityListBySales");
    var commodityListByCreateDate = document.getElementById("commodityListByCreateDate");

    $("#commodityListBySales").load("commodity/commodityListBySales", function (response) {
      $("#commodityListBySales").html(response);
    });

    $("#commodityListByCreateDate").load("commodity/commodityListByCreateDate", function (response) {
      $("#commodityListByCreateDate").html(response);
    })
    $("#categoryList").load("category/categoryList", function (response) {
      $("#categoryList").html(response);
    })

  });

  $("#search").click(function () {
    window.open("search")
  })
</script>

</body>
</html>
