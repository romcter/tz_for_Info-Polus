package com.example.tz_for_infopolus.controller;

import com.example.tz_for_infopolus.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{name}")
    public UserService.UserDto getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @GetMapping
    public List<UserService.UserDto> getAllUser(){
        return userService.getAllUser();
    }
}
