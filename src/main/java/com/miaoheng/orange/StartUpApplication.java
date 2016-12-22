package com.miaoheng.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luoqi on 16/12/6.
 */

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class StartUpApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class, args);
    }
}
