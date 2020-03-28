<%@ page import="java.util.List" %>
<%@ page import="br.edu.utfpr.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/list?way=delete&id=" var="delete"/>
<c:url value="/list?way=edit&id=" var="edit"/>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--    <c:if test="${not empty student}">--%>
<%--        Estudante ${student} cadastrado com sucesso!--%>
<%--    </c:if>--%>

    <c:if test="${empty students}">
        Nenhum estudante matriculado
    </c:if>

    <c:if test="${not empty students}">
        <ul>

            <c:forEach items="${students}" var="student">
                <li>
                    ${student.name}
                    <a href="${delete}${student.id}">deletar</a>
                    <a href="${edit}${student.id}">editar</a>
                </li>
            </c:forEach>

        </ul>
    </c:if>

</body>
</html>
