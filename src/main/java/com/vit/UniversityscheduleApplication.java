package com.vit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UniversityscheduleApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(UniversityscheduleApplication.class, args);
		System.out.println(ctx);
	}
}
                                                                                                                                                               