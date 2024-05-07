<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <h2>Login</h2>
        <form action="LoginServlet" method="get">
            <div>
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required />
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required />
            </div>
            <div>
                <button type="submit">Login</button>
            </div>
        </form>
        <p>Not registered? <a href="register.jsp">Register here</a></p>
    </body>
</html>
