package com.example.authentication.controller;

import com.example.authentication.model.User;
import com.example.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    public UserRepository userRepository;

    @PostMapping("/existinguser")
    public boolean userLogin(@PathVariable Integer id, @PathVariable String password) {
        User user = userRepository.findById(id).get();
        return user.getPassword().equals(password);
    }


}
