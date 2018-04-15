<%--
  Created by IntelliJ IDEA.
  User: osamah
  Date: 4/14/18
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seller Page</title>
</head>
<body>
<h2>Products Table: </h2>
<table>
    <tr>
        <th style="border: 2px solid; padding: 10px;">Product ID</th>
        <th style="border: 2px solid; padding: 10px;">Brand</th>
        <th style="border: 2px solid; padding: 10px;">Model Number</th>
        <th style="border: 2px solid; padding: 10px;">CPU</th>
        <th style="border: 2px solid; padding: 10px;">RAM</th>
        <th style="border: 2px solid; padding: 10px;">Hard Disk</th>
        <th style="border: 2px solid; padding: 10px;">Conditions</th>
        <th style="border: 2px solid; padding: 10px;">Description</th>
        <th style="border: 2px solid; padding: 10px;">Price</th>
        <th style="border: 2px solid; padding: 10px;">Approved</th>
        <th style="border: 2px solid; padding: 10px;">User ID</th>
        <th style="border: 2px solid; padding: 10px;">Admin Role</th>
    </tr>
    <c:forEach var="productsList" items="${products}">
        <tr>
            <td style="border: 2px solid; padding: 10px;">${productsList.id}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.brand}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.modelNumber}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.cpu}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.ram}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.hdd}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.conditions}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.description}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.price}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.approved}</td>
            <td style="border: 2px solid; padding: 10px;">${productsList.user.id}</td>
            <td style="border: 2px solid; padding: 10px;">
                <a href="deleteProduct?productID=${productsList.id}" value="productID">Delete</a>||
                <a href="editProduct?productID=${productsList.id}" value="productID">Approved</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
