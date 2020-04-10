<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/enroll" var="enroll"/>
<c:url value="/index?way=Logout" var="exit"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <a href="${exit}"> Sair</a>
    <br>
    Usuário: ${user.login}
    <br>
    <br>

    <form action="${enroll}" method="post">

        Nome: <input type="text" name="name">
        <input type="submit">
    </form>

</body>
</html>