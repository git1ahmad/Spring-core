package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a bean for our sadFortune Service 
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	// define a bean for our swimCoach and inject dependency
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService ()); 	
}
	
	
}