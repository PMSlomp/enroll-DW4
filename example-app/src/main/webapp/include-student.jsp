<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/enroll" var="enroll"/>
<%--<c:url value="/list?way=enroll" var="enroll"/>--%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <form action="${enroll}" method="post">

        Nome: <input type="text" name="name">
        <input type="submit">
    </form>

</body>
</html>