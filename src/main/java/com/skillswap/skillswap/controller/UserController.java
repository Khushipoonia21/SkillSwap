package com.skillswap.skillswap.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillswap.skillswap.entity.User;
import com.skillswap.skillswap.service.UserService;

    @RestController
    @RequestMapping("/api/users")
    public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
}

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
    userService.deleteUser(id);
    return "User deleted successfully";
}

    @PutMapping("/{id}")
    public User updateUser(
        @PathVariable Long id,
        @RequestBody User user) {

    return userService.updateUser(id, user);
}
    
    
}
