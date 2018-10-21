package com.company;

import com.company.app.api.file.FileRepo;
import com.company.app.api.file.NewFileRepo;
import com.company.app.api.user.UserRepo;
import com.company.app.core.file.FileRepoFromDiscWithExtraData;
import com.company.app.core.user.UserRepoFromDisc;
import com.company.domain.file.File;
import com.company.domain.user.User;

public class Main {

    public static void main(String[] args) {


        UserRepo userRepo = new UserRepoFromDisc();

        User user1 = new User(1,"Влад","Котюк",23);
        User user2 = new User(2,"Влад","Сердюк",19);
        User user3 = new User(3,"Богдан","Павленко",22);
        User user4 = new User(4,"Богдан","Якійто",17);

        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);
        userRepo.save(user4);

        System.out.println(userRepo.findUserById(1) + "\n");
        System.out.println(userRepo.findAll() + "\n");
        System.out.println(userRepo.findUsersByName("Влад") + "\n");
        System.out.println(userRepo.findUsersWithAgeMoreThan(20) + "\n");
        User updatedUser = new User(1,"Влад","Котюк",24);
        userRepo.update(updatedUser);
        System.out.println(userRepo.findUserById(1) + "\n");

    }
}
