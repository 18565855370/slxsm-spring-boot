package com.slxsm.listener;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void event1(Object event){
        System.out.println("MyEventHandle 监听到事件：" + event.getClass());
    }

    @EventListener
    public void event2(ContextStoppedEvent event){
        System.out.println("应用停止事件：" + event.getClass());
    }
}
