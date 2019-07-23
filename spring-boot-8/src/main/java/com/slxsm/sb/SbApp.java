package com.slxsm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbApp {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SbApp.class);
        ConfigurableApplicationContext context = application.run(args);

        context.close();
    }
}
