package com.selection.data;

import com.selection.models.Role;
import com.selection.models.User;
import com.selection.services.RoleService;
import com.selection.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by ascrom on 16/11/16.
 */
@Component
public class Data implements ApplicationListener<ContextRefreshedEvent>{

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

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
      insertUsersAndRoles();
    }

    public void insertUsersAndRoles() {
        User userAdmin = new User();
        userAdmin.setUserName("admin");
        userAdmin.setPassword("admin");
        userAdmin.setRol("ADMIN");
        userService.saveOrUpdate(userAdmin);
        User userMortal = new User();
        userMortal.setUserName("mortal");
        userMortal.setPassword("mortal");
        userMortal.setRol("USER");
        userService.saveOrUpdate(userMortal);
    }

}
