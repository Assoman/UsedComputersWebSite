<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="templates/head.jsp"%>

<html>
<body>
<h2>Search for Products</h2>
<form method="get" action="searchProduct">
    <label for="pName" class="control-label col-sm-2">Product Brand: </label>
    <input type="text" name="pName" id="pName"/><br />

    <label for="zipcode" class="control-label col-sm-2">Zipcode: </label>
    <input type="text" name="zipcode" id="zipcode"/><br />

    <input type="submit" name="submit" style="margin: 10px;"/>
</form>
<div class="container-fluid">
    <h2>Products Available for Sale</h2>
    <table>
        <tr>
            <th style="border: 2px solid; padding: 10px;">Brand</th>
            <th style="border: 2px solid; padding: 10px;">Model Number</th>
            <th style="border: 2px solid; padding: 10px;">CPU</th>
            <th style="border: 2px solid; padding: 10px;">RAM</th>
            <th style="border: 2px solid; padding: 10px;">Hard Disk</th>
            <th style="border: 2px solid; padding: 10px;">Conditions</th>
            <th style="border: 2px solid; padding: 10px;">Description</th>
            <th style="border: 2px solid; padding: 10px;">Price</th>
            <th style="border: 2px solid; padding: 10px;">City</th>
            <th style="border: 2px solid; padding: 10px;">ZipCode</th>
            <th style="border: 2px solid; padding: 10px;">Contact Seller</th>

        </tr>
        <c:forEach var="productsList" items="${products}">
            <tr>
                <td style="border: 2px solid; padding: 10px;">${productsList.brand}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.modelNumber}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.cpu}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.ram}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.hdd}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.conditions}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.description}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.price}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.user.city}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.user.zipcode}</td>
                <td style="border: 2px solid; padding: 10px;">${productsList.user.email}</td>
            </tr>
        </c:forEach>
    </table>
    
    <a href="index.jsp">Back to HomePage</a>
</div>

</body>
</html>
