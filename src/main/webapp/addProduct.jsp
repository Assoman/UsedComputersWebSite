<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Add Product"/>
<c:set var="pageName" scope="request" value="Add Product"/>
<c:import url="templates/head.jsp"/>

<html>
    <body>
        <!-- navbar and title-->
        <%@include file="templates/navigation.jsp"%>
        <div class="tm-about-img-container">

        </div>
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-xs-center">
            <c:import url="templates/addProductBody.jsp"/>
        </div>
        <div>
            <c:import url="templates/footer.jsp"/>
        </div>
    </body>
</html>