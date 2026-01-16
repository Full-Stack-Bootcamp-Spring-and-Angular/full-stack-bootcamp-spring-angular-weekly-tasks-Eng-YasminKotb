<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Successful</title>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <h1>Registration Successful</h1>


        <br>

        <h3>Submitted Information:</h3>
        <p><strong>First Name:</strong> ${user.firstName}</p>
        <p><strong>Last Name:</strong> ${user.lastName}</p>
        <p><strong>Email:</strong> ${user.email}</p>
        <p><strong>Date of Birth:</strong> ${user.dob}</p>
        <p><strong>City:</strong> ${user.city}</p>

        <br>
        <a href="${pageContext.request.contextPath}/" class="btn btn-primary">Register Another User</a>
    </div>

</body>
</html>
