<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="templates/head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <tr>
            <th style="border: 2px solid; padding: 10px;">User ID</th>
            <th style="border: 2px solid; padding: 10px;">First Name</th>
            <th style="border: 2px solid; padding: 10px;">Last Name</th>
            <th style="border: 2px solid; padding: 10px;">User Name</th>
            <th style="border: 2px solid; padding: 10px;">Email</th>
            <th style="border: 2px solid; padding: 10px;">City</th>
            <th style="border: 2px solid; padding: 10px;">State</th>
            <th style="border: 2px solid; padding: 10px;">ZipCode</th>
            <th style="border: 2px solid; padding: 10px;">Join Date</th>
            <th style="border: 2px solid; padding: 10px;">Approved</th>
            <th style="border: 2px solid; padding: 10px;">Products</th>
        </tr>
        <c:forEach var="resultList" items="${users}">
        <tr>
            <td style="border: 2px solid; padding: 10px;">${resultList.id}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.firstName}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.lastName}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.userName}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.email}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.city}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.state}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.zipcode}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.joinDate}</td>
            <td style="border: 2px solid; padding: 10px;">${resultList.approved}</td>
            <td style="border: 2px solid; padding: 10px;">
                <c:forEach var="product" items="${resultList.products}">
                    ${product.id} ${product.brand} ${product.conditions} <br />
                </c:forEach>
            </td>
        </tr>
        </c:forEach>
    </table>
    <a href="searchForm.jsp">Back to search page</a>
</div>

</body>
</html>
