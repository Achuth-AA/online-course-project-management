<%@ page import="javax.servlet.http.HttpSession" %>
        <!DOCTYPE html>
<html>

<head>
    <title>User Dashboard</title>
</head>
<body>
    <%
    HttpSession session = request.getSession(false);
    String username = null;
    if (session != null) {
    username = (String) session.getAttribute("username");
    }
    %>
    <h1>Welcome, <%= username %>!</h1>
    <p>This is your dashboard.</p>
</body>
</html>
