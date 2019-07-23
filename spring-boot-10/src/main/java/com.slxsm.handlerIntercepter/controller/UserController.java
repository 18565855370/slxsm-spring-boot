package com.slxsm.handlerIntercepter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("getUser")
    public String getUser(){
        return "hello zhang";
    }

    @RequestMapping("userHelp")
    public String userHelp(){
        throw new IllegalArgumentException("args is empty");
    }

    @RequestMapping("null")
    public String empty(){
        throw new NullPointerException("args is empty");
    }
}
