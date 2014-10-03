<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../template/header.jsp"/>

<h3><spring:message code="label.payments.lastPayments" /></h3>

<jsp:include page="lastPaymentsTable.jsp"/>

<jsp:include page="../../template/footer.jsp"/>