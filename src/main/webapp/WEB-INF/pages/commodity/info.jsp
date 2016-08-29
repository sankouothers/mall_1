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
  <title>商品信息</title>
</head>
<body class="body">
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<section class="content">
  <div class="container">

    <div class="row">
      <div class="col-lg-5">

      </div>
      <div class="col-lg-7">
        <ul class="list-group">
          <li class="list-group-item">名称   ${command.name}</li>
          <li class="list-group-item">品牌:  ${command.brand}</li>
          <li class="list-group-item">类别:  ${command.category}</li>
          <li class="list-group-item">功能:  ${command.effect}</li>
          <li class="list-group-item">价格:  ${command.price}</li>
        </ul>
        <button class="btn btn-primary">加入订单</button>
        <button class="btn btn-primary">购买</button>
      </div>
    </div>
  </div>

</section>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

</body>
</html>
