package com.example.propertiesreader.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix="test")  
@PropertySource("classpath:custom.properties")
public class TestConfiguration {
	
	private String username;
	
	private String password;
	
	private String url;
	
	private Map<String, String> maperror;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String> getMaperror() {
		return maperror;
	}

	public void setMaperror(Map<String, String> maperror) {
		this.maperror = maperror;
	}
	
	
}
