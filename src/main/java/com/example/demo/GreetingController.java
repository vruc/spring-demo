package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class GreetingController {

    @RequestMapping("/")
    public @ResponseBody
    String index() {
        return "index";
    }

    @RequestMapping("/a/b")
    public @ResponseBody
    String t() {
        return "/a/b";
    }

    @RequestMapping("/greeting")
    public @ResponseBody
    String greeting() {
        return String.format("hello world! %s", new Date());
    }

}
