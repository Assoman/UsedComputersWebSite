<%--
  Created by IntelliJ IDEA.
  User: osamah
  Date: 3/1/18
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" scope="request" value="Log In"/>
<c:set var="pageName" scope="request" value="Log In"/>
<c:import url="templates/head.jsp"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<%@include file="templates/navigation.jsp"%>
<div class="tm-contact-img-container">

</div>
<div>

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
<div>
    <c:import url="templates/footer.jsp"/>
</div>
</body>
</html>
