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
  <title>商户主页</title>

</head>
<body>
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<section class="content">

  <div class="container">

    <div class="row">
      <aside class="col-md-4" id="categoryList">
        <ul class="nav nav-pills nav-stacked left" role="tablist">
            <li role="presentation"><a href="/commodity/create" aria-controls="home" role="tab" data-toggle="pill">添加新的商品</a></li>
            <li role="presentation"><a href="/merchant/" aria-controls="home" role="tab" data-toggle="pill">查看需要处理的订单</a></li>
            <li role="presentation"><a href="/merchant/" aria-controls="home" role="tab" data-toggle="pill">查看正在销售的商品</a></li>
            <li role="presentation"><a href="/merchant/" aria-controls="home" role="tab" data-toggle="pill">查看未上架商品</a></li>
        </ul>
      </aside>
      <div class="col-md-8">
        <main id="commodityListBySales">
          <%--commodityListBySales.jsp--%>
        </main>
      </div>

    </div>
  </div>
</section>

<c:set var="merchantId" scope="page" value="${sessionScope.LoggedInUserID}"/>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<%--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<script src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js"/>"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

<script type="application/javascript">
  $(document).ready(function () {
    $("#commodityListBySales").load("/merchant/commodityListBySales?id=${merchantId}", function (response) {
      $("#commodityListBySales").html(response);
    });
  })
</script>

</body>
</html>
