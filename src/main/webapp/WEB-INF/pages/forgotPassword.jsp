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
  <title>修改密码</title>
</head>
<body>
<jsp:include page="/WEB-INF/common/nav.jsp"/>
<div class="container">
  <div class="clearfix">&nbsp;</div>

  <div class="well">
    <h1 class="text-center">
      修改密码
    </h1>
    <form:form action="forgotPassword" method="post" cssClass="form-horizontal" commandName="command">

      <form:hidden path="id"/>

      <form:hidden path="role"/>

      <spring:bind path="name">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="name" class="col-sm-2 control-label">User Name</label>

          <div class="col-sm-10">
            <form:input id="name" path="name" cssClass="form-control" placeholder="UserName" value="${command.name}"
                        readonly="true"/>
            <form:errors path="name" cssClass="alert-danger" element="div"/>
          </div>
        </div>
      </spring:bind>


      <spring:bind path="question">
        <div class="form-group ${status.error ? 'has-error' : ''}">
          <label for="answer" class="col-sm-2 control-label">Question</label>

          <div class="col-sm-10">
            <form:input id="question" path="question" cssClass="form-control" value="${command.question}"
                        placeholder="Question" readonly="true"/>
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
              <h4 id="info"><span style="color: red">${command.name}</span>该用户不存在</h4>
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
      <div class="modal-footer" id="determine">
        <button type="button" class="btn btn-primary">Determine</button>
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
  var noUser = "${command.noUser}";
  var requestError = "${command.requestError}";

  if (noUser == "Y" && noUser != null) {
    $('#myModal').modal({keyboard: false});
  }

  $('#myModal').on('shown.bs.modal', function (e) {
//    JavaScript 方式
//    var info = document.getElementById("info")
//    info.innerHTML = "请求错误";
//    jQuery 方式
    $('#info').html("请求错误")

  })
  if (requestError == "Y" && requestError != null) {
    $('#myModal').modal({keyboard: false})
  }

  $('#determine button').click(function () {
    location.href = "/login";
  })
</script>

</body>
</html>
