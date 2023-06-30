package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
@RestController
@RequestMapping("/home")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUsers() {
        this.logger.warn("Getting User");
        return userService.getUser();
    }
    @GetMapping("/current-user")
    public String getUser(Principal principal){
        return  principal.getName();
    }


}
