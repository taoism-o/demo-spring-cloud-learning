package com.taoismone.demospringcloudconsumer1.controller;

import com.taoismone.demospringcloudconsumer1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kc
 * @title
 * @description The class HelloController is for
 * @date Create in 17:49 2019/12/13
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return helloService.hiFeignClient(name);
    }


}
