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
        <legend>Personne</legend>
        <div>
            <label>Name : </label>
            <input type="text" name="name" value="${name}"/>
            <label>Age : </label>
            <input type="number" name="number" value="${number}"/>
        </div>
        <div>
            <label>Numero : </label>
            <input type="number" name="adresse.numero" value="${adresse.numero}"/>
            <label>Rue : </label>
            <input type="text" name="adresse.rue" value="${adresse.rue}"/>
        </div>
        <div>
            <label>Ville : </label>
            <input type="text" name="adresse.ville.name" value="${adresse.ville.name}"/>
            <label>testVille : </label>
            <input type="text" name="adresse.ville.test" value="${adresse.ville.test}"/>
        </div>
        <input type="submit" value="GO"/>
    </fieldset>
    <fieldset>
        <legend>Reponse</legend>
        <div>${actionExecute.message }</div>
        <div>${actionExecute.messageAdresse }</div>
    </fieldset>
</form>
</body>
</html>
