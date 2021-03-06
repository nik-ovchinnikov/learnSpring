package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach {
	//@Autowired
	//@Qualifier("randomFortuneService")
	public FortuneService fs;
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	@Override
	public String toString() {
		return "SwimCoach [email=" + email + ", team=" + team + "]";
	}

	public SwimCoach(FortuneService fs) {
		
		this.fs = fs;
	}

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
