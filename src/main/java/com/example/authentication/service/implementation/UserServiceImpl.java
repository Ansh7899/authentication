package com.example.authentication.service.implementation;

import com.example.authentication.model.User;
import com.example.authentication.repository.UserRepository;
import com.example.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(Integer id) {
        User user = userRepository
                .findById(id)
                .get();
        userRepository.delete(user);
        return user;
    }

    @Override
    public User updateUser(Integer id, User user) {
        User oldUser = userRepository
                .findById(id)
                .get();
        oldUser.setId(user.getId());
        oldUser.setName(user.getName());
        oldUser.setEmail(user.getEmail());
        oldUser.setPassword(user.getPassword());
        userRepository.save(oldUser);
        return oldUser;
    }
}
