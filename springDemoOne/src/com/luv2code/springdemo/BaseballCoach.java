package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	FortuneService fs;
	
	public BaseballCoach(FortuneService fs) {
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}








