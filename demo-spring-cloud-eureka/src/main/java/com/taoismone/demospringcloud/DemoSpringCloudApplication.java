package com.taoismone.demospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudApplication.class, args);
    }

}
