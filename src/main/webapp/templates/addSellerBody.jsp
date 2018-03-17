<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Add Seller Form</h1>
    <form action="addSeller" method="post">
        <label for="fName" style="margin: 5px;">First Name: </label>
        <input type="text" name="fName" id="fName" style="margin: 5px;"/><br />
        <label for="lName" style="margin: 5px;">Last Name: </label>
        <input type="text" name="lName" id="lName" style="margin: 5px;"/><br />
        <label for="uName" style="margin: 5px;">User Name: </label>
        <input type="text" name="uName" id="uName" style="margin: 5px;"/><br />
        <label for="pass" style="margin: 5px;">Password: </label>
        <input type="password" name="pass" id="pass" style="margin: 5px;"/><br />
        <label for="email" style="margin: 5px;">email: </label>
        <input type="text" name="email" id="email" style="margin: 5px;"/><br />
        <label for="city" style="margin: 5px;">City: </label>
        <input type="text" name="city" id="city" style="margin: 5px;"/><br />
        <label for="state" style="margin: 5px;">State: </label>
        <input type="text" name="state" id="state" style="margin: 5px;"/><br />
        <label for="zipcode" style="margin: 5px;">Zipcode: </label>
        <input type="number" name="zipcode" id="zipcode" style="margin: 5px;"/><br />
        <input type="submit" name="submit" style="margin: 10px;"/>
        <button type="reset" value="Reset" style="margin: 10px;">Clear Form</button>
    </form>

    <h3>${AddMessage}</h3>
</body>

