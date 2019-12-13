package com.taoismone.demospringcloudconsumer1.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.taoismone.demospringcloudconsumer1.client.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author kc
 * @title
 * @description The class HelloService is for
 * @date Create in 17:50 2019/12/13
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private HelloFeignClient helloFeignClient;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        Object tempObj = restTemplate.getForObject(new StringBuilder().append("http://SERVICE-HI/hi?name=").append(name).toString(), String.class);
        return tempObj.toString();
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiFeignClient(String name) {
        String result = helloFeignClient.getHello(name);
        return result;
    }

    private String hiError(String name) {
        return new StringBuilder().append("Hey! Service: ").append(name).append(" got a error. \r\n There is something wrong with this services").toString();
    }
}
