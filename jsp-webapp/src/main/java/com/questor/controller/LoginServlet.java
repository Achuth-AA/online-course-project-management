package com.questor.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.questor.dao.LoginDao.authenticate;

@WebServlet("/login")
// Replace with your actual authentication logic (e.g., database check, hashing)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Implement secure authentication logic here (e.g., database check, hashing)
        int userId = authenticate(email, password);
        System.out.println(userId);

        if (userId != 0) {
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            System.out.println(userId);

            // Redirect to a successful login page or secured resource
            response.sendRedirect("./views/profile.jsp"); // Replace with your welcome page
        } else {
            request.setAttribute("errorMessage", "Invalid username or password.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("./views/login.jsp");
            dispatcher.forward(request, response); // Forward to login page with error
        }
    }



    // Replace this with your actual authentication logic

    public static class SaveChangesServlet {
    }
}
