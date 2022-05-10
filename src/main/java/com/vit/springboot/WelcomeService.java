package com.vit.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	public String retrieveWelcomeMessage() {
		return welcomeMessage;
	}
	
}
