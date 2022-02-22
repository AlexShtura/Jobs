package com.example.jobs.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AppJdbcConnection {
    public static void main(String[] args) {

        String create_table_roles = "CREATE TABLE roles (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, role VARCHAR(10))";
        String creat_table_users = "CREATE TABLE users (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(20), last_name VARCHAR(20), age INT, login VARCHAR(20), password VARCHAR(20), role VARCHAR(20))";

        JdbcConnection jdbcConnection = new JdbcConnection();
        try (Connection connection = jdbcConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(creat_table_users);
            statement.executeUpdate(create_table_roles);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

