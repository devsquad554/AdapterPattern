package com.example.adapter.db;

public class MongoDBAdapter implements Database {
    private MongoDBDatabase mongoDBDatabase;

    public MongoDBAdapter(MongoDBDatabase mongoDBDatabase) {
        this.mongoDBDatabase = mongoDBDatabase;
    }

    @Override
    public void connect() {
        mongoDBDatabase.mongoConnect();
    }

    @Override
    public void executeQuery(String query) {
        mongoDBDatabase.mongoExecute(query);
    }
}
