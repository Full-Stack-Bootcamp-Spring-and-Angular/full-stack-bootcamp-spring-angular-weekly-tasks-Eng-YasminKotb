<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

    <h1>Update Product</h1>

    <div class="form-container">


        <form action="${pageContext.request.contextPath}/saveUpdatedProduct"
              method="post"
              enctype="multipart/form-data">


            <input type="hidden" name="id" value="${oldProductDetailsModel.id}"/>
            <input type="hidden" name="productDetails.id" value="${oldProductDetailsModel.productDetails.id}"/>
            <input type="hidden" name="currentImagePath" value="${oldProductDetailsModel.productDetails.imagePath}"/>


            <div class="form-group">
                <label>Product Name:</label>
                <input type="text" name="productDetails.productName"
                       value="${oldProductDetailsModel.productDetails.productName}"
                       class="form-input" required/>
            </div>


            <div class="form-group">
                <label>Manufacturer:</label>
                <input type="text" name="productDetails.manufacturer"
                       value="${oldProductDetailsModel.productDetails.manufacturer}"
                       class="form-input" required/>
            </div>


            <c:if test="${not empty oldProductDetailsModel.productDetails.imagePath}">
                <div class="form-group">
                    <label>Current Image:</label>
                    <div style="margin-bottom: 10px;">
                        <img src="${pageContext.request.contextPath}/resources/images/products/${oldProductDetailsModel.productDetails.imagePath}"
                             alt="Current product image"
                             style="max-width: 200px; max-height: 200px; border-radius: 8px; border: 2px solid #ddd;">
                    </div>
                </div>
            </c:if>


            <div class="form-group">
                <label>Upload New Image:</label>
                <input type="file" name="productImage" accept="image/*" class="form-input"/>
                <small style="color: #666;">Leave empty to keep current image. Max size: 10MB.</small>
            </div>


            <div class="form-group">
                <label>Price:</label>
                <input type="number" name="productDetails.price" step="0.01"
                       value="${oldProductDetailsModel.productDetails.price}"
                       class="form-input" required/>
            </div>


            <div class="form-group">
                <label>Available:</label>
                <select name="productDetails.available" class="form-input">
                    <option value="true" ${oldProductDetailsModel.productDetails.available ? 'selected' : ''}>Yes</option>
                    <option value="false" ${!oldProductDetailsModel.productDetails.available ? 'selected' : ''}>No</option>
                </select>
            </div>


            <div class="form-group">
                <label>Expiration Date:</label>
                <input type="date" name="productDetails.expirationDate"
                       value="${oldProductDetailsModel.productDetails.expirationDate}"
                       class="form-input" required/>
            </div>


            <div class="form-buttons">
                <button type="submit" class="btn btn-green">Update Product</button>
                <a href="${pageContext.request.contextPath}/viewProducts" class="btn btn-cancel">Cancel</a>
            </div>

        </form>

    </div>

</body>
</html>