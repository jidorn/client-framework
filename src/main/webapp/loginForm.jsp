<%--
  Created by IntelliJ IDEA.
  User: Stagiaire
  Date: 22/03/2016
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<form action="monAction.perform" method="post">
    <fieldset>
        <legend>name</legend>
        <input type="text" name="name" value="${name}"/>
        <input type="submit" value="GO"/>
    </fieldset>
    ${actionExecute.message }
</form>
</body>
</html>
