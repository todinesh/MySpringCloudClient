package com.dishatech.springcloudclient;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudClientApplication {

	@Value("${message}")
	private String message;
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientApplication.class, args);
	}
	
	@PostConstruct
	void printKeyValue() {
		System.out.println("Message from cloud server:" + message);
	}

}
