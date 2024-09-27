package com.sne.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.sne.basic.serviceLayer.CollegeService;
import com.sne.basic.serviceLayer.CollegeServiceImpl;

@SpringBootApplication

@ComponentScan(basePackages = "com.sne.basic")

public class CollegeHubApplication {
	
	@Bean
	public CollegeService collegeService() {
	    return new CollegeServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(CollegeHubApplication.class, args);
	}

}
