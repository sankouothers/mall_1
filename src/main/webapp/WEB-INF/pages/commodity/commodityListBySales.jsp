<%--
  Created by IntelliJ IDEA.
  User: ozintel06
  Date: 16/8/16
  Time: 下午6:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="panel panel-default">
    <c:forEach var="item" items="${commodityListBySales}">
        <div class=" col-md-3">
            <table class="table">
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

    </c:forEach>
</div>
