package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	public FortuneService fs;
	
	@Autowired
	public TennisCoach(FortuneService fs) {
			this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice to vowl awfully when you heat";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getFortune();
	}

}
