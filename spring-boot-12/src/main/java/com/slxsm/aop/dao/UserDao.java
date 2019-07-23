package com.slxsm.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public String getUser(String username, String password){
        return "[username " + username + " ,password: " + password + "]";
    }
}
