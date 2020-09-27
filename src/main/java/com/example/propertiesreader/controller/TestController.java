package com.example.propertiesreader.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertiesreader.config.TestConfiguration;

@RestController
public class TestController {
	
	@Autowired
	TestConfiguration testConfiguration;
	
	@GetMapping("/getProperties")
	public Map<String, String> greeting() {
		Map properties = testConfiguration.getMaperror();
		System.out.println("test");
		return properties;
	}
}


