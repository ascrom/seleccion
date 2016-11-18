package com.selection.controllers;

import com.selection.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ascrom on 16/11/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/table")
    public String tableUsers(Model model) {
        model.addAttribute("users", userService.listAll());
        return "user_table";
    }
}
