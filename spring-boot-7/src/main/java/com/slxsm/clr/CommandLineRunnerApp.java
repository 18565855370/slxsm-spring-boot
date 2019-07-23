package com.slxsm.clr;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class CommandLineRunnerApp {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CommandLineRunnerApp.class);
        /*application.setBannerMode(Banner.Mode.OFF);*/
        ConfigurableApplicationContext context = application.run(args);
        ApplicationArguments arg = context.getBean(ApplicationArguments.class);
        System.out.println(Arrays.asList(arg.getSourceArgs()));
        System.out.println(Arrays.toString(arg.getSourceArgs()));
        System.out.println(arg.getOptionNames());
        System.out.println(arg.getOptionValues("name"));
        System.out.println(arg.containsOption("name1"));
        context.close();
    }
}
