<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

    <h1>Add New Product</h1>

    <div class="form-container">

        <form action="${pageContext.request.contextPath}/saveProduct"
              method="post"
              enctype="multipart/form-data">


            <div class="form-group">
                <label>Product Name:</label>
                <input type="text" name="productDetails.productName" class="form-input" required/>
                <!-- name="" Tells Spring which object field to bind -->
            </div>


            <div class="form-group">
                <label>Manufacturer:</label>
                <input type="text" name="productDetails.manufacturer" class="form-input" required/>
            </div>


            <div class="form-group">
                <label>Product Image:</label>
                <input type="file" name="productImage" accept="image/*" class="form-input"/>
                <small style="color: #666;">Max size: 10MB. Formats: JPG, PNG, GIF</small>
            </div>


            <div class="form-group">
                <label>Price:</label>
                <input type="number" name="productDetails.price" step="0.01" class="form-input" required/>
            </div>


            <div class="form-group">
                <label>Available:</label>
                <select name="productDetails.available" class="form-input">
                    <option value="true">Yes</option>
                    <option value="false">No</option>
                </select>
            </div>


            <div class="form-group">
                <label>Expiration Date:</label>
                <input type="date" name="productDetails.expirationDate" class="form-input" required/>
            </div>


            <div class="form-buttons">
                <button type="submit" class="btn btn-green">Save Product</button>
                <a href="${pageContext.request.contextPath}/viewProducts" class="btn btn-cancel">Cancel</a>
            </div>

        </form>

    </div>

</body>
</html>