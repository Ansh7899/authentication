package com.example.authentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.authentication.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}