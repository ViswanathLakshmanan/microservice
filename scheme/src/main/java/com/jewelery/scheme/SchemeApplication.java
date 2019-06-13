package com.jewelery.scheme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SchemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemeApplication.class, args);
	}

}
