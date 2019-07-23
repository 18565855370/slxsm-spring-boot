package com.slxsm.auto;

import com.google.gson.Gson;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class UserConfiguration {

    @Bean
    @ConditionalOnProperty(name = "abc", havingValue = "true", matchIfMissing = true)
    public Runnable createRunnable(){
        return () -> {};
    }

    @Bean
    @ConditionalOnClass(name = "com.google.gson.Gson")
    public Runnable createGson(){
        return () -> {};
    }

    @Bean
    @ConditionalOnBean(name = "user")
    public Runnable createUser(){
        return () -> {};
    }
}
