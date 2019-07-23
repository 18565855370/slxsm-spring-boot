package com.slxsm.redis.enable;

import com.slxsm.redis.configuration.RedisConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(RedisConfiguration.class)
public @interface EnableRedis {
}
