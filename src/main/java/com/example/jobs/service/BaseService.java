package com.example.jobs.service;

import java.util.List;

public interface BaseService<T> {

    T findById(int id);
    T checkLoginPassword(String login, String password);
    /*List<T> findFirstNameLastName(String search);*/
    List<T> findAll();
    boolean deleteById(int id);
    boolean update(T entity);
    boolean save(T entity);
}