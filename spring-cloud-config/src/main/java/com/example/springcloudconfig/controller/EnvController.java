package com.example.springcloudconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ml
 * @title: EnvController
 * @projectName spring-cloud-config
 * @description: TODO
 * @date 2019/6/15 16:55
 */
@RestController
public class EnvController {
    @Autowired
    private final Environment environment;
    @Autowired
    public EnvController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/show/env/{name}")
    public String showEnvironment(@PathVariable String name){
       // System.out.println("----"+environment.getProperty("server.port"));
        return "asdfa";//environment.getProperty(name);
    }
}
