package com.example.lepatisseriebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LePatisserieBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LePatisserieBackendApplication.class, args);
	}

}
