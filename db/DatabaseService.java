package com.example.adapter.db;

public class DatabaseService {
    private Database database;

    public DatabaseService(Database database) {
        this.database = database;
    }

    public void runQuery(String query) {
        database.connect();
        database.executeQuery(query);
    }

    public static void main(String[] args) {
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        MongoDBDatabase mongoDBDatabase = new MongoDBDatabase();

        Database mySQLAdapter = new MySQLAdapter(mySQLDatabase);
        Database mongoDBAdapter = new MongoDBAdapter(mongoDBDatabase);

        DatabaseService dbService1 = new DatabaseService(mySQLAdapter);
        dbService1.runQuery("SELECT * FROM users");

        DatabaseService dbService2 = new DatabaseService(mongoDBAdapter);
        dbService2.runQuery("{ find: 'users' }");
    }
}
