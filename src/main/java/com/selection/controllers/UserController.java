package com.selection.controllers;

import com.selection.models.User;
import com.selection.services.RoleService;
import com.selection.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ascrom on 16/11/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/table")
    public String tableUsers(Model model) {
        model.addAttribute("users", userService.listAll());
        return "user/table";
    }

    @RequestMapping("/form")
    public String formUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("rollist", roleService.listAll());
        return "user/form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveOrUpate(User user) {
        userService.saveOrUpdate(user);
        return "redirect:/user/table";
    }
}
