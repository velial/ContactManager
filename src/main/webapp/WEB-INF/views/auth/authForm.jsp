<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="../../template/header.jsp"/>

<c:if test="${not empty param.error}">
    <font color="red"> <spring:message code="label.loginerror" />
        : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </font>
</c:if>

<form role="form" name="f" action="/j_spring_security_check" method="post">
    <div class="form-group">
        <label for="j_username"><spring:message code="label.authForm.login"/></label>
        <input type="text" class="form-control" id="j_username" name="j_username">
    </div>
    <div class="form-group">
        <label for="j_password"><spring:message code="label.authForm.password"/></label>
        <input type="text" class="form-control" id="j_password" name="j_password">
    </div>
    <div class="checkbox">
        <label>
            <input type="checkbox" name="_spring_security_remember_me"> <spring:message code="label.authForm.rememberMe"/>
        </label>
    </div>
    <button type="submit" class="btn btn-default"><spring:message code="label.authForm.submit"/> </button>
</form>

<jsp:include page="../../template/footer.jsp"/>