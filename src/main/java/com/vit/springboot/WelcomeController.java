package com.vit.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vit.springboot.configuration.BasicConfiguration;

@RestController
public class WelcomeController {
	                                        
	@Autowired
	private WelcomeService service;
	
	@Autowired
	private BasicConfiguration configuration;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
	                 
	

}
