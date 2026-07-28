package com.ridhi.paytm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient      //(optional)
public class PaytmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmApplication.class, args);
	}

}
