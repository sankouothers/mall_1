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
  <jsp:include page="/WEB-INF/common/nav.jsp"/>
  <title>购买商品</title>
</head>
<body>
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<div class="container">
  <div class="clearfix">&nbsp;</div>

  <div class="well">
    <h1 class="text-center">
      购买商品
    </h1>

    <form:form action="/indent/buy" method="post" cssClass="form-horizontal" commandName="command">

      <form:hidden path="consumerId"/>
      <form:hidden path="commodityId"/>
      <form:hidden path="merchantId"/>

      <spring:bind path="id">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="id" class="col-sm-2 control-label">订单编号</label>

          <div class="col-sm-10">
            <form:input id="id" path="id" cssClass="form-control"
                        required="true" readonly="true"/>
            <form:errors path="id" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="commodityName">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="commodityName" class="col-sm-2 control-label">商品名称</label>

          <div class="col-sm-10">
            <form:input id="commodityName" path="commodityName" cssClass="form-control"
                        required="true" readonly="true"/>
            <form:errors path="commodityName" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="price">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="price" class="col-sm-2 control-label">单价</label>

          <div class="col-sm-10">
            <form:input id="price" path="price" cssClass="form-control" required="true" readonly="true"/>
            <form:errors path="price" cssClass="alert-danger" element="div"/>
          </div>

        </div>
      </spring:bind>

      <spring:bind path="createDate">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="createDate" class="col-sm-2 control-label">下单时间</label>

          <div class="col-sm-10">
            <form:input id="createDate" path="createDate" cssClass="form-control" required="true" readonly="true"/>
            <form:errors path="createDate" cssClass="alert-danger" element="div"/>
          </div>

        </div>
      </spring:bind>

      <spring:bind path="userName">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="userName" class="col-sm-2 control-label">收货人</label>

          <div class="col-sm-10">
            <form:input id="userName" path="userName" cssClass="form-control" required="true"/>
            <form:errors path="userName" cssClass="alert-danger" element="div"/>
          </div>

        </div>
      </spring:bind>


      <spring:bind path="phoneNumber">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="phoneNumber" class="col-sm-2 control-label">电话</label>

          <div class="col-sm-10">
            <form:input id="phoneNumber" path="phoneNumber" cssClass="form-control"/>
            <form:errors path="phoneNumber" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="totalNumber">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="totalNumber" class="col-sm-2 control-label">购买数量</label>

          <div class="col-sm-10">
            <form:input id="totalNumber" path="totalNumber" cssClass="form-control" type="number"/>
            <form:errors path="totalNumber" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="totalPrice">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="totalPrice" class="col-sm-2 control-label">总金额</label>

          <div class="col-sm-10">
            <form:input id="totalPrice" path="totalPrice" cssClass="form-control" type="number"/>
            <form:errors path="totalPrice" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="addressId">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="addressId" class="col-sm-2 control-label">送货地址</label>
          <div class="col-sm-10">
            <select class="form-control" name="addressId" id="addressId">
              <c:forEach items="${command.addressList}" var="item">
                <option value="${item.id}"> ${item.address}</option>
              </c:forEach>
            </select>
          </div>
        </div>
      </spring:bind>


      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-primary">立即购买</button>
          <button type="button" class="btn btn-primary" id="indent">添加新地址</button>
        </div>
      </div>
    </form:form>
  </div>
</div>

<div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="createIndentForm">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
            aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="gridSystemModalLabel">添加新地址</h4>
      </div>
      <div class="modal-body">
        <div class="container-fluid">
          <form class="form-horizontal" role="form" action="/address/create" method="post">
            <input type="hidden" name="consumerId" value="${command.consumerId}">
            <input type="hidden" name="indentId" value="${command.id}">
            <div class="form-group">
              <label for="address" class="col-sm-2 control-label">地址</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="address" name="address">
              </div>
            </div>

            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                  <label>
                    <input type="checkbox" id="defaultAddress" name="defaultAddress" value="true">设为默认地址
                  </label>
                </div>
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">添加新地址</button>
              </div>
            </div>
          </form>
        </div>
      </div>
      <%--<div class="modal-footer">--%>
      <%--<button type="button" class="btn btn-primary" id="determine">Determine</button>--%>
      <%--</div>--%>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="createAddress">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
            aria-hidden="true">&times;</span></button>
      </div>
      <div class="modal-body">
        <div class="container-fluid">

          <div class="row">
            <div class="col-sm-9">
              <div class="row">
                <div class="col-xs-8 col-sm-6">
                  添加地址成功
                </div>
              </div>
            </div>
          </div>

        </div>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

<script type="application/javascript">
  $("#totalNumber").change(function () {
    var count = $("#totalNumber").val();
    var price = $("#price").val();

    $("#totalPrice").val(count * price);
  })

  var createAddress = "${command.createAddress}";
  if (createAddress == "true" && createAddress != null) {
    $('#createAddress').modal();
  }

  $('#indent').click(function () {
    $('#createIndentForm').modal();
  })

  $('#determine').click(function () {
    location.href = "/login";
  })
</script>

</body>
</html>
