package com.thucnh.azuredevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.thucnh.azuredevops"})
public class AzuredevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuredevopsApplication.class, args);
	}

}
