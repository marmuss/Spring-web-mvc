<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Number 1</th>
        <th>Number 2</th>
        <th>Operation</th>
        <th>Result</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${history}" var="operation">
        <tr>
            <th>${operation.id}</th>
            <td>${operation.num1}</td>
            <td>${operation.num2}</td>
            <td>${operation.operation}</td>
            <td>${operation.result}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
