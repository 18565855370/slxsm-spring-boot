package com.slxsm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JspController {

    @PostMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
        if (username.equals(password)){
            return "/ok";
        }
        return "/fail";
    }
}
