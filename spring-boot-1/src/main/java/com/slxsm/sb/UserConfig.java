package com.slxsm.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

    @Value("${local.port}")
    private String localPort;

    @Value("${username1:zhang san}")
    private String username;

    @Value("${password:123456}")
    private String password;

    @Value("${url}")
    private String url;

    @Value("${driverName}")
    private String driverName;

    @Autowired
    private Environment env;

    public void show(){
        System.out.println("local.ip=" + env.getProperty("local.ip"));
        System.out.println("local.port=" + localPort);
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        System.out.println("url=" + url + "driverName=" + driverName);
    }
}
