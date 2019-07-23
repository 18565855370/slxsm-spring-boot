package com.slxsm.handlerIntercepter.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class ErrorController {

    @ExceptionHandler({FileNotFoundException.class,ClassNotFoundException.class})
    public String handlerError(Exception e){
        return "not found : " + e.getMessage();
    }


    @RequestMapping("error1")
    public String error1() throws FileNotFoundException{
        throw new FileNotFoundException("error1 is not found");
    }

    @RequestMapping("error2")
    public String error2() throws ClassNotFoundException {
        throw new ClassNotFoundException("error2 is not found");
    }
}
