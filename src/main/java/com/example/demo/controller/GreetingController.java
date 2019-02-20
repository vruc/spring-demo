package com.example.demo.controller;

import com.example.demo.UserService;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

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

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Oscar") String name) {
        userService.save();
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @Resource(name = "userService")
    private UserService userService;

    public class Greeting {

        @Getter
        private final long id;

        @Getter
        private final long created = Calendar.getInstance().getTimeInMillis();

        @Getter
        private final String content;

        Greeting(long id, String content) {
            this.id = id;
            this.content = content;
        }

    }

}
