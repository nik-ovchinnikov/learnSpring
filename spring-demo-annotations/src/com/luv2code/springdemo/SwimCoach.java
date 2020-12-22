package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	public FortuneService fs;
	
	@Override
	public String getDailyWorkout() {
		return "You should swim 200m";
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
