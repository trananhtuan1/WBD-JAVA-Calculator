<%--
  Created by IntelliJ IDEA.
  User: tinca
  Date: 4/30/2018
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="get" action="/aa">
    <div class="login">
        <input type="text" name="firstOperand" size="30" placeholder="First Operand">
        <select name="operator" placeholder="Operator">
            <option value="+">addition</option>
            <option value="-">substraction</option>
            <option value="*">multiplication</option>
            <option value="/">division</option>
        </select>
        <input type="text" name="secondOperand" size="30" placeholder="Second Operand">
        <input type="submit" value="Submit">
    </div>
</form>
</body>
</html>
