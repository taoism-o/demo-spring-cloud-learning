package com.taoismone.demospringcloudspringconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoSpringCloudSpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudSpringConfigApplication.class, args);
    }

}
