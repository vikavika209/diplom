package com.persons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MainPerson {
    public static void main(String[] args) {
        SpringApplication.run(MainPerson.class, args);
    }
}
