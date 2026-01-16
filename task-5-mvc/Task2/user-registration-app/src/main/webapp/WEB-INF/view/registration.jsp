<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <h1>User Registration</h1>

        <form action="${pageContext.request.contextPath}/submit" method="post">

            <label>First Name:</label>
            <input type="text" name="firstName" class="form-control" required>
            <br>

            <label>Last Name:</label>
            <input type="text" name="lastName" class="form-control" required>
            <br>

            <label>Email:</label>
            <input type="email" name="email" class="form-control" required>
            <br>

            <label>Date of Birth:</label>
            <input type="date" name="dob" class="form-control" required>
            <br>

            <label>City:</label>
            <input type="text" name="city" class="form-control" required>
            <br>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>

</body>
</html>