package com.slxsm.test;

import coms.slxsm.test.TestApp;
import coms.slxsm.test.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void addUserTest(){
        Assert.assertEquals(Integer.valueOf(0),userDao.addUser(null));
        Assert.assertEquals(Integer.valueOf(1),userDao.addUser(1));
    }
}
