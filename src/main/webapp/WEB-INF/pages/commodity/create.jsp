<%--
  Created by IntelliJ IDEA.
  User: Yang Wang
  Date: 8/15/15
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
  <jsp:include page="/WEB-INF/common/meta.jsp"/>
  <title>添加商品</title>
</head>
<body>

<div class="container">
  <div class="clearfix">&nbsp;</div>

  <div class="well">
    <h1 class="text-center">
      添加商品
    </h1>
    <form:form action="/commodity/create" method="post" cssClass="form-horizontal" commandName="command">
      <form:hidden path="merchantId"/>

      <spring:bind path="name">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="name" class="col-sm-2 control-label">商品名称</label>

          <div class="col-sm-10">
            <form:input id="name" path="name" cssClass="form-control" placeholder="CommodityName" required="true"/>
            <form:errors path="name" cssClass="alert-danger" element="div"/>
          </div>

        </div>
      </spring:bind>

      <spring:bind path="price">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="price" class="col-sm-2 control-label">单价</label>

          <div class="col-sm-10">
            <form:input id="price" path="price" cssClass="form-control" placeholder="price"
                        required="true"/>
            <form:errors path="price" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="categoryId">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="categoryId" class="col-sm-2 control-label">类型</label>
          <div class="col-sm-10">
            <select class="form-control" name="categoryId" id="categoryId">
              <c:forEach items="${command.categoryList}" var="item">
                <option value="${item.id}"> ${item.name}</option>
              </c:forEach>
            </select>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="brandId">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="brandId" class="col-sm-2 control-label">品牌</label>
          <div class="col-sm-10">
            <select class="form-control" name="brandId" id="brandId">
              <c:forEach items="${command.brandList}" var="item">
                <option value="${item.id}"> ${item.name}</option>
              </c:forEach>
            </select>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="effectId">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="effectId" class="col-sm-2 control-label">用途</label>
          <div class="col-sm-10">
            <select class="form-control" name="effectId" id="effectId">
              <c:forEach items="${command.effectList}" var="item">
                <option value="${item.id}"> ${item.name}</option>
              </c:forEach>
            </select>
          </div>
        </div>
      </spring:bind>

      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-primary">添加商品</button>
        </div>
      </div>
    </form:form>
  </div>
</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<%--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<script src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js"/>"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>


</body>
</html>
