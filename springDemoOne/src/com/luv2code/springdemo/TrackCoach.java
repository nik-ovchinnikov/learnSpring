package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thisCoachWillHelp")
public class TrackCoach implements Coach {
	
	FortuneService fs;
	
	public void AfterCreation () {
		System.out.println("Trainer is ready to help you!");
	}

	public void AfterDestruction () {
		System.out.println("Trainer has gone to another pupil!");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

	public TrackCoach(FortuneService fs) {
		this.fs = fs;
	}

	

}










