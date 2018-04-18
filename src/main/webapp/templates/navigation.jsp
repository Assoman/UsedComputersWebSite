<div class="tm-header">
    <div class="container-fluid">
        <div class="tm-header-inner">
            <a href="#" class="navbar-brand tm-site-name">${pageName}</a>
            <nav class="navbar tm-main-nav">

            <button class="navbar-toggler hidden-md-up" type="button" data-toggle="collapse" data-target="#tmNavbar">
                &#9776;
            </button>

            <div class="collapse navbar-toggleable-sm" id="tmNavbar">
                <ul class="nav navbar-nav">
                    <li class="nav-item active">
                        <a href="allApprovedProduct" class="nav-link">Home</a>
                    </li>
                    <c:choose>
                        <c:when test="${empty pageContext.request.remoteUser}">
                            <li class="nav-item">
                                <a href="sellerProducts" class="nav-link">Log In</a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="nav-item">
                                <a href="sellerProducts" class="nav-link">Seller</a>
                            </li>
                            <c:if test="${'admin' == userRoles}">
                                <li class="nav-item">
                                    <a href="adminApprove" class="nav-link">Admin</a>
                                </li>
                            </c:if>
                            <li class="nav-item">
                                <a href="logoutUser" class="nav-link">Log Out ${userName}</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                    <li class="nav-item">
                        <a href="contact.jsp" class="nav-link">Contact</a>
                    </li>
                </ul>
            </div>

            </nav>
        </div>
    </div>
</div>