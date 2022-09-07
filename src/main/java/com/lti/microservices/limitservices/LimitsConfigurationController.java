package com.lti.microservices.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.microservices.limitservice.bean.LimitConfiguration;

@RestController  
public class LimitsConfigurationController {
	
//	@Value("${limit-services.minimum}")
//	int min;
//	@Value("${limit-services.maximum}")
//	int max;
	
	@Autowired    
	private Configuration configuration;   
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
		return new LimitConfiguration(1,123); 
	//return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());  
	}  

}
