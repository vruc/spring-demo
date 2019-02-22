package com.example.demo.controller;

import com.example.demo.UserService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("")
    public @ResponseBody
    String index() {
        return "index";
    }


    /* 奇怪的路径映射 */
    @RequestMapping("/a/b")
    public @ResponseBody
    String t() {
        return "/a/b";
    }

    /* 支持请求参数 */
    @RequestMapping("/sayHi")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Oscar") String name) {
        userService.save();
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    /* 支持路径参数 */
    @RequestMapping(value = "/bonjour/{name}", method = RequestMethod.GET)
    public Greeting bonjour(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(), String.format("bonjour %s", name));
    }

    public class Greeting {

        @Getter
        private final long id;

        @Getter
        private final long created = System.nanoTime();

        @Getter
        private final String content;

        Greeting(long id, String content) {
            this.id = id;
            this.content = content;
        }

    }

}
