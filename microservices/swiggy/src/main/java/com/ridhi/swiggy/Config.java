package com.ridhi.swiggy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {

    @Bean
    public WebClient web() {
        WebClient web = WebClient.builder()
                .baseUrl("http://localhost:8087/paytm")
                .build();
                return web;
    }
}