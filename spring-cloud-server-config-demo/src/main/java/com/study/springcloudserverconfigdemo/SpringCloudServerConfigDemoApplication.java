package com.study.springcloudserverconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerConfigDemoApplication.class, args);
	}

}
