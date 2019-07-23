package com.slxsm.contain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("abcnn")
    public String abc(){
        return "abc";
    }
}
