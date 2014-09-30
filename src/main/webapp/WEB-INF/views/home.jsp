<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="../template/header.jsp" />

<sec:authorize ifNotGranted="ROLE_ADMIN,ROLE_USER">
<h1> <spring:message code="label.main.wellcome"/> </h1>
</sec:authorize>

<jsp:include page="../template/footer.jsp" />