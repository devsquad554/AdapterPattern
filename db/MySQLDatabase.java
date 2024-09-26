package com.example.adapter.db;

public class MySQLDatabase {
    public void mysqlConnect() {
        System.out.println("Connecting to MySQL Database.");
    }

    public void mysqlExecute(String query) {
        System.out.println("Executing query on MySQL: " + query);
    }
}
