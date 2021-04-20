package com.auditmanagementserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AuditManagementServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditManagementServerApplication.class, args);
	}

}
