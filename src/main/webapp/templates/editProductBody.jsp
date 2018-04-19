<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<div class="container">
    <br />
    <h3>${AddedMessage}</h3>
    <form action="userEditProduct" method="post" class="form-horizontal">
        <div class="form-group">
            <label for="brand" class="control-label col-sm-2">Brand: </label>
            <div class="col-sm-10">
                <input type="text" name="brand" id="brand" class="form-control" value="${brand}"/><br />
            </div>
        </div>
        <div class="form-group">
        <label for="model" class="control-label col-sm-2">Model Number: </label>
            <div class="col-sm-10">
                <input type="text" name="model" id="model" class="form-control" value="${model}"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="cpu" class="control-label col-sm-2">CPU: </label>
            <div class="col-sm-10">
                <input type="text" name="cpu" id="cpu" class="form-control" value="${cpu}"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="ram" class="control-label col-sm-2">RAM: </label>
            <div class="col-sm-10">
                <input type="text" name="ram" id="ram" class="form-control" value="${ram}"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="hdd" class="control-label col-sm-2">Hard Disk: </label>
            <div class="col-sm-10">
                <input type="text" name="hdd" id="hdd" class="form-control" value="${hdd}"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="conditions" class="control-label col-sm-2">Condition: </label>
            <div class="col-sm-10">
                <input type="text" name="conditions" id="conditions" class="form-control" value="${conditions}"/><br />
            </div>
        </div>
        <div class="form-group">
            <label for="description" class="control-label col-sm-2">Description: </label>
            <div class="col-sm-10">
                <textarea id="description" name="description" maxlength="1000" placeholder="Up to 1000 Char" class="form-control" value="${description}"></textarea><br />
            </div>
        </div>
        <!--<input type="text" name="description" id="description" style="margin: 5px;"/><br /> -->
        <div class="form-group">
            <label for="price" class="control-label col-sm-2">Price: </label>
            <div class="col-sm-10">
                <input type="number" name="price" id="price" class="form-control" value="${price}"/><br />
            </div>
        </div>
        <input type="submit" name="submit" style="margin: 10px;"/>
        <button type="reset" value="Reset" style="margin: 10px;">Clear Form</button>
    </form>
</div>

</body>
