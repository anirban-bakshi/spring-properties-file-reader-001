package com.example.propertiesreader;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.propertiesreader.config.TestConfiguration;

@SpringBootApplication
public class PropertiesReaderApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(PropertiesReaderApplication.class, args);
		
	}
	

}
