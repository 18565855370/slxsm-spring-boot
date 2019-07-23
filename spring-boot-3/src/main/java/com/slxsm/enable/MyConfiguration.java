package com.slxsm.enable;

import org.springframework.context.annotation.Bean;

public class MyConfiguration {

    @Bean
    public Runnable createRunnable(){
        return () -> {};
    }

    @Bean
    public Runnable createRunnable1(){
        return () -> {};
    }
}
