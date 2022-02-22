package com.example.jobs.controller;

import com.example.jobs.entity.User;
import com.example.jobs.service.BaseService;
import com.example.jobs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private BaseService<User> userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = userService.checkLoginPassword(login, password);
        String path = req.getContextPath() + "/pages/main/main.jsp";
        if (user != null) {
            HttpSession session1 = req.getSession();
            session1.setAttribute("user", user);
        } else {
            path = req.getContextPath() + "/pages/error/error.jsp";

        }
        resp.sendRedirect(path);




    }
}
