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
  <title>正在处理的订单</title>
</head>
<body class="body">
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<section class="content">
  <div class="container">
    <div class="well">

      <c:set var="notIndent" scope="page" value="${command.notIndent}"/>
      <c:choose>

        <c:when test="${notIndent eq true}">
          <h3>你还没有购买任何商品.</h3>
        </c:when>

        <c:otherwise>
          <table class="table">
            <tr>
              <th>订单号</th>
              <th>商品名称</th>
              <th>单价</th>
              <th>创建时间</th>
              <th>总金额</th>
              <th>购买数量</th>
              <th>状态</th>
            </tr>
            <tbody>
            <c:forEach items="${command.indentCommandList}" var="item">
              <c:set var="state" scope="page" value="${item.state}"/>
              <c:set var="waitShipping" scope="page" value="waitShipping"/>
              <c:set var="waitPickup" scope="page" value="waitPickup"/>
              <c:set var="isPickup" scope="page" value="isPickup"/>
              <tr>
                <td>${item.id}</td>
                <td>${item.commodityName}</td>
                <td>${item.price}</td>
                <td>${item.createDate}</td>
                <td>${item.totalPrice}</td>
                <td>${item.totalNumber}</td>
                <c:if test="${state eq waitShipping}">
                  <td>配送中</td>
                </c:if>
                <c:if test="${state eq waitPickup}">
                  <td>等待取货</td>
                </c:if>
                <c:if test="${state eq waitPickup}">
                  <td>已完成</td>
                </c:if>
                <td>
                </td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </c:otherwise>
      </c:choose>
    </div>

  </div>

</section>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

</body>
</html>
