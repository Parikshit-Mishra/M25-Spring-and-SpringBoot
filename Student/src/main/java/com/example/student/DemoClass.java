package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClass {
	
	@GetMapping("/getMassage")
	public String getMessage()
	{
		return "Welcome to Spring";
		
	}

}
