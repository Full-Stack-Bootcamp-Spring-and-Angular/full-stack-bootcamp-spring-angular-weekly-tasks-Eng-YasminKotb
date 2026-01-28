<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
    <style>
      .confirm {
         color: green;
         font-size: 20px;
      }
    </style>
</head>

<body>
    <div class="result-container">
        <h1 class="confirm">Employee submission conformation</h1>

                <p><strong>Username:</strong> ${userData.userName}</p>
                <p><strong>Email:</strong> ${userData.email}</p>


            <a href="${pageContext.request.contextPath}/" class="btn btn-primary">Back to Form</a>
    </div>

</body>
</html>
