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
  <title>添加成功</title>

</head>
<body class="body">
<jsp:include page="/WEB-INF/common/nav.jsp"/>

<div align="center">
  <div class="jumbotron">
    <h3>添加商品成功</h3>
  </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<%--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<script src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js"/>"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
</body>
</html>
