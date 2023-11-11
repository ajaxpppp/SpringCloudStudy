package com.shenjun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderconsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderconsulMain80.class, args);
    }
}
