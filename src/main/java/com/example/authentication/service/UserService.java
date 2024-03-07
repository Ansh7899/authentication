package com.example.authentication.service;

import com.example.authentication.model.User;
import com.example.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    public List<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
