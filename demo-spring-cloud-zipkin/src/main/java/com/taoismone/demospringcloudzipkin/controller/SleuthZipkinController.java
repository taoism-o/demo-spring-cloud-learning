package com.taoismone.demospringcloudzipkin.controller;

import com.taoismone.demospringcloudzipkin.service.IpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kc
 * @title
 * @description The class SleuthZipkinController is for
 * @date Create in 4:11 2019/12/14
 */
@RestController
public class SleuthZipkinController {

    @Autowired
    private IpInfoService ipInfoService;

    @GetMapping(value = "/ip")
    public String ip(@RequestParam String name) {
        return ipInfoService.ipInfo(name);
    }
}
