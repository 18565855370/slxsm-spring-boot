package com.slxsm.aop;

import com.slxsm.aop.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbAopApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SbAopApp.class,args);
        System.out.println(context.getBean(UserDao.class).getUser("zhang san", "root1234"));
        context.close();
    }
}
