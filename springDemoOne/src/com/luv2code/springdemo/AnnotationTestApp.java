package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationTest-applicationContext.xml");
		
		FortuneService fs = context.getBean("rfs", FortuneService.class);
		
		System.out.println(fs.getFortune());
		
		context.close();
		
		
	}

}
