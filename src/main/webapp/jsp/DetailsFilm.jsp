<%--
  Created by IntelliJ IDEA.
  User: CDI
  Date: 23/11/2018
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste</title>
</head>
<body>
<a href="/">Index</a><br><br>
<%----------------------------------------%>
<ul>
    <c:forEach items="${listfilms}" var="chaquefilm">
        <li>
            <a href="/DetailsFilm =${chaquefilm.id}">
                    ${chaquefilm.titre}
            </a>
        </li>
    </c:forEach>
</ul>
<%----------------------------------------%>
<br>
<br>
<a href="/historique">
    Allez à l'historique
</a>
</body>
</html
