<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <h1>Results</h1>

        <p>Years Difference: ${years}</p>
        <p>Months Difference: ${months}</p>
        <p>Days Difference: ${days}</p>

        <a href="${pageContext.request.contextPath}/calculate" class="btn btn-primary">Calculate Again</a>
    </div>

</body>
</html>