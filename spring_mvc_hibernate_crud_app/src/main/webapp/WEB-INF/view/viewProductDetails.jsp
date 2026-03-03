<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

    <h1>Product Details</h1>

    <div class="details-container">
 <c:if test="${not empty productDetailsModel.productDetails.imagePath}">
         <div style="text-align: center; margin-bottom: 30px;">
             <img src="${pageContext.request.contextPath}/resources/images/products/${productDetailsModel.productDetails.imagePath}"
                  alt="${productDetailsModel.productDetails.productName}"
                  style="max-width: 100%; max-height: 400px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1);">
         </div>
     </c:if>
        <div class="detail-row">
            <span class="label">Product ID:</span>
            <span class="value">${productDetailsModel.id}</span>
        </div>

        <div class="detail-row">
            <span class="label">Product Name:</span>
            <span class="value">${productDetailsModel.productDetails.productName}</span>
        </div>

        <div class="detail-row">
            <span class="label">Manufacturer:</span>
            <span class="value">${productDetailsModel.productDetails.manufacturer}</span>
        </div>

        <div class="detail-row">
            <span class="label">Price:</span>
            <span class="value">$${productDetailsModel.productDetails.price}</span>
        </div>

        <div class="detail-row">
            <span class="label">Available:</span>
            <span class="value">
                <c:if test="${productDetailsModel.productDetails.available}">Yes</c:if>
                <c:if test="${!productDetailsModel.productDetails.available}">No</c:if>
            </span>
        </div>

        <div class="detail-row">
            <span class="label">Expiration Date:</span>
            <span class="value">${productDetailsModel.productDetails.expirationDate}</span>
        </div>



        <div class="button-group">
            <a href="${pageContext.request.contextPath}/viewProducts" class="btn btn-blue">Back to List</a>
            <a href="${pageContext.request.contextPath}/updateProductForm?id=${productDetailsModel.id}" class="btn btn-orange">Edit Product</a>
        </div>

    </div>

</body>
</html>