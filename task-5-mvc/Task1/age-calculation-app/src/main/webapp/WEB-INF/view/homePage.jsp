<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <h1>Date Calculator</h1>

        <form action="${pageContext.request.contextPath}/processForm" method="post">

            <label>Year:</label>
            <input type="number" name="year" class="form-control" required>
            <br>

            <label>Month:</label>
            <input type="number" name="month" class="form-control" min="1" max="12" required>
            <br>

            <label>Day:</label>
            <input type="number" name="day" class="form-control" min="1" max="31" required>
            <br>

            <button type="submit" class="btn btn-primary">Calculate</button>
        </form>
    </div>


</body>
</html>