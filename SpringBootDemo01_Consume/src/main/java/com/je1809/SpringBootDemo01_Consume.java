package com.je1809;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootDemo01_Consume {
    public static void main(String[] args){
        SpringApplication.run(SpringBootDemo01_Consume.class,args);
    }

}
