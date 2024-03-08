package com.example.authentication;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.mapping.Document;

@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

}
