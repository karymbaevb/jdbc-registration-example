package com.company;

import com.company.model.User;
import com.company.service.UserService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User newUser = new User();
        newUser.setId(1);
        newUser.setLogin("fox");
        newUser.setEmail("fox@fox.com");
        newUser.setPassword("fox12345");
        newUser.setDateOfRegistration(LocalDateTime.now());

        UserService userService = new UserService();
        int count = userService.registerUser(newUser);
        if (count > 0) {
            System.out.println("success register");
        } else {
            System.out.println("fail register");
        }
    }

}
