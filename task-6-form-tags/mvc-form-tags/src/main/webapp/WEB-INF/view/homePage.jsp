<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <h2>User Form</h2>
        <br><br>

        <form:form action="processForm" modelAttribute="userData">

            <label>Username:</label>
            <form:input type="text" placeholder="username" path="userName" class="form-control"/>
            <br><br>

            <label>Password:</label>
            <form:input type="password" placeholder="password" path="password" class="form-control"/>
            <br><br>



            <label>Country:</label>
            <form:select path="country" class="form-control">
                <form:option value="Egypt" label="Egypt"/>
                <form:option value="Qatar" label="Qatar"/>
                <form:option value="Syria" label="Syria"/>
            </form:select>
            <br><br>


            <label>Preferred Programming Language</label><br>
            Java <form:radiobutton path="ProgrammingLanguage" value="Java"/>
            C++ <form:radiobutton path="ProgrammingLanguage" value="C++"/>
            Python <form:radiobutton path="ProgrammingLanguage" value="Python"/>
            <br><br>


            <label>Preferred Operating System</label><br>
            Linux <form:checkbox path="OperatingSystem" value="Linux"/>
            Windows <form:checkbox path="OperatingSystem" value="Windows"/>
            Mac <form:checkbox path="OperatingSystem" value="Mac"/>
            <br><br>


            <button type="submit" class="btn btn-primary">Submit</button>

        </form:form>
    </div>

</body>
</html>