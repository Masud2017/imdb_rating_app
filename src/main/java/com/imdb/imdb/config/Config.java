package com.imdb.imdb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imdb.imdb.util.EnvironmentUtil;


@Configuration
public class Config {	

	@Bean
	public EnvironmentUtil getEnvironmentUtil() {
		
		return new EnvironmentUtil();
	}
	
	
}
