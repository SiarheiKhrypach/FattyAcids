<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>

<body>
<div>
    <h1>Fatty Acids</h1>
</div>

<div>
    <%

        if (request.getAttribute("userName") == "correct") {
            out.println("<p>Welcome!</p>");
        } else {
            out.println("<p>Password is wrong!</p>");
        }

    %>
    <div>
        <div>
            <h2>Log in</h2>
        </div>

        <form method="post">
            <label>Name:
                <input type="text" name="name"><br />
            </label>
            <label>Password:
                <input type="password" name="pass"><br />
            </label>
            <button type="submit">Submit</button>
        </form>
    </div>
</div>



<%--<div>--%>
<%--    <div>--%>
<%--        <div>--%>
<%--            <h2>Users</h2>--%>
<%--        </div>--%>
<%--        <%--%>
<%--            List<String> names = (List<String>) request.getAttribute("userNames");--%>

<%--            if (names != null && !names.isEmpty()) {--%>
<%--                out.println("<ui>");--%>
<%--                for (String s : names) {--%>
<%--                    out.println("<li>" + s + "</li>");--%>
<%--                }--%>
<%--                out.println("</ui>");--%>
<%--            } else out.println("<p>There are no users yet!</p>");--%>
<%--        %>--%>
<%--    </div>--%>
<%--</div>--%>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>