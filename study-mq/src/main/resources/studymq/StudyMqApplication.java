package com.example.studymq;

import com.example.studymq.mq.RabbitAmqpTutorialsRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
@SpringBootApplication
public class StudyMqApplication {
	@Profile("usage_message")
	@Bean
	public CommandLineRunner usage() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
//				args[0]="This app uses Spring Profiles to\n" +
//						"                control its behavior.";
//				args[1]="Sample usage: java -jar\n" +
//						"                rabbit-tutorials.jar\n" +
//						"                --spring.profiles.active=hello-world,sender";
			}
		};
	}

	@Profile("!usage_message")
	@Bean
	public CommandLineRunner tutorial() {
		return new RabbitAmqpTutorialsRunner();
	}
	public static void main(String[] args) {
		SpringApplication.run(StudyMqApplication.class, args);
	}

}
