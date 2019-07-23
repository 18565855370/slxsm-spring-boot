package com.slxsm.test;

import coms.slxsm.test.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class BDDMockTest {

    @MockBean
    private UserMapper mapper;

    @Before
    public void init(){
        //假设操作
        BDDMockito.given(mapper.addUser("admin")).willReturn(0);
        BDDMockito.given(mapper.addUser("1")).willReturn(Integer.valueOf(1));
        BDDMockito.given(mapper.addUser(null)).willThrow(NullPointerException.class);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBddTest(){
        Assert.assertEquals(Integer.valueOf(0),mapper.addUser("admin"));
        Assert.assertEquals(Integer.valueOf(1),mapper.addUser("1"));
        Assert.assertEquals(Integer.valueOf(1),mapper.addUser(null));
    }
}
