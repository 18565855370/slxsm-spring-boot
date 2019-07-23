package com.slxsm.handlerIntercepter.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String error1(Exception e){
        return "exception is " + e.getMessage();
    }
}
