package com.hdtec.microservices.hdtecspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HdtecSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdtecSpringCloudConfigServerApplication.class, args);
	}

}
