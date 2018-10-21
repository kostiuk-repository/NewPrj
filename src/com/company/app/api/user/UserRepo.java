package com.company.app.api.user;

import com.company.domain.user.User;

import java.util.List;

public interface UserRepo {

    void update(User user);

    void save(User user);

    User findUserById(int id);

    List<User> findAll();

    List<User> findUsersByName(String name);

    List<User> findUsersWithAgeMoreThan(int age);
}
