package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(randomFortuneService());
		
		return mySwimCoach;
	}
	
	@Bean
	public FortuneService randomFortuneService() {
		RandomFortuneService fs = new RandomFortuneService();
		
		return fs;
	}
}
