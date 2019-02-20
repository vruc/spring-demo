package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public void save(){
        userDao.save();
    }
}
