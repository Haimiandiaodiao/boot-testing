package com.dyy.springboot.boottesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BootTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootTestingApplication.class, args);
    }

}