package com.slxsm.auto;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
@Conditional(GbkCondition.class)
public class EncodingConvertConfiguration {

    @Bean
    //@Conditional(Utf8Condition.class)
    public EncodingConvert createUtf8EncodingConvert(){
        return new UTF8EncodingConvert();
    }

    @Bean
    //@Conditional(GbkCondition.class)
    public EncodingConvert createGbkEncodingConvert(){
        return new GbkEncodingConvert();
    }
}
