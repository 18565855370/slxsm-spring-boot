package com.slxsm.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
        //context.addApplicationListener(new MyApplicationListener());
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.stop();
        context.close();
    }
}
