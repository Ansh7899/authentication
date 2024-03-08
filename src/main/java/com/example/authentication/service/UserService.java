package com.example.authentication.service;

import com.example.authentication.model.User;
import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User addUser(User user);

    public User deleteUser(Integer id);

    public User updateUser(Integer id, User user);

}
