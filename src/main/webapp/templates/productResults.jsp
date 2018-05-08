<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<h2>Search for Products</h2>
<div class="row">
    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
        <form method="get" action="searchProduct" class="tm-contact-form">

            <div class="form-group col-lg-3">
                <!-- <label for="pName">Product Brand: </label> -->
                <input type="text" name="pName" id="pName" class="form-control" placeholder="Product Brand"/><br />
            </div>
            <div class="form-group col-lg-3">
                <!-- <label for="zipcode">Zipcode: </label> -->
                <input type="text" name="zipcode" id="zipcode" class="form-control" placeholder="Zip-Code"/><br />
            </div>

            <div class="form-group col-lg-3">
                <!-- <label for="distance" class="control-label col-sm-2">Distance: </label> -->
                <select type="text" name="distance" id="distance" class="form-control">
                    <option value="2">2 Mile</option>
                    <option value="10">10 Mile</option>
                    <option value="20">20 Mile</option>
                    <option value="30">30 Mile</option>
                    <option value="40">40 Mile</option>
                </select>
            </div>
            <input type="submit" name="submit" class="tm-btn"/>
            <br />

        </form>
    </div>
</div>
    <div class="container-fluid">
        <c:choose>
            <c:when test="${not empty products}">
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
                            <td style="border: 2px solid; padding: 10px;"><a href="${productsList.user.email}">${productsList.user.email}</a></td>
                        </tr>
                </c:forEach>
            </table>
            </c:when>
            <c:otherwise>
                <h3>Sorry, Nothing matches your search for <b>${productName}</b></h3>
            </c:otherwise>
        </c:choose>
    </div>
