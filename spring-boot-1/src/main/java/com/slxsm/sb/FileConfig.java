package com.slxsm.sb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
/*@PropertySource("classpath:jdbc.properties")
@PropertySource("file:/G:/java/workspace/spring-boot/jdbc.properties")*/
@PropertySources({@PropertySource("classpath:jdbc.properties"),
        @PropertySource("file:/g:/java/workspace/spring-boot/jdbc.properties")})
public class FileConfig {
}
