package com.example.authentication.controller;

import com.example.authentication.model.User;
import com.example.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/createuser")
    public User addNewUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteuser")
    public User deleteUser(@RequestBody Integer id) {
        return userService.deleteUser(id);
    }

    @PutMapping("/updateUser")
    public User updateUser(
            @RequestBody Integer id,
            @RequestBody User user
    ) {
        return userService.updateUser(id, user);
    }
}
