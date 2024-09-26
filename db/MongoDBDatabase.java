package com.example.adapter.db;

public class MongoDBDatabase {
    public void mongoConnect() {
        System.out.println("Connecting to MongoDB.");
    }

    public void mongoExecute(String query) {
        System.out.println("Executing query on MongoDB: " + query);
    }
}
