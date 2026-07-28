// package com.ridhi.swiggy;

// import feign.Feign;
// import org.springframework.cloud.client.loadbalancer.LoadBalanced;
// import org.springframework.context.annotation.Bean;
// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

// @LoadBalancerClient(name = "paytm")
// public class LoadBalancer {

//     @Bean
//     @LoadBalanced
//     public Feign.Builder m() {
//         return Feign.builder();
//     }
// }