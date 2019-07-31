package com.sb.config;

import com.sb.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置全局的配置类
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService(){

        return new HelloService();
    }
}
