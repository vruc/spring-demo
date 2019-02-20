package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("===================================");

        showKeyValue("JAVA_HOME");

        showKeyValue("app.name");

        showKeyValue("spring.datasource.url");
        showKeyValue("spring.datasource.username");
        showKeyValue("spring.datasource.password");

        System.out.println("===================================");
    }

    void showKeyValue(String key) {
        System.out.println(String.format("%s ==> %s", key, env.getProperty(key)));
    }

}
