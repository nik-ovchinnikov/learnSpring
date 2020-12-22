package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String email;
	private String team;
	private FortuneService fs;

	@Override
	public String toString() {
		return "CricketCoach [email=" + email + ", team=" + team + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
