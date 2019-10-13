package com.springCloud.practise.helloServiceForZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloServiceForZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceForZuulApplication.class, args);
	}
	
	@RequestMapping("/")
	private String hello() {
		return "Hello";
	}

}
