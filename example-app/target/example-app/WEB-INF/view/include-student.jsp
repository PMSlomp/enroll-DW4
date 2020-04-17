<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/enroll" var="enroll"/>

<!DOCTYPE html>
<html lang="pt-br">

<c:import url="../model/head.jsp"/>

<c:import url="../model/header.jsp"/>

<body>

    <div class="container" style="margin-top: 20px">
        <div class="row justify-content-center">
            <div class="card col" style="max-width: 768px;">
                <div class="card-body">
                    <h3 class="text-center" style="margin-bottom: 30px">Inscrever</h3>
                    <div class="row">

                        <form action="${enroll}" method="post" class="form-row col-md-12">

                            <div class="col-md-5">
                                <label for="inputName" class="sr-only">Nome</label>
                                <input name="name" type="text" id="inputName" class="form-control" placeholder="Nome" required>
                            </div>

                            <div class="col-md-4">
                                <label for="inputCurse" class="sr-only">Curso</label>
                                <input name="curse" type="text" id="inputCurse" class="form-control" placeholder="Curso" required>
                            </div>

                            <div class="col-md-3">
                                <label for="inputYear" class="sr-only">Ano</label>
                                <input name="year" type="text" id="inputYear" class="form-control" placeholder="Ano" required>
                            </div>

                            <div class="col" style="margin-top: 10px">
                                <button class="btn btn-sm btn-outline-secondary" type="submit">Inscrever</button>
                            </div>

                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<c:import url="../model/footer.jsp"/>

</html>