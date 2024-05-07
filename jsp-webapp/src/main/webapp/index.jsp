<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile</title>
<link rel="stylesheet" href="./css/index.css">
</head>
<body>


<div class="container">
    <h1>My Profile</h1>
    <div class="profile-picture">
        <img src="profile-picture.jpg" alt="Profile Picture" width="150" height="150">
        <div class="buttons">
            <button type="button">Upload New Pic</button>
            <button type="button">Delete</button>
        </div>
    </div>
    <form>
        <div class="form-group">
            <div class="half">
                <label for="first-name">First Name:</label>
                <input type="text" id="first-name" name="first-name" required>
            </div>
            <div class="half">
                <label for="last-name">Last Name:</label>
                <input type="text" id="last-name" name="last-name" required>
            </div>
        </div>
        <div class="form-group">
            <label for="username">Username:</label>
            <textarea id="username" name="username" rows="4" cols="50" required></textarea>
        </div>
        <div class="form-group">
            <div class="half">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="half">
                <label for="phone">Phone:</label>
                <input type="text" id="phone" name="phone" required>
            </div>
        </div>
        <div class="form-group">
            <div class="third">
                <label for="current-password">Current Password:</label>
                <input type="password" id="current-password" name="current-password" required>
            </div>
            <div class="third">
                <label for="new-password">New Password:</label>
                <input type="password" id="new-password" name="new-password" required>
            </div>
            <div class="third">
                <label for="confirm-password">Confirm New Password:</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
            </div>
        </div>
        <div class="form-group">
            <button type="button">Cancel</button>
            <button type="submit">Save Changes</button>
        </div>
    </form>
</div>
</body>
</html>
