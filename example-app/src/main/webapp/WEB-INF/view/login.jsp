<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/index?way=Login" var="login"/>
<c:url value="/index?way=FormToRegister" var="toRegister"/>

<!DOCTYPE html>
<html lang="pt-br">

<c:import url="../model/head-login.jsp"/>

<body class="text-center">

    <form action="${login}" method="post" class="form-signin">

        <img class="mb-4" src="img/logo.png" alt width="200">

        <h1 class="h3 mb-3 font-weight-normal">COLLEGE</h1>

        <c:if test="${user == 'NotFound'}">
            <br>
            <h6>Usuário não encontrado</h6>
        </c:if>

        <label for="login" class="sr-only">Login</label>
        <input type="text" name="login" id="login" class="form-control" placeholder="Login">
        <label for="inputPassword" class="sr-only">Senha</label>
        <input type="password" name="pass" id="inputPassword" class="form-control" placeholder="Senha">

        <p style="color: white"> Não é cadastrado? <a href="${toRegister}">Clique aqui</a></p>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>

    </form>
</body>
</html>