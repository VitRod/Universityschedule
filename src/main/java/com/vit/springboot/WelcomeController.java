package com.vit.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/dynamic-configuration")
	public String dynamicConfiguration(){		
		String message = configuration.getMessage();
		int number = configuration.getNumber();
		boolean value = configuration.isValue();   
		
		String result = "Details submitted by you: Message: " + message + ", Number: " + number  + ", Value: "  +value;
		
		return result;
	
	}

	
}
