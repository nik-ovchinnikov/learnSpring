package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		int randomNumber = (int) (Math.random() * 3);
		
		String[] fortuneArray = new String[3];
		fortuneArray[0] = "Today you will have good day!";
		fortuneArray[1] = "Today you will have bad day!";
		fortuneArray[2] = "Today you will have normal day!";
		
		return fortuneArray[randomNumber];
	}

}
