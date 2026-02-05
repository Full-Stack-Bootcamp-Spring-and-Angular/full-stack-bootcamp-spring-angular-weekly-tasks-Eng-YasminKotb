<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
        <style>
            /* Remove spinner arrows from number inputs */
            input[type=number]::-webkit-inner-spin-button,
            input[type=number]::-webkit-outer-spin-button {
                -webkit-appearance: none;
                margin: 0;
            }

            input[type=number] {
                -moz-appearance: textfield; /* Firefox */
            }
        </style>
</head>

<body>
    <div class="container">
        <h1>Date Calculator</h1>

        <form action="${pageContext.request.contextPath}/processForm" method="post">

            <label>Year:</label>
            <input type="number" name="year" class="form-control" style="max-width: 200px;" required>
            <br>

            <label>Month:</label>
            <input type="number" name="month" class="form-control" style="max-width: 200px;" required>
            <br>

            <label>Day:</label>
            <input type="number" name="day" class="form-control" style="max-width: 200px;" required>
            <br>

            <button type="submit" class="btn btn-primary">Calculate</button>
        </form>
    </div>


</body>
</html>