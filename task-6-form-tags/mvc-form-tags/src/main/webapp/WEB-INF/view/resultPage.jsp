<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>

<body>
    <div class="result-container">
        <h1>Results</h1>

                <p><strong>Username:</strong> ${user.userName}</p>
                <p><strong>Password:</strong> ${user.password}</p>
                <p><strong>Country:</strong> ${user.country}</p>
                <p><strong>Programming Language:</strong> ${user.programmingLanguage}</p>
                <p><strong>Operating System:</strong> ${user.operatingSystem}</p>

            <a href="${pageContext.request.contextPath}/" class="btn btn-primary">Back to Form</a>
    </div>

</body>
</html>
