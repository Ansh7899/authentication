package com.example.authentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.authentication.model.User;
import java.util.List;

public interface UserRepository extends MongoRepository<User, Integer> {

}