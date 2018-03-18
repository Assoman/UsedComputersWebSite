<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<h1>Add Seller Form</h1>
<form action="addProduct" method="post">
    <label for="brand" style="margin: 5px;">Brand: </label>
    <input type="text" name="brand" id="brand" style="margin: 5px;"/><br />
    <label for="model" style="margin: 5px;">Model Number: </label>
    <input type="text" name="model" id="model" style="margin: 5px;"/><br />
    <label for="cpu" style="margin: 5px;">CPU: </label>
    <input type="text" name="cpu" id="cpu" style="margin: 5px;"/><br />
    <label for="ram" style="margin: 5px;">RAM: </label>
    <input type="text" name="ram" id="ram" style="margin: 5px;"/><br />
    <label for="hdd" style="margin: 5px;">Hard Disk: </label>
    <input type="text" name="hdd" id="hdd" style="margin: 5px;"/><br />
    <label for="conditions" style="margin: 5px;">Condition: </label>
    <input type="text" name="conditions" id="conditions" style="margin: 5px;"/><br />
    <label for="description" style="margin: 5px;">Description: </label>
    <textarea id="description" name="description" maxlength="1000" style="margin: 5px;"></textarea><br />
    <!--<input type="text" name="description" id="description" style="margin: 5px;"/><br /> -->
    <label for="price" style="margin: 5px;">Price: </label>
    <input type="number" name="price" id="price" style="margin: 5px;"/><br />
    <input type="submit" name="submit" style="margin: 10px;"/>
    <button type="reset" value="Reset" style="margin: 10px;">Clear Form</button>
</form>

<h3>${AddedMessage}</h3>
</body>
