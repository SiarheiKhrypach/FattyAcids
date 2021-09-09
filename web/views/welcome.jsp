<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>

<body>

<%
    String name = request.getParameter("name");
//    out.println("User: "+name);
%>


<div>
    <h1>Welcome, <%=name%>! </h1>
</div>



<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>