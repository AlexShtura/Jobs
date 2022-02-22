package com.example.jobs.controller;

import com.example.jobs.entity.User;
import com.example.jobs.service.BaseService;
import com.example.jobs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class InformationController extends HttpServlet {

    private BaseService<User> userService = new UserServiceImpl();


    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = DB.select();
        req.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/list-user.jsp").forward(req, resp);
    }*/
}
