package com.study.bookstore.service;

import com.study.bookstore.models.User;
import com.study.bookstore.records.UserRecord;
import com.study.bookstore.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveNewUser(UserRecord u){
        User newUser = new User();

        newUser.setUserName(u.userName());
        newUser.setUserEmail(u.userEmail());

        userRepository.save(newUser);

        return newUser;
    }

}
