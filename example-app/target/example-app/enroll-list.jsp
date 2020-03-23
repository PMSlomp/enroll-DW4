<%@ page import="java.util.List" %>
<%@ page import="br.edu.utfpr.Student" %>
<%@ page import="java.util.List, br.edu.utfpr.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/delete?id=" var="delete"/>
<c:url value="/edit?id=" var="edit"/>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:if test="${not empty student}">
        Estudante ${student} cadastrado com sucesso!
    </c:if>

    <ul>

        <c:forEach items="${students}" var="student">
            <li>
                ${student.name}
                <a href="${delete}${student.id}">deletar</a>
                <a href="${edit}${student.id}">editar</a>
            </li>
        </c:forEach>

    </ul>

</body>
</html>
