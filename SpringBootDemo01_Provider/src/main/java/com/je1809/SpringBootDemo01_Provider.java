package com.je1809;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringBootDemo01_Provider {
    public static void main(String[] args){
        SpringApplication.run(SpringBootDemo01_Provider.class,args);
    }
}
