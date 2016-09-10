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
  <title>用户注册</title>
</head>
<body>

<div class="container">
  <div class="clearfix">&nbsp;</div>

  <div class="well">
    <h1 class="text-center">
      用户注册
    </h1>
    <form:form action="/consumer/create" method="post" cssClass="form-horizontal" commandName="command">
      <form:hidden path="id"/>

      <spring:bind path="name">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="name" class="col-sm-2 control-label">Username</label>

          <div class="col-sm-10">
            <form:input id="name" path="name" cssClass="form-control" placeholder="Username" required="true"/>
            <form:errors path="name" cssClass="alert-danger" element="div"/>
          </div>

        </div>
      </spring:bind>

      <spring:bind path="passWord">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="passWord" class="col-sm-2 control-label">Password</label>

          <div class="col-sm-10">
            <form:password id="passWord" path="passWord" cssClass="form-control" placeholder="Password"
                           required="true"/>
            <form:errors path="passWord" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="passWordValidator">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="passWordValidator" class="col-sm-2 control-label">Confirm password</label>

          <div class="col-sm-10">
            <form:password id="passWordValidator" path="passWordValidator" cssClass="form-control"
                           placeholder="passWord Validator"
                           required="true"/>
            <form:errors path="passWordValidator" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="phoneNumber">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="phoneNumber" class="col-sm-2 control-label">Phone Number</label>

          <div class="col-sm-10">
            <form:input id="phoneNumber" path="phoneNumber" cssClass="form-control" placeholder="phone" type="number"/>
            <form:errors path="phoneNumber" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="IDcard">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="IDcard" class="col-sm-2 control-label">IDCardNumber</label>

          <div class="col-sm-10">
            <form:input id="IDcard" path="IDcard" cssClass="form-control" placeholder="IDCardNumber"/>
            <form:errors path="IDcard" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="question">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="answer" class="col-sm-2 control-label">Question</label>

          <div class="col-sm-10">
            <form:input id="question" path="question" cssClass="form-control" placeholder="Question"/>
            <form:errors path="question" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <spring:bind path="answer">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="answer" class="col-sm-2 control-label">Answer</label>

          <div class="col-sm-10">
            <form:input id="answer" path="answer" cssClass="form-control" placeholder="Answer"/>
            <form:errors path="answer" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>

      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
      </div>
    </form:form>
  </div>
</div>

<div class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
            aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="gridSystemModalLabel">通知</h4>
      </div>
      <div class="modal-body">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-3 col-md-offset-3">
              <h4>注册成功</h4>
            </div>
          </div>

          <div class="row">
            <div class="col-sm-9">
              <div class="row">
                <div class="col-xs-8 col-sm-6">
                  点击确认将跳转到登录页面
                </div>
              </div>
            </div>
          </div>

        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" id="determine">Determine</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<%--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>--%>
<script src="<c:url value="/bootstrap/js/jquery-1.11.3.min.js"/>"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>

<script type="application/javascript">
  var create = "${command.create}";
  if (create == "Y" && create != null) {
    $('#myModal').modal();
  }

  $('#determine').click(function () {
    location.href = "/login";
  })

</script>
</body>
</html>
