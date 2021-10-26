package com.assignment.assignment.data.controller;

import com.assignment.assignment.data.business.service.UserService;
import com.assignment.assignment.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping
    @RequestMapping("/users")
    public Iterable<User> getUsersDesc(){
        return userService.getUsers();
    }


    @GetMapping
    @RequestMapping("/user")
    public Iterable<User> getUsersByIdUser(@RequestParam Long id){
        return userService.getUsersByIdUser(id);
    }

    @GetMapping
    @RequestMapping("/user/{id}")
    public Iterable<User> getUsersByIdUserPathVariable(@PathVariable Long id){
        return userService.getUsersByIdUser(id);
    }

    @PutMapping
    @RequestMapping("/user/update/{id}/{name}")
    public String updateNameUser(@PathVariable String name, @PathVariable Long id){
        return userService.updateNameUser(name, id);
    }

    @PostMapping
    @RequestMapping(value = "/user/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }
 }