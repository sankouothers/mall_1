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
  <title>未上架的商品</title>
</head>
<body class="body">
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<section class="content">
  <div class="container">
    <c:forEach var="item" items="${commodityList}">
      <div class="col-md-3">
        <div class="thumbnail">
            <%--<img src="..." alt="...">--%>
          <div class="caption">

            <div class="table" style="margin-bottom: 0px;">
              <table class="table" style="margin-bottom: 0px;">
                <thead>

                </thead>
                <tbody>
                <tr>
                  <td>名称</td>
                  <td>${item.name}</td>
                </tr>

                <tr>
                  <td>创建时间</td>
                  <td>${item.createDateString}</td>
                </tr>
                <tr>
                  <td>品牌</td>
                  <td>${item.brand.name}</td>
                </tr>
                <tr>
                  <td>功能</td>
                  <td>${item.category.name}</td>
                </tr>
                <tr>
                  <td>类别</td>
                  <td>${item.effect.name}</td>
                </tr>
                <tr>
                  <td>单价</td>
                  <td>${item.price}</td>
                </tr>
                <tr>
                  <td>是否上架</td>
                  <c:if test="${item.putaway eq false}">
                    <td>未上架</td>
                  </c:if>
                  <c:if test="${item.putaway eq true}">
                    <td>正在销售</td>
                  </c:if>
                </tr>
                </tbody>
              </table>
            </div>

            <p style="margin-bottom: 0px;">
              <c:if test="${item.putaway eq false}">
                <a href="/commodity/putaway?id=${item.id}" class="btn btn-primary" role="button">商品上架</a>
              </c:if>
              <c:if test="${item.putaway eq true}">
                <a href="/commodity/unshelve?id=${item.id}" class="btn btn-primary" role="button">商品下架</a>
              </c:if>
            </p>
          </div>
        </div>
      </div>
    </c:forEach>

  </div>

</section>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<%--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<script src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js"/>"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

</body>
</html>
