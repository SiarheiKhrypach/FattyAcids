<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
    <style>
        <%@include file='../css/fatty_acids.css' %>
        <%@include file='../css/style.css' %>
    </style>
</head>

<body class="centered">
<div class="centered">
    <h1 class="register-title">Registration Page</h1>
</div>

<div>
    <%
        if (request.getAttribute("userName") != null) {
            out.println("<p class=\"response\">User '" + request.getAttribute("userName") + "' added!</p>");
        }
    %>
    <div class="centered">
        <div>
            <h2>Add user</h2>
        </div>

        <form class="about" class="register"  method="post">
            <label>Name:
                <input type="text" class="register-input" name="name"><br />
            </label>
            <label>Password:
                <input type="password" class="register-input" name="pass"><br />
            </label>
            <button type="submit" class="register-button">Submit</button>
        </form>
    </div>
</div>


<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>