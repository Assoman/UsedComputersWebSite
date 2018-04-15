<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Log In"/>
<c:set var="pageName" scope="request" value="Log In"/>
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
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-xs-center">
                <FORM ACTION="j_security_check" METHOD="POST">
                    <TABLE>
                        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
                        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                        <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
                    </TABLE>
                </FORM>
            </div>
        </div>
    </div>
</section>

<%@include file="templates/footer.jsp"%>

<!-- load JS files -->
<script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
<script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
<script src="js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>