<%--
  Created by IntelliJ IDEA.
  User: ozintel06
  Date: 16/8/22
  Time: 上午11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<c:forEach var="item" items="${commodityList}">
  <div class="col-sm-6 col-md-2">
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
              <td>品牌</td>
              <td>${item.brand.name}</td>
            </tr>
            <tr>
              <td>价格</td>
              <td>${item.price}</td>
            </tr>

            </tbody>
          </table>
        </div>

        <p style="margin-bottom: 0px;">
          <a href="#" class="btn btn-primary" role="button">商品信息</a>
        </p>
      </div>
    </div>
  </div>
</c:forEach>
