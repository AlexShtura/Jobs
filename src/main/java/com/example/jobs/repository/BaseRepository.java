package com.example.jobs.repository;

import com.example.jobs.entity.User;

import java.util.List;

public interface BaseRepository <T>{
    T findById(int id);
    /*List<T> findFirstNameLastName(String first_name, String last_name);*/
    T checkLoginPassword(String login, String password);
    List<T> findAll();
    boolean deleteById(int id);
    boolean update(T entity);
    boolean save(T entity);
}
