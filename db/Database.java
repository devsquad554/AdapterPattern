package com.example.adapter.db;

public interface Database {
    void connect();
    void executeQuery(String query);
}
