<%@ page import="com.questor.dto.User" %>
<%@ page import="com.questor.dao.ProfileRetreival" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile</title>
<link rel="stylesheet" href="../css/profile.css">
<link rel="stylesheet" href="../css/navbar.css">
</head>
<body>
<nav class="navbar">
    <ul>
        <li><a href="#">DASHBOARD</a></li>
        <li><a href="#">COURSES</a></li>
        <li><a href="#">PROJECT PORTAL</a></li>
        <li><a href="#">MY PROFILE</a></li>
    </ul>
</nav>
 
<%
    Integer userId = (Integer) session.getAttribute("userId");
    out.println(userId);
    int userIdValue = userId != null ? userId.intValue() : 0;
    ProfileRetreival userDAO = new ProfileRetreival();
    User user = userDAO.getUserDetails(userIdValue);

    if (user == null) {
        return;
    }
%>
 
<div class="pcontainer">
    <h1>My Profile</h1>
    <div class="profile-picture">
        <img src="profile-picture.jpg" alt="Profile Picture" width="150" height="150">
        <div class="buttons">
            <button type="button">Upload New Pic</button>
            <button type="button">Delete</button>
        </div>
    </div>
    <form action="../SaveChanges">
        <div class="form-group">
            <label for="first-name">Name:</label>
            <input type="text" id="first-name" name="first-name" value="<%= user.getName() %>" required >
        </div>
        <div class="form-group">
            <label for="last-name">User Name:</label>
            <input type="text" id="last-name" name="last-name" value="<%= user.getUsername() %>" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="<%= user.getEmail() %>" required>
        </div>
        <div class="form-group">
            <label for="country">Country:</label>
            <input type="text" id="phone" name="country" value="<%= user.getCountry() %>" required>
        </div>
        <div class="button-group">
            <button type="submit">Save Changes</button>
        </div>
        </form>
        <form action="../ChangePassword">
            <div class="form-group">
                <label for="current-password">Current Password:</label>
                <input type="password" id="current-password" name="current-password" required>
            </div>
            <div class="form-group">
                <label for="new-password">New Password:</label>
                <input type="password" id="new-password" name="new-password" required>
            </div>
            <div class="form-group">
                <label for="confirm-password">Confirm New Password:</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
            </div>
            <input type="submit" value="Change Password" />
        </form>
 
</div>
</body>
</html>
 