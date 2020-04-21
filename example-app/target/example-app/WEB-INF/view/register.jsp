<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/index?way=Register" var="register"/>

<!DOCTYPE html>
<html lang="pt-br">

<c:import url="../model/head.jsp"/>

<body>
    <div class="container" style="margin-top: 20px">
        <div class="row justify-content-center">
            <div class="card col" style="max-width: 768px;">
                <div class="card-body">
                    <h3 class="text-center" style="margin-bottom: 30px">Cadastro</h3>
                    <div class="row">

                        <form action="${register}" method="post" class="form-row col-md-12">

                            <div class="col-md-6">
                                <label for="inputLogin" class="sr-only">Login</label>
                                <input name="login" type="text" id="inputLogin" class="form-control" placeholder="Nome" required>
                            </div>

                            <div class="col-md-6">
                                <label for="inputPass" class="sr-only">Senha</label>
                                <input name="pass" type="password" id="inputPass" class="form-control" placeholder="senha" required>
                            </div>

                            <div class="col" style="margin-top: 10px">
                                <button class="btn btn-sm btn-outline-secondary" type="submit">Cadastrar</button>
                            </div>

                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>