package com.slxsm.sbkz;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

public class MyApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(applicationContext.getBeanDefinitionCount());
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
