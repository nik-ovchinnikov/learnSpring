package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	public FortuneService fs;
	
	@Override
	public String getDailyWorkout() {
		return "Practice to vowl awfully when you heat";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getFortune();
	}
	
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	
	public void sayGoodbye() {
		System.out.println("Bye!");
	}

}
