package com.example.tz_for_infopolus;

import com.example.tz_for_infopolus.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TzForInfoPolusApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TzForInfoPolusApplication.class, args);
        context.getBean(UserService.class).initializer();
    }

}
