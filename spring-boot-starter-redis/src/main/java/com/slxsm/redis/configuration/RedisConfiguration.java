package com.slxsm.redis.configuration;

import com.slxsm.redis.property.RedisProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
@ConditionalOnClass(Jedis.class)
public class RedisConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Jedis createJedis(RedisProperties properties){
        return new Jedis(properties.getHost(), properties.getPort());
    }
}
