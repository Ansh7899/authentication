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
	String connectionString = "mongodb+srv://vaguecoder145:<password>@cluster0.bjaba4c.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
	MongoClientSettings settings = MongoClientSettings.builder()
			.applyConnectionString(new ConnectionString(connectionString))
			.build();
	// Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
		try {
			// Send a ping to confirm a successful connection
			MongoDatabase database = mongoClient.getDatabase("admin");
			database.runCommand(new Document("ping", 1));
			System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
		} catch (MongoException e) {
			e.printStackTrace();
		}
}}
