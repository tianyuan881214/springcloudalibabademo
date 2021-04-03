package com.example.eureka_client_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientDemo1Application.class, args);
    }

    @GetMapping("/app")
    public String app(){
        return "lian jie app ";
    }

}
