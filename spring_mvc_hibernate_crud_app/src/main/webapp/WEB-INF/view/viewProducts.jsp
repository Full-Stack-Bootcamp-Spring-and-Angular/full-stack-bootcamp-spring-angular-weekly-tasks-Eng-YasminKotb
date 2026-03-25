<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Products List</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

    <h1>Products Data</h1>

    <!-- Success Message -->
    <c:if test="${not empty message}">
        <div class="message">${message}</div>
    </c:if>

    <!-- Wrapper for table and button -->
    <div class="table-wrapper">

        <!-- Products Table -->
        <c:if test="${empty productsList}">
            <p class="no-data">No products found.</p>
        </c:if>

        <c:if test="${not empty productsList}">
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Show Details</th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${productsList}" var="product">
                        <tr>
                            <td>${product.id}</td>
                            <td>
                                ${product.productDetails.productName}
                                 </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/productDetails?id=${product.id}"
                                   class="btn btn-blue">View Details</a>
                            </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/updateProductForm?id=${product.id}"
                                   class="btn btn-orange">update Details</a>
                            </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/deleteProduct?id=${product.id}"
                                   class="btn btn-red"
                                   onclick="return confirm('Delete this product?')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <!-- Add Button -->
        <a href="${pageContext.request.contextPath}/addProductForm" class="btn btn-green">Add new Product</a>

    </div>

</body>
</html>