package com.slxsm.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Role;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan
@EnableLog(name = "my spring boot log")
public class App2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App2.class,args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(role.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }
}
