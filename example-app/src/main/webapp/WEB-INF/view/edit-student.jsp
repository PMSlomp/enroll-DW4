<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/list?way=EditStudent" var="editing"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <form action="${editing}" method="post">

        Nome: <input type="text" name="name" value="${student.name}">
        <input type="hidden" name="id" value="${student.id}">
        <input type="submit">
    </form>

</body>
</html>