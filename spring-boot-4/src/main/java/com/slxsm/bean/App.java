package com.slxsm.bean;

import com.slxsm.corebean.Role;
import com.slxsm.corebean.RunnableConfiguration;
import com.slxsm.corebean.User;
import com.slxsm.corebean.UserConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(RunnableConfiguration.class));
        System.out.println(context.getBean(UserConfiguration.class));
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Role.class));
        context.close();
    }

}
