package coms.slxsm.test;

import coms.slxsm.test.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestApp.class,args);
        context.getBean(UserDao.class).addUser(1);
        System.out.println(context.getBean(Runnable.class));//报错
        context.close();
    }
}
