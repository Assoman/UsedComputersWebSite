<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<div class="container">
    <br />
    <h3>${AddedMessage}</h3>
    <form action="addSeller" method="post" class="form-horizontal">
        <div class="form-group">
            <label for="fName" class="control-label col-sm-2">First Name: </label>
            <div class="col-sm-10">
                <input type="text" name="fName" id="fName" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="lName" class="control-label col-sm-2">Last Name: </label>
            <div class="col-sm-10">
                <input type="text" name="lName" id="lName" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="uName" class="control-label col-sm-2">User Name: </label>
            <div class="col-sm-10">
                <input type="text" name="uName" id="uName" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="pass" class="control-label col-sm-2">Password: </label>
            <div class="col-sm-10">
                <input type="password" name="pass" id="pass" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="control-label col-sm-2">Email: </label>
            <div class="col-sm-10">
                <input type="text" name="email" id="email" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="city" class="control-label col-sm-2">City: </label>
            <div class="col-sm-10">
                <input type="text" name="city" id="city" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="state" class="control-label col-sm-2">State: </label>
            <div class="col-sm-10">
                <input type="text" name="state" id="state" class="form-control"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="zipcode" class="control-label col-sm-2">Zipcode: </label>
            <div class="col-sm-10">
                <input type="number" name="zipcode" id="zipcode" class="form-control"/><br />
            </div>
        </div>
        <input type="submit" name="submit" style="margin: 10px;"/>
        <button type="reset" value="Reset" style="margin: 10px;">Clear Form</button>
    </form>
</div>

</body>

