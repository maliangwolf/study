package com.example.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication (SpringCloudConfigApplication.class);
		//application.setWebE
		application.run(args);
	}

}
