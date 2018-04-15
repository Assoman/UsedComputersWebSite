<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="pageTitle" scope="request" value="Seller"/>
<c:set var="pageName" scope="request" value="Seller"/>
<%@include file="templates/head.jsp"%>

    <body>
        <!-- navbar -->
        <%@include file="templates/navigation.jsp"%>

        <div class="tm-about-img-container">
            
        </div>

        <section class="tm-section">
            <div class="container-fluid">
                <div class="row tm-2-rows-sm-swap">
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-3 col-xl-3 tm-2-rows-sm-down-2">
                        
                        <h3 class="tm-gold-text">Actions you may take</h3>
                        
                        <nav>
                            <ul class="nav">
                                <li><a href="displayAddProduct" class="tm-text-link">Add Product</a></li>
                            </ul>
                            <ul class="nav">
                                <li>You signed in as ${userName}. Click <a href="logoutUser" class="tm-text-link">here</a> to sign out.</li>
                                <!-- <form action="logoutUser" method="post">
                                    <input type="submit" value="Logout" />
                                </form> -->
                            </ul>
                        </nav>   

                    </div>

                    <div class="col-xs-12 col-sm-12 col-md-8 col-lg-9 col-xl-9 tm-2-rows-sm-down-1">
                        <h3 class="tm-gold-text">Products</h3>
                        <%@include file="templates/sellerProductsTable.jsp"%>
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