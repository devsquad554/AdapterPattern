package com.example.adapter.db;

public class MySQLAdapter implements Database {
    private MySQLDatabase mySQLDatabase;

    public MySQLAdapter(MySQLDatabase mySQLDatabase) {
        this.mySQLDatabase = mySQLDatabase;
    }

    @Override
    public void connect() {
        mySQLDatabase.mysqlConnect();
    }

    @Override
    public void executeQuery(String query) {
        mySQLDatabase.mysqlExecute(query);
    }
}
