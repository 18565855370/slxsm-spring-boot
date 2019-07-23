package com.slxsm.test;

import coms.slxsm.test.TestApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApp.class,TestBeanConfiguration.class})
public class ApplicationContextTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testNull(){
        Assert.assertNotNull(context.getBean(Runnable.class));
    }
}
