package com.example.demo;

import com.example.demo.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {

        // 1. 执行Web
        SpringApplication.run(DemoApplication.class, args);


//        // 2. 创建容器对象
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        User user = (User) context.getBean("user");
//
//        UserAction action = (UserAction) context.getBean("userAction");
//        UserService service = (UserService) context.getBean("userService");
//        UserDao dao = (UserDao) context.getBean("userDao");
//
//        System.out.println("============================================================");
//
//        System.out.println(user);
//        System.out.println(context);
//        System.out.println(action);
//        System.out.println(service);
//        System.out.println(dao);
//
//        action.execute();
//
//        System.out.println("============================================================");
    }


}
