package com.taoismone.demospringcloudzipkin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author kc
 * @title
 * @description The class IpInfoService is for
 * @date Create in 4:08 2019/12/14
 */
@Service
public class IpInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    public String ipInfo(String name) {
        Object tempObj = restTemplate.getForObject(new StringBuilder().append("http://SERVICE-HI/hi?name=").append(name).toString(), String.class);
        return tempObj.toString();
    }
}
