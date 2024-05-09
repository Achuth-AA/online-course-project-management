<html>
  <head>
    <meta charset="UTF-8" />
    <title>Questor Login</title>
    <link rel="stylesheet" href="./css/index.css" />
  </head>
  <body>
    <header>
      <h1>Questor</h1>
      <nav>
        <ul>
          <li><a href="#">DASHBOARD</a></li>
          <li><a href="#">COURSES</a></li>
          <li><a href="#">PROJECT PORTAL</a></li>
          <li><a href="#">MY PROFILE</a></li>
        </ul>
      </nav>
    </header>

    <div class="container">
      <main>
        <form action="login" method="post">
          <h2>Enter Email</h2>
          <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required />
          </div>
          <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required />
          </div>
          <div class="form-group">
            <button type="submit">Sign In</button>
            <!-- <span class="error-message"><%= request.getAttribute("errorMessage") %></span> -->
          </div>
          <a href="#" class="forgot-password">Recover Password?</a>
          <div class="social-login">
            <p>Or continue with</p>
            <a href="#" class="social-icon"
              ><img src="images/google-icon.png" alt="Google"
            /></a>
          </div>
        </form>
        <p>Don't have an account? You can <a href="#">Register here!</a></p>
      </main>
    </div>
  </body>
</html>
