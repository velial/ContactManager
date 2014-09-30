<%@ page import="java.util.List" %>
<%@ page import="info.velial.support.domain.Payment" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../template/header.jsp"/>

<h3><spring:message code="label.payments.lastPayments" /></h3>
<c:if test="${!empty lastPayments}">
    <table class="table table-hover">
        <tr>
            <th><spring:message code="label.payments.table.id" /></th>
            <th><spring:message code="label.payments.table.phone" /></th>
            <th><spring:message code="label.payments.table.amount" /></th>
            <th><spring:message code="label.payments.table.amount_cash" /></th>
        </tr>

        <%List<Payment> list = (List<Payment>)request.getAttribute("lastPayments");
        for(int i =0; i<list.size(); i++) {
        %>

            <tr>
                <td><a href="/payments/<%=list.get(i).getId()%>"><%=list.get(i).getId()%></a></td>
                <td><%=list.get(i).getPhone()%></td>
                <td><%=list.get(i).getAmount()%></td>
                <td><%=list.get(i).getAmount_cash()%></td>
            </tr>
        <%}%>
    </table>
</c:if>

<jsp:include page="../../template/footer.jsp"/>