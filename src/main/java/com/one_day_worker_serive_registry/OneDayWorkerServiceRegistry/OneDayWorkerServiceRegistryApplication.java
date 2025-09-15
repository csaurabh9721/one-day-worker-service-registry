package com.one_day_worker_serive_registry.OneDayWorkerServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OneDayWorkerServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneDayWorkerServiceRegistryApplication.class, args);
	}

}
