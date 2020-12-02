package com.arvind.configServer.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemoApplication {

	public static void main(String[] args) {
		//adding dec
		System.out.println("Starting config server");
		SpringApplication.run(ConfigServerDemoApplication.class, args);
	}

}
