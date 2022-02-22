package com.example.jobs.repository.impl;

import com.example.jobs.config.JdbcConnection;
import com.example.jobs.entity.Role;
import com.example.jobs.repository.BaseRepository;
import com.example.jobs.entity.User;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserRepositoryImpl implements BaseRepository<User> {

    private static final Logger LOGGER = LogManager.getLogger(UserRepositoryImpl.class);

    private static final String INSERT = "INSERT INTO users (first_name, last_name, age, login, password, role) values (?, ?, ?, ?, ?, ?)";
    private static final String DELETE = "DELETE FROM users where id = ?";
    private static final String SELECT_BY_ID = "SELECT * FROM users where id = ?";
    private static final String SELECT_ALL = "SELECT * FROM users";
    private static final String SELECT_ROLE_BY_NAME = "SELECT * FROM roles where role = ?";
    private static final String SELECT_ROLE_BY_ID = "SELECT * FROM roles where id = ?";
    private static final String SELECT_BY_LOGIN_PASSWORD = "SELECT * FROM users WHERE login = ? and password = ?";
    //private static final String SELECT_BY_CRITERIA = "SELECT * FROM users WHERE first_name LIKE '%?%' AND last_name LIKE '%?%'";

    private final JdbcConnection connection;
    public UserRepositoryImpl() {
        this.connection = new JdbcConnection();
    };

    @Override
    public User findById(int id) {
        User user = new User();
        try(Connection connection1 = connection.getConnection();
            PreparedStatement statement = connection1.prepareStatement(SELECT_BY_ID)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setAge(resultSet.getInt("age"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("Password"));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return user;
    }

    /*@Override
    public List<User> findFirstNameLastName(String search) {
        List<User>users=new ArrayList<>();
        try (Connection connection1 = connection.getConnection();
             PreparedStatement statement = connection1.prepareStatement(SELECT_BY_CRITERIA)) {
            statement.setString(1, search);
            statement.setString(2, search);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                String loginUser = resultSet.getString("login");
                String loginPassword = resultSet.getString("Password");
                Role role = getRoleById(resultSet.getInt("role"));
                User user = new User(id, firstName, lastName, age, loginUser, loginPassword, role);
                users.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }*/

    @Override
    public List<User> findAll() {
        List<User>users=new ArrayList<>();
        try(Connection connection2 = connection.getConnection();
            PreparedStatement statement = connection2.prepareStatement(SELECT_ALL)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                int age = resultSet.getInt(4);
                String login = resultSet.getString(5);
                String password = resultSet.getString(6);
                User user = new User(id, firstName, lastName, age, login, password);
                users.add(user);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return findAll();
    }

    @Override
    public boolean deleteById(int id) {
        try(Connection connection1 = connection.getConnection();
            PreparedStatement statement = connection1.prepareStatement(DELETE)){
            statement.setInt(1, id);
            return statement.executeUpdate() !=0;
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(User entity) {
        return false;
    }

    @Override
    public boolean save(User entity) {
        try(Connection connection1 = connection.getConnection();
            PreparedStatement statement = connection1.prepareStatement(INSERT)){
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setInt(3, entity.getAge());
            statement.setString(4, entity.getLogin());
            statement.setString(5, entity.getPassword());
            statement.setInt(6, getRoleByName(entity.getRole().toString()));
            return statement.executeUpdate() !=0;
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return false;
    }

    private int getRoleByName (String name){
        int roleId =0;
        try(Connection connection1 = connection.getConnection();
            PreparedStatement statement = connection1.prepareStatement(SELECT_ROLE_BY_NAME)){
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                roleId = resultSet.getInt("id");
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return roleId;
    }

    @Override
    public User checkLoginPassword(String login, String password) {
        User user = null;
        try (Connection connection1 = connection.getConnection();
             PreparedStatement statement = connection1.prepareStatement(SELECT_BY_LOGIN_PASSWORD)) {
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                String loginUser = resultSet.getString("login");
                String loginPassword = resultSet.getString("Password");
                Role role = getRoleById(resultSet.getInt("role"));
                user.setId(id);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setAge(age);
                user.setLogin(loginUser);
                user.setPassword(loginPassword);
                user.setRole(role);
                LOGGER.log(Level.INFO, "User: " + user);
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            LOGGER.log(Level.ERROR, throwables);
        }
        return user;
    }

    private Role getRoleById (int id){
        try(Connection connection1 = connection.getConnection();
            PreparedStatement statement = connection1.prepareStatement(SELECT_ROLE_BY_ID)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Role role = Role.valueOf(resultSet.getString("role").toUpperCase(Locale.ROOT));
                return role;
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return null;
    }
}
