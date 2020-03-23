<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/include" var="include"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <form action="${include}" method="post">

        Nome: <input type="text" name="name">
        <input type="submit">
    </form>

</body>
</html>