<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <h2>Products</h2><br />

    <c:forEach var="product" items="${requestScope.products}">
        <ul>
            <li>Name: <c:out value="${product.name}"/></li>

            <li>Omega3: <c:out value="${product.omegaThree}"/></li>

            <li>Omega6: <c:out value="${product.omegaSix}"/></li>

            <li>Number of portions (28g): <c:out value="${product.portionNumber}"/></li>
        </ul>
        <hr />
    </c:forEach>

    <h2>Add new product</h2><br />

    <form method="post" action="">

        <label><input type="text" name="productName"></label>Name<br>

        <label><input type="number" name="Omega3"></label>Omega3<br>

        <label><input type="number" name="Omega6"></label>Omega6<br>

        <label><input type="number" name="portionNumber"></label>Number of Portions<br>

        <input type="submit" value="Ok" name="Ok"><br>
    </form>



<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</div>

</body>
</html>