package com.yltfy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulStartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStartSpringCloudApp.class, args);
    }
}
