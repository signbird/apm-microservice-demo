package com.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.demo"})
@SpringBootApplication
@ComponentScan(basePackages = {"com.demo"})
public class ServiceApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
