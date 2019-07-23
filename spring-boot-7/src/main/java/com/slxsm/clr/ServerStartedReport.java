package com.slxsm.clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Order(5)
@Component
public class ServerStartedReport implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=========应用已经被启动=========" + LocalDate.now().toString());
    }
}
