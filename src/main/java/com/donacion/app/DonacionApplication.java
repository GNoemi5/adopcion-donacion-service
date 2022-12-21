package com.donacion.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DonacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonacionApplication.class, args);
	}

}
