package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	
	@Bean
	public Coach swimCoach( FortuneService fs) {
		SwimCoach mySwimCoach = new SwimCoach();
		
		return mySwimCoach;
	}
	
	@Bean
	public FortuneService randomFortuneService() {
		RandomFortuneService fs = new RandomFortuneService();
		
		return fs;
	}
}
