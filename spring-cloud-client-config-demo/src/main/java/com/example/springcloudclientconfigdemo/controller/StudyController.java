package com.example.springcloudclientconfigdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ml
 * @title: StudyController
 * @projectName spring-cloud-client-config-demo
 * @description: TODO
 * @date 2019/6/27 14:31
 */
@RestController
@RefreshScope
public class StudyController {
    @Value("${my.name}")
    private String name;
    @RequestMapping("/getPropertie")
    public String getPropertie(){
        return name;
    }
}
