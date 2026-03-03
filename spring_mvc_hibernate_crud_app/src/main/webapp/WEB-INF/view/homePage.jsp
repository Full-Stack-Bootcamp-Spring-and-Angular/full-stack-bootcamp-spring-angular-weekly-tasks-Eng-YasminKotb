<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Products App</title>
    <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }

            body {
                font-family: "Comic Sans MS", cursive, sans-serif;
                overflow: hidden;
            }

            .welcome-container {
                display: flex;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
                background: white;
            }

            .welcome-content {
                text-align: center;
                background: white;
                padding: 60px 80px;
                border-radius: 20px;
                box-shadow: 0 20px 60px rgba(0,0,0,0.3);
            }

            .welcome-content h1 {
                font-size: 48px;
                color: #2c3e50;
                margin-bottom: 20px;
                font-weight: 700;
            }

            .welcome-content p {
                font-size: 18px;
                color: #7f8c8d;
                margin-bottom: 40px;
            }

            .btn-explore {
                display: inline-block;
                background-color: #4CAF50;
                color: white;
                padding: 15px 50px;
                font-size: 18px;
                font-weight: 600;
                text-decoration: none;
                border-radius: 50px;
                transition: transform 0.3s, box-shadow 0.3s;
            }

            .btn-explore:hover {
                transform: translateY(-3px);
                box-shadow: 0 10px 25px rgba(76, 175, 80, 0.4);
                background-color: #45a049;
            }
        </style>

</head>
<body>

    <div class="welcome-container">
        <div class="welcome-content">
            <h1>Welcome to Products App</h1>
            <p>Manage your products efficiently</p>
            <a href="${pageContext.request.contextPath}/viewProducts" class="btn-explore">Explore</a>
        </div>
    </div>

</body>
</html>