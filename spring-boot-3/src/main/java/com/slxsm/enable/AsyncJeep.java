package com.slxsm.enable;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class AsyncJeep implements Runnable{

    @Async
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++){
                System.out.printf("-----%s-----",i);
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
