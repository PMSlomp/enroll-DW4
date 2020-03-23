<%@ page import="java.util.List" %>
<%@ page import="br.edu.utfpr.Student" %>
<%@ page import="java.util.List, br.edu.utfpr.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

    <ul>

        <c:forEach items="${students}" var="student">
            <li>${student.name}</li>
        </c:forEach>

    </ul>

</body>
</html>
