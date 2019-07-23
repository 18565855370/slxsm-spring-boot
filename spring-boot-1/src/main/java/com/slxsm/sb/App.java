package com.slxsm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    @Bean
    public Runnable createRunnable(){
        return () -> System.out.println("spring boot is run");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
        System.out.println(context.getEnvironment().getProperty("local.ip"));
        context.getBean(UserConfig.class).show();
        context.getBean(Runnable.class).run();
        context.getBean(DataSourceProperties.class).show();
        System.out.println(context.getBean(SlxsmAbc.class));
        System.out.println(context.getEnvironment().getProperty("driverName1"));
    }
}
