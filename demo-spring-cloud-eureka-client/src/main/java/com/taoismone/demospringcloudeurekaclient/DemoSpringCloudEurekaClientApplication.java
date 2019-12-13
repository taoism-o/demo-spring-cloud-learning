package com.taoismone.demospringcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoSpringCloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudEurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi")
    public String home(@RequestParam String name) {
        return new StringBuilder().append("Hi! ").append(name).append(", I'm from port: ").append(port).toString();
    }

}
