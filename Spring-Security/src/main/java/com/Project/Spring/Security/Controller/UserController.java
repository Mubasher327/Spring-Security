package com.Project.Spring.Security.Controller;

import com.Project.Spring.Security.Entities.User;
import com.Project.Spring.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get")
    public List<User> getEmployee(){
        System.out.println("Get Users");
        return userService.getEmployee();
    }

    @GetMapping("/current-User")
    public String getLoggedInUser(Principal principal){

        return principal.getName();
    }

}
