package com.example.demo.service;

// 传统实现
//public class MessageService {
//    public void sendMessage(String message, String receiver) {
//        System.out.println("Email sent to " + receiver + " with Message=" + message);
//    }
//}

public interface MessageService {
    boolean sendMessage(String msg, String rec);
}
