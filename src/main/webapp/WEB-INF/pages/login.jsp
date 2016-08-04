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
    <title>用户登录</title>

</head>
<body class="body">


<div align="center">
    <div class="well" style="background:transparent; border: 0; width: 40%; margin: 0 20%  20px 20% ;">

        <h1 class="text-left">Please sign in</h1>
        <c:if test="${param.failed eq 'true'}">
            <div class="col-sm-10 alert alert-danger" role="alert">
                Username , password or role is not match.
            </div>
        </c:if>
        <%--'/j_spring_security_check'--%>


        <div>

            <!-- Nav tabs -->
            <ul class="nav nav-tabs nav-justified" role="tablist">
                <li role="presentation" class="active"><a href="#consumer" aria-controls="consumer" role="tab" data-toggle="tab">用户登录</a></li>
                <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">商户登录</a></li>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="consumer">
                    <form action="<c:url value="/login"/>" method="post" class="form-horizontal">
                        <div class="form-group">

                        </div>
                        <div class="form-group">

                            <div class="col-sm-10 form-group-lg">
                                <input id="name" type="text" name="name" class="form-control" placeholder="Username">
                            </div>
                        </div>

                        <div class="form-group">

                            <div class="col-sm-10 form-group-lg">
                                <input id="password" type="password" name="password" class="form-control" placeholder="Password">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-10" align="center">
                                <button type="submit" class="btn btn-primary btn-lg btn-block ">Sign in</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div role="tabpanel" class="tab-pane" id="profile">
                    <form action="<c:url value="/merchant/login"/>" method="post" class="form-horizontal">
                        <div class="form-group" style="align: center" >
                        </div>
                        <div class="form-group" style="align-items: center">

                            <div class="col-sm-10 form-group-lg">
                                <input id="name" type="text" name="name" class="form-control" placeholder="Username">
                            </div>
                        </div>

                        <div class="form-group">

                            <div class="col-sm-10 form-group-lg">
                                <input id="password" type="password" name="password" class="form-control" placeholder="Password">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-10" align="center">
                                <button type="submit" class="btn btn-primary btn-lg btn-block ">Sign in</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>




<script>
    $('#myTabs a').click(function (e) {
        e.preventDefault()
        $(this).tab('show')
    })
    $('#myTabs li:eq(2) a').tab('show')
</script>



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
</body>
</html>
