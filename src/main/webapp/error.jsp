<%--
  Created by IntelliJ IDEA.
  User: osamah
  Date: 4/8/18
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ERROR</title>
</head>
<body>
    <h1>SORRY ....</h1>
    <h3>Error <% out.print(response.getStatus()); %></h3>
    <p>Your are getting this error because of one or all the following reasons: </p>
    <ul>
        <li>You don't have enough permission to access this page.</li>
        <li>You entered the wrong password.</li>
        <li>You are not registered as a seller. Please click <a href="addSeller"> here </a> to register.</li>
        <li>Something really went wrong.</li>
    </ul>
    <p>Please contact 608-123-4567 or email <a href="admin@sbt.com">admin@sbt.com</a>, and include the error code at the top left corner.</p>
    <p>Thanks for your patience.</p>
    <p>Back to <a href="index.jsp">Home Page</a></p>
</body>
</html>
