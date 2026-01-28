<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
    <style>
    .error {
                color: red;
                    font-size: 14px;
                }
                .form-control {
                    max-width: 400px;
                    }

                .container {
                    max-width: 600px;
                    margin-top: 50px;
                }
    }
    </style>

</head>

<body>
    <div class="container">
        <h2>Employee Registration Form</h2>
        <br><br>

        <form:form action="processForm" modelAttribute="userData">

            <form:errors cssClass="error" element="div"/>
            <br>
            <label>Username:</label>
            <form:input type="text" placeholder="username" path="userName" class="form-control" autocomplete="username"/>
            <form:errors path="userName" cssClass="error"/>
            <br><br>

            <label>Email:</label>
            <form:input type="text" placeholder="email" path="email" class="form-control"/>
            <form:errors path="email" cssClass="error"/>
            <br><br>

            <label>Password:</label>
            <form:input type="password" placeholder="password" path="password" class="form-control"/>
            <form:errors path="password" cssClass="error"/>
            <br><br>

            <label>Confirm Password:</label>
            <form:input type="password" placeholder="confirm password" path="confirmedPassword" class="form-control"/>
            <form:errors path="confirmedPassword" cssClass="error"/>
            <br><br>


            <button type="submit" class="btn btn-primary">Submit</button>

        </form:form>
    </div>

</body>
</html>