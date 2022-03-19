package com.company.service;

import com.company.dao.UserDao;
import com.company.model.User;

public class UserService {

    public int registerUser(User user){
        UserDao userDao = new UserDao();
        return userDao.insertUser(user);
    }

    public void authorize(String login, String password){
        //SELECT * FROM users where login = login
        //user.getPassword == password
        //insertUserLog (fail or ok)

    }
}
