<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: ozintel06
  Date: 16/8/15
  Time: 下午11:10
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand" href="/mall">商城首页</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/indent/allIndent?id=${sessionScope.LoggedInUserID}">订单</a></li>
        <li><a href="/indent/shoppingCart?id=${sessionScope.LoggedInUserID}">购物车</a></li>

        <c:if test="${sessionScope.LoggedInUserID eq null && sessionScope.LoggedInUserName eq null}">
          <li><a href="/login">登录</a></li>
        </c:if>
        <c:if test="${sessionScope.LoggedInUserID ne null && sessionScope.LoggedInUserName ne null}">
          <c:if test="${sessionScope.LoggedInUserRole ne null}">
            <c:set var="url" scope="page"
                   value="/${sessionScope.LoggedInUserRole}/info?id=${sessionScope.LoggedInUserID}"/>
          </c:if>
          <li><a href="${url}">${sessionScope.LoggedInUserName}</a></li>
        </c:if>

      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>