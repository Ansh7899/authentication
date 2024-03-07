package com.example.authentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.authentication.model.User;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    // Custom query method to find a user by email
    User findByEmail(String email);

    // Custom query method to find users by name
    List<User> findByName(String name);

    // Custom query method to find users by name containing a given string
    List<User> findByNameContaining(String partialName);

    // You can add more custom query methods as needed
}
