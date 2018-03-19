<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Add Seller Form</h1>
    <form action="addSeller" method="post">
        <div class="form-group">
            <label for="fName" style="margin: 5px;">First Name: </label>
            <input type="text" name="fName" id="fName" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="lName" style="margin: 5px;">Last Name: </label>
            <input type="text" name="lName" id="lName" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="uName" style="margin: 5px;">User Name: </label>
            <input type="text" name="uName" id="uName" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="pass" style="margin: 5px;">Password: </label>
            <input type="password" name="pass" id="pass" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="email" style="margin: 5px;">Email: </label>
            <input type="text" name="email" id="email" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="city" style="margin: 5px;">City: </label>
            <input type="text" name="city" id="city" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="state" style="margin: 5px;">State: </label>
            <input type="text" name="state" id="state" class="form-control" style="margin: 5px;"/><br />
        </div>
        <div class="form-group">
            <label for="zipcode" style="margin: 5px;">Zipcode: </label>
            <input type="number" name="zipcode" id="zipcode" class="form-control" style="margin: 5px;"/><br />
        </div>
        <input type="submit" name="submit" style="margin: 10px;"/>
        <button type="reset" value="Reset" style="margin: 10px;">Clear Form</button>
    </form>

    <h3>${AddedMessage}</h3>
</body>

