package com.greatlearning.employee_management.controller;

import com.greatlearning.employee_management.entity.Role;
import com.greatlearning.employee_management.entity.User;
import com.greatlearning.employee_management.service.RoleService;
import com.greatlearning.employee_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;


    @PostMapping("/api/user/save")
    public void saveUserDetails(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("/api/role/save")
    public void saveRoleDetails(@RequestBody Role role) {
        roleService.save(role);
    }


}
