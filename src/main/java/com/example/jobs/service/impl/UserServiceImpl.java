package com.example.jobs.service.impl;

import com.example.jobs.entity.User;
import com.example.jobs.repository.BaseRepository;
import com.example.jobs.repository.impl.UserRepositoryImpl;
import com.example.jobs.service.BaseService;

import java.util.List;

public class UserServiceImpl implements BaseService<User>{

    private BaseRepository<User> repository;

    public UserServiceImpl(){
        this.repository = new UserRepositoryImpl();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public User checkLoginPassword(String login, String password) {
        return repository.checkLoginPassword(login, password);
    }

    /*@Override
    public List<User> findFirstNameLastName(String search) {
        return repository.findFirstNameLastName(search);
    }*/

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        return repository.deleteById(id);
    }

    @Override
    public boolean update(User entity) {
        return repository.update(entity);
    }

    @Override
    public boolean save(User entity) {
        return repository.save(entity);
    }
}
