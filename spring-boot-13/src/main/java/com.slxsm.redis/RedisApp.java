package com.slxsm.redis;

import com.slxsm.redis.enable.EnableRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableRedis
public class RedisApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RedisApp.class,args);

        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("name","zhang san");
        System.out.println(jedis.get("name"));

        context.close();
    }
}
