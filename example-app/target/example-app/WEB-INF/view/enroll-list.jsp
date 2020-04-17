<%@ page import="java.util.List" %>
<%@ page import="br.edu.utfpr.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/index?way=DeleteStudent&id=" var="delete"/>
<c:url value="/index?way=FormToEdit&id=" var="edit"/>
<c:url value="/index?way=IncludeStudent" var="include"/>
<c:set value="0" var="aux"/>

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

                        <c:if test="${empty students}">
                            Nenhum estudante matriculado
                        </c:if>

                        <c:if test="${not empty students}">

                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Nome</th>
                                        <th scope="col">Curso</th>
                                        <th scope="col">Ano</th>
                                        <th scope="col">Opções</th>
                                    </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${students}" var="student">
                                    <tr>
                                        <th scope="row">${aux = aux + 1}</th>
                                        <td>${student.name}</td>
                                        <td>${student.curse}</td>
                                        <td>${student.year}</td>
                                        <td>
                                            <a href="${delete}${student.id}">deletar</a> |
                                            <a href="${edit}${student.id}">editar</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </c:if>

                        <a href="${include}"><button class="btn btn-sm btn-outline-secondary" type="button" style="margin-top: 10px">
                            Voltar para inscrição</button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<c:import url="../model/footer.jsp"/>

</html>