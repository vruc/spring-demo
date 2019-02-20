package com.example.demo.service;

public class SMSServiceImpl implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("SMS sent to "+rec+ " with Message="+msg);
        return true;
    }
}
