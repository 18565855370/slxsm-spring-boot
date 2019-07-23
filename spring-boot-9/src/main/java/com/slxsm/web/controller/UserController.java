package com.slxsm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping("allMethodUser")
    public String allMethodUser(){
        return "allUser";
    }

    @RequestMapping("allMethodUser1")
    @ResponseBody
    public String allMethodUser1(){
        return "allUser-1";
    }

    @RequestMapping(value = "postMethodUser", method = RequestMethod.POST)
    @ResponseBody
    public String postMethodUser(){
        return "postMethodUser";
    }

    @GetMapping("getMethodUser")
    @ResponseBody
    public String getMethodUser(){
        return "getMethodUser";
    }

    @DeleteMapping("deleteMethodUser")
    @ResponseBody
    public String deleteMetodUser(){
        return "deleteMethodUser";
    }

    @PatchMapping("patchMethodUser")
    @ResponseBody
    public String patchMethodUser(){
        return "patchMethodUser";
    }

    @PutMapping("putMethodUser")
    @ResponseBody
    public String putMethodUser(){
        return "putMethodUser";
    }

    //params

    @PostMapping(value = "postMethodUser1")
    @ResponseBody
    public String postMethodUser1(@RequestParam("userName") String username,
                                 @RequestParam("password") String password,
                                 @RequestParam(value = "email", required = false) String email,
                                 @RequestParam(value = "address", defaultValue = "bei jing") String address){
        return "username = " + username + " password = " +password + " email = " + email + " address = " + address;

    }
}
