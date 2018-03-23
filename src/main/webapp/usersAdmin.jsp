<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="templates/head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Users Table: </h2>
    <table>
        <tr>
            <th style="border: 2px solid; padding: 10px;">User ID</th>
            <th style="border: 2px solid; padding: 10px;">First Name</th>
            <th style="border: 2px solid; padding: 10px;">Last Name</th>
            <th style="border: 2px solid; padding: 10px;">User Name</th>
            <th style="border: 2px solid; padding: 10px;">Password</th>
            <th style="border: 2px solid; padding: 10px;">Email</th>
            <th style="border: 2px solid; padding: 10px;">City</th>
            <th style="border: 2px solid; padding: 10px;">State</th>
            <th style="border: 2px solid; padding: 10px;">ZipCode</th>
            <th style="border: 2px solid; padding: 10px;">Join Date</th>
            <th style="border: 2px solid; padding: 10px;">Approved</th>
            <th style="border: 2px solid; padding: 10px;">Admin Role</th>
        </tr>
        <c:forEach var="usersList" items="${users}">
        <tr>
            <td style="border: 2px solid; padding: 10px;">${usersList.id}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.firstName}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.lastName}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.userName}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.password}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.email}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.city}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.state}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.zipcode}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.joinDate}</td>
            <td style="border: 2px solid; padding: 10px;">${usersList.approved}</td>
            <td style="border: 2px solid; padding: 10px;"><a href="deleteProduct">Delete</a>||<a href="deleteProduct">Approved</a></td>
        </tr>
        </c:forEach>        
    </table>
    <br />
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
                <td style="border: 2px solid; padding: 10px;"><a href="deleteProduct">Delete</a>||<a href="deleteProduct">Approved</a></td>
            </tr>
        </c:forEach>
    </table>
    
    <a href="index.jsp">Back to HomePage</a>
</div>

</body>
</html>
