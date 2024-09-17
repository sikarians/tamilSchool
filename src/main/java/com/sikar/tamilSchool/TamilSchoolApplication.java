package com.sikar.tamilSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class TamilSchoolApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TamilSchoolApplication.class, args);
	}

}
