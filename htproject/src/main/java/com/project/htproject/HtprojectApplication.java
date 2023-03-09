package com.project.htproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HtprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtprojectApplication.class, args);
	}

}
