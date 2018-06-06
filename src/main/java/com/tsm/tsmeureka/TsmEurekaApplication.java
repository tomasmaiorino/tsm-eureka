package com.tsm.tsmeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TsmEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsmEurekaApplication.class, args);
	}
}
