<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Error"/>
<c:set var="pageName" scope="request" value="Error"/>
<%@include file="templates/head.jsp"%>
<html>

<body>
<!-- navbar and title-->
<%@include file="templates/navigation.jsp"%>

<div class="tm-home-img-container">
    <img src="img/tm-home-img.jpg" alt="Image" class="hidden-lg-up img-fluid">
</div>
<section class="tm-section">
    <div class="container-fluid">
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
    </div>
</section>
<%@include file="templates/footer.jsp"%>

<!-- load JS files -->
<script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
<script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
<script src="js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
</body>
</html>
