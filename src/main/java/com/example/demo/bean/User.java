package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String username;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format("id=%s, username=%s", id, username);
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
    
}