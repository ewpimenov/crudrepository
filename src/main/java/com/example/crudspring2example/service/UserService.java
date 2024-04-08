package com.example.crudspring2example.service;


import com.example.crudspring2example.model.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User getUser(int id);
}
