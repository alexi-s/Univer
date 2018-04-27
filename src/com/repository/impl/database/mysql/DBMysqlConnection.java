package com.repository.impl.database.mysql;

/**
 * Created by student on 27.04.2018.
 */
public class DBMysqlConnection {
    // здесь должна быть реализация работы с базой данных

    private static DBMysqlConnection instance;

    public DBMysqlConnection() {
    }

    public static DBMysqlConnection getInstance(){
        if (instance == null) {
            instance = new DBMysqlConnection();
        }
        return instance;
    }

    public void createQuery(String query) {

    }
}
