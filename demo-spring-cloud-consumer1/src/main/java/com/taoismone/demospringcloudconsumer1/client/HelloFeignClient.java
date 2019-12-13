package com.taoismone.demospringcloudconsumer1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kc
 * @title
 * @description The class HelloFeignClient is for
 * @date Create in 0:12 2019/12/14
 */
@FeignClient(value = "service-hi")
public interface HelloFeignClient {

    @GetMapping(value = "/hi")
    public String getHello(@RequestParam String name);
}
