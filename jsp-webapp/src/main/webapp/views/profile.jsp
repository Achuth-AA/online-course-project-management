<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.http.HttpSession" %>

<html>
<head>
  <title>Profile</title>
</head>
<body>
  <div class="container">
    <h2>Your Profile</h2>

    <p>Username: <%= (String) session.getAttribute("username") %></p>
    <p>Full Name: <%= (String) session.getAttribute("firstName") %> <%= (String) session.getAttribute("lastName") %></p>
    <%-- Add additional profile information fields as needed --%>

    <a href="edit_profile.jsp">Edit Profile</a>

    <%-- Link to enrolled courses or other relevant actions --%>
    <a href="#">Enrolled Courses</a>
  </div>
</body>
</html>
