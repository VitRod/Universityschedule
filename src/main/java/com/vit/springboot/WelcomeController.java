package com.vit.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vit.springboot.configuration.BasicConfiguration;

public class WelcomeController {
	                                        
	@Autowired
	private WelcomeService service;
	
	@Autowired
	private BasicConfiguration configuration;
	
	@RequestMapping
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
	
	

}
