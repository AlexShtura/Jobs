package com.example.jobs.controller;

import com.example.jobs.entity.User;
import com.example.jobs.service.BaseService;
import com.example.jobs.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServlet;

public class UpdateController extends HttpServlet {

    private BaseService<User> userService = new UserServiceImpl();


}
