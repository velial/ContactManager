<%@ page import="info.velial.support.domain.Payment" %>
<%@ page import="java.util.List" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: velial
  Date: 03.10.14
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${!empty lastPayments}">
    <table class="table table-hover">
        <tr>
            <th><spring:message code="label.payments.table.id" /></th>
            <th><spring:message code="label.payments.table.date" /></th>
            <th><spring:message code="label.payments.table.time" /></th>
            <th><spring:message code="label.payments.table.phone" /></th>
            <th><spring:message code="label.payments.table.amount" /></th>
            <th><spring:message code="label.payments.table.amount_cash" /></th>
        </tr>

        <%List<Payment> list = (List<Payment>)request.getAttribute("lastPayments");
            for(int i =0; i<list.size(); i++) {
        %>

        <tr>
            <td><a href="/payments/<%=list.get(i).getId()%>"><%=list.get(i).getId()%></a></td>
            <td><%=(list.get(i).getDate()).toString().substring(0,10)%></td>
            <td><%=list.get(i).getTime()%></td>
            <td><%=list.get(i).getPhone()%></td>
            <td><%=list.get(i).getAmount()%></td>
            <td><%=list.get(i).getAmount_cash()%></td>
        </tr>
        <%}%>
    </table>
</c:if>
