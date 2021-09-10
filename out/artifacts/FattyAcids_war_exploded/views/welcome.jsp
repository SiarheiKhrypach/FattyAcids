<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        <%@include file='../css/fatty_acids.css' %>
        <%@include file='../css/style.css' %>
    </style>
</head>

<body class="centered">

<%
    String name = request.getParameter("name");
//    out.println("User: "+name);
%>

<div class="response">
<div>
    <h1>Welcome, <%=name%>! </h1>
</div>



<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</div>
</body>
</html>