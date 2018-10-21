package com.company.app.core.user;

import com.company.app.api.user.UserRepo;
import com.company.domain.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepoFromDisc implements UserRepo {

    List<User> users = new ArrayList<>();

    @Override
    public void update(User user) {
        users.stream()
                .filter(u -> u.getId() == user.getId())
                .forEach(us -> {
                    us.setId(user.getId());
                    us.setName(user.getName());
                    us.setSurname(user.getSurname());
                    us.setAge(user.getAge());
                });
    }

    @Override
    public void save(User user) {
        long count = users.stream()
                .filter(u -> u.getId() == user.getId())
                .count();
        if(count == 0){
            users.add(user);
        } else {
            throw new IllegalArgumentException("user with id = " + user.getId() +" already exist");
        }
    }

    @Override
    public User findUserById(int id) {
        Optional<User> user = users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
        if (user.isPresent()){
            return user.get();
        } else{
            throw new IllegalArgumentException("user with id = " + id +" don\'t exist");
        }
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public List<User> findUsersByName(String name) {
        List<User> usersList = users.stream()
                .filter(u -> u.getName().equals(name))
                .collect(Collectors.toList());
        if (usersList.size() > 0){
            return usersList;
        } else{
            throw new IllegalArgumentException("users with name = " + name +" don\'t exist");
        }
    }

    @Override
    public List<User> findUsersWithAgeMoreThan(int age) {
        List<User> usersList = users.stream()
                .filter(u -> u.getAge() > age)
                .collect(Collectors.toList());
        if (usersList.size() > 0){
            return usersList;
        } else{
            throw new IllegalArgumentException("users with age more than = " + age +" don\'t exist");
        }
    }
}
