<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page import="info.velial.support.domain.Payment" %>
<%@ page import="info.velial.support.domain.PaymentStatus" %>

<jsp:include page="../../template/header.jsp"/>

<%Payment payment = (Payment) request.getAttribute("payment"); %>

<h1><spring:message code="label.showPayment.header" /> ${payment.id}</h1>
<table class="table table-hover">
    <tr>
        <td><spring:message code="label.showPayment.id" /></td>
        <td>${payment.id}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.sp_id" /></td>
        <td>${payment.sp_id}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.sd_id" /></td>
        <td>${payment.sd_id}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.date" /></td>
        <td>${date} ${payment.time}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.pay_date" /></td>
        <td>${pay_date} ${payment.pay_time}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.count_send" /></td>
        <td>${payment.count_send} / ${payment.count_check}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.terminal" /></td>
        <td>#${terminal.id} ${terminal.name} ${terminal.address}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.provider" /></td>
        <td><img src="http://www.miroplat.com.ua/providers/tn16/${payment.provider_id}.png"> ${provider.name}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.phone" /></td>
        <td>${payment.phone}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.amount" /></td>
        <td>${payment.amount}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.amount_cash" /></td>
        <td>${payment.amount_cash}</td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.status" /></td>
        <td><%=PaymentStatus.getStringStatus(payment.getStatus())%></td>
    </tr>
    <tr>
        <td><spring:message code="label.showPayment.comment" /></td>
        <td>${payment.comment}</td>
    </tr>
</table>

<jsp:include page="../../template/footer.jsp"/>