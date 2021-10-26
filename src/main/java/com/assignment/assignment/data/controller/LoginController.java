package com.assignment.assignment.data.controller;

import com.assignment.assignment.data.business.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    @RequestMapping("/login/add")
    public String addUser(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email){
        return loginService.addNewUser(username, password, email);
    }

}
