
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="post">

    <p><input type="text" name="num1" placeholder="Number 1"></p>
    <p><select name="operation">
        <option value="sum">Sum</option>
        <option value="sub">Sub</option>
        <option value="mul">Mul</option>
        <option value="div">Div</option>
    </select></p>
    <p><input type="text" name="num2" placeholder="Number 2"></p>
    <p><button>Submit</button></p>
    <p>${operation.result}</p>
</form>
<a href="/history">History</a>
</body>
</html>
