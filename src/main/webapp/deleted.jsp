<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: osamah
  Date: 3/29/18
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleted</title>
</head>
<body>
<h1>Deleted Successfully, ${product}${user}</h1>
<c:choose>
    <c:when test="${userRoles == 'admin'}">
        <p>Click <a href="adminApprove">HERE</a> to go back.</p>
    </c:when>
    <c:otherwise>
        <p>Click <a href="sellerProducts">HERE</a> to go back.</p>
    </c:otherwise>
</c:choose>
</body>
</html>
