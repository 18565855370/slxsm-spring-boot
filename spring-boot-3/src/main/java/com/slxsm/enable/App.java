package com.slxsm.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableConfigurationProperties
@EnableAsync
@ComponentScan
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
        System.out.println(context.getBean(TomcatProperties.class));
        context.getBean(Runnable.class).run();
        System.out.printf("AsyncJeep is end");
        context.close();
    }
}
