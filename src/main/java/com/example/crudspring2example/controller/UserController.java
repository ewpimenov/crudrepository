package com.example.crudspring2example.controller;

import com.example.crudspring2example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "/listUsers";
    }

    @GetMapping("/user")
    public String userPage() {
        return "/user";
    }
}
