package com.gsb.web.designer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}