package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.model","com.service","com.controller","com.client","com.repository"})
public class PersonRestServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonRestServiceClientApplication.class, args);
	}

}
