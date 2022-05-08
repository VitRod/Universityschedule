package com.vit.springboot;

import org.springframework.beans.factory.annotation.Value;

public class WelcomeService {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	public String retrieveWelcomeMessage() {
		return welcomeMessage;
	}
	
}
