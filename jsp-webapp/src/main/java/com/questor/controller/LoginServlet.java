package com.questor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
// Replace with your actual authentication logic (e.g., database check, hashing)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Implement secure authentication logic here (e.g., database check, hashing)
        boolean isValid = authenticate(username, password);

        if (isValid) {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);

            // Redirect to a successful login page or secured resource
            response.sendRedirect("welcome.jsp"); // Replace with your welcome page
        } else {
            request.setAttribute("errorMessage", "Invalid username or password.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response); // Forward to login page with error
        }
    }

    // Replace this with your actual authentication logic
    private boolean authenticate(String username, String password) {
        // Simulate authentication (replace with your database check)
        return username.equals("admin@123") && password.equals("password");
    }
}
