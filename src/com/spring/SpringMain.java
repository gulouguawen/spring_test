package com.spring;

import com.spring.dao.UserDao;
import com.spring.pojo.User;
import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        UserDao userDao = (UserDao) context.getBean("userDao");
//        System.out.println(userDao);
//        UserService userService = (UserService) context.getBean("userService");
//        System.out.println(userService);

//        UserService userService = (UserService) context.getBean("userService");
//        System.out.println(userService.login());
//        System.out.println("username=" + userService.login().getPassword());
//        System.out.println("password=" + userService.login().getUsername());
        System.out.println(context.getBean("u"));

    }
}
