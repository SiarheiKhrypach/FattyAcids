<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        <%@include file='../css/fatty_acids.css' %>
        <%@include file='../css/style.css' %>
    </style>
</head>

<body class="centered">
<div>
    <h1 class="register-title">Fatty Acids</h1>

</div>

<div>
    <div>
        <div>
            <h2>Log in</h2>
        </div>

        <form class="about" class="register" method="post">
            <label>Name:
                <input type="text" class="register-input" name="name"><br />
            </label>
            <label>Password:
                <input type="password" class="register-input" name="pass"><br />
            </label>
            <button type="submit">Submit</button>
<%--            <button class="register-button" onclick="location.href='/welcome'">Submit</button>--%>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>