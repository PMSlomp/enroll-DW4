<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/index?way=Login" var="login"/>


<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <form action="${login}" method="post">

        Login: <input type="text" name="login">
        Senha: <input type="password" name="pass">

        <input type="submit">
    </form>

    <c:if test="${user == 'NotFound'}">
        Usuário não encontrado
    </c:if>

</body>
</html>