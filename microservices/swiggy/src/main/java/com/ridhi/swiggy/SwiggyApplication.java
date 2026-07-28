package com.ridhi.swiggy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SwiggyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwiggyApplication.class, args);
    }
}