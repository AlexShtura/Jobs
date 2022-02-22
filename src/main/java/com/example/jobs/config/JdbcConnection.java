package com.example.jobs.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnection {

    public Connection getConnection(){
        Properties properties = new Properties();
        Connection connection = null;
        try (InputStream in = JdbcConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            properties.load(in);
            String url = properties.getProperty("url");
            String login = properties.getProperty("login");
            String password = properties.getProperty("password");
            String driver = properties.getProperty("driver");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, login, password);
        }catch (SQLException | IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
}