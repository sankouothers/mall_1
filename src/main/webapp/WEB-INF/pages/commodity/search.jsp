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
  <title>商品搜索</title>
</head>
<body class="body">
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<section class="content">

  <div class="container">
    <div class="well center-block">
      <div class="row">
        <div class="col-lg-6" style="float:right;">
          <div class="input-group">
            <input type="text" id="query" class="form-control input-lg" placeholder="Search for...">
      <span class="input-group-btn">
        <button class="btn btn-primary btn-lg" type="button" id="search">Search</button>
      </span>
          </div><!-- /input-group -->
        </div><!-- /.col-lg-6 -->
      </div><!-- /.row -->
    </div>

    <div class="row" id="commodityList">

    </div>
  </div>


</section>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
<script type="application/javascript">
  $(document).ready(function () {
    $("#commodityList").load("commodity/commodityList", function (response) {
      $("#commodityList").html(response);
    })
  });
</script>
</body>
</html>
