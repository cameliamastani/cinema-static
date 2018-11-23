

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste</title>
</head>
<body>
<a href="/">Revenir au menu principal</a><br><br>
<%--
<ul>
    <c:forEach items="${listfilms}" var="film">
        <li>

                    ${film.titre}

        </li>
    </c:forEach>
</ul>
--%>
<ul>
    <c:forEach items="${listfilms}" var="chaquefilm">
        <li>
            <a href="/DetailsFilm ${chaquefilm.id}">
                    ${chaquefilm.titre}
            </a>
        </li>
    </c:forEach>
</ul>