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

    <table class="table">
        <thead>
        <tr>
            <th>Product Name</th>
            <th>Omega-3 content, mg</th>
            <th>Omega-6 content, mg</th>
            <th>Number of portions (1pt = 28g)</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${requestScope.products}">
        <tr>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.omegaThree}"/></td>
            <td><c:out value="${product.omegaSix}"/></td>
            <td><c:out value="${product.portionNumber}"/></td>
        </tr>
        </c:forEach>
        ...
        </tbody>
    </table>

<%--    <c:forEach var="product" items="${requestScope.products}">--%>
<%--        <ul>--%>
<%--            <li>Name: <c:out value="${product.name}"/></li>--%>

<%--            <li>Omega3: <c:out value="${product.omegaThree}"/></li>--%>

<%--            <li>Omega6: <c:out value="${product.omegaSix}"/></li>--%>

<%--            <li>Number of portions (28g): <c:out value="${product.portionNumber}"/></li>--%>
<%--        </ul>--%>
<%--        <hr />--%>
<%--    </c:forEach>--%>

    <h2>Add new product</h2><br />

    <form class="about" class="register" method="post" action="">

        <label><input type="text" class="register-input" name="productName"></label>Name<br>

        <label><input type="number" class="register-input" name="Omega3"></label>Omega3<br>

        <label><input type="number" class="register-input" name="Omega6"></label>Omega6<br>

        <label><input type="number" class="register-input" name="portionNumber"></label>Number of Portions<br>

        <input type="submit" value="Ok" name="Ok"><br>
<%--        <button type="submit">Submit</button>--%>
    </form>



<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</div>

</body>
</html>