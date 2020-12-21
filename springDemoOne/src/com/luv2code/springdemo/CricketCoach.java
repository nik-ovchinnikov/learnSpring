package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fs;

	public void setFs(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "You should take 100 beats today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
