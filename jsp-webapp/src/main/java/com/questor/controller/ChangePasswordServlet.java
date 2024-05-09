package com.questor.controller;

import com.mysql.cj.Session;
import com.questor.dao.ProfileRetreival;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ChangePassword")
public class ChangePasswordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String currPassword = req.getParameter("current-password");
        String newPassword = req.getParameter("new-password");
        String confirmPassword = req.getParameter("confirm-password");

        HttpSession session = req.getSession();
        int userId = (int) session.getAttribute("userId");

        ProfileRetreival userDAO = new ProfileRetreival();
        if (userDAO.checkPassword(userId, currPassword)) {
            if (newPassword.equals(confirmPassword)) {
                int res = userDAO.changePassword(userId, newPassword);
                if (res != 0) {
                    System.out.println("updated");
//
                    resp.sendRedirect("./views/profile.jsp");
                }
            }
        }
    }
}
