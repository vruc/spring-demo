package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserAction {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/execute")
    @ResponseBody
    public String execute() {
        userService.save();
        return "execute";
    }
}
