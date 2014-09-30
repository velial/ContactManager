<%@ page import="java.util.List" %>
<%@ page import="info.velial.support.domain.Payment" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../template/header.jsp"/>

<h3><spring:message code="label.payments.findPayments.form.label" /></h3>

<form role="form" class="form-horizontal">
    <div class="form-group">
        <label for="inputPaymentsNumber" class="col-sm-2 control-label"><spring:message code="label.payments.findPayments.form.paymentNumber"/></label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputPaymentsNumber" name="inputPaymentsNumber">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPhoneNumber" class="col-sm-2 control-label"><spring:message code="label.payments.findPayments.form.phoneNumber"/></label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputPhoneNumber" name="inputPhoneNumber">
        </div>
    </div>
    <div class="form-group">
        <label for="inputDateStart" class="col-sm-2 control-label"><spring:message code="label.payments.findPayments.form.dateStart"/></label>
        <div class="col-sm-10">
            <input type="date" class="form-control" id="inputDateStart" name="inputDateStart">
        </div>
    </div>
    <div class="form-group">
        <label for="inputDateEnd" class="col-sm-2 control-label"><spring:message code="label.payments.findPayments.form.dateEnd"/></label>
        <div class="col-sm-10">
            <input type="date" class="form-control" id="inputDateEnd" name="inputDateEnd">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default"><spring:message code="label.payments.findPayments.form.button" /></button>
        </div>
    </div>
</form>

<jsp:include page="../../template/footer.jsp"/>