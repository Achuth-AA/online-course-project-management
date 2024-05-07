<!DOCTYPE html>
<html>
    <head>
        <title>Registration Page</title>
    </head>
    <body>
        <h2>Register</h2>
        <form action="RegistrationServlet" method="post">
            <div>
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required />
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required />
            </div>
            <div>
                <label for="name">Name:</label>
                <input type="text" id="name" name="name">
            </div>
            <div>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" />
            </div>
            <div>
                <label for="country">Country:</label>
                <input type="text" id="country" name="country" />
            </div>
            <div>
                <label for="town">Town:</label>
                <input type="text" id="town" name="town" />
            </div>
            <div>
                <button type="submit">Register</button>
            </div>
        </form>
        <p>Already registered? <a href="login.jsp">Login here</a></p>
    </body>
</html>
