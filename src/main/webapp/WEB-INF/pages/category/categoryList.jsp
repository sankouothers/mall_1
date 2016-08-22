<%--
  Created by IntelliJ IDEA.
  User: ozintel06
  Date: 16/8/16
  Time: 下午6:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div>
  <ul class="nav nav-pills nav-stacked left" role="tablist">
    <c:forEach var="item" items="${categoryList}">
      <li role="presentation"><a href="" aria-controls="home" role="tab" data-toggle="pill">${item.name}</a></li>
    </c:forEach>
  </ul>

  <%--<div class="tab-content right">--%>
    <%--<div role="tabpanel" class="tab-pane" id="home">home</div>--%>
    <%--<div role="tabpanel" class="tab-pane" id="profile">profile</div>--%>
    <%--<div role="tabpanel" class="tab-pane" id="messages">messages</div>--%>
    <%--<div role="tabpanel" class="tab-pane" id="settings">settings</div>--%>
  <%--</div>--%>
</div>