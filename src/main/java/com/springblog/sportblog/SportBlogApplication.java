package com.springblog.sportblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SportBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(SportBlogApplication.class, args);
    }
}
